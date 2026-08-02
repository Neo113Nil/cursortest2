package xe;

import De.C2857A;
import Sc.InterfaceC3999a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC10733l<T> extends kotlin.coroutines.d<T> {
    boolean A(Throwable th2);

    C2857A D(Object obj, InterfaceC6511n interfaceC6511n);

    void E(@NotNull Object obj);

    <R extends T> void G(R r11, InterfaceC6511n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC6511n);

    boolean isActive();

    @InterfaceC3999a
    void u(T t2, Function1<? super Throwable, Unit> function1);
}
