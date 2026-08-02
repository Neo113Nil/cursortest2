package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data;

import Ak.b;
import C.o0;
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
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;", "nullableHeaderSectionDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "listOfFormBlockDTOAdapter", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;", "nullableButtonSectionDTOAdapter", "", "intAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFormDTOJsonAdapter extends JsonAdapter<B2bFormDTO> {
    public static final int $stable = 8;
    private volatile Constructor<B2bFormDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<B2bFormDTO.FormBlockDTO>> listOfFormBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<B2bFormDTO.ButtonSectionDTO> nullableButtonSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<B2bFormDTO.HeaderSectionDTO> nullableHeaderSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public B2bFormDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("headerSection", "formBlockList", "buttonSection", "gap", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableHeaderSectionDTOAdapter = moshi.f(B2bFormDTO.HeaderSectionDTO.class, m11, "headerSection");
        this.listOfFormBlockDTOAdapter = moshi.f(D.e(List.class, B2bFormDTO.FormBlockDTO.class), m11, "formBlockList");
        this.nullableButtonSectionDTOAdapter = moshi.f(B2bFormDTO.ButtonSectionDTO.class, m11, "buttonSection");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "gap");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public B2bFormDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        B2bFormDTO.HeaderSectionDTO headerSectionDTO = null;
        List<B2bFormDTO.FormBlockDTO> list = null;
        B2bFormDTO.ButtonSectionDTO buttonSectionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                headerSectionDTO = this.nullableHeaderSectionDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfFormBlockDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("formBlockList", "formBlockList", reader);
                }
            } else if (v11 == 2) {
                buttonSectionDTO = this.nullableButtonSectionDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("gap", "gap", reader);
                }
                i11 = -9;
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            if (list == null) {
                throw c.j("formBlockList", "formBlockList", reader);
            }
            return new B2bFormDTO(headerSectionDTO, list, buttonSectionDTO, a11.intValue(), map);
        }
        Constructor<B2bFormDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = B2bFormDTO.class.getDeclaredConstructor(B2bFormDTO.HeaderSectionDTO.class, List.class, B2bFormDTO.ButtonSectionDTO.class, cls2, Map.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("formBlockList", "formBlockList", reader);
        }
        B2bFormDTO newInstance = constructor.newInstance(headerSectionDTO, list, buttonSectionDTO, a11, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(32, "GeneratedJsonAdapter(B2bFormDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, B2bFormDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("headerSection");
        this.nullableHeaderSectionDTOAdapter.mo44toJson(writer, (x) value.getHeaderSection());
        writer.w("formBlockList");
        this.listOfFormBlockDTOAdapter.mo44toJson(writer, (x) value.getFormBlockList());
        writer.w("buttonSection");
        this.nullableButtonSectionDTOAdapter.mo44toJson(writer, (x) value.getButtonSection());
        writer.w("gap");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getGap()));
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
