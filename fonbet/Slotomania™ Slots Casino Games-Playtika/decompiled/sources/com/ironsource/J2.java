package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class J2 extends C2445h0 {
    private final LevelPlayAdSize g;
    private final Boolean h;
    private final Long i;

    public /* synthetic */ J2(UUID uuid, String str, C2440gd c2440gd, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, Qf qf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c2440gd, (i & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : qf, (i & 128) != 0 ? null : d);
    }

    public final LevelPlayAdSize i() {
        return this.g;
    }

    public final Boolean j() {
        return this.h;
    }

    public final Long k() {
        return this.i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(UUID adId, String adUnitId, C2440gd c2440gd, LevelPlayAdSize adSize, Boolean bool, Long l, Qf qf, Double d) {
        super(IronSource.a.BANNER, adId, adUnitId, c2440gd, qf, d);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.g = adSize;
        this.h = bool;
        this.i = l;
    }

    public J2() {
        this(C2702v7.a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
