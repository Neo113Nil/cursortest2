package ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.searchresultsgrid;

import G.g;
import I1.w;
import Ih.a;
import Kk.C3532b;
import Sh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV2;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.AtomComponentDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.MultiButtonDTO;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.data.image.TileImageComponent;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.topRightButtons.rv.models.TopRightButtonCheckBox;
import ru.ozon.app.android.storefront.data.tiles.onboarding.OnboardingModel;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ,\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO;", "", "items", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "placeholderRow", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getPlaceholderRow", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO;", "equals", "", "other", "hashCode", "toString", "", "GridItemDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SearchResultsGridDTO {
    public static final int $stable = 8;
    private final List<GridItemDTO> items;
    private final Integer placeholderRow;

    public SearchResultsGridDTO(List<GridItemDTO> list, Integer num) {
        this.items = list;
        this.placeholderRow = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultsGridDTO copy$default(SearchResultsGridDTO searchResultsGridDTO, List list, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = searchResultsGridDTO.items;
        }
        if ((i11 & 2) != 0) {
            num = searchResultsGridDTO.placeholderRow;
        }
        return searchResultsGridDTO.copy(list, num);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    public final List<GridItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPlaceholderRow() {
        return this.placeholderRow;
    }

    @NotNull
    public final SearchResultsGridDTO copy(List<GridItemDTO> items, Integer placeholderRow) {
        return new SearchResultsGridDTO(items, placeholderRow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultsGridDTO)) {
            return false;
        }
        SearchResultsGridDTO searchResultsGridDTO = (SearchResultsGridDTO) other;
        return Intrinsics.d(this.items, searchResultsGridDTO.items) && Intrinsics.d(this.placeholderRow, searchResultsGridDTO.placeholderRow);
    }

    public final List<GridItemDTO> getItems() {
        return this.items;
    }

    public final Integer getPlaceholderRow() {
        return this.placeholderRow;
    }

    public int hashCode() {
        List<GridItemDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.placeholderRow;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SearchResultsGridDTO(items=" + this.items + ", placeholderRow=" + this.placeholderRow + ")";
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001?B\u0091\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\b\u0001\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0013\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\u0017\u00106\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010+J¤\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0012\b\u0003\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00102\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001b\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+¨\u0006@"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "", "onboarding", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;", "backgroundImage", "", "backgroundColor", "mainState", "", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/AtomComponentDTO;", "tileImage", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "multiButton", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;", "topRightButtons", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "compactFavoriteIcon", "<init>", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;Ljava/util/List;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;)V", "getOnboarding", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;", "getBackgroundImage", "()Ljava/lang/String;", "getBackgroundColor", "getMainState", "()Ljava/util/List;", "getTileImage", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;", "getMultiButton", "()Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;", "getTopRightButtons", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCompactFavoriteIcon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/image/TileImageComponent;Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/data/MultiButtonDTO;Ljava/util/List;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Ljava/lang/Boolean;)Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO;", "equals", "other", "hashCode", "", "toString", "Onboarding", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    /* loaded from: classes7.dex */
    public static final /* data */ class GridItemDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final String backgroundImage;
        private final Boolean compactFavoriteIcon;
        private final boolean isAdult;

        @NotNull
        private final List<AtomComponentDTO> mainState;
        private final MultiButtonDTO multiButton;
        private final Onboarding onboarding;

        @NotNull
        private final TileImageComponent tileImage;
        private final List<Object> topRightButtons;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/searchresultsgrid/SearchResultsGridDTO$GridItemDTO$Onboarding;", "", "badgeOnboarding", "Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "badgeOnboardingKey", "", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;Ljava/lang/String;)V", "getBadgeOnboarding", "()Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "getBadgeOnboardingKey", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Onboarding {
            public static final int $stable = 8;

            @NotNull
            private final OnboardingModel badgeOnboarding;

            @NotNull
            private final String badgeOnboardingKey;

            public Onboarding(@NotNull OnboardingModel badgeOnboarding, @NotNull String badgeOnboardingKey) {
                Intrinsics.checkNotNullParameter(badgeOnboarding, "badgeOnboarding");
                Intrinsics.checkNotNullParameter(badgeOnboardingKey, "badgeOnboardingKey");
                this.badgeOnboarding = badgeOnboarding;
                this.badgeOnboardingKey = badgeOnboardingKey;
            }

            public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, OnboardingModel onboardingModel, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    onboardingModel = onboarding.badgeOnboarding;
                }
                if ((i11 & 2) != 0) {
                    str = onboarding.badgeOnboardingKey;
                }
                return onboarding.copy(onboardingModel, str);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final OnboardingModel getBadgeOnboarding() {
                return this.badgeOnboarding;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBadgeOnboardingKey() {
                return this.badgeOnboardingKey;
            }

            @NotNull
            public final Onboarding copy(@NotNull OnboardingModel badgeOnboarding, @NotNull String badgeOnboardingKey) {
                Intrinsics.checkNotNullParameter(badgeOnboarding, "badgeOnboarding");
                Intrinsics.checkNotNullParameter(badgeOnboardingKey, "badgeOnboardingKey");
                return new Onboarding(badgeOnboarding, badgeOnboardingKey);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) other;
                return Intrinsics.d(this.badgeOnboarding, onboarding.badgeOnboarding) && Intrinsics.d(this.badgeOnboardingKey, onboarding.badgeOnboardingKey);
            }

            @NotNull
            public final OnboardingModel getBadgeOnboarding() {
                return this.badgeOnboarding;
            }

            @NotNull
            public final String getBadgeOnboardingKey() {
                return this.badgeOnboardingKey;
            }

            public int hashCode() {
                return this.badgeOnboardingKey.hashCode() + (this.badgeOnboarding.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Onboarding(badgeOnboarding=" + this.badgeOnboarding + ", badgeOnboardingKey=" + this.badgeOnboardingKey + ")";
            }
        }

        public GridItemDTO(Onboarding onboarding, String str, String str2, @NotNull List<AtomComponentDTO> mainState, @NotNull TileImageComponent tileImage, MultiButtonDTO multiButtonDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "checkbox", type = TopRightButtonCheckBox.class), @ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> list, boolean z11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, Boolean bool) {
            Intrinsics.checkNotNullParameter(mainState, "mainState");
            Intrinsics.checkNotNullParameter(tileImage, "tileImage");
            Intrinsics.checkNotNullParameter(action, "action");
            this.onboarding = onboarding;
            this.backgroundImage = str;
            this.backgroundColor = str2;
            this.mainState = mainState;
            this.tileImage = tileImage;
            this.multiButton = multiButtonDTO;
            this.topRightButtons = list;
            this.isAdult = z11;
            this.action = action;
            this.trackingInfo = map;
            this.compactFavoriteIcon = bool;
        }

        public static /* synthetic */ GridItemDTO copy$default(GridItemDTO gridItemDTO, Onboarding onboarding, String str, String str2, List list, TileImageComponent tileImageComponent, MultiButtonDTO multiButtonDTO, List list2, boolean z11, AtomActionDTO atomActionDTO, Map map, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                onboarding = gridItemDTO.onboarding;
            }
            if ((i11 & 2) != 0) {
                str = gridItemDTO.backgroundImage;
            }
            if ((i11 & 4) != 0) {
                str2 = gridItemDTO.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                list = gridItemDTO.mainState;
            }
            if ((i11 & 16) != 0) {
                tileImageComponent = gridItemDTO.tileImage;
            }
            if ((i11 & 32) != 0) {
                multiButtonDTO = gridItemDTO.multiButton;
            }
            if ((i11 & 64) != 0) {
                list2 = gridItemDTO.topRightButtons;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z11 = gridItemDTO.isAdult;
            }
            if ((i11 & 256) != 0) {
                atomActionDTO = gridItemDTO.action;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                map = gridItemDTO.trackingInfo;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                bool = gridItemDTO.compactFavoriteIcon;
            }
            Map map2 = map;
            Boolean bool2 = bool;
            boolean z12 = z11;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            MultiButtonDTO multiButtonDTO2 = multiButtonDTO;
            List list3 = list2;
            TileImageComponent tileImageComponent2 = tileImageComponent;
            String str3 = str2;
            return gridItemDTO.copy(onboarding, str, str3, list, tileImageComponent2, multiButtonDTO2, list3, z12, atomActionDTO2, map2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        public final Map<String, TokenizedTrackingInfo> component10() {
            return this.trackingInfo;
        }

        /* renamed from: component11, reason: from getter */
        public final Boolean getCompactFavoriteIcon() {
            return this.compactFavoriteIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<AtomComponentDTO> component4() {
            return this.mainState;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TileImageComponent getTileImage() {
            return this.tileImage;
        }

        /* renamed from: component6, reason: from getter */
        public final MultiButtonDTO getMultiButton() {
            return this.multiButton;
        }

        public final List<Object> component7() {
            return this.topRightButtons;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsAdult() {
            return this.isAdult;
        }

        @NotNull
        /* renamed from: component9, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final GridItemDTO copy(Onboarding onboarding, String backgroundImage, String backgroundColor, @NotNull List<AtomComponentDTO> mainState, @NotNull TileImageComponent tileImage, MultiButtonDTO multiButton, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "checkbox", type = TopRightButtonCheckBox.class), @ProtoOneOfSignature(name = "favoriteProductMolecule", type = FavoriteProductMolecule.class), @ProtoOneOfSignature(name = "favoriteProductMoleculeV2", type = FavoriteProductMoleculeV2.class), @ProtoOneOfSignature(name = "smallIconButton", type = ButtonV3Atom.SmallIconButton.class)}) @ProtoOneOf(label = "type") List<? extends Object> topRightButtons, boolean isAdult, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, Boolean compactFavoriteIcon) {
            Intrinsics.checkNotNullParameter(mainState, "mainState");
            Intrinsics.checkNotNullParameter(tileImage, "tileImage");
            Intrinsics.checkNotNullParameter(action, "action");
            return new GridItemDTO(onboarding, backgroundImage, backgroundColor, mainState, tileImage, multiButton, topRightButtons, isAdult, action, trackingInfo, compactFavoriteIcon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GridItemDTO)) {
                return false;
            }
            GridItemDTO gridItemDTO = (GridItemDTO) other;
            return Intrinsics.d(this.onboarding, gridItemDTO.onboarding) && Intrinsics.d(this.backgroundImage, gridItemDTO.backgroundImage) && Intrinsics.d(this.backgroundColor, gridItemDTO.backgroundColor) && Intrinsics.d(this.mainState, gridItemDTO.mainState) && Intrinsics.d(this.tileImage, gridItemDTO.tileImage) && Intrinsics.d(this.multiButton, gridItemDTO.multiButton) && Intrinsics.d(this.topRightButtons, gridItemDTO.topRightButtons) && this.isAdult == gridItemDTO.isAdult && Intrinsics.d(this.action, gridItemDTO.action) && Intrinsics.d(this.trackingInfo, gridItemDTO.trackingInfo) && Intrinsics.d(this.compactFavoriteIcon, gridItemDTO.compactFavoriteIcon);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBackgroundImage() {
            return this.backgroundImage;
        }

        public final Boolean getCompactFavoriteIcon() {
            return this.compactFavoriteIcon;
        }

        @NotNull
        public final List<AtomComponentDTO> getMainState() {
            return this.mainState;
        }

        public final MultiButtonDTO getMultiButton() {
            return this.multiButton;
        }

        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @NotNull
        public final TileImageComponent getTileImage() {
            return this.tileImage;
        }

        public final List<Object> getTopRightButtons() {
            return this.topRightButtons;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Onboarding onboarding = this.onboarding;
            int hashCode = (onboarding == null ? 0 : onboarding.hashCode()) * 31;
            String str = this.backgroundImage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int hashCode3 = (this.tileImage.hashCode() + g.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.mainState)) * 31;
            MultiButtonDTO multiButtonDTO = this.multiButton;
            int hashCode4 = (hashCode3 + (multiButtonDTO == null ? 0 : multiButtonDTO.hashCode())) * 31;
            List<Object> list = this.topRightButtons;
            int b11 = a.b(this.action, C3532b.a((hashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isAdult), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (b11 + (map == null ? 0 : map.hashCode())) * 31;
            Boolean bool = this.compactFavoriteIcon;
            return hashCode5 + (bool != null ? bool.hashCode() : 0);
        }

        public final boolean isAdult() {
            return this.isAdult;
        }

        @NotNull
        public String toString() {
            Onboarding onboarding = this.onboarding;
            String str = this.backgroundImage;
            String str2 = this.backgroundColor;
            List<AtomComponentDTO> list = this.mainState;
            TileImageComponent tileImageComponent = this.tileImage;
            MultiButtonDTO multiButtonDTO = this.multiButton;
            List<Object> list2 = this.topRightButtons;
            boolean z11 = this.isAdult;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Boolean bool = this.compactFavoriteIcon;
            StringBuilder sb2 = new StringBuilder("GridItemDTO(onboarding=");
            sb2.append(onboarding);
            sb2.append(", backgroundImage=");
            sb2.append(str);
            sb2.append(", backgroundColor=");
            w.d(str2, ", mainState=", ", tileImage=", sb2, list);
            sb2.append(tileImageComponent);
            sb2.append(", multiButton=");
            sb2.append(multiButtonDTO);
            sb2.append(", topRightButtons=");
            sb2.append(list2);
            sb2.append(", isAdult=");
            sb2.append(z11);
            sb2.append(", action=");
            b.f(sb2, atomActionDTO, ", trackingInfo=", map, ", compactFavoriteIcon=");
            return D3.g.d(sb2, bool, ")");
        }

        public /* synthetic */ GridItemDTO(Onboarding onboarding, String str, String str2, List list, TileImageComponent tileImageComponent, MultiButtonDTO multiButtonDTO, List list2, boolean z11, AtomActionDTO atomActionDTO, Map map, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : onboarding, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, list, tileImageComponent, multiButtonDTO, list2, z11, atomActionDTO, map, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? Boolean.FALSE : bool);
        }
    }
}
