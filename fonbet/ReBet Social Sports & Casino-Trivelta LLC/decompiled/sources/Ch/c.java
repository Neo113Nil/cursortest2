package Ch;

import oh.g;
import rh.InterfaceC6292j;

/* loaded from: classes3.dex */
public interface c {
    InterfaceC6292j a();

    default String c() {
        return a().c();
    }

    default String d() {
        return a().d();
    }

    long e();

    long f();

    Ah.c g();

    g getAttributes();

    String getName();

    d getStatus();
}
