package ru.ozon.app.android.travel.molecules.utils;

import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/molecules/utils/RoundedFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerRadius", "", "reusablePath", "Landroid/graphics/Path;", "reusableRect", "Landroid/graphics/RectF;", "setCornerRadius", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedFrameLayout extends FrameLayout {
    private float cornerRadius;

    @NotNull
    private final Path reusablePath;

    @NotNull
    private final RectF reusableRect;

    public /* synthetic */ RoundedFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void setCornerRadius(float cornerRadius) {
        if (this.cornerRadius == cornerRadius) {
            return;
        }
        this.cornerRadius = cornerRadius;
        invalidateOutline();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.reusablePath = new Path();
        this.reusableRect = new RectF();
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.molecules.utils.RoundedFrameLayout.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (C3143a.f(view, "view", outline, "outline") == 0 || view.getHeight() == 0) {
                    outline.setEmpty();
                    return;
                }
                RoundedFrameLayout.this.reusablePath.reset();
                RoundedFrameLayout.this.reusableRect.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
                RoundedFrameLayout.this.reusablePath.addRoundRect(RoundedFrameLayout.this.reusableRect, new float[]{RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius, RoundedFrameLayout.this.cornerRadius}, Path.Direction.CW);
                outline.setConvexPath(RoundedFrameLayout.this.reusablePath);
            }
        });
    }
}
