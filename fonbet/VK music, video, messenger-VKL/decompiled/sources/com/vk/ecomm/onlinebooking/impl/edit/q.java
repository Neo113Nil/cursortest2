package com.vk.ecomm.onlinebooking.impl.edit;

import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.model.BookingEditModel;
import xsna.epx;
import xsna.fm50;
import xsna.gq7;
import xsna.h0u0;
import xsna.sr;
import xsna.tr;
import xsna.wow;
import xsna.yzt0;

/* compiled from: BookingEditScreenRender.kt */
/* loaded from: classes18.dex */
public final class q implements fm50 {
    public final yzt0<gq7> a;
    public final yzt0<BookingEditScreenState.g> b;
    public final yzt0<Boolean> c;
    public final yzt0<BookingEditModel.EditMode> d;
    public final yzt0<BookingEditScreenState.e> e;
    public final yzt0<wow<BookingEditScreenState.g>> f;
    public final yzt0<BookingEditScreenState.c> g;
    public final yzt0<BookingEditScreenState.a> h;
    public final yzt0<BookingEditScreenState.InfoBlock> i;
    public final yzt0<String> j;
    public final yzt0<BookingEditScreenState.f> k;
    public final yzt0<BookingEditScreenState.b> l;
    public final yzt0<Boolean> m;

    public q(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
        this.e = h0u0Var5;
        this.f = h0u0Var6;
        this.g = h0u0Var7;
        this.h = h0u0Var8;
        this.i = h0u0Var9;
        this.j = h0u0Var10;
        this.k = h0u0Var11;
        this.l = h0u0Var12;
        this.m = h0u0Var13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return epx.f(this.a, qVar.a) && epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c) && epx.f(this.d, qVar.d) && epx.f(this.e, qVar.e) && epx.f(this.f, qVar.f) && epx.f(this.g, qVar.g) && epx.f(this.h, qVar.h) && epx.f(this.i, qVar.i) && epx.f(this.j, qVar.j) && epx.f(this.k, qVar.k) && epx.f(this.l, qVar.l) && epx.f(this.m, qVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(error=");
        sb.append(this.a);
        sb.append(", deleteService=");
        sb.append(this.b);
        sb.append(", bookingLoading=");
        sb.append(this.c);
        sb.append(", editMode=");
        sb.append(this.d);
        sb.append(", master=");
        sb.append(this.e);
        sb.append(", services=");
        sb.append(this.f);
        sb.append(", date=");
        sb.append(this.g);
        sb.append(", bottomBar=");
        sb.append(this.h);
        sb.append(", infoBlock=");
        sb.append(this.i);
        sb.append(", currency=");
        sb.append(this.j);
        sb.append(", notification=");
        sb.append(this.k);
        sb.append(", consentPersonalData=");
        sb.append(this.l);
        sb.append(", cancelConfirmation=");
        return tr.c(sb, this.m, ')');
    }
}
