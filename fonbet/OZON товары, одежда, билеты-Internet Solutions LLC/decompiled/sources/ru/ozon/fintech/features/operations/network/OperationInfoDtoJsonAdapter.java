package ru.ozon.fintech.features.operations.network;

import Ak.b;
import E70.c;
import E70.d;
import E70.e;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018¨\u0006$"}, d2 = {"Lru/ozon/fintech/features/operations/network/OperationInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/operations/network/OperationInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/operations/network/OperationInfoDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/operations/network/OperationInfoDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "LE70/c;", "groupOperationTypeAdapter", "LE70/d;", "operationDirectionAdapter", "LE70/e;", "operationStatusAdapter", "nullableStringAdapter", "Lru/ozon/fintech/features/operations/network/MerchantDto;", "nullableMerchantDtoAdapter", "Lru/ozon/fintech/features/operations/network/BonusDto;", "nullableBonusDtoAdapter", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OperationInfoDtoJsonAdapter extends JsonAdapter<OperationInfoDto> {

    @NotNull
    private final JsonAdapter<c> groupOperationTypeAdapter;

    @NotNull
    private final JsonAdapter<BonusDto> nullableBonusDtoAdapter;

    @NotNull
    private final JsonAdapter<MerchantDto> nullableMerchantDtoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<d> operationDirectionAdapter;

    @NotNull
    private final JsonAdapter<e> operationStatusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OperationInfoDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "operationId", "purpose", "accountAmount", "time", "type", "direction", "status", "merchantCategoryCode", "merchant", "sbpMessage", "ozonOrderNumber", "categoryGroupName", "bonus");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<c> f11 = moshi.f(c.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.groupOperationTypeAdapter = f11;
        JsonAdapter<d> f12 = moshi.f(d.class, m11, "direction");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.operationDirectionAdapter = f12;
        JsonAdapter<e> f13 = moshi.f(e.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.operationStatusAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "merchantCategoryCode");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<MerchantDto> f15 = moshi.f(MerchantDto.class, m11, "merchantDto");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMerchantDtoAdapter = f15;
        JsonAdapter<BonusDto> f16 = moshi.f(BonusDto.class, m11, "bonus");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableBonusDtoAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(OperationInfoDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OperationInfoDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        c cVar = null;
        d dVar = null;
        e eVar = null;
        String str6 = null;
        MerchantDto merchantDto = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        BonusDto bonusDto = null;
        while (true) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            c cVar2 = cVar;
            if (!reader.hasNext()) {
                d dVar2 = dVar;
                reader.endObject();
                if (str10 == null) {
                    throw Y9.c.j("id", "id", reader);
                }
                if (str11 == null) {
                    throw Y9.c.j("operationId", "operationId", reader);
                }
                if (str12 == null) {
                    throw Y9.c.j("purpose", "purpose", reader);
                }
                if (str13 == null) {
                    throw Y9.c.j("accountAmount", "accountAmount", reader);
                }
                if (str14 == null) {
                    throw Y9.c.j("time", "time", reader);
                }
                if (cVar2 == null) {
                    throw Y9.c.j("type", "type", reader);
                }
                if (dVar2 == null) {
                    throw Y9.c.j("direction", "direction", reader);
                }
                if (eVar != null) {
                    return new OperationInfoDto(str10, str11, str12, str13, str14, cVar2, dVar2, eVar, str6, merchantDto, str7, str8, str9, bonusDto);
                }
                throw Y9.c.j("status", "status", reader);
            }
            d dVar3 = dVar;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("id", "id", reader);
                    }
                    dVar = dVar3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("operationId", "operationId", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Y9.c.q("purpose", "purpose", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw Y9.c.q("accountAmount", "accountAmount", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str14;
                    cVar = cVar2;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw Y9.c.q("time", "time", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    cVar = cVar2;
                case 5:
                    cVar = this.groupOperationTypeAdapter.fromJson(reader);
                    if (cVar == null) {
                        throw Y9.c.q("type", "type", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                case 6:
                    dVar = this.operationDirectionAdapter.fromJson(reader);
                    if (dVar == null) {
                        throw Y9.c.q("direction", "direction", reader);
                    }
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 7:
                    eVar = this.operationStatusAdapter.fromJson(reader);
                    if (eVar == null) {
                        throw Y9.c.q("status", "status", reader);
                    }
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 9:
                    merchantDto = this.nullableMerchantDtoAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 11:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 12:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                case 13:
                    bonusDto = this.nullableBonusDtoAdapter.fromJson(reader);
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
                default:
                    dVar = dVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    cVar = cVar2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OperationInfoDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("operationId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getOperationId());
        writer.w("purpose");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPurpose());
        writer.w("accountAmount");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAccountAmount());
        writer.w("time");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTime());
        writer.w("type");
        this.groupOperationTypeAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("direction");
        this.operationDirectionAdapter.mo44toJson(writer, (x) value_.getDirection());
        writer.w("status");
        this.operationStatusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("merchantCategoryCode");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getMerchantCategoryCode());
        writer.w("merchant");
        this.nullableMerchantDtoAdapter.mo44toJson(writer, (x) value_.getMerchantDto());
        writer.w("sbpMessage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSbpMessage());
        writer.w("ozonOrderNumber");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOzonOrderNumber());
        writer.w("categoryGroupName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getCategoryGroupName());
        writer.w("bonus");
        this.nullableBonusDtoAdapter.mo44toJson(writer, (x) value_.getBonus());
        writer.p();
    }
}
