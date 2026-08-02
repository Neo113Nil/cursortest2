package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain;

import Ak.b;
import T00.l;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001e0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001dR$\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ActionResponseDTOJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ActionResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ActionResponseDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/ActionResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableTokenizedTrackingInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableMapOfStringStringAdapter", "LT00/l;", "nullableTrackingTokenAliasesAdapter", "nullableTNullableAnyAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionResponseDTOJsonAdapter<T> extends JsonAdapter<ActionResponseDTO<T>> {
    public static final int $stable = 8;
    private volatile Constructor<ActionResponseDTO<T>> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<T> nullableTNullableAnyAdapter;

    @NotNull
    private final JsonAdapter<TokenizedTrackingInfo> nullableTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<l> nullableTrackingTokenAliasesAdapter;

    @NotNull
    private final n.a options;

    public ActionResponseDTOJsonAdapter(@NotNull Moshi moshi, @NotNull Type[] types) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(types, "types");
        if (types.length != 1) {
            String str = "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received " + types.length;
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            throw new IllegalArgumentException(str.toString());
        }
        this.options = n.a.C0918a.a("trackingInfo", "trackingPayloads", "trackingTokenAliases", "data");
        M m11 = M.f71699a;
        this.nullableTokenizedTrackingInfoAdapter = moshi.f(TokenizedTrackingInfo.class, m11, "trackingInfo");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "trackingPayloads");
        this.nullableTrackingTokenAliasesAdapter = moshi.f(l.class, m11, "trackingTokenAliases");
        this.nullableTNullableAnyAdapter = moshi.f(types[0], m11, "data");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(ActionResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionResponseDTO<T> fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TokenizedTrackingInfo tokenizedTrackingInfo = null;
        Map<String, String> map = null;
        l lVar = null;
        T t2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                tokenizedTrackingInfo = this.nullableTokenizedTrackingInfoAdapter.fromJson(reader);
                i11 &= -2;
            } else if (v11 == 1) {
                map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                lVar = this.nullableTrackingTokenAliasesAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                t2 = this.nullableTNullableAnyAdapter.fromJson(reader);
                i11 &= -9;
            }
        }
        reader.endObject();
        if (i11 == -16) {
            return new ActionResponseDTO<>(tokenizedTrackingInfo, map, lVar, t2);
        }
        Constructor<ActionResponseDTO<T>> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ActionResponseDTO.class.getDeclaredConstructor(TokenizedTrackingInfo.class, Map.class, l.class, Object.class, Integer.TYPE, c.f34864d);
            Intrinsics.g(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ActionResponseDTO<T of ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ActionResponseDTOJsonAdapter>>");
            this.constructorRef = constructor;
        }
        ActionResponseDTO<T> newInstance = constructor.newInstance(tokenizedTrackingInfo, map, lVar, t2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionResponseDTO<T> value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("trackingInfo");
        this.nullableTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("trackingPayloads");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getTrackingPayloads());
        writer.w("trackingTokenAliases");
        this.nullableTrackingTokenAliasesAdapter.mo44toJson(writer, (x) value.getTrackingTokenAliases());
        writer.w("data");
        this.nullableTNullableAnyAdapter.mo44toJson(writer, (x) value.getData());
        writer.p();
    }
}
