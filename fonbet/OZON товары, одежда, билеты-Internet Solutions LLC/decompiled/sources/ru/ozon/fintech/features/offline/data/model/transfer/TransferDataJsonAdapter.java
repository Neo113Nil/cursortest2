package ru.ozon.fintech.features.offline.data.model.transfer;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/TransferDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/offline/data/model/transfer/TransferData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/offline/data/model/transfer/TransferData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/offline/data/model/transfer/TransferData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/features/offline/data/model/transfer/ClientPhone;", "clientPhoneAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/fintech/features/offline/data/model/transfer/BankInfo;", "listOfBankInfoAdapter", "Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "commissionsAdapter", "Lru/ozon/fintech/features/offline/data/model/transfer/LimitCents;", "limitCentsAdapter", "stringAdapter", "", "booleanAdapter", "listOfStringAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferDataJsonAdapter extends JsonAdapter<TransferData> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<ClientPhone> clientPhoneAdapter;

    @NotNull
    private final JsonAdapter<Commissions> commissionsAdapter;
    private volatile Constructor<TransferData> constructorRef;

    @NotNull
    private final JsonAdapter<LimitCents> limitCentsAdapter;

    @NotNull
    private final JsonAdapter<List<BankInfo>> listOfBankInfoAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TransferDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("clientPhone", "banks", "commissions", "limitsCents", "transferPhone", "smsPaymentsFlagValue", "identificationLevel", "activeBlocks", "smsTemplate");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ClientPhone> f7 = moshi.f(ClientPhone.class, m11, "clientPhone");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.clientPhoneAdapter = f7;
        JsonAdapter<List<BankInfo>> f11 = moshi.f(D.e(List.class, BankInfo.class), m11, "banks");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfBankInfoAdapter = f11;
        JsonAdapter<Commissions> f12 = moshi.f(Commissions.class, m11, "commissions");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.commissionsAdapter = f12;
        JsonAdapter<LimitCents> f13 = moshi.f(LimitCents.class, m11, "limitCents");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.limitCentsAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "transferPhone");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.stringAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.TYPE, m11, "smsPaymentsFlagValue");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.booleanAdapter = f15;
        JsonAdapter<List<String>> f16 = moshi.f(D.e(List.class, String.class), m11, "activeBlocks");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.listOfStringAdapter = f16;
        JsonAdapter<String> f17 = moshi.f(String.class, m11, "smsTemplate");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableStringAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(TransferData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TransferData fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        ClientPhone clientPhone = null;
        List<BankInfo> list = null;
        Commissions commissions = null;
        LimitCents limitCents = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        List<String> list2 = null;
        String str3 = null;
        while (true) {
            ClientPhone clientPhone2 = clientPhone;
            List<BankInfo> list3 = list;
            Commissions commissions2 = commissions;
            LimitCents limitCents2 = limitCents;
            String str4 = str;
            if (!reader.hasNext()) {
                Boolean bool2 = bool;
                reader.endObject();
                if (i12 == -257) {
                    if (clientPhone2 == null) {
                        throw c.j("clientPhone", "clientPhone", reader);
                    }
                    if (list3 == null) {
                        throw c.j("banks", "banks", reader);
                    }
                    if (commissions2 == null) {
                        throw c.j("commissions", "commissions", reader);
                    }
                    if (limitCents2 == null) {
                        throw c.j("limitCents", "limitsCents", reader);
                    }
                    if (str4 == null) {
                        throw c.j("transferPhone", "transferPhone", reader);
                    }
                    if (bool2 == null) {
                        throw c.j("smsPaymentsFlagValue", "smsPaymentsFlagValue", reader);
                    }
                    String str5 = str3;
                    List<String> list4 = list2;
                    String str6 = str2;
                    boolean booleanValue = bool2.booleanValue();
                    if (str6 == null) {
                        throw c.j("identificationLevel", "identificationLevel", reader);
                    }
                    if (list4 != null) {
                        return new TransferData(clientPhone2, list3, commissions2, limitCents2, str4, booleanValue, str6, list4, str5);
                    }
                    throw c.j("activeBlocks", "activeBlocks", reader);
                }
                String str7 = str3;
                List<String> list5 = list2;
                String str8 = str2;
                Constructor<TransferData> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = TransferData.class.getDeclaredConstructor(ClientPhone.class, List.class, Commissions.class, LimitCents.class, String.class, Boolean.TYPE, String.class, List.class, String.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<TransferData> constructor2 = constructor;
                if (clientPhone2 == null) {
                    throw c.j("clientPhone", "clientPhone", reader);
                }
                if (list3 == null) {
                    throw c.j("banks", "banks", reader);
                }
                if (commissions2 == null) {
                    throw c.j("commissions", "commissions", reader);
                }
                if (limitCents2 == null) {
                    throw c.j("limitCents", "limitsCents", reader);
                }
                if (str4 == null) {
                    throw c.j("transferPhone", "transferPhone", reader);
                }
                if (bool2 == null) {
                    throw c.j("smsPaymentsFlagValue", "smsPaymentsFlagValue", reader);
                }
                if (str8 == null) {
                    throw c.j("identificationLevel", "identificationLevel", reader);
                }
                if (list5 == null) {
                    throw c.j("activeBlocks", "activeBlocks", reader);
                }
                TransferData newInstance = constructor2.newInstance(clientPhone2, list3, commissions2, limitCents2, str4, bool2, str8, list5, str7, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            Boolean bool3 = bool;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 0:
                    clientPhone = this.clientPhoneAdapter.fromJson(reader);
                    if (clientPhone == null) {
                        throw c.q("clientPhone", "clientPhone", reader);
                    }
                    bool = bool3;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 1:
                    list = this.listOfBankInfoAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("banks", "banks", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 2:
                    commissions = this.commissionsAdapter.fromJson(reader);
                    if (commissions == null) {
                        throw c.q("commissions", "commissions", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    limitCents = limitCents2;
                    str = str4;
                case 3:
                    limitCents = this.limitCentsAdapter.fromJson(reader);
                    if (limitCents == null) {
                        throw c.q("limitCents", "limitsCents", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    str = str4;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("transferPhone", "transferPhone", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("smsPaymentsFlagValue", "smsPaymentsFlagValue", reader);
                    }
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 6:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("identificationLevel", "identificationLevel", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 7:
                    list2 = this.listOfStringAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw c.q("activeBlocks", "activeBlocks", reader);
                    }
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
                    i12 = -257;
                default:
                    bool = bool3;
                    clientPhone = clientPhone2;
                    list = list3;
                    commissions = commissions2;
                    limitCents = limitCents2;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TransferData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("clientPhone");
        this.clientPhoneAdapter.mo44toJson(writer, (x) value_.getClientPhone());
        writer.w("banks");
        this.listOfBankInfoAdapter.mo44toJson(writer, (x) value_.getBanks());
        writer.w("commissions");
        this.commissionsAdapter.mo44toJson(writer, (x) value_.getCommissions());
        writer.w("limitsCents");
        this.limitCentsAdapter.mo44toJson(writer, (x) value_.getLimitCents());
        writer.w("transferPhone");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTransferPhone());
        writer.w("smsPaymentsFlagValue");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getSmsPaymentsFlagValue()));
        writer.w("identificationLevel");
        this.stringAdapter.mo44toJson(writer, (x) value_.getIdentificationLevel());
        writer.w("activeBlocks");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getActiveBlocks());
        writer.w("smsTemplate");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSmsTemplate());
        writer.p();
    }
}
