package ru.ozon.app.android.search.widgets.dialogSearchBar.presentation;

import Ak.C2436a;
import G.g;
import Tl.b;
import WZ.t;
import Xc.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.app.android.search.widgets.dialogSearchBar.data.DialogSearchBarDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007IJKLMNOB\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\bA\u0010\u001fR\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\bB\u0010\u001fR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010F\u001a\u0004\bG\u0010H¨\u0006P"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "inputText", HammersV3BodyDTO.PLACEHOLDER, "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "widgetRefresh", "pageRefresh", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "returnKey", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "tapTagOptions", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "usedTags", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "allFilters", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "pageInteraction", "asyncData", "defaultStateLink", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "searchBarStyles", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;LWZ/t;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getInputText", "getPlaceholder", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "getWidgetRefresh", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "getPageRefresh", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "getReturnKey", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "getTapTagOptions", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "getUsedTags", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "getAllFilters", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "LWZ/t;", "getPageInteraction", "()LWZ/t;", "getAsyncData", "getDefaultStateLink", "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "getSearchBarStyles", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/DialogSearchBarDTO$SearchBarStyles;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "RefreshInfoVO", "ReturnKeyInfoVO", "TapTagOptionsVO", "TapTagVO", "TagsListVO", "AllFiltersButtonVO", "ReturnKeyType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DialogSearchBarVO implements c {
    private final AllFiltersButtonVO allFilters;
    private final String asyncData;

    @NotNull
    private final String defaultStateLink;
    private final long id;
    private final String inputText;
    private final t pageInteraction;
    private final RefreshInfoVO pageRefresh;
    private final String placeholder;
    private final ReturnKeyInfoVO returnKey;
    private final IconButtonV3DTO rightButton;
    private final DialogSearchBarDTO.SearchBarStyles searchBarStyles;
    private final TapTagOptionsVO tapTagOptions;
    private final TagsListVO usedTags;

    @NotNull
    private final RefreshInfoVO widgetRefresh;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$AllFiltersButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllFiltersButtonVO {
        public static final int $stable = IconButtonV3DTO.$stable;

        @NotNull
        private final IconButtonV3DTO button;
        private final IndicatorDTO indicator;

        public AllFiltersButtonVO(@NotNull IconButtonV3DTO button, IndicatorDTO indicatorDTO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.indicator = indicatorDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllFiltersButtonVO)) {
                return false;
            }
            AllFiltersButtonVO allFiltersButtonVO = (AllFiltersButtonVO) other;
            return Intrinsics.d(this.button, allFiltersButtonVO.button) && Intrinsics.d(this.indicator, allFiltersButtonVO.indicator);
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
            return "AllFiltersButtonVO(button=" + this.button + ", indicator=" + this.indicator + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$RefreshInfoVO;", "", "", ImagesContract.URL, "", "debounceMs", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tracking", "<init>", "(Ljava/lang/String;Ljava/lang/Long;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Ljava/lang/Long;", "getDebounceMs", "()Ljava/lang/Long;", "LWZ/t;", "getTracking", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshInfoVO {
        private final Long debounceMs;
        private final t tracking;

        @NotNull
        private final String url;

        public RefreshInfoVO(@NotNull String url, Long l11, t tVar) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.debounceMs = l11;
            this.tracking = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshInfoVO)) {
                return false;
            }
            RefreshInfoVO refreshInfoVO = (RefreshInfoVO) other;
            return Intrinsics.d(this.url, refreshInfoVO.url) && Intrinsics.d(this.debounceMs, refreshInfoVO.debounceMs) && Intrinsics.d(this.tracking, refreshInfoVO.tracking);
        }

        public final Long getDebounceMs() {
            return this.debounceMs;
        }

        public final t getTracking() {
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
            t tVar = this.tracking;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.url;
            Long l11 = this.debounceMs;
            t tVar = this.tracking;
            StringBuilder sb2 = new StringBuilder("RefreshInfoVO(url=");
            sb2.append(str);
            sb2.append(", debounceMs=");
            sb2.append(l11);
            sb2.append(", tracking=");
            return b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyInfoVO;", "", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "type", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "pressControl", "<init>", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "getType", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getPressControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReturnKeyInfoVO {
        private final CommonControlSettings pressControl;
        private final ReturnKeyType type;

        public ReturnKeyInfoVO(ReturnKeyType returnKeyType, CommonControlSettings commonControlSettings) {
            this.type = returnKeyType;
            this.pressControl = commonControlSettings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReturnKeyInfoVO)) {
                return false;
            }
            ReturnKeyInfoVO returnKeyInfoVO = (ReturnKeyInfoVO) other;
            return this.type == returnKeyInfoVO.type && Intrinsics.d(this.pressControl, returnKeyInfoVO.pressControl);
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
            return "ReturnKeyInfoVO(type=" + this.type + ", pressControl=" + this.pressControl + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$ReturnKeyType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "TYPE_SEARCH", "TYPE_DONE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
            $ENTRIES = Xc.b.a($values);
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

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TagsListVO;", "", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TagsListVO {
        private final List<TagButtonDTO> items;

        public TagsListVO(List<TagButtonDTO> list) {
            this.items = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TagsListVO) && Intrinsics.d(this.items, ((TagsListVO) other).items);
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
            return H3.c.a("TagsListVO(items=", ")", this.items);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagOptionsVO;", "", "", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "items", "", "maxRows", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Integer;", "getMaxRows", "()Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapTagOptionsVO {
        private final List<TapTagVO> items;
        private final Integer maxRows;

        public TapTagOptionsVO(List<TapTagVO> list, Integer num) {
            this.items = list;
            this.maxRows = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TapTagOptionsVO)) {
                return false;
            }
            TapTagOptionsVO tapTagOptionsVO = (TapTagOptionsVO) other;
            return Intrinsics.d(this.items, tapTagOptionsVO.items) && Intrinsics.d(this.maxRows, tapTagOptionsVO.maxRows);
        }

        public final List<TapTagVO> getItems() {
            return this.items;
        }

        public final Integer getMaxRows() {
            return this.maxRows;
        }

        public int hashCode() {
            List<TapTagVO> list = this.items;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Integer num = this.maxRows;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TapTagOptionsVO(items=" + this.items + ", maxRows=" + this.maxRows + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO$TapTagVO;", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "item", "", "shouldPrefetch", "<init>", "(Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getItem", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "Z", "getShouldPrefetch", "()Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TapTagVO {
        public static final int $stable = TagButtonDTO.$stable;
        private final TagButtonDTO item;
        private final boolean shouldPrefetch;

        public TapTagVO(TagButtonDTO tagButtonDTO, boolean z11) {
            this.item = tagButtonDTO;
            this.shouldPrefetch = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TapTagVO)) {
                return false;
            }
            TapTagVO tapTagVO = (TapTagVO) other;
            return Intrinsics.d(this.item, tapTagVO.item) && this.shouldPrefetch == tapTagVO.shouldPrefetch;
        }

        public final TagButtonDTO getItem() {
            return this.item;
        }

        public final boolean getShouldPrefetch() {
            return this.shouldPrefetch;
        }

        public int hashCode() {
            TagButtonDTO tagButtonDTO = this.item;
            return Boolean.hashCode(this.shouldPrefetch) + ((tagButtonDTO == null ? 0 : tagButtonDTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "TapTagVO(item=" + this.item + ", shouldPrefetch=" + this.shouldPrefetch + ")";
        }
    }

    public DialogSearchBarVO(long j11, String str, String str2, @NotNull RefreshInfoVO widgetRefresh, RefreshInfoVO refreshInfoVO, ReturnKeyInfoVO returnKeyInfoVO, TapTagOptionsVO tapTagOptionsVO, TagsListVO tagsListVO, AllFiltersButtonVO allFiltersButtonVO, t tVar, String str3, @NotNull String defaultStateLink, DialogSearchBarDTO.SearchBarStyles searchBarStyles, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(widgetRefresh, "widgetRefresh");
        Intrinsics.checkNotNullParameter(defaultStateLink, "defaultStateLink");
        this.id = j11;
        this.inputText = str;
        this.placeholder = str2;
        this.widgetRefresh = widgetRefresh;
        this.pageRefresh = refreshInfoVO;
        this.returnKey = returnKeyInfoVO;
        this.tapTagOptions = tapTagOptionsVO;
        this.usedTags = tagsListVO;
        this.allFilters = allFiltersButtonVO;
        this.pageInteraction = tVar;
        this.asyncData = str3;
        this.defaultStateLink = defaultStateLink;
        this.searchBarStyles = searchBarStyles;
        this.rightButton = iconButtonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogSearchBarVO)) {
            return false;
        }
        DialogSearchBarVO dialogSearchBarVO = (DialogSearchBarVO) other;
        return this.id == dialogSearchBarVO.id && Intrinsics.d(this.inputText, dialogSearchBarVO.inputText) && Intrinsics.d(this.placeholder, dialogSearchBarVO.placeholder) && Intrinsics.d(this.widgetRefresh, dialogSearchBarVO.widgetRefresh) && Intrinsics.d(this.pageRefresh, dialogSearchBarVO.pageRefresh) && Intrinsics.d(this.returnKey, dialogSearchBarVO.returnKey) && Intrinsics.d(this.tapTagOptions, dialogSearchBarVO.tapTagOptions) && Intrinsics.d(this.usedTags, dialogSearchBarVO.usedTags) && Intrinsics.d(this.allFilters, dialogSearchBarVO.allFilters) && Intrinsics.d(this.pageInteraction, dialogSearchBarVO.pageInteraction) && Intrinsics.d(this.asyncData, dialogSearchBarVO.asyncData) && Intrinsics.d(this.defaultStateLink, dialogSearchBarVO.defaultStateLink) && Intrinsics.d(this.searchBarStyles, dialogSearchBarVO.searchBarStyles) && Intrinsics.d(this.rightButton, dialogSearchBarVO.rightButton);
    }

    public final AllFiltersButtonVO getAllFilters() {
        return this.allFilters;
    }

    public final String getAsyncData() {
        return this.asyncData;
    }

    @NotNull
    public final String getDefaultStateLink() {
        return this.defaultStateLink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getInputText() {
        return this.inputText;
    }

    public final t getPageInteraction() {
        return this.pageInteraction;
    }

    public final RefreshInfoVO getPageRefresh() {
        return this.pageRefresh;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ReturnKeyInfoVO getReturnKey() {
        return this.returnKey;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final DialogSearchBarDTO.SearchBarStyles getSearchBarStyles() {
        return this.searchBarStyles;
    }

    public final TapTagOptionsVO getTapTagOptions() {
        return this.tapTagOptions;
    }

    public final TagsListVO getUsedTags() {
        return this.usedTags;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @NotNull
    public final RefreshInfoVO getWidgetRefresh() {
        return this.widgetRefresh;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.inputText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int hashCode3 = (this.widgetRefresh.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        RefreshInfoVO refreshInfoVO = this.pageRefresh;
        int hashCode4 = (hashCode3 + (refreshInfoVO == null ? 0 : refreshInfoVO.hashCode())) * 31;
        ReturnKeyInfoVO returnKeyInfoVO = this.returnKey;
        int hashCode5 = (hashCode4 + (returnKeyInfoVO == null ? 0 : returnKeyInfoVO.hashCode())) * 31;
        TapTagOptionsVO tapTagOptionsVO = this.tapTagOptions;
        int hashCode6 = (hashCode5 + (tapTagOptionsVO == null ? 0 : tapTagOptionsVO.hashCode())) * 31;
        TagsListVO tagsListVO = this.usedTags;
        int hashCode7 = (hashCode6 + (tagsListVO == null ? 0 : tagsListVO.hashCode())) * 31;
        AllFiltersButtonVO allFiltersButtonVO = this.allFilters;
        int hashCode8 = (hashCode7 + (allFiltersButtonVO == null ? 0 : allFiltersButtonVO.hashCode())) * 31;
        t tVar = this.pageInteraction;
        int hashCode9 = (hashCode8 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        String str3 = this.asyncData;
        int a11 = g.a((hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.defaultStateLink);
        DialogSearchBarDTO.SearchBarStyles searchBarStyles = this.searchBarStyles;
        int hashCode10 = (a11 + (searchBarStyles == null ? 0 : searchBarStyles.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        return hashCode10 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.inputText;
        String str2 = this.placeholder;
        RefreshInfoVO refreshInfoVO = this.widgetRefresh;
        RefreshInfoVO refreshInfoVO2 = this.pageRefresh;
        ReturnKeyInfoVO returnKeyInfoVO = this.returnKey;
        TapTagOptionsVO tapTagOptionsVO = this.tapTagOptions;
        TagsListVO tagsListVO = this.usedTags;
        AllFiltersButtonVO allFiltersButtonVO = this.allFilters;
        t tVar = this.pageInteraction;
        String str3 = this.asyncData;
        String str4 = this.defaultStateLink;
        DialogSearchBarDTO.SearchBarStyles searchBarStyles = this.searchBarStyles;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        StringBuilder c11 = C2436a.c(j11, "DialogSearchBarVO(id=", ", inputText=", str);
        c11.append(", placeholder=");
        c11.append(str2);
        c11.append(", widgetRefresh=");
        c11.append(refreshInfoVO);
        c11.append(", pageRefresh=");
        c11.append(refreshInfoVO2);
        c11.append(", returnKey=");
        c11.append(returnKeyInfoVO);
        c11.append(", tapTagOptions=");
        c11.append(tapTagOptionsVO);
        c11.append(", usedTags=");
        c11.append(tagsListVO);
        c11.append(", allFilters=");
        c11.append(allFiltersButtonVO);
        c11.append(", pageInteraction=");
        c11.append(tVar);
        Nh.a.h(c11, ", asyncData=", str3, ", defaultStateLink=", str4);
        c11.append(", searchBarStyles=");
        c11.append(searchBarStyles);
        c11.append(", rightButton=");
        c11.append(iconButtonV3DTO);
        c11.append(")");
        return c11.toString();
    }
}
