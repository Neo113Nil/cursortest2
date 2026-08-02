package ru.ozon.android.tokenized.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/android/tokenized/model/TokenizedTrackingInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "", "nullableListOfTokenizedTrackingInfoAdapter", "", "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "analytic-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TokenizedTrackingInfoJsonAdapter extends JsonAdapter<TokenizedTrackingInfo> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<TokenizedTrackingInfo> constructorRef;

    @NotNull
    private final JsonAdapter<List<TokenizedTrackingInfo>> nullableListOfTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TokenizedTrackingInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "key", "fastEvent", "sliceKey", "nested", "custom");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.TYPE, m11, "fastEvent");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.booleanAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "sliceKey");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<List<TokenizedTrackingInfo>> f13 = moshi.f(D.e(List.class, TokenizedTrackingInfo.class), m11, "nested");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfTokenizedTrackingInfoAdapter = f13;
        JsonAdapter<Map<String, String>> f14 = moshi.f(D.e(Map.class, String.class, String.class), m11, "custom");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f14;
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(TokenizedTrackingInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TokenizedTrackingInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<TokenizedTrackingInfo> list = null;
        Map<String, String> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("key", "key", reader);
                    }
                    break;
                case 2:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("fastEvent", "fastEvent", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    list = this.nullableListOfTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -61) {
            String str4 = str3;
            if (str == null) {
                throw c.j(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
            }
            if (str2 == null) {
                throw c.j("key", "key", reader);
            }
            return new TokenizedTrackingInfo(str, str2, bool2.booleanValue(), str4, list, map);
        }
        String str5 = str3;
        Constructor<TokenizedTrackingInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TokenizedTrackingInfo.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, String.class, List.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
        }
        if (str2 == null) {
            throw c.j("key", "key", reader);
        }
        TokenizedTrackingInfo newInstance = constructor.newInstance(str, str2, bool2, str5, list, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TokenizedTrackingInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getActionType());
        writer.w("key");
        this.stringAdapter.mo44toJson(writer, (x) value_.getKey());
        writer.w("fastEvent");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getFastEvent()));
        writer.w("sliceKey");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSliceKey());
        writer.w("nested");
        this.nullableListOfTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getNested());
        writer.w("custom");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getCustom());
        writer.p();
    }
}
