package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.ContextExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/presentation/InnerIslandBackgroundDrawable;", "Landroid/graphics/drawable/DrawableWrapper;", "context", "Landroid/content/Context;", "innerColor", "", "outerColor", "<init>", "(Landroid/content/Context;II)V", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "requireDrawable", "Landroid/graphics/drawable/LayerDrawable;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InnerIslandBackgroundDrawable extends DrawableWrapper {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InnerIslandBackgroundDrawable(@NotNull Context context, int i11, int i12) {
        super(r3);
        Drawable inflateWrappedDrawable;
        Intrinsics.checkNotNullParameter(context, "context");
        inflateWrappedDrawable = InnerIslandBackgroundDrawableKt.inflateWrappedDrawable(context);
        LayerDrawable requireDrawable = requireDrawable();
        requireDrawable.mutate();
        Drawable drawable = requireDrawable.getDrawable(1);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) drawable).setColor(i11);
        Drawable drawable2 = requireDrawable.getDrawable(0);
        Intrinsics.g(drawable2, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
        ((ColorDrawable) drawable2).setColor(i12);
    }

    private final LayerDrawable requireDrawable() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            return (LayerDrawable) drawable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InnerIslandBackgroundDrawable(@NotNull Context context, @NotNull String innerColor, @NotNull String outerColor) {
        this(context, ContextExtKt.parseColor(context, innerColor), ContextExtKt.parseColor(context, outerColor));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(innerColor, "innerColor");
        Intrinsics.checkNotNullParameter(outerColor, "outerColor");
    }
}
