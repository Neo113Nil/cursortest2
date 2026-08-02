package ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemVI;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SkuListCopyItemComposableKt$SkuListCopyItemComposable$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $onAtomAction;
    final /* synthetic */ SkuListItemVI $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SkuListCopyItemComposableKt$SkuListCopyItemComposable$3(SkuListItemVI skuListItemVI, Function1<? super AtomAction, Unit> function1, int i11) {
        super(2);
        this.$state = skuListItemVI;
        this.$onAtomAction = function1;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        SkuListCopyItemComposableKt.SkuListCopyItemComposable(this.$state, this.$onAtomAction, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
