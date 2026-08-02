package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.zcl;

/* renamed from: com.ironsource.h0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4341h0 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;
    private C4336gd d;
    private final Tf e;
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

    public C4341h0(IronSource.a aVar, UUID uuid, String str, C4336gd c4336gd, Tf tf, Double d) {
        this.a = aVar;
        this.b = uuid;
        this.c = str;
        this.d = c4336gd;
        this.e = tf;
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

    public final C4336gd f() {
        return this.d;
    }

    public final Tf g() {
        return this.e;
    }

    public final boolean h() {
        return e43.l(IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL).contains(this.a);
    }

    public final void a(C4336gd c4336gd) {
        this.d = c4336gd;
    }

    public /* synthetic */ C4341h0(IronSource.a aVar, UUID uuid, String str, C4336gd c4336gd, Tf tf, Double d, int i, zcl zclVar) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c4336gd, (i & 16) != 0 ? null : tf, (i & 32) != 0 ? null : d);
    }
}
