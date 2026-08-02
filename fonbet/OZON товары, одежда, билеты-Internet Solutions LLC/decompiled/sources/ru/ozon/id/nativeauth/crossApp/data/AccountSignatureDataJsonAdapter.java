package ru.ozon.id.nativeauth.crossApp.data;

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

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/data/AccountSignatureDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/crossApp/data/AccountSignatureData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/crossApp/data/AccountSignatureData;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/crossApp/data/AccountSignatureData;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountSignatureDataJsonAdapter extends JsonAdapter<AccountSignatureData> {

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AccountSignatureDataJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("publicKey", "privateKey", "userId", "appName", "createdAt");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "publicKey");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.TYPE, m11, "userId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.longAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(AccountSignatureData)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AccountSignatureData fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Long l12 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("publicKey", "publicKey", reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("privateKey", "privateKey", reader);
                }
            } else if (v11 == 2) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw c.q("userId", "userId", reader);
                }
            } else if (v11 == 3) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("appName", "appName", reader);
                }
            } else if (v11 == 4 && (l12 = this.longAdapter.fromJson(reader)) == null) {
                throw c.q("createdAt", "createdAt", reader);
            }
        }
        reader.endObject();
        Long l13 = l12;
        if (str == null) {
            throw c.j("publicKey", "publicKey", reader);
        }
        if (str2 == null) {
            throw c.j("privateKey", "privateKey", reader);
        }
        if (l11 == null) {
            throw c.j("userId", "userId", reader);
        }
        long longValue = l11.longValue();
        if (str3 == null) {
            throw c.j("appName", "appName", reader);
        }
        if (l13 != null) {
            return new AccountSignatureData(str, str2, longValue, str3, l13.longValue());
        }
        throw c.j("createdAt", "createdAt", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AccountSignatureData value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("publicKey");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPublicKey());
        writer.w("privateKey");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPrivateKey());
        writer.w("userId");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getUserId()));
        writer.w("appName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppName());
        writer.w("createdAt");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getCreatedAt()));
        writer.p();
    }
}
