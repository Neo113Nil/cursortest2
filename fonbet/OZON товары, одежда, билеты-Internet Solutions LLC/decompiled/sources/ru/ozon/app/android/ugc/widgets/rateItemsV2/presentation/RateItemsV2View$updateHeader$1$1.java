package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2View$updateHeader$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TextDTO $header;
    final /* synthetic */ TextAtomV2View $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2View$updateHeader$1$1(TextAtomV2View textAtomV2View, TextDTO textDTO) {
        super(0);
        this.$this_with = textAtomV2View;
        this.$header = textDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextAtomV2View textAtomV2View = this.$this_with;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, this.$header, null, 2, null);
    }
}
