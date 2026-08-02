package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.adapterdelegates.AsyncListDifferDelegationAdapter;
import ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.list.TravelDocumentsToEmailListVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/adapter/TravelEmailAdapter;", "Lru/ozon/app/android/adapterdelegates/AsyncListDifferDelegationAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/list/TravelDocumentsToEmailListVO$Email;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TravelEmailAdapter extends AsyncListDifferDelegationAdapter<TravelDocumentsToEmailListVO.Email> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelEmailAdapter(@NotNull Function1<? super AtomAction, Unit> onAction) {
        super(new TravelEmailItemCallback());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.delegatesManager.addDelegate(TravelEmailAdapterDelegateKt.travelEmailAdapterDelegate(onAction));
    }
}
