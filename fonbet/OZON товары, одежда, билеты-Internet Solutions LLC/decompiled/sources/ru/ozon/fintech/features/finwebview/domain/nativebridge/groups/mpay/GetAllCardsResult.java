package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import H3.c;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/GetAllCardsResult;", "", "cards", "", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;", "<init>", "(Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetAllCardsResult {

    @NotNull
    private final List<MirPayCardStatus> cards;

    public GetAllCardsResult(@i(name = "cards") @NotNull List<MirPayCardStatus> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.cards = cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllCardsResult copy$default(GetAllCardsResult getAllCardsResult, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = getAllCardsResult.cards;
        }
        return getAllCardsResult.copy(list);
    }

    @NotNull
    public final List<MirPayCardStatus> component1() {
        return this.cards;
    }

    @NotNull
    public final GetAllCardsResult copy(@i(name = "cards") @NotNull List<MirPayCardStatus> cards) {
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new GetAllCardsResult(cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetAllCardsResult) && Intrinsics.d(this.cards, ((GetAllCardsResult) other).cards);
    }

    @NotNull
    public final List<MirPayCardStatus> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("GetAllCardsResult(cards=", ")", this.cards);
    }
}
