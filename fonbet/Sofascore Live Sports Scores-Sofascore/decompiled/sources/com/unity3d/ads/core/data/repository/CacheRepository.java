package com.unity3d.ads.core.data.repository;

import com.ironsource.S5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.a70;
import defpackage.ct8;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001Jf\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062,\b\u0002\u0010\r\u001a&\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH¦@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\fH¦@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nH¦@¢\u0006\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "", "url", "Lorg/json/JSONArray;", "headers", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "intervalMs", "Lkotlin/Function3;", "", "Lrq3;", "", "onProgress", "Lcom/unity3d/ads/core/data/model/CacheResult;", "getFile", "(Ljava/lang/String;Lorg/json/JSONArray;IILct8;Lrq3;)Ljava/lang/Object;", "type", "", "forceRemote", "getWebviewFile", "(Ljava/lang/String;Ljava/lang/String;ZLrq3;)Ljava/lang/Object;", "getWebviewFileFromDisk", "(Ljava/lang/String;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/CachedFile;", "cachedFile", "removeFile", "(Lcom/unity3d/ads/core/data/model/CachedFile;)Z", S5.c.b, "doesFileExist", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "retrieveFile", "clearCache", "(Lrq3;)Ljava/lang/Object;", "getCacheSize", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CacheRepository {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i, int i2, ct8 ct8Var, rq3 rq3Var, int i3, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: getFile");
                return null;
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
                ct8Var = null;
            }
            return cacheRepository.getFile(str, jSONArray, i, i2, ct8Var, rq3Var);
        }

        public static /* synthetic */ Object getWebviewFile$default(CacheRepository cacheRepository, String str, String str2, boolean z, rq3 rq3Var, int i, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: getWebviewFile");
                return null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return cacheRepository.getWebviewFile(str, str2, z, rq3Var);
        }
    }

    @Nullable
    Object clearCache(@NotNull rq3<? super Unit> rq3Var);

    @Nullable
    Object doesFileExist(@NotNull String str, @NotNull rq3<? super Boolean> rq3Var);

    @Nullable
    Object getCacheSize(@NotNull rq3<? super Long> rq3Var);

    @Nullable
    Object getFile(@NotNull String str, @Nullable JSONArray jSONArray, int i, int i2, @Nullable ct8 ct8Var, @NotNull rq3<? super CacheResult> rq3Var);

    @Nullable
    Object getWebviewFile(@NotNull String str, @NotNull String str2, boolean z, @NotNull rq3<? super CacheResult> rq3Var);

    @Nullable
    Object getWebviewFileFromDisk(@NotNull String str, @NotNull String str2, @NotNull rq3<? super CacheResult> rq3Var);

    boolean removeFile(@NotNull CachedFile cachedFile);

    @Nullable
    Object retrieveFile(@NotNull String str, @NotNull rq3<? super CacheResult> rq3Var);
}
