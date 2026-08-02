package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.view.cells;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import gk0.q;
import jk0.i;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001&B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\b*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsAdapter;", "Ljk0/i;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "Ljk0/j;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onView", "onClick", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/cell/CellView;", "applyMinSettings", "(Lru/ozon/uni/android/cell/CellView;)V", "holder", "onViewAttachedToWindow", "(Ljk0/j;)V", "onViewDetachedFromWindow", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Ljk0/j;", "position", "onBindViewHolder", "(Ljk0/j;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "cellSettings", "updateCellSettings", "(Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;)V", "Lkotlin/jvm/functions/Function1;", "cachedCellSettings", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellSettingsVO;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListItemsAdapter extends i<CellHorizontalListVI.CellVO, j> {
    private CellHorizontalListVI.CellSettingsVO cachedCellSettings;

    @NotNull
    private final Function1<AtomAction, Unit> onClick;

    @NotNull
    private final Function1<AtomAction, Unit> onView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/view/cells/CellHorizontalListItemsAdapter$Companion;", "", "<init>", "()V", "VIEW_TYPE_SINGLE_CELL", "", "VIEW_TYPE_MULTIPLE_CELLS", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellHorizontalListItemsAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> onView, @NotNull Function1<? super AtomAction, Unit> onClick) {
        super(new CellHorizontalListItemDiffCallback(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.onView = onView;
        this.onClick = onClick;
    }

    private final void applyMinSettings(CellView cellView) {
        CellHorizontalListVI.CellSettingsVO cellSettingsVO = this.cachedCellSettings;
        if (cellSettingsVO != null) {
            if (cellSettingsVO.getMinWidth() > 0) {
                cellView.setMinimumWidth(cellSettingsVO.getMinWidth());
            }
            if (cellSettingsVO.getMinHeight() > 0) {
                cellView.setMinimumHeight(cellSettingsVO.getMinHeight());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getShimmersCount() == 1 ? 0 : 1;
    }

    public final void updateCellSettings(CellHorizontalListVI.CellSettingsVO cellSettings) {
        this.cachedCellSettings = cellSettings;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof CellHorizontalListItemViewHolder) {
            CellHorizontalListVI.CellVO item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            ((CellHorizontalListItemViewHolder) holder).bind(item, this.onClick);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public j onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), parent.getContext());
        if (cellView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        cellView.setLayoutParams(new ViewGroup.LayoutParams(viewType == 0 ? -1 : -2, -2));
        applyMinSettings(cellView);
        return new CellHorizontalListItemViewHolder(cellView);
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((CellHorizontalListItemsAdapter) holder);
        if (holder instanceof CellHorizontalListItemViewHolder) {
            ((CellHorizontalListItemViewHolder) holder).setupOnView(this.onView);
        }
    }

    @Override // jk0.i, androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull j holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof CellHorizontalListItemViewHolder) {
            ((CellHorizontalListItemViewHolder) holder).clearOnView();
        }
        super.onViewDetachedFromWindow((CellHorizontalListItemsAdapter) holder);
    }
}
