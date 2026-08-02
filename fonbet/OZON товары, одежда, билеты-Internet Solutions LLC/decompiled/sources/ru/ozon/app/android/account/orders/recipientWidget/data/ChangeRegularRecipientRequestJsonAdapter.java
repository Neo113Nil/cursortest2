package ru.ozon.app.android.account.orders.recipientWidget.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "longAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeRegularRecipientRequestJsonAdapter extends JsonAdapter<ChangeRegularRecipientRequest> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ChangeRegularRecipientRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("regularId", "firstName", "lastName", "phone");
        M m11 = M.f71699a;
        this.longAdapter = moshi.f(Long.TYPE, m11, "regularId");
        this.stringAdapter = moshi.f(String.class, m11, "firstName");
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ChangeRegularRecipientRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChangeRegularRecipientRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("regularId", "regularId", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("firstName", "firstName", reader);
                }
            } else if (v11 == 2) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("lastName", "lastName", reader);
                }
            } else if (v11 == 3 && (str3 = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("phone", "phone", reader);
            }
        }
        reader.endObject();
        if (l11 == null) {
            throw c.j("regularId", "regularId", reader);
        }
        long longValue = l11.longValue();
        if (str == null) {
            throw c.j("firstName", "firstName", reader);
        }
        if (str2 == null) {
            throw c.j("lastName", "lastName", reader);
        }
        if (str3 != null) {
            return new ChangeRegularRecipientRequest(longValue, str, str2, str3);
        }
        throw c.j("phone", "phone", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChangeRegularRecipientRequest value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("regularId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value.getRegularId()));
        writer.w("firstName");
        this.stringAdapter.mo44toJson(writer, (x) value.getFirstName());
        writer.w("lastName");
        this.stringAdapter.mo44toJson(writer, (x) value.getLastName());
        writer.w("phone");
        this.stringAdapter.mo44toJson(writer, (x) value.getPhone());
        writer.p();
    }
}
