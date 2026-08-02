package ru.ozon.fintech.ui.utils;

import C.D;
import CX.b;
import L30.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import na.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.shimmer.ShimmerDrawable;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\"\u0010\b\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\"\u0010\f\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\u000f"}, d2 = {"applyClickListener", "", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "common", "Lru/ozon/fintech/ui/utils/Common;", "oldCommon", "customView", "Landroid/view/View;", "setForegroundShimmer", "paddingFrameLayout", "drawable", "Landroid/graphics/drawable/Drawable;", "setForegroundStroke", "applyCbottomLayoutParams", "applyCbottomBackground", "fintech-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomExtKt {
    public static final void applyCbottomBackground(@NotNull WidgetFrameLayout widgetFrameLayout, Common common, Common common2) {
        char c11;
        char c12;
        char c13;
        Float alpha;
        int i11 = 1;
        Intrinsics.checkNotNullParameter(widgetFrameLayout, "<this>");
        if (Intrinsics.d(common != null ? common.getBackgroundRadius() : null, common2 != null ? common2.getBackgroundRadius() : null)) {
            if (Intrinsics.d(common != null ? common.getBackgroundColor() : null, common2 != null ? common2.getBackgroundColor() : null)) {
                if (Intrinsics.d(common != null ? common.getSkeletonable() : null, common2 != null ? common2.getSkeletonable() : null)) {
                    if (Intrinsics.d(common != null ? common.getBackgroundGradient() : null, common2 != null ? common2.getBackgroundGradient() : null)) {
                        if ((common != null ? common.getBackgroundGradientOrientation() : null) == (common2 != null ? common2.getBackgroundGradientOrientation() : null)) {
                            if (Intrinsics.d(common != null ? common.getStrokeColor() : null, common2 != null ? common2.getStrokeColor() : null)) {
                                if (Intrinsics.d(common != null ? common.getStrokeWidth() : null, common2 != null ? common2.getStrokeWidth() : null)) {
                                    if (Intrinsics.d(common != null ? common.getDashWidth() : null, common2 != null ? common2.getDashWidth() : null)) {
                                        if (Intrinsics.d(common != null ? common.getDashGap() : null, common2 != null ? common2.getDashGap() : null)) {
                                            if (Intrinsics.c(common != null ? common.getAlpha() : null, common2 != null ? common2.getAlpha() : null)) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        if ((common != null ? common.getBackgroundColor() : null) != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = widgetFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c11 = 7;
            Integer parseColor = styleParser.parseColor(context, common.getBackgroundColor());
            if (parseColor != null) {
                gradientDrawable.setColor(parseColor.intValue());
            }
        } else {
            c11 = 7;
        }
        if ((common != null ? common.getBackgroundGradient() : null) != null) {
            List<String> backgroundGradient = common.getBackgroundGradient();
            ArrayList arrayList = new ArrayList(C7714v.z(backgroundGradient, 10));
            for (String str : backgroundGradient) {
                StyleParser styleParser2 = StyleParser.INSTANCE;
                Context context2 = widgetFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                arrayList.add(styleParser2.parseColor(context2, str));
            }
            c12 = 6;
            c13 = 5;
            ArrayList I11 = C7714v.I(arrayList);
            if (I11.size() >= 2) {
                Stream stream = I11.stream();
                final d dVar = new d(i11);
                gradientDrawable.setColors(stream.mapToInt(new ToIntFunction() { // from class: ru.ozon.fintech.ui.utils.a
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        int applyCbottomBackground$lambda$6;
                        applyCbottomBackground$lambda$6 = CbottomExtKt.applyCbottomBackground$lambda$6(d.this, obj);
                        return applyCbottomBackground$lambda$6;
                    }
                }).toArray());
                if (common.getBackgroundGradientOrientation() != null) {
                    gradientDrawable.setOrientation(common.getBackgroundGradientOrientation());
                }
            }
        } else {
            c12 = 6;
            c13 = 5;
        }
        if ((common != null ? common.getBackgroundRadius() : null) != null) {
            float d11 = D.d(common.getBackgroundRadius().get(0).intValue());
            float d12 = D.d(common.getBackgroundRadius().get(1).intValue());
            float d13 = D.d(common.getBackgroundRadius().get(2).intValue());
            float d14 = D.d(common.getBackgroundRadius().get(3).intValue());
            float[] fArr = new float[8];
            fArr[0] = d11;
            fArr[1] = d11;
            fArr[2] = d12;
            fArr[3] = d12;
            fArr[4] = d13;
            fArr[c13] = d13;
            fArr[c12] = d14;
            fArr[c11] = d14;
            gradientDrawable.setCornerRadii(fArr);
            float[] fArr2 = new float[8];
            fArr2[0] = d11;
            fArr2[1] = d11;
            fArr2[2] = d12;
            fArr2[3] = d12;
            fArr2[4] = d13;
            fArr2[c13] = d13;
            fArr2[c12] = d14;
            fArr2[c11] = d14;
            gradientDrawable2.setCornerRadii(fArr2);
        }
        if ((common != null ? common.getStrokeWidth() : null) != null) {
            if ((common != null ? common.getStrokeColor() : null) != null) {
                StyleParser styleParser3 = StyleParser.INSTANCE;
                Context context3 = widgetFrameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                Integer parseColor2 = styleParser3.parseColor(context3, common != null ? common.getStrokeColor() : null);
                if (parseColor2 != null) {
                    gradientDrawable2.setStroke(D.d(common.getStrokeWidth().intValue()), parseColor2.intValue(), common.getDashWidth() != null ? D.d(r2.intValue()) : 0.0f, common.getDashGap() != null ? D.d(r4.intValue()) : 0.0f);
                }
            }
        }
        widgetFrameLayout.getPaddingFrameLayout().setBackground(new LayerDrawable(new GradientDrawable[]{gradientDrawable}));
        widgetFrameLayout.getPaddingFrameLayout().setAlpha((common == null || (alpha = common.getAlpha()) == null) ? 1.0f : alpha.floatValue());
        setForegroundStroke(null, widgetFrameLayout.getPaddingFrameLayout(), gradientDrawable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int applyCbottomBackground$lambda$5(Integer num) {
        Intrinsics.f(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int applyCbottomBackground$lambda$6(Function1 function1, Object obj) {
        return ((Number) function1.invoke(obj)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void applyCbottomLayoutParams(@NotNull WidgetFrameLayout widgetFrameLayout, Common common, Common common2) {
        int d11;
        LinearLayout.LayoutParams layoutParams;
        Float layoutWeight;
        List<Integer> layoutGravity;
        FlexboxLayoutManager.b bVar;
        List<Integer> layoutGravity2;
        Integer height;
        Integer num;
        Integer elevation;
        List<Integer> backgroundRadius;
        Rect margins;
        Rect margins2;
        Rect margins3;
        Rect margins4;
        Integer width;
        Intrinsics.checkNotNullParameter(widgetFrameLayout, "<this>");
        if (Intrinsics.d(common != null ? common.getWidth() : null, common2 != null ? common2.getWidth() : null)) {
            if (Intrinsics.d(common != null ? common.getHeight() : null, common2 != null ? common2.getHeight() : null)) {
                if (Intrinsics.d(common != null ? common.getMargins() : null, common2 != null ? common2.getMargins() : null)) {
                    if (Intrinsics.d(common != null ? common.getPaddings() : null, common2 != null ? common2.getPaddings() : null)) {
                        if (Intrinsics.d(common != null ? common.getBackgroundRadius() : null, common2 != null ? common2.getBackgroundRadius() : null)) {
                            if (Intrinsics.d(common != null ? common.getElevation() : null, common2 != null ? common2.getElevation() : null)) {
                                if (Intrinsics.d(common != null ? common.getLayoutGravity() : null, common2 != null ? common2.getLayoutGravity() : null)) {
                                    if (Intrinsics.c(common != null ? common.getLayoutWeight() : null, common2 != null ? common2.getLayoutWeight() : null)) {
                                        if (Intrinsics.d(common != null ? common.getRatioW() : null, common2 != null ? common2.getRatioW() : null)) {
                                            if (Intrinsics.d(common != null ? common.getRatioH() : null, common2 != null ? common2.getRatioH() : null)) {
                                                if (Intrinsics.c(common != null ? common.getPercentW() : null, common2 != null ? common2.getPercentW() : null)) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        float f7 = 0.0f;
        if ((common == null || (width = common.getWidth()) == null || width.intValue() != -3) && (common == null || (height = common.getHeight()) == null || height.intValue() != -3)) {
            ViewParent parent = widgetFrameLayout.getParent();
            Integer width2 = common != null ? common.getWidth() : null;
            int i11 = -2;
            if (width2 == null || width2.intValue() == -1) {
                d11 = -1;
            } else if (width2.intValue() == -2) {
                d11 = -2;
            } else {
                int d12 = D.d(common.getWidth().intValue());
                Rect margins5 = common.getMargins();
                int d13 = margins5 != null ? D.d(margins5.left) : 0;
                Rect margins6 = common.getMargins();
                d11 = d13 + (margins6 != null ? D.d(margins6.right) : 0) + d12;
            }
            Integer height2 = common != null ? common.getHeight() : null;
            if (height2 != null) {
                if (height2.intValue() == -1) {
                    i11 = -1;
                } else if (height2.intValue() != -2) {
                    int d14 = D.d(common.getHeight().intValue());
                    Rect margins7 = common.getMargins();
                    int d15 = margins7 != null ? D.d(margins7.top) : 0;
                    Rect margins8 = common.getMargins();
                    i11 = d15 + (margins8 != null ? D.d(margins8.bottom) : 0) + d14;
                }
            }
            if (parent instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(d11, i11);
                if (common == null || (layoutGravity2 = common.getLayoutGravity()) == null || layoutGravity2.size() != 2) {
                    layoutParams2.gravity = 8388659;
                    bVar = layoutParams2;
                } else {
                    layoutParams2.gravity = common.getLayoutGravity().get(0).intValue() | common.getLayoutGravity().get(1).intValue();
                    bVar = layoutParams2;
                }
            } else if (parent instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) parent;
                if (linearLayout.getOrientation() == 0) {
                    if ((common != null ? common.getLayoutWeight() : null) != null) {
                        d11 = 0;
                        layoutParams = new LinearLayout.LayoutParams(d11, i11);
                        if (common == null && (layoutGravity = common.getLayoutGravity()) != null && layoutGravity.size() == 2) {
                            layoutParams.gravity = common.getLayoutGravity().get(0).intValue() | common.getLayoutGravity().get(1).intValue();
                        } else {
                            layoutParams.gravity = 8388659;
                        }
                        layoutParams.weight = (common != null || (layoutWeight = common.getLayoutWeight()) == null) ? 0.0f : layoutWeight.floatValue();
                        bVar = layoutParams;
                    }
                }
                if (linearLayout.getOrientation() == 1) {
                    if ((common != null ? common.getLayoutWeight() : null) != null) {
                        i11 = 0;
                    }
                }
                layoutParams = new LinearLayout.LayoutParams(d11, i11);
                if (common == null) {
                }
                layoutParams.gravity = 8388659;
                layoutParams.weight = (common != null || (layoutWeight = common.getLayoutWeight()) == null) ? 0.0f : layoutWeight.floatValue();
                bVar = layoutParams;
            } else {
                bVar = new FlexboxLayoutManager.b(d11, i11);
            }
            widgetFrameLayout.setLayoutParams(bVar);
        }
        if ((common != null ? common.getMargins() : null) != null) {
            widgetFrameLayout.setPadding((common == null || (margins4 = common.getMargins()) == null) ? 0 : D.d(margins4.left), (common == null || (margins3 = common.getMargins()) == null) ? 0 : D.d(margins3.top), (common == null || (margins2 = common.getMargins()) == null) ? 0 : D.d(margins2.right), (common == null || (margins = common.getMargins()) == null) ? 0 : D.d(margins.bottom));
        } else {
            widgetFrameLayout.setPadding(0, 0, 0, 0);
        }
        if (common != null && (backgroundRadius = common.getBackgroundRadius()) != null && backgroundRadius.size() == 4) {
            List<Integer> backgroundRadius2 = common.getBackgroundRadius();
            if (!(backgroundRadius2 instanceof Collection) || !backgroundRadius2.isEmpty()) {
                Iterator<T> it = backgroundRadius2.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() == common.getBackgroundRadius().get(0).intValue()) {
                    }
                }
            }
            num = (Integer) C7714v.K(common.getBackgroundRadius());
            if (num != null) {
                widgetFrameLayout.getPaddingFrameLayout().setOutlineProvider(null);
                widgetFrameLayout.getPaddingFrameLayout().setClipToOutline(false);
            } else if (widgetFrameLayout.getPaddingFrameLayout().getOutlineProvider() == null) {
                widgetFrameLayout.getPaddingFrameLayout().setOutlineProvider(new c(num.intValue()));
                widgetFrameLayout.getPaddingFrameLayout().setClipToOutline(true);
            } else {
                ViewOutlineProvider outlineProvider = widgetFrameLayout.getPaddingFrameLayout().getOutlineProvider();
                c cVar = outlineProvider instanceof c ? (c) outlineProvider : null;
                if (!Intrinsics.d(cVar != null ? Integer.valueOf(cVar.a()) : null, num)) {
                    widgetFrameLayout.getPaddingFrameLayout().setOutlineProvider(new c(num.intValue()));
                    widgetFrameLayout.getPaddingFrameLayout().setClipToOutline(true);
                }
            }
            if ((common != null ? common.getPaddings() : null) == null) {
                widgetFrameLayout.getPaddingFrameLayout().setPadding(D.d(common.getPaddings().left), D.d(common.getPaddings().top), D.d(common.getPaddings().right), D.d(common.getPaddings().bottom));
            } else {
                widgetFrameLayout.getPaddingFrameLayout().setPadding(0, 0, 0, 0);
            }
            SafeDrawForegroundFrameLayout paddingFrameLayout = widgetFrameLayout.getPaddingFrameLayout();
            if (common != null && (elevation = common.getElevation()) != null) {
                f7 = D.d(elevation.intValue());
            }
            paddingFrameLayout.setElevation(f7);
        }
        num = null;
        if (num != null) {
        }
        if ((common != null ? common.getPaddings() : null) == null) {
        }
        SafeDrawForegroundFrameLayout paddingFrameLayout2 = widgetFrameLayout.getPaddingFrameLayout();
        if (common != null) {
            f7 = D.d(elevation.intValue());
        }
        paddingFrameLayout2.setElevation(f7);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void applyClickListener(@NotNull WidgetFrameLayout widgetFrameLayout, Common common, Common common2, View view) {
        Intrinsics.checkNotNullParameter(widgetFrameLayout, "<this>");
        if (Intrinsics.d(common != null ? common.getClickable() : null, common2 != null ? common2.getClickable() : null)) {
            if (Intrinsics.d(common != null ? common.getSkeletonable() : null, common2 != null ? common2.getSkeletonable() : null)) {
                if (Intrinsics.d(common != null ? common.getDisableHighlightAnimation() : null, common2 != null ? common2.getDisableHighlightAnimation() : null)) {
                    return;
                }
            }
        }
        View paddingFrameLayout = view == null ? widgetFrameLayout.getPaddingFrameLayout() : view;
        if (!(common != null ? Intrinsics.d(common.getClickable(), Boolean.TRUE) : false)) {
            paddingFrameLayout.setOnClickListener(null);
            paddingFrameLayout.setOnTouchListener(null);
            paddingFrameLayout.setClickable(false);
            if (!(common != null ? Intrinsics.d(common.getSkeletonable(), Boolean.TRUE) : false)) {
                setForegroundShimmer(view, widgetFrameLayout.getPaddingFrameLayout(), null);
                return;
            }
            SafeDrawForegroundFrameLayout paddingFrameLayout2 = widgetFrameLayout.getPaddingFrameLayout();
            Context context = widgetFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setForegroundShimmer(view, paddingFrameLayout2, new ShimmerDrawable(context));
            return;
        }
        paddingFrameLayout.setClickable(true);
        Drawable drawable = androidx.core.content.a.getDrawable(widgetFrameLayout.getContext(), R.drawable.fintech_ripple_rect_bluewave);
        Boolean touchDown = common.getTouchDown();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(touchDown, bool)) {
            paddingFrameLayout.setOnClickListener(null);
            paddingFrameLayout.setOnTouchListener(new b(widgetFrameLayout, 2));
        } else {
            paddingFrameLayout.setOnClickListener(widgetFrameLayout.getClickListener());
            paddingFrameLayout.setOnTouchListener(null);
        }
        if (Intrinsics.d(common.getSkeletonable(), bool)) {
            SafeDrawForegroundFrameLayout paddingFrameLayout3 = widgetFrameLayout.getPaddingFrameLayout();
            Context context2 = widgetFrameLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setForegroundShimmer(view, paddingFrameLayout3, new ShimmerDrawable(context2));
            return;
        }
        if (Intrinsics.d(common.getDisableHighlightAnimation(), bool)) {
            setForegroundShimmer(view, widgetFrameLayout.getPaddingFrameLayout(), null);
        } else {
            setForegroundShimmer(view, widgetFrameLayout.getPaddingFrameLayout(), drawable);
        }
    }

    public static /* synthetic */ void applyClickListener$default(WidgetFrameLayout widgetFrameLayout, Common common, Common common2, View view, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            view = null;
        }
        applyClickListener(widgetFrameLayout, common, common2, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean applyClickListener$lambda$0(WidgetFrameLayout widgetFrameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        widgetFrameLayout.getClickListener().onClick(view);
        view.setPressed(true);
        view.setPressed(false);
        return true;
    }

    public static final void setForegroundShimmer(View view, @NotNull View paddingFrameLayout, Drawable drawable) {
        Intrinsics.checkNotNullParameter(paddingFrameLayout, "paddingFrameLayout");
        if (view != null) {
            view.setForeground(drawable);
            return;
        }
        Drawable foreground = paddingFrameLayout.getForeground();
        LayerDrawable layerDrawable = foreground instanceof LayerDrawable ? (LayerDrawable) foreground : null;
        if (layerDrawable != null) {
            layerDrawable.setDrawable(0, drawable);
        }
    }

    public static final void setForegroundStroke(View view, @NotNull View paddingFrameLayout, Drawable drawable) {
        Intrinsics.checkNotNullParameter(paddingFrameLayout, "paddingFrameLayout");
        if (view != null) {
            view.setForeground(drawable);
            return;
        }
        Drawable foreground = paddingFrameLayout.getForeground();
        LayerDrawable layerDrawable = foreground instanceof LayerDrawable ? (LayerDrawable) foreground : null;
        if (layerDrawable != null) {
            layerDrawable.setDrawable(1, drawable);
        }
    }
}
