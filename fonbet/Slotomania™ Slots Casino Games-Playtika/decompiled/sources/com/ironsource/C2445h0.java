package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2445h0 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;
    private C2440gd d;
    private final Qf e;
    private final Double f;

    /* renamed from: com.ironsource.h0$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public C2445h0(IronSource.a adFormat, UUID adId, String adUnitId, C2440gd c2440gd, Qf qf, Double d) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
        this.d = c2440gd;
        this.e = qf;
        this.f = d;
    }

    public final IronSource.a a() {
        return this.a;
    }

    public final UUID b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final Double d() {
        return this.f;
    }

    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C2440gd f() {
        return this.d;
    }

    public final Qf g() {
        return this.e;
    }

    public final boolean h() {
        return CollectionsKt.listOf((Object[]) new IronSource.a[]{IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL}).contains(this.a);
    }

    public final void a(C2440gd c2440gd) {
        this.d = c2440gd;
    }

    public /* synthetic */ C2445h0(IronSource.a aVar, UUID uuid, String str, C2440gd c2440gd, Qf qf, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c2440gd, (i & 16) != 0 ? null : qf, (i & 32) != 0 ? null : d);
    }
}
