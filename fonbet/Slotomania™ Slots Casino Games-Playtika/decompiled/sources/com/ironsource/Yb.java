package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC2466i3;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Yb extends AbstractC2466i3<C2367cc, AdapterAdListener> implements R0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(List<? extends NetworkSettings> list, Pb configs, String str, C2526la publisherDataHolder, C2329aa c2329aa) {
        super(new Zb(str, list, configs), publisherDataHolder, c2329aa);
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC2466i3
    protected void D() {
    }

    @Override // com.ironsource.AbstractC2466i3
    protected boolean E() {
        return false;
    }

    public final void J() {
        C2514kg c2514kg;
        int intValue;
        C2760yb c2760yb;
        IronLog.INTERNAL.verbose();
        try {
            C2367cc c2367cc = (C2367cc) this.a.d();
            if (c2367cc != null) {
                Integer r = c2367cc.r();
                if (r == null) {
                    intValue = this.C.a(this.o.b());
                } else {
                    Intrinsics.checkNotNullExpressionValue(r, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    intValue = r.intValue();
                }
                F0 f0 = this.s;
                if (f0 != null && (c2760yb = f0.f) != null) {
                    c2760yb.a(intValue);
                }
                c2367cc.P();
                this.a.a(null);
                this.a.b(null);
            }
            this.i = null;
            a(AbstractC2466i3.f.NONE);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(b(str));
            F0 f02 = this.s;
            if (f02 == null || (c2514kg = f02.j) == null) {
                return;
            }
            c2514kg.g(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.AbstractC2466i3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2367cc a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i, String currentAuctionId, C2608q2 item) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        Intrinsics.checkNotNullParameter(item, "item");
        return new C2367cc(this, new C2552n0(IronSource.a.NATIVE_AD, this.o.o(), i, this.g, currentAuctionId, this.e, this.f, providerSettings, this.o.n()), adapter, this.i, item, this);
    }

    @Override // com.ironsource.AbstractC2466i3
    protected L0 d() {
        return new C2450h5();
    }

    @Override // com.ironsource.AbstractC2466i3
    protected String i() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC2466i3
    protected String l() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC2466i3
    protected boolean s() {
        return false;
    }

    public final void a(C2440gd c2440gd) {
        String format;
        int b;
        IronLog.INTERNAL.verbose("placement = " + c2440gd);
        if (c2440gd == null || TextUtils.isEmpty(c2440gd.c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c2440gd == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.b(this.o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c2440gd, this.o.b())) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format("placement %s is capped", Arrays.copyOf(new Object[]{c2440gd.c()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            b = B0.f(this.o.b());
        } else {
            format = null;
            b = 510;
        }
        if (TextUtils.isEmpty(format)) {
            this.i = c2440gd;
            x();
        } else {
            IronLog.API.error(b(format));
            a(b, format, false);
        }
    }

    @Override // com.ironsource.AbstractC2466i3
    protected JSONObject b(NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        Intrinsics.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Xb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC2466i3
    protected void a(AbstractC2483j3<?> abstractC2483j3, AdInfo adInfo) {
        if (abstractC2483j3 instanceof C2367cc) {
            C2367cc c2367cc = (C2367cc) abstractC2483j3;
            this.t.a(c2367cc.Q(), c2367cc.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC2466i3
    protected void a(IronSourceError ironSourceError) {
        this.t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC2466i3, com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        C2440gd c2440gd = this.i;
        if (c2440gd != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", c2440gd.c());
        }
        UUID uuid = this.w;
        if (uuid != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
