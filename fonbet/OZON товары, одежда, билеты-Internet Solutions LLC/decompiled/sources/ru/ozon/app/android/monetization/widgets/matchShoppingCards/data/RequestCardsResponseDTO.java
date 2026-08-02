package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/RequestCardsResponseDTO;", "", "cards", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "nextPageAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getCards", "()Ljava/util/List;", "getNextPageAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequestCardsResponseDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<MatchShoppingCardsDTO.Card> cards;
    private final AtomActionDTO nextPageAction;

    public RequestCardsResponseDTO(@NotNull List<MatchShoppingCardsDTO.Card> cards, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.cards = cards;
        this.nextPageAction = atomActionDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestCardsResponseDTO copy$default(RequestCardsResponseDTO requestCardsResponseDTO, List list, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = requestCardsResponseDTO.cards;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = requestCardsResponseDTO.nextPageAction;
        }
        return requestCardsResponseDTO.copy(list, atomActionDTO);
    }

    @NotNull
    public final List<MatchShoppingCardsDTO.Card> component1() {
        return this.cards;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getNextPageAction() {
        return this.nextPageAction;
    }

    @NotNull
    public final RequestCardsResponseDTO copy(@NotNull List<MatchShoppingCardsDTO.Card> cards, AtomActionDTO nextPageAction) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new RequestCardsResponseDTO(cards, nextPageAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestCardsResponseDTO)) {
            return false;
        }
        RequestCardsResponseDTO requestCardsResponseDTO = (RequestCardsResponseDTO) other;
        return Intrinsics.d(this.cards, requestCardsResponseDTO.cards) && Intrinsics.d(this.nextPageAction, requestCardsResponseDTO.nextPageAction);
    }

    @NotNull
    public final List<MatchShoppingCardsDTO.Card> getCards() {
        return this.cards;
    }

    public final AtomActionDTO getNextPageAction() {
        return this.nextPageAction;
    }

    public int hashCode() {
        int hashCode = this.cards.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.nextPageAction;
        return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "RequestCardsResponseDTO(cards=" + this.cards + ", nextPageAction=" + this.nextPageAction + ")";
    }
}
