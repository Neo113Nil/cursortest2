package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import B1.B;
import android.view.View;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function1<B, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Z1.m, Unit> f90863b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f90864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    m(Function1<? super Z1.m, Unit> function1, View view) {
        super(1);
        this.f90863b = function1;
        this.f90864c = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(B b11) {
        B coords = b11;
        Intrinsics.checkNotNullParameter(coords, "coords");
        long u11 = coords.u(0L);
        int[] iArr = new int[2];
        this.f90864c.getLocationOnScreen(iArr);
        this.f90863b.invoke(Z1.m.a(Z1.n.a(iArr[0] + ((int) C7459e.g(u11)), iArr[1] + ((int) C7459e.h(u11)))));
        return Unit.f71690a;
    }
}
