package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2349bc extends C2445h0 {
    public /* synthetic */ C2349bc(UUID uuid, String str, C2440gd c2440gd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, str, (i & 4) != 0 ? null : c2440gd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2349bc(UUID adId, String adUnitId, C2440gd c2440gd) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c2440gd, null, null, 48, null);
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C2349bc() {
        this(C2702v7.a.a(), "", null, 4, null);
    }
}
