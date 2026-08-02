package ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.LinearLayoutManager;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderNavContent.presentation.TravelOrderNavContentVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.LayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0014J0\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ(\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0010\u0018\u00010\"H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0014\u0010'\u001a\u00020\u0007*\u00020(2\u0006\u0010)\u001a\u00020\u0007H\u0002J\u001c\u0010*\u001a\u00020\u0007*\u00020(2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u001c\u0010+\u001a\u00020\u0010*\u00020(2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/view/TravelOrderNavContentDateTimeInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp2", "", "paint", "Landroid/graphics/Paint;", "leftAv", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/view/TravelOrderNavContentDateTimeItemView;", "rightAv", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", "", "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bindOrGone", "item", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelOrderNavContent/presentation/TravelOrderNavContentVO$DateTimeInfoVO;", "bind", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "drawSeparator", "alignBlocks", "availableWidth", "createHeightMeasureSpec", "Landroid/view/View;", "parentHeightMeasureSpec", "getNaturalWidth", "remeasureWidthIfNecessary", "targetWidth", "calculateHeight", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOrderNavContentDateTimeInfoView extends FrameLayout {
    private final int dp2;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final TravelOrderNavContentDateTimeItemView leftAv;

    @NotNull
    private final Paint paint;

    @NotNull
    private final TravelOrderNavContentDateTimeItemView rightAv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelOrderNavContentDateTimeInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        Paint paint = new Paint(1);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutralOnLight));
        paint.setStrokeWidth(ResourceExtKt.toPxF(1, context));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.paint = paint;
        TravelOrderNavContentDateTimeItemView travelOrderNavContentDateTimeItemView = new TravelOrderNavContentDateTimeItemView(context);
        travelOrderNavContentDateTimeItemView.setId(3600);
        travelOrderNavContentDateTimeItemView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.leftAv = travelOrderNavContentDateTimeItemView;
        TravelOrderNavContentDateTimeItemView travelOrderNavContentDateTimeItemView2 = new TravelOrderNavContentDateTimeItemView(context);
        travelOrderNavContentDateTimeItemView2.setId(3601);
        travelOrderNavContentDateTimeItemView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.rightAv = travelOrderNavContentDateTimeItemView2;
        IconView iconView = (IconView) q.f64554a.i(N.b(IconView.class), context);
        iconView = iconView == null ? new IconView(context, null, 0, 6, null) : iconView;
        iconView.setId(3602);
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.iconView = iconView;
        addView(travelOrderNavContentDateTimeItemView);
        addView(travelOrderNavContentDateTimeItemView2);
        addView(iconView);
        setWillNotDraw(false);
    }

    private final void alignBlocks(int availableWidth, int heightMeasureSpec) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(availableWidth, LinearLayoutManager.INVALID_OFFSET);
        int createHeightMeasureSpec = createHeightMeasureSpec(this.leftAv, heightMeasureSpec);
        int createHeightMeasureSpec2 = createHeightMeasureSpec(this.rightAv, heightMeasureSpec);
        int max = Math.max(getNaturalWidth(this.leftAv, makeMeasureSpec, createHeightMeasureSpec), getNaturalWidth(this.rightAv, makeMeasureSpec, createHeightMeasureSpec2));
        if (max <= availableWidth) {
            availableWidth = max;
        }
        remeasureWidthIfNecessary(this.leftAv, availableWidth, createHeightMeasureSpec);
        remeasureWidthIfNecessary(this.rightAv, availableWidth, createHeightMeasureSpec2);
    }

    private final void bind(TravelOrderNavContentVO.DateTimeInfoVO item, Function1<? super AtomAction, Unit> onAction) {
        this.leftAv.bind(item.getLeftDateTimeItem(), onAction);
        this.rightAv.bind(item.getRightDateTimeItem(), onAction);
        IconHolderKt.bindOrGone$default(this.iconView, item.getIcon(), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void bind$default(TravelOrderNavContentDateTimeInfoView travelOrderNavContentDateTimeInfoView, TravelOrderNavContentVO.DateTimeInfoVO dateTimeInfoVO, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        travelOrderNavContentDateTimeInfoView.bind(dateTimeInfoVO, function1);
    }

    private final int calculateHeight() {
        Integer num;
        C7747g.a aVar = (C7747g.a) l.h(C5316f0.b(this), TravelOrderNavContentDateTimeInfoView$calculateHeight$childMaxHeight$1.INSTANCE).iterator();
        if (aVar.hasNext()) {
            Integer valueOf = Integer.valueOf(((View) aVar.next()).getMeasuredHeight());
            while (aVar.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((View) aVar.next()).getMeasuredHeight());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return getPaddingBottom() + getPaddingTop() + (num != null ? num.intValue() : 0);
    }

    private final int createHeightMeasureSpec(View view, int i11) {
        return ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop(), view.getLayoutParams().height);
    }

    private final void drawSeparator(Canvas canvas) {
        float right = this.leftAv.getRight() + this.dp2;
        float left = this.iconView.getLeft();
        float right2 = this.iconView.getRight();
        float left2 = this.rightAv.getLeft() - this.dp2;
        float height = (getHeight() / 2.0f) - (this.paint.getStrokeWidth() / 2.0f);
        if (this.iconView.getVisibility() != 0) {
            canvas.drawLine(right, height, left2, height, this.paint);
        } else {
            canvas.drawLine(right, height, left, height, this.paint);
            canvas.drawLine(right2, height, left2, height, this.paint);
        }
    }

    private final int getNaturalWidth(View view, int i11, int i12) {
        view.measure(i11, i12);
        return view.getMeasuredWidth();
    }

    private final void remeasureWidthIfNecessary(View view, int i11, int i12) {
        if (view.getMeasuredWidth() == i11) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i12);
    }

    public final void bindOrGone(TravelOrderNavContentVO.DateTimeInfoVO item) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind$default(this, item, null, 2, null);
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawSeparator(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams layoutParams = this.leftAv.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i11 = bottom - top;
        int marginStart = layoutParams2.getMarginStart() + getPaddingStart();
        int i12 = i11 / 2;
        int measuredHeight = (i12 - (this.leftAv.getMeasuredHeight() / 2)) + layoutParams2.topMargin;
        int paddingTop = getPaddingTop();
        if (measuredHeight < paddingTop) {
            measuredHeight = paddingTop;
        }
        ViewGroup.LayoutParams layoutParams3 = this.rightAv.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        int i13 = right - left;
        int paddingRight = (i13 - getPaddingRight()) - layoutParams4.getMarginEnd();
        int measuredHeight2 = (i12 - (this.rightAv.getMeasuredHeight() / 2)) + layoutParams4.topMargin;
        int paddingTop2 = getPaddingTop();
        if (measuredHeight2 < paddingTop2) {
            measuredHeight2 = paddingTop2;
        }
        LayoutExtKt.layoutLeftTop(this.leftAv, marginStart, measuredHeight);
        if (this.iconView.getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams5 = this.iconView.getLayoutParams();
            Intrinsics.g(layoutParams5, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int measuredWidth = (i13 / 2) - (this.iconView.getMeasuredWidth() / 2);
            int measuredHeight3 = (i12 - (this.iconView.getMeasuredHeight() / 2)) + ((FrameLayout.LayoutParams) layoutParams5).topMargin;
            int paddingTop3 = getPaddingTop();
            if (measuredHeight3 < paddingTop3) {
                measuredHeight3 = paddingTop3;
            }
            LayoutExtKt.layoutLeftTop(this.iconView, measuredWidth, measuredHeight3);
        }
        LayoutExtKt.layoutRightTop(this.rightAv, paddingRight, measuredHeight2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.iconView.getVisibility() != 8) {
            this.iconView.measure(widthMeasureSpec, heightMeasureSpec);
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        alignBlocks((((size - getPaddingStart()) - getPaddingEnd()) / 2) - (this.iconView.getVisibility() == 8 ? this.dp2 / 2 : (this.iconView.getMeasuredWidth() / 2) + this.dp2), heightMeasureSpec);
        setMeasuredDimension(size, calculateHeight());
    }
}
