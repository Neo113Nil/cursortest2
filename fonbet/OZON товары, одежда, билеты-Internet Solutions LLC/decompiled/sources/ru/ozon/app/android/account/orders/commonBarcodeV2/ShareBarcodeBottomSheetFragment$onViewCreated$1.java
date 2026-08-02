package ru.ozon.app.android.account.orders.commonBarcodeV2;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.barcodecache.R$string;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeAnalytics;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeDelegate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ShareBarcodeBottomSheetFragment$onViewCreated$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ ShareBarcodeBottomSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareBarcodeBottomSheetFragment$onViewCreated$1(ShareBarcodeBottomSheetFragment shareBarcodeBottomSheetFragment) {
        super(1);
        this.this$0 = shareBarcodeBottomSheetFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        ShareBarcodeAnalytics shareBarcodeAnalytics;
        ShareBarcodeDelegate shareBarcodeDelegate;
        String string;
        Bundle arguments;
        String string2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AtomAction.Click) {
            shareBarcodeAnalytics = this.this$0.shareBarcodeAnalytics;
            if (shareBarcodeAnalytics == null) {
                Intrinsics.n("shareBarcodeAnalytics");
                throw null;
            }
            Bundle arguments2 = this.this$0.getArguments();
            shareBarcodeAnalytics.shareButtonClick(arguments2 != null ? arguments2.getString("objectType") : null, StringProvider.getString(R$string.share));
            shareBarcodeDelegate = this.this$0.shareBarcodeDelegate;
            Context requireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Bundle arguments3 = this.this$0.getArguments();
            if (arguments3 == null || (string = arguments3.getString("code")) == null || (arguments = this.this$0.getArguments()) == null || (string2 = arguments.getString("visibleCode")) == null) {
                return;
            }
            shareBarcodeDelegate.share(requireContext, string, string2, StringProvider.getString(R$string.barcode_sharing_message), new WeakReference<>(this.this$0.getLifecycle()));
            this.this$0.dismiss();
        }
    }
}
