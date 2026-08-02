package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.data;

import G.g;
import Hj.C3143a;
import Ih.a;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorAtomDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001!BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JT\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO;", "", DynamicElementDTO.TABS, "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO$MorkovskTabItemDTO;", "animationTime", "", "bgGradientColors", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;)V", "getTabs", "()Ljava/util/List;", "getAnimationTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBgGradientColors", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO;", "equals", "", "other", "hashCode", "toString", "MorkovskTabItemDTO", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskTabbarDTO {
    public static final int $stable = 8;
    private final Integer animationTime;
    private final List<String> bgGradientColors;

    @NotNull
    private final List<MorkovskTabItemDTO> tabs;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/data/MorkovskTabbarDTO$MorkovskTabItemDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "imageUrl", "backgroundImage", "indicator", "Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getImageUrl", "getBackgroundImage", "getIndicator", "()Lru/ozon/app/android/regulardraw/ui/indicator/IndicatorAtomDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MorkovskTabItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String backgroundImage;

        @NotNull
        private final String imageUrl;
        private final IndicatorAtomDTO indicator;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public MorkovskTabItemDTO(@NotNull String title, @NotNull String imageUrl, @NotNull String backgroundImage, IndicatorAtomDTO indicatorAtomDTO, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.imageUrl = imageUrl;
            this.backgroundImage = backgroundImage;
            this.indicator = indicatorAtomDTO;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ MorkovskTabItemDTO copy$default(MorkovskTabItemDTO morkovskTabItemDTO, String str, String str2, String str3, IndicatorAtomDTO indicatorAtomDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = morkovskTabItemDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = morkovskTabItemDTO.imageUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = morkovskTabItemDTO.backgroundImage;
            }
            if ((i11 & 8) != 0) {
                indicatorAtomDTO = morkovskTabItemDTO.indicator;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = morkovskTabItemDTO.action;
            }
            if ((i11 & 32) != 0) {
                map = morkovskTabItemDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return morkovskTabItemDTO.copy(str, str2, str3, indicatorAtomDTO, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* renamed from: component4, reason: from getter */
        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final MorkovskTabItemDTO copy(@NotNull String title, @NotNull String imageUrl, @NotNull String backgroundImage, IndicatorAtomDTO indicator, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
            Intrinsics.checkNotNullParameter(action, "action");
            return new MorkovskTabItemDTO(title, imageUrl, backgroundImage, indicator, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MorkovskTabItemDTO)) {
                return false;
            }
            MorkovskTabItemDTO morkovskTabItemDTO = (MorkovskTabItemDTO) other;
            return Intrinsics.d(this.title, morkovskTabItemDTO.title) && Intrinsics.d(this.imageUrl, morkovskTabItemDTO.imageUrl) && Intrinsics.d(this.backgroundImage, morkovskTabItemDTO.backgroundImage) && Intrinsics.d(this.indicator, morkovskTabItemDTO.indicator) && Intrinsics.d(this.action, morkovskTabItemDTO.action) && Intrinsics.d(this.trackingInfo, morkovskTabItemDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final IndicatorAtomDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.title.hashCode() * 31, 31, this.imageUrl), 31, this.backgroundImage);
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            int b11 = a.b(this.action, (a11 + (indicatorAtomDTO == null ? 0 : indicatorAtomDTO.hashCode())) * 31, 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.imageUrl;
            String str3 = this.backgroundImage;
            IndicatorAtomDTO indicatorAtomDTO = this.indicator;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("MorkovskTabItemDTO(title=", str, ", imageUrl=", str2, ", backgroundImage=");
            d11.append(str3);
            d11.append(", indicator=");
            d11.append(indicatorAtomDTO);
            d11.append(", action=");
            return D40.a.d(d11, atomActionDTO, ", trackingInfo=", map, ")");
        }
    }

    public MorkovskTabbarDTO(@NotNull List<MorkovskTabItemDTO> tabs, Integer num, List<String> list, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.tabs = tabs;
        this.animationTime = num;
        this.bgGradientColors = list;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MorkovskTabbarDTO copy$default(MorkovskTabbarDTO morkovskTabbarDTO, List list, Integer num, List list2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = morkovskTabbarDTO.tabs;
        }
        if ((i11 & 2) != 0) {
            num = morkovskTabbarDTO.animationTime;
        }
        if ((i11 & 4) != 0) {
            list2 = morkovskTabbarDTO.bgGradientColors;
        }
        if ((i11 & 8) != 0) {
            map = morkovskTabbarDTO.trackingInfo;
        }
        return morkovskTabbarDTO.copy(list, num, list2, map);
    }

    @NotNull
    public final List<MorkovskTabItemDTO> component1() {
        return this.tabs;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAnimationTime() {
        return this.animationTime;
    }

    public final List<String> component3() {
        return this.bgGradientColors;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    @NotNull
    public final MorkovskTabbarDTO copy(@NotNull List<MorkovskTabItemDTO> tabs, Integer animationTime, List<String> bgGradientColors, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new MorkovskTabbarDTO(tabs, animationTime, bgGradientColors, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskTabbarDTO)) {
            return false;
        }
        MorkovskTabbarDTO morkovskTabbarDTO = (MorkovskTabbarDTO) other;
        return Intrinsics.d(this.tabs, morkovskTabbarDTO.tabs) && Intrinsics.d(this.animationTime, morkovskTabbarDTO.animationTime) && Intrinsics.d(this.bgGradientColors, morkovskTabbarDTO.bgGradientColors) && Intrinsics.d(this.trackingInfo, morkovskTabbarDTO.trackingInfo);
    }

    public final Integer getAnimationTime() {
        return this.animationTime;
    }

    public final List<String> getBgGradientColors() {
        return this.bgGradientColors;
    }

    @NotNull
    public final List<MorkovskTabItemDTO> getTabs() {
        return this.tabs;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.tabs.hashCode() * 31;
        Integer num = this.animationTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.bgGradientColors;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<MorkovskTabItemDTO> list = this.tabs;
        Integer num = this.animationTime;
        List<String> list2 = this.bgGradientColors;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("MorkovskTabbarDTO(tabs=");
        sb2.append(list);
        sb2.append(", animationTime=");
        sb2.append(num);
        sb2.append(", bgGradientColors=");
        return C3143a.h(sb2, list2, ", trackingInfo=", map, ")");
    }
}
