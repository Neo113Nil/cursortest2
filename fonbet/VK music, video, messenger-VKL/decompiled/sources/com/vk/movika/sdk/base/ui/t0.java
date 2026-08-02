package com.vk.movika.sdk.base.ui;

import xsna.gy70;
import xsna.hpm;
import xsna.izs;
import xsna.mkx;
import xsna.nkx;
import xsna.s3q0;
import xsna.vx70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t0(long j, Object obj, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
        this.e = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                v0 v0Var = (v0) this.d;
                h hVar = (h) this.e;
                v0Var.f.clear();
                com.vk.movika.sdk.player.base.components.a aVar = v0Var.d;
                aVar.b.t();
                aVar.c.v((com.vk.movika.sdk.player.base.model.a) obj, this.c, hVar);
                return s3q0.a;
            case 1:
                Boolean bool = (Boolean) this.d;
                hpm hpmVar = (hpm) this.e;
                if (bool == null || (str = Integer.valueOf(bool.booleanValue() ? 1 : 0).toString()) == null) {
                    str = "NULL";
                }
                hpmVar.b.b().execSQL("UPDATE dialogs SET marked_as_unread_local = " + str + " WHERE id = " + this.c);
                return s3q0.a;
            default:
                gy70 gy70Var = (gy70) this.d;
                mkx mkxVar = (mkx) this.e;
                if (!(gy70Var instanceof nkx)) {
                    return mkxVar.h(gy70Var);
                }
                String i = mkxVar.i(gy70Var);
                okhttp3.u g = mkxVar.g(mkxVar.t((nkx) gy70Var, this.c).b());
                return new vx70.b(mkxVar.p(g), g.g, i);
        }
    }

    public /* synthetic */ t0(long j, mkx mkxVar, gy70 gy70Var) {
        this.b = 2;
        this.d = gy70Var;
        this.e = mkxVar;
        this.c = j;
    }
}
