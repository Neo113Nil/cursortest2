package ru.ozon.fintech.features.operations.network;

import E70.c;
import E70.d;
import E70.e;
import G.g;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0019J\u0012\u0010*\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J¨\u0001\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\bF\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bG\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+¨\u0006J"}, d2 = {"Lru/ozon/fintech/features/operations/network/OperationInfoDto;", "", "", "id", "operationId", "purpose", "accountAmount", "time", "LE70/c;", "type", "LE70/d;", "direction", "LE70/e;", "status", "merchantCategoryCode", "Lru/ozon/fintech/features/operations/network/MerchantDto;", "merchantDto", "sbpMessage", "ozonOrderNumber", "categoryGroupName", "Lru/ozon/fintech/features/operations/network/BonusDto;", "bonus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/c;LE70/d;LE70/e;Ljava/lang/String;Lru/ozon/fintech/features/operations/network/MerchantDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/operations/network/BonusDto;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()LE70/c;", "component7", "()LE70/d;", "component8", "()LE70/e;", "component9", "component10", "()Lru/ozon/fintech/features/operations/network/MerchantDto;", "component11", "component12", "component13", "component14", "()Lru/ozon/fintech/features/operations/network/BonusDto;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LE70/c;LE70/d;LE70/e;Ljava/lang/String;Lru/ozon/fintech/features/operations/network/MerchantDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/features/operations/network/BonusDto;)Lru/ozon/fintech/features/operations/network/OperationInfoDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getOperationId", "getPurpose", "getAccountAmount", "getTime", "LE70/c;", "getType", "LE70/d;", "getDirection", "LE70/e;", "getStatus", "getMerchantCategoryCode", "Lru/ozon/fintech/features/operations/network/MerchantDto;", "getMerchantDto", "getSbpMessage", "getOzonOrderNumber", "getCategoryGroupName", "Lru/ozon/fintech/features/operations/network/BonusDto;", "getBonus", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OperationInfoDto {

    @NotNull
    private final String accountAmount;
    private final BonusDto bonus;
    private final String categoryGroupName;

    @NotNull
    private final d direction;

    @NotNull
    private final String id;
    private final String merchantCategoryCode;
    private final MerchantDto merchantDto;

    @NotNull
    private final String operationId;
    private final String ozonOrderNumber;

    @NotNull
    private final String purpose;
    private final String sbpMessage;

    @NotNull
    private final e status;

    @NotNull
    private final String time;

    @NotNull
    private final c type;

    public OperationInfoDto(@i(name = "id") @NotNull String id2, @i(name = "operationId") @NotNull String operationId, @i(name = "purpose") @NotNull String purpose, @i(name = "accountAmount") @NotNull String accountAmount, @i(name = "time") @NotNull String time, @i(name = "type") @NotNull c type, @i(name = "direction") @NotNull d direction, @i(name = "status") @NotNull e status, @i(name = "merchantCategoryCode") String str, @i(name = "merchant") MerchantDto merchantDto, @i(name = "sbpMessage") String str2, @i(name = "ozonOrderNumber") String str3, @i(name = "categoryGroupName") String str4, @i(name = "bonus") BonusDto bonusDto) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(accountAmount, "accountAmount");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id2;
        this.operationId = operationId;
        this.purpose = purpose;
        this.accountAmount = accountAmount;
        this.time = time;
        this.type = type;
        this.direction = direction;
        this.status = status;
        this.merchantCategoryCode = str;
        this.merchantDto = merchantDto;
        this.sbpMessage = str2;
        this.ozonOrderNumber = str3;
        this.categoryGroupName = str4;
        this.bonus = bonusDto;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final MerchantDto getMerchantDto() {
        return this.merchantDto;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSbpMessage() {
        return this.sbpMessage;
    }

    /* renamed from: component12, reason: from getter */
    public final String getOzonOrderNumber() {
        return this.ozonOrderNumber;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCategoryGroupName() {
        return this.categoryGroupName;
    }

    /* renamed from: component14, reason: from getter */
    public final BonusDto getBonus() {
        return this.bonus;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPurpose() {
        return this.purpose;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAccountAmount() {
        return this.accountAmount;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final c getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final d getDirection() {
        return this.direction;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final e getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    @NotNull
    public final OperationInfoDto copy(@i(name = "id") @NotNull String id2, @i(name = "operationId") @NotNull String operationId, @i(name = "purpose") @NotNull String purpose, @i(name = "accountAmount") @NotNull String accountAmount, @i(name = "time") @NotNull String time, @i(name = "type") @NotNull c type, @i(name = "direction") @NotNull d direction, @i(name = "status") @NotNull e status, @i(name = "merchantCategoryCode") String merchantCategoryCode, @i(name = "merchant") MerchantDto merchantDto, @i(name = "sbpMessage") String sbpMessage, @i(name = "ozonOrderNumber") String ozonOrderNumber, @i(name = "categoryGroupName") String categoryGroupName, @i(name = "bonus") BonusDto bonus) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(accountAmount, "accountAmount");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(status, "status");
        return new OperationInfoDto(id2, operationId, purpose, accountAmount, time, type, direction, status, merchantCategoryCode, merchantDto, sbpMessage, ozonOrderNumber, categoryGroupName, bonus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperationInfoDto)) {
            return false;
        }
        OperationInfoDto operationInfoDto = (OperationInfoDto) other;
        return Intrinsics.d(this.id, operationInfoDto.id) && Intrinsics.d(this.operationId, operationInfoDto.operationId) && Intrinsics.d(this.purpose, operationInfoDto.purpose) && Intrinsics.d(this.accountAmount, operationInfoDto.accountAmount) && Intrinsics.d(this.time, operationInfoDto.time) && this.type == operationInfoDto.type && this.direction == operationInfoDto.direction && this.status == operationInfoDto.status && Intrinsics.d(this.merchantCategoryCode, operationInfoDto.merchantCategoryCode) && Intrinsics.d(this.merchantDto, operationInfoDto.merchantDto) && Intrinsics.d(this.sbpMessage, operationInfoDto.sbpMessage) && Intrinsics.d(this.ozonOrderNumber, operationInfoDto.ozonOrderNumber) && Intrinsics.d(this.categoryGroupName, operationInfoDto.categoryGroupName) && Intrinsics.d(this.bonus, operationInfoDto.bonus);
    }

    @NotNull
    public final String getAccountAmount() {
        return this.accountAmount;
    }

    public final BonusDto getBonus() {
        return this.bonus;
    }

    public final String getCategoryGroupName() {
        return this.categoryGroupName;
    }

    @NotNull
    public final d getDirection() {
        return this.direction;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getMerchantCategoryCode() {
        return this.merchantCategoryCode;
    }

    public final MerchantDto getMerchantDto() {
        return this.merchantDto;
    }

    @NotNull
    public final String getOperationId() {
        return this.operationId;
    }

    public final String getOzonOrderNumber() {
        return this.ozonOrderNumber;
    }

    @NotNull
    public final String getPurpose() {
        return this.purpose;
    }

    public final String getSbpMessage() {
        return this.sbpMessage;
    }

    @NotNull
    public final e getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final c getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.status.hashCode() + ((this.direction.hashCode() + ((this.type.hashCode() + g.a(g.a(g.a(g.a(this.id.hashCode() * 31, 31, this.operationId), 31, this.purpose), 31, this.accountAmount), 31, this.time)) * 31)) * 31)) * 31;
        String str = this.merchantCategoryCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MerchantDto merchantDto = this.merchantDto;
        int hashCode3 = (hashCode2 + (merchantDto == null ? 0 : merchantDto.hashCode())) * 31;
        String str2 = this.sbpMessage;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ozonOrderNumber;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryGroupName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BonusDto bonusDto = this.bonus;
        return hashCode6 + (bonusDto != null ? bonusDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.operationId;
        String str3 = this.purpose;
        String str4 = this.accountAmount;
        String str5 = this.time;
        c cVar = this.type;
        d dVar = this.direction;
        e eVar = this.status;
        String str6 = this.merchantCategoryCode;
        MerchantDto merchantDto = this.merchantDto;
        String str7 = this.sbpMessage;
        String str8 = this.ozonOrderNumber;
        String str9 = this.categoryGroupName;
        BonusDto bonusDto = this.bonus;
        StringBuilder d11 = C3660k.d("OperationInfoDto(id=", str, ", operationId=", str2, ", purpose=");
        a.h(d11, str3, ", accountAmount=", str4, ", time=");
        d11.append(str5);
        d11.append(", type=");
        d11.append(cVar);
        d11.append(", direction=");
        d11.append(dVar);
        d11.append(", status=");
        d11.append(eVar);
        d11.append(", merchantCategoryCode=");
        d11.append(str6);
        d11.append(", merchantDto=");
        d11.append(merchantDto);
        d11.append(", sbpMessage=");
        a.h(d11, str7, ", ozonOrderNumber=", str8, ", categoryGroupName=");
        d11.append(str9);
        d11.append(", bonus=");
        d11.append(bonusDto);
        d11.append(")");
        return d11.toString();
    }
}
