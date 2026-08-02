package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4362i3;
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
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
import xsna.go9;

/* loaded from: classes13.dex */
public final class Zb extends AbstractC4362i3<C4281dc, AdapterAdListener> implements R0 {
    public Zb(List<? extends NetworkSettings> list, Qb qb, String str, C4440ma c4440ma, C4243ba c4243ba) {
        super(new C4227ac(str, list, qb), c4440ma, c4243ba);
    }

    @Override // com.ironsource.AbstractC4362i3
    public boolean E() {
        return false;
    }

    public final void J() {
        C4518qg c4518qg;
        C4674zb c4674zb;
        IronLog.INTERNAL.verbose();
        try {
            C4281dc c4281dc = (C4281dc) this.a.d();
            if (c4281dc != null) {
                Integer r = c4281dc.r();
                int a = r == null ? this.C.a(this.o.b()) : r.intValue();
                F0 f0 = this.s;
                if (f0 != null && (c4674zb = f0.f) != null) {
                    c4674zb.a(a);
                }
                c4281dc.P();
                this.a.a(null);
                this.a.b(null);
            }
            this.i = null;
            a(AbstractC4362i3.f.NONE);
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(b(b));
            F0 f02 = this.s;
            if (f02 == null || (c4518qg = f02.j) == null) {
                return;
            }
            c4518qg.g(b);
        }
    }

    @Override // com.ironsource.AbstractC4362i3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4281dc a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, int i, String str, C4504q2 c4504q2) {
        return new C4281dc(this, new C4448n0(IronSource.a.NATIVE_AD, this.o.o(), i, this.g, str, this.e, this.f, networkSettings, this.o.n()), baseAdAdapter, this.i, c4504q2, this);
    }

    @Override // com.ironsource.AbstractC4362i3
    public L0 d() {
        return new C4346h5();
    }

    @Override // com.ironsource.AbstractC4362i3
    public String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC4362i3
    public String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4362i3
    public boolean s() {
        return false;
    }

    public final void a(C4336gd c4336gd) {
        String format;
        int b;
        IronLog.INTERNAL.verbose("placement = " + c4336gd);
        if (c4336gd == null || TextUtils.isEmpty(c4336gd.c())) {
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4336gd == null ? "placement is null" : "placement name is empty"}, 1));
            b = B0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4336gd, this.o.b())) {
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c4336gd.c()}, 1));
            b = B0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.i = c4336gd;
            x();
        } else {
            IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC4362i3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getNativeAdSettings();
    }

    public final void a(InternalNativeAdListener internalNativeAdListener) {
        a(new Yb(internalNativeAdListener));
    }

    @Override // com.ironsource.AbstractC4362i3
    public void a(AbstractC4379j3<?> abstractC4379j3, AdInfo adInfo) {
        if (abstractC4379j3 instanceof C4281dc) {
            C4281dc c4281dc = (C4281dc) abstractC4379j3;
            this.t.a(c4281dc.Q(), c4281dc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC4362i3
    public void D() {
    }

    @Override // com.ironsource.AbstractC4362i3
    public void a(IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC4362i3, com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> a = super.a(c0);
        C4336gd c4336gd = this.i;
        if (c4336gd != null) {
            a.put("placement", c4336gd.c());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            a.put("objectId", uuid);
        }
        return a;
    }
}
