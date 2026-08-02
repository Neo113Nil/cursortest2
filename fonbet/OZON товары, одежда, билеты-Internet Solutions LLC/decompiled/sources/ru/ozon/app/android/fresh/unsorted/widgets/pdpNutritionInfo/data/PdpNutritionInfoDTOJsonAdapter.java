package ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$Info;", "nullableInfoAdapter", "nullableStringAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$RoundedCorners;", "roundedCornersAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$ContainerPaddings;", "containerPaddingsAdapter", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpNutritionInfo/data/PdpNutritionInfoDTO$SauceInfo;", "nullableSauceInfoAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpNutritionInfoDTOJsonAdapter extends JsonAdapter<PdpNutritionInfoDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<PdpNutritionInfoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<PdpNutritionInfoDTO.ContainerPaddings> containerPaddingsAdapter;

    @NotNull
    private final JsonAdapter<PdpNutritionInfoDTO.Info> nullableInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PdpNutritionInfoDTO.SauceInfo> nullableSauceInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PdpNutritionInfoDTO.RoundedCorners> roundedCornersAdapter;

    public PdpNutritionInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "info", "backgroundColor", "corners", "paddings", "sauceInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
        this.nullableInfoAdapter = moshi.f(PdpNutritionInfoDTO.Info.class, m11, "info");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.roundedCornersAdapter = moshi.f(PdpNutritionInfoDTO.RoundedCorners.class, m11, "corners");
        this.containerPaddingsAdapter = moshi.f(PdpNutritionInfoDTO.ContainerPaddings.class, m11, "paddings");
        this.nullableSauceInfoAdapter = moshi.f(PdpNutritionInfoDTO.SauceInfo.class, m11, "sauceInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(PdpNutritionInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PdpNutritionInfoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ButtonV3DTO buttonV3DTO = null;
        PdpNutritionInfoDTO.Info info = null;
        String str = null;
        PdpNutritionInfoDTO.RoundedCorners roundedCorners = null;
        PdpNutritionInfoDTO.ContainerPaddings containerPaddings = null;
        PdpNutritionInfoDTO.SauceInfo sauceInfo = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 1:
                    info = this.nullableInfoAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    roundedCorners = this.roundedCornersAdapter.fromJson(reader);
                    if (roundedCorners == null) {
                        throw c.q("corners", "corners", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    containerPaddings = this.containerPaddingsAdapter.fromJson(reader);
                    if (containerPaddings == null) {
                        throw c.q("paddings", "paddings", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    sauceInfo = this.nullableSauceInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -25) {
            String str2 = str;
            PdpNutritionInfoDTO.Info info2 = info;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            if (buttonV3DTO2 == null) {
                throw c.j("button", "button", reader);
            }
            Intrinsics.g(roundedCorners, "null cannot be cast to non-null type ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO.RoundedCorners");
            Intrinsics.g(containerPaddings, "null cannot be cast to non-null type ru.ozon.app.android.fresh.unsorted.widgets.pdpNutritionInfo.data.PdpNutritionInfoDTO.ContainerPaddings");
            Map<String, TokenizedTrackingInfo> map2 = map;
            return new PdpNutritionInfoDTO(buttonV3DTO2, info2, str2, roundedCorners, containerPaddings, sauceInfo, map2);
        }
        String str3 = str;
        PdpNutritionInfoDTO.Info info3 = info;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        Constructor<PdpNutritionInfoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PdpNutritionInfoDTO.class.getDeclaredConstructor(ButtonV3DTO.class, PdpNutritionInfoDTO.Info.class, String.class, PdpNutritionInfoDTO.RoundedCorners.class, PdpNutritionInfoDTO.ContainerPaddings.class, PdpNutritionInfoDTO.SauceInfo.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<PdpNutritionInfoDTO> constructor2 = constructor;
        if (buttonV3DTO3 == null) {
            throw c.j("button", "button", reader);
        }
        PdpNutritionInfoDTO newInstance = constructor2.newInstance(buttonV3DTO3, info3, str3, roundedCorners, containerPaddings, sauceInfo, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PdpNutritionInfoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("info");
        this.nullableInfoAdapter.mo44toJson(writer, (x) value.getInfo());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("corners");
        this.roundedCornersAdapter.mo44toJson(writer, (x) value.getCorners());
        writer.w("paddings");
        this.containerPaddingsAdapter.mo44toJson(writer, (x) value.getPaddings());
        writer.w("sauceInfo");
        this.nullableSauceInfoAdapter.mo44toJson(writer, (x) value.getSauceInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
