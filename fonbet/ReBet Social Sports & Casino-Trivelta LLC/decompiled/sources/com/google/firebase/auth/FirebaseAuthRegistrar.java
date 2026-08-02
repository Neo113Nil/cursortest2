package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import eb.C4196f;
import ib.InterfaceC4541a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import jb.InterfaceC5113a;
import lb.C5426e;
import lb.InterfaceC5422a;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.q;
import ub.AbstractC6542h;

@Keep
/* loaded from: classes3.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(D d10, D d11, D d12, D d13, D d14, InterfaceC5577d interfaceC5577d) {
        return new C5426e((C4196f) interfaceC5577d.a(C4196f.class), interfaceC5577d.f(InterfaceC5113a.class), interfaceC5577d.f(ub.i.class), (Executor) interfaceC5577d.c(d10), (Executor) interfaceC5577d.c(d11), (Executor) interfaceC5577d.c(d12), (ScheduledExecutorService) interfaceC5577d.c(d13), (Executor) interfaceC5577d.c(d14));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    public List<C5576c> getComponents() {
        final D a10 = D.a(InterfaceC4541a.class, Executor.class);
        final D a11 = D.a(ib.b.class, Executor.class);
        final D a12 = D.a(ib.c.class, Executor.class);
        final D a13 = D.a(ib.c.class, ScheduledExecutorService.class);
        final D a14 = D.a(ib.d.class, Executor.class);
        return Arrays.asList(C5576c.d(FirebaseAuth.class, InterfaceC5422a.class).b(q.j(C4196f.class)).b(q.l(ub.i.class)).b(q.k(a10)).b(q.k(a11)).b(q.k(a12)).b(q.k(a13)).b(q.k(a14)).b(q.h(InterfaceC5113a.class)).f(new mb.g() { // from class: kb.M
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return FirebaseAuthRegistrar.lambda$getComponents$0(mb.D.this, a11, a12, a13, a14, interfaceC5577d);
            }
        }).d(), AbstractC6542h.a(), Eb.h.b("fire-auth", "24.0.1"));
    }
}
