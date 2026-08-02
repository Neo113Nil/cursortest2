package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import defpackage.a70;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mf extends AbstractC3403eo {
    public final AbstractC3429fo d;
    public Oe e;
    public final C3931z8 f;
    public final InterfaceC3880x9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(Context context, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, AbstractC3429fo abstractC3429fo, ku3 ku3Var, Oe oe, C3931z8 c3931z8, InterfaceC3880x9 interfaceC3880x9) {
        super(gestureDetectorOnGestureListenerC3889xi);
        context.getClass();
        gestureDetectorOnGestureListenerC3889xi.getClass();
        abstractC3429fo.getClass();
        ku3Var.getClass();
        this.d = abstractC3429fo;
        this.e = oe;
        this.f = c3931z8;
        this.g = interfaceC3880x9;
        ku3 a = X4.a(ku3Var);
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).b("Mf", "initializeOMSDK called");
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        AbstractC3912yf.a(applicationContext);
        xw3.L(a, null, null, new Lf(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Mf mf, sq3 sq3Var) {
        Kf kf;
        int i;
        C3931z8 c3931z8;
        InterfaceC3880x9 interfaceC3880x9;
        mf.getClass();
        if (sq3Var instanceof Kf) {
            kf = (Kf) sq3Var;
            int i2 = kf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kf.c = i2 - Integer.MIN_VALUE;
                Object obj = kf.a;
                lu3 lu3Var = lu3.a;
                i = kf.c;
                Unit unit = null;
                if (i != 0) {
                    y6a.M(obj);
                    Df df = Df.a;
                    kf.c = 1;
                    Context context = AbstractC3424fj.a;
                    if (context == null) {
                        obj = "";
                    } else {
                        hs4 hs4Var = z45.a;
                        obj = xw3.R(hq4.c, new Bf(context, null), kf);
                    }
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                String str = (String) obj;
                c3931z8 = mf.f;
                if (c3931z8 != null) {
                    Oe oe = mf.e;
                    if (oe != null) {
                        oe.a(str, c3931z8.a, c3931z8.b, c3931z8.d, c3931z8.c, c3931z8.e);
                        unit = Unit.a;
                    }
                }
                interfaceC3880x9 = mf.g;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a("Mf", "OmidInfo is null, cannot track ad");
                    Unit unit2 = Unit.a;
                }
                return Unit.a;
            }
        }
        kf = new Kf(mf, sq3Var);
        Object obj2 = kf.a;
        lu3 lu3Var2 = lu3.a;
        i = kf.c;
        Unit unit3 = null;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        c3931z8 = mf.f;
        if (c3931z8 != null) {
        }
        interfaceC3880x9 = mf.g;
        if (interfaceC3880x9 != null) {
        }
        return Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View c() {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("Mf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void d() {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("Mf", "stopTrackingForImpression");
        }
        this.d.d();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        view.getClass();
        friendlyObstructionPurpose.getClass();
        Oe oe = this.e;
        if (oe != null) {
            view.getClass();
            friendlyObstructionPurpose.getClass();
            AdSession adSession = oe.c;
            InterfaceC3880x9 interfaceC3880x9 = oe.b;
            if (adSession == null) {
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(AbstractC3406f1.f, "addObstruction");
            }
            X4.a(oe.a, new Y0(oe, view, friendlyObstructionPurpose, null));
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view) {
        view.getClass();
        Oe oe = this.e;
        if (oe != null) {
            view.getClass();
            if (oe.c == null) {
                return;
            }
            X4.a(oe.a, new C3303b1(oe, view, null));
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Map map) {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("Mf", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Context context, byte b) {
        context.getClass();
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("Mf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
