package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CommonPromoBannerKt$CommonPromoBanner$1$2$2$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ CommonPromoBannerDTO $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CommonPromoBannerKt$CommonPromoBanner$1$2$2$1$1(Function1<? super b, Unit> function1, CommonPromoBannerDTO commonPromoBannerDTO) {
        super(0);
        this.$actionHandler = function1;
        this.$this_with = commonPromoBannerDTO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CommonPromoBannerDTO commonPromoBannerDTO;
        AtomActionDTO action;
        AtomAction atomAction;
        Function1<b, Unit> function1 = this.$actionHandler;
        if (function1 == null || (action = (commonPromoBannerDTO = this.$this_with).getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, commonPromoBannerDTO.getTrackingInfo())) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
