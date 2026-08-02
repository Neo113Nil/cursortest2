package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.uni.android.ds.compose.component.input.DsInputStatus;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isFocused", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class B2bFormContentKt$DsTextInput$6$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ CommonInputV2VO.TextInputV2 $input;
    final /* synthetic */ Function0<Unit> $onClearError;
    final /* synthetic */ DsInputStatus $status;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2bFormContentKt$DsTextInput$6$1(DsInputStatus dsInputStatus, Function0<Unit> function0, CommonInputV2VO.TextInputV2 textInputV2, l lVar) {
        super(1);
        this.$status = dsInputStatus;
        this.$onClearError = function0;
        this.$input = textInputV2;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        l lVar;
        if (z11) {
            if (this.$status == DsInputStatus.ERROR) {
                this.$onClearError.invoke();
            }
            t clickEvent = this.$input.getClickEvent();
            if (clickEvent == null || (lVar = this.$tokenizedAnalytics) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, clickEvent, null, 2, null);
        }
    }
}
