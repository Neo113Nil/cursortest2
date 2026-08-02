package ud;

import java.util.Map;
import je.N;
import je.Y;
import org.jetbrains.annotations.NotNull;
import td.d0;
import ud.InterfaceC10025c;

/* renamed from: ud.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10026d implements InterfaceC10025c {

    /* renamed from: a, reason: collision with root package name */
    private final Y f100642a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Sd.f, Xd.g<?>> f100643b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f100644c;

    public C10026d(@NotNull Y y11, @NotNull Map map, @NotNull d0 d0Var) {
        if (y11 == null) {
            d(0);
            throw null;
        }
        if (map == null) {
            d(1);
            throw null;
        }
        this.f100642a = y11;
        this.f100643b = map;
        this.f100644c = d0Var;
    }

    private static /* synthetic */ void d(int i11) {
        String str = (i11 == 3 || i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "valueArguments";
        } else if (i11 == 2) {
            objArr[0] = "source";
        } else if (i11 == 3 || i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i11 == 3) {
            objArr[1] = "getType";
        } else if (i11 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<?>> b() {
        Map<Sd.f, Xd.g<?>> map = this.f100643b;
        if (map != null) {
            return map;
        }
        d(4);
        throw null;
    }

    @Override // ud.InterfaceC10025c
    public final Sd.c c() {
        return InterfaceC10025c.a.a(this);
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final d0 e() {
        d0 d0Var = this.f100644c;
        if (d0Var != null) {
            return d0Var;
        }
        d(5);
        throw null;
    }

    @Override // ud.InterfaceC10025c
    @NotNull
    public final N getType() {
        Y y11 = this.f100642a;
        if (y11 != null) {
            return y11;
        }
        d(3);
        throw null;
    }

    public final String toString() {
        return Ud.n.f27602a.F(this, null);
    }
}
