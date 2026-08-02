package rh;

import ph.AbstractC6073d;

/* renamed from: rh.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6292j {
    static InterfaceC6292j e() {
        return AbstractC6073d.f63212a;
    }

    boolean a();

    default boolean b() {
        return g().b();
    }

    String c();

    String d();

    InterfaceC6299q f();

    InterfaceC6297o g();

    default boolean isValid() {
        return AbstractC6298p.isValid(d()) && AbstractC6294l.isValid(c());
    }
}
