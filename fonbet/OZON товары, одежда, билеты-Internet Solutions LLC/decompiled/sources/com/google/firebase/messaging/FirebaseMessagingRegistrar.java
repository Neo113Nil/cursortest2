package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import n8.C8451a;
import n8.InterfaceC8452b;
import p8.InterfaceC8870b;
import x8.InterfaceC10676a;
import z8.InterfaceC10999b;

@Keep
@KeepForSdk
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(n8.w wVar, InterfaceC8452b interfaceC8452b) {
        return new FirebaseMessaging((k8.e) interfaceC8452b.a(k8.e.class), (InterfaceC10676a) interfaceC8452b.a(InterfaceC10676a.class), interfaceC8452b.d(H8.h.class), interfaceC8452b.d(w8.i.class), (InterfaceC10999b) interfaceC8452b.a(InterfaceC10999b.class), interfaceC8452b.b(wVar), (v8.d) interfaceC8452b.a(v8.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C8451a<?>> getComponents() {
        n8.w wVar = new n8.w(InterfaceC8870b.class, Q6.i.class);
        C8451a.C1292a a11 = C8451a.a(FirebaseMessaging.class);
        a11.g(LIBRARY_NAME);
        a11.b(n8.n.i(k8.e.class));
        a11.b(n8.n.f());
        a11.b(n8.n.g(H8.h.class));
        a11.b(n8.n.g(w8.i.class));
        a11.b(n8.n.i(InterfaceC10999b.class));
        a11.b(n8.n.h(wVar));
        a11.b(n8.n.i(v8.d.class));
        a11.f(new C5939u(wVar));
        a11.c();
        return Arrays.asList(a11.d(), H8.g.a(LIBRARY_NAME, "24.1.1"));
    }
}
