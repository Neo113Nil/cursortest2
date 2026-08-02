package com.unity3d.ads.core.data.datasource;

import com.ironsource.S5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.ct8;
import defpackage.rq3;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jp\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072,\b\u0002\u0010\u000e\u001a&\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\nH¦@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CacheDataSource;", "", "Ljava/io/File;", "cachePath", "", S5.c.b, "url", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lrq3;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILct8;Lrq3;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheDataSource {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, int i, ct8 ct8Var, rq3 rq3Var, int i2, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: getFile");
                return null;
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
                ct8Var = null;
            }
            return cacheDataSource.getFile(file, str, str2, num, i, ct8Var, rq3Var);
        }
    }

    @Nullable
    Object getFile(@NotNull File file, @NotNull String str, @Nullable String str2, @Nullable Integer num, int i, @Nullable ct8 ct8Var, @NotNull rq3<? super CacheResult> rq3Var);
}
