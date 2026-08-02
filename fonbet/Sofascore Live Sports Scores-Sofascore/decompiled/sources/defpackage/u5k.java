package defpackage;

import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class u5k<T> {
    public final Class a;
    public final Type b;
    public final int c;

    public u5k(Type type) {
        Objects.requireNonNull(type);
        Type Y = k53.Y(type);
        this.b = Y;
        this.a = k53.p0(Y);
        this.c = Y.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5k) {
            return k53.e0(this.b, ((u5k) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return k53.A0(this.b);
    }
}
