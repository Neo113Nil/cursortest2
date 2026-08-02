package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.animation;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001f¨\u0006\""}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/animation/ItemsListAnimationManager;", "", "", "animationDuration", "Lkotlin/Function1;", "", "", "onExpandItemsList", "onCollapseItemsList", "onExpandBottomPadding", "onCollapseBottomPadding", "<init>", "(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/animation/Animation;", "applyDefaultSettings", "(Landroid/view/animation/Animation;)Landroid/view/animation/Animation;", "J", "expandAlphaAnimation", "Landroid/view/animation/Animation;", "collapseAlphaAnimation", "heightExpandAnimation", "heightCollapseAnimation", "Landroid/view/animation/AnimationSet;", "expandItemsListAnimation", "Landroid/view/animation/AnimationSet;", "getExpandItemsListAnimation", "()Landroid/view/animation/AnimationSet;", "collapseItemsListAnimation", "getCollapseItemsListAnimation", "expandBottomPaddingAnimation", "getExpandBottomPaddingAnimation", "()Landroid/view/animation/Animation;", "collapseBottomPaddingAnimation", "getCollapseBottomPaddingAnimation", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemsListAnimationManager {
    private final long animationDuration;

    @NotNull
    private final Animation collapseAlphaAnimation;

    @NotNull
    private final Animation collapseBottomPaddingAnimation;

    @NotNull
    private final AnimationSet collapseItemsListAnimation;

    @NotNull
    private final Animation expandAlphaAnimation;

    @NotNull
    private final Animation expandBottomPaddingAnimation;

    @NotNull
    private final AnimationSet expandItemsListAnimation;

    @NotNull
    private final Animation heightCollapseAnimation;

    @NotNull
    private final Animation heightExpandAnimation;

    public ItemsListAnimationManager(long j11, @NotNull Function1<? super Float, Unit> onExpandItemsList, @NotNull Function1<? super Float, Unit> onCollapseItemsList, @NotNull Function1<? super Float, Unit> onExpandBottomPadding, @NotNull Function1<? super Float, Unit> onCollapseBottomPadding) {
        Intrinsics.checkNotNullParameter(onExpandItemsList, "onExpandItemsList");
        Intrinsics.checkNotNullParameter(onCollapseItemsList, "onCollapseItemsList");
        Intrinsics.checkNotNullParameter(onExpandBottomPadding, "onExpandBottomPadding");
        Intrinsics.checkNotNullParameter(onCollapseBottomPadding, "onCollapseBottomPadding");
        this.animationDuration = j11;
        Animation applyDefaultSettings = applyDefaultSettings(new AlphaAnimation(0.0f, 1.0f));
        this.expandAlphaAnimation = applyDefaultSettings;
        Animation applyDefaultSettings2 = applyDefaultSettings(new AlphaAnimation(1.0f, 0.0f));
        this.collapseAlphaAnimation = applyDefaultSettings2;
        Animation applyDefaultSettings3 = applyDefaultSettings(new InvokeAnimated(onExpandItemsList));
        this.heightExpandAnimation = applyDefaultSettings3;
        Animation applyDefaultSettings4 = applyDefaultSettings(new InvokeAnimated(onCollapseItemsList));
        this.heightCollapseAnimation = applyDefaultSettings4;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(applyDefaultSettings);
        animationSet.addAnimation(applyDefaultSettings3);
        this.expandItemsListAnimation = animationSet;
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(applyDefaultSettings2);
        animationSet2.addAnimation(applyDefaultSettings4);
        this.collapseItemsListAnimation = animationSet2;
        this.expandBottomPaddingAnimation = applyDefaultSettings(new InvokeAnimated(onExpandBottomPadding));
        this.collapseBottomPaddingAnimation = applyDefaultSettings(new InvokeAnimated(onCollapseBottomPadding));
    }

    private final Animation applyDefaultSettings(Animation animation) {
        animation.setDuration(this.animationDuration);
        animation.setInterpolator(new AccelerateDecelerateInterpolator());
        animation.setFillAfter(true);
        animation.setFillEnabled(true);
        return animation;
    }

    @NotNull
    public final Animation getCollapseBottomPaddingAnimation() {
        return this.collapseBottomPaddingAnimation;
    }

    @NotNull
    public final AnimationSet getCollapseItemsListAnimation() {
        return this.collapseItemsListAnimation;
    }

    @NotNull
    public final Animation getExpandBottomPaddingAnimation() {
        return this.expandBottomPaddingAnimation;
    }

    @NotNull
    public final AnimationSet getExpandItemsListAnimation() {
        return this.expandItemsListAnimation;
    }
}
