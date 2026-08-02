package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC4387jb;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import xsna.nek;
import xsna.qo2;
import xsna.ro2;
import xsna.t12;
import xsna.to2;
import xsna.xz3;
import xsna.yy4;
import xsna.zcl;

/* renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4405kb extends AbstractC4601va implements Vb {
    private final UUID d;
    private final C4370ib e;
    private Sb f;
    private String g;
    private C4336gd h;
    private InterfaceC4441mb i;
    private AdapterNativeAdData j;
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C4405kb(UUID uuid, C4370ib c4370ib, int i, zcl zclVar) {
        this((i & 1) != 0 ? C4616w7.a.a() : uuid, c4370ib);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4405kb c4405kb) {
        IronLog.API.info(String.valueOf(c4405kb));
        try {
            Sb sb = c4405kb.f;
            if (sb == null) {
                sb = null;
            }
            sb.n();
            c4405kb.i = null;
        } catch (Throwable th) {
            C4452n4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4405kb c4405kb) {
        if (c4405kb.c()) {
            IronLog.INTERNAL.warning(C4484p0.a(c4405kb.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        c4405kb.a(true);
        if (c4405kb.d()) {
            Sb sb = c4405kb.f;
            (sb != null ? sb : null).o();
        }
    }

    @Override // com.ironsource.AbstractC4601va
    public boolean d() {
        this.f = e();
        return true;
    }

    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new t12(this, 15));
    }

    @Override // com.ironsource.Vb
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        b(new xz3(8, this, new LevelPlayAdError(ironSourceError, this.d.toString(), b())));
    }

    private final Sb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String b = b();
        C4336gd c4336gd = this.h;
        if (c4336gd == null) {
            c4336gd = null;
        }
        C4263cc c4263cc = new C4263cc(uuid, b, c4336gd);
        a(c4263cc);
        return new Sb(this, a(), c4263cc);
    }

    public final void f() {
        a(new to2(this, 20));
    }

    public final UUID g() {
        return this.d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC4387jb.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC4387jb.a(icon.getDrawable(), icon.getUri());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4405kb(UUID uuid, C4370ib c4370ib) {
        super(new C4484p0(r1, F0.b.MEDIATION));
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        this.d = uuid;
        this.e = c4370ib;
        this.g = "";
        a().d().a(new C4447n(aVar, uuid, b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4405kb c4405kb, LevelPlayAdInfo levelPlayAdInfo) {
        InterfaceC4441mb interfaceC4441mb = c4405kb.i;
        if (interfaceC4441mb != null) {
            interfaceC4441mb.b(c4405kb.e, levelPlayAdInfo);
        }
    }

    public final void a(InterfaceC4441mb interfaceC4441mb) {
        a(new qo2(11, this, interfaceC4441mb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4405kb c4405kb, InterfaceC4441mb interfaceC4441mb) {
        c4405kb.i = interfaceC4441mb;
    }

    @Override // com.ironsource.Vb
    public void b(LevelPlayAdInfo levelPlayAdInfo) {
        b(new yy4(12, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.Vb
    public void a(LevelPlayAdInfo levelPlayAdInfo) {
        IronLog.CALLBACK.info(String.valueOf(this));
        Pb pb = new Pb();
        Sb sb = this.f;
        if (sb == null) {
            sb = null;
        }
        sb.a(pb);
        this.j = pb.a();
        this.k = pb.b();
        b(new nek(9, this, levelPlayAdInfo));
    }

    public final void b(String str) {
        a(new ro2(8, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4405kb c4405kb, LevelPlayAdError levelPlayAdError) {
        InterfaceC4441mb interfaceC4441mb = c4405kb.i;
        if (interfaceC4441mb != null) {
            interfaceC4441mb.a(c4405kb.e, levelPlayAdError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4405kb c4405kb, LevelPlayAdInfo levelPlayAdInfo) {
        InterfaceC4441mb interfaceC4441mb = c4405kb.i;
        if (interfaceC4441mb != null) {
            interfaceC4441mb.c(c4405kb.e, levelPlayAdInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4405kb c4405kb, String str) {
        c4405kb.g = str;
    }
}
