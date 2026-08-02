package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.x f5018a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.firebase.messaging.x f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.app.v0 f5020c;

    /* renamed from: d, reason: collision with root package name */
    public final t f5021d;

    public e0() {
        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x(5);
        this.f5018a = xVar;
        this.f5019b = ((com.google.firebase.messaging.x) xVar.f6183b).W();
        this.f5020c = new androidx.appcompat.app.v0(4);
        this.f5021d = new t(3);
        final int i5 = 1;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f4904b;

            {
                this.f4904b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i5) {
                    case 0:
                        return new i4(this.f4904b.f5020c);
                    default:
                        return new i4(this.f4904b.f5021d);
                }
            }
        };
        u5 u5Var = (u5) xVar.f6185d;
        ((HashMap) u5Var.f5267a).put("internal.registerCallback", callable);
        final int i10 = 0;
        ((HashMap) u5Var.f5267a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e0 f4904b;

            {
                this.f4904b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                switch (i10) {
                    case 0:
                        return new i4(this.f4904b.f5020c);
                    default:
                        return new i4(this.f4904b.f5021d);
                }
            }
        });
    }

    public final boolean a(b bVar) {
        androidx.appcompat.app.v0 v0Var = this.f5020c;
        try {
            v0Var.f364b = bVar;
            v0Var.f365c = bVar.clone();
            ((ArrayList) v0Var.f366d).clear();
            ((com.google.firebase.messaging.x) this.f5018a.f6184c).Y("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f5021d.d(this.f5019b.W(), v0Var);
            if (((b) v0Var.f365c).equals((b) v0Var.f364b)) {
                return !((ArrayList) v0Var.f366d).isEmpty();
            }
            return true;
        } catch (Throwable th2) {
            throw new r0(th2);
        }
    }

    public final void b(u3 u3Var) {
        h hVar;
        try {
            com.google.firebase.messaging.x xVar = this.f5018a;
            this.f5019b = ((com.google.firebase.messaging.x) xVar.f6183b).W();
            if (xVar.T(this.f5019b, (v3[]) u3Var.p().toArray(new v3[0])) instanceof f) {
                throw new IllegalStateException("Program loading failed");
            }
            for (t3 t3Var : u3Var.q().p()) {
                List q = t3Var.q();
                String p10 = t3Var.p();
                Iterator it = q.iterator();
                while (it.hasNext()) {
                    n T = xVar.T(this.f5019b, (v3) it.next());
                    if (!(T instanceof k)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    com.google.firebase.messaging.x xVar2 = this.f5019b;
                    if (xVar2.X(p10)) {
                        n a02 = xVar2.a0(p10);
                        if (!(a02 instanceof h)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(p10)));
                        }
                        hVar = (h) a02;
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(p10)));
                    }
                    hVar.j(this.f5019b, Collections.singletonList(T));
                }
            }
        } catch (Throwable th2) {
            throw new r0(th2);
        }
    }
}
