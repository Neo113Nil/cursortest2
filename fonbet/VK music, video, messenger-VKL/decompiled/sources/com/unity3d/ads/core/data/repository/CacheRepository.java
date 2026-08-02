package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import org.json.JSONArray;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: CacheRepository.kt */
/* loaded from: classes14.dex */
public interface CacheRepository {

    /* compiled from: CacheRepository.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, int i2, yzs yzsVar, spj spjVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i3 & 2) != 0) {
                jSONArray = null;
            }
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            if ((i3 & 16) != 0) {
                yzsVar = null;
            }
            return cacheRepository.getFile(str, jSONArray, i, i2, yzsVar, spjVar);
        }

        public static /* synthetic */ Object getWebviewFile$default(CacheRepository cacheRepository, String str, String str2, boolean z, spj spjVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getWebviewFile");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return cacheRepository.getWebviewFile(str, str2, z, spjVar);
        }
    }

    Object clearCache(spj<? super s3q0> spjVar);

    Object doesFileExist(String str, spj<? super Boolean> spjVar);

    Object getCacheSize(spj<? super Long> spjVar);

    Object getFile(String str, JSONArray jSONArray, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar);

    Object getWebviewFile(String str, String str2, boolean z, spj<? super CacheResult> spjVar);

    Object getWebviewFileFromDisk(String str, String str2, spj<? super CacheResult> spjVar);

    boolean removeFile(CachedFile cachedFile);

    Object retrieveFile(String str, spj<? super CacheResult> spjVar);
}
