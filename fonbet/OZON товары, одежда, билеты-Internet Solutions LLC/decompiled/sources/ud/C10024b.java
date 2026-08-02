package ud;

import org.jetbrains.annotations.NotNull;

/* renamed from: ud.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10024b implements InterfaceC10023a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10030h f100641a;

    public C10024b(@NotNull InterfaceC10030h interfaceC10030h) {
        if (interfaceC10030h != null) {
            this.f100641a = interfaceC10030h;
        } else {
            N(0);
            throw null;
        }
    }

    private static /* synthetic */ void N(int i11) {
        String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 1 ? 3 : 2];
        if (i11 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i11 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i11 != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 == 1) {
            throw new IllegalStateException(format);
        }
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public InterfaceC10030h getAnnotations() {
        InterfaceC10030h interfaceC10030h = this.f100641a;
        if (interfaceC10030h != null) {
            return interfaceC10030h;
        }
        N(1);
        throw null;
    }
}
