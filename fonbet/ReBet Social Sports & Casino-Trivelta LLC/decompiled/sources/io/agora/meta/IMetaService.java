package io.agora.meta;

import android.content.Context;
import io.agora.meta.internal.MetaServiceImpl;

/* loaded from: classes2.dex */
public abstract class IMetaService {
    private static IMetaService mInstance;

    public static synchronized IMetaService create() {
        IMetaService iMetaService;
        synchronized (IMetaService.class) {
            try {
                if (mInstance == null) {
                    mInstance = new MetaServiceImpl();
                }
                iMetaService = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iMetaService;
    }

    public static synchronized void destroy() {
        synchronized (IMetaService.class) {
            IMetaService iMetaService = mInstance;
            if (iMetaService == null) {
                return;
            }
            iMetaService.doDestroy();
            mInstance = null;
        }
    }

    public abstract int addEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler);

    public abstract int cancelDownloadSceneAssets(long j10);

    public abstract int cleanSceneAssets(long j10);

    public abstract int createScene(MetaSceneConfig metaSceneConfig);

    public abstract int doDestroy();

    public abstract int downloadSceneAssets(long j10);

    public abstract String getLauncherVersion(Context context);

    public abstract int getSceneAssetsInfo();

    public abstract int initialize(MetaServiceConfig metaServiceConfig);

    public abstract int isSceneAssetsDownloaded(long j10);

    public abstract int removeEventHandler(IMetaServiceEventHandler iMetaServiceEventHandler);

    public abstract int renewToken(String str);
}
