package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import defpackage.a70;
import defpackage.b1d;
import defpackage.f1d;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.k13;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rob;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z45;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Nm extends AbstractC3640o2 {
    public final ku3 b;
    public final Om c;
    public final b1d d;
    public final C3906y9 e;
    public final ArrayList f;
    public final ArrayList g;
    public InterfaceC3727rc h;
    public S3 i;
    public ViewGroup j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nm(Context context, ku3 ku3Var, Om om, b1d b1dVar, C3906y9 c3906y9) {
        super(context);
        context.getClass();
        ku3Var.getClass();
        om.getClass();
        b1dVar.getClass();
        this.b = ku3Var;
        this.c = om;
        this.d = b1dVar;
        this.e = c3906y9;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (b(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.inmobi.media.AbstractC3640o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        Am am;
        int i;
        Nm nm;
        if (sq3Var instanceof Am) {
            am = (Am) sq3Var;
            int i2 = am.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                am.d = i2 - Integer.MIN_VALUE;
                Object obj = am.b;
                lu3 lu3Var = lu3.a;
                i = am.d;
                if (i != 0) {
                    y6a.M(obj);
                    C3906y9 c3906y9 = this.e;
                    if (c3906y9 != null) {
                        c3906y9.a("VideoExperienceManager", "load Called - mediaFiles count: " + this.c.c.size());
                    }
                    hs4 hs4Var = z45.a;
                    r69 r69Var = rob.a;
                    Bm bm = new Bm(this, null);
                    am.a = this;
                    am.d = 1;
                    obj = xw3.R(r69Var, bm, am);
                    if (obj != lu3Var) {
                        nm = this;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nm = am.a;
                y6a.M(obj);
                nm.h = (InterfaceC3727rc) obj;
                am.a = null;
                am.d = 2;
            }
        }
        am = new Am(this, sq3Var);
        Object obj2 = am.b;
        lu3 lu3Var2 = lu3.a;
        i = am.d;
        if (i != 0) {
        }
        nm.h = (InterfaceC3727rc) obj2;
        am.a = null;
        am.d = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0 A[LOOP:0: B:21:0x00aa->B:23:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        Cm cm;
        int i;
        Iterator it;
        InterfaceC3727rc interfaceC3727rc;
        Nm nm;
        C3906y9 c3906y9;
        if (sq3Var instanceof Cm) {
            cm = (Cm) sq3Var;
            int i2 = cm.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cm.d = i2 - Integer.MIN_VALUE;
                Object obj = cm.b;
                lu3 lu3Var = lu3.a;
                i = cm.d;
                if (i != 0) {
                    y6a.M(obj);
                    C3906y9 c3906y92 = this.e;
                    if (c3906y92 != null) {
                        c3906y92.a("VideoExperienceManager", "loadVideoExperience - getting sorted media files");
                    }
                    cm.d = 1;
                    ArrayList arrayList = this.c.c;
                    arrayList.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Ol ol = (Ol) next;
                        if (URLUtil.isHttpUrl(ol.c) || URLUtil.isHttpsUrl(ol.c)) {
                            arrayList2.add(next);
                        }
                    }
                    obj = s9a.r(new Um(arrayList2, AbstractC3504im.a(this.c.a) / 1000.0d, this.c.d, null), cm);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nm = cm.a;
                        y6a.M(obj);
                        nm.j = (ViewGroup) obj;
                        c3906y9 = this.e;
                        if (c3906y9 != null) {
                            c3906y9.a("VideoExperienceManager", "Video Experience Load Success");
                        }
                        return Unit.a;
                    }
                    y6a.M(obj);
                }
                List list = (List) obj;
                ArrayList arrayList3 = new ArrayList(k13.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Ol) it.next()).c);
                }
                interfaceC3727rc = this.h;
                if (interfaceC3727rc != null) {
                    Intrinsics.i("mediaPlayer");
                    throw null;
                }
                cm.a = this;
                cm.d = 2;
                obj = ((C3445ge) interfaceC3727rc).a(arrayList3, cm);
                if (obj != lu3Var) {
                    nm = this;
                    nm.j = (ViewGroup) obj;
                    c3906y9 = this.e;
                    if (c3906y9 != null) {
                    }
                    return Unit.a;
                }
                return lu3Var;
            }
        }
        cm = new Cm(this, sq3Var);
        Object obj2 = cm.b;
        lu3 lu3Var2 = lu3.a;
        i = cm.d;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        ArrayList arrayList32 = new ArrayList(k13.r(list2, 10));
        it = list2.iterator();
        while (it.hasNext()) {
        }
        interfaceC3727rc = this.h;
        if (interfaceC3727rc != null) {
        }
    }

    public final void c() {
        b1d b1dVar;
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "observeCompanionAdEvents - setting up companion ad event observers");
        }
        if (this.c.b.isEmpty()) {
            return;
        }
        C3906y9 c3906y92 = this.e;
        if (c3906y92 != null) {
            c3906y92.a("VideoExperienceManager", "observeCompanionAdEvents - collecting companion ad events");
        }
        S3 s3 = this.i;
        if (s3 != null && (b1dVar = s3.d) != null) {
            g9i L = xw3.L(this.b, null, null, new Em(b1dVar, null, this), 3);
            ArrayList arrayList = this.f;
            arrayList.getClass();
            arrayList.add(L);
        }
        C3906y9 c3906y93 = this.e;
        if (c3906y93 != null) {
            c3906y93.a("VideoExperienceManager", "observeCompanionAdEvents - companion ad event observer setup complete");
        }
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void a(f1d f1dVar) {
        f1dVar.getClass();
        g9i L = xw3.L(this.b, null, null, new C3893xm(f1dVar, null, this), 3);
        ArrayList arrayList = this.g;
        arrayList.getClass();
        arrayList.add(L);
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final Object a(FrameLayout frameLayout, C3883xc c3883xc) {
        hs4 hs4Var = z45.a;
        Object R = xw3.R(rob.a, new C3945zm(this, frameLayout, null), c3883xc);
        return R == lu3.a ? R : Unit.a;
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void a() {
        C3906y9 c3906y9 = this.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3727rc interfaceC3727rc = this.h;
        if (interfaceC3727rc != null) {
            ((C3445ge) interfaceC3727rc).a();
        }
        X4.a(this.g);
        S3 s3 = this.i;
        if (s3 != null) {
            s3.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3640o2
    public final void b() {
        X4.a(this.b, new C3919ym(this, null));
        InterfaceC3727rc interfaceC3727rc = this.h;
        if (interfaceC3727rc != null) {
            C3445ge c3445ge = (C3445ge) interfaceC3727rc;
            c3445ge.l.c();
            On on = c3445ge.m;
            InterfaceC3477hk interfaceC3477hk = on.h;
            if (interfaceC3477hk != null) {
                interfaceC3477hk.b();
            }
            on.d.set(false);
            Ng ng = (Ng) on.i.d.getValue();
            ng.f.set(true);
            P6.a(ng.e);
            ng.e = null;
            X4.a(on.e);
            X4.a(c3445ge.d);
            X4.a(this.f);
            return;
        }
        Intrinsics.i("mediaPlayer");
        throw null;
    }
}
