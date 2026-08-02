package ru.ozon.app.android.search.widgets.insight.presentation;

import Bl.b;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/insight/presentation/InsightIslandView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "headerCell", "Lru/ozon/uni/android/cell/CellView;", "getHeaderCell", "()Lru/ozon/uni/android/cell/CellView;", "footerRv", "Landroidx/recyclerview/widget/RecyclerView;", "getFooterRv", "()Landroidx/recyclerview/widget/RecyclerView;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InsightIslandView extends LinearLayout {

    @NotNull
    private final RecyclerView footerRv;

    @NotNull
    private final CellView headerCell;

    public /* synthetic */ InsightIslandView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final RecyclerView getFooterRv() {
        return this.footerRv;
    }

    @NotNull
    public final CellView getHeaderCell() {
        return this.headerCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsightIslandView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        CellView cellView = (CellView) b.a(CellView.class, "type", q.f64554a, null);
        if (cellView == null) {
            context2 = context;
            cellView = new CellView(context2, null, 0, 0, null, 30, null);
        } else {
            context2 = context;
        }
        cellView.setId(R$id.searchInsightHeader);
        cellView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.headerCell = cellView;
        RecyclerView recyclerView = new RecyclerView(context2);
        recyclerView.setId(R$id.searchInsightFooter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.footerRv = recyclerView;
        addView(cellView);
        addView(recyclerView);
        setOrientation(1);
        setClipChildren(true);
        setClipToOutline(true);
    }
}
