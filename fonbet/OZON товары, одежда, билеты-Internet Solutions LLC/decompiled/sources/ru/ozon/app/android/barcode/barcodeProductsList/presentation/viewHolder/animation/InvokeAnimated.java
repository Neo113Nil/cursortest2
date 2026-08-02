package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.animation;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/animation/InvokeAnimated;", "Landroid/view/animation/Animation;", "onAnimate", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "applyTransformation", "interpolatedTime", "transformation", "Landroid/view/animation/Transformation;", "willChangeBounds", "", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InvokeAnimated extends Animation {

    @NotNull
    private final Function1<Float, Unit> onAnimate;

    /* JADX WARN: Multi-variable type inference failed */
    public InvokeAnimated(@NotNull Function1<? super Float, Unit> onAnimate) {
        Intrinsics.checkNotNullParameter(onAnimate, "onAnimate");
        this.onAnimate = onAnimate;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float interpolatedTime, Transformation transformation) {
        this.onAnimate.invoke(Float.valueOf(interpolatedTime));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
