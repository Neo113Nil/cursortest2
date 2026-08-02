package ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation.ItemDocumentsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ItemDocumentsWidgetKt$DocumentItem$3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ ItemDocumentsVO.DocumentVO $document;
    final /* synthetic */ e $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ItemDocumentsWidgetKt$DocumentItem$3(ItemDocumentsVO.DocumentVO documentVO, Function1<? super AtomAction, Unit> function1, e eVar, int i11) {
        super(2);
        this.$document = documentVO;
        this.$actionHandler = function1;
        this.$modifier = eVar;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        ItemDocumentsWidgetKt.DocumentItem(this.$document, this.$actionHandler, this.$modifier, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}
