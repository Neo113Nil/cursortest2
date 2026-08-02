package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import Bi.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.data.TransparentNavBarV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2AnimationManager;
import ru.ozon.app.android.travel.utils.viewGroup.TouchEventsThiefFrameLayout;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J$\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ$\u0010\u001b\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\fJ\u0014\u0010\u001d\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0014\u0010\u001e\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J \u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\f\u0010&\u001a\u00020%*\u00020#H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/TransparentNavBarV2AnimationManager;", "", "<init>", "()V", "valueAnimator", "Landroid/animation/ValueAnimator;", "buttonColorsWithBackground", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/presentation/AnimationColors;", "buttonColorsWithoutBackground", "isFavorite", "", "updateFavoriteInfo", "", "bindColors", "context", "Landroid/content/Context;", "buttonIconColors", "Lru/ozon/app/android/travel/feature/hotels/widgets/transparentNavBar/v2/data/TransparentNavBarV2DTO$ButtonsColors;", "buttonShapeColors", "setTransparentMode", "views", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", HammersV3BodyDTO.PLACEHOLDER, "Landroid/view/ViewGroup;", "background", "Landroid/graphics/drawable/GradientDrawable;", "setOpaqueMode", "cancelAnimation", "setTransparentButtonsMode", "setOpaqueButtonsMode", "colorButtons", "newColors", "setPlaceholderAlpha", "fraction", "", "setBackgroundAlpha", "", "mapToIntAlpha", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransparentNavBarV2AnimationManager {
    private AnimationColors buttonColorsWithBackground;
    private AnimationColors buttonColorsWithoutBackground;
    private boolean isFavorite;
    private ValueAnimator valueAnimator;
    public static final int $stable = 8;

    private final void colorButtons(AnimationColors newColors, Sequence<? extends View> views) {
        if (newColors == null) {
            return;
        }
        for (View view : views) {
            if (view instanceof IconButtonV3View) {
                IconButtonV3View iconButtonV3View = (IconButtonV3View) view;
                iconButtonV3View.setIconColor(newColors.getIconColor());
                iconButtonV3View.setBackColor(new Color.Solid(newColors.getBackgroundColor()));
            } else if (view instanceof TouchEventsThiefFrameLayout) {
                View childAt = ((TouchEventsThiefFrameLayout) view).getChildAt(0);
                if (childAt instanceof ProductFavoriteMoleculeV4ButtonView) {
                    Iterator<View> it = C5316f0.b((ViewGroup) childAt).iterator();
                    while (true) {
                        C5314e0 c5314e0 = (C5314e0) it;
                        if (c5314e0.hasNext()) {
                            View view2 = (View) c5314e0.next();
                            if (view2 instanceof IconButtonV3View) {
                                if (!this.isFavorite) {
                                    ((IconButtonV3View) view2).setIconColor(newColors.getIconColor());
                                }
                                ((IconButtonV3View) view2).setBackColor(new Color.Solid(newColors.getBackgroundColor()));
                            }
                        }
                    }
                }
            }
        }
    }

    private final int mapToIntAlpha(float f7) {
        return (int) ((((f7 - 0.0f) * 255) / 1.0f) + 0);
    }

    private final void setBackgroundAlpha(int fraction, GradientDrawable background) {
        background.setAlpha(fraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOpaqueMode$lambda$5$lambda$3(TransparentNavBarV2AnimationManager transparentNavBarV2AnimationManager, ViewGroup viewGroup, GradientDrawable gradientDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        transparentNavBarV2AnimationManager.setPlaceholderAlpha(floatValue, viewGroup);
        transparentNavBarV2AnimationManager.setBackgroundAlpha(transparentNavBarV2AnimationManager.mapToIntAlpha(floatValue), gradientDrawable);
    }

    private final void setPlaceholderAlpha(float fraction, ViewGroup placeholder) {
        placeholder.setAlpha(fraction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransparentMode$lambda$2$lambda$0(TransparentNavBarV2AnimationManager transparentNavBarV2AnimationManager, ViewGroup viewGroup, GradientDrawable gradientDrawable, ValueAnimator valueAnimator) {
        float floatValue = ((Float) a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        transparentNavBarV2AnimationManager.setPlaceholderAlpha(floatValue, viewGroup);
        transparentNavBarV2AnimationManager.setBackgroundAlpha(transparentNavBarV2AnimationManager.mapToIntAlpha(floatValue), gradientDrawable);
    }

    public final void bindColors(@NotNull Context context, TransparentNavBarV2DTO.ButtonsColors buttonIconColors, TransparentNavBarV2DTO.ButtonsColors buttonShapeColors) {
        Intrinsics.checkNotNullParameter(context, "context");
        StyleParser styleParser = StyleParser.INSTANCE;
        this.buttonColorsWithBackground = new AnimationColors(styleParser.parseColor(context, buttonIconColors != null ? buttonIconColors.getWithBackground() : null, UniColors.GRAPHIC_TERTIARY.getResId()), styleParser.parseColor(context, buttonShapeColors != null ? buttonShapeColors.getWithBackground() : null, UniColors.CLEAR_LIGHT_KEY_0.getResId()));
        this.buttonColorsWithoutBackground = new AnimationColors(styleParser.parseColor(context, buttonIconColors != null ? buttonIconColors.getWithoutBackground() : null, UniColors.GRAPHIC_TERTIARY_ON_LIGHT.getResId()), styleParser.parseColor(context, buttonShapeColors != null ? buttonShapeColors.getWithoutBackground() : null, UniColors.GRAPHIC_PRIMARY_ON_DARK.getResId()));
    }

    public final void cancelAnimation() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueAnimator = null;
    }

    public final void setOpaqueButtonsMode(@NotNull Sequence<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        colorButtons(this.buttonColorsWithBackground, views);
    }

    public final void setOpaqueMode(@NotNull Sequence<? extends View> views, @NotNull final ViewGroup placeholder, @NotNull final GradientDrawable background) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(background, "background");
        if (background.getAlpha() == 255) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(500L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: LS.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TransparentNavBarV2AnimationManager.setOpaqueMode$lambda$5$lambda$3(TransparentNavBarV2AnimationManager.this, placeholder, background, valueAnimator);
            }
        });
        duration.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2AnimationManager$setOpaqueMode$lambda$5$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                placeholder.setVisibility(0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        duration.start();
        this.valueAnimator = duration;
        colorButtons(this.buttonColorsWithBackground, views);
    }

    public final void setTransparentButtonsMode(@NotNull Sequence<? extends View> views) {
        Intrinsics.checkNotNullParameter(views, "views");
        colorButtons(this.buttonColorsWithoutBackground, views);
    }

    public final void setTransparentMode(@NotNull Sequence<? extends View> views, @NotNull final ViewGroup placeholder, @NotNull final GradientDrawable background) {
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(background, "background");
        if (background.getAlpha() == 0) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(500L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: LS.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TransparentNavBarV2AnimationManager.setTransparentMode$lambda$2$lambda$0(TransparentNavBarV2AnimationManager.this, placeholder, background, valueAnimator);
            }
        });
        duration.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2AnimationManager$setTransparentMode$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                placeholder.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        duration.start();
        this.valueAnimator = duration;
        colorButtons(this.buttonColorsWithoutBackground, views);
    }

    public final void updateFavoriteInfo(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }
}
