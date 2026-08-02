package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.c;
import xsna.exc0;
import xsna.jnz0;
import xsna.knz0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class b implements Runnable {
    public final /* synthetic */ qdg0 b;
    public final /* synthetic */ knz0 c;

    public b(knz0 knz0Var, qdg0 qdg0Var) {
        this.b = qdg0Var;
        this.c = knz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qdg0 qdg0Var = this.b;
        knz0 knz0Var = this.c;
        try {
            try {
                BasePendingResult.zaa.set(Boolean.TRUE);
                knz0Var.getClass();
                exc0.i(null);
                throw null;
            } catch (RuntimeException e) {
                jnz0 jnz0Var = knz0Var.f;
                jnz0Var.sendMessage(jnz0Var.obtainMessage(1, e));
                BasePendingResult.zaa.set(Boolean.FALSE);
                knz0.e(qdg0Var);
                c cVar = (c) knz0Var.e.get();
                if (cVar != null) {
                    cVar.k(knz0Var);
                }
            }
        } catch (Throwable th) {
            BasePendingResult.zaa.set(Boolean.FALSE);
            knz0.e(qdg0Var);
            c cVar2 = (c) knz0Var.e.get();
            if (cVar2 != null) {
                cVar2.k(knz0Var);
            }
            throw th;
        }
    }
}
