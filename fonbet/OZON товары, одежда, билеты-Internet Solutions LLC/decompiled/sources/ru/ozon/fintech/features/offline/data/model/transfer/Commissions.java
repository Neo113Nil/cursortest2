package ru.ozon.fintech.features.offline.data.model.transfer;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "", "receiverCommonAmountCents", "", "receiverPriviligedAmountCents", "senderCommonAmountCents", "senderPriviligedAmountCents", "<init>", "(IIII)V", "getReceiverCommonAmountCents", "()I", "getReceiverPriviligedAmountCents", "getSenderCommonAmountCents", "getSenderPriviligedAmountCents", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Commissions {

    @i(name = "receiverCommonAmountCents")
    private final int receiverCommonAmountCents;

    @i(name = "receiverPriviligedAmountCents")
    private final int receiverPriviligedAmountCents;

    @i(name = "senderCommonAmountCents")
    private final int senderCommonAmountCents;

    @i(name = "senderPriviligedAmountCents")
    private final int senderPriviligedAmountCents;

    public Commissions(int i11, int i12, int i13, int i14) {
        this.receiverCommonAmountCents = i11;
        this.receiverPriviligedAmountCents = i12;
        this.senderCommonAmountCents = i13;
        this.senderPriviligedAmountCents = i14;
    }

    public static /* synthetic */ Commissions copy$default(Commissions commissions, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = commissions.receiverCommonAmountCents;
        }
        if ((i15 & 2) != 0) {
            i12 = commissions.receiverPriviligedAmountCents;
        }
        if ((i15 & 4) != 0) {
            i13 = commissions.senderCommonAmountCents;
        }
        if ((i15 & 8) != 0) {
            i14 = commissions.senderPriviligedAmountCents;
        }
        return commissions.copy(i11, i12, i13, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final int getReceiverCommonAmountCents() {
        return this.receiverCommonAmountCents;
    }

    /* renamed from: component2, reason: from getter */
    public final int getReceiverPriviligedAmountCents() {
        return this.receiverPriviligedAmountCents;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSenderCommonAmountCents() {
        return this.senderCommonAmountCents;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSenderPriviligedAmountCents() {
        return this.senderPriviligedAmountCents;
    }

    @NotNull
    public final Commissions copy(int receiverCommonAmountCents, int receiverPriviligedAmountCents, int senderCommonAmountCents, int senderPriviligedAmountCents) {
        return new Commissions(receiverCommonAmountCents, receiverPriviligedAmountCents, senderCommonAmountCents, senderPriviligedAmountCents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Commissions)) {
            return false;
        }
        Commissions commissions = (Commissions) other;
        return this.receiverCommonAmountCents == commissions.receiverCommonAmountCents && this.receiverPriviligedAmountCents == commissions.receiverPriviligedAmountCents && this.senderCommonAmountCents == commissions.senderCommonAmountCents && this.senderPriviligedAmountCents == commissions.senderPriviligedAmountCents;
    }

    public final int getReceiverCommonAmountCents() {
        return this.receiverCommonAmountCents;
    }

    public final int getReceiverPriviligedAmountCents() {
        return this.receiverPriviligedAmountCents;
    }

    public final int getSenderCommonAmountCents() {
        return this.senderCommonAmountCents;
    }

    public final int getSenderPriviligedAmountCents() {
        return this.senderPriviligedAmountCents;
    }

    public int hashCode() {
        return Integer.hashCode(this.senderPriviligedAmountCents) + C2454a.a(this.senderCommonAmountCents, C2454a.a(this.receiverPriviligedAmountCents, Integer.hashCode(this.receiverCommonAmountCents) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return P.a(this.senderCommonAmountCents, this.senderPriviligedAmountCents, ", senderPriviligedAmountCents=", ")", C2438a.a("Commissions(receiverCommonAmountCents=", this.receiverCommonAmountCents, ", receiverPriviligedAmountCents=", ", senderCommonAmountCents=", this.receiverPriviligedAmountCents));
    }
}
