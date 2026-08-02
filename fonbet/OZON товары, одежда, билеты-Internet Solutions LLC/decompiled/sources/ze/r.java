package ze;

import T7.E;
import kotlin.Unit;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ze.l;

/* loaded from: classes.dex */
public final class r<E> extends C11115c<E> {

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final EnumC11113a f108956l;

    public r(int i11, @NotNull EnumC11113a enumC11113a) {
        super(i11);
        this.f108956l = enumC11113a;
        if (enumC11113a != EnumC11113a.SUSPEND) {
            if (i11 < 1) {
                throw new IllegalArgumentException(E.a(i11, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + N.b(C11115c.class).B() + " instead").toString());
        }
    }

    private final Object X(E e11, boolean z11) {
        if (this.f108956l != EnumC11113a.DROP_LATEST) {
            return T(e11);
        }
        Object b11 = super.b(e11);
        return (!(b11 instanceof l.b) || (b11 instanceof l.a)) ? b11 : Unit.f71690a;
    }

    @Override // ze.C11115c
    protected final boolean K() {
        return this.f108956l == EnumC11113a.DROP_OLDEST;
    }

    @Override // ze.C11115c, ze.x
    @NotNull
    public final Object b(E e11) {
        return X(e11, false);
    }

    @Override // ze.C11115c, ze.x
    public final Object n(E e11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object X9 = X(e11, true);
        if (!(X9 instanceof l.a)) {
            return Unit.f71690a;
        }
        l.c(X9);
        throw F();
    }
}
