package ru.ozon.app.android.marketing.common.coupon;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.view.image.ForegroundImageView;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0011J\f\u0010\u0018\u001a\u00020\u0013*\u00020\u0015H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/marketing/common/coupon/AdultProductPreview;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "backgroundD", "Landroid/graphics/drawable/Drawable;", "adultD", "imageView", "Lru/ozon/app/android/uikit/view/image/ForegroundImageView;", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "draw", "", "canvas", "Landroid/graphics/Canvas;", "showAdult", "adult", "drawAdultContainer", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdultProductPreview extends FrameLayout {
    private final Drawable adultD;
    private final Drawable backgroundD;

    @NotNull
    private final ForegroundImageView imageView;
    private boolean isAdult;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdultProductPreview(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawAdultContainer(Canvas canvas) {
        Drawable drawable = this.backgroundD;
        if (drawable != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.adultD;
        if (drawable2 != null) {
            canvas.translate((getMeasuredWidth() - drawable2.getIntrinsicWidth()) / 2.0f, (getMeasuredHeight() - drawable2.getIntrinsicHeight()) / 2.0f);
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        if (this.isAdult) {
            drawAdultContainer(canvas);
        }
    }

    @NotNull
    /* renamed from: imageView, reason: from getter */
    public final ForegroundImageView getImageView() {
        return this.imageView;
    }

    public final void showAdult(boolean adult) {
        if (this.isAdult == adult) {
            return;
        }
        this.isAdult = adult;
        invalidate();
    }

    public /* synthetic */ AdultProductPreview(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultProductPreview(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundD = context.getDrawable(R$drawable.bg_all_corners_rounded_adult);
        this.adultD = context.getDrawable(R$drawable.ic_adult);
        ForegroundImageView foregroundImageView = new ForegroundImageView(context, null, 0, 6, null);
        foregroundImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        foregroundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.imageView = foregroundImageView;
        setWillNotDraw(false);
        addView(foregroundImageView);
    }
}
