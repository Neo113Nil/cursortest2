package ru.ozon.fintech.ui.utils;

import C.D;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.ActionResult2UI;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paddingFrameLayout", "Lru/ozon/fintech/ui/utils/SafeDrawForegroundFrameLayout;", "getPaddingFrameLayout", "()Lru/ozon/fintech/ui/utils/SafeDrawForegroundFrameLayout;", "currentVersionStamp", "getCurrentVersionStamp", "()I", "setCurrentVersionStamp", "(I)V", "clickListener", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WidgetFrameLayout extends FrameLayout {

    @NotNull
    private final View.OnClickListener clickListener;
    private int currentVersionStamp;

    @NotNull
    private final SafeDrawForegroundFrameLayout paddingFrameLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetFrameLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$1(WidgetFrameLayout widgetFrameLayout, View view) {
        Common common;
        WidgetState state = widgetFrameLayout.getState();
        if (state == null || (common = state.getCommon()) == null) {
            return;
        }
        common.getActionListener().invoke(new ActionResult2UI(common.getCbottomId(), common.getWidgetId(), ActionResult2UI.Type.CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, common.getComposerActionBehavior(), common.getComposerActionLink(), common.getComposerActionId(), common.getComposerActionParams(), common.getComposerTrackingInfo(), 65528, null));
    }

    @NotNull
    public final View.OnClickListener getClickListener() {
        return this.clickListener;
    }

    protected final int getCurrentVersionStamp() {
        return this.currentVersionStamp;
    }

    @NotNull
    public final SafeDrawForegroundFrameLayout getPaddingFrameLayout() {
        return this.paddingFrameLayout;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Common common;
        Rect margins;
        Common common2;
        Rect margins2;
        Common common3;
        Rect margins3;
        Common common4;
        Rect margins4;
        Common common5;
        Common common6;
        Common common7;
        WidgetState state = getState();
        Integer num = null;
        Float percentW = (state == null || (common7 = state.getCommon()) == null) ? null : common7.getPercentW();
        Integer ratioH = (state == null || (common6 = state.getCommon()) == null) ? null : common6.getRatioH();
        if (state != null && (common5 = state.getCommon()) != null) {
            num = common5.getRatioW();
        }
        int i11 = 0;
        int d11 = (state == null || (common4 = state.getCommon()) == null || (margins4 = common4.getMargins()) == null) ? 0 : D.d(margins4.left);
        int d12 = (state == null || (common3 = state.getCommon()) == null || (margins3 = common3.getMargins()) == null) ? 0 : D.d(margins3.right);
        int d13 = (state == null || (common2 = state.getCommon()) == null || (margins2 = common2.getMargins()) == null) ? 0 : D.d(margins2.top);
        if (state != null && (common = state.getCommon()) != null && (margins = common.getMargins()) != null) {
            i11 = D.d(margins.bottom);
        }
        View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        View.MeasureSpec.getMode(heightMeasureSpec);
        View.MeasureSpec.getSize(heightMeasureSpec);
        if (num == null || ratioH == null || percentW == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        } else {
            float f7 = size;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, ((int) (percentW.floatValue() * f7)) + d11 + d12), 1073741824), View.MeasureSpec.makeMeasureSpec(((int) ((ratioH.intValue() / num.intValue()) * percentW.floatValue() * f7)) + d13 + i11, 1073741824));
        }
    }

    public abstract View provideActualWidget();

    /* renamed from: provideWidgetState */
    public abstract WidgetState getState();

    protected final void setCurrentVersionStamp(int i11) {
        this.currentVersionStamp = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetFrameLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ WidgetFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetFrameLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        SafeDrawForegroundFrameLayout safeDrawForegroundFrameLayout = new SafeDrawForegroundFrameLayout(context, null, 0, 6, null);
        this.paddingFrameLayout = safeDrawForegroundFrameLayout;
        safeDrawForegroundFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        safeDrawForegroundFrameLayout.setForeground(new LayerDrawable(new DummyDrawable[]{new DummyDrawable(context), new DummyDrawable(context)}));
        addView(safeDrawForegroundFrameLayout);
        this.clickListener = new DS.a(this, 14);
    }
}
