package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4261q0;
import com.ironsource.E0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.kr9;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public class J2 extends AbstractC4261q0 {

    @NotNull
    private final W8 i;

    @NotNull
    private final WeakReference<M2> j;

    @NotNull
    private final a k;

    @NotNull
    private final K2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(@NotNull C4243p0 c4243p0, @NotNull K2 k2, @NotNull M2 m2, @NotNull W8 w8) {
        super(c4243p0, k2, m2);
        String format;
        int b;
        c4243p0.getClass();
        k2.getClass();
        m2.getClass();
        w8.getClass();
        this.i = w8;
        this.j = new WeakReference<>(m2);
        this.k = new a();
        this.l = k2;
        C4077fd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            b = A0.b(k2.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        return iSBannerSize.isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.j.a() : ISBannerSize.BANNER : iSBannerSize;
    }

    private final ISBannerSize l() {
        return f().a(this.l.b().i());
    }

    @Override // com.ironsource.AbstractC4261q0
    @NotNull
    public C4296s0 b() {
        return new Q2(this.l.b(), a(l()));
    }

    public final void a(@Nullable Bg bg, @NotNull InterfaceC4422z0 interfaceC4422z0) {
        interfaceC4422z0.getClass();
        if (bg != null) {
            a(new D2(bg), interfaceC4422z0);
        }
    }

    @Override // com.ironsource.AbstractC4261q0
    @NotNull
    public E a() {
        return new kr9(this, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(J2 j2, C c, I i) {
        j2.getClass();
        c.getClass();
        i.getClass();
        return new C4424z2(new T0(j2.f(), E0.b.PROVIDER), c, i, j2.k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class a extends AbstractC4261q0.a implements B2 {
        public a() {
            super();
        }

        @Override // com.ironsource.B2
        public void a(@NotNull C4424z2 c4424z2) {
            c4424z2.getClass();
            IronLog.INTERNAL.verbose(J2.this.a(c4424z2.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.g();
            }
        }

        @Override // com.ironsource.B2
        public void b(@NotNull C4424z2 c4424z2) {
            c4424z2.getClass();
            IronLog.INTERNAL.verbose(J2.this.a(c4424z2.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.j();
            }
        }

        @Override // com.ironsource.B2
        public void c(@NotNull C4424z2 c4424z2) {
            c4424z2.getClass();
            IronLog.INTERNAL.verbose(J2.this.a(c4424z2.q()));
            M2 m2 = (M2) J2.this.j.get();
            if (m2 != null) {
                m2.h();
            }
        }

        @Override // com.ironsource.AbstractC4261q0.a, com.ironsource.F
        public void b(@NotNull B b) {
            b.getClass();
            super.b(b);
            LevelPlayAdInfo e = b.e();
            J2.this.i.a(e);
            InterfaceC4422z0 i = J2.this.i();
            if (i != null) {
                i.a(e);
            }
        }
    }
}
