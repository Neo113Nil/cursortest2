package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog$bind$lambda$7$lambda$6$$inlined$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBoardingDialog$bind$lambda$7$lambda$6$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ OnBoardingDialogCutConfig $onBoardingCutConfig$inlined;
    final /* synthetic */ ViewGroup $rootViewGroup$inlined;
    final /* synthetic */ OnBoardingDialog this$0;

    public OnBoardingDialog$bind$lambda$7$lambda$6$$inlined$doOnNextLayout$1(OnBoardingDialog onBoardingDialog, ViewGroup viewGroup, OnBoardingDialogCutConfig onBoardingDialogCutConfig) {
        this.this$0 = onBoardingDialog;
        this.$rootViewGroup$inlined = viewGroup;
        this.$onBoardingCutConfig$inlined = onBoardingDialogCutConfig;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        this.this$0.updateVerticalParams(this.$rootViewGroup$inlined, this.$onBoardingCutConfig$inlined);
    }
}
