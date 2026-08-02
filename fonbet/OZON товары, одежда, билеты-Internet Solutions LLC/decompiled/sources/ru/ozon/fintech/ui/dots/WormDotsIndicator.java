package ru.ozon.fintech.ui.dots;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.dynamicanimation.animation.b;
import androidx.dynamicanimation.animation.d;
import androidx.dynamicanimation.animation.f;
import androidx.dynamicanimation.animation.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\u0018J\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0018J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/fintech/ui/dots/WormDotsIndicator;", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "setUpDotIndicator", "()V", "", "stroke", "Landroid/view/ViewGroup;", "buildDot", "(Z)Landroid/view/ViewGroup;", "Landroid/view/View;", "dotImageView", "setUpDotBackground", "(ZLandroid/view/View;)V", "index", "addDot", "(I)V", "refreshDotColor", "removeDot", "Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "buildOnPageChangedListener", "()Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "color", "setDotIndicatorColor", "setStrokeDotsIndicatorColor", "", "width", "setDotsStrokeWidth", "(F)V", "Landroid/widget/ImageView;", "dotIndicatorView", "Landroid/widget/ImageView;", "dotIndicatorLayout", "Landroid/view/View;", "dotsStrokeWidth", "F", "dotIndicatorColor", "I", "dotsStrokeColor", "Landroidx/dynamicanimation/animation/f;", "dotIndicatorXSpring", "Landroidx/dynamicanimation/animation/f;", "dotIndicatorWidthSpring", "Landroid/widget/LinearLayout;", "strokeDotsLinearLayout", "Landroid/widget/LinearLayout;", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "getType", "()Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "type", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WormDotsIndicator extends BaseDotsIndicator {
    private int dotIndicatorColor;
    private View dotIndicatorLayout;
    private ImageView dotIndicatorView;
    private f dotIndicatorWidthSpring;
    private f dotIndicatorXSpring;
    private int dotsStrokeColor;
    private float dotsStrokeWidth;

    @NotNull
    private final LinearLayout strokeDotsLinearLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ViewGroup buildDot(boolean stroke) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.worm_dot_layout, (ViewGroup) this, false);
        Intrinsics.g(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        viewGroup.setLayoutDirection(0);
        View findViewById = viewGroup.findViewById(R.id.worm_dot);
        findViewById.setBackgroundResource(stroke ? R.drawable.worm_dot_stroke_background : R.drawable.worm_dot_background);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int dotsSize = (int) getDotsSize();
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        setUpDotBackground(stroke, findViewById);
        return viewGroup;
    }

    private final void setUpDotBackground(boolean stroke, View dotImageView) {
        Drawable background = dotImageView.getBackground();
        Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (stroke) {
            gradientDrawable.setStroke((int) this.dotsStrokeWidth, this.dotsStrokeColor);
        } else {
            gradientDrawable.setColor(this.dotIndicatorColor);
        }
        gradientDrawable.setCornerRadius(getDotsCornerRadius());
    }

    private final void setUpDotIndicator() {
        BaseDotsIndicator.Pager pager = getPager();
        if (pager == null || !pager.isEmpty()) {
            ImageView imageView = this.dotIndicatorView;
            if (imageView != null && indexOfChild(imageView) != -1) {
                removeView(this.dotIndicatorView);
            }
            ViewGroup buildDot = buildDot(false);
            this.dotIndicatorLayout = buildDot;
            Intrinsics.f(buildDot);
            this.dotIndicatorView = (ImageView) buildDot.findViewById(R.id.worm_dot);
            addView(this.dotIndicatorLayout);
            this.dotIndicatorXSpring = new f(this.dotIndicatorLayout, b.f42643m);
            g gVar = new g(0.0f);
            gVar.c(0.7f);
            gVar.e(1850.0f);
            f fVar = this.dotIndicatorXSpring;
            Intrinsics.f(fVar);
            fVar.o(gVar);
            this.dotIndicatorWidthSpring = new f(this.dotIndicatorLayout, new d<View>() { // from class: ru.ozon.fintech.ui.dots.WormDotsIndicator$setUpDotIndicator$floatPropertyCompat$1
                {
                    super("DotsWidth");
                }

                @Override // androidx.dynamicanimation.animation.d
                public float getValue(View object) {
                    ImageView imageView2;
                    Intrinsics.checkNotNullParameter(object, "object");
                    imageView2 = WormDotsIndicator.this.dotIndicatorView;
                    Intrinsics.f(imageView2);
                    return imageView2.getLayoutParams().width;
                }

                @Override // androidx.dynamicanimation.animation.d
                public void setValue(View object, float value) {
                    ImageView imageView2;
                    ImageView imageView3;
                    Intrinsics.checkNotNullParameter(object, "object");
                    imageView2 = WormDotsIndicator.this.dotIndicatorView;
                    Intrinsics.f(imageView2);
                    imageView2.getLayoutParams().width = (int) value;
                    imageView3 = WormDotsIndicator.this.dotIndicatorView;
                    Intrinsics.f(imageView3);
                    imageView3.requestLayout();
                }
            });
            g gVar2 = new g(0.0f);
            gVar2.c(0.7f);
            gVar2.e(1850.0f);
            f fVar2 = this.dotIndicatorWidthSpring;
            Intrinsics.f(fVar2);
            fVar2.o(gVar2);
        }
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    public void addDot(int index) {
        ViewGroup buildDot = buildDot(true);
        ArrayList<ImageView> arrayList = this.dots;
        View findViewById = buildDot.findViewById(R.id.worm_dot);
        Intrinsics.g(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        arrayList.add((ImageView) findViewById);
        this.strokeDotsLinearLayout.addView(buildDot);
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    @NotNull
    public OnPageChangeListenerHelper buildOnPageChangedListener() {
        return new OnPageChangeListenerHelper() { // from class: ru.ozon.fintech.ui.dots.WormDotsIndicator$buildOnPageChangedListener$1
            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public int getPageCount$fintech_ui_prodRelease() {
                return WormDotsIndicator.this.dots.size();
            }

            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public void onPageScrolled$fintech_ui_prodRelease(int selectedPosition, int nextPosition, float positionOffset) {
                float dotsSize;
                f fVar;
                f fVar2;
                ViewParent parent = WormDotsIndicator.this.dots.get(selectedPosition).getParent();
                Intrinsics.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                float left = ((ViewGroup) parent).getLeft();
                ArrayList<ImageView> arrayList = WormDotsIndicator.this.dots;
                if (nextPosition != -1) {
                    selectedPosition = nextPosition;
                }
                ViewParent parent2 = arrayList.get(selectedPosition).getParent();
                Intrinsics.g(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                float left2 = ((ViewGroup) parent2).getLeft();
                if (0.0f <= positionOffset && positionOffset <= 0.1f) {
                    dotsSize = WormDotsIndicator.this.getDotsSize();
                } else if (0.1f > positionOffset || positionOffset > 0.9f) {
                    left = left2;
                    dotsSize = WormDotsIndicator.this.getDotsSize();
                } else {
                    dotsSize = (left2 - left) + WormDotsIndicator.this.getDotsSize();
                }
                fVar = WormDotsIndicator.this.dotIndicatorXSpring;
                if (fVar != null) {
                    fVar.n(left);
                }
                fVar2 = WormDotsIndicator.this.dotIndicatorWidthSpring;
                if (fVar2 != null) {
                    fVar2.n(dotsSize);
                }
            }

            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public void resetPosition$fintech_ui_prodRelease(int position) {
            }
        };
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    @NotNull
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.WORM;
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    public void refreshDotColor(int index) {
        ImageView imageView = this.dots.get(index);
        Intrinsics.checkNotNullExpressionValue(imageView, "get(...)");
        setUpDotBackground(true, imageView);
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    public void removeDot() {
        LinearLayout linearLayout = this.strokeDotsLinearLayout;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        Ej.b.b(1, this.dots);
    }

    public final void setDotIndicatorColor(int color) {
        ImageView imageView = this.dotIndicatorView;
        if (imageView != null) {
            this.dotIndicatorColor = color;
            Intrinsics.f(imageView);
            setUpDotBackground(false, imageView);
        }
    }

    public final void setDotsStrokeWidth(float width) {
        this.dotsStrokeWidth = width;
        Iterator<ImageView> it = this.dots.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ImageView next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            setUpDotBackground(true, next);
        }
    }

    public final void setStrokeDotsIndicatorColor(int color) {
        this.dotsStrokeColor = color;
        Iterator<ImageView> it = this.dots.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ImageView next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            setUpDotBackground(true, next);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WormDotsIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WormDotsIndicator(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.strokeDotsLinearLayout = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dpToPx = dpToPx(24);
        setPadding(dpToPx, 0, dpToPx, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        this.dotsStrokeWidth = dpToPxF(2.0f);
        int themePrimaryColor = ExtensionsKt.getThemePrimaryColor(context);
        this.dotIndicatorColor = themePrimaryColor;
        this.dotsStrokeColor = themePrimaryColor;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, G80.a.f9769g);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = obtainStyledAttributes.getColor(1, this.dotIndicatorColor);
            this.dotIndicatorColor = color;
            this.dotsStrokeColor = obtainStyledAttributes.getColor(5, color);
            this.dotsStrokeWidth = obtainStyledAttributes.getDimension(6, this.dotsStrokeWidth);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            addDots(5);
            addView(buildDot(false));
        }
        setUpDotIndicator();
    }
}
