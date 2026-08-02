package ru.ozon.fintech.ui.thumb;

import C.D;
import E30.g;
import V5.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.bumptech.glide.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/thumb/ThumbView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "imageView", "Landroid/widget/ImageView;", "borderView", "Landroid/view/View;", "state", "Lru/ozon/fintech/ui/thumb/ThumbState;", "animatingSelected", "", "animatingUnSelected", "loadedBase64Key", "", "bindState", "", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThumbView extends FrameLayout {
    private static final long ANIMATION_DURATION = 230;
    private static final float BORDER_UNSELECTED_SCALE_FACTOR = 0.9f;
    public static final float IMAGE_RADIUS = 8.0f;
    private static final float IMAGE_SELECTED_SCALE_FACTOR = 0.87f;
    public static final float THUMB_FULL_SIZE = 56.0f;
    public static final float THUMB_IMAGE_SIZE = 52.0f;
    public static final float THUMB_MID_OFFSET = 2.0f;
    public static final float THUMB_START_OFFSET = 16.0f;
    private boolean animatingSelected;
    private boolean animatingUnSelected;

    @NotNull
    private final View borderView;

    @NotNull
    private final ImageView imageView;
    private String loadedBase64Key;
    private ThumbState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ThumbView thumbView, View view) {
        ThumbState thumbState = thumbView.state;
        Function1<Integer, Unit> onClick = thumbState != null ? thumbState.getOnClick() : null;
        ThumbState thumbState2 = thumbView.state;
        g.a(new a(), onClick, thumbState2 != null ? Integer.valueOf(thumbState2.getIndex()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$4$lambda$3(Function1 onClick, int i11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        onClick.invoke(Integer.valueOf(i11));
        return Unit.f71690a;
    }

    public final void bindState(@NotNull final ThumbState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        if (state.getUrl() != null) {
            ImageViewExtKt.load$default(this.imageView, state.getUrl(), null, null, null, null, false, null, 126, null);
        }
        if (state.getBase64() != null && !Intrinsics.d(this.loadedBase64Key, state.getBase64Key())) {
            byte[] decode = Base64.decode(state.getBase64(), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            c.n(getContext()).asBitmap().load(decode).listener(new h<Bitmap>() { // from class: ru.ozon.fintech.ui.thumb.ThumbView$bindState$1
                @Override // l6.h
                public boolean onLoadFailed(q e11, Object model, m6.h<Bitmap> target, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    ThumbView.this.loadedBase64Key = null;
                    return false;
                }

                @Override // l6.h
                public boolean onResourceReady(Bitmap resource, Object model, m6.h<Bitmap> target, T5.a dataSource, boolean isFirstResource) {
                    Intrinsics.checkNotNullParameter(resource, "resource");
                    Intrinsics.checkNotNullParameter(model, "model");
                    Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                    ThumbView.this.loadedBase64Key = state.getBase64Key();
                    return false;
                }
            }).into(this.imageView);
        }
        if (state.getSelected()) {
            if (!this.animatingSelected) {
                this.animatingSelected = true;
                this.animatingUnSelected = false;
                this.imageView.animate().scaleX(IMAGE_SELECTED_SCALE_FACTOR).scaleY(IMAGE_SELECTED_SCALE_FACTOR).setInterpolator(new OvershootInterpolator()).setDuration(ANIMATION_DURATION).start();
                this.borderView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(new DecelerateInterpolator()).setDuration(ANIMATION_DURATION).start();
            }
        } else if (!this.animatingUnSelected) {
            this.animatingUnSelected = true;
            this.animatingSelected = false;
            this.imageView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(ANIMATION_DURATION).start();
            this.borderView.animate().alpha(0.0f).scaleX(BORDER_UNSELECTED_SCALE_FACTOR).scaleY(BORDER_UNSELECTED_SCALE_FACTOR).setInterpolator(new DecelerateInterpolator()).setDuration(ANIMATION_DURATION).start();
        }
        this.imageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.thumb.ThumbView$bindState$2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ImageView imageView;
                ImageView imageView2;
                if (view == null || outline == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return;
                }
                imageView = ThumbView.this.imageView;
                int width = imageView.getWidth();
                imageView2 = ThumbView.this.imageView;
                outline.setRoundRect(0, 0, width, imageView2.getHeight(), D.c(8.0f));
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThumbView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ThumbView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(D.c(56.0f), D.c(56.0f));
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(D.c(52.0f), D.c(52.0f));
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView);
        View view = new View(context);
        this.borderView = view;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(D.c(56.0f), D.c(56.0f));
        layoutParams3.gravity = 17;
        view.setLayoutParams(layoutParams3);
        view.setForeground(androidx.core.content.a.getDrawable(context, R.drawable.background_rounded_stroke_ozon_blue_10));
        view.setAlpha(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        addView(view);
        setClickable(true);
        setFocusable(true);
        setTag("ThumbView");
        setOnClickListener(new FM.a(this, 17));
        imageView.setClipToOutline(true);
    }
}
