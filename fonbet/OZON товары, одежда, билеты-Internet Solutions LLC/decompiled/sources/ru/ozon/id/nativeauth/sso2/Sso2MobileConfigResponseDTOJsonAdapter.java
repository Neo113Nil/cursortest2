package ru.ozon.id.nativeauth.sso2;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/id/nativeauth/sso2/Sso2MobileConfigResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/sso2/Sso2MobileConfigResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/sso2/Sso2MobileConfigResponseDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/sso2/Sso2MobileConfigResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableListOfStringAdapter", "", "longAdapter", "", "booleanAdapter", "", "setOfStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Sso2MobileConfigResponseDTOJsonAdapter extends JsonAdapter<Sso2MobileConfigResponseDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Sso2MobileConfigResponseDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Set<String>> setOfStringAdapter;

    public Sso2MobileConfigResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("refreshInterval", "requiredDomains", "nonRequiredDomains", "lastCallMS", "checkAppVersion", "allDomains", "logsEnabled");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Integer> f7 = moshi.f(Integer.TYPE, m11, "refreshInterval");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.intAdapter = f7;
        JsonAdapter<List<String>> f11 = moshi.f(com.squareup.moshi.D.e(List.class, String.class), m11, "requiredDomains");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfStringAdapter = f11;
        JsonAdapter<List<String>> f12 = moshi.f(com.squareup.moshi.D.e(List.class, String.class), m11, "nonRequiredDomains");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfStringAdapter = f12;
        JsonAdapter<Long> f13 = moshi.f(Long.TYPE, m11, "lastCallMS");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.longAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.TYPE, m11, "checkAppVersion");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.booleanAdapter = f14;
        JsonAdapter<Set<String>> f15 = moshi.f(com.squareup.moshi.D.e(Set.class, String.class), m11, "allDomains");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.setOfStringAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(49, "GeneratedJsonAdapter(Sso2MobileConfigResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Sso2MobileConfigResponseDTO fromJson(@NotNull com.squareup.moshi.n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Long l11 = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        Integer num = null;
        Set<String> set = null;
        List<String> list = null;
        List<String> list2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw Y9.c.q("refreshInterval", "refreshInterval", reader);
                    }
                    break;
                case 1:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw Y9.c.q("requiredDomains", "requiredDomains", reader);
                    }
                    break;
                case 2:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        throw Y9.c.q("lastCallMS", "lastCallMS", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw Y9.c.q("checkAppVersion", "checkAppVersion", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    set = this.setOfStringAdapter.fromJson(reader);
                    if (set == null) {
                        throw Y9.c.q("allDomains", "allDomains", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw Y9.c.q("logsEnabled", "logsEnabled", reader);
                    }
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -125) {
            if (num == null) {
                throw Y9.c.j("refreshInterval", "refreshInterval", reader);
            }
            int intValue = num.intValue();
            if (list == null) {
                throw Y9.c.j("requiredDomains", "requiredDomains", reader);
            }
            long longValue = l11.longValue();
            boolean booleanValue = bool2.booleanValue();
            Intrinsics.g(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            return new Sso2MobileConfigResponseDTO(intValue, list, list2, longValue, booleanValue, set, bool3.booleanValue());
        }
        Set<String> set2 = set;
        Constructor<Sso2MobileConfigResponseDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Y9.c.f34864d;
            Class cls2 = Long.TYPE;
            Class cls3 = Boolean.TYPE;
            Class cls4 = Integer.TYPE;
            constructor = Sso2MobileConfigResponseDTO.class.getDeclaredConstructor(cls4, List.class, List.class, cls2, cls3, Set.class, cls3, cls4, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num == null) {
            throw Y9.c.j("refreshInterval", "refreshInterval", reader);
        }
        if (list == null) {
            throw Y9.c.j("requiredDomains", "requiredDomains", reader);
        }
        Sso2MobileConfigResponseDTO newInstance = constructor.newInstance(num, list, list2, l11, bool2, set2, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull com.squareup.moshi.x writer, Sso2MobileConfigResponseDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("refreshInterval");
        this.intAdapter.mo44toJson(writer, (com.squareup.moshi.x) Integer.valueOf(value_.getRefreshInterval()));
        writer.w("requiredDomains");
        this.listOfStringAdapter.mo44toJson(writer, (com.squareup.moshi.x) value_.getRequiredDomains());
        writer.w("nonRequiredDomains");
        this.nullableListOfStringAdapter.mo44toJson(writer, (com.squareup.moshi.x) value_.getNonRequiredDomains());
        writer.w("lastCallMS");
        this.longAdapter.mo44toJson(writer, (com.squareup.moshi.x) Long.valueOf(value_.getLastCallMS()));
        writer.w("checkAppVersion");
        this.booleanAdapter.mo44toJson(writer, (com.squareup.moshi.x) Boolean.valueOf(value_.getCheckAppVersion()));
        writer.w("allDomains");
        this.setOfStringAdapter.mo44toJson(writer, (com.squareup.moshi.x) value_.getAllDomains());
        writer.w("logsEnabled");
        this.booleanAdapter.mo44toJson(writer, (com.squareup.moshi.x) Boolean.valueOf(value_.getLogsEnabled()));
        writer.p();
    }
}
