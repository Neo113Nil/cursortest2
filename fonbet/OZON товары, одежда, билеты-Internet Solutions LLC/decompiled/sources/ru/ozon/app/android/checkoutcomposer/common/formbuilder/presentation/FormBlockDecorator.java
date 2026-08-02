package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import Sc.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.map.R$dimen;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010'\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010(R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010(R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockDecorator;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "formConfig", "Lkotlin/Function1;", "", "", "drawLeft", "drawTop", "drawBottom", "leftEdgeView", "rightEdgeView", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "draw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "drawSeparatorBackground", "(Landroid/graphics/Canvas;)V", "c", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "Landroid/content/Context;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "Lkotlin/jvm/functions/Function1;", "strokeWidth", "I", "dp4", "dp8", "dp12", "bounds", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "horizontalEdgePadding", "betweenFieldsPadding", "bottomEdgePadding", "isDrawSeparator", "Z", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBlockDecorator extends RecyclerView.n {
    private final int betweenFieldsPadding;
    private final int bottomEdgePadding;

    @NotNull
    private final Rect bounds;

    @NotNull
    private final Context context;
    private final int dp12;
    private final int dp4;
    private final int dp8;

    @NotNull
    private final Function1<Integer, Boolean> drawBottom;

    @NotNull
    private final Function1<Integer, Boolean> drawLeft;

    @NotNull
    private final Function1<Integer, Boolean> drawTop;

    @NotNull
    private final FormConfig formConfig;
    private final int horizontalEdgePadding;
    private final boolean isDrawSeparator;

    @NotNull
    private final Function1<Integer, Boolean> leftEdgeView;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Function1<Integer, Boolean> rightEdgeView;
    private final int strokeWidth;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormConfig.Mode.values().length];
            try {
                iArr[FormConfig.Mode.BORDER_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_GRAY_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FormBlockDecorator(@NotNull Context context, @NotNull FormConfig formConfig, @NotNull Function1<? super Integer, Boolean> drawLeft, @NotNull Function1<? super Integer, Boolean> drawTop, @NotNull Function1<? super Integer, Boolean> drawBottom, @NotNull Function1<? super Integer, Boolean> leftEdgeView, @NotNull Function1<? super Integer, Boolean> rightEdgeView) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(drawLeft, "drawLeft");
        Intrinsics.checkNotNullParameter(drawTop, "drawTop");
        Intrinsics.checkNotNullParameter(drawBottom, "drawBottom");
        Intrinsics.checkNotNullParameter(leftEdgeView, "leftEdgeView");
        Intrinsics.checkNotNullParameter(rightEdgeView, "rightEdgeView");
        this.context = context;
        this.formConfig = formConfig;
        this.drawLeft = drawLeft;
        this.drawTop = drawTop;
        this.drawBottom = drawBottom;
        this.leftEdgeView = leftEdgeView;
        this.rightEdgeView = rightEdgeView;
        this.strokeWidth = ResourceExtKt.toPx(1);
        this.dp4 = ResourceExtKt.toPx(4);
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp12 = ResourceExtKt.toPx(12);
        this.bounds = new Rect();
        Paint paint = new Paint(1);
        paint.setColor(g.b(context.getResources(), R$color.oz_semantic_separator, context.getTheme()));
        paint.setStrokeWidth(paint.getStrokeWidth());
        this.paint = paint;
        FormConfig.Mode mode = formConfig.getMode();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[mode.ordinal()];
        if (i11 == 1) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_border_mode_field_horizontal_edge_padding);
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new o();
            }
            dimensionPixelSize = 0;
        }
        this.horizontalEdgePadding = dimensionPixelSize;
        int i12 = iArr[formConfig.getMode().ordinal()];
        if (i12 == 1) {
            dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_border_mode_between_fields_padding);
        } else {
            if (i12 != 2 && i12 != 3) {
                throw new o();
            }
            dimensionPixelSize2 = 0;
        }
        this.betweenFieldsPadding = dimensionPixelSize2;
        int i13 = iArr[formConfig.getMode().ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                dimensionPixelSize3 = 0;
                this.bottomEdgePadding = dimensionPixelSize3;
                this.isDrawSeparator = formConfig.getMode() != FormConfig.Mode.BORDER_FIELD;
            } else if (i13 != 3) {
                throw new o();
            }
        }
        dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_border_mode_field_bottom_edge_padding);
        this.bottomEdgePadding = dimensionPixelSize3;
        this.isDrawSeparator = formConfig.getMode() != FormConfig.Mode.BORDER_FIELD;
    }

    private final void draw(Canvas canvas, RecyclerView parent) {
        float f7;
        float f11;
        canvas.save();
        int childCount = parent.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = parent.getChildAt(i11);
            int childAdapterPosition = parent.getChildAdapterPosition(childAt);
            parent.getDecoratedBoundsWithMargins(childAt, this.bounds);
            float f12 = this.bounds.top;
            int i12 = this.strokeWidth;
            float f13 = f12 + i12;
            float f14 = r4.bottom - i12;
            FormConfig.Mode mode = this.formConfig.getMode();
            FormConfig.Mode mode2 = FormConfig.Mode.BORDERLESS_GRAY_FIELD;
            float f15 = (mode == mode2 ? this.dp4 : this.dp12) + f13;
            int i13 = this.dp12;
            float f16 = f14 - i13;
            float f17 = this.bounds.left;
            float f18 = f17 + i13;
            float width = parent.getWidth() - this.dp12;
            if (this.drawTop.invoke(Integer.valueOf(childAdapterPosition)).booleanValue()) {
                f7 = f18;
                canvas.drawLine(f7, f13, width, f13, this.paint);
            } else {
                f7 = f18;
            }
            if (this.drawBottom.invoke(Integer.valueOf(childAdapterPosition)).booleanValue()) {
                f11 = f17;
                canvas.drawLine(f7, f14, width, f14, this.paint);
            } else {
                f11 = f17;
            }
            if (this.drawLeft.invoke(Integer.valueOf(childAdapterPosition)).booleanValue()) {
                if (this.formConfig.getMode() == mode2) {
                    drawSeparatorBackground(canvas);
                }
                canvas.drawLine(f11, f15, f11, f16, this.paint);
            }
        }
        canvas.restore();
    }

    private final void drawSeparatorBackground(Canvas canvas) {
        int i11 = this.bounds.left;
        int i12 = this.dp4;
        float f7 = r0.bottom - this.dp8;
        Paint paint = new Paint(1);
        paint.setColor(g.b(this.context.getResources(), R$color.oz_semantic_bg_primary, this.context.getTheme()));
        paint.setStrokeWidth(paint.getStrokeWidth());
        Unit unit = Unit.f71690a;
        canvas.drawRect(i11 - i12, r0.top, i11 + i12, f7, paint);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        boolean booleanValue = this.leftEdgeView.invoke(Integer.valueOf(childAdapterPosition)).booleanValue();
        boolean booleanValue2 = this.rightEdgeView.invoke(Integer.valueOf(childAdapterPosition)).booleanValue();
        if (booleanValue) {
            outRect.left = this.horizontalEdgePadding;
        }
        if (booleanValue2) {
            outRect.right = this.horizontalEdgePadding;
        }
        if (!booleanValue) {
            outRect.left = this.betweenFieldsPadding;
        }
        outRect.bottom = this.bottomEdgePadding;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c11, parent, state);
        if (this.isDrawSeparator) {
            draw(c11, parent);
        }
    }
}
