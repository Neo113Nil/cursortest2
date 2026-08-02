package ru.ozon.fintech.features.offline.data.model.transfer;

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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/fintech/features/offline/data/model/transfer/CommissionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/offline/data/model/transfer/Commissions;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CommissionsJsonAdapter extends JsonAdapter<Commissions> {

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public CommissionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("receiverCommonAmountCents", "receiverPriviligedAmountCents", "senderCommonAmountCents", "senderPriviligedAmountCents");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<Integer> f7 = moshi.f(Integer.TYPE, M.f71699a, "receiverCommonAmountCents");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.intAdapter = f7;
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(Commissions)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Commissions fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("receiverCommonAmountCents", "receiverCommonAmountCents", reader);
                }
            } else if (v11 == 1) {
                num2 = this.intAdapter.fromJson(reader);
                if (num2 == null) {
                    throw c.q("receiverPriviligedAmountCents", "receiverPriviligedAmountCents", reader);
                }
            } else if (v11 == 2) {
                num3 = this.intAdapter.fromJson(reader);
                if (num3 == null) {
                    throw c.q("senderCommonAmountCents", "senderCommonAmountCents", reader);
                }
            } else if (v11 == 3 && (num4 = this.intAdapter.fromJson(reader)) == null) {
                throw c.q("senderPriviligedAmountCents", "senderPriviligedAmountCents", reader);
            }
        }
        reader.endObject();
        if (num == null) {
            throw c.j("receiverCommonAmountCents", "receiverCommonAmountCents", reader);
        }
        int intValue = num.intValue();
        if (num2 == null) {
            throw c.j("receiverPriviligedAmountCents", "receiverPriviligedAmountCents", reader);
        }
        int intValue2 = num2.intValue();
        if (num3 == null) {
            throw c.j("senderCommonAmountCents", "senderCommonAmountCents", reader);
        }
        int intValue3 = num3.intValue();
        if (num4 != null) {
            return new Commissions(intValue, intValue2, intValue3, num4.intValue());
        }
        throw c.j("senderPriviligedAmountCents", "senderPriviligedAmountCents", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Commissions value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("receiverCommonAmountCents");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getReceiverCommonAmountCents()));
        writer.w("receiverPriviligedAmountCents");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getReceiverPriviligedAmountCents()));
        writer.w("senderCommonAmountCents");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getSenderCommonAmountCents()));
        writer.w("senderPriviligedAmountCents");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getSenderPriviligedAmountCents()));
        writer.p();
    }
}
