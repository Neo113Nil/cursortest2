package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d9.InterfaceC4046i;
import eb.C4196f;
import java.util.Arrays;
import java.util.List;
import mb.C5576c;
import mb.InterfaceC5577d;
import tb.InterfaceC6459d;
import vb.InterfaceC6681a;

@Keep
/* loaded from: classes3.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging a(mb.D d10, InterfaceC5577d interfaceC5577d) {
        C4196f c4196f = (C4196f) interfaceC5577d.a(C4196f.class);
        android.support.v4.media.session.b.a(interfaceC5577d.a(InterfaceC6681a.class));
        return new FirebaseMessaging(c4196f, null, interfaceC5577d.f(Eb.i.class), interfaceC5577d.f(ub.j.class), (com.google.firebase.installations.h) interfaceC5577d.a(com.google.firebase.installations.h.class), interfaceC5577d.g(d10), (InterfaceC6459d) interfaceC5577d.a(InterfaceC6459d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5576c> getComponents() {
        final mb.D a10 = mb.D.a(ob.b.class, InterfaceC4046i.class);
        return Arrays.asList(C5576c.c(FirebaseMessaging.class).h(LIBRARY_NAME).b(mb.q.j(C4196f.class)).b(mb.q.g(InterfaceC6681a.class)).b(mb.q.h(Eb.i.class)).b(mb.q.h(ub.j.class)).b(mb.q.j(com.google.firebase.installations.h.class)).b(mb.q.i(a10)).b(mb.q.j(InterfaceC6459d.class)).f(new mb.g() { // from class: com.google.firebase.messaging.G
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return FirebaseMessagingRegistrar.a(mb.D.this, interfaceC5577d);
            }
        }).c().d(), Eb.h.b(LIBRARY_NAME, "25.0.1"));
    }
}
