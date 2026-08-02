package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.ddb;
import defpackage.fj0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwy implements fj0 {
    public final /* synthetic */ zzws a;
    public final /* synthetic */ fj0 b;

    public zzwy(zzws zzwsVar, fj0 fj0Var) {
        this.a = zzwsVar;
        this.b = fj0Var;
    }

    @Override // defpackage.fj0
    public final ddb apply(Object obj) {
        zzws b = zzvy.b(zzvy.c(), this.a);
        try {
            ddb apply = this.b.apply(obj);
            if (apply != null) {
                return apply;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        fj0 fj0Var = this.b;
        StringBuilder sb = new StringBuilder(fj0Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(fj0Var);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
