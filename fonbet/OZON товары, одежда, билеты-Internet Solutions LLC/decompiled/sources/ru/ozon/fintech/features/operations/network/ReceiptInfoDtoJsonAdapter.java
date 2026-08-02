package ru.ozon.fintech.features.operations.network;

import E70.b;
import E70.f;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/features/operations/network/ReceiptInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/operations/network/ReceiptInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/operations/network/ReceiptInfoDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/operations/network/ReceiptInfoDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "LE70/f;", "sbpStatusAdapter", "LE70/b;", "eventTypeAdapter", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiptInfoDtoJsonAdapter extends JsonAdapter<ReceiptInfoDto> {

    @NotNull
    private final JsonAdapter<b> eventTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<f> sbpStatusAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReceiptInfoDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "amount", "counterPartyName", "counterPartyPhone", "counterPartyBank", "time", "logoUrl", "sbpId", "status", "message", "sourceType");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<f> f11 = moshi.f(f.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.sbpStatusAdapter = f11;
        JsonAdapter<b> f12 = moshi.f(b.class, m11, "sourceType");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.eventTypeAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(ReceiptInfoDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReceiptInfoDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        f fVar = null;
        String str9 = null;
        b bVar = null;
        while (true) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str7;
            String str17 = str8;
            if (!reader.hasNext()) {
                f fVar2 = fVar;
                reader.endObject();
                if (str10 == null) {
                    throw c.j("id", "id", reader);
                }
                if (str11 == null) {
                    throw c.j("amount", "amount", reader);
                }
                if (str12 == null) {
                    throw c.j("counterPartyName", "counterPartyName", reader);
                }
                if (str13 == null) {
                    throw c.j("counterPartyPhone", "counterPartyPhone", reader);
                }
                if (str14 == null) {
                    throw c.j("counterPartyBank", "counterPartyBank", reader);
                }
                if (str15 == null) {
                    throw c.j("time", "time", reader);
                }
                if (str16 == null) {
                    throw c.j("logoUrl", "logoUrl", reader);
                }
                if (str17 == null) {
                    throw c.j("sbpId", "sbpId", reader);
                }
                if (fVar2 == null) {
                    throw c.j("status", "status", reader);
                }
                if (str9 == null) {
                    throw c.j("message", "message", reader);
                }
                if (bVar != null) {
                    return new ReceiptInfoDto(str10, str11, str12, str13, str14, str15, str16, str17, fVar2, str9, bVar);
                }
                throw c.j("sourceType", "sourceType", reader);
            }
            f fVar3 = fVar;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("id", "id", reader);
                    }
                    fVar = fVar3;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("amount", "amount", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("counterPartyName", "counterPartyName", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("counterPartyPhone", "counterPartyPhone", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("counterPartyBank", "counterPartyBank", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("time", "time", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str7 = str16;
                    str8 = str17;
                case 6:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("logoUrl", "logoUrl", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str8 = str17;
                case 7:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("sbpId", "sbpId", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                case 8:
                    fVar = this.sbpStatusAdapter.fromJson(reader);
                    if (fVar == null) {
                        throw c.q("status", "status", reader);
                    }
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 9:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw c.q("message", "message", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                case 10:
                    bVar = this.eventTypeAdapter.fromJson(reader);
                    if (bVar == null) {
                        throw c.q("sourceType", "sourceType", reader);
                    }
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
                default:
                    fVar = fVar3;
                    str = str10;
                    str2 = str11;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str15;
                    str7 = str16;
                    str8 = str17;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReceiptInfoDto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("amount");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAmount());
        writer.w("counterPartyName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCounterPartyName());
        writer.w("counterPartyPhone");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCounterPartyPhone());
        writer.w("counterPartyBank");
        this.stringAdapter.mo44toJson(writer, (x) value_.getCounterPartyBank());
        writer.w("time");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTime());
        writer.w("logoUrl");
        this.stringAdapter.mo44toJson(writer, (x) value_.getLogoUrl());
        writer.w("sbpId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSbpId());
        writer.w("status");
        this.sbpStatusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("message");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessage());
        writer.w("sourceType");
        this.eventTypeAdapter.mo44toJson(writer, (x) value_.getSourceType());
        writer.p();
    }
}
