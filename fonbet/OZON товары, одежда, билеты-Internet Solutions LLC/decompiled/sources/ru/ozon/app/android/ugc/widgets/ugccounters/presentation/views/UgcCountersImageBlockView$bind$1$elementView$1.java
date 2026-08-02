package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.K;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UgcCountersImageBlockView$bind$1$elementView$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ UgcCountersVO.Block.Images $block;
    final /* synthetic */ K $loadCounter;
    final /* synthetic */ Function0<Unit> $onImageLoadSuccessful;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersImageBlockView$bind$1$elementView$1(K k11, UgcCountersVO.Block.Images images, Function0<Unit> function0) {
        super(0);
        this.$loadCounter = k11;
        this.$block = images;
        this.$onImageLoadSuccessful = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        K k11 = this.$loadCounter;
        int i11 = k11.f71785a + 1;
        k11.f71785a = i11;
        if (i11 == this.$block.getImages().size()) {
            this.$onImageLoadSuccessful.invoke();
        }
    }
}
