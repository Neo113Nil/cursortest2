package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import org.json.JSONArray;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: CacheFile.kt */
/* loaded from: classes14.dex */
public interface CacheFile {

    /* compiled from: CacheFile.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(CacheFile cacheFile, String str, AdObject adObject, JSONArray jSONArray, int i, int i2, yzs yzsVar, spj spjVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i3 & 16) != 0) {
                i2 = Integer.MAX_VALUE;
            }
            int i4 = i2;
            if ((i3 & 32) != 0) {
                yzsVar = null;
            }
            return cacheFile.invoke(str, adObject, jSONArray, i, i4, yzsVar, spjVar);
        }
    }

    Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, int i2, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar);
}
