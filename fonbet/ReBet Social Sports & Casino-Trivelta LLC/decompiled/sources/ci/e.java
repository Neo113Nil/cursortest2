package ci;

import Zh.InterfaceC1900a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface e {
    char A();

    String E();

    boolean G();

    default Object H(InterfaceC1900a deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    byte I();

    c c(bi.f fVar);

    int f(bi.f fVar);

    int k();

    Void n();

    long p();

    short v();

    float w();

    double x();

    e y(bi.f fVar);

    boolean z();
}
