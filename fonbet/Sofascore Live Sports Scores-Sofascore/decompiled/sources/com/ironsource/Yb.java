package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4067f3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.dmi;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Yb extends AbstractC4067f3<C4022cc, AdapterAdListener> implements P0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(@Nullable List<? extends NetworkSettings> list, @NotNull Pb pb, @Nullable String str, @NotNull C4181la c4181la, @Nullable C3959aa c3959aa) {
        super(new Zb(str, list, pb), c4181la, c3959aa);
        pb.getClass();
        c4181la.getClass();
    }

    @Override // com.ironsource.AbstractC4067f3
    public boolean E() {
        return false;
    }

    public final void J() {
        C4223ng c4223ng;
        C4397xb c4397xb;
        IronLog.INTERNAL.verbose();
        try {
            C4022cc c4022cc = (C4022cc) this.a.d();
            if (c4022cc != null) {
                Integer r = c4022cc.r();
                int a = r == null ? this.C.a(this.o.b()) : r.intValue();
                E0 e0 = this.s;
                if (e0 != null && (c4397xb = e0.f) != null) {
                    c4397xb.a(a);
                }
                c4022cc.P();
                this.a.a(null);
                this.a.b(null);
            }
            this.i = null;
            a(AbstractC4067f3.f.NONE);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String q = dmi.q("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(b(q));
            E0 e02 = this.s;
            if (e02 == null || (c4223ng = e02.j) == null) {
                return;
            }
            c4223ng.g(q);
        }
    }

    public final void a(@Nullable C4077fd c4077fd) {
        String format;
        int b;
        IronLog.INTERNAL.verbose("placement = " + c4077fd);
        if (c4077fd == null || TextUtils.isEmpty(c4077fd.c())) {
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4077fd == null ? "placement is null" : "placement name is empty"}, 1));
            b = A0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4077fd, this.o.b())) {
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4077fd.c()}, 1));
            b = A0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.i = c4077fd;
            x();
        } else {
            IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC4067f3
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4022cc a(@NotNull NetworkSettings networkSettings, @NotNull BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, int i, @NotNull String str, @NotNull C4227o2 c4227o2) {
        networkSettings.getClass();
        baseAdAdapter.getClass();
        str.getClass();
        c4227o2.getClass();
        return new C4022cc(this, new C4207n0(IronSource.a.NATIVE_AD, this.o.o(), i, this.g, str, this.e, this.f, networkSettings, this.o.n()), baseAdAdapter, this.i, c4227o2, this);
    }

    @Override // com.ironsource.AbstractC4067f3
    @NotNull
    public K0 d() {
        return new C4069f5();
    }

    @Override // com.ironsource.AbstractC4067f3
    @NotNull
    public String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4067f3
    @NotNull
    public String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4067f3
    public boolean s() {
        return false;
    }

    @Override // com.ironsource.AbstractC4067f3
    public void D() {
    }

    @Override // com.ironsource.AbstractC4067f3
    @NotNull
    public JSONObject b(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        JSONObject nativeAdSettings = networkSettings.getNativeAdSettings();
        nativeAdSettings.getClass();
        return nativeAdSettings;
    }

    public final void a(@NotNull InternalNativeAdListener internalNativeAdListener) {
        internalNativeAdListener.getClass();
        a(new Xb(internalNativeAdListener));
    }

    @Override // com.ironsource.AbstractC4067f3
    public void a(@Nullable AbstractC4085g3<?> abstractC4085g3, @Nullable AdInfo adInfo) {
        if (abstractC4085g3 instanceof C4022cc) {
            C4022cc c4022cc = (C4022cc) abstractC4085g3;
            this.t.a(c4022cc.Q(), c4022cc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4067f3
    public void a(@Nullable IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4067f3, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b0) {
        b0.getClass();
        Map<String, Object> a = super.a(b0);
        C4077fd c4077fd = this.i;
        if (c4077fd != null) {
            a.getClass();
            a.put("placement", c4077fd.c());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            a.getClass();
            a.put("objectId", uuid);
        }
        a.getClass();
        return a;
    }
}
