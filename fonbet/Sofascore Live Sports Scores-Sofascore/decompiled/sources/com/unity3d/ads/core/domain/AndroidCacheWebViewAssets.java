package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001a0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheWebViewAssets;", "Lcom/unity3d/ads/core/domain/CacheWebViewAssets;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "<init>", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "", "url", "type", "getFilename", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "webviewConfiguration", "", "forceDownload", "", "invoke", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;ZLrq3;)Ljava/lang/Object;", "config", "warmFromDisk", "(Lcom/unity3d/ads/core/data/model/WebViewConfiguration;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/io/File;", "_cached", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getCached", "()Ljava/util/Map;", "cached", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {

    @NotNull
    private final ConcurrentHashMap<String, File> _cached;

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidCacheWebViewAssets(@NotNull CacheRepository cacheRepository, @NotNull SessionRepository sessionRepository) {
        cacheRepository.getClass();
        sessionRepository.getClass();
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
        this._cached = new ConcurrentHashMap<>();
    }

    private final String getFilename(String url, String type) {
        StringBuilder sb = new StringBuilder();
        sb.append(type);
        sb.append('/');
        String g0 = StringsKt.g0(url, '?');
        sb.append(StringsKt.e0('/', g0, g0));
        return sb.toString();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @NotNull
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dd, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007e, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00dd -> B:11:0x00e0). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull WebViewConfiguration webViewConfiguration, boolean z, @NotNull rq3<? super Unit> rq3Var) {
        AndroidCacheWebViewAssets$invoke$1 androidCacheWebViewAssets$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration2;
        boolean z2;
        Iterator it;
        CacheResult cacheResult;
        if (rq3Var instanceof AndroidCacheWebViewAssets$invoke$1) {
            androidCacheWebViewAssets$invoke$1 = (AndroidCacheWebViewAssets$invoke$1) rq3Var;
            int i2 = androidCacheWebViewAssets$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = androidCacheWebViewAssets$invoke$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching()) {
                        return Unit.a;
                    }
                    if (webViewConfiguration.getEntryPoint().length() > 0) {
                        CacheRepository cacheRepository = this.cacheRepository;
                        String entryPoint = webViewConfiguration.getEntryPoint();
                        String type = webViewConfiguration.getType();
                        androidCacheWebViewAssets$invoke$1.L$0 = webViewConfiguration;
                        androidCacheWebViewAssets$invoke$1.Z$0 = z;
                        androidCacheWebViewAssets$invoke$1.label = 1;
                        obj = cacheRepository.getWebviewFile(entryPoint, type, z, androidCacheWebViewAssets$invoke$1);
                    }
                    Iterator it2 = webViewConfiguration.getAdditionalFiles().iterator();
                    webViewConfiguration2 = webViewConfiguration;
                    z2 = z;
                    it = it2;
                    while (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = androidCacheWebViewAssets$invoke$1.Z$0;
                    String str = (String) androidCacheWebViewAssets$invoke$1.L$2;
                    it = (Iterator) androidCacheWebViewAssets$invoke$1.L$1;
                    webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                    y6a.M(obj);
                    CacheResult cacheResult2 = (CacheResult) obj;
                    if (cacheResult2 instanceof CacheResult.Success) {
                        CacheResult.Success success = (CacheResult.Success) cacheResult2;
                        if (success.getCachedFile().getFile() != null) {
                            this._cached.put(getFilename(str, webViewConfiguration2.getType()), success.getCachedFile().getFile());
                        }
                    }
                    while (it.hasNext()) {
                        str = (String) it.next();
                        if (str.length() > 0) {
                            CacheRepository cacheRepository2 = this.cacheRepository;
                            String type2 = webViewConfiguration2.getType();
                            androidCacheWebViewAssets$invoke$1.L$0 = webViewConfiguration2;
                            androidCacheWebViewAssets$invoke$1.L$1 = it;
                            androidCacheWebViewAssets$invoke$1.L$2 = str;
                            androidCacheWebViewAssets$invoke$1.Z$0 = z2;
                            androidCacheWebViewAssets$invoke$1.label = 2;
                            obj = cacheRepository2.getWebviewFile(str, type2, z2, androidCacheWebViewAssets$invoke$1);
                        }
                    }
                    return Unit.a;
                }
                z = androidCacheWebViewAssets$invoke$1.Z$0;
                webViewConfiguration = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                y6a.M(obj);
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    CacheResult.Success success2 = (CacheResult.Success) cacheResult;
                    if (success2.getCachedFile().getFile() != null) {
                        this._cached.put(getFilename(webViewConfiguration.getEntryPoint(), webViewConfiguration.getType()), success2.getCachedFile().getFile());
                    }
                }
                Iterator it22 = webViewConfiguration.getAdditionalFiles().iterator();
                webViewConfiguration2 = webViewConfiguration;
                z2 = z;
                it = it22;
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        androidCacheWebViewAssets$invoke$1 = new AndroidCacheWebViewAssets$invoke$1(this, rq3Var);
        Object obj2 = androidCacheWebViewAssets$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidCacheWebViewAssets$invoke$1.label;
        if (i != 0) {
        }
        cacheResult = (CacheResult) obj2;
        if (cacheResult instanceof CacheResult.Success) {
        }
        Iterator it222 = webViewConfiguration.getAdditionalFiles().iterator();
        webViewConfiguration2 = webViewConfiguration;
        z2 = z;
        it = it222;
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b7 -> B:10:0x00bb). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object warmFromDisk(@NotNull WebViewConfiguration webViewConfiguration, @NotNull rq3<? super Boolean> rq3Var) {
        AndroidCacheWebViewAssets$warmFromDisk$1 androidCacheWebViewAssets$warmFromDisk$1;
        int i;
        Iterator it;
        CachedFile cachedFile;
        if (rq3Var instanceof AndroidCacheWebViewAssets$warmFromDisk$1) {
            androidCacheWebViewAssets$warmFromDisk$1 = (AndroidCacheWebViewAssets$warmFromDisk$1) rq3Var;
            int i2 = androidCacheWebViewAssets$warmFromDisk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$warmFromDisk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$warmFromDisk$1.result;
                lu3 lu3Var = lu3.a;
                i = androidCacheWebViewAssets$warmFromDisk$1.label;
                boolean z = true;
                if (i != 0) {
                    y6a.M(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching() || webViewConfiguration.getEntryPoint().length() == 0) {
                        return Boolean.FALSE;
                    }
                    List c = kotlin.collections.a.c(webViewConfiguration.getEntryPoint());
                    List<String> additionalFiles = webViewConfiguration.getAdditionalFiles();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : additionalFiles) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList w0 = CollectionsKt.w0(arrayList, c);
                    if (!w0.isEmpty()) {
                        it = w0.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str = (String) androidCacheWebViewAssets$warmFromDisk$1.L$2;
                it = (Iterator) androidCacheWebViewAssets$warmFromDisk$1.L$1;
                WebViewConfiguration webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$warmFromDisk$1.L$0;
                y6a.M(obj);
                CacheResult.Success success = !(obj instanceof CacheResult.Success) ? (CacheResult.Success) obj : null;
                File file = (success != null || (cachedFile = success.getCachedFile()) == null) ? null : cachedFile.getFile();
                if (file == null) {
                    this._cached.put(getFilename(str, webViewConfiguration2.getType()), file);
                } else {
                    file = null;
                }
                if (file == null) {
                    webViewConfiguration = webViewConfiguration2;
                    if (it.hasNext()) {
                        String str2 = (String) it.next();
                        CacheRepository cacheRepository = this.cacheRepository;
                        String type = webViewConfiguration.getType();
                        androidCacheWebViewAssets$warmFromDisk$1.L$0 = webViewConfiguration;
                        androidCacheWebViewAssets$warmFromDisk$1.L$1 = it;
                        androidCacheWebViewAssets$warmFromDisk$1.L$2 = str2;
                        androidCacheWebViewAssets$warmFromDisk$1.label = 1;
                        Object webviewFileFromDisk = cacheRepository.getWebviewFileFromDisk(str2, type, androidCacheWebViewAssets$warmFromDisk$1);
                        if (webviewFileFromDisk == lu3Var) {
                            return lu3Var;
                        }
                        webViewConfiguration2 = webViewConfiguration;
                        str = str2;
                        obj = webviewFileFromDisk;
                        if (!(obj instanceof CacheResult.Success)) {
                        }
                        if (success != null) {
                        }
                        if (file == null) {
                        }
                        if (file == null) {
                            z = false;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        androidCacheWebViewAssets$warmFromDisk$1 = new AndroidCacheWebViewAssets$warmFromDisk$1(this, rq3Var);
        Object obj3 = androidCacheWebViewAssets$warmFromDisk$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidCacheWebViewAssets$warmFromDisk$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }
}
