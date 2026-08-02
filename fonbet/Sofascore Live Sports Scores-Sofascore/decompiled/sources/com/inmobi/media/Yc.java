package com.inmobi.media;

import com.inmobi.media.Yc;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import defpackage.km5;
import defpackage.wel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yc {
    public final C3341cd a;
    public final Aj b;
    public final AbstractC3536k2 c;
    public final Aj d;
    public final Aj e;
    public final Aj f;
    public final Aj g;

    public Yc(Zc zc, C3341cd c3341cd) {
        zc.getClass();
        c3341cd.getClass();
        this.a = c3341cd;
        final int i = 0;
        this.b = new Aj(zc, new Function0(this) { // from class: dnl
            public final /* synthetic */ Yc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Yc yc = this.b;
                switch (i2) {
                    case 0:
                        return Yc.c(yc);
                    case 1:
                        return Yc.e(yc);
                    case 2:
                        return Yc.b(yc);
                    case 3:
                        return Yc.a(yc);
                    default:
                        return Yc.d(yc);
                }
            }
        });
        this.c = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled() ? new C3434g3(zc) : new Lc(zc, new wel(6));
        final int i2 = 1;
        this.d = new Aj(zc, new Function0(this) { // from class: dnl
            public final /* synthetic */ Yc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Yc yc = this.b;
                switch (i22) {
                    case 0:
                        return Yc.c(yc);
                    case 1:
                        return Yc.e(yc);
                    case 2:
                        return Yc.b(yc);
                    case 3:
                        return Yc.a(yc);
                    default:
                        return Yc.d(yc);
                }
            }
        });
        final int i3 = 2;
        this.e = new Aj(zc, new Function0(this) { // from class: dnl
            public final /* synthetic */ Yc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                Yc yc = this.b;
                switch (i22) {
                    case 0:
                        return Yc.c(yc);
                    case 1:
                        return Yc.e(yc);
                    case 2:
                        return Yc.b(yc);
                    case 3:
                        return Yc.a(yc);
                    default:
                        return Yc.d(yc);
                }
            }
        });
        final int i4 = 3;
        this.f = new Aj(zc, new Function0(this) { // from class: dnl
            public final /* synthetic */ Yc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                Yc yc = this.b;
                switch (i22) {
                    case 0:
                        return Yc.c(yc);
                    case 1:
                        return Yc.e(yc);
                    case 2:
                        return Yc.b(yc);
                    case 3:
                        return Yc.a(yc);
                    default:
                        return Yc.d(yc);
                }
            }
        });
        final int i5 = 4;
        this.g = new Aj(zc, new Function0(this) { // from class: dnl
            public final /* synthetic */ Yc b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                Yc yc = this.b;
                switch (i22) {
                    case 0:
                        return Yc.c(yc);
                    case 1:
                        return Yc.e(yc);
                    case 2:
                        return Yc.b(yc);
                    case 3:
                        return Yc.a(yc);
                    default:
                        return Yc.d(yc);
                }
            }
        });
    }

    public static final List a(Yc yc) {
        return CollectionsKt.w0(AbstractC3504im.a("Impression", yc.a.b), H4.a("impression", yc.a.a.a));
    }

    public static final List b(Yc yc) {
        return H4.a("impression_shown", yc.a.a.a);
    }

    public static final List c(Yc yc) {
        return H4.a(U3.i.r, yc.a.a.a);
    }

    public static final List d(Yc yc) {
        return H4.a("mrc50", yc.a.a.a);
    }

    public static final List e(Yc yc) {
        return H4.a("start_tracking", yc.a.a.a);
    }

    public static final List a() {
        return km5.a;
    }
}
