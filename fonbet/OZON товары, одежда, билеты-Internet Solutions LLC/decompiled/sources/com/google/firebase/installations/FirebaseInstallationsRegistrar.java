package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m8.InterfaceC8103a;
import m8.InterfaceC8104b;
import n8.C8451a;
import n8.InterfaceC8452b;
import n8.n;
import n8.w;
import o8.C8657a;
import z8.InterfaceC10999b;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC10999b lambda$getComponents$0(InterfaceC8452b interfaceC8452b) {
        return new c((k8.e) interfaceC8452b.a(k8.e.class), interfaceC8452b.d(w8.h.class), (ExecutorService) interfaceC8452b.e(new w(InterfaceC8103a.class, ExecutorService.class)), C8657a.a((Executor) interfaceC8452b.e(new w(InterfaceC8104b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8451a<?>> getComponents() {
        C8451a.C1292a a11 = C8451a.a(InterfaceC10999b.class);
        a11.g(LIBRARY_NAME);
        a11.b(n.i(k8.e.class));
        a11.b(n.g(w8.h.class));
        a11.b(n.j(new w(InterfaceC8103a.class, ExecutorService.class)));
        a11.b(n.j(new w(InterfaceC8104b.class, Executor.class)));
        a11.f(new H00.a());
        return Arrays.asList(a11.d(), w8.g.a(), H8.g.a(LIBRARY_NAME, "17.2.0"));
    }
}
