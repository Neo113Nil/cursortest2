package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import Tl.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class VariantPickerVH$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ VariantPickerVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VariantPickerVH$actionHandler$1(VariantPickerVH variantPickerVH) {
        super(1);
        this.this$0 = variantPickerVH;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        VariantPickerVO boundData;
        if (!b.i(click, "action", "variantPicker") || (boundData = this.this$0.getBoundData()) == null) {
            return;
        }
        this.this$0.showOptionsSheet(boundData);
    }
}
