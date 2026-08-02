package com.google.android.gms.internal.measurement;

import com.ironsource.U3;
import defpackage.fsf;
import defpackage.n2;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwz implements Runnable {
    public final /* synthetic */ fsf a;
    public final /* synthetic */ zzws b;
    public final /* synthetic */ n2 c;

    public zzwz(fsf fsfVar, zzws zzwsVar, n2 n2Var) {
        this.a = fsfVar;
        this.b = zzwsVar;
        this.c = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zzxe) this.a.a) != null) {
            throw null;
        }
        n2 n2Var = this.c;
        zzws b = zzvy.b(zzvy.c(), this.b);
        try {
            n2Var.run();
            Unit unit = Unit.a;
        } finally {
        }
    }

    public final String toString() {
        n2 n2Var = this.c;
        StringBuilder sb = new StringBuilder(n2Var.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(n2Var);
        sb.append(U3.j.e);
        return sb.toString();
    }
}
