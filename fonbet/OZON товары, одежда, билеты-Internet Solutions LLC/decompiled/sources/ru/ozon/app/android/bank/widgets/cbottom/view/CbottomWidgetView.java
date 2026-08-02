package ru.ozon.app.android.bank.widgets.cbottom.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
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
import ru.ozon.fintech.ui.utils.WidgetState;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView;", "Lru/ozon/fintech/ui/utils/WidgetFrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "holder", "Landroid/widget/LinearLayout;", "state", "Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView$CbottomWidgetViewState;", "cbottomWidgetsDelegate", "Lru/ozon/fintech/ui/utils/CbottomWidgetsDelegate;", "provideActualWidget", "Landroid/view/View;", "provideWidgetState", "Lru/ozon/fintech/ui/utils/WidgetState;", "bindState", "", "newState", "CbottomWidgetViewState", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetView extends WidgetFrameLayout {

    @NotNull
    private final CbottomWidgetsDelegate cbottomWidgetsDelegate;

    @NotNull
    private final LinearLayout holder;
    private CbottomWidgetViewState state;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView$CbottomWidgetViewState;", "Lru/ozon/fintech/ui/utils/WidgetState;", "Lru/ozon/fintech/ui/utils/Common;", "common", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "widgets", "<init>", "(Lru/ozon/fintech/ui/utils/Common;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/fintech/ui/utils/Common;", "getCommon", "()Lru/ozon/fintech/ui/utils/Common;", "Ljava/util/List;", "getWidgets", "()Ljava/util/List;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CbottomWidgetViewState implements WidgetState {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final Common common;

        @NotNull
        private final List<RecyclerItem> widgets;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView$CbottomWidgetViewState$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/bank/widgets/cbottom/view/CbottomWidgetView$CbottomWidgetViewState;", "id", "", "cbottomItems", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "backgroundColor", "", "widgetsPadding", "Landroid/graphics/Rect;", "backgroundRadius", "", "widgetsMargin", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CbottomWidgetViewState create(long id2, @NotNull List<? extends RecyclerItem> cbottomItems, String backgroundColor, Rect widgetsPadding, List<Integer> backgroundRadius, Rect widgetsMargin) {
                Intrinsics.checkNotNullParameter(cbottomItems, "cbottomItems");
                return new CbottomWidgetViewState(new Common(String.valueOf(id2), String.valueOf(id2), null, null, null, null, null, CbottomWidgetView$CbottomWidgetViewState$Companion$create$1.INSTANCE, null, null, null, null, null, widgetsMargin, null, null, widgetsPadding, backgroundRadius, backgroundColor, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435456, 1, null), cbottomItems);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CbottomWidgetViewState(@NotNull Common common, @NotNull List<? extends RecyclerItem> widgets) {
            Intrinsics.checkNotNullParameter(common, "common");
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            this.common = common;
            this.widgets = widgets;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CbottomWidgetViewState)) {
                return false;
            }
            CbottomWidgetViewState cbottomWidgetViewState = (CbottomWidgetViewState) other;
            return Intrinsics.d(this.common, cbottomWidgetViewState.common) && Intrinsics.d(this.widgets, cbottomWidgetViewState.widgets);
        }

        @Override // ru.ozon.fintech.ui.utils.WidgetState
        @NotNull
        public Common getCommon() {
            return this.common;
        }

        @NotNull
        public final List<RecyclerItem> getWidgets() {
            return this.widgets;
        }

        public int hashCode() {
            return this.widgets.hashCode() + (this.common.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "CbottomWidgetViewState(common=" + this.common + ", widgets=" + this.widgets + ")";
        }
    }

    public /* synthetic */ CbottomWidgetView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bindState(@NotNull CbottomWidgetViewState newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        Common common = newState.getCommon();
        CbottomWidgetViewState cbottomWidgetViewState = this.state;
        CbottomExtKt.applyCbottomLayoutParams(this, common, cbottomWidgetViewState != null ? cbottomWidgetViewState.getCommon() : null);
        Common common2 = newState.getCommon();
        CbottomWidgetViewState cbottomWidgetViewState2 = this.state;
        CbottomExtKt.applyCbottomBackground(this, common2, cbottomWidgetViewState2 != null ? cbottomWidgetViewState2.getCommon() : null);
        CbottomWidgetsDelegate cbottomWidgetsDelegate = this.cbottomWidgetsDelegate;
        List<RecyclerItem> widgets = newState.getWidgets();
        CbottomWidgetViewState cbottomWidgetViewState3 = this.state;
        cbottomWidgetsDelegate.applyWidgets(widgets, cbottomWidgetViewState3 != null ? cbottomWidgetViewState3.getWidgets() : null, this.holder);
        this.state = newState;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    public View provideActualWidget() {
        return this.holder;
    }

    @Override // ru.ozon.fintech.ui.utils.WidgetFrameLayout
    /* renamed from: provideWidgetState */
    public WidgetState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CbottomWidgetView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout linearLayout = new LinearLayout(context);
        this.holder = linearLayout;
        this.cbottomWidgetsDelegate = new CbottomWidgetsDelegate();
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getPaddingFrameLayout().addView(linearLayout);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
