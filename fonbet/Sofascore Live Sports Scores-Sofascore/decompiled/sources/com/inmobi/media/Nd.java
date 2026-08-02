package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import defpackage.a70;
import defpackage.av4;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.ljg;
import defpackage.lu3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import defpackage.zu4;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nd extends hoi implements Function2 {
    public C3289ad a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Qd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nd(Qd qd, rq3 rq3Var) {
        super(2, rq3Var);
        this.d = qd;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        Nd nd = new Nd(this.d, rq3Var);
        nd.c = obj;
        return nd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Nd nd = new Nd(this.d, (rq3) obj2);
        nd.c = (ku3) obj;
        return nd.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00aa, code lost:
    
        if (r12 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zu4 t;
        NativeMedia media;
        View view;
        K6 k6;
        C3289ad c3289ad;
        lu3 lu3Var = lu3.a;
        int i = this.b;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var = (ku3) this.c;
            InterfaceC3880x9 l = this.d.l();
            if (l != null) {
                ((C3906y9) l).a("NativeLoadingState", "loadMediaViews - building experience loader");
            }
            Qd qd = this.d;
            Rc rc = qd.b;
            AbstractC3406f1 abstractC3406f1 = qd.d;
            rc.getClass();
            abstractC3406f1.getClass();
            JsonAssetObject assetsObject = rc.b.getAssetsObject();
            String type = (assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType();
            t = xw3.t(ku3Var, null, new Md(Intrinsics.c(type, "static") ? new Oj(rc, abstractC3406f1) : Intrinsics.c(type, "video") ? new C3841vm(rc, abstractC3406f1) : new C3297al(rc, abstractC3406f1), null), 3);
            av4 t2 = xw3.t(ku3Var, null, new Ld(this.d, null), 3);
            Qd qd2 = this.d;
            this.c = t;
            this.b = 1;
            obj = qd2.a(t2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c3289ad = this.a;
                    view = (View) this.c;
                    y6a.M(obj);
                    this.d.a(null, view, c3289ad);
                    return Unit.a;
                }
                view = (View) this.c;
                y6a.M(obj);
                k6 = (K6) obj;
                if (!(k6 instanceof H6)) {
                    InterfaceC3880x9 l2 = this.d.l();
                    if (l2 != null) {
                        ((C3906y9) l2).a("NativeLoadingState", ljg.j(((H6) k6).a, "Experience Result Failure - errorCode: "));
                    }
                    this.d.a(((H6) k6).a);
                } else {
                    if (!(k6 instanceof I6)) {
                        if (!(k6 instanceof J6)) {
                            zzl.b();
                            return null;
                        }
                        InterfaceC3880x9 l3 = this.d.l();
                        if (l3 != null) {
                            ((C3906y9) l3).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                        }
                        Qd qd3 = this.d;
                        Jl jl = ((J6) k6).a;
                        C3328c0 c3328c0 = qd3.a.a.d;
                        Rc rc2 = qd3.b;
                        rc2.getClass();
                        C3289ad c3289ad2 = new C3289ad(jl, c3328c0, new Ri(rc2.a.b.g));
                        C3909yc c3909yc = (C3909yc) this.d.b.g.getValue();
                        this.c = view;
                        this.a = c3289ad2;
                        this.b = 3;
                        c3909yc.getClass();
                        hs4 hs4Var = z45.a;
                        Object R = xw3.R(rob.a, new C3857wc(c3909yc, null), this);
                        if (R != lu3Var) {
                            R = Unit.a;
                        }
                        if (R != lu3Var) {
                            c3289ad = c3289ad2;
                            this.d.a(null, view, c3289ad);
                        }
                        return lu3Var;
                    }
                    InterfaceC3880x9 l4 = this.d.l();
                    if (l4 != null) {
                        ((C3906y9) l4).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                    }
                    Qd qd4 = this.d;
                    I6 i6 = (I6) k6;
                    Jl jl2 = i6.b;
                    C3328c0 c3328c02 = qd4.a.a.d;
                    Rc rc3 = qd4.b;
                    rc3.getClass();
                    this.d.a(i6.a, view, new C3289ad(jl2, c3328c02, new Ri(rc3.a.b.g)));
                }
                return Unit.a;
            }
            t = (zu4) this.c;
            y6a.M(obj);
        }
        View view2 = (View) obj;
        this.c = view2;
        this.b = 2;
        Object T = t.T(this);
        if (T != lu3Var) {
            view = view2;
            obj = T;
            k6 = (K6) obj;
            if (!(k6 instanceof H6)) {
            }
            return Unit.a;
        }
        return lu3Var;
    }
}
