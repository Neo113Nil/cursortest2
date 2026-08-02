package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: CacheDataSource.kt */
/* loaded from: classes14.dex */
public interface CacheDataSource {

    /* compiled from: CacheDataSource.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, int i, yzs yzsVar, spj spjVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            if ((i2 & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            if ((i2 & 16) != 0) {
                i = Integer.MAX_VALUE;
            }
            if ((i2 & 32) != 0) {
                yzsVar = null;
            }
            return cacheDataSource.getFile(file, str, str2, num, i, yzsVar, spjVar);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, int i, yzs<? super Long, ? super Long, ? super spj<? super s3q0>, ? extends Object> yzsVar, spj<? super CacheResult> spjVar);
}
