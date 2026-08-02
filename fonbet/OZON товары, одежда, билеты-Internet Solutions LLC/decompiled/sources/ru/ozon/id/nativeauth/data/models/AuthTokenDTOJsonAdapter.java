package ru.ozon.id.nativeauth.data.models;

import C.o0;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/id/nativeauth/data/models/AuthTokenDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AuthTokenDTOJsonAdapter extends JsonAdapter<AuthTokenDTO> {
    private volatile Constructor<AuthTokenDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AuthTokenDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("accessToken", "tokenType", "expiresIn", "refreshToken", "idpToken");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "accessToken");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.TYPE, m11, "expiresIn");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.intAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "idpToken");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AuthTokenDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("accessToken", "accessToken", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("tokenType", "tokenType", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("expiresIn", "expiresIn", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                str3 = this.stringAdapter.fromJson(reader);
                if (str3 == null) {
                    throw c.q("refreshToken", "refreshToken", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                str4 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -32) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            int intValue = a11.intValue();
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            return new AuthTokenDTO(str, str2, intValue, str3, str4);
        }
        Constructor<AuthTokenDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = AuthTokenDTO.class.getDeclaredConstructor(String.class, String.class, cls2, String.class, String.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        AuthTokenDTO newInstance = constructor.newInstance(str, str2, a11, str3, str4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(AuthTokenDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AuthTokenDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("accessToken");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAccessToken());
        writer.w("tokenType");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTokenType());
        writer.w("expiresIn");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getExpiresIn()));
        writer.w("refreshToken");
        this.stringAdapter.mo44toJson(writer, (x) value_.getRefreshToken());
        writer.w("idpToken");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getIdpToken());
        writer.p();
    }
}
