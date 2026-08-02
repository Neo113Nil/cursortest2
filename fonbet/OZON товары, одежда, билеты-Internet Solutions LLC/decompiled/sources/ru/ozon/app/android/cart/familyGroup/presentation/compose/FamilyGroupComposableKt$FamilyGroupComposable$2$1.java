package ru.ozon.app.android.cart.familyGroup.presentation.compose;

import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cart.familyGroup.presentation.FamilyGroupVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class FamilyGroupComposableKt$FamilyGroupComposable$2$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ FamilyGroupVO $item;
    final /* synthetic */ Function2<FamilyGroupVO, t, Unit> $onView;
    final /* synthetic */ t $tokenizedEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FamilyGroupComposableKt$FamilyGroupComposable$2$1(Function2<? super FamilyGroupVO, ? super t, Unit> function2, FamilyGroupVO familyGroupVO, t tVar) {
        super(0);
        this.$onView = function2;
        this.$item = familyGroupVO;
        this.$tokenizedEvent = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onView.invoke(this.$item, this.$tokenizedEvent);
    }
}
