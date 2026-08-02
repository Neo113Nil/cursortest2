package ru.ozon.android.messenger.framework.presentation.chatlist;

import androidx.activity.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<C, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9488a f90464b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(C9488a c9488a) {
        super(1);
        this.f90464b = c9488a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C c11) {
        k kVar;
        k kVar2;
        C addCallback = c11;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        C9488a c9488a = this.f90464b;
        kVar = c9488a.f90425k;
        if (kVar == null || !kVar.o()) {
            addCallback.setEnabled(false);
            c9488a.requireActivity().getOnBackPressedDispatcher().l();
            addCallback.setEnabled(true);
        } else {
            kVar2 = c9488a.f90425k;
            if (kVar2 != null) {
                kVar2.n();
            }
        }
        return Unit.f71690a;
    }
}
