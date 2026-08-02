package ru.ozon.fintech.features.operations.network;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/features/operations/network/BonusDto;", "", "amount", "", "type", "Lru/ozon/fintech/features/operations/network/BonusType;", "<init>", "(Ljava/lang/String;Lru/ozon/fintech/features/operations/network/BonusType;)V", "getAmount", "()Ljava/lang/String;", "getType", "()Lru/ozon/fintech/features/operations/network/BonusType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BonusDto {

    @NotNull
    private final String amount;

    @NotNull
    private final BonusType type;

    public BonusDto(@i(name = "amount") @NotNull String amount, @i(name = "type") @NotNull BonusType type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        this.amount = amount;
        this.type = type;
    }

    public static /* synthetic */ BonusDto copy$default(BonusDto bonusDto, String str, BonusType bonusType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bonusDto.amount;
        }
        if ((i11 & 2) != 0) {
            bonusType = bonusDto.type;
        }
        return bonusDto.copy(str, bonusType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BonusType getType() {
        return this.type;
    }

    @NotNull
    public final BonusDto copy(@i(name = "amount") @NotNull String amount, @i(name = "type") @NotNull BonusType type) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BonusDto(amount, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BonusDto)) {
            return false;
        }
        BonusDto bonusDto = (BonusDto) other;
        return Intrinsics.d(this.amount, bonusDto.amount) && this.type == bonusDto.type;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final BonusType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.amount.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "BonusDto(amount=" + this.amount + ", type=" + this.type + ")";
    }
}
