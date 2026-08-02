package ru.ozon.app.android.favorites.accesscontrol.presentation.author.view;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.accesscontrol.presentation.author.AuthorImageVO;
import ru.ozon.app.android.favorites.feature.R$drawable;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0012*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0012*\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u0012*\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\n*\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00122\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/author/view/AuthorImageStackView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Bitmap;", "createBitmapForAva", "()Landroid/graphics/Bitmap;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;", "item", "createAuthorAvatar", "(Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;)Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "", "loadImage", "(Landroid/widget/ImageView;Lru/ozon/app/android/favorites/accesscontrol/presentation/author/AuthorImageVO;)V", "Landroid/graphics/Canvas;", "drawBackgroundCircle", "(Landroid/graphics/Canvas;)V", "drawPlaceholderCircle", "Landroid/graphics/drawable/Drawable;", "resource", "drawImage", "(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;)V", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "", "images", "bind", "(Ljava/util/List;)V", "Landroid/graphics/Paint;", "backgroundCircle$delegate", "LSc/j;", "getBackgroundCircle", "()Landroid/graphics/Paint;", "backgroundCircle", "placeholderCircle$delegate", "getPlaceholderCircle", "placeholderCircle", "canvas", "Landroid/graphics/Canvas;", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AuthorImageStackView extends FrameLayout {
    private static final int IMAGE_BORDER_SIZE;
    private static final int IMAGE_OFFSET;
    private static final int IMAGE_PADDED_SIZE;
    private static final int IMAGE_SIZE;

    /* renamed from: backgroundCircle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundCircle;

    @NotNull
    private final Canvas canvas;

    /* renamed from: placeholderCircle$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j placeholderCircle;

    static {
        int px = ResourceExtKt.toPx(32);
        IMAGE_SIZE = px;
        int px2 = ResourceExtKt.toPx(2);
        IMAGE_BORDER_SIZE = px2;
        IMAGE_PADDED_SIZE = (px2 * 2) + px;
        IMAGE_OFFSET = px - (px2 * 2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AuthorImageStackView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final FrameLayout createAuthorAvatar(AuthorImageVO item) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        Bitmap createBitmapForAva = createBitmapForAva();
        this.canvas.setBitmap(createBitmapForAva);
        drawBackgroundCircle(this.canvas);
        imageView.setImageBitmap(createBitmapForAva);
        int i11 = IMAGE_PADDED_SIZE;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
        layoutParams.gravity = 17;
        Unit unit = Unit.f71690a;
        frameLayout.addView(imageView, layoutParams);
        String initials = item.getInitials();
        if (initials == null || initials.length() == 0) {
            loadImage(imageView, item);
            return frameLayout;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setText(item.getInitials());
        appCompatTextView.setTextAppearance(R$style.TextStyle_Caption_Bold_White);
        appCompatTextView.setGravity(17);
        appCompatTextView.setBackgroundResource(R$drawable.bg_author_initials);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        frameLayout.addView(appCompatTextView, layoutParams2);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createBitmapForAva() {
        int i11 = IMAGE_PADDED_SIZE;
        Bitmap createBitmap = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawBackgroundCircle(Canvas canvas) {
        int i11 = IMAGE_PADDED_SIZE;
        canvas.drawCircle(i11 / 2.0f, i11 / 2.0f, i11 / 2.0f, getBackgroundCircle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawImage(Canvas canvas, Drawable drawable) {
        if (drawable == null) {
            drawPlaceholderCircle(canvas);
            return;
        }
        Bitmap bitmap = toBitmap(drawable);
        int i11 = IMAGE_SIZE;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        int i12 = IMAGE_BORDER_SIZE;
        canvas.drawBitmap(createScaledBitmap, i12, i12, (Paint) null);
    }

    private final void drawPlaceholderCircle(Canvas canvas) {
        int i11 = IMAGE_PADDED_SIZE;
        canvas.drawCircle(i11 / 2.0f, i11 / 2.0f, IMAGE_SIZE / 2.0f, getPlaceholderCircle());
    }

    private final Paint getBackgroundCircle() {
        return (Paint) this.backgroundCircle.getValue();
    }

    private final Paint getPlaceholderCircle() {
        return (Paint) this.placeholderCircle.getValue();
    }

    private final void loadImage(ImageView imageView, AuthorImageVO authorImageVO) {
        imageView.setVisibility(8);
        ImageViewExtKt.load$default(imageView, authorImageVO.getImage(), C7714v.a0(ImageTransformation.CircleCrop.INSTANCE), new AuthorImageStackView$loadImage$1(this, imageView), null, null, false, null, 120, null);
    }

    private final Bitmap toBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        Bitmap createBitmap = (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.f(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public final void bind(@NotNull List<AuthorImageVO> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        removeAllViews();
        if (images.size() == 1) {
            FrameLayout createAuthorAvatar = createAuthorAvatar((AuthorImageVO) C7714v.K(images));
            int i11 = IMAGE_PADDED_SIZE;
            addView(createAuthorAvatar, new FrameLayout.LayoutParams(i11, i11));
            return;
        }
        int i12 = 0;
        for (Object obj : images) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            FrameLayout createAuthorAvatar2 = createAuthorAvatar((AuthorImageVO) obj);
            int i14 = IMAGE_PADDED_SIZE;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i14, i14);
            layoutParams.setMarginStart(i12 != 0 ? IMAGE_OFFSET * i12 : 0);
            Unit unit = Unit.f71690a;
            addView(createAuthorAvatar2, 0, layoutParams);
            i12 = i13;
        }
    }

    public /* synthetic */ AuthorImageStackView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorImageStackView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundCircle = k.b(new AuthorImageStackView$backgroundCircle$2(context));
        this.placeholderCircle = k.b(new AuthorImageStackView$placeholderCircle$2(context));
        this.canvas = new Canvas();
    }
}
