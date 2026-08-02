package Ph;

import kotlin.jvm.functions.Function1;

/* renamed from: Ph.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC1463m extends Q0 {

    /* renamed from: Ph.m$a */
    public static final class a implements InterfaceC1463m {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f9106a;

        public a(Function1 function1) {
            this.f9106a = function1;
        }

        @Override // Ph.InterfaceC1463m
        public void b(Throwable th2) {
            this.f9106a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + U.a(this.f9106a) + '@' + U.b(this) + ']';
        }
    }

    void b(Throwable th2);
}
