package ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.Y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.domain.onboarding.databinding.StorefrontLayoutOnboardingBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bitmap", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OnboardingDialog$startAnimation$1$1 extends AbstractC7737t implements Function1<Bitmap, Unit> {
    final /* synthetic */ OnboardingDialogCutConfig $onboardingCutConfig;
    final /* synthetic */ StorefrontLayoutOnboardingBinding $this_with;
    final /* synthetic */ OnboardingDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnboardingDialog$startAnimation$1$1(OnboardingDialog onboardingDialog, StorefrontLayoutOnboardingBinding storefrontLayoutOnboardingBinding, OnboardingDialogCutConfig onboardingDialogCutConfig) {
        super(1);
        this.this$0 = onboardingDialog;
        this.$this_with = storefrontLayoutOnboardingBinding;
        this.$onboardingCutConfig = onboardingDialogCutConfig;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        OnboardingDialog onboardingDialog = this.this$0;
        ImageView cutDetailIv = this.$this_with.cutDetailIv;
        Intrinsics.checkNotNullExpressionValue(cutDetailIv, "cutDetailIv");
        onboardingDialog.drawOnBoardingArea(cutDetailIv, bitmap, this.$onboardingCutConfig);
        ImageView cutDetailIv2 = this.$this_with.cutDetailIv;
        Intrinsics.checkNotNullExpressionValue(cutDetailIv2, "cutDetailIv");
        final OnboardingDialog onboardingDialog2 = this.this$0;
        int i11 = Y.f42258g;
        if (!cutDetailIv2.isLaidOut() || cutDetailIv2.isLayoutRequested()) {
            cutDetailIv2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.storefront.domain.onboarding.presentation.dialog.OnboardingDialog$startAnimation$1$1$invoke$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    OnboardingDialog.this.configureAnimationsAndStart();
                }
            });
        } else {
            onboardingDialog2.configureAnimationsAndStart();
        }
    }
}
