package ru.ozon.android.messenger.framework.presentation.common.viewmodel;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import U7.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class d<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<T> f91309a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<T> f91310b;

    public d(T t2) {
        x0<T> a11 = O0.a(t2);
        this.f91309a = a11;
        this.f91310b = C2399j.b(a11);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.viewmodel.c
    public void a(@NotNull Function1<? super T, ? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        x0<T> x0Var = this.f91309a;
        T value = x0Var.getValue();
        T invoke = block.invoke(value);
        if (Intrinsics.d(invoke, value)) {
            return;
        }
        Lm0.a.f17149a.d(m.b(invoke, "\nNew state: "), new Object[0]);
        x0Var.setValue(invoke);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.viewmodel.c
    @NotNull
    public final M0<T> getState() {
        return this.f91310b;
    }
}
