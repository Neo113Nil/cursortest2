package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.cj0;
import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwx implements cj0 {
    public final /* synthetic */ zzws a;
    public final /* synthetic */ cj0 b;

    public zzwx(zzws zzwsVar, cj0 cj0Var) {
        this.a = zzwsVar;
        this.b = cj0Var;
    }

    @Override // defpackage.cj0
    public final ddb call() {
        zzwq c = zzvy.c();
        zzws b = zzvy.b(c, this.a);
        try {
            ddb call = this.b.call();
            zzvy.b(c, b);
            call.getClass();
            return call;
        } finally {
        }
    }

    public final String toString() {
        cj0 cj0Var = this.b;
        StringBuilder sb = new StringBuilder(cj0Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(cj0Var);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
