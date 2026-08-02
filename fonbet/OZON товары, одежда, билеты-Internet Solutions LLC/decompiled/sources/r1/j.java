package r1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super j, Unit> f82799a;

    public /* synthetic */ j(int i11) {
        this();
    }

    public abstract void a(@NotNull InterfaceC8412e interfaceC8412e);

    public Function1<j, Unit> b() {
        return this.f82799a;
    }

    public final void c() {
        Function1<j, Unit> b11 = b();
        if (b11 != null) {
            b11.invoke(this);
        }
    }

    public void d(Function1<? super j, Unit> function1) {
        this.f82799a = function1;
    }

    private j() {
    }
}
