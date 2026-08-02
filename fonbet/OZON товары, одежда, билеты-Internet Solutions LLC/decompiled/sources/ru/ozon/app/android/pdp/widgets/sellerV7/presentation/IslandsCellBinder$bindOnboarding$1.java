package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7View;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.IslandsCellBinder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class IslandsCellBinder$bindOnboarding$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ String $onBoardingKey;
    final /* synthetic */ OnBoardingDTO $onboarding;
    final /* synthetic */ View $targetView;
    final /* synthetic */ IslandsCellBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IslandsCellBinder$bindOnboarding$1(IslandsCellBinder islandsCellBinder, OnBoardingDTO onBoardingDTO, String str, View view) {
        super(0);
        this.this$0 = islandsCellBinder;
        this.$onboarding = onBoardingDTO;
        this.$onBoardingKey = str;
        this.$targetView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        SellerV7View sellerV7View;
        OnBoardingDelegate onBoardingDelegate2;
        IslandsCellBinder.Companion companion;
        IslandsCellBinder.Companion companion2;
        IslandsCellBinder.Companion companion3;
        SellerV7View sellerV7View2;
        IslandsCellBinder.Companion companion4;
        onBoardingDelegate = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate == null) {
            this.this$0.initDelegate(this.$onboarding, this.$onBoardingKey);
        }
        sellerV7View = this.this$0.view;
        int height = (sellerV7View.getHeight() - this.$targetView.getHeight()) / 2;
        onBoardingDelegate2 = this.this$0.onBoardingDelegate;
        if (onBoardingDelegate2 != null) {
            k<SellerV7VO> viewHolderOwner = this.this$0.getViewHolderOwner();
            companion = IslandsCellBinder.Companion;
            int onboarding_margin = height - companion.getONBOARDING_MARGIN();
            companion2 = IslandsCellBinder.Companion;
            int onboarding_margin2 = height - companion2.getONBOARDING_MARGIN();
            int left = this.$targetView.getLeft();
            companion3 = IslandsCellBinder.Companion;
            int onboarding_margin3 = left - companion3.getONBOARDING_MARGIN();
            sellerV7View2 = this.this$0.view;
            int width = sellerV7View2.getWidth() - this.$targetView.getRight();
            companion4 = IslandsCellBinder.Companion;
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate2, viewHolderOwner, new OnBoardingCutConfig(Integer.valueOf(onboarding_margin3), Integer.valueOf(onboarding_margin), Integer.valueOf(width - companion4.getONBOARDING_MARGIN()), Integer.valueOf(onboarding_margin2), null, null, null, false, 240, null), null, 4, null);
        }
    }
}
