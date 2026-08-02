package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core;

import Tg.b;
import UZ.d;
import WZ.e;
import WZ.g;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.WholeSaleModalViewModel;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleButton.WholeSaleModalButtonVI;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ i<WholeSaleModalButtonVI> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ WholeSaleModalViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2$1$1$1(WholeSaleModalViewModel wholeSaleModalViewModel, i<WholeSaleModalButtonVI> iVar, Function1<? super b, Unit> function1, l lVar) {
        super(0);
        this.$viewModel = wholeSaleModalViewModel;
        this.$this_content = iVar;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g invoke$lambda$2$lambda$1$lambda$0(WholeSaleModalViewModel wholeSaleModalViewModel, UZ.a aVar, g params) {
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        Intrinsics.checkNotNullParameter(params, "params");
        return g.a(params, wholeSaleModalViewModel.getCustomTrackingInfo(), null, 2);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t b11;
        AtomAction sendMessagePressed = this.$viewModel.sendMessagePressed(this.$this_content.b().getMessageTemplate(), this.$this_content.b().getButton().getCommon());
        if (sendMessagePressed != null) {
            Function1<b, Unit> function1 = this.$actionHandler;
            i<WholeSaleModalButtonVI> iVar = this.$this_content;
            l lVar = this.$tokenizedAnalytics;
            final WholeSaleModalViewModel wholeSaleModalViewModel = this.$viewModel;
            function1.invoke(sendMessagePressed);
            CommonControlSettings common = iVar.b().getButton().getCommon();
            if (common == null || (trackingInfo = common.getTrackingInfo()) == null || (b11 = x.b(trackingInfo, Long.valueOf(iVar.b().getId()), null)) == null) {
                return;
            }
            m.a(lVar, b11, new e() { // from class: ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.a
                @Override // WZ.e
                public final g modifyParams(UZ.a aVar, g gVar) {
                    g invoke$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$2$lambda$1$lambda$0 = WholeSaleModalComposeWidgetKt$wholeSaleModal$1$4$2$1$1$1.invoke$lambda$2$lambda$1$lambda$0(WholeSaleModalViewModel.this, (d) aVar, gVar);
                    return invoke$lambda$2$lambda$1$lambda$0;
                }
            });
        }
    }
}
