package ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv;

import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.BaseStepItemViewHolder;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.rv.holders.StepItemHolderHelper;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/StepItemsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/StepItemHolderHelper;", "holderHelper", "<init>", "(Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/StepItemHolderHelper;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/BaseStepItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/presentation/rv/holders/StepItemHolderHelper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepItemsAdapter extends t<AtomDTO, BaseStepItemViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final StepItemHolderHelper holderHelper;

    public /* synthetic */ StepItemsAdapter(Function1 function1, StepItemHolderHelper stepItemHolderHelper, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i11 & 2) != 0 ? new StepItemHolderHelper() : stepItemHolderHelper);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        StepItemHolderHelper stepItemHolderHelper = this.holderHelper;
        AtomDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return stepItemHolderHelper.getViewTypeForAtom(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseStepItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AtomDTO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseStepItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.holderHelper.createViewHolderByType(ViewGroupExtKt.inflate(parent, R$layout.selector_data_mobile_step_item), viewType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StepItemsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull StepItemHolderHelper holderHelper) {
        super(new StepItemDiffUtil());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(holderHelper, "holderHelper");
        this.actionHandler = actionHandler;
        this.holderHelper = holderHelper;
    }
}
