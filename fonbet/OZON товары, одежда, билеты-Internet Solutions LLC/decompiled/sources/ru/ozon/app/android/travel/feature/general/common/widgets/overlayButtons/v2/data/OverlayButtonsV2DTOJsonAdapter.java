package ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data;

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
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2DTO;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/overlayButtons/v2/data/OverlayButtonsV2DTO$ButtonDTO;", "listOfButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "nullableAsyncActionDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OverlayButtonsV2DTOJsonAdapter extends JsonAdapter<OverlayButtonsV2DTO> {
    public static final int $stable = 8;
    private volatile Constructor<OverlayButtonsV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<OverlayButtonsV2DTO.ButtonDTO>> listOfButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<AsyncActionDTO> nullableAsyncActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OverlayButtonsV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("buttons", "backgroundColor", "dividerColor", "viewTracking", "asyncBehavior");
        b e11 = D.e(List.class, OverlayButtonsV2DTO.ButtonDTO.class);
        M m11 = M.f71699a;
        this.listOfButtonDTOAdapter = moshi.f(e11, m11, "buttons");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "dividerColor");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
        this.nullableAsyncActionDTOAdapter = moshi.f(AsyncActionDTO.class, m11, "asyncBehavior");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(41, "GeneratedJsonAdapter(OverlayButtonsV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OverlayButtonsV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<OverlayButtonsV2DTO.ButtonDTO> list = null;
        String str = null;
        String str2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AsyncActionDTO asyncActionDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfButtonDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("buttons", "buttons", reader);
                }
                i11 = -2;
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
            } else if (v11 == 2) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 3) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 4) {
                asyncActionDTO = this.nullableAsyncActionDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v2.data.OverlayButtonsV2DTO.ButtonDTO>");
            if (str == null) {
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            AsyncActionDTO asyncActionDTO2 = asyncActionDTO;
            Map<String, TokenizedTrackingInfo> map2 = map;
            return new OverlayButtonsV2DTO(list, str, str2, map2, asyncActionDTO2);
        }
        Constructor<OverlayButtonsV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OverlayButtonsV2DTO.class.getDeclaredConstructor(List.class, String.class, String.class, Map.class, AsyncActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        OverlayButtonsV2DTO newInstance = constructor.newInstance(list, str, str2, map, asyncActionDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OverlayButtonsV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("buttons");
        this.listOfButtonDTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("dividerColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getDividerColor());
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.w("asyncBehavior");
        this.nullableAsyncActionDTOAdapter.mo44toJson(writer, (x) value.getAsyncBehavior());
        writer.p();
    }
}
