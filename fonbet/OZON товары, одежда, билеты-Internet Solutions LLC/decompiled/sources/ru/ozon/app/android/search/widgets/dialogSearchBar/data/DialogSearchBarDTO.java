package ru.ozon.app.android.search.widgets.dialogSearchBar.data;

import B3.p;
import H3.c;
import N3.C3660k;
import T7.P;
import Xc.a;
import Xc.b;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\bBCDEFGHIB\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0017HÆ\u0003J£\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006J"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO;", "", "inputText", "", HammersV3BodyDTO.PLACEHOLDER, "widgetRefresh", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "pageRefresh", "returnKey", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;", "tapTagOptions", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "usedTags", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;", "allFilters", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;", "pageInteraction", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "defaultStateLink", "searchBarStyles", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;Ljava/util/Map;Ljava/lang/String;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getInputText", "()Ljava/lang/String;", "getPlaceholder", "getWidgetRefresh", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "getPageRefresh", "getReturnKey", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;", "getTapTagOptions", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "getUsedTags", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;", "getAllFilters", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;", "getPageInteraction", "()Ljava/util/Map;", "getDefaultStateLink", "getSearchBarStyles", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "RefreshInfo", "ReturnKeyInfo", "TapTagOptions", "TagsList", "AllFiltersButton", "SearchBarStyles", "SearchPaddings", "ReturnKeyType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DialogSearchBarDTO {
    public static final int $stable = 8;
    private final AllFiltersButton allFilters;
    private final String defaultStateLink;
    private final String inputText;
    private final Map<String, TokenizedTrackingInfo> pageInteraction;
    private final RefreshInfo pageRefresh;
    private final String placeholder;
    private final ReturnKeyInfo returnKey;
    private final IconButtonV3DTO rightButton;
    private final SearchBarStyles searchBarStyles;
    private final TapTagOptions tapTagOptions;
    private final TagsList usedTags;

    @NotNull
    private final RefreshInfo widgetRefresh;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$AllFiltersButton;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllFiltersButton {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO button;
        private final IndicatorDTO indicator;

        public AllFiltersButton(@NotNull IconButtonV3DTO button, IndicatorDTO indicatorDTO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.indicator = indicatorDTO;
        }

        public static /* synthetic */ AllFiltersButton copy$default(AllFiltersButton allFiltersButton, IconButtonV3DTO iconButtonV3DTO, IndicatorDTO indicatorDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = allFiltersButton.button;
            }
            if ((i11 & 2) != 0) {
                indicatorDTO = allFiltersButton.indicator;
            }
            return allFiltersButton.copy(iconButtonV3DTO, indicatorDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final AllFiltersButton copy(@NotNull IconButtonV3DTO button, IndicatorDTO indicator) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new AllFiltersButton(button, indicator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllFiltersButton)) {
                return false;
            }
            AllFiltersButton allFiltersButton = (AllFiltersButton) other;
            return Intrinsics.d(this.button, allFiltersButton.button) && Intrinsics.d(this.indicator, allFiltersButton.indicator);
        }

        @NotNull
        public final IconButtonV3DTO getButton() {
            return this.button;
        }

        public final IndicatorDTO getIndicator() {
            return this.indicator;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            IndicatorDTO indicatorDTO = this.indicator;
            return hashCode + (indicatorDTO == null ? 0 : indicatorDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "AllFiltersButton(button=" + this.button + ", indicator=" + this.indicator + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "", ImagesContract.URL, "", "debounceMs", "", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getDebounceMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$RefreshInfo;", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshInfo {
        public static final int $stable = 8;
        private final Long debounceMs;
        private final Map<String, TokenizedTrackingInfo> tracking;

        @NotNull
        private final String url;

        public RefreshInfo(@NotNull String url, Long l11, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.debounceMs = l11;
            this.tracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RefreshInfo copy$default(RefreshInfo refreshInfo, String str, Long l11, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = refreshInfo.url;
            }
            if ((i11 & 2) != 0) {
                l11 = refreshInfo.debounceMs;
            }
            if ((i11 & 4) != 0) {
                map = refreshInfo.tracking;
            }
            return refreshInfo.copy(str, l11, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final Long getDebounceMs() {
            return this.debounceMs;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.tracking;
        }

        @NotNull
        public final RefreshInfo copy(@NotNull String url, Long debounceMs, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new RefreshInfo(url, debounceMs, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshInfo)) {
                return false;
            }
            RefreshInfo refreshInfo = (RefreshInfo) other;
            return Intrinsics.d(this.url, refreshInfo.url) && Intrinsics.d(this.debounceMs, refreshInfo.debounceMs) && Intrinsics.d(this.tracking, refreshInfo.tracking);
        }

        public final Long getDebounceMs() {
            return this.debounceMs;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Long l11 = this.debounceMs;
            int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            Long l11 = this.debounceMs;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder sb2 = new StringBuilder("RefreshInfo(url=");
            sb2.append(str);
            sb2.append(", debounceMs=");
            sb2.append(l11);
            sb2.append(", tracking=");
            return P.f(sb2, map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyInfo;", "", "type", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;", "pressControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getType", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;", "getPressControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReturnKeyInfo {
        public static final int $stable = 0;
        private final CommonControlSettings pressControl;
        private final ReturnKeyType type;

        public ReturnKeyInfo(ReturnKeyType returnKeyType, CommonControlSettings commonControlSettings) {
            this.type = returnKeyType;
            this.pressControl = commonControlSettings;
        }

        public static /* synthetic */ ReturnKeyInfo copy$default(ReturnKeyInfo returnKeyInfo, ReturnKeyType returnKeyType, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                returnKeyType = returnKeyInfo.type;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = returnKeyInfo.pressControl;
            }
            return returnKeyInfo.copy(returnKeyType, commonControlSettings);
        }

        /* renamed from: component1, reason: from getter */
        public final ReturnKeyType getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getPressControl() {
            return this.pressControl;
        }

        @NotNull
        public final ReturnKeyInfo copy(ReturnKeyType type, CommonControlSettings pressControl) {
            return new ReturnKeyInfo(type, pressControl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReturnKeyInfo)) {
                return false;
            }
            ReturnKeyInfo returnKeyInfo = (ReturnKeyInfo) other;
            return this.type == returnKeyInfo.type && Intrinsics.d(this.pressControl, returnKeyInfo.pressControl);
        }

        public final CommonControlSettings getPressControl() {
            return this.pressControl;
        }

        public final ReturnKeyType getType() {
            return this.type;
        }

        public int hashCode() {
            ReturnKeyType returnKeyType = this.type;
            int hashCode = (returnKeyType == null ? 0 : returnKeyType.hashCode()) * 31;
            CommonControlSettings commonControlSettings = this.pressControl;
            return hashCode + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReturnKeyInfo(type=" + this.type + ", pressControl=" + this.pressControl + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$ReturnKeyType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "TYPE_SEARCH", "TYPE_DONE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReturnKeyType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ReturnKeyType[] $VALUES;
        public static final ReturnKeyType TYPE_UNSPECIFIED = new ReturnKeyType("TYPE_UNSPECIFIED", 0);
        public static final ReturnKeyType TYPE_SEARCH = new ReturnKeyType("TYPE_SEARCH", 1);
        public static final ReturnKeyType TYPE_DONE = new ReturnKeyType("TYPE_DONE", 2);

        private static final /* synthetic */ ReturnKeyType[] $values() {
            return new ReturnKeyType[]{TYPE_UNSPECIFIED, TYPE_SEARCH, TYPE_DONE};
        }

        static {
            ReturnKeyType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ReturnKeyType(String str, int i11) {
        }

        public static ReturnKeyType valueOf(String str) {
            return (ReturnKeyType) Enum.valueOf(ReturnKeyType.class, str);
        }

        public static ReturnKeyType[] values() {
            return (ReturnKeyType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "", "paddings", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchPaddings;", "<init>", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchPaddings;)V", "getPaddings", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchPaddings;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBarStyles {
        public static final int $stable = 0;
        private final SearchPaddings paddings;

        public SearchBarStyles(SearchPaddings searchPaddings) {
            this.paddings = searchPaddings;
        }

        public static /* synthetic */ SearchBarStyles copy$default(SearchBarStyles searchBarStyles, SearchPaddings searchPaddings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                searchPaddings = searchBarStyles.paddings;
            }
            return searchBarStyles.copy(searchPaddings);
        }

        /* renamed from: component1, reason: from getter */
        public final SearchPaddings getPaddings() {
            return this.paddings;
        }

        @NotNull
        public final SearchBarStyles copy(SearchPaddings paddings) {
            return new SearchBarStyles(paddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchBarStyles) && Intrinsics.d(this.paddings, ((SearchBarStyles) other).paddings);
        }

        public final SearchPaddings getPaddings() {
            return this.paddings;
        }

        public int hashCode() {
            SearchPaddings searchPaddings = this.paddings;
            if (searchPaddings == null) {
                return 0;
            }
            return searchPaddings.hashCode();
        }

        @NotNull
        public String toString() {
            return "SearchBarStyles(paddings=" + this.paddings + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchPaddings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchPaddings {
        public static final int $stable = 0;
        private final Paddings bottomPadding;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings topPadding;

        public SearchPaddings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
        }

        public static /* synthetic */ SearchPaddings copy$default(SearchPaddings searchPaddings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = searchPaddings.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = searchPaddings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = searchPaddings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = searchPaddings.rightPadding;
            }
            return searchPaddings.copy(paddings, paddings2, paddings3, paddings4);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SearchPaddings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding) {
            return new SearchPaddings(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchPaddings)) {
                return false;
            }
            SearchPaddings searchPaddings = (SearchPaddings) other;
            return this.topPadding == searchPaddings.topPadding && this.bottomPadding == searchPaddings.bottomPadding && this.leftPadding == searchPaddings.leftPadding && this.rightPadding == searchPaddings.rightPadding;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            return hashCode3 + (paddings4 != null ? paddings4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return GR.b.e(p.b("SearchPaddings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TagsList;", "", "items", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagsList {
        public static final int $stable = 8;
        private final List<TagButtonDTO> items;

        public TagsList(List<TagButtonDTO> list) {
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TagsList copy$default(TagsList tagsList, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = tagsList.items;
            }
            return tagsList.copy(list);
        }

        public final List<TagButtonDTO> component1() {
            return this.items;
        }

        @NotNull
        public final TagsList copy(List<TagButtonDTO> items) {
            return new TagsList(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TagsList) && Intrinsics.d(this.items, ((TagsList) other).items);
        }

        public final List<TagButtonDTO> getItems() {
            return this.items;
        }

        public int hashCode() {
            List<TagButtonDTO> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return c.a("TagsList(items=", ")", this.items);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "", "items", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "maxRows", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getMaxRows", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$TapTagOptions;", "equals", "", "other", "hashCode", "toString", "", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapTagOptions {
        public static final int $stable = 8;
        private final List<TagButtonDTO> items;
        private final Integer maxRows;

        public TapTagOptions(List<TagButtonDTO> list, Integer num) {
            this.items = list;
            this.maxRows = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TapTagOptions copy$default(TapTagOptions tapTagOptions, List list, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = tapTagOptions.items;
            }
            if ((i11 & 2) != 0) {
                num = tapTagOptions.maxRows;
            }
            return tapTagOptions.copy(list, num);
        }

        public final List<TagButtonDTO> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMaxRows() {
            return this.maxRows;
        }

        @NotNull
        public final TapTagOptions copy(List<TagButtonDTO> items, Integer maxRows) {
            return new TapTagOptions(items, maxRows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TapTagOptions)) {
                return false;
            }
            TapTagOptions tapTagOptions = (TapTagOptions) other;
            return Intrinsics.d(this.items, tapTagOptions.items) && Intrinsics.d(this.maxRows, tapTagOptions.maxRows);
        }

        public final List<TagButtonDTO> getItems() {
            return this.items;
        }

        public final Integer getMaxRows() {
            return this.maxRows;
        }

        public int hashCode() {
            List<TagButtonDTO> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.maxRows;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TapTagOptions(items=" + this.items + ", maxRows=" + this.maxRows + ")";
        }
    }

    public DialogSearchBarDTO(String str, String str2, @NotNull RefreshInfo widgetRefresh, RefreshInfo refreshInfo, ReturnKeyInfo returnKeyInfo, TapTagOptions tapTagOptions, TagsList tagsList, AllFiltersButton allFiltersButton, Map<String, TokenizedTrackingInfo> map, String str3, SearchBarStyles searchBarStyles, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(widgetRefresh, "widgetRefresh");
        this.inputText = str;
        this.placeholder = str2;
        this.widgetRefresh = widgetRefresh;
        this.pageRefresh = refreshInfo;
        this.returnKey = returnKeyInfo;
        this.tapTagOptions = tapTagOptions;
        this.usedTags = tagsList;
        this.allFilters = allFiltersButton;
        this.pageInteraction = map;
        this.defaultStateLink = str3;
        this.searchBarStyles = searchBarStyles;
        this.rightButton = iconButtonV3DTO;
    }

    public static /* synthetic */ DialogSearchBarDTO copy$default(DialogSearchBarDTO dialogSearchBarDTO, String str, String str2, RefreshInfo refreshInfo, RefreshInfo refreshInfo2, ReturnKeyInfo returnKeyInfo, TapTagOptions tapTagOptions, TagsList tagsList, AllFiltersButton allFiltersButton, Map map, String str3, SearchBarStyles searchBarStyles, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dialogSearchBarDTO.inputText;
        }
        if ((i11 & 2) != 0) {
            str2 = dialogSearchBarDTO.placeholder;
        }
        if ((i11 & 4) != 0) {
            refreshInfo = dialogSearchBarDTO.widgetRefresh;
        }
        if ((i11 & 8) != 0) {
            refreshInfo2 = dialogSearchBarDTO.pageRefresh;
        }
        if ((i11 & 16) != 0) {
            returnKeyInfo = dialogSearchBarDTO.returnKey;
        }
        if ((i11 & 32) != 0) {
            tapTagOptions = dialogSearchBarDTO.tapTagOptions;
        }
        if ((i11 & 64) != 0) {
            tagsList = dialogSearchBarDTO.usedTags;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            allFiltersButton = dialogSearchBarDTO.allFilters;
        }
        if ((i11 & 256) != 0) {
            map = dialogSearchBarDTO.pageInteraction;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str3 = dialogSearchBarDTO.defaultStateLink;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            searchBarStyles = dialogSearchBarDTO.searchBarStyles;
        }
        if ((i11 & 2048) != 0) {
            iconButtonV3DTO = dialogSearchBarDTO.rightButton;
        }
        SearchBarStyles searchBarStyles2 = searchBarStyles;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        Map map2 = map;
        String str4 = str3;
        TagsList tagsList2 = tagsList;
        AllFiltersButton allFiltersButton2 = allFiltersButton;
        ReturnKeyInfo returnKeyInfo2 = returnKeyInfo;
        TapTagOptions tapTagOptions2 = tapTagOptions;
        return dialogSearchBarDTO.copy(str, str2, refreshInfo, refreshInfo2, returnKeyInfo2, tapTagOptions2, tagsList2, allFiltersButton2, map2, str4, searchBarStyles2, iconButtonV3DTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDefaultStateLink() {
        return this.defaultStateLink;
    }

    /* renamed from: component11, reason: from getter */
    public final SearchBarStyles getSearchBarStyles() {
        return this.searchBarStyles;
    }

    /* renamed from: component12, reason: from getter */
    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RefreshInfo getWidgetRefresh() {
        return this.widgetRefresh;
    }

    /* renamed from: component4, reason: from getter */
    public final RefreshInfo getPageRefresh() {
        return this.pageRefresh;
    }

    /* renamed from: component5, reason: from getter */
    public final ReturnKeyInfo getReturnKey() {
        return this.returnKey;
    }

    /* renamed from: component6, reason: from getter */
    public final TapTagOptions getTapTagOptions() {
        return this.tapTagOptions;
    }

    /* renamed from: component7, reason: from getter */
    public final TagsList getUsedTags() {
        return this.usedTags;
    }

    /* renamed from: component8, reason: from getter */
    public final AllFiltersButton getAllFilters() {
        return this.allFilters;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.pageInteraction;
    }

    @NotNull
    public final DialogSearchBarDTO copy(String inputText, String placeholder, @NotNull RefreshInfo widgetRefresh, RefreshInfo pageRefresh, ReturnKeyInfo returnKey, TapTagOptions tapTagOptions, TagsList usedTags, AllFiltersButton allFilters, Map<String, TokenizedTrackingInfo> pageInteraction, String defaultStateLink, SearchBarStyles searchBarStyles, IconButtonV3DTO rightButton) {
        Intrinsics.checkNotNullParameter(widgetRefresh, "widgetRefresh");
        return new DialogSearchBarDTO(inputText, placeholder, widgetRefresh, pageRefresh, returnKey, tapTagOptions, usedTags, allFilters, pageInteraction, defaultStateLink, searchBarStyles, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogSearchBarDTO)) {
            return false;
        }
        DialogSearchBarDTO dialogSearchBarDTO = (DialogSearchBarDTO) other;
        return Intrinsics.d(this.inputText, dialogSearchBarDTO.inputText) && Intrinsics.d(this.placeholder, dialogSearchBarDTO.placeholder) && Intrinsics.d(this.widgetRefresh, dialogSearchBarDTO.widgetRefresh) && Intrinsics.d(this.pageRefresh, dialogSearchBarDTO.pageRefresh) && Intrinsics.d(this.returnKey, dialogSearchBarDTO.returnKey) && Intrinsics.d(this.tapTagOptions, dialogSearchBarDTO.tapTagOptions) && Intrinsics.d(this.usedTags, dialogSearchBarDTO.usedTags) && Intrinsics.d(this.allFilters, dialogSearchBarDTO.allFilters) && Intrinsics.d(this.pageInteraction, dialogSearchBarDTO.pageInteraction) && Intrinsics.d(this.defaultStateLink, dialogSearchBarDTO.defaultStateLink) && Intrinsics.d(this.searchBarStyles, dialogSearchBarDTO.searchBarStyles) && Intrinsics.d(this.rightButton, dialogSearchBarDTO.rightButton);
    }

    public final AllFiltersButton getAllFilters() {
        return this.allFilters;
    }

    public final String getDefaultStateLink() {
        return this.defaultStateLink;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final Map<String, TokenizedTrackingInfo> getPageInteraction() {
        return this.pageInteraction;
    }

    public final RefreshInfo getPageRefresh() {
        return this.pageRefresh;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ReturnKeyInfo getReturnKey() {
        return this.returnKey;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    public final SearchBarStyles getSearchBarStyles() {
        return this.searchBarStyles;
    }

    public final TapTagOptions getTapTagOptions() {
        return this.tapTagOptions;
    }

    public final TagsList getUsedTags() {
        return this.usedTags;
    }

    @NotNull
    public final RefreshInfo getWidgetRefresh() {
        return this.widgetRefresh;
    }

    public int hashCode() {
        String str = this.inputText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        int hashCode2 = (this.widgetRefresh.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        RefreshInfo refreshInfo = this.pageRefresh;
        int hashCode3 = (hashCode2 + (refreshInfo == null ? 0 : refreshInfo.hashCode())) * 31;
        ReturnKeyInfo returnKeyInfo = this.returnKey;
        int hashCode4 = (hashCode3 + (returnKeyInfo == null ? 0 : returnKeyInfo.hashCode())) * 31;
        TapTagOptions tapTagOptions = this.tapTagOptions;
        int hashCode5 = (hashCode4 + (tapTagOptions == null ? 0 : tapTagOptions.hashCode())) * 31;
        TagsList tagsList = this.usedTags;
        int hashCode6 = (hashCode5 + (tagsList == null ? 0 : tagsList.hashCode())) * 31;
        AllFiltersButton allFiltersButton = this.allFilters;
        int hashCode7 = (hashCode6 + (allFiltersButton == null ? 0 : allFiltersButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.pageInteraction;
        int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.defaultStateLink;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchBarStyles searchBarStyles = this.searchBarStyles;
        int hashCode10 = (hashCode9 + (searchBarStyles == null ? 0 : searchBarStyles.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        return hashCode10 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.inputText;
        String str2 = this.placeholder;
        RefreshInfo refreshInfo = this.widgetRefresh;
        RefreshInfo refreshInfo2 = this.pageRefresh;
        ReturnKeyInfo returnKeyInfo = this.returnKey;
        TapTagOptions tapTagOptions = this.tapTagOptions;
        TagsList tagsList = this.usedTags;
        AllFiltersButton allFiltersButton = this.allFilters;
        Map<String, TokenizedTrackingInfo> map = this.pageInteraction;
        String str3 = this.defaultStateLink;
        SearchBarStyles searchBarStyles = this.searchBarStyles;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        StringBuilder d11 = C3660k.d("DialogSearchBarDTO(inputText=", str, ", placeholder=", str2, ", widgetRefresh=");
        d11.append(refreshInfo);
        d11.append(", pageRefresh=");
        d11.append(refreshInfo2);
        d11.append(", returnKey=");
        d11.append(returnKeyInfo);
        d11.append(", tapTagOptions=");
        d11.append(tapTagOptions);
        d11.append(", usedTags=");
        d11.append(tagsList);
        d11.append(", allFilters=");
        d11.append(allFiltersButton);
        d11.append(", pageInteraction=");
        d11.append(map);
        d11.append(", defaultStateLink=");
        d11.append(str3);
        d11.append(", searchBarStyles=");
        d11.append(searchBarStyles);
        d11.append(", rightButton=");
        d11.append(iconButtonV3DTO);
        d11.append(")");
        return d11.toString();
    }
}
