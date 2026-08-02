package xe;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10731k extends P0 {

    /* renamed from: xe.k$a */
    public static final class a implements InterfaceC10731k {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Function1<Throwable, Unit> f105470a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function1<? super Throwable, Unit> function1) {
            this.f105470a = function1;
        }

        @Override // xe.InterfaceC10731k
        public final void b(Throwable th2) {
            this.f105470a.invoke(th2);
        }

        @NotNull
        public final String toString() {
            return "CancelHandler.UserSupplied[" + this.f105470a.getClass().getSimpleName() + '@' + Q.a(this) + ']';
        }
    }

    void b(Throwable th2);
}
