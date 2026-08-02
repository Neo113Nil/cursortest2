package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import eb.C4196f;
import ib.InterfaceC4541a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.q;
import nb.z;
import ub.AbstractC6542h;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ h a(InterfaceC5577d interfaceC5577d) {
        return new g((C4196f) interfaceC5577d.a(C4196f.class), interfaceC5577d.f(ub.i.class), (ExecutorService) interfaceC5577d.c(D.a(InterfaceC4541a.class, ExecutorService.class)), z.a((Executor) interfaceC5577d.c(D.a(ib.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5576c> getComponents() {
        return Arrays.asList(C5576c.c(h.class).h(LIBRARY_NAME).b(q.j(C4196f.class)).b(q.h(ub.i.class)).b(q.k(D.a(InterfaceC4541a.class, ExecutorService.class))).b(q.k(D.a(ib.b.class, Executor.class))).f(new mb.g() { // from class: com.google.firebase.installations.j
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return FirebaseInstallationsRegistrar.a(interfaceC5577d);
            }
        }).d(), AbstractC6542h.a(), Eb.h.b(LIBRARY_NAME, "19.1.0"));
    }
}
