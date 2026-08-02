package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatusJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayCardStatus;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MirPayCardStatusJsonAdapter extends JsonAdapter<MirPayCardStatus> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MirPayCardStatusJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("reference_id", "state", "can_add", "masked_pan", "expiry_date");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "referenceId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.TYPE, m11, "canAdded");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.booleanAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(MirPayCardStatus)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MirPayCardStatus fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!reader.hasNext()) {
                String str5 = str;
                String str6 = str2;
                reader.endObject();
                if (str5 == null) {
                    throw c.j("referenceId", "reference_id", reader);
                }
                if (str6 == null) {
                    throw c.j("mirCardStatus", "state", reader);
                }
                if (bool2 == null) {
                    throw c.j("canAdded", "can_add", reader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (str3 == null) {
                    throw c.j("maskedPan", "masked_pan", reader);
                }
                if (str4 != null) {
                    return new MirPayCardStatus(str5, str6, booleanValue, str3, str4);
                }
                throw c.j("expiryDate", "expiry_date", reader);
            }
            String str7 = str;
            int v11 = reader.v(this.options);
            String str8 = str2;
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("referenceId", "reference_id", reader);
                }
                bool = bool2;
                str2 = str8;
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("mirCardStatus", "state", reader);
                }
                bool = bool2;
                str = str7;
            } else if (v11 == 2) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("canAdded", "can_add", reader);
                }
                str = str7;
                str2 = str8;
            } else if (v11 == 3) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("maskedPan", "masked_pan", reader);
                }
            } else if (v11 == 4 && (str4 = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("expiryDate", "expiry_date", reader);
            }
            bool = bool2;
            str = str7;
            str2 = str8;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MirPayCardStatus value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("reference_id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getReferenceId());
        writer.w("state");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMirCardStatus());
        writer.w("can_add");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getCanAdded()));
        writer.w("masked_pan");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMaskedPan());
        writer.w("expiry_date");
        this.stringAdapter.mo44toJson(writer, (x) value_.getExpiryDate());
        writer.p();
    }
}
