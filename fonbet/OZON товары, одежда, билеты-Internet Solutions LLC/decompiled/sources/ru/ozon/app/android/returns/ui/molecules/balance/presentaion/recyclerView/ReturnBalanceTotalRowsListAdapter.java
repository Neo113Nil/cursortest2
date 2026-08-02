package ru.ozon.app.android.returns.ui.molecules.balance.presentaion.recyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.databinding.ReturnBalanceTotalRowBinding;
import ru.ozon.app.android.returns.ui.molecules.balance.viewObject.BalanceRow;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/ui/molecules/balance/viewObject/BalanceRow;", "Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnCreationTotalRowViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnBalanceTotalRowsListAdapter extends t<BalanceRow, ReturnCreationTotalRowViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int MIN_HEIGHT = UiExtKt.toPx(32);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/balance/presentaion/recyclerView/ReturnBalanceTotalRowsListAdapter$Companion;", "", "<init>", "()V", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReturnBalanceTotalRowsListAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new ReturnCreationTotalRowsDiffCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ReturnCreationTotalRowViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        BalanceRow item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ReturnCreationTotalRowViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ReturnBalanceTotalRowBinding inflate = ReturnBalanceTotalRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        inflate.getConstraintLayout().setMinHeight(MIN_HEIGHT);
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return new ReturnCreationTotalRowViewHolder(inflate, this.actionHandler);
    }
}
