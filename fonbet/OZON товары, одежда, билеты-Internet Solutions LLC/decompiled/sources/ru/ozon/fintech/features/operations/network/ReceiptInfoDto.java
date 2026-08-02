package ru.ozon.fintech.features.operations.network;

import E70.b;
import E70.f;
import G.g;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ~\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b0\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b5\u0010\u0013R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001f¨\u00068"}, d2 = {"Lru/ozon/fintech/features/operations/network/ReceiptInfoDto;", "", "", "id", "amount", "counterPartyName", "counterPartyPhone", "counterPartyBank", "time", "logoUrl", "sbpId", "LE70/f;", "status", "message", "LE70/b;", "sourceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/f;Ljava/lang/String;LE70/b;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()LE70/f;", "component10", "component11", "()LE70/b;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/f;Ljava/lang/String;LE70/b;)Lru/ozon/fintech/features/operations/network/ReceiptInfoDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getAmount", "getCounterPartyName", "getCounterPartyPhone", "getCounterPartyBank", "getTime", "getLogoUrl", "getSbpId", "LE70/f;", "getStatus", "getMessage", "LE70/b;", "getSourceType", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReceiptInfoDto {

    @NotNull
    private final String amount;

    @NotNull
    private final String counterPartyBank;

    @NotNull
    private final String counterPartyName;

    @NotNull
    private final String counterPartyPhone;

    @NotNull
    private final String id;

    @NotNull
    private final String logoUrl;

    @NotNull
    private final String message;

    @NotNull
    private final String sbpId;

    @NotNull
    private final b sourceType;

    @NotNull
    private final f status;

    @NotNull
    private final String time;

    public ReceiptInfoDto(@i(name = "id") @NotNull String id2, @i(name = "amount") @NotNull String amount, @i(name = "counterPartyName") @NotNull String counterPartyName, @i(name = "counterPartyPhone") @NotNull String counterPartyPhone, @i(name = "counterPartyBank") @NotNull String counterPartyBank, @i(name = "time") @NotNull String time, @i(name = "logoUrl") @NotNull String logoUrl, @i(name = "sbpId") @NotNull String sbpId, @i(name = "status") @NotNull f status, @i(name = "message") @NotNull String message, @i(name = "sourceType") @NotNull b sourceType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(counterPartyName, "counterPartyName");
        Intrinsics.checkNotNullParameter(counterPartyPhone, "counterPartyPhone");
        Intrinsics.checkNotNullParameter(counterPartyBank, "counterPartyBank");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(sbpId, "sbpId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.id = id2;
        this.amount = amount;
        this.counterPartyName = counterPartyName;
        this.counterPartyPhone = counterPartyPhone;
        this.counterPartyBank = counterPartyBank;
        this.time = time;
        this.logoUrl = logoUrl;
        this.sbpId = sbpId;
        this.status = status;
        this.message = message;
        this.sourceType = sourceType;
    }

    public static /* synthetic */ ReceiptInfoDto copy$default(ReceiptInfoDto receiptInfoDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, f fVar, String str9, b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = receiptInfoDto.id;
        }
        if ((i11 & 2) != 0) {
            str2 = receiptInfoDto.amount;
        }
        if ((i11 & 4) != 0) {
            str3 = receiptInfoDto.counterPartyName;
        }
        if ((i11 & 8) != 0) {
            str4 = receiptInfoDto.counterPartyPhone;
        }
        if ((i11 & 16) != 0) {
            str5 = receiptInfoDto.counterPartyBank;
        }
        if ((i11 & 32) != 0) {
            str6 = receiptInfoDto.time;
        }
        if ((i11 & 64) != 0) {
            str7 = receiptInfoDto.logoUrl;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str8 = receiptInfoDto.sbpId;
        }
        if ((i11 & 256) != 0) {
            fVar = receiptInfoDto.status;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str9 = receiptInfoDto.message;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            bVar = receiptInfoDto.sourceType;
        }
        String str10 = str9;
        b bVar2 = bVar;
        String str11 = str8;
        f fVar2 = fVar;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return receiptInfoDto.copy(str, str2, str15, str4, str14, str12, str13, str11, fVar2, str10, bVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final b getSourceType() {
        return this.sourceType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCounterPartyName() {
        return this.counterPartyName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCounterPartyPhone() {
        return this.counterPartyPhone;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCounterPartyBank() {
        return this.counterPartyBank;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getSbpId() {
        return this.sbpId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final f getStatus() {
        return this.status;
    }

    @NotNull
    public final ReceiptInfoDto copy(@i(name = "id") @NotNull String id2, @i(name = "amount") @NotNull String amount, @i(name = "counterPartyName") @NotNull String counterPartyName, @i(name = "counterPartyPhone") @NotNull String counterPartyPhone, @i(name = "counterPartyBank") @NotNull String counterPartyBank, @i(name = "time") @NotNull String time, @i(name = "logoUrl") @NotNull String logoUrl, @i(name = "sbpId") @NotNull String sbpId, @i(name = "status") @NotNull f status, @i(name = "message") @NotNull String message, @i(name = "sourceType") @NotNull b sourceType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(counterPartyName, "counterPartyName");
        Intrinsics.checkNotNullParameter(counterPartyPhone, "counterPartyPhone");
        Intrinsics.checkNotNullParameter(counterPartyBank, "counterPartyBank");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(sbpId, "sbpId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        return new ReceiptInfoDto(id2, amount, counterPartyName, counterPartyPhone, counterPartyBank, time, logoUrl, sbpId, status, message, sourceType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiptInfoDto)) {
            return false;
        }
        ReceiptInfoDto receiptInfoDto = (ReceiptInfoDto) other;
        return Intrinsics.d(this.id, receiptInfoDto.id) && Intrinsics.d(this.amount, receiptInfoDto.amount) && Intrinsics.d(this.counterPartyName, receiptInfoDto.counterPartyName) && Intrinsics.d(this.counterPartyPhone, receiptInfoDto.counterPartyPhone) && Intrinsics.d(this.counterPartyBank, receiptInfoDto.counterPartyBank) && Intrinsics.d(this.time, receiptInfoDto.time) && Intrinsics.d(this.logoUrl, receiptInfoDto.logoUrl) && Intrinsics.d(this.sbpId, receiptInfoDto.sbpId) && this.status == receiptInfoDto.status && Intrinsics.d(this.message, receiptInfoDto.message) && this.sourceType == receiptInfoDto.sourceType;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCounterPartyBank() {
        return this.counterPartyBank;
    }

    @NotNull
    public final String getCounterPartyName() {
        return this.counterPartyName;
    }

    @NotNull
    public final String getCounterPartyPhone() {
        return this.counterPartyPhone;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getSbpId() {
        return this.sbpId;
    }

    @NotNull
    public final b getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final f getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + g.a((this.status.hashCode() + g.a(g.a(g.a(g.a(g.a(g.a(g.a(this.id.hashCode() * 31, 31, this.amount), 31, this.counterPartyName), 31, this.counterPartyPhone), 31, this.counterPartyBank), 31, this.time), 31, this.logoUrl), 31, this.sbpId)) * 31, 31, this.message);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.amount;
        String str3 = this.counterPartyName;
        String str4 = this.counterPartyPhone;
        String str5 = this.counterPartyBank;
        String str6 = this.time;
        String str7 = this.logoUrl;
        String str8 = this.sbpId;
        f fVar = this.status;
        String str9 = this.message;
        b bVar = this.sourceType;
        StringBuilder d11 = C3660k.d("ReceiptInfoDto(id=", str, ", amount=", str2, ", counterPartyName=");
        a.h(d11, str3, ", counterPartyPhone=", str4, ", counterPartyBank=");
        a.h(d11, str5, ", time=", str6, ", logoUrl=");
        a.h(d11, str7, ", sbpId=", str8, ", status=");
        d11.append(fVar);
        d11.append(", message=");
        d11.append(str9);
        d11.append(", sourceType=");
        d11.append(bVar);
        d11.append(")");
        return d11.toString();
    }
}
