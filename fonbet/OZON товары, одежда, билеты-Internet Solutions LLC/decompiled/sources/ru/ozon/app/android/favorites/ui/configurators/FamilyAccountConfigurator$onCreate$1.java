package ru.ozon.app.android.favorites.ui.configurators;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.favorites.ui.configurators.FamilyAccountConfigurator$onCreate$1", f = "FamilyAccountConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FamilyAccountConfigurator$onCreate$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $composerController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FamilyAccountConfigurator$onCreate$1(InterfaceC7851b interfaceC7851b, d<? super FamilyAccountConfigurator$onCreate$1> dVar) {
        super(2, dVar);
        this.$composerController = interfaceC7851b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FamilyAccountConfigurator$onCreate$1(this.$composerController, dVar);
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((FamilyAccountConfigurator$onCreate$1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        InterfaceC7851b.a.a(this.$composerController, null, null, null, null, 15);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
