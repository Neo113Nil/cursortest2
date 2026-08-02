package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelPersonalAccountReplenishment/v2/presentation/adapter/TravelPersonalAccountReplenishmentAdapter;", "Lru/ozon/app/android/travel/utils/coroutineAdapter/CoroutineListDifferAdapter;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "actionHandler", "Lkotlin/Function2;", "", "", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelPersonalAccountReplenishmentAdapter extends CoroutineListDifferAdapter<TagV3Atom.TagAtom> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPersonalAccountReplenishmentAdapter(@NotNull Function2<? super String, ? super Integer, Unit> actionHandler) {
        super(new TravelPersonalAccountReplenishmentItemCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.delegatesManager.addDelegate(TravelPersonalAccountReplenishmentAdapterDelegateKt.travelPersonalAccountReplenishmentAdapterDelegate(actionHandler));
    }
}
