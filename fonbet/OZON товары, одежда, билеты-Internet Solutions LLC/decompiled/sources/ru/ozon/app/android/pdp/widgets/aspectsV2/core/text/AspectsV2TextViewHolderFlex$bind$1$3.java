package ru.ozon.app.android.pdp.widgets.aspectsV2.core.text;

import WZ.t;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.text.AspectsTextVariantV2VO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV2TextViewHolderFlex$bind$1$3 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ AspectsTextVariantV2VO $item;
    final /* synthetic */ AspectsV2TextViewHolderFlex this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV2TextViewHolderFlex$bind$1$3(AspectsTextVariantV2VO aspectsTextVariantV2VO, AspectsV2TextViewHolderFlex aspectsV2TextViewHolderFlex) {
        super(1);
        this.$item = aspectsTextVariantV2VO;
        this.this$0 = aspectsV2TextViewHolderFlex;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$item.getIsSelected()) {
            return;
        }
        composerReferences = this.this$0.ref;
        InterfaceC7851b.a.e(composerReferences.getController(), this.$item.getRefreshDeeplink(), null, null, 6);
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            composerReferences2 = this.this$0.ref;
            TokenizedAnalyticsExtKt.processNonViewEvents(composerReferences2.getTokenizedAnalytics(), tokenizedEvent);
        }
    }
}
