package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

import C.o0;
import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/BadgeListV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "listOfBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "intAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListV2DTOJsonAdapter extends JsonAdapter<BadgeListV2DTO> {
    public static final int $stable = 8;
    private volatile Constructor<BadgeListV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> listOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public BadgeListV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badges", "trackingInfo", "spacedBy", "inset", "json");
        b e11 = D.e(List.class, BadgeDTO.class);
        M m11 = M.f71699a;
        this.listOfBadgeDTOAdapter = moshi.f(e11, m11, "badges");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "spacedBy");
        this.nullableStringAdapter = moshi.f(String.class, m11, "json");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BadgeListV2DTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        List<BadgeDTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        String str = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfBadgeDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("badges", "badges", reader);
                }
            } else if (v11 == 1) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 2) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("spacedBy", "spacedBy", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw c.q("inset", "inset", reader);
                }
                i11 &= -9;
            } else if (v11 == 4) {
                str = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -13) {
            if (list == null) {
                throw c.j("badges", "badges", reader);
            }
            return new BadgeListV2DTO(list, map, a11.intValue(), num.intValue(), str);
        }
        Constructor<BadgeListV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = BadgeListV2DTO.class.getDeclaredConstructor(List.class, Map.class, cls2, cls2, String.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("badges", "badges", reader);
        }
        BadgeListV2DTO newInstance = constructor.newInstance(list, map, a11, num, str, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(BadgeListV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BadgeListV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badges");
        this.listOfBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("spacedBy");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getSpacedBy()));
        writer.w("inset");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getInset()));
        writer.w("json");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getJson());
        writer.p();
    }
}
