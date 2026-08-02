package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import defpackage.a70;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lif;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.zu4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qd extends AbstractC3896y implements Bj, InterfaceC3404f {
    public final Rc b;
    public final Wc c;
    public final AbstractC3406f1 d;
    public final ku3 e;
    public final C3844w f;
    public final joa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qd(Rc rc, Wc wc) {
        super(rc.a);
        NativeMedia media;
        rc.getClass();
        wc.getClass();
        this.b = rc;
        this.c = wc;
        JsonAssetObject assetsObject = rc.b.getAssetsObject();
        ku3 ku3Var = rc.a.a.e;
        boolean c = Intrinsics.c((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video");
        C3870x c3870x = rc.a;
        this.d = c ? new Oe(ku3Var, c3870x.a.c) : new Pc(ku3Var, c3870x.a.c);
        this.e = X4.a(k());
        C3870x c3870x2 = rc.a;
        JsonAssetObject assetsObject2 = rc.b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        c3870x2.getClass();
        this.f = new C3844w(c3870x2.a.b, adChoice, c3870x2.b.a.b.getNative().getAdChoiceConfig(), c3870x2.a.c);
        this.g = ypa.b(new lif(this, 0));
    }

    public static final List b(Qd qd) {
        return H4.a("load_called", qd.b.a.b.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:10:0x0026, B:11:0x003e, B:13:0x0046, B:20:0x0035), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zu4 zu4Var, sq3 sq3Var) {
        Od od;
        int i;
        InterfaceC3880x9 l;
        try {
            if (sq3Var instanceof Od) {
                od = (Od) sq3Var;
                int i2 = od.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    od.c = i2 - Integer.MIN_VALUE;
                    Object obj = od.a;
                    Object obj2 = lu3.a;
                    i = od.c;
                    if (i != 0) {
                        y6a.M(obj);
                        od.c = 1;
                        obj = zu4Var.T(od);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                    }
                    View view = (View) obj;
                    l = l();
                    if (l != null) {
                        ((C3906y9) l).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
                    }
                    return view;
                }
            }
            if (i != 0) {
            }
            View view2 = (View) obj;
            l = l();
            if (l != null) {
            }
            return view2;
        } catch (Exception e) {
            C3906y9 c3906y9 = this.b.a.a.c;
            if (c3906y9 != null) {
                c3906y9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e);
            }
            return null;
        }
        od = new Od(this, sq3Var);
        Object obj3 = od.a;
        Object obj22 = lu3.a;
        i = od.c;
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
        N3.a(this.e);
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        xw3.L(this.e, null, null, new Ed(this, null), 3);
    }

    @Override // com.inmobi.media.InterfaceC3404f
    public final Object a(rq3 rq3Var) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadingState", "onDestroy");
        }
        Object a = this.c.a(new C3496id(), this, (sq3) rq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public final void a(MediaView mediaView, View view, C3289ad c3289ad) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.c.a(new Dd(mediaView, view, this.d, c3289ad, this.b, this.c), this);
    }

    public final void a(short s) {
        InterfaceC3880x9 l = l();
        if (l != null) {
            ((C3906y9) l).a("NativeLoadingState", ljg.j(s, "transitionToFailedState - errorCode: "));
        }
        this.c.a(new C3547kd(s, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.b, this.c), this);
    }

    public static final Aj a(Qd qd) {
        return new Aj(new Zc(qd.a.a.d, null, null, 30), new lif(qd, 1));
    }
}
