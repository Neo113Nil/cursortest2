package ru.ozon.fintech.ui.dots;

import Ej.b;
import Hj.C3143a;
import Sc.InterfaceC3999a;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0007H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lru/ozon/fintech/ui/dots/DotsIndicator;", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "linearLayout", "Landroid/widget/LinearLayout;", "dotsWidthFactor", "", "progressMode", "", "dotsElevation", AppMeasurementSdk.ConditionalUserProperty.VALUE, "selectedDotColor", "getSelectedDotColor", "()I", "setSelectedDotColor", "(I)V", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "init", "", "addDot", "index", "removeDot", "buildOnPageChangedListener", "Lru/ozon/fintech/ui/dots/OnPageChangeListenerHelper;", "refreshDotColor", "type", "Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "getType", "()Lru/ozon/fintech/ui/dots/BaseDotsIndicator$Type;", "setSelectedPointColor", "color", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DotsIndicator extends BaseDotsIndicator {
    public static final float DEFAULT_WIDTH_FACTOR = 2.5f;

    @NotNull
    private final ArgbEvaluator argbEvaluator;
    private float dotsElevation;
    private float dotsWidthFactor;
    private LinearLayout linearLayout;
    private boolean progressMode;
    private int selectedDotColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDot$lambda$0(DotsIndicator dotsIndicator, int i11, View view) {
        if (dotsIndicator.getDotsClickable()) {
            BaseDotsIndicator.Pager pager = dotsIndicator.getPager();
            if (i11 < (pager != null ? pager.getCount() : 0)) {
                BaseDotsIndicator.Pager pager2 = dotsIndicator.getPager();
                Intrinsics.f(pager2);
                pager2.setCurrentItem(i11, true);
            }
        }
    }

    private final void init(AttributeSet attrs) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.linearLayout;
        if (linearLayout2 == null) {
            Intrinsics.n("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.dotsWidthFactor = 2.5f;
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, G80.a.f9764b);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setSelectedDotColor(obtainStyledAttributes.getColor(8, BaseDotsIndicator.DEFAULT_POINT_COLOR));
            float f7 = obtainStyledAttributes.getFloat(6, 2.5f);
            this.dotsWidthFactor = f7;
            if (f7 < 1.0f) {
                Log.w("DotsIndicator", "The dotsWidthFactor can't be set under 1.0f, please set an higher value");
                this.dotsWidthFactor = 1.0f;
            }
            this.progressMode = obtainStyledAttributes.getBoolean(7, false);
            this.dotsElevation = obtainStyledAttributes.getDimension(3, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            addDots(5);
            refreshDots();
        }
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    public void addDot(final int index) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dot_layout, (ViewGroup) this, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.dot);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        inflate.setLayoutDirection(0);
        int dotsSize = (int) getDotsSize();
        layoutParams2.height = dotsSize;
        layoutParams2.width = dotsSize;
        layoutParams2.setMargins((int) getDotsSpacing(), 0, (int) getDotsSpacing(), 0);
        DotsGradientDrawable dotsGradientDrawable = new DotsGradientDrawable();
        dotsGradientDrawable.setCornerRadius(getDotsCornerRadius());
        if (isInEditMode()) {
            dotsGradientDrawable.setColor(index == 0 ? this.selectedDotColor : getDotsColor());
        } else {
            BaseDotsIndicator.Pager pager = getPager();
            Intrinsics.f(pager);
            dotsGradientDrawable.setColor(pager.getCurrentItem() == index ? this.selectedDotColor : getDotsColor());
        }
        ExtensionsKt.setBackgroundCompat(imageView, dotsGradientDrawable);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.fintech.ui.dots.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DotsIndicator.addDot$lambda$0(DotsIndicator.this, index, view);
            }
        });
        ExtensionsKt.setPaddingHorizontal(inflate, (int) (this.dotsElevation * 0.8f));
        ExtensionsKt.setPaddingVertical(inflate, (int) (this.dotsElevation * 2));
        imageView.setElevation(this.dotsElevation);
        this.dots.add(imageView);
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            linearLayout.addView(inflate);
        } else {
            Intrinsics.n("linearLayout");
            throw null;
        }
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    @NotNull
    public OnPageChangeListenerHelper buildOnPageChangedListener() {
        return new OnPageChangeListenerHelper() { // from class: ru.ozon.fintech.ui.dots.DotsIndicator$buildOnPageChangedListener$1
            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public int getPageCount$fintech_ui_prodRelease() {
                return DotsIndicator.this.dots.size();
            }

            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public void onPageScrolled$fintech_ui_prodRelease(int selectedPosition, int nextPosition, float positionOffset) {
                float f7;
                float f11;
                ArgbEvaluator argbEvaluator;
                ArgbEvaluator argbEvaluator2;
                boolean z11;
                ImageView imageView = DotsIndicator.this.dots.get(selectedPosition);
                Intrinsics.checkNotNullExpressionValue(imageView, "get(...)");
                ImageView imageView2 = imageView;
                float dotsSize = DotsIndicator.this.getDotsSize();
                float dotsSize2 = DotsIndicator.this.getDotsSize();
                f7 = DotsIndicator.this.dotsWidthFactor;
                float f12 = 1;
                ExtensionsKt.setWidth(imageView2, (int) C3143a.d(f12, positionOffset, (f7 - f12) * dotsSize2, dotsSize));
                if (ExtensionsKt.isInBounds(DotsIndicator.this.dots, nextPosition)) {
                    ImageView imageView3 = DotsIndicator.this.dots.get(nextPosition);
                    Intrinsics.checkNotNullExpressionValue(imageView3, "get(...)");
                    ImageView imageView4 = imageView3;
                    float dotsSize3 = DotsIndicator.this.getDotsSize();
                    float dotsSize4 = DotsIndicator.this.getDotsSize();
                    f11 = DotsIndicator.this.dotsWidthFactor;
                    ExtensionsKt.setWidth(imageView4, (int) (((f11 - f12) * dotsSize4 * positionOffset) + dotsSize3));
                    Drawable background = imageView2.getBackground();
                    Intrinsics.g(background, "null cannot be cast to non-null type ru.ozon.fintech.ui.dots.DotsGradientDrawable");
                    DotsGradientDrawable dotsGradientDrawable = (DotsGradientDrawable) background;
                    Drawable background2 = imageView4.getBackground();
                    Intrinsics.g(background2, "null cannot be cast to non-null type ru.ozon.fintech.ui.dots.DotsGradientDrawable");
                    DotsGradientDrawable dotsGradientDrawable2 = (DotsGradientDrawable) background2;
                    if (DotsIndicator.this.getSelectedDotColor() != DotsIndicator.this.getDotsColor()) {
                        argbEvaluator = DotsIndicator.this.argbEvaluator;
                        Object evaluate = argbEvaluator.evaluate(positionOffset, Integer.valueOf(DotsIndicator.this.getSelectedDotColor()), Integer.valueOf(DotsIndicator.this.getDotsColor()));
                        Intrinsics.g(evaluate, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) evaluate).intValue();
                        argbEvaluator2 = DotsIndicator.this.argbEvaluator;
                        Object evaluate2 = argbEvaluator2.evaluate(positionOffset, Integer.valueOf(DotsIndicator.this.getDotsColor()), Integer.valueOf(DotsIndicator.this.getSelectedDotColor()));
                        Intrinsics.g(evaluate2, "null cannot be cast to non-null type kotlin.Int");
                        dotsGradientDrawable2.setColor(((Integer) evaluate2).intValue());
                        z11 = DotsIndicator.this.progressMode;
                        if (z11) {
                            BaseDotsIndicator.Pager pager = DotsIndicator.this.getPager();
                            Intrinsics.f(pager);
                            if (selectedPosition <= pager.getCurrentItem()) {
                                dotsGradientDrawable.setColor(DotsIndicator.this.getSelectedDotColor());
                            }
                        }
                        dotsGradientDrawable.setColor(intValue);
                    }
                }
                DotsIndicator.this.invalidate();
            }

            @Override // ru.ozon.fintech.ui.dots.OnPageChangeListenerHelper
            public void resetPosition$fintech_ui_prodRelease(int position) {
                ImageView imageView = DotsIndicator.this.dots.get(position);
                Intrinsics.checkNotNullExpressionValue(imageView, "get(...)");
                ExtensionsKt.setWidth(imageView, (int) DotsIndicator.this.getDotsSize());
                DotsIndicator.this.refreshDotColor(position);
            }
        };
    }

    public final int getSelectedDotColor() {
        return this.selectedDotColor;
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    @NotNull
    public BaseDotsIndicator.Type getType() {
        return BaseDotsIndicator.Type.DEFAULT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r4 < r2.getCurrentItem()) goto L15;
     */
    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void refreshDotColor(int index) {
        ImageView imageView = this.dots.get(index);
        Intrinsics.checkNotNullExpressionValue(imageView, "get(...)");
        ImageView imageView2 = imageView;
        Drawable background = imageView2.getBackground();
        DotsGradientDrawable dotsGradientDrawable = background instanceof DotsGradientDrawable ? (DotsGradientDrawable) background : null;
        if (dotsGradientDrawable != null) {
            BaseDotsIndicator.Pager pager = getPager();
            Intrinsics.f(pager);
            if (index != pager.getCurrentItem()) {
                if (this.progressMode) {
                    BaseDotsIndicator.Pager pager2 = getPager();
                    Intrinsics.f(pager2);
                }
                dotsGradientDrawable.setColor(getDotsColor());
            }
            dotsGradientDrawable.setColor(this.selectedDotColor);
        }
        ExtensionsKt.setBackgroundCompat(imageView2, dotsGradientDrawable);
        imageView2.invalidate();
    }

    @Override // ru.ozon.fintech.ui.dots.BaseDotsIndicator
    public void removeDot() {
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout == null) {
            Intrinsics.n("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            Intrinsics.n("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        b.b(1, this.dots);
    }

    public final void setSelectedDotColor(int i11) {
        this.selectedDotColor = i11;
        refreshDotsColors();
    }

    @InterfaceC3999a
    public final void setSelectedPointColor(int color) {
        setSelectedDotColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ DotsIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsIndicator(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.argbEvaluator = new ArgbEvaluator();
        init(attributeSet);
    }
}
