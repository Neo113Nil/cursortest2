package ru.ozon.android.messenger.framework.data.remote.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.parser.DataString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/remote/models/RpcResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAtDataStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/RpcErrorDTO;", "nullableRpcErrorDTOAdapter", "stringAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RpcResponseDTOJsonAdapter extends JsonAdapter<RpcResponseDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<RpcErrorDTO> nullableRpcErrorDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAtDataStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public /* synthetic */ class a implements DataString {
        @Override // java.lang.annotation.Annotation
        public final /* synthetic */ Class annotationType() {
            return DataString.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            return obj instanceof DataString;
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return 0;
        }

        @Override // java.lang.annotation.Annotation
        @NotNull
        public final String toString() {
            return "@ru.ozon.android.messenger.framework.data.remote.parser.DataString()";
        }
    }

    public RpcResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("result", "error", "id", "jsonrpc");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        JsonAdapter<String> f7 = moshi.f(String.class, e0.h(new a()), "result");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAtDataStringAdapter = f7;
        M m11 = M.f71699a;
        JsonAdapter<RpcErrorDTO> f11 = moshi.f(RpcErrorDTO.class, m11, "error");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableRpcErrorDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(RpcResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RpcResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        RpcErrorDTO rpcErrorDTO = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAtDataStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                rpcErrorDTO = this.nullableRpcErrorDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Y9.c.q("id", "id", reader);
                }
            } else if (v11 == 3 && (str3 = this.stringAdapter.fromJson(reader)) == null) {
                throw Y9.c.q("jsonrpc", "jsonrpc", reader);
            }
        }
        reader.endObject();
        if (str2 == null) {
            throw Y9.c.j("id", "id", reader);
        }
        if (str3 != null) {
            return new RpcResponseDTO(str, rpcErrorDTO, str2, str3);
        }
        throw Y9.c.j("jsonrpc", "jsonrpc", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RpcResponseDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("result");
        this.nullableStringAtDataStringAdapter.mo44toJson(writer, (x) value_.getResult());
        writer.w("error");
        this.nullableRpcErrorDTOAdapter.mo44toJson(writer, (x) value_.getError());
        writer.w("id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("jsonrpc");
        this.stringAdapter.mo44toJson(writer, (x) value_.getJsonrpc());
        writer.p();
    }
}
