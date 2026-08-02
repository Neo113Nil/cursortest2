package ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain;

import Sc.r;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LSc/r;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/RequestCardsResponse;", "requestCards-gIAlu-s", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requestCards", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/SendReactionResponse;", "sendReaction-gIAlu-s", "sendReaction", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MatchShoppingCardsInteractor {
    /* renamed from: requestCards-gIAlu-s */
    Object mo809requestCardsgIAlus(@NotNull AtomActionDTO atomActionDTO, @NotNull d<? super r<RequestCardsResponse>> dVar);

    /* renamed from: sendReaction-gIAlu-s */
    Object mo810sendReactiongIAlus(@NotNull AtomActionDTO atomActionDTO, @NotNull d<? super r<SendReactionResponse>> dVar);
}
