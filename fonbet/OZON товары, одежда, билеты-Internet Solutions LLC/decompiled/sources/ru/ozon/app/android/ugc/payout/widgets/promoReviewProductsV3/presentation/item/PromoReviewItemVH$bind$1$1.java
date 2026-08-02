package ru.ozon.app.android.ugc.payout.widgets.promoReviewProductsV3.presentation.item;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class PromoReviewItemVH$bind$1$1 extends AbstractC7737t implements Function1<Intent, Unit> {
    final /* synthetic */ String $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoReviewItemVH$bind$1$1(String str) {
        super(1);
        this.$deeplink = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent sendResultToTargetFragment) {
        Intrinsics.checkNotNullParameter(sendResultToTargetFragment, "$this$sendResultToTargetFragment");
        sendResultToTargetFragment.putExtra("pdpRedirectDeeplink", this.$deeplink);
    }
}
