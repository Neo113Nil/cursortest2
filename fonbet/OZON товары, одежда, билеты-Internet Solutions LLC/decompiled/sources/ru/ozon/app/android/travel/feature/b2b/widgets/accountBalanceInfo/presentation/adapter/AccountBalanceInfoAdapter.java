package ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.adapter;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.accountBalanceInfo.presentation.AccountBalanceInfoVO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/adapter/AccountBalanceInfoAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/accountBalanceInfo/presentation/AccountBalanceInfoVO$TextInfoCellsVO;", "Landroidx/recyclerview/widget/RecyclerView$u;", "pool", "", "verticalPadding", "horizontalPadding", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$u;II)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountBalanceInfoAdapter extends AsyncListDifferDelegationAdapter<AccountBalanceInfoVO.TextInfoCellsVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountBalanceInfoAdapter(@NotNull RecyclerView.u pool, int i11, int i12) {
        super(new AccountBalanceInfoDiffUtilItemCallback());
        Intrinsics.checkNotNullParameter(pool, "pool");
        this.delegatesManager.addDelegate(AccountBalanceInfoAdapterDelegateKt.accountBalanceInfoAdapterDelegate(pool, i11, i12));
    }
}
