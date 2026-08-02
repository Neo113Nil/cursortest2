package de;

import je.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: de.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC6182a implements InterfaceC6188g {

    /* renamed from: a, reason: collision with root package name */
    protected final N f61602a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6188g f61603b;

    public AbstractC6182a(@NotNull N n11, InterfaceC6188g interfaceC6188g) {
        if (n11 == null) {
            c(0);
            throw null;
        }
        this.f61602a = n11;
        this.f61603b = interfaceC6188g == null ? this : interfaceC6188g;
    }

    private static /* synthetic */ void c(int i11) {
        String str = (i11 == 1 || i11 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 2) ? 2 : 3];
        if (i11 == 1 || i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i11 == 1) {
            objArr[1] = "getType";
        } else if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i11 != 1 && i11 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // de.InterfaceC6188g
    @NotNull
    public final N getType() {
        N n11 = this.f61602a;
        if (n11 != null) {
            return n11;
        }
        c(1);
        throw null;
    }
}
