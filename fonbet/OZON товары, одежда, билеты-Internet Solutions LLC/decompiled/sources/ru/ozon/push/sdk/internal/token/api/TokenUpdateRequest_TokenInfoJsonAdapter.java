package ru.ozon.push.sdk.internal.token.api;

import Ak.b;
import C.o0;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import jh0.c;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R(\u0010\u001e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest_TokenInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;", "notificationProviderAdapter", "Ljh0/c;", "updateTriggerAdapter", "", "nullableMapOfStringStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenUpdateRequest_TokenInfoJsonAdapter extends JsonAdapter<TokenUpdateRequest.TokenInfo> {
    private volatile Constructor<TokenUpdateRequest.TokenInfo> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<TokenUpdateRequest.TokenInfo.a> notificationProviderAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<c> updateTriggerAdapter;

    public TokenUpdateRequest_TokenInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("token", "provider", "signature", "updateTrigger", "metadata", "token_type");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "token");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<TokenUpdateRequest.TokenInfo.a> f11 = moshi.f(TokenUpdateRequest.TokenInfo.a.class, m11, "provider");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.notificationProviderAdapter = f11;
        JsonAdapter<c> f12 = moshi.f(c.class, m11, "updateTrigger");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.updateTriggerAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = moshi.f(D.e(Map.class, String.class, String.class), m11, "metadata");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f13;
        JsonAdapter<Integer> f14 = moshi.f(Integer.TYPE, m11, "tokenType");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.intAdapter = f14;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TokenUpdateRequest.TokenInfo fromJson(@NotNull n reader) {
        TokenUpdateRequest.TokenInfo.a aVar = null;
        Integer a11 = o0.a(reader, "reader", 0);
        String str = null;
        c cVar = null;
        Map<String, String> map = null;
        int i11 = -1;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("token", "token", reader);
                    }
                    break;
                case 1:
                    aVar = this.notificationProviderAdapter.fromJson(reader);
                    if (aVar == null) {
                        throw Y9.c.q("provider", "provider", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("signature", "signature", reader);
                    }
                    break;
                case 3:
                    cVar = this.updateTriggerAdapter.fromJson(reader);
                    if (cVar == null) {
                        throw Y9.c.q("updateTrigger", "updateTrigger", reader);
                    }
                    break;
                case 4:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw Y9.c.q("tokenType", "token_type", reader);
                    }
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -49) {
            if (str == null) {
                throw Y9.c.j("token", "token", reader);
            }
            if (aVar == null) {
                throw Y9.c.j("provider", "provider", reader);
            }
            if (str2 == null) {
                throw Y9.c.j("signature", "signature", reader);
            }
            if (cVar != null) {
                return new TokenUpdateRequest.TokenInfo(str, aVar, str2, cVar, map, a11.intValue());
            }
            throw Y9.c.j("updateTrigger", "updateTrigger", reader);
        }
        Constructor<TokenUpdateRequest.TokenInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Y9.c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = TokenUpdateRequest.TokenInfo.class.getDeclaredConstructor(String.class, TokenUpdateRequest.TokenInfo.a.class, String.class, c.class, Map.class, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw Y9.c.j("token", "token", reader);
        }
        if (aVar == null) {
            throw Y9.c.j("provider", "provider", reader);
        }
        if (str2 == null) {
            throw Y9.c.j("signature", "signature", reader);
        }
        if (cVar == null) {
            throw Y9.c.j("updateTrigger", "updateTrigger", reader);
        }
        c cVar2 = cVar;
        Map<String, String> map2 = map;
        TokenUpdateRequest.TokenInfo newInstance = constructor.newInstance(str, aVar, str2, cVar2, map2, a11, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(TokenUpdateRequest.TokenInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TokenUpdateRequest.TokenInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("token");
        this.stringAdapter.mo44toJson(writer, (x) value_.getToken());
        writer.w("provider");
        this.notificationProviderAdapter.mo44toJson(writer, (x) value_.getProvider());
        writer.w("signature");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSignature());
        writer.w("updateTrigger");
        this.updateTriggerAdapter.mo44toJson(writer, (x) value_.getUpdateTrigger());
        writer.w("metadata");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getMetadata());
        writer.w("token_type");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getTokenType()));
        writer.p();
    }
}
