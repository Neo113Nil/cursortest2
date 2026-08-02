package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.composer.ui.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/ozon/composer/ui/widget/i;", "invoke", "()Lru/ozon/composer/ui/widget/i;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$secondFloorContainer$2 extends AbstractC7737t implements Function0<i> {
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$secondFloorContainer$2(SelectionFormHeaderVH selectionFormHeaderVH) {
        super(0);
        this.this$0 = selectionFormHeaderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final i invoke() {
        l10.i iVar;
        l10.i iVar2;
        iVar = this.this$0.container;
        iVar2 = this.this$0.container;
        return new i(new FrameLayout(iVar2.L()), iVar);
    }
}
