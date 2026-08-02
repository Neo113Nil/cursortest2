package io.agora.meta.internal;

import android.content.Context;
import android.text.TextUtils;
import io.agora.meta.IMetaService;
import io.agora.meta.IMetaServiceEventHandler;
import io.agora.meta.MetaSceneConfig;
import io.agora.meta.MetaServiceConfig;
import io.agora.utils2.internal.Logging;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MetaServiceImpl extends IMetaService {
    private static final String TAG = "MetaServiceImpl";
    private String mLauncherVersion;
    private long mNativeHandle = 0;
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);

    private native int nativeAddEventHandler(long j10, Object obj);

    private native int nativeCancelDownloadSceneAssets(long j10, long j11);

    private native int nativeCleanSceneAssets(long j10, long j11);

    private native int nativeCreateScene(long j10, MetaSceneConfig metaSceneConfig);

    private static native int nativeDestroy(long j10);

    private native int nativeDownloadSceneAssets(long j10, long j11);

    private native int nativeGetSceneAssetsInfo(long j10);

    private native int nativeIsSceneAssetsDownloaded(long j10, long j11);

    private native long nativeObjectInit(MetaServiceConfig metaServiceConfig, long j10);

    private native int nativeRemoveEventHandler(long j10, Object obj);

    private native int nativeRenewToken(long j10, String str);

    private void readLauncherVersion(Context context) {
        try {
            InputStream open = context.getAssets().open("LauncherVersion.txt", 3);
            byte[] bArr = new byte[open.available()];
            if (open.read(bArr) <= 0) {
                bArr = "unknown".getBytes();
            }
            open.close();
            this.mLauncherVersion = new String(bArr, "UTF-8");
        } catch (IOException e10) {
            Logging.e(TAG, "get launcher version failed, " + e10.getMessage());
        }
    }

    @Override // io.agora.meta.IMetaService
    public int addEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (addEventHandler)");
                    return -7;
                }
                return nativeAddEventHandler(j10, iMetaServiceEventHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cancelDownloadSceneAssets(long j10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(cancelDownloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (cancelDownloadSceneAssets)");
                    return -7;
                }
                return nativeCancelDownloadSceneAssets(j11, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int cleanSceneAssets(long j10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(cleanSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (cleanSceneAssets)");
                    return -7;
                }
                return nativeCleanSceneAssets(j11, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int createScene(MetaSceneConfig metaSceneConfig) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(createScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (createScene)");
                    return -7;
                }
                if (metaSceneConfig.mActivityContext == null) {
                    return -2;
                }
                return nativeCreateScene(j10, metaSceneConfig);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int doDestroy() {
        if (this.mNativeHandle == 0) {
            Logging.e(TAG, "MetaService does not initialize or it may be destroyed (doDestroy)");
            return -7;
        }
        this.mIsDestroying.set(true);
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0L;
        this.mIsDestroying.set(false);
        return 0;
    }

    @Override // io.agora.meta.IMetaService
    public int downloadSceneAssets(long j10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(downloadSceneAssets)");
            return -8;
        }
        synchronized (this) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (downloadSceneAssets)");
                    return -7;
                }
                return nativeDownloadSceneAssets(j11, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public String getLauncherVersion(Context context) {
        if (context == null) {
            return "unknown";
        }
        if (TextUtils.isEmpty(this.mLauncherVersion)) {
            readLauncherVersion(context);
        }
        return this.mLauncherVersion;
    }

    @Override // io.agora.meta.IMetaService
    public int getSceneAssetsInfo() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(getSceneAssetsInfo)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (getSceneAssetsInfo)");
                    return -7;
                }
                return nativeGetSceneAssetsInfo(j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int initialize(MetaServiceConfig metaServiceConfig) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(initialize)");
            return -8;
        }
        synchronized (this) {
            try {
                if (metaServiceConfig.mRtcEngine != null && !TextUtils.isEmpty(metaServiceConfig.mAppId)) {
                    if (metaServiceConfig.mRtcEngine.loadExtensionProvider("agora_rtm_loader") != 0) {
                        Logging.e(TAG, "Rtm extension is not loaded");
                    }
                    long nativeObjectInit = nativeObjectInit(metaServiceConfig, metaServiceConfig.mRtcEngine.getNativeHandle());
                    this.mNativeHandle = nativeObjectInit;
                    return nativeObjectInit == 0 ? -7 : 0;
                }
                return -2;
            } finally {
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int isSceneAssetsDownloaded(long j10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(isSceneAssetsDownloaded)");
            return -8;
        }
        synchronized (this) {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (isSceneAssetsDownloaded)");
                    return -7;
                }
                return nativeIsSceneAssetsDownloaded(j11, j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int removeEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (removeEventHandler)");
                    return -7;
                }
                return nativeRemoveEventHandler(j10, iMetaServiceEventHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaService
    public int renewToken(String str) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaService is destroying(renewToken)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaService does not initialize or it may be destroyed (renewToken)");
                    return -7;
                }
                return nativeRenewToken(j10, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
