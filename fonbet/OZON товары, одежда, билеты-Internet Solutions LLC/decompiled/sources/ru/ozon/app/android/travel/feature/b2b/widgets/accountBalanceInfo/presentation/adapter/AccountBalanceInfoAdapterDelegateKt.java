package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AdapterDelegate;
import ru.ozon.app.android.adapterdelegates.dsl.DslViewBindingListAdapterDelegate;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.AccountBalanceInfoVO;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "", "verticalPadding", "horizontalPadding", "Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO$TextInfoCellsVO;", "accountBalanceInfoAdapterDelegate", "(Landroidx/recyclerview/widget/RecyclerView$u;II)Lru/ozon/app/android/adapterdelegates/AdapterDelegate;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountBalanceInfoAdapterDelegateKt {
    @NotNull
    public static final AdapterDelegate<List<AccountBalanceInfoVO.TextInfoCellsVO>> accountBalanceInfoAdapterDelegate(@NotNull RecyclerView.u pool, int i11, int i12) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new DslViewBindingListAdapterDelegate(new AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$1(i12, i11, pool), AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$$inlined$adapterDelegateViewBinding$default$1.INSTANCE, AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$2.INSTANCE, AccountBalanceInfoAdapterDelegateKt$accountBalanceInfoAdapterDelegate$$inlined$adapterDelegateViewBinding$default$2.INSTANCE);
    }
}
