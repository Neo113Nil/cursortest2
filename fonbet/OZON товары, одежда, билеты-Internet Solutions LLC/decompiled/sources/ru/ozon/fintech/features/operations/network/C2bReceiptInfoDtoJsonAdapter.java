package ru.ozon.fintech.features.operations.network;

import Ak.b;
import E70.a;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDto;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/operations/network/C2bReceiptInfoDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "LE70/a;", "c2BPartnerStatusAdapter", "operations_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class C2bReceiptInfoDtoJsonAdapter extends JsonAdapter<C2bReceiptInfoDto> {

    @NotNull
    private final JsonAdapter<a> c2BPartnerStatusAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public C2bReceiptInfoDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("id", "amount", "counterPartyName", "counterPartyPhone", "counterPartyBank", "time", "logoUrl", "status", "paymentToken");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<a> f11 = moshi.f(a.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.c2BPartnerStatusAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(C2bReceiptInfoDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public C2bReceiptInfoDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        a aVar = null;
        String str8 = null;
        while (true) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            if (!reader.hasNext()) {
                String str13 = str5;
                reader.endObject();
                if (str9 == null) {
                    throw c.j("id", "id", reader);
                }
                if (str10 == null) {
                    throw c.j("amount", "amount", reader);
                }
                if (str11 == null) {
                    throw c.j("counterPartyName", "counterPartyName", reader);
                }
                if (str12 == null) {
                    throw c.j("counterPartyPhone", "counterPartyPhone", reader);
                }
                if (str13 == null) {
                    throw c.j("counterPartyBank", "counterPartyBank", reader);
                }
                if (str6 == null) {
                    throw c.j("time", "time", reader);
                }
                if (str7 == null) {
                    throw c.j("logoUrl", "logoUrl", reader);
                }
                if (aVar == null) {
                    throw c.j("status", "status", reader);
                }
                if (str8 != null) {
                    return new C2bReceiptInfoDto(str9, str10, str11, str12, str13, str6, str7, aVar, str8);
                }
                throw c.j("paymentToken", "paymentToken", reader);
            }
            String str14 = str5;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("id", "id", reader);
                    }
                    str5 = str14;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("amount", "amount", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str3 = str11;
                    str4 = str12;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("counterPartyName", "counterPartyName", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str4 = str12;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("counterPartyPhone", "counterPartyPhone", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("counterPartyBank", "counterPartyBank", reader);
                    }
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("time", "time", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 6:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("logoUrl", "logoUrl", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 7:
                    aVar = this.c2BPartnerStatusAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw c.q("status", "status", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                case 8:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw c.q("paymentToken", "paymentToken", reader);
                    }
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
                default:
                    str5 = str14;
                    str = str9;
                    str2 = str10;
                    str3 = str11;
                    str4 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, C2bReceiptInfoDto value_) {
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
        writer.w("status");
        this.c2BPartnerStatusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("paymentToken");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPaymentToken());
        writer.p();
    }
}
