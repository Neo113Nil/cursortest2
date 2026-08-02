package ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.rv;

import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.databinding.SelectorDataAllStepCellItemBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepInfoAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepCellViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepCellViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/rv/AllStepCellViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AllStepInfoAdapter extends t<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault, AllStepCellViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AllStepInfoAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new DiffUtil());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull AllStepCellViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public AllStepCellViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SelectorDataAllStepCellItemBinding bind = SelectorDataAllStepCellItemBinding.bind(ViewGroupExtKt.inflate(parent, R$layout.selector_data_all_step_cell_item));
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new AllStepCellViewHolder(bind);
    }
}
