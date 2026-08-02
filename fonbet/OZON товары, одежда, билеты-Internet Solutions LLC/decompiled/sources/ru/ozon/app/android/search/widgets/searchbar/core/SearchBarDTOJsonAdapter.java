package ru.ozon.app.android.search.widgets.searchbar.core;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019¨\u00064"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "booleanAdapter", "nullableStringAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;", "nullableSearchButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "nullableReturnKeyTypeAdapter", "", "nullableLongAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;", "nullableColorsAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "nullableSearchByImageAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "nullableDynamicOnScrollColorsAdapter", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "nullableTooltipAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarDTOJsonAdapter extends JsonAdapter<SearchBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.Colors> nullableColorsAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.DynamicOnScrollColors> nullableDynamicOnScrollColorsAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.ReturnKeyType> nullableReturnKeyTypeAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.SearchButton> nullableSearchButtonAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.SearchByImage> nullableSearchByImageAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<SearchBarDTO.Tooltip> nullableTooltipAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public SearchBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isActive", "deeplink", "link", HammersV3BodyDTO.PLACEHOLDER, "scanItDeeplink", "scanItEnabled", "text", "searchButton", "scanItTrackingInfo", "voiceTrackingInfo", "searchBarTrackingInfo", "keyboardSearchTrackingInfo", "returnKeyType", "searchDelay", "cornerRadius", "colors", "maxSearchQueryTextLength", "isDynamicUpdateDisabled", "onboarding", "searchByImage", "dynamicOnScrollColors", "minTextLength", "tooltip", "rightButton");
        M m11 = M.f71699a;
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isActive");
        this.stringAdapter = moshi.f(String.class, m11, "deeplink");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "scanItEnabled");
        this.nullableStringAdapter = moshi.f(String.class, m11, "text");
        this.nullableSearchButtonAdapter = moshi.f(SearchBarDTO.SearchButton.class, m11, "searchButton");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "scanItTrackingInfo");
        this.nullableReturnKeyTypeAdapter = moshi.f(SearchBarDTO.ReturnKeyType.class, m11, "returnKeyType");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "searchDelay");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "cornerRadius");
        this.nullableColorsAdapter = moshi.f(SearchBarDTO.Colors.class, m11, "colors");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
        this.nullableSearchByImageAdapter = moshi.f(SearchBarDTO.SearchByImage.class, m11, "searchByImage");
        this.nullableDynamicOnScrollColorsAdapter = moshi.f(SearchBarDTO.DynamicOnScrollColors.class, m11, "dynamicOnScrollColors");
        this.nullableTooltipAdapter = moshi.f(SearchBarDTO.Tooltip.class, m11, "tooltip");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "rightButton");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(SearchBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        SearchBarDTO.SearchButton searchButton = null;
        Map<String, TokenizedTrackingInfo> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        Map<String, TokenizedTrackingInfo> map3 = null;
        Map<String, TokenizedTrackingInfo> map4 = null;
        SearchBarDTO.ReturnKeyType returnKeyType = null;
        Long l11 = null;
        Integer num = null;
        SearchBarDTO.Colors colors = null;
        Integer num2 = null;
        Boolean bool3 = null;
        OnBoardingDTO onBoardingDTO = null;
        SearchBarDTO.SearchByImage searchByImage = null;
        SearchBarDTO.DynamicOnScrollColors dynamicOnScrollColors = null;
        Integer num3 = null;
        SearchBarDTO.Tooltip tooltip = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        while (true) {
            Boolean bool4 = bool;
            Boolean bool5 = bool2;
            String str6 = str;
            if (!reader.hasNext()) {
                String str7 = str2;
                reader.endObject();
                if (str6 == null) {
                    throw c.j("deeplink", "deeplink", reader);
                }
                if (str7 == null) {
                    throw c.j("link", "link", reader);
                }
                if (str3 == null) {
                    throw c.j(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                }
                if (str4 == null) {
                    throw c.j("scanItDeeplink", "scanItDeeplink", reader);
                }
                if (bool4 != null) {
                    return new SearchBarDTO(bool5, str6, str7, str3, str4, bool4.booleanValue(), str5, searchButton, map, map2, map3, map4, returnKeyType, l11, num, colors, num2, bool3, onBoardingDTO, searchByImage, dynamicOnScrollColors, num3, tooltip, iconButtonV3DTO);
                }
                throw c.j("scanItEnabled", "scanItEnabled", reader);
            }
            String str8 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 0:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    str = str6;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("deeplink", "deeplink", reader);
                    }
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("link", "link", reader);
                    }
                    bool = bool4;
                    bool2 = bool5;
                    str = str6;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(HammersV3BodyDTO.PLACEHOLDER, HammersV3BodyDTO.PLACEHOLDER, reader);
                    }
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("scanItDeeplink", "scanItDeeplink", reader);
                    }
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("scanItEnabled", "scanItEnabled", reader);
                    }
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 7:
                    searchButton = this.nullableSearchButtonAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 9:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 10:
                    map3 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 11:
                    map4 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 12:
                    returnKeyType = this.nullableReturnKeyTypeAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 13:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 14:
                    num = this.nullableIntAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 15:
                    colors = this.nullableColorsAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 16:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 17:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 18:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 19:
                    searchByImage = this.nullableSearchByImageAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 20:
                    dynamicOnScrollColors = this.nullableDynamicOnScrollColorsAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 21:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 22:
                    tooltip = this.nullableTooltipAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                case 23:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
                default:
                    bool = bool4;
                    str2 = str8;
                    bool2 = bool5;
                    str = str6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isActive");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isActive());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeeplink());
        writer.w("link");
        this.stringAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w(HammersV3BodyDTO.PLACEHOLDER);
        this.stringAdapter.mo44toJson(writer, (x) value.getPlaceholder());
        writer.w("scanItDeeplink");
        this.stringAdapter.mo44toJson(writer, (x) value.getScanItDeeplink());
        writer.w("scanItEnabled");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getScanItEnabled()));
        writer.w("text");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("searchButton");
        this.nullableSearchButtonAdapter.mo44toJson(writer, (x) value.getSearchButton());
        writer.w("scanItTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getScanItTrackingInfo());
        writer.w("voiceTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getVoiceTrackingInfo());
        writer.w("searchBarTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getSearchBarTrackingInfo());
        writer.w("keyboardSearchTrackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getKeyboardSearchTrackingInfo());
        writer.w("returnKeyType");
        this.nullableReturnKeyTypeAdapter.mo44toJson(writer, (x) value.getReturnKeyType());
        writer.w("searchDelay");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getSearchDelay());
        writer.w("cornerRadius");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("colors");
        this.nullableColorsAdapter.mo44toJson(writer, (x) value.getColors());
        writer.w("maxSearchQueryTextLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMaxSearchQueryTextLength());
        writer.w("isDynamicUpdateDisabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isDynamicUpdateDisabled());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.w("searchByImage");
        this.nullableSearchByImageAdapter.mo44toJson(writer, (x) value.getSearchByImage());
        writer.w("dynamicOnScrollColors");
        this.nullableDynamicOnScrollColorsAdapter.mo44toJson(writer, (x) value.getDynamicOnScrollColors());
        writer.w("minTextLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getMinTextLength());
        writer.w("tooltip");
        this.nullableTooltipAdapter.mo44toJson(writer, (x) value.getTooltip());
        writer.w("rightButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.p();
    }
}
