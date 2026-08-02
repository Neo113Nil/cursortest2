package ru.ozon.app.android.pdp.widgets.curtainPrice.data;

import Ak.b;
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
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$Island;", "nullableIslandAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "nullablePriceWrapperDTOAdapter", "", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$AdditionalInfoDTO;", "nullableListOfAdditionalInfoDTOAdapter", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$SettingsDTO;", "settingsDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurtainPriceDTOJsonAdapter extends JsonAdapter<CurtainPriceDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CurtainPriceDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CurtainPriceDTO.Island> nullableIslandAdapter;

    @NotNull
    private final JsonAdapter<List<CurtainPriceDTO.AdditionalInfoDTO>> nullableListOfAdditionalInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CurtainPriceDTO.PriceWrapperDTO> nullablePriceWrapperDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CurtainPriceDTO.SettingsDTO> settingsDTOAdapter;

    public CurtainPriceDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("island", "regularPrice", "additionalInfo", "settings", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableIslandAdapter = moshi.f(CurtainPriceDTO.Island.class, m11, "island");
        this.nullablePriceWrapperDTOAdapter = moshi.f(CurtainPriceDTO.PriceWrapperDTO.class, m11, "regularPrice");
        this.nullableListOfAdditionalInfoDTOAdapter = moshi.f(D.e(List.class, CurtainPriceDTO.AdditionalInfoDTO.class), m11, "additionalInfo");
        this.settingsDTOAdapter = moshi.f(CurtainPriceDTO.SettingsDTO.class, m11, "settings");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(CurtainPriceDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CurtainPriceDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CurtainPriceDTO.Island island = null;
        CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO = null;
        List<CurtainPriceDTO.AdditionalInfoDTO> list = null;
        CurtainPriceDTO.SettingsDTO settingsDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                island = this.nullableIslandAdapter.fromJson(reader);
            } else if (v11 == 1) {
                priceWrapperDTO = this.nullablePriceWrapperDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                list = this.nullableListOfAdditionalInfoDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                settingsDTO = this.settingsDTOAdapter.fromJson(reader);
                if (settingsDTO == null) {
                    throw c.q("settings", "settings", reader);
                }
                i11 = -9;
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            List<CurtainPriceDTO.AdditionalInfoDTO> list2 = list;
            CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO2 = priceWrapperDTO;
            Intrinsics.g(settingsDTO, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO.SettingsDTO");
            return new CurtainPriceDTO(island, priceWrapperDTO2, list2, settingsDTO, map);
        }
        List<CurtainPriceDTO.AdditionalInfoDTO> list3 = list;
        CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO3 = priceWrapperDTO;
        CurtainPriceDTO.Island island2 = island;
        Constructor<CurtainPriceDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CurtainPriceDTO.class.getDeclaredConstructor(CurtainPriceDTO.Island.class, CurtainPriceDTO.PriceWrapperDTO.class, List.class, CurtainPriceDTO.SettingsDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        CurtainPriceDTO newInstance = constructor.newInstance(island2, priceWrapperDTO3, list3, settingsDTO, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CurtainPriceDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("island");
        this.nullableIslandAdapter.mo44toJson(writer, (x) value.getIsland());
        writer.w("regularPrice");
        this.nullablePriceWrapperDTOAdapter.mo44toJson(writer, (x) value.getRegularPrice());
        writer.w("additionalInfo");
        this.nullableListOfAdditionalInfoDTOAdapter.mo44toJson(writer, (x) value.getAdditionalInfo());
        writer.w("settings");
        this.settingsDTOAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
