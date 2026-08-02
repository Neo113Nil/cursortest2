package ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.adapter;

import androidx.recyclerview.widget.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.PromoBannerB2BVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/adapter/PromoBannerB2BAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoBannerB2BAdapter extends AsyncListDifferDelegationAdapter<PromoBannerB2BVO.BannerVO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoBannerB2BAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new i.d<PromoBannerB2BVO.BannerVO>() { // from class: ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.adapter.PromoBannerB2BAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(PromoBannerB2BVO.BannerVO oldItem, PromoBannerB2BVO.BannerVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(PromoBannerB2BVO.BannerVO oldItem, PromoBannerB2BVO.BannerVO newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.delegatesManager.addDelegate(PromoBannerB2BAdapterDelegateKt.promoBannerB2BAdapterDelegate(onAction));
    }
}
