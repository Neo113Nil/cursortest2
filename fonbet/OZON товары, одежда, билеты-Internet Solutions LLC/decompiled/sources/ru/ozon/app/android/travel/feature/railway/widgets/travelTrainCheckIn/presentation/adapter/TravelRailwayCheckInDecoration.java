package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.presentation.adapter;

import T7.P;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/presentation/adapter/TravelRailwayCheckInDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "", "smallMargin", "I", "mediumMargin", "largeMargin", "lastItemMargin", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwayCheckInDecoration extends RecyclerView.n {
    private final int largeMargin;
    private final int lastItemMargin;
    private final int mediumMargin;
    private final int smallMargin;

    public TravelRailwayCheckInDecoration(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.smallMargin = ResourceExtKt.toPx(4, context);
        this.mediumMargin = ResourceExtKt.toPx(8, context);
        this.largeMargin = ResourceExtKt.toPx(16, context);
        this.lastItemMargin = ResourceExtKt.toPx(10, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        RecyclerView.g adapter;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        RecyclerView.C e11 = P.e(parent, "parent", state, "state", view);
        Integer valueOf = e11 != null ? Integer.valueOf(e11.getItemViewType()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i11 = this.largeMargin;
            outRect.set(i11, i11, i11, i11);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            int i12 = this.largeMargin;
            int i13 = this.smallMargin;
            outRect.set(i12, i13, i12, i13);
        } else if (valueOf != null && valueOf.intValue() == 1 && (adapter = parent.getAdapter()) != null) {
            outRect.bottom = valueOf.intValue() != adapter.getItemViewType(e11.getAdapterPosition() + 1) ? this.mediumMargin : 0;
        }
        if (parent.getChildAdapterPosition(view) == state.b() - 1) {
            outRect.bottom = this.lastItemMargin;
        }
    }
}
