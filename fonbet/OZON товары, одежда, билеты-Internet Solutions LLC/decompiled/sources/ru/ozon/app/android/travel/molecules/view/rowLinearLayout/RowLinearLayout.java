package ru.ozon.app.android.travel.molecules.view.rowLinearLayout;

import B0.C2454a;
import K00.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0002CDB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u001e\u0010!J\u000f\u0010\"\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b$\u0010%R*\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*\"\u0004\b7\u0010,R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/view/View;", "view", "removeView", "(Landroid/view/View;)V", "removeAllViews", "()V", "Landroid/view/ViewGroup$LayoutParams;", "generateLayoutParams", "(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "rowSpacing", "I", "getRowSpacing", "()I", "setRowSpacing", "(I)V", "", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout$RowInfo;", "measuredRows", "Ljava/util/Map;", "getMeasuredRows$molecules_prodGoogleAllVendorsRelease", "()Ljava/util/Map;", "setMeasuredRows$molecules_prodGoogleAllVendorsRelease", "(Ljava/util/Map;)V", "measuredRowsMaxIndex", "getMeasuredRowsMaxIndex$molecules_prodGoogleAllVendorsRelease", "setMeasuredRowsMaxIndex$molecules_prodGoogleAllVendorsRelease", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearMeasureManager;", "measureManager$delegate", "LSc/j;", "getMeasureManager", "()Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearMeasureManager;", "measureManager", "Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayoutManager;", "layoutManager$delegate", "getLayoutManager", "()Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayoutManager;", "layoutManager", "LayoutParams", "RowInfo", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class RowLinearLayout extends ViewGroup {

    /* renamed from: layoutManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layoutManager;

    /* renamed from: measureManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j measureManager;

    @NotNull
    private Map<Integer, RowInfo> measuredRows;
    private int measuredRowsMaxIndex;
    private int rowSpacing;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout$RowInfo;", "", "", "Landroid/view/View;", "children", "", "rowWidth", "rowHeight", "<init>", "(Ljava/util/List;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "I", "getRowWidth", "setRowWidth", "(I)V", "getRowHeight", "setRowHeight", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RowInfo {

        @NotNull
        private List<View> children;
        private int rowHeight;
        private int rowWidth;

        public RowInfo() {
            this(null, 0, 0, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowInfo)) {
                return false;
            }
            RowInfo rowInfo = (RowInfo) other;
            return Intrinsics.d(this.children, rowInfo.children) && this.rowWidth == rowInfo.rowWidth && this.rowHeight == rowInfo.rowHeight;
        }

        @NotNull
        public final List<View> getChildren() {
            return this.children;
        }

        public final int getRowHeight() {
            return this.rowHeight;
        }

        public final int getRowWidth() {
            return this.rowWidth;
        }

        public int hashCode() {
            return Integer.hashCode(this.rowHeight) + C2454a.a(this.rowWidth, this.children.hashCode() * 31, 31);
        }

        public final void setRowHeight(int i11) {
            this.rowHeight = i11;
        }

        public final void setRowWidth(int i11) {
            this.rowWidth = i11;
        }

        @NotNull
        public String toString() {
            List<View> list = this.children;
            int i11 = this.rowWidth;
            int i12 = this.rowHeight;
            StringBuilder sb2 = new StringBuilder("RowInfo(children=");
            sb2.append(list);
            sb2.append(", rowWidth=");
            sb2.append(i11);
            sb2.append(", rowHeight=");
            return b.e(i12, ")", sb2);
        }

        public RowInfo(@NotNull List<View> children, int i11, int i12) {
            Intrinsics.checkNotNullParameter(children, "children");
            this.children = children;
            this.rowWidth = i11;
            this.rowHeight = i12;
        }

        public /* synthetic */ RowInfo(List list, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new ArrayList() : list, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RowLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RowLinearLayoutManager getLayoutManager() {
        return (RowLinearLayoutManager) this.layoutManager.getValue();
    }

    private final RowLinearMeasureManager getMeasureManager() {
        return (RowLinearMeasureManager) this.measureManager.getValue();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new LayoutParams(context, attrs);
    }

    @NotNull
    public final Map<Integer, RowInfo> getMeasuredRows$molecules_prodGoogleAllVendorsRelease() {
        return this.measuredRows;
    }

    /* renamed from: getMeasuredRowsMaxIndex$molecules_prodGoogleAllVendorsRelease, reason: from getter */
    public final int getMeasuredRowsMaxIndex() {
        return this.measuredRowsMaxIndex;
    }

    public final int getRowSpacing() {
        return this.rowSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        getLayoutManager().layout(this);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Pair<Integer, Integer> measure = getMeasureManager().measure(this, widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(measure.a().intValue(), measure.b().intValue());
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        this.measuredRows = U.c();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (view == null) {
            return;
        }
        Iterator<Map.Entry<Integer, RowInfo>> it = this.measuredRows.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getChildren().remove(view);
        }
    }

    public final void setMeasuredRows$molecules_prodGoogleAllVendorsRelease(@NotNull Map<Integer, RowInfo> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.measuredRows = map;
    }

    public final void setMeasuredRowsMaxIndex$molecules_prodGoogleAllVendorsRelease(int i11) {
        this.measuredRowsMaxIndex = i11;
    }

    public final void setRowSpacing(int i11) {
        this.rowSpacing = i11;
        requestLayout();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/rowLinearLayout/RowLinearLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "", "width", "height", "<init>", "(II)V", "Landroid/view/ViewGroup$LayoutParams;", "source", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "row", "I", "getRow", "()I", "setRow", "(I)V", "", "weight", "F", "getWeight", "()F", "setWeight", "(F)V", "gravity", "getGravity", "setGravity", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        private int gravity;
        private int row;
        private float weight;

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.gravity = 48;
        }

        public final int getGravity() {
            return this.gravity;
        }

        public final int getRow() {
            return this.row;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void setGravity(int i11) {
            this.gravity = i11;
        }

        public final void setRow(int i11) {
            this.row = i11;
        }

        public final void setWeight(float f7) {
            this.weight = f7;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(@NotNull ViewGroup.LayoutParams source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.gravity = 48;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LayoutParams(@NotNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
            this.gravity = 48;
        }
    }

    public /* synthetic */ RowLinearLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams == null ? generateDefaultLayoutParams() : new LayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowLinearLayout(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.measuredRows = U.c();
        this.measuredRowsMaxIndex = -1;
        this.measureManager = LazyUtilsKt.unsafeLazy(RowLinearLayout$measureManager$2.INSTANCE);
        this.layoutManager = LazyUtilsKt.unsafeLazy(RowLinearLayout$layoutManager$2.INSTANCE);
    }
}
