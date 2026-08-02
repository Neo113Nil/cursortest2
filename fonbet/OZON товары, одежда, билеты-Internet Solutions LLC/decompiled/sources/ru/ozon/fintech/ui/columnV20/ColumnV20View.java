package ru.ozon.fintech.ui.columnV20;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.CbottomWidgetsDelegate;
import ru.ozon.fintech.ui.utils.Common;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/ui/columnV20/ColumnV20View;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/columnV20/ColumnV20State;", "holder", "Landroid/widget/LinearLayout;", "cbottomWidgetsDelegate", "Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate;", "provideWidgetState", "provideActualWidget", "Landroid/view/View;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ColumnV20View extends WidgetFrameLayout {

    @NotNull
    private final CbottomWidgetsDelegate cbottomWidgetsDelegate;

    @NotNull
    private final LinearLayout holder;
    private ColumnV20State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColumnV20View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void bindState(@NotNull ColumnV20State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Common common = state.getCommon();
        ColumnV20State columnV20State = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, columnV20State != null ? columnV20State.getCommon() : null);
        Common common2 = state.getCommon();
        ColumnV20State columnV20State2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, columnV20State2 != null ? columnV20State2.getCommon() : null);
        Common common3 = state.getCommon();
        ColumnV20State columnV20State3 = this.state;
        CbottomExtKt.applyClickListener$default(this, common3, columnV20State3 != null ? columnV20State3.getCommon() : null, null, 4, null);
        CbottomWidgetsDelegate cbottomWidgetsDelegate = this.cbottomWidgetsDelegate;
        List<RecyclerItem> widgets = state.getWidgets();
        ColumnV20State columnV20State4 = this.state;
        cbottomWidgetsDelegate.applyWidgets(widgets, columnV20State4 != null ? columnV20State4.getWidgets() : null, this.holder);
        this.state = state;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    @NotNull
    public View provideActualWidget() {
        return this.holder;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ColumnV20View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState, reason: from getter */
    public ColumnV20State getState() {
        return this.state;
    }

    public /* synthetic */ ColumnV20View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColumnV20View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cbottomWidgetsDelegate = new CbottomWidgetsDelegate();
        LinearLayout linearLayout = new LinearLayout(context);
        this.holder = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getPaddingFrameLayout().addView(linearLayout);
        setTag("ColumnV20View");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
