package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.animation;

import android.view.animation.RotateAnimation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/animation/HeaderCellAnimationManager;", "", "animationDuration", "", "<init>", "(J)V", "rotateToDown", "Landroid/view/animation/RotateAnimation;", "getRotateToDown", "()Landroid/view/animation/RotateAnimation;", "rotateToUp", "getRotateToUp", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HeaderCellAnimationManager {
    private final long animationDuration;

    @NotNull
    private final RotateAnimation rotateToDown;

    @NotNull
    private final RotateAnimation rotateToUp;

    public HeaderCellAnimationManager(long j11) {
        this.animationDuration = j11;
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(j11);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setFillBefore(true);
        rotateAnimation.setFillEnabled(true);
        this.rotateToDown = rotateAnimation;
        RotateAnimation rotateAnimation2 = new RotateAnimation(180.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(j11);
        rotateAnimation2.setFillAfter(true);
        rotateAnimation2.setFillBefore(true);
        rotateAnimation2.setFillEnabled(true);
        this.rotateToUp = rotateAnimation2;
    }

    @NotNull
    public final RotateAnimation getRotateToDown() {
        return this.rotateToDown;
    }

    @NotNull
    public final RotateAnimation getRotateToUp() {
        return this.rotateToUp;
    }
}
