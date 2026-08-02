package ru.ozon.app.android.search.widgets.searchbar.core;

import De.C2860c;
import Ds.C2880a;
import G.g;
import I0.C3173b;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import V.e;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bO\b\u0087\b\u0018\u00002\u00020\u0001:\u0007opqrstuB\u009d\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'¢\u0006\u0004\b(\u0010)J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010Y\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0017\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0010\u0010^\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0002\u0010>J\u0010\u0010_\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010`\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0010\u0010a\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010AJ\u0010\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010c\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010g\u001a\u0004\u0018\u00010%HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010'HÆ\u0003JÔ\u0002\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'HÆ\u0001¢\u0006\u0002\u0010jJ\u0013\u0010k\u001a\u00020\u00032\b\u0010l\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010m\u001a\u00020\u0018HÖ\u0001J\t\u0010n\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0002\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b9\u00107R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u00107R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010B\u001a\u0004\b@\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010B\u001a\u0004\bE\u0010AR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u001c\u0010*R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0015\u0010#\u001a\u0004\u0018\u00010\u0018¢\u0006\n\n\u0002\u0010B\u001a\u0004\bL\u0010AR\u0013\u0010$\u001a\u0004\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bO\u0010P¨\u0006v"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "", "isActive", "", "deeplink", "", "link", HammersV3BodyDTO.PLACEHOLDER, "scanItDeeplink", "scanItEnabled", "text", "searchButton", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;", "scanItTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "voiceTrackingInfo", "searchBarTrackingInfo", "keyboardSearchTrackingInfo", "returnKeyType", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "searchDelay", "", "cornerRadius", "", "colors", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;", "maxSearchQueryTextLength", "isDynamicUpdateDisabled", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "searchByImage", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "dynamicOnScrollColors", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "minTextLength", "tooltip", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "rightButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;Ljava/lang/Long;Ljava/lang/Integer;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;Ljava/lang/Integer;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeeplink", "()Ljava/lang/String;", "getLink", "getPlaceholder", "getScanItDeeplink", "getScanItEnabled", "()Z", "getText", "getSearchButton", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;", "getScanItTrackingInfo", "()Ljava/util/Map;", "getVoiceTrackingInfo", "getSearchBarTrackingInfo", "getKeyboardSearchTrackingInfo", "getReturnKeyType", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "getSearchDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColors", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;", "getMaxSearchQueryTextLength", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getSearchByImage", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "getMinTextLength", "getTooltip", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;Ljava/lang/Long;Ljava/lang/Integer;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;Ljava/lang/Integer;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "equals", "other", "hashCode", "toString", "SearchButton", "SearchByImage", "SearchByImageStatus", "Colors", "DynamicOnScrollColors", "Tooltip", "ReturnKeyType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SearchBarDTO {
    public static final int $stable = 8;
    private final Colors colors;
    private final Integer cornerRadius;

    @NotNull
    private final String deeplink;
    private final DynamicOnScrollColors dynamicOnScrollColors;
    private final Boolean isActive;
    private final Boolean isDynamicUpdateDisabled;
    private final Map<String, TokenizedTrackingInfo> keyboardSearchTrackingInfo;

    @NotNull
    private final String link;
    private final Integer maxSearchQueryTextLength;
    private final Integer minTextLength;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final String placeholder;
    private final ReturnKeyType returnKeyType;
    private final IconButtonV3DTO rightButton;

    @NotNull
    private final String scanItDeeplink;
    private final boolean scanItEnabled;
    private final Map<String, TokenizedTrackingInfo> scanItTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> searchBarTrackingInfo;
    private final SearchButton searchButton;
    private final SearchByImage searchByImage;
    private final Long searchDelay;
    private final String text;
    private final Tooltip tooltip;
    private final Map<String, TokenizedTrackingInfo> voiceTrackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Colors;", "", "backgroundColor", "", "searchBarTintColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getSearchBarTintColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Colors {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final String searchBarTintColor;

        public Colors(String str, String str2) {
            this.backgroundColor = str;
            this.searchBarTintColor = str2;
        }

        public static /* synthetic */ Colors copy$default(Colors colors, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = colors.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                str2 = colors.searchBarTintColor;
            }
            return colors.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSearchBarTintColor() {
            return this.searchBarTintColor;
        }

        @NotNull
        public final Colors copy(String backgroundColor, String searchBarTintColor) {
            return new Colors(backgroundColor, searchBarTintColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return Intrinsics.d(this.backgroundColor, colors.backgroundColor) && Intrinsics.d(this.searchBarTintColor, colors.searchBarTintColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getSearchBarTintColor() {
            return this.searchBarTintColor;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.searchBarTintColor;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("Colors(backgroundColor=", this.backgroundColor, ", searchBarTintColor=", this.searchBarTintColor, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "", "backgroundColorExpanded", "", "backgroundColorCollapsed", "iconTintColorExpanded", "iconTintColorCollapsed", "placeholderTextColorExpanded", "placeholderTextColorCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColorExpanded", "()Ljava/lang/String;", "getBackgroundColorCollapsed", "getIconTintColorExpanded", "getIconTintColorCollapsed", "getPlaceholderTextColorExpanded", "getPlaceholderTextColorCollapsed", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DynamicOnScrollColors {
        public static final int $stable = 0;
        private final String backgroundColorCollapsed;
        private final String backgroundColorExpanded;
        private final String iconTintColorCollapsed;
        private final String iconTintColorExpanded;
        private final String placeholderTextColorCollapsed;
        private final String placeholderTextColorExpanded;

        public DynamicOnScrollColors(String str, String str2, String str3, String str4, String str5, String str6) {
            this.backgroundColorExpanded = str;
            this.backgroundColorCollapsed = str2;
            this.iconTintColorExpanded = str3;
            this.iconTintColorCollapsed = str4;
            this.placeholderTextColorExpanded = str5;
            this.placeholderTextColorCollapsed = str6;
        }

        public static /* synthetic */ DynamicOnScrollColors copy$default(DynamicOnScrollColors dynamicOnScrollColors, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dynamicOnScrollColors.backgroundColorExpanded;
            }
            if ((i11 & 2) != 0) {
                str2 = dynamicOnScrollColors.backgroundColorCollapsed;
            }
            if ((i11 & 4) != 0) {
                str3 = dynamicOnScrollColors.iconTintColorExpanded;
            }
            if ((i11 & 8) != 0) {
                str4 = dynamicOnScrollColors.iconTintColorCollapsed;
            }
            if ((i11 & 16) != 0) {
                str5 = dynamicOnScrollColors.placeholderTextColorExpanded;
            }
            if ((i11 & 32) != 0) {
                str6 = dynamicOnScrollColors.placeholderTextColorCollapsed;
            }
            String str7 = str5;
            String str8 = str6;
            return dynamicOnScrollColors.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColorExpanded() {
            return this.backgroundColorExpanded;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBackgroundColorCollapsed() {
            return this.backgroundColorCollapsed;
        }

        /* renamed from: component3, reason: from getter */
        public final String getIconTintColorExpanded() {
            return this.iconTintColorExpanded;
        }

        /* renamed from: component4, reason: from getter */
        public final String getIconTintColorCollapsed() {
            return this.iconTintColorCollapsed;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPlaceholderTextColorExpanded() {
            return this.placeholderTextColorExpanded;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPlaceholderTextColorCollapsed() {
            return this.placeholderTextColorCollapsed;
        }

        @NotNull
        public final DynamicOnScrollColors copy(String backgroundColorExpanded, String backgroundColorCollapsed, String iconTintColorExpanded, String iconTintColorCollapsed, String placeholderTextColorExpanded, String placeholderTextColorCollapsed) {
            return new DynamicOnScrollColors(backgroundColorExpanded, backgroundColorCollapsed, iconTintColorExpanded, iconTintColorCollapsed, placeholderTextColorExpanded, placeholderTextColorCollapsed);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DynamicOnScrollColors)) {
                return false;
            }
            DynamicOnScrollColors dynamicOnScrollColors = (DynamicOnScrollColors) other;
            return Intrinsics.d(this.backgroundColorExpanded, dynamicOnScrollColors.backgroundColorExpanded) && Intrinsics.d(this.backgroundColorCollapsed, dynamicOnScrollColors.backgroundColorCollapsed) && Intrinsics.d(this.iconTintColorExpanded, dynamicOnScrollColors.iconTintColorExpanded) && Intrinsics.d(this.iconTintColorCollapsed, dynamicOnScrollColors.iconTintColorCollapsed) && Intrinsics.d(this.placeholderTextColorExpanded, dynamicOnScrollColors.placeholderTextColorExpanded) && Intrinsics.d(this.placeholderTextColorCollapsed, dynamicOnScrollColors.placeholderTextColorCollapsed);
        }

        public final String getBackgroundColorCollapsed() {
            return this.backgroundColorCollapsed;
        }

        public final String getBackgroundColorExpanded() {
            return this.backgroundColorExpanded;
        }

        public final String getIconTintColorCollapsed() {
            return this.iconTintColorCollapsed;
        }

        public final String getIconTintColorExpanded() {
            return this.iconTintColorExpanded;
        }

        public final String getPlaceholderTextColorCollapsed() {
            return this.placeholderTextColorCollapsed;
        }

        public final String getPlaceholderTextColorExpanded() {
            return this.placeholderTextColorExpanded;
        }

        public int hashCode() {
            String str = this.backgroundColorExpanded;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundColorCollapsed;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.iconTintColorExpanded;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.iconTintColorCollapsed;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.placeholderTextColorExpanded;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.placeholderTextColorCollapsed;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.backgroundColorExpanded;
            String str2 = this.backgroundColorCollapsed;
            String str3 = this.iconTintColorExpanded;
            String str4 = this.iconTintColorCollapsed;
            String str5 = this.placeholderTextColorExpanded;
            String str6 = this.placeholderTextColorCollapsed;
            StringBuilder d11 = C3660k.d("DynamicOnScrollColors(backgroundColorExpanded=", str, ", backgroundColorCollapsed=", str2, ", iconTintColorExpanded=");
            a.h(d11, str3, ", iconTintColorCollapsed=", str4, ", placeholderTextColorExpanded=");
            return C3173b.c(d11, str5, ", placeholderTextColorCollapsed=", str6, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$ReturnKeyType;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH", "DONE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReturnKeyType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ ReturnKeyType[] $VALUES;
        public static final ReturnKeyType SEARCH = new ReturnKeyType("SEARCH", 0);
        public static final ReturnKeyType DONE = new ReturnKeyType("DONE", 1);

        private static final /* synthetic */ ReturnKeyType[] $values() {
            return new ReturnKeyType[]{SEARCH, DONE};
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
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchButton;", "", "icon", "Lru/ozon/uni/atoms/data/button/Icon;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchButton {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Icon icon;
        private final TestInfo testInfo;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public SearchButton(Icon icon, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
            this.icon = icon;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.testInfo = testInfo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchButton copy$default(SearchButton searchButton, Icon icon, AtomActionDTO atomActionDTO, Map map, TestInfo testInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                icon = searchButton.icon;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = searchButton.action;
            }
            if ((i11 & 4) != 0) {
                map = searchButton.trackingInfo;
            }
            if ((i11 & 8) != 0) {
                testInfo = searchButton.testInfo;
            }
            return searchButton.copy(icon, atomActionDTO, map, testInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final Icon getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component3() {
            return this.trackingInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final SearchButton copy(Icon icon, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
            return new SearchButton(icon, action, trackingInfo, testInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchButton)) {
                return false;
            }
            SearchButton searchButton = (SearchButton) other;
            return Intrinsics.d(this.icon, searchButton.icon) && Intrinsics.d(this.action, searchButton.action) && Intrinsics.d(this.trackingInfo, searchButton.trackingInfo) && Intrinsics.d(this.testInfo, searchButton.testInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            Icon icon = this.icon;
            int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode3 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("SearchButton(icon=");
            sb2.append(icon);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return Ns.b.b(", testInfo=", ")", sb2, map, testInfo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImage;", "", "buttonTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "openOnboardingControl", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "errorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "status", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImageStatus;", "<init>", "(Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImageStatus;)V", "getButtonTrackingInfo", "()Ljava/util/Map;", "getOpenOnboardingControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getStatus", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImageStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchByImage {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> buttonTrackingInfo;
        private final NotificationDTO errorNotification;
        private final CommonControlSettings openOnboardingControl;
        private final SearchByImageStatus status;

        public SearchByImage(Map<String, TokenizedTrackingInfo> map, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, SearchByImageStatus searchByImageStatus) {
            this.buttonTrackingInfo = map;
            this.openOnboardingControl = commonControlSettings;
            this.errorNotification = notificationDTO;
            this.status = searchByImageStatus;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchByImage copy$default(SearchByImage searchByImage, Map map, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, SearchByImageStatus searchByImageStatus, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = searchByImage.buttonTrackingInfo;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = searchByImage.openOnboardingControl;
            }
            if ((i11 & 4) != 0) {
                notificationDTO = searchByImage.errorNotification;
            }
            if ((i11 & 8) != 0) {
                searchByImageStatus = searchByImage.status;
            }
            return searchByImage.copy(map, commonControlSettings, notificationDTO, searchByImageStatus);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.buttonTrackingInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getOpenOnboardingControl() {
            return this.openOnboardingControl;
        }

        /* renamed from: component3, reason: from getter */
        public final NotificationDTO getErrorNotification() {
            return this.errorNotification;
        }

        /* renamed from: component4, reason: from getter */
        public final SearchByImageStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final SearchByImage copy(Map<String, TokenizedTrackingInfo> buttonTrackingInfo, CommonControlSettings openOnboardingControl, NotificationDTO errorNotification, SearchByImageStatus status) {
            return new SearchByImage(buttonTrackingInfo, openOnboardingControl, errorNotification, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchByImage)) {
                return false;
            }
            SearchByImage searchByImage = (SearchByImage) other;
            return Intrinsics.d(this.buttonTrackingInfo, searchByImage.buttonTrackingInfo) && Intrinsics.d(this.openOnboardingControl, searchByImage.openOnboardingControl) && Intrinsics.d(this.errorNotification, searchByImage.errorNotification) && Intrinsics.d(this.status, searchByImage.status);
        }

        public final Map<String, TokenizedTrackingInfo> getButtonTrackingInfo() {
            return this.buttonTrackingInfo;
        }

        public final NotificationDTO getErrorNotification() {
            return this.errorNotification;
        }

        public final CommonControlSettings getOpenOnboardingControl() {
            return this.openOnboardingControl;
        }

        public final SearchByImageStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.buttonTrackingInfo;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            CommonControlSettings commonControlSettings = this.openOnboardingControl;
            int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            NotificationDTO notificationDTO = this.errorNotification;
            int hashCode3 = (hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
            SearchByImageStatus searchByImageStatus = this.status;
            return hashCode3 + (searchByImageStatus != null ? searchByImageStatus.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SearchByImage(buttonTrackingInfo=" + this.buttonTrackingInfo + ", openOnboardingControl=" + this.openOnboardingControl + ", errorNotification=" + this.errorNotification + ", status=" + this.status + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$SearchByImageStatus;", "", "spinnerTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/Map;)V", "getSpinnerTrackingInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchByImageStatus {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> spinnerTrackingInfo;

        public SearchByImageStatus(Map<String, TokenizedTrackingInfo> map) {
            this.spinnerTrackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchByImageStatus copy$default(SearchByImageStatus searchByImageStatus, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = searchByImageStatus.spinnerTrackingInfo;
            }
            return searchByImageStatus.copy(map);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.spinnerTrackingInfo;
        }

        @NotNull
        public final SearchByImageStatus copy(Map<String, TokenizedTrackingInfo> spinnerTrackingInfo) {
            return new SearchByImageStatus(spinnerTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchByImageStatus) && Intrinsics.d(this.spinnerTrackingInfo, ((SearchByImageStatus) other).spinnerTrackingInfo);
        }

        public final Map<String, TokenizedTrackingInfo> getSpinnerTrackingInfo() {
            return this.spinnerTrackingInfo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.spinnerTrackingInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return HY.b.b("SearchByImageStatus(spinnerTrackingInfo=", ")", this.spinnerTrackingInfo);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "", "tooltip", "Lru/ozon/uni/atoms/data/common/TooltipDTO;", "tooltipKey", "", "tooltipDelay", "", "<init>", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;)V", "getTooltip", "()Lru/ozon/uni/atoms/data/common/TooltipDTO;", "getTooltipKey", "()Ljava/lang/String;", "getTooltipDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/common/TooltipDTO;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$Tooltip;", "equals", "", "other", "hashCode", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tooltip {
        public static final int $stable = TooltipDTO.$stable;

        @NotNull
        private final TooltipDTO tooltip;
        private final Integer tooltipDelay;

        @NotNull
        private final String tooltipKey;

        public Tooltip(@NotNull TooltipDTO tooltip, @NotNull String tooltipKey, Integer num) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(tooltipKey, "tooltipKey");
            this.tooltip = tooltip;
            this.tooltipKey = tooltipKey;
            this.tooltipDelay = num;
        }

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, TooltipDTO tooltipDTO, String str, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                tooltipDTO = tooltip.tooltip;
            }
            if ((i11 & 2) != 0) {
                str = tooltip.tooltipKey;
            }
            if ((i11 & 4) != 0) {
                num = tooltip.tooltipDelay;
            }
            return tooltip.copy(tooltipDTO, str, num);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getTooltipDelay() {
            return this.tooltipDelay;
        }

        @NotNull
        public final Tooltip copy(@NotNull TooltipDTO tooltip, @NotNull String tooltipKey, Integer tooltipDelay) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(tooltipKey, "tooltipKey");
            return new Tooltip(tooltip, tooltipKey, tooltipDelay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return Intrinsics.d(this.tooltip, tooltip.tooltip) && Intrinsics.d(this.tooltipKey, tooltip.tooltipKey) && Intrinsics.d(this.tooltipDelay, tooltip.tooltipDelay);
        }

        @NotNull
        public final TooltipDTO getTooltip() {
            return this.tooltip;
        }

        public final Integer getTooltipDelay() {
            return this.tooltipDelay;
        }

        @NotNull
        public final String getTooltipKey() {
            return this.tooltipKey;
        }

        public int hashCode() {
            int a11 = g.a(this.tooltip.hashCode() * 31, 31, this.tooltipKey);
            Integer num = this.tooltipDelay;
            return a11 + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public String toString() {
            TooltipDTO tooltipDTO = this.tooltip;
            String str = this.tooltipKey;
            Integer num = this.tooltipDelay;
            StringBuilder sb2 = new StringBuilder("Tooltip(tooltip=");
            sb2.append(tooltipDTO);
            sb2.append(", tooltipKey=");
            sb2.append(str);
            sb2.append(", tooltipDelay=");
            return Ep.a.c(sb2, num, ")");
        }
    }

    public SearchBarDTO(Boolean bool, @NotNull String deeplink, @NotNull String link, @NotNull String placeholder, @NotNull String scanItDeeplink, boolean z11, String str, SearchButton searchButton, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, ReturnKeyType returnKeyType, Long l11, Integer num, Colors colors, Integer num2, Boolean bool2, OnBoardingDTO onBoardingDTO, SearchByImage searchByImage, DynamicOnScrollColors dynamicOnScrollColors, Integer num3, Tooltip tooltip, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(scanItDeeplink, "scanItDeeplink");
        this.isActive = bool;
        this.deeplink = deeplink;
        this.link = link;
        this.placeholder = placeholder;
        this.scanItDeeplink = scanItDeeplink;
        this.scanItEnabled = z11;
        this.text = str;
        this.searchButton = searchButton;
        this.scanItTrackingInfo = map;
        this.voiceTrackingInfo = map2;
        this.searchBarTrackingInfo = map3;
        this.keyboardSearchTrackingInfo = map4;
        this.returnKeyType = returnKeyType;
        this.searchDelay = l11;
        this.cornerRadius = num;
        this.colors = colors;
        this.maxSearchQueryTextLength = num2;
        this.isDynamicUpdateDisabled = bool2;
        this.onboarding = onBoardingDTO;
        this.searchByImage = searchByImage;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
        this.minTextLength = num3;
        this.tooltip = tooltip;
        this.rightButton = iconButtonV3DTO;
    }

    public static /* synthetic */ SearchBarDTO copy$default(SearchBarDTO searchBarDTO, Boolean bool, String str, String str2, String str3, String str4, boolean z11, String str5, SearchButton searchButton, Map map, Map map2, Map map3, Map map4, ReturnKeyType returnKeyType, Long l11, Integer num, Colors colors, Integer num2, Boolean bool2, OnBoardingDTO onBoardingDTO, SearchByImage searchByImage, DynamicOnScrollColors dynamicOnScrollColors, Integer num3, Tooltip tooltip, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
        IconButtonV3DTO iconButtonV3DTO2;
        Tooltip tooltip2;
        Boolean bool3 = (i11 & 1) != 0 ? searchBarDTO.isActive : bool;
        String str6 = (i11 & 2) != 0 ? searchBarDTO.deeplink : str;
        String str7 = (i11 & 4) != 0 ? searchBarDTO.link : str2;
        String str8 = (i11 & 8) != 0 ? searchBarDTO.placeholder : str3;
        String str9 = (i11 & 16) != 0 ? searchBarDTO.scanItDeeplink : str4;
        boolean z12 = (i11 & 32) != 0 ? searchBarDTO.scanItEnabled : z11;
        String str10 = (i11 & 64) != 0 ? searchBarDTO.text : str5;
        SearchButton searchButton2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? searchBarDTO.searchButton : searchButton;
        Map map5 = (i11 & 256) != 0 ? searchBarDTO.scanItTrackingInfo : map;
        Map map6 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? searchBarDTO.voiceTrackingInfo : map2;
        Map map7 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? searchBarDTO.searchBarTrackingInfo : map3;
        Map map8 = (i11 & 2048) != 0 ? searchBarDTO.keyboardSearchTrackingInfo : map4;
        ReturnKeyType returnKeyType2 = (i11 & 4096) != 0 ? searchBarDTO.returnKeyType : returnKeyType;
        Long l12 = (i11 & 8192) != 0 ? searchBarDTO.searchDelay : l11;
        Boolean bool4 = bool3;
        Integer num4 = (i11 & 16384) != 0 ? searchBarDTO.cornerRadius : num;
        Colors colors2 = (i11 & 32768) != 0 ? searchBarDTO.colors : colors;
        Integer num5 = (i11 & 65536) != 0 ? searchBarDTO.maxSearchQueryTextLength : num2;
        Boolean bool5 = (i11 & 131072) != 0 ? searchBarDTO.isDynamicUpdateDisabled : bool2;
        OnBoardingDTO onBoardingDTO2 = (i11 & 262144) != 0 ? searchBarDTO.onboarding : onBoardingDTO;
        SearchByImage searchByImage2 = (i11 & 524288) != 0 ? searchBarDTO.searchByImage : searchByImage;
        DynamicOnScrollColors dynamicOnScrollColors2 = (i11 & 1048576) != 0 ? searchBarDTO.dynamicOnScrollColors : dynamicOnScrollColors;
        Integer num6 = (i11 & 2097152) != 0 ? searchBarDTO.minTextLength : num3;
        Tooltip tooltip3 = (i11 & 4194304) != 0 ? searchBarDTO.tooltip : tooltip;
        if ((i11 & 8388608) != 0) {
            tooltip2 = tooltip3;
            iconButtonV3DTO2 = searchBarDTO.rightButton;
        } else {
            iconButtonV3DTO2 = iconButtonV3DTO;
            tooltip2 = tooltip3;
        }
        return searchBarDTO.copy(bool4, str6, str7, str8, str9, z12, str10, searchButton2, map5, map6, map7, map8, returnKeyType2, l12, num4, colors2, num5, bool5, onBoardingDTO2, searchByImage2, dynamicOnScrollColors2, num6, tooltip2, iconButtonV3DTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.voiceTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.searchBarTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.keyboardSearchTrackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final ReturnKeyType getReturnKeyType() {
        return this.returnKeyType;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component16, reason: from getter */
    public final Colors getColors() {
        return this.colors;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getMaxSearchQueryTextLength() {
        return this.maxSearchQueryTextLength;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getIsDynamicUpdateDisabled() {
        return this.isDynamicUpdateDisabled;
    }

    /* renamed from: component19, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component20, reason: from getter */
    public final SearchByImage getSearchByImage() {
        return this.searchByImage;
    }

    /* renamed from: component21, reason: from getter */
    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getMinTextLength() {
        return this.minTextLength;
    }

    /* renamed from: component23, reason: from getter */
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component24, reason: from getter */
    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getScanItDeeplink() {
        return this.scanItDeeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getScanItEnabled() {
        return this.scanItEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component8, reason: from getter */
    public final SearchButton getSearchButton() {
        return this.searchButton;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.scanItTrackingInfo;
    }

    @NotNull
    public final SearchBarDTO copy(Boolean isActive, @NotNull String deeplink, @NotNull String link, @NotNull String placeholder, @NotNull String scanItDeeplink, boolean scanItEnabled, String text, SearchButton searchButton, Map<String, TokenizedTrackingInfo> scanItTrackingInfo, Map<String, TokenizedTrackingInfo> voiceTrackingInfo, Map<String, TokenizedTrackingInfo> searchBarTrackingInfo, Map<String, TokenizedTrackingInfo> keyboardSearchTrackingInfo, ReturnKeyType returnKeyType, Long searchDelay, Integer cornerRadius, Colors colors, Integer maxSearchQueryTextLength, Boolean isDynamicUpdateDisabled, OnBoardingDTO onboarding, SearchByImage searchByImage, DynamicOnScrollColors dynamicOnScrollColors, Integer minTextLength, Tooltip tooltip, IconButtonV3DTO rightButton) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(scanItDeeplink, "scanItDeeplink");
        return new SearchBarDTO(isActive, deeplink, link, placeholder, scanItDeeplink, scanItEnabled, text, searchButton, scanItTrackingInfo, voiceTrackingInfo, searchBarTrackingInfo, keyboardSearchTrackingInfo, returnKeyType, searchDelay, cornerRadius, colors, maxSearchQueryTextLength, isDynamicUpdateDisabled, onboarding, searchByImage, dynamicOnScrollColors, minTextLength, tooltip, rightButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBarDTO)) {
            return false;
        }
        SearchBarDTO searchBarDTO = (SearchBarDTO) other;
        return Intrinsics.d(this.isActive, searchBarDTO.isActive) && Intrinsics.d(this.deeplink, searchBarDTO.deeplink) && Intrinsics.d(this.link, searchBarDTO.link) && Intrinsics.d(this.placeholder, searchBarDTO.placeholder) && Intrinsics.d(this.scanItDeeplink, searchBarDTO.scanItDeeplink) && this.scanItEnabled == searchBarDTO.scanItEnabled && Intrinsics.d(this.text, searchBarDTO.text) && Intrinsics.d(this.searchButton, searchBarDTO.searchButton) && Intrinsics.d(this.scanItTrackingInfo, searchBarDTO.scanItTrackingInfo) && Intrinsics.d(this.voiceTrackingInfo, searchBarDTO.voiceTrackingInfo) && Intrinsics.d(this.searchBarTrackingInfo, searchBarDTO.searchBarTrackingInfo) && Intrinsics.d(this.keyboardSearchTrackingInfo, searchBarDTO.keyboardSearchTrackingInfo) && this.returnKeyType == searchBarDTO.returnKeyType && Intrinsics.d(this.searchDelay, searchBarDTO.searchDelay) && Intrinsics.d(this.cornerRadius, searchBarDTO.cornerRadius) && Intrinsics.d(this.colors, searchBarDTO.colors) && Intrinsics.d(this.maxSearchQueryTextLength, searchBarDTO.maxSearchQueryTextLength) && Intrinsics.d(this.isDynamicUpdateDisabled, searchBarDTO.isDynamicUpdateDisabled) && Intrinsics.d(this.onboarding, searchBarDTO.onboarding) && Intrinsics.d(this.searchByImage, searchBarDTO.searchByImage) && Intrinsics.d(this.dynamicOnScrollColors, searchBarDTO.dynamicOnScrollColors) && Intrinsics.d(this.minTextLength, searchBarDTO.minTextLength) && Intrinsics.d(this.tooltip, searchBarDTO.tooltip) && Intrinsics.d(this.rightButton, searchBarDTO.rightButton);
    }

    public final Colors getColors() {
        return this.colors;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final Map<String, TokenizedTrackingInfo> getKeyboardSearchTrackingInfo() {
        return this.keyboardSearchTrackingInfo;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final Integer getMaxSearchQueryTextLength() {
        return this.maxSearchQueryTextLength;
    }

    public final Integer getMinTextLength() {
        return this.minTextLength;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final ReturnKeyType getReturnKeyType() {
        return this.returnKeyType;
    }

    public final IconButtonV3DTO getRightButton() {
        return this.rightButton;
    }

    @NotNull
    public final String getScanItDeeplink() {
        return this.scanItDeeplink;
    }

    public final boolean getScanItEnabled() {
        return this.scanItEnabled;
    }

    public final Map<String, TokenizedTrackingInfo> getScanItTrackingInfo() {
        return this.scanItTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getSearchBarTrackingInfo() {
        return this.searchBarTrackingInfo;
    }

    public final SearchButton getSearchButton() {
        return this.searchButton;
    }

    public final SearchByImage getSearchByImage() {
        return this.searchByImage;
    }

    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    public final String getText() {
        return this.text;
    }

    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    public final Map<String, TokenizedTrackingInfo> getVoiceTrackingInfo() {
        return this.voiceTrackingInfo;
    }

    public int hashCode() {
        Boolean bool = this.isActive;
        int a11 = C3532b.a(g.a(g.a(g.a(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.deeplink), 31, this.link), 31, this.placeholder), 31, this.scanItDeeplink), 31, this.scanItEnabled);
        String str = this.text;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        SearchButton searchButton = this.searchButton;
        int hashCode2 = (hashCode + (searchButton == null ? 0 : searchButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.scanItTrackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.voiceTrackingInfo;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.searchBarTrackingInfo;
        int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.keyboardSearchTrackingInfo;
        int hashCode6 = (hashCode5 + (map4 == null ? 0 : map4.hashCode())) * 31;
        ReturnKeyType returnKeyType = this.returnKeyType;
        int hashCode7 = (hashCode6 + (returnKeyType == null ? 0 : returnKeyType.hashCode())) * 31;
        Long l11 = this.searchDelay;
        int hashCode8 = (hashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.cornerRadius;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Colors colors = this.colors;
        int hashCode10 = (hashCode9 + (colors == null ? 0 : colors.hashCode())) * 31;
        Integer num2 = this.maxSearchQueryTextLength;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isDynamicUpdateDisabled;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode13 = (hashCode12 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        SearchByImage searchByImage = this.searchByImage;
        int hashCode14 = (hashCode13 + (searchByImage == null ? 0 : searchByImage.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        int hashCode15 = (hashCode14 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode())) * 31;
        Integer num3 = this.minTextLength;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Tooltip tooltip = this.tooltip;
        int hashCode17 = (hashCode16 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        return hashCode17 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public final Boolean isDynamicUpdateDisabled() {
        return this.isDynamicUpdateDisabled;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isActive;
        String str = this.deeplink;
        String str2 = this.link;
        String str3 = this.placeholder;
        String str4 = this.scanItDeeplink;
        boolean z11 = this.scanItEnabled;
        String str5 = this.text;
        SearchButton searchButton = this.searchButton;
        Map<String, TokenizedTrackingInfo> map = this.scanItTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.voiceTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.searchBarTrackingInfo;
        Map<String, TokenizedTrackingInfo> map4 = this.keyboardSearchTrackingInfo;
        ReturnKeyType returnKeyType = this.returnKeyType;
        Long l11 = this.searchDelay;
        Integer num = this.cornerRadius;
        Colors colors = this.colors;
        Integer num2 = this.maxSearchQueryTextLength;
        Boolean bool2 = this.isDynamicUpdateDisabled;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        SearchByImage searchByImage = this.searchByImage;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        Integer num3 = this.minTextLength;
        Tooltip tooltip = this.tooltip;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        StringBuilder e11 = D3.g.e("SearchBarDTO(isActive=", bool, ", deeplink=", str, ", link=");
        a.h(e11, str2, ", placeholder=", str3, ", scanItDeeplink=");
        C2880a.c(str4, ", scanItEnabled=", ", text=", e11, z11);
        e11.append(str5);
        e11.append(", searchButton=");
        e11.append(searchButton);
        e11.append(", scanItTrackingInfo=");
        Tl.b.g(e11, map, ", voiceTrackingInfo=", map2, ", searchBarTrackingInfo=");
        Tl.b.g(e11, map3, ", keyboardSearchTrackingInfo=", map4, ", returnKeyType=");
        e11.append(returnKeyType);
        e11.append(", searchDelay=");
        e11.append(l11);
        e11.append(", cornerRadius=");
        e11.append(num);
        e11.append(", colors=");
        e11.append(colors);
        e11.append(", maxSearchQueryTextLength=");
        C2860c.f(bool2, num2, ", isDynamicUpdateDisabled=", ", onboarding=", e11);
        e11.append(onBoardingDTO);
        e11.append(", searchByImage=");
        e11.append(searchByImage);
        e11.append(", dynamicOnScrollColors=");
        e11.append(dynamicOnScrollColors);
        e11.append(", minTextLength=");
        e11.append(num3);
        e11.append(", tooltip=");
        e11.append(tooltip);
        e11.append(", rightButton=");
        e11.append(iconButtonV3DTO);
        e11.append(")");
        return e11.toString();
    }
}
