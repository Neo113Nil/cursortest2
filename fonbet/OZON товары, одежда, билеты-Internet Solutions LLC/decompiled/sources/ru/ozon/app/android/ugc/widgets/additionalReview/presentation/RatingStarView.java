package ru.ozon.app.android.ugc.widgets.additionalReview.presentation;

import Sc.InterfaceC4008j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.ugc.widgets.additionalReview.presentation.RatingStarView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R*\u0010\n\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\rR0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReview/presentation/RatingStarView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rating", "", "updateRatingStars", "(I)V", "starIndex", "Landroid/widget/ImageView;", "star", "setupStarImage", "(IILandroid/widget/ImageView;)V", "view", "Landroid/animation/Animator;", "createAnimator", "(Landroid/widget/ImageView;)Landroid/animation/Animator;", "runAnimation", "()V", "starSize", "I", "horizontalSpace", "verticalSpace", "iconStarRes", "Landroid/graphics/drawable/Drawable;", "filledStar$delegate", "LSc/j;", "getFilledStar", "()Landroid/graphics/drawable/Drawable;", "filledStar", "emptyStar", "Landroid/graphics/drawable/Drawable;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getRating", "()I", "setRating", "Lkotlin/Function1;", "onStarClick", "Lkotlin/jvm/functions/Function1;", "getOnStarClick", "()Lkotlin/jvm/functions/Function1;", "setOnStarClick", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RatingStarView extends LinearLayout {
    private final Drawable emptyStar;

    /* renamed from: filledStar$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j filledStar;
    private final int horizontalSpace;
    private final int iconStarRes;
    private Function1<? super Integer, Unit> onStarClick;
    private int rating;
    private final int starSize;
    private final int verticalSpace;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingStarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Animator createAnimator(ImageView view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, -20.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        return ofFloat;
    }

    private final Drawable getFilledStar() {
        return (Drawable) this.filledStar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(RatingStarView ratingStarView, int i11, View view) {
        ratingStarView.setRating(i11);
        Function1<? super Integer, Unit> function1 = ratingStarView.onStarClick;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i11));
        }
    }

    private final void setupStarImage(int rating, int starIndex, ImageView star) {
        if (rating < starIndex) {
            star.setImageDrawable(this.emptyStar);
        } else {
            star.setImageDrawable(getFilledStar());
        }
    }

    private final void updateRatingStars(int rating) {
        int i11 = 0;
        for (View view : ViewGroupExtKt.children(this)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = view;
            ImageView imageView = view2 instanceof ImageView ? (ImageView) view2 : null;
            if (imageView != null) {
                setupStarImage(rating, i12, imageView);
            }
            i11 = i12;
        }
    }

    public final void runAnimation() {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (View view : ViewGroupExtKt.children(this)) {
            ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
            if (imageView != null) {
                arrayList.add(createAnimator(imageView));
            }
        }
        animatorSet.playSequentially(arrayList);
        animatorSet.start();
    }

    public final void setOnStarClick(Function1<? super Integer, Unit> function1) {
        this.onStarClick = function1;
    }

    public final void setRating(int i11) {
        this.rating = i11;
        updateRatingStars(i11);
    }

    public /* synthetic */ RatingStarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingStarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.starSize = ResourceExtKt.toPx(32);
        this.horizontalSpace = ResourceExtKt.toPx(4);
        this.verticalSpace = ResourceExtKt.toPx(4);
        int i12 = R$drawable.ic_m_star_filled;
        this.iconStarRes = i12;
        this.filledStar = DelegatesKt.lazyUnsafe(new RatingStarView$filledStar$2(this, context));
        Drawable a11 = C7232a.a(context, i12);
        if (a11 != null) {
            Drawable mutate = a11.mutate();
            Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
            androidx.core.graphics.drawable.a.i(mutate, ThemeExtKt.themeColor(context, R$attr.layerActiveSurface));
        } else {
            a11 = null;
        }
        this.emptyStar = a11;
        final int i13 = 1;
        while (i13 < 6) {
            ImageView imageView = new ImageView(context);
            int i14 = this.starSize;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i14, i14);
            int i15 = i13 == 1 ? 0 : this.horizontalSpace;
            int i16 = this.verticalSpace;
            marginLayoutParams.setMargins(i15, i16, 0, i16);
            imageView.setLayoutParams(marginLayoutParams);
            setupStarImage(this.rating, i13, imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: TV.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RatingStarView.lambda$4$lambda$3(RatingStarView.this, i13, view);
                }
            });
            addView(imageView);
            i13++;
        }
    }
}
