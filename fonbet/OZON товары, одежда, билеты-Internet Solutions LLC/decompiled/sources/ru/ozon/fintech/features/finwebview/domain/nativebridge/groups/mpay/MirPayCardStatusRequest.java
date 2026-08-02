package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import An.C2439a;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatusRequest;", "", "bankId", "", "cards", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBankId", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayCardStatusRequest {

    @NotNull
    private final String bankId;

    @NotNull
    private final List<String> cards;

    public MirPayCardStatusRequest(@i(name = "bank_id") @NotNull String bankId, @i(name = "card_ids") @NotNull List<String> cards) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(cards, "cards");
        this.bankId = bankId;
        this.cards = cards;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MirPayCardStatusRequest copy$default(MirPayCardStatusRequest mirPayCardStatusRequest, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayCardStatusRequest.bankId;
        }
        if ((i11 & 2) != 0) {
            list = mirPayCardStatusRequest.cards;
        }
        return mirPayCardStatusRequest.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    @NotNull
    public final List<String> component2() {
        return this.cards;
    }

    @NotNull
    public final MirPayCardStatusRequest copy(@i(name = "bank_id") @NotNull String bankId, @i(name = "card_ids") @NotNull List<String> cards) {
        Intrinsics.checkNotNullParameter(bankId, "bankId");
        Intrinsics.checkNotNullParameter(cards, "cards");
        return new MirPayCardStatusRequest(bankId, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayCardStatusRequest)) {
            return false;
        }
        MirPayCardStatusRequest mirPayCardStatusRequest = (MirPayCardStatusRequest) other;
        return Intrinsics.d(this.bankId, mirPayCardStatusRequest.bankId) && Intrinsics.d(this.cards, mirPayCardStatusRequest.cards);
    }

    @NotNull
    public final String getBankId() {
        return this.bankId;
    }

    @NotNull
    public final List<String> getCards() {
        return this.cards;
    }

    public int hashCode() {
        return this.cards.hashCode() + (this.bankId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2439a.a("MirPayCardStatusRequest(bankId=", this.bankId, ", cards=", ")", this.cards);
    }
}
