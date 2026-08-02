package ru.ozon.app.android.pdp.ui.configurators.pdp.nutritionInfov2;

import Co.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/nutritionInfov2/NutritionInfoV2DTO;", "", "backgroundColor", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "values", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/nutritionInfov2/NutritionItem;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/Map;Ljava/util/List;)V", "getBackgroundColor", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NutritionInfoV2DTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @NotNull
    private final List<NutritionItem> values;

    public NutritionInfoV2DTO(String str, TextDTO textDTO, Map<String, TokenizedTrackingInfo> map, @NotNull List<NutritionItem> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.backgroundColor = str;
        this.title = textDTO;
        this.trackingInfo = map;
        this.values = values;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NutritionInfoV2DTO copy$default(NutritionInfoV2DTO nutritionInfoV2DTO, String str, TextDTO textDTO, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = nutritionInfoV2DTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            textDTO = nutritionInfoV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            map = nutritionInfoV2DTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            list = nutritionInfoV2DTO.values;
        }
        return nutritionInfoV2DTO.copy(str, textDTO, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<NutritionItem> component4() {
        return this.values;
    }

    @NotNull
    public final NutritionInfoV2DTO copy(String backgroundColor, TextDTO title, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull List<NutritionItem> values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return new NutritionInfoV2DTO(backgroundColor, title, trackingInfo, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NutritionInfoV2DTO)) {
            return false;
        }
        NutritionInfoV2DTO nutritionInfoV2DTO = (NutritionInfoV2DTO) other;
        return Intrinsics.d(this.backgroundColor, nutritionInfoV2DTO.backgroundColor) && Intrinsics.d(this.title, nutritionInfoV2DTO.title) && Intrinsics.d(this.trackingInfo, nutritionInfoV2DTO.trackingInfo) && Intrinsics.d(this.values, nutritionInfoV2DTO.values);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @NotNull
    public final List<NutritionItem> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TextDTO textDTO = this.title;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return this.values.hashCode() + ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        TextDTO textDTO = this.title;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        List<NutritionItem> list = this.values;
        StringBuilder b11 = a.b("NutritionInfoV2DTO(backgroundColor=", textDTO, str, ", title=", ", trackingInfo=");
        b11.append(map);
        b11.append(", values=");
        b11.append(list);
        b11.append(")");
        return b11.toString();
    }
}
