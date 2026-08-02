package com.unity3d.ads.core.data.repository;

import android.content.Context;
import com.ironsource.S5;
import com.unity3d.ads.core.data.datasource.CacheDataSource;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.repository.AndroidCacheRepository;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetAssetFileName;
import com.unity3d.ads.core.domain.GetCacheDirectory;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.domain.CleanupDirectory;
import defpackage.a70;
import defpackage.au3;
import defpackage.ct8;
import defpackage.eed;
import defpackage.gu3;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018Jj\u0010)\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2,\b\u0002\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0082@¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J^\u00100\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2*\u0010'\u001a&\b\u0001\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010\"H\u0096@¢\u0006\u0004\b0\u00101J(\u00105\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001b2\u0006\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b5\u00106J \u00107\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b7\u00108J\u0018\u0010:\u001a\u00020(2\u0006\u00109\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u0002032\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010@\u001a\u0002032\u0006\u00109\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b@\u0010;J\u0015\u0010A\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020%H\u0096@¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020#H\u0096@¢\u0006\u0004\bE\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010GR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010HR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010JR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010U¨\u0006Z"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCacheRepository;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lau3;", "ioDispatcher", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "getCacheDirectory", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "localCacheDataSource", "remoteCacheDataSource", "Landroid/content/Context;", "context", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "cleanupDirectory", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "downloadPriorityQueue", "Lcom/unity3d/ads/core/domain/CreateFile;", "createFile", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "getAssetFileName", "<init>", "(Lau3;Lcom/unity3d/ads/core/domain/GetCacheDirectory;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Lcom/unity3d/ads/core/data/datasource/CacheDataSource;Landroid/content/Context;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/services/core/network/domain/CleanupDirectory;Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;Lcom/unity3d/ads/core/domain/CreateFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetAssetFileName;)V", "Ljava/io/File;", "cacheDirectory", "", "url", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lrq3;", "", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFileInternal", "(Ljava/io/File;Ljava/lang/String;Lorg/json/JSONArray;IILct8;Lrq3;)Ljava/lang/Object;", "getFileFromRemote", "(Ljava/io/File;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "dirName", "initCacheDir", "(Ljava/lang/String;)Ljava/io/File;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILct8;Lrq3;)Ljava/lang/Object;", "type", "", "forceRemote", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;ZLrq3;)Ljava/lang/Object;", "getWebviewFileFromDisk", "(Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", S5.c.b, "retrieveFile", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", "doesFileExist", "getFilename", "(Ljava/lang/String;)Ljava/lang/String;", "clearCache", "(Lrq3;)Ljava/lang/Object;", "getCacheSize", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/services/core/network/domain/CleanupDirectory;", "Lcom/unity3d/ads/core/domain/work/DownloadPriorityQueue;", "Lcom/unity3d/ads/core/domain/CreateFile;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/domain/GetAssetFileName;", "Lku3;", "scope", "Lku3;", "cacheDir$delegate", "Ljoa;", "getCacheDir", "()Ljava/io/File;", "cacheDir", "webviewCacheDir$delegate", "getWebviewCacheDir", "webviewCacheDir", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCacheRepository implements CacheRepository {

    /* renamed from: cacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa cacheDir;

    @NotNull
    private final CleanupDirectory cleanupDirectory;

    @NotNull
    private final Context context;

    @NotNull
    private final CreateFile createFile;

    @NotNull
    private final DownloadPriorityQueue downloadPriorityQueue;

    @NotNull
    private final GetAssetFileName getAssetFileName;

    @NotNull
    private final GetCacheDirectory getCacheDirectory;

    @NotNull
    private final CacheDataSource localCacheDataSource;

    @NotNull
    private final CacheDataSource remoteCacheDataSource;

    @NotNull
    private final ku3 scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* renamed from: webviewCacheDir$delegate, reason: from kotlin metadata */
    @NotNull
    private final joa webviewCacheDir;

    public AndroidCacheRepository(@NotNull au3 au3Var, @NotNull GetCacheDirectory getCacheDirectory, @NotNull CacheDataSource cacheDataSource, @NotNull CacheDataSource cacheDataSource2, @NotNull Context context, @NotNull SessionRepository sessionRepository, @NotNull CleanupDirectory cleanupDirectory, @NotNull DownloadPriorityQueue downloadPriorityQueue, @NotNull CreateFile createFile, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull GetAssetFileName getAssetFileName) {
        au3Var.getClass();
        getCacheDirectory.getClass();
        cacheDataSource.getClass();
        cacheDataSource2.getClass();
        context.getClass();
        sessionRepository.getClass();
        cleanupDirectory.getClass();
        downloadPriorityQueue.getClass();
        createFile.getClass();
        sendDiagnosticEvent.getClass();
        getAssetFileName.getClass();
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
        this.scope = s9a.F(s9a.F(s9a.c(au3Var), new gu3("CacheRepository")), eed.b);
        final int i = 0;
        this.cacheDir = ypa.b(new Function0(this) { // from class: vx
            public final /* synthetic */ AndroidCacheRepository b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File cacheDir_delegate$lambda$0;
                File webviewCacheDir_delegate$lambda$1;
                int i2 = i;
                AndroidCacheRepository androidCacheRepository = this.b;
                switch (i2) {
                    case 0:
                        cacheDir_delegate$lambda$0 = AndroidCacheRepository.cacheDir_delegate$lambda$0(androidCacheRepository);
                        return cacheDir_delegate$lambda$0;
                    default:
                        webviewCacheDir_delegate$lambda$1 = AndroidCacheRepository.webviewCacheDir_delegate$lambda$1(androidCacheRepository);
                        return webviewCacheDir_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        this.webviewCacheDir = ypa.b(new Function0(this) { // from class: vx
            public final /* synthetic */ AndroidCacheRepository b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                File cacheDir_delegate$lambda$0;
                File webviewCacheDir_delegate$lambda$1;
                int i22 = i2;
                AndroidCacheRepository androidCacheRepository = this.b;
                switch (i22) {
                    case 0:
                        cacheDir_delegate$lambda$0 = AndroidCacheRepository.cacheDir_delegate$lambda$0(androidCacheRepository);
                        return cacheDir_delegate$lambda$0;
                    default:
                        webviewCacheDir_delegate$lambda$1 = AndroidCacheRepository.webviewCacheDir_delegate$lambda$1(androidCacheRepository);
                        return webviewCacheDir_delegate$lambda$1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File cacheDir_delegate$lambda$0(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_DIR_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileFromRemote(File file, String str, rq3<? super CacheResult> rq3Var) {
        return xw3.R(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileFromRemote$2(this, str, file, null), rq3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFileInternal(File file, String str, JSONArray jSONArray, int i, int i2, ct8 ct8Var, rq3<? super CacheResult> rq3Var) {
        return xw3.R(this.scope.getCoroutineContext(), new AndroidCacheRepository$getFileInternal$2(this, str, file, i, i2, ct8Var, null), rq3Var);
    }

    public static /* synthetic */ Object getFileInternal$default(AndroidCacheRepository androidCacheRepository, File file, String str, JSONArray jSONArray, int i, int i2, ct8 ct8Var, rq3 rq3Var, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        int i4 = i2;
        if ((i3 & 32) != 0) {
            ct8Var = null;
        }
        return androidCacheRepository.getFileInternal(file, str, jSONArray, i, i4, ct8Var, rq3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getWebviewCacheDir() {
        return (File) this.webviewCacheDir.getValue();
    }

    private final File initCacheDir(String dirName) {
        boolean useFilesDir = this.sessionRepository.getFeatureFlags().getUseFilesDir();
        Context context = this.context;
        File filesDir = useFilesDir ? context.getFilesDir() : context.getCacheDir();
        GetCacheDirectory getCacheDirectory = this.getCacheDirectory;
        filesDir.getClass();
        File invoke = getCacheDirectory.invoke(filesDir, dirName);
        invoke.mkdirs();
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File webviewCacheDir_delegate$lambda$1(AndroidCacheRepository androidCacheRepository) {
        return androidCacheRepository.initCacheDir(UnityAdsConstants.DefaultUrls.CACHE_WEBVIEW_DIR_NAME);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object clearCache(@NotNull rq3<? super Unit> rq3Var) {
        Object R = xw3.R(this.scope.getCoroutineContext(), new AndroidCacheRepository$clearCache$2(this, null), rq3Var);
        return R == lu3.a ? R : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesFileExist(@NotNull String str, @NotNull rq3<? super Boolean> rq3Var) {
        AndroidCacheRepository$doesFileExist$1 androidCacheRepository$doesFileExist$1;
        int i;
        if (rq3Var instanceof AndroidCacheRepository$doesFileExist$1) {
            androidCacheRepository$doesFileExist$1 = (AndroidCacheRepository$doesFileExist$1) rq3Var;
            int i2 = androidCacheRepository$doesFileExist$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheRepository$doesFileExist$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheRepository$doesFileExist$1.result;
                Object obj2 = lu3.a;
                i = androidCacheRepository$doesFileExist$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    androidCacheRepository$doesFileExist$1.label = 1;
                    obj = retrieveFile(str, androidCacheRepository$doesFileExist$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(obj instanceof CacheResult.Success);
            }
        }
        androidCacheRepository$doesFileExist$1 = new AndroidCacheRepository$doesFileExist$1(this, rq3Var);
        Object obj3 = androidCacheRepository$doesFileExist$1.result;
        Object obj22 = lu3.a;
        i = androidCacheRepository$doesFileExist$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj3 instanceof CacheResult.Success);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getCacheSize(@NotNull rq3<? super Long> rq3Var) {
        return xw3.R(this.scope.getCoroutineContext(), new AndroidCacheRepository$getCacheSize$2(this, null), rq3Var);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i, int i2, @Nullable ct8 ct8Var, @NotNull rq3<? super CacheResult> rq3Var) {
        return getFileInternal(getCacheDir(), str, jSONArray, i, i2, ct8Var, rq3Var);
    }

    @NotNull
    public final String getFilename(@NotNull String url) {
        url.getClass();
        return this.getAssetFileName.invoke(url);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getWebviewFile(@NotNull String str, @NotNull String str2, boolean z, @NotNull rq3<? super CacheResult> rq3Var) {
        File invoke = this.createFile.invoke(getWebviewCacheDir(), str2);
        invoke.mkdirs();
        return z ? getFileFromRemote(invoke, str, rq3Var) : getFileInternal$default(this, invoke, str, null, 0, 0, null, rq3Var, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    @Nullable
    public Object getWebviewFileFromDisk(@NotNull String str, @NotNull String str2, @NotNull rq3<? super CacheResult> rq3Var) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, this.createFile.invoke(getWebviewCacheDir(), str2), getFilename(str), str, new Integer(0), 0, null, rq3Var, 48, null);
    }

    @Override // com.unity3d.ads.core.data.repository.CacheRepository
    public boolean removeFile(@NotNull CachedFile cachedFile) {
        cachedFile.getClass();
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
    @Nullable
    public Object retrieveFile(@NotNull String str, @NotNull rq3<? super CacheResult> rq3Var) {
        return CacheDataSource.DefaultImpls.getFile$default(this.localCacheDataSource, getCacheDir(), str, null, null, 0, null, rq3Var, 60, null);
    }
}
