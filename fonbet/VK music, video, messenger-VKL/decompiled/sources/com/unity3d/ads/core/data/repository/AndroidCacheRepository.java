package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import java.io.File;
import kotlin.Lazy;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;
import xsna.bpn0;
import xsna.myc0;
import xsna.ovj;
import xsna.r570;
import xsna.s3q0;
import xsna.spj;
import xsna.v40;
import xsna.vvj;
import xsna.w40;
import xsna.yvj;
import xsna.yzs;
import xsna.zvj;

/* compiled from: AndroidCacheRepository.kt */
/* loaded from: classes14.dex */
public final class AndroidCacheRepository implements CacheRepository {
    private final CleanupDirectory cleanupDirectory;
    private final Context context;
    private final CreateFile createFile;
    private final DownloadPriorityQueue downloadPriorityQueue;
    private final GetAssetFileName getAssetFileName;
    private final GetCacheDirectory getCacheDirectory;
    private final CacheDataSource localCacheDataSource;
    private final CacheDataSource remoteCacheDataSource;
    private final yvj scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Lazy cacheDir$delegate = new bpn0(new v40(this, 3));
    private final Lazy webviewCacheDir$delegate = new bpn0(new w40(this, 4));

    public AndroidCacheRepository(ovj ovjVar, GetCacheDirectory getCacheDirectory, CacheDataSource cacheDataSource, CacheDataSource cacheDataSource2, Context context, SessionRepository sessionRepository, CleanupDirectory cleanupDirectory, DownloadPriorityQueue downloadPriorityQueue, CreateFile createFile, SendDiagnosticEvent sendDiagnosticEvent, GetAssetFileName getAssetFileName) {
        this.getCacheDirectory = getCacheDirectory;
        this.localCacheDataSource = cacheDataSource;
        this.remoteCacheDataSource = cacheDataSource2;
        this.context = context;
        this.sessionRepository = sessionRepository;
        this.cleanupDirectory = cleanupDirectory;
        this.downloadPriorityQueue = downloadPriorityQueue;
        this.createFile = createFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getAssetFileName = getAssetFileName;
        this.scope = zvj.g(zvj.g(zvj.a(ovjVar), new vvj("CacheRepository")), r570.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File cacheDir_delegate$lambda$0(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileFromRemote(File file, String str, spj<? super CacheResult> spjVar) {
        return myc0.k(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileFromRemote$2(this, str, file, null), spjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        return myc0.k(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileInternal$2(this, str, file, i, i2, yzsVar, null), spjVar);
    }

    public static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i, int i2, yzs yzsVar, spj spjVar, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            yzsVar = null;
        }
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i, i4, yzsVar, spjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir$delegate.getValue();
    }

    private final File initCacheDir(String str) {
        File invoke = this.getCacheDirectory.invoke(this.sessionRepository.getFeatureFlags().getUseFilesDir() ? this.context.getFilesDir() : this.context.getCacheDir(), str);
        invoke.mkdirs();
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webviewCacheDir_delegate$lambda$1(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object clearCache(spj<? super s3q0> spjVar) {
        Object k = myc0.k(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), spjVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesFileExist(String str, spj<? super Boolean> spjVar) {
        AndroidCacheRepository$doesFileExist$1 androidCacheRepository$doesFileExist$1;
        int i;
        if (spjVar instanceof AndroidCacheRepository$doesFileExist$1) {
            androidCacheRepository$doesFileExist$1 = (AndroidCacheRepository$doesFileExist$1) spjVar;
            int i2 = androidCacheRepository$doesFileExist$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheRepository$doesFileExist$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheRepository$doesFileExist$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidCacheRepository$doesFileExist$1.label;
                if (i != 0) {
                    a.a(obj);
                    androidCacheRepository$doesFileExist$1.label = 1;
                    obj = retrieveFile(str, androidCacheRepository$doesFileExist$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                }
                return Boolean.valueOf(obj instanceof CacheResult.Success);
            }
        }
        androidCacheRepository$doesFileExist$1 = new AndroidCacheRepository$doesFileExist$1(this, spjVar);
        Object obj3 = androidCacheRepository$doesFileExist$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidCacheRepository$doesFileExist$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 instanceof CacheResult.Success);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getCacheSize(spj<? super Long> spjVar) {
        return myc0.k(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), spjVar);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getFile(String str, JSONArray jSONArray, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar) {
        return getFileInternal(getCacheDir(), str, jSONArray, i, i2, yzsVar, spjVar);
    }

    public final String getFilename(String str) {
        return this.getAssetFileName.invoke(str);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFile(String str, String str2, boolean z, spj<? super CacheResult> spjVar) {
        File invoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        invoke.mkdirs();
        return z ? getFileFromRemote(invoke, str, spjVar) : getFileInternal$default(this, invoke, str, null, 0, 0, null, spjVar, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object getWebviewFileFromDisk(String str, String str2, spj<? super CacheResult> spjVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.createFile.invoke(getWebviewCacheDir(), str2), getFilename(str), str, new Integer(0), 0, null, spjVar, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(CachedFile cachedFile) {
        File file = cachedFile.getFile();
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            file = null;
        }
        if (file != null) {
            return file.delete();
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public Object retrieveFile(String str, spj<? super CacheResult> spjVar) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, spjVar, 60, null);
    }
}
