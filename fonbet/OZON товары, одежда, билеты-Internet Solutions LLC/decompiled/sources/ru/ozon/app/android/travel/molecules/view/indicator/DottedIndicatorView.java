package ru.ozon.app.android.travel.molecules.view.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$styleable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0002>?B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0014J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0014J\u000e\u0010/\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u00100\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\tJ\u0010\u00102\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\tJ\u000e\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\tJ\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\tJ\u000e\u00107\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u00108\u001a\u00020)2\u0006\u00109\u001a\u00020\tJ\u0017\u0010:\u001a\u00020)2\n\b\u0003\u00101\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020)H\u0002J\b\u0010=\u001a\u00020)H\u0002R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "highlightedDotPosition", "getHighlightedDotPosition", "()I", "highlightedDotPaint", "Landroid/graphics/Paint;", "dotPaint", "backgroundPaint", "backgroundRadius", "", "getBackgroundRadius", "()F", "highlightedDotLength", "dotRadius", "spacing", "dotCount", "indicatorsWrapWidth", "dotLength", "visibilityThreshold", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "infoProvider", "Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "getInfoProvider", "()Lru/ozon/app/android/travel/molecules/view/indicator/IndicatorInfoProvider;", "dataObserver", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView$HelperDataObserver;", "scrollListener", "Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView$HelperScrollListener;", "isBackgroundEnable", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "attachTo", "setHighlightedDotColor", "color", "setDotColor", "setHighlightedDotLength", "length", "setDotRadius", "radius", "setSpacing", "highlightAt", "position", "enableBackground", "(Ljava/lang/Integer;)V", "redrawWithLayoutChange", "update", "HelperDataObserver", "HelperScrollListener", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DottedIndicatorView extends View {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final HelperDataObserver dataObserver;
    private int dotCount;
    private int dotLength;

    @NotNull
    private final Paint dotPaint;
    private int dotRadius;
    private int highlightedDotLength;

    @NotNull
    private final Paint highlightedDotPaint;
    private int highlightedDotPosition;
    private int indicatorsWrapWidth;
    private boolean isBackgroundEnable;
    private RecyclerView recyclerView;

    @NotNull
    private final HelperScrollListener scrollListener;
    private int spacing;
    private int visibilityThreshold;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ'\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView$HelperDataObserver;", "Landroidx/recyclerview/widget/RecyclerView$i;", "Lkotlin/Function0;", "", "onChangedAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "onChanged", "()V", "", "positionStart", "itemCount", "onItemRangeChanged", "(II)V", "", "payload", "(IILjava/lang/Object;)V", "onItemRangeInserted", "fromPosition", "toPosition", "onItemRangeMoved", "(III)V", "onItemRangeRemoved", "Lkotlin/jvm/functions/Function0;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class HelperDataObserver extends RecyclerView.i {

        @NotNull
        private final Function0<Unit> onChangedAction;

        public HelperDataObserver(@NotNull Function0<Unit> onChangedAction) {
            Intrinsics.checkNotNullParameter(onChangedAction, "onChangedAction");
            this.onChangedAction = onChangedAction;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onChanged() {
            this.onChangedAction.invoke();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeInserted(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void onItemRangeChanged(int positionStart, int itemCount, Object payload) {
            onChanged();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/indicator/DottedIndicatorView$HelperScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$t;", "Lkotlin/Function2;", "Landroidx/recyclerview/widget/RecyclerView;", "", "", "onScrolledToItem", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "recyclerView", "newState", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "Lkotlin/jvm/functions/Function2;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class HelperScrollListener extends RecyclerView.t {

        @NotNull
        private final Function2<RecyclerView, Integer, Unit> onScrolledToItem;

        /* JADX WARN: Multi-variable type inference failed */
        public HelperScrollListener(@NotNull Function2<? super RecyclerView, ? super Integer, Unit> onScrolledToItem) {
            Intrinsics.checkNotNullParameter(onScrolledToItem, "onScrolledToItem");
            this.onScrolledToItem = onScrolledToItem;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int newState) {
            RecyclerView.o layoutManager;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (newState != 0 || (layoutManager = recyclerView.getLayoutManager()) == null) {
                return;
            }
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                Integer valueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
                Integer num = valueOf.intValue() != -1 ? valueOf : null;
                if (num != null) {
                    this.onScrolledToItem.invoke(recyclerView, Integer.valueOf(num.intValue()));
                }
            }
        }
    }

    public /* synthetic */ DottedIndicatorView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    public static /* synthetic */ void enableBackground$default(DottedIndicatorView dottedIndicatorView, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        dottedIndicatorView.enableBackground(num);
    }

    private final float getBackgroundRadius() {
        return this.dotRadius * 2.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndicatorInfoProvider getInfoProvider() {
        RecyclerView recyclerView = this.recyclerView;
        Object adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter instanceof IndicatorInfoProvider) {
            return (IndicatorInfoProvider) adapter;
        }
        return null;
    }

    private final void redrawWithLayoutChange() {
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void update() {
        IndicatorInfoProvider infoProvider = getInfoProvider();
        if (infoProvider == null) {
            return;
        }
        int actualItemCount = infoProvider.actualItemCount();
        this.dotCount = actualItemCount;
        setVisibility(actualItemCount >= this.visibilityThreshold ? 0 : 8);
        this.highlightedDotPosition = 0;
        redrawWithLayoutChange();
    }

    public final void attachTo(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.g adapter = recyclerView.getAdapter();
        if (!(adapter instanceof IndicatorInfoProvider)) {
            throw new IllegalArgumentException("Adapter must implement IndicatorInfoProvider interface.");
        }
        this.recyclerView = recyclerView;
        adapter.registerAdapterDataObserver(this.dataObserver);
        recyclerView.addOnScrollListener(this.scrollListener);
    }

    public final void enableBackground(Integer color) {
        if (color != null) {
            this.backgroundPaint.setColor(color.intValue());
        }
        int i11 = this.dotRadius;
        setPadding(i11, i11, i11, i11);
        this.isBackgroundEnable = true;
        invalidate();
    }

    public final int getHighlightedDotPosition() {
        return this.highlightedDotPosition;
    }

    public final void highlightAt(int position) {
        this.highlightedDotPosition = position;
        redrawWithLayoutChange();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isBackgroundEnable) {
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getBackgroundRadius(), getBackgroundRadius(), this.backgroundPaint);
        }
        float height = (getHeight() / 2.0f) - this.dotRadius;
        float f7 = height + this.dotLength;
        int i11 = this.dotCount;
        float paddingEnd = ((getPaddingEnd() + (getPaddingStart() + getWidth())) / 2.0f) - (this.indicatorsWrapWidth / 2.0f);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.highlightedDotPosition;
            float f11 = (i12 == i13 ? this.highlightedDotLength : this.dotLength) + paddingEnd;
            Paint paint = i12 == i13 ? this.highlightedDotPaint : this.dotPaint;
            int i14 = this.dotRadius;
            canvas.drawRoundRect(paddingEnd, height, f11, f7, i14, i14, paint);
            paddingEnd = f11 + this.spacing;
            i12++;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int paddingBottom = (this.dotRadius * 2) + getPaddingBottom() + getPaddingTop();
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int i11 = this.dotCount;
        int i12 = 0;
        while (i12 < i11) {
            paddingEnd += i12 == this.highlightedDotPosition ? this.highlightedDotLength : this.dotLength;
            if (i12 < this.dotCount - 1) {
                paddingEnd += this.spacing;
            }
            i12++;
        }
        this.indicatorsWrapWidth = paddingEnd;
        setMeasuredDimension(View.resolveSize(paddingEnd, widthMeasureSpec), View.resolveSize(paddingBottom, heightMeasureSpec));
    }

    @NotNull
    public final DottedIndicatorView setDotColor(int color) {
        this.dotPaint.setColor(color);
        invalidate();
        return this;
    }

    @NotNull
    public final DottedIndicatorView setDotRadius(int radius) {
        this.dotRadius = radius;
        this.dotLength = radius * 2;
        redrawWithLayoutChange();
        return this;
    }

    @NotNull
    public final DottedIndicatorView setHighlightedDotColor(int color) {
        this.highlightedDotPaint.setColor(color);
        invalidate();
        return this;
    }

    @NotNull
    public final DottedIndicatorView setHighlightedDotLength(int length) {
        this.highlightedDotLength = length;
        redrawWithLayoutChange();
        return this;
    }

    @NotNull
    public final DottedIndicatorView setSpacing(int spacing) {
        this.spacing = spacing;
        redrawWithLayoutChange();
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedIndicatorView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z11 = true;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(ThemeExtKt.themeColor(context, R$attr.graphicPrimary));
        this.highlightedDotPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        this.dotPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(ThemeExtKt.themeColor(context, R$attr.clearLightKey700));
        this.backgroundPaint = paint3;
        this.highlightedDotLength = ResourceExtKt.toPx(8, context);
        this.dotRadius = ResourceExtKt.toPx(2, context);
        this.spacing = ResourceExtKt.toPx(2, context);
        this.dotLength = this.dotRadius * 2;
        this.visibilityThreshold = 2;
        this.dataObserver = new HelperDataObserver(new DottedIndicatorView$dataObserver$1(this));
        this.scrollListener = new HelperScrollListener(new DottedIndicatorView$scrollListener$1(this));
        if (attributeSet == null || (obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.DottedIndicatorView, 0, 0)) == null) {
            return;
        }
        try {
            this.highlightedDotPosition = obtainStyledAttributes.getInteger(R$styleable.DottedIndicatorView_divHighlightedDotPosition, this.highlightedDotPosition);
            this.highlightedDotLength = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DottedIndicatorView_divHighlightedDotLength, this.highlightedDotLength);
            paint.setColor(obtainStyledAttributes.getColor(R$styleable.DottedIndicatorView_divHighlightedDotColor, paint.getColor()));
            this.dotRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DottedIndicatorView_divDefaultDotRadius, this.dotRadius);
            paint2.setColor(obtainStyledAttributes.getColor(R$styleable.DottedIndicatorView_divDeafultDotColor, paint2.getColor()));
            this.spacing = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DottedIndicatorView_divSpacing, this.spacing);
            this.dotCount = obtainStyledAttributes.getInteger(R$styleable.DottedIndicatorView_divDotCount, this.dotCount);
            int integer = obtainStyledAttributes.getInteger(R$styleable.DottedIndicatorView_divVisibilityThreshold, this.visibilityThreshold);
            this.visibilityThreshold = integer;
            this.dotLength = this.dotRadius * 2;
            if (this.dotCount < integer) {
                z11 = false;
            }
            setVisibility(z11 ? 0 : 8);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
