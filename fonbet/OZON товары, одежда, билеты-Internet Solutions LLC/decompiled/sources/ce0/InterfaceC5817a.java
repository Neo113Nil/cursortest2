package ce0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import we0.C10551g;
import we0.i;
import we0.j;
import we0.n;

/* renamed from: ce0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC5817a {

    /* renamed from: ce0.a$a, reason: collision with other inner class name */
    public static final class C0864a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(InterfaceC5817a interfaceC5817a, C10551g c10551g, Function1 function1, int i11) {
            if ((i11 & 4) != 0) {
                function1 = null;
            }
            interfaceC5817a.b(c10551g, 0.3f, function1);
        }
    }

    void a(@NotNull j jVar);

    void b(@NotNull C10551g c10551g, float f7, Function1<? super Boolean, Unit> function1);

    @NotNull
    C10551g c(@NotNull n nVar);

    @NotNull
    j d();

    @NotNull
    C0 e();

    void f(@NotNull C10551g c10551g);

    @NotNull
    C10551g getCurrentPosition();

    @NotNull
    i getVisibleArea();
}
