package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack;

import X4.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* JADX INFO: Add missing generic type declarations: [Binding] */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX4/a;", "Binding", "", "invoke", "(LX4/a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class AspectsCompactV2PackVariantBaseViewHolder$setTexts$1<Binding> extends AbstractC7737t implements Function1<Binding, Unit> {
    final /* synthetic */ TextAtomV2View $subtitleTav;
    final /* synthetic */ AspectsCompactPackVariantV2VO $this_setTexts;
    final /* synthetic */ TextAtomV2View $titleTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2PackVariantBaseViewHolder$setTexts$1(TextAtomV2View textAtomV2View, AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO, TextAtomV2View textAtomV2View2) {
        super(1);
        this.$titleTav = textAtomV2View;
        this.$this_setTexts = aspectsCompactPackVariantV2VO;
        this.$subtitleTav = textAtomV2View2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((a) obj);
        return Unit.f71690a;
    }

    /* JADX WARN: Incorrect types in method signature: (TBinding;)V */
    public final void invoke(a binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        TextHolderKt.bindOrGone$default(this.$titleTav, this.$this_setTexts.getText(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.$subtitleTav, this.$this_setTexts.getSubtitle(), null, 2, null);
        if (this.$this_setTexts.getIsAvailable()) {
            return;
        }
        this.$titleTav.setAlpha(this.$this_setTexts.isNotAvailableTextAlpha());
        this.$subtitleTav.setAlpha(this.$this_setTexts.isNotAvailableTextAlpha());
    }
}
