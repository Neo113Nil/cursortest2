package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC2606q0;
import com.ironsource.F0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes4.dex */
public class L2 extends AbstractC2606q0 {
    private final WeakReference<O2> j;
    private final a k;
    private final M2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L2(C2588p0 tools, M2 adUnitData, O2 listener) {
        super(tools, adUnitData, listener, null, 8, null);
        String format;
        int b;
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.j = new WeakReference<>(listener);
        this.k = new a();
        this.l = adUnitData;
        C2440gd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(adUnitData.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    private final ISBannerSize l() {
        return f().a(this.l.b().i());
    }

    @Override // com.ironsource.AbstractC2606q0
    public C2641s0 b() {
        return new S2(this.l.b(), a(l()));
    }

    private final class a extends AbstractC2606q0.a implements D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.D2
        public void a(B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.j.get();
            if (o2 != null) {
                o2.g();
            }
        }

        @Override // com.ironsource.AbstractC2606q0.a, com.ironsource.F
        public void b(B instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            InterfaceC2767z0 i = L2.this.i();
            if (i != null) {
                i.a(instance.e());
            }
        }

        @Override // com.ironsource.D2
        public void c(B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.j.get();
            if (o2 != null) {
                o2.h();
            }
        }

        @Override // com.ironsource.D2
        public void b(B2 instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            IronLog.INTERNAL.verbose(L2.this.a(instance.q()));
            O2 o2 = (O2) L2.this.j.get();
            if (o2 != null) {
                o2.j();
            }
        }
    }

    public final void a(InterfaceC2765yg interfaceC2765yg, InterfaceC2767z0 displayListener) {
        Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (interfaceC2765yg != null) {
            a(new F2(interfaceC2765yg), displayListener);
        }
    }

    @Override // com.ironsource.AbstractC2606q0
    protected E a() {
        return new E() { // from class: com.ironsource.L2$$ExternalSyntheticLambda0
            @Override // com.ironsource.E
            public final B a(C c, I i) {
                B a2;
                a2 = L2.a(L2.this, c, i);
                return a2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(L2 this$0, C instanceData, I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new B2(new V0(this$0.f(), F0.b.PROVIDER), instanceData, adInstancePayload, this$0.k);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return ISBannerSize.BANNER;
    }
}
