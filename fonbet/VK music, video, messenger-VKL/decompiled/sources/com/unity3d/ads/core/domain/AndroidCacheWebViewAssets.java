package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.drm0;
import xsna.j5g;
import xsna.s3q0;
import xsna.spj;
import xsna.v1v;

/* compiled from: AndroidCacheWebViewAssets.kt */
/* loaded from: classes14.dex */
public final class AndroidCacheWebViewAssets implements CacheWebViewAssets {
    private final ConcurrentHashMap<String, File> _cached = new ConcurrentHashMap<>();
    private final CacheRepository cacheRepository;
    private final SessionRepository sessionRepository;

    public AndroidCacheWebViewAssets(CacheRepository cacheRepository, SessionRepository sessionRepository) {
        this.cacheRepository = cacheRepository;
        this.sessionRepository = sessionRepository;
    }

    private final String getFilename(String str, String str2) {
        StringBuilder b = v1v.b(str2, '/');
        String l0 = drm0.l0(str, '?');
        b.append(drm0.i0('/', l0, l0));
        return b.toString();
    }

    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    public Map<String, File> getCached() {
        return this._cached;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e0, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r9 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e0 -> B:11:0x00e3). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(WebViewConfiguration webViewConfiguration, boolean z, spj<? super s3q0> spjVar) {
        AndroidCacheWebViewAssets$invoke$1 androidCacheWebViewAssets$invoke$1;
        int i;
        WebViewConfiguration webViewConfiguration2;
        boolean z2;
        Iterator it;
        CacheResult cacheResult;
        if (spjVar instanceof AndroidCacheWebViewAssets$invoke$1) {
            androidCacheWebViewAssets$invoke$1 = (AndroidCacheWebViewAssets$invoke$1) spjVar;
            int i2 = androidCacheWebViewAssets$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidCacheWebViewAssets$invoke$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching()) {
                        return s3q0.a;
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
                    return s3q0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = androidCacheWebViewAssets$invoke$1.Z$0;
                    String str = (String) androidCacheWebViewAssets$invoke$1.L$2;
                    it = (Iterator) androidCacheWebViewAssets$invoke$1.L$1;
                    webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                    kotlin.a.a(obj);
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
                    return s3q0.a;
                }
                z = androidCacheWebViewAssets$invoke$1.Z$0;
                webViewConfiguration = (WebViewConfiguration) androidCacheWebViewAssets$invoke$1.L$0;
                kotlin.a.a(obj);
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
                return s3q0.a;
            }
        }
        androidCacheWebViewAssets$invoke$1 = new AndroidCacheWebViewAssets$invoke$1(this, spjVar);
        Object obj2 = androidCacheWebViewAssets$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00bc -> B:10:0x00c0). Please report as a decompilation issue!!! */
    @Override // com.unity3d.ads.core.domain.CacheWebViewAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object warmFromDisk(WebViewConfiguration webViewConfiguration, spj<? super Boolean> spjVar) {
        AndroidCacheWebViewAssets$warmFromDisk$1 androidCacheWebViewAssets$warmFromDisk$1;
        int i;
        Iterator it;
        CachedFile cachedFile;
        if (spjVar instanceof AndroidCacheWebViewAssets$warmFromDisk$1) {
            androidCacheWebViewAssets$warmFromDisk$1 = (AndroidCacheWebViewAssets$warmFromDisk$1) spjVar;
            int i2 = androidCacheWebViewAssets$warmFromDisk$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidCacheWebViewAssets$warmFromDisk$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidCacheWebViewAssets$warmFromDisk$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidCacheWebViewAssets$warmFromDisk$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (!this.sessionRepository.getNativeConfiguration().getFeatureFlags().getShouldHandleWebviewCaching() || webViewConfiguration.getEntryPoint().length() == 0) {
                        return Boolean.FALSE;
                    }
                    List singletonList = Collections.singletonList(webViewConfiguration.getEntryPoint());
                    List<String> additionalFiles = webViewConfiguration.getAdditionalFiles();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : additionalFiles) {
                        if (((String) obj2).length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList u0 = j5g.u0(arrayList, singletonList);
                    if (!u0.isEmpty()) {
                        it = u0.iterator();
                        if (it.hasNext()) {
                        }
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str = (String) androidCacheWebViewAssets$warmFromDisk$1.L$2;
                it = (Iterator) androidCacheWebViewAssets$warmFromDisk$1.L$1;
                WebViewConfiguration webViewConfiguration2 = (WebViewConfiguration) androidCacheWebViewAssets$warmFromDisk$1.L$0;
                kotlin.a.a(obj);
                File file = null;
                CacheResult.Success success = !(obj instanceof CacheResult.Success) ? (CacheResult.Success) obj : null;
                File file2 = (success != null || (cachedFile = success.getCachedFile()) == null) ? null : cachedFile.getFile();
                if (file2 != null) {
                    this._cached.put(getFilename(str, webViewConfiguration2.getType()), file2);
                    file = file2;
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
                        if (webviewFileFromDisk == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        webViewConfiguration2 = webViewConfiguration;
                        str = str2;
                        obj = webviewFileFromDisk;
                        File file3 = null;
                        if (!(obj instanceof CacheResult.Success)) {
                        }
                        if (success != null) {
                        }
                        if (file2 != null) {
                        }
                        if (file3 == null) {
                            z = false;
                        }
                    }
                    return Boolean.valueOf(z);
                }
            }
        }
        androidCacheWebViewAssets$warmFromDisk$1 = new AndroidCacheWebViewAssets$warmFromDisk$1(this, spjVar);
        Object obj3 = androidCacheWebViewAssets$warmFromDisk$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidCacheWebViewAssets$warmFromDisk$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }
}
