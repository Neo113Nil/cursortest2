package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a55;
import defpackage.ac3;
import defpackage.bcf;
import defpackage.by0;
import defpackage.c9;
import defpackage.cc4;
import defpackage.d4a;
import defpackage.dad;
import defpackage.dc4;
import defpackage.de0;
import defpackage.ejg;
import defpackage.f4a;
import defpackage.fff;
import defpackage.g48;
import defpackage.hki;
import defpackage.i7b;
import defpackage.igf;
import defpackage.inb;
import defpackage.iu;
import defpackage.iy1;
import defpackage.j49;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.kt4;
import defpackage.l48;
import defpackage.mx9;
import defpackage.n90;
import defpackage.nvd;
import defpackage.o90;
import defpackage.oif;
import defpackage.omf;
import defpackage.p90;
import defpackage.pu;
import defpackage.q90;
import defpackage.qx4;
import defpackage.r38;
import defpackage.s5b;
import defpackage.sc4;
import defpackage.tnf;
import defpackage.uw9;
import defpackage.v38;
import defpackage.v65;
import defpackage.vxj;
import defpackage.wba;
import defpackage.wje;
import defpackage.wkf;
import defpackage.wxj;
import defpackage.x6k;
import defpackage.z8;
import defpackage.zff;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class FirebaseInAppMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fiam";
    private oif backgroundExecutor = new oif(by0.class, Executor.class);
    private oif blockingExecutor = new oif(iy1.class, Executor.class);
    private oif lightWeightExecutor = new oif(i7b.class, Executor.class);
    private oif legacyTransportFactory = new oif(s5b.class, wxj.class);

    /* JADX INFO: Access modifiers changed from: private */
    public v38 providesFirebaseInAppMessaging(ac3 ac3Var) {
        r38 r38Var = (r38) ac3Var.e(r38.class);
        l48 l48Var = (l48) ac3Var.e(l48.class);
        nvd l = ac3Var.l(iu.class);
        hki hkiVar = (hki) ac3Var.e(hki.class);
        r38Var.a();
        de0 de0Var = new de0((Application) r38Var.a, 9);
        f4a f4aVar = new f4a(l, hkiVar);
        tnf tnfVar = new tnf(15);
        bcf bcfVar = new bcf();
        d4a d4aVar = new d4a(12);
        d4aVar.b = bcfVar;
        int i = 2;
        sc4 sc4Var = new sc4(new mx9(), new wje(2), de0Var, new inb(24), d4aVar, tnfVar, new fff(0), new wkf(3), new omf(0), f4aVar, new ejg((Executor) ac3Var.h(this.lightWeightExecutor), (Executor) ac3Var.h(this.backgroundExecutor), (Executor) ac3Var.h(this.blockingExecutor)));
        c9 c9Var = new c9(((z8) ac3Var.e(z8.class)).a("fiam"), (Executor) ac3Var.h(this.blockingExecutor));
        x6k x6kVar = new x6k(i, r38Var, l48Var, new igf(3));
        dad dadVar = new dad(r38Var, 26);
        wxj wxjVar = (wxj) ac3Var.h(this.legacyTransportFactory);
        wxjVar.getClass();
        cc4 cc4Var = new cc4(sc4Var, i);
        cc4 cc4Var2 = new cc4(sc4Var, 11);
        int i2 = 5;
        cc4 cc4Var3 = new cc4(sc4Var, i2);
        int i3 = 1;
        dc4 dc4Var = new dc4(sc4Var, i3);
        zff a = v65.a(new n90(x6kVar, v65.a(new pu(v65.a(new j49(dadVar, new cc4(sc4Var, 8), new q90(dadVar, i))), i2)), new cc4(sc4Var, 3), new cc4(sc4Var, 13)));
        cc4 cc4Var4 = new cc4(sc4Var, i3);
        cc4 cc4Var5 = new cc4(sc4Var, 15);
        cc4 cc4Var6 = new cc4(sc4Var, 9);
        cc4 cc4Var7 = new cc4(sc4Var, 14);
        dc4 dc4Var2 = new dc4(sc4Var, 0);
        p90 p90Var = new p90(x6kVar, i);
        q90 q90Var = new q90(x6kVar, p90Var);
        p90 p90Var2 = new p90(x6kVar, i3);
        o90 o90Var = new o90(x6kVar, p90Var, new cc4(sc4Var, 7), 0);
        q90 q90Var2 = new q90(c9Var, 3);
        cc4 cc4Var8 = new cc4(sc4Var, 4);
        zff a2 = v65.a(new uw9(cc4Var, cc4Var2, cc4Var3, dc4Var, a, cc4Var4, cc4Var5, cc4Var6, cc4Var7, dc4Var2, q90Var, p90Var2, o90Var, q90Var2, cc4Var8));
        cc4 cc4Var9 = new cc4(sc4Var, 12);
        int i4 = 0;
        p90 p90Var3 = new p90(x6kVar, i4);
        q90 q90Var3 = new q90(wxjVar, 3);
        cc4 cc4Var10 = new cc4(sc4Var, i4);
        cc4 cc4Var11 = new cc4(sc4Var, 6);
        return (v38) ((v65) v65.a(new g48(a2, cc4Var9, o90Var, p90Var2, new a55(cc4Var6, dc4Var, cc4Var5, cc4Var7, cc4Var3, dc4Var2, v65.a(new vxj(p90Var3, q90Var3, cc4Var10, p90Var2, dc4Var, cc4Var11, cc4Var8)), o90Var), cc4Var11, new cc4(sc4Var, 10)))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kb3> getComponents() {
        jb3 b = kb3.b(v38.class);
        b.a = LIBRARY_NAME;
        b.a(qx4.c(Context.class));
        b.a(qx4.c(l48.class));
        b.a(qx4.c(r38.class));
        b.a(qx4.c(z8.class));
        b.a(new qx4(0, 2, iu.class));
        b.a(qx4.b(this.legacyTransportFactory));
        b.a(qx4.c(hki.class));
        b.a(qx4.b(this.backgroundExecutor));
        b.a(qx4.b(this.blockingExecutor));
        b.a(qx4.b(this.lightWeightExecutor));
        b.f = new kt4(this, 22);
        b.c(2);
        return Arrays.asList(b.b(), wba.q(LIBRARY_NAME, "22.0.3"));
    }
}
