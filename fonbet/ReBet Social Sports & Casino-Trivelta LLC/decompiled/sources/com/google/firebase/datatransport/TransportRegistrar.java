package com.google.firebase.datatransport;

import Eb.h;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import d9.InterfaceC4046i;
import e9.C4186a;
import g9.t;
import java.util.Arrays;
import java.util.List;
import mb.C5576c;
import mb.D;
import mb.InterfaceC5577d;
import mb.g;
import mb.q;
import ob.InterfaceC5864a;
import ob.b;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ InterfaceC4046i a(InterfaceC5577d interfaceC5577d) {
        t.f((Context) interfaceC5577d.a(Context.class));
        return t.c().g(C4186a.f45824g);
    }

    public static /* synthetic */ InterfaceC4046i b(InterfaceC5577d interfaceC5577d) {
        t.f((Context) interfaceC5577d.a(Context.class));
        return t.c().g(C4186a.f45825h);
    }

    public static /* synthetic */ InterfaceC4046i c(InterfaceC5577d interfaceC5577d) {
        t.f((Context) interfaceC5577d.a(Context.class));
        return t.c().g(C4186a.f45825h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C5576c> getComponents() {
        return Arrays.asList(C5576c.c(InterfaceC4046i.class).h(LIBRARY_NAME).b(q.j(Context.class)).f(new g() { // from class: ob.c
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return TransportRegistrar.c(interfaceC5577d);
            }
        }).d(), C5576c.e(D.a(InterfaceC5864a.class, InterfaceC4046i.class)).b(q.j(Context.class)).f(new g() { // from class: ob.d
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return TransportRegistrar.b(interfaceC5577d);
            }
        }).d(), C5576c.e(D.a(b.class, InterfaceC4046i.class)).b(q.j(Context.class)).f(new g() { // from class: ob.e
            @Override // mb.g
            public final Object a(InterfaceC5577d interfaceC5577d) {
                return TransportRegistrar.a(interfaceC5577d);
            }
        }).d(), h.b(LIBRARY_NAME, "18.2.0"));
    }
}
