package com.vk.lists;

import androidx.annotation.NonNull;
import com.vk.lists.c;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import io.reactivex.rxjava3.internal.operators.observable.z;
import xsna.jg70;
import xsna.rz;

/* compiled from: PaginationHelper.java */
/* loaded from: classes3.dex */
public final class e implements u<Object, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c d;

    public e(c cVar, boolean z, boolean z2, boolean z3) {
        this.d = cVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // io.reactivex.rxjava3.core.u
    @NonNull
    public final t<Object> a(@NonNull q<Object> qVar) {
        final boolean z = this.a;
        b0 C = new z(qVar, new io.reactivex.rxjava3.functions.f() { // from class: xsna.zd90
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                com.vk.lists.c cVar = com.vk.lists.e.this.d;
                cVar.s = false;
                cVar.r = null;
                cVar.w = false;
                if (!cVar.p) {
                    cVar.c();
                    return;
                }
                cVar.u(z);
                cVar.c();
                com.vk.lists.c.a(cVar);
            }
        }).C(new rz(this, 3));
        final boolean z2 = this.b;
        final boolean z3 = this.c;
        b0 F = C.F(new io.reactivex.rxjava3.functions.f() { // from class: xsna.ae90
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                c.i iVar;
                com.vk.lists.e eVar = com.vk.lists.e.this;
                boolean z4 = z2;
                boolean z5 = z3;
                Throwable th = (Throwable) obj;
                if (z4) {
                    com.vk.lists.c cVar = eVar.d;
                    if (cVar.e && (iVar = cVar.k) != null) {
                        iVar.clear();
                    } else if (z5) {
                        if (cVar.f) {
                            cVar.d.d();
                        } else {
                            cVar.c.d();
                        }
                    } else if (cVar.f) {
                        ktp0 ktp0Var = cVar.d;
                        synchronized (ktp0Var) {
                            try {
                                ktp0Var.d = ktp0Var.d != null ? ktp0Var.e : 0;
                                ktp0Var.e = null;
                                da90 da90Var = ktp0Var.f;
                                if (da90Var.a) {
                                    int i = da90Var.b - 1;
                                    da90Var.b = i;
                                    if (i < 0) {
                                        da90Var.b = 0;
                                    }
                                } else {
                                    da90Var.b++;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
                com.vk.lists.c cVar2 = eVar.d;
                cVar2.r = th;
                cVar2.s = true;
            }
        });
        jg70 jg70Var = new jg70(this, z, 1);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        return new c0(F.E(lVar, lVar, kVar, jg70Var), lVar, new io.reactivex.rxjava3.functions.a() { // from class: xsna.be90
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.lists.c cVar = com.vk.lists.e.this.d;
                cVar.u(z);
                cVar.c();
            }
        });
    }
}
