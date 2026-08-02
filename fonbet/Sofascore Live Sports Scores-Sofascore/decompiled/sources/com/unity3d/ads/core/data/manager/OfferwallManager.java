package com.unity3d.ads.core.data.manager;

import com.ironsource.C4259pg;
import defpackage.rq3;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "", "", C4259pg.b, "(Lrq3;)Ljava/lang/Object;", "", "isConnected", "placementName", "isAdReady", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "", "loadAd", "Lz88;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "showAd", "(Ljava/lang/String;)Lz88;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OfferwallManager {
    @Nullable
    Object getVersion(@NotNull rq3<? super String> rq3Var);

    @Nullable
    Object isAdReady(@NotNull String str, @NotNull rq3<? super Boolean> rq3Var);

    @Nullable
    Object isConnected(@NotNull rq3<? super Boolean> rq3Var);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull rq3<? super Unit> rq3Var);

    @NotNull
    z88 showAd(@NotNull String placementName);
}
