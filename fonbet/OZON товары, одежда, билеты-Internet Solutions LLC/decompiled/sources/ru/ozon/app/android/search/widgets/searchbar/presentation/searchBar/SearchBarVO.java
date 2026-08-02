package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import Ak.C2436a;
import B3.p;
import G.g;
import Kk.C3532b;
import Pk0.h;
import WZ.t;
import Xc.a;
import Xc.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.search.widgets.searchbar.core.SearchBarDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b?\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004nopqB¥\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u000e\u0010\u0016\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u000e\u0010\u0017\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\u0010*\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b<\u00100R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b=\u00100R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b>\u00100R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b?\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\bC\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\bD\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\bE\u00100R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bF\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bH\u0010IR\u001f\u0010\u0015\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010LR\u001f\u0010\u0016\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bM\u0010LR\u001f\u0010\u0017\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bN\u0010LR\u001f\u0010\u0018\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010J\u001a\u0004\bO\u0010LR\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010Y\u001a\u0004\bZ\u0010[R\u0019\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010\\\u001a\u0004\b \u0010]R\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b\"\u0010^\u001a\u0004\b_\u0010`R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b$\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010d\u001a\u0004\be\u0010fR\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010)\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010@\u001a\u0004\b)\u0010BR\u0019\u0010*\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bj\u0010UR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010k\u001a\u0004\bl\u0010m¨\u0006r"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "deeplink", "link", "searchText", "hint", "scanItDeeplink", "", "scanItEnabled", "backgroundColor", "searchBarTintColor", "expandedBackgroundColor", "voiceSearch", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "searchButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "scanItTokenizedEvent", "voiceTokenizedEvent", "searchBarTokenizedEvent", "keyboardSearchTrackingInfo", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "returnKeyType", "", "maxSearchQueryTextLength", "searchDelay", "", "cornerRadius", "isDynamicUpdateDisabled", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;", "tooltip", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "searchByImage", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "dynamicColors", "isDynamicColorsOnScrollEnabled", "minTextLength", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButton", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;LWZ/t;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;Ljava/lang/Integer;Ljava/lang/Long;FLjava/lang/Boolean;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;ZLjava/lang/Integer;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getDeeplink", "getLink", "getSearchText", "getHint", "getScanItDeeplink", "Z", "getScanItEnabled", "()Z", "getBackgroundColor", "getSearchBarTintColor", "getExpandedBackgroundColor", "getVoiceSearch", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "getSearchButton", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "LWZ/t;", "getScanItTokenizedEvent", "()LWZ/t;", "getVoiceTokenizedEvent", "getSearchBarTokenizedEvent", "getKeyboardSearchTrackingInfo", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "getReturnKeyType", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "Ljava/lang/Integer;", "getMaxSearchQueryTextLength", "()Ljava/lang/Integer;", "Ljava/lang/Long;", "getSearchDelay", "()Ljava/lang/Long;", "F", "getCornerRadius", "()F", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;", "getTooltip", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "getSearchByImage", "()Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "getDynamicColors", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO$DynamicOnScrollColors;", "getMinTextLength", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "SearchButton", "SearchByImageVO", "TooltipVO", "ReturnKeyType", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SearchBarVO implements c {
    private final String backgroundColor;
    private final float cornerRadius;

    @NotNull
    private final String deeplink;
    private final SearchBarDTO.DynamicOnScrollColors dynamicColors;
    private final String expandedBackgroundColor;

    @NotNull
    private final String hint;
    private final long id;
    private final boolean isDynamicColorsOnScrollEnabled;
    private final Boolean isDynamicUpdateDisabled;
    private final t keyboardSearchTrackingInfo;

    @NotNull
    private final String link;
    private final Integer maxSearchQueryTextLength;
    private final Integer minTextLength;
    private final OnBoardingDTO onboarding;

    @NotNull
    private final ReturnKeyType returnKeyType;
    private final IconButtonV3DTO rightButton;

    @NotNull
    private final String scanItDeeplink;
    private final boolean scanItEnabled;
    private final t scanItTokenizedEvent;
    private final String searchBarTintColor;
    private final t searchBarTokenizedEvent;
    private final SearchButton searchButton;
    private final SearchByImageVO searchByImage;
    private final Long searchDelay;

    @NotNull
    private final String searchText;
    private final TooltipVO tooltip;

    @NotNull
    private final String voiceSearch;
    private final t voiceTokenizedEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$ReturnKeyType;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH", "DONE", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ReturnKeyType {
        private static final /* synthetic */ a $ENTRIES;
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

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchButton;", "", "Lru/ozon/uni/atoms/data/button/Icon;", "icon", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/button/Icon;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/TestInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/Icon;", "getIcon", "()Lru/ozon/uni/atoms/data/button/Icon;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class SearchButton {
        public static final int $stable = (TestInfo.$stable | AtomAction.$stable) | Icon.$stable;
        private final AtomAction action;
        private final Icon icon;
        private final TestInfo testInfo;

        public SearchButton(Icon icon, AtomAction atomAction, TestInfo testInfo) {
            this.icon = icon;
            this.action = atomAction;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchButton)) {
                return false;
            }
            SearchButton searchButton = (SearchButton) other;
            return Intrinsics.d(this.icon, searchButton.icon) && Intrinsics.d(this.action, searchButton.action) && Intrinsics.d(this.testInfo, searchButton.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Icon getIcon() {
            return this.icon;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public int hashCode() {
            Icon icon = this.icon;
            int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Icon icon = this.icon;
            AtomAction atomAction = this.action;
            TestInfo testInfo = this.testInfo;
            StringBuilder sb2 = new StringBuilder("SearchButton(icon=");
            sb2.append(icon);
            sb2.append(", action=");
            sb2.append(atomAction);
            sb2.append(", testInfo=");
            return h.c(sb2, testInfo, ")");
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018¨\u0006 "}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$SearchByImageVO;", "", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "buttonTrackingInfo", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "openOnboardingControl", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "errorNotification", "loadPhotoTrackingInfo", "<init>", "(LWZ/t;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/uni/atoms/data/notification/NotificationDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getButtonTrackingInfo", "()LWZ/t;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getOpenOnboardingControl", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getLoadPhotoTrackingInfo", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchByImageVO {
        private final t buttonTrackingInfo;
        private final NotificationDTO errorNotification;
        private final t loadPhotoTrackingInfo;
        private final CommonControlSettings openOnboardingControl;

        public SearchByImageVO(t tVar, CommonControlSettings commonControlSettings, NotificationDTO notificationDTO, t tVar2) {
            this.buttonTrackingInfo = tVar;
            this.openOnboardingControl = commonControlSettings;
            this.errorNotification = notificationDTO;
            this.loadPhotoTrackingInfo = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchByImageVO)) {
                return false;
            }
            SearchByImageVO searchByImageVO = (SearchByImageVO) other;
            return Intrinsics.d(this.buttonTrackingInfo, searchByImageVO.buttonTrackingInfo) && Intrinsics.d(this.openOnboardingControl, searchByImageVO.openOnboardingControl) && Intrinsics.d(this.errorNotification, searchByImageVO.errorNotification) && Intrinsics.d(this.loadPhotoTrackingInfo, searchByImageVO.loadPhotoTrackingInfo);
        }

        public final t getButtonTrackingInfo() {
            return this.buttonTrackingInfo;
        }

        public final NotificationDTO getErrorNotification() {
            return this.errorNotification;
        }

        public final t getLoadPhotoTrackingInfo() {
            return this.loadPhotoTrackingInfo;
        }

        public final CommonControlSettings getOpenOnboardingControl() {
            return this.openOnboardingControl;
        }

        public int hashCode() {
            t tVar = this.buttonTrackingInfo;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            CommonControlSettings commonControlSettings = this.openOnboardingControl;
            int hashCode2 = (hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31;
            NotificationDTO notificationDTO = this.errorNotification;
            int hashCode3 = (hashCode2 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
            t tVar2 = this.loadPhotoTrackingInfo;
            return hashCode3 + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SearchByImageVO(buttonTrackingInfo=" + this.buttonTrackingInfo + ", openOnboardingControl=" + this.openOnboardingControl + ", errorNotification=" + this.errorNotification + ", loadPhotoTrackingInfo=" + this.loadPhotoTrackingInfo + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO$TooltipVO;", "", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "tooltip", "", "tooltipKey", "", "tooltipDelay", "<init>", "(Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "getTooltip", "()Lru/ozon/app/android/cart/ui/tooltip/CartTooltipVO;", "Ljava/lang/String;", "getTooltipKey", "Ljava/lang/Integer;", "getTooltipDelay", "()Ljava/lang/Integer;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TooltipVO {

        @NotNull
        private final CartTooltipVO tooltip;
        private final Integer tooltipDelay;

        @NotNull
        private final String tooltipKey;

        public TooltipVO(@NotNull CartTooltipVO tooltip, @NotNull String tooltipKey, Integer num) {
            Intrinsics.checkNotNullParameter(tooltip, "tooltip");
            Intrinsics.checkNotNullParameter(tooltipKey, "tooltipKey");
            this.tooltip = tooltip;
            this.tooltipKey = tooltipKey;
            this.tooltipDelay = num;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TooltipVO)) {
                return false;
            }
            TooltipVO tooltipVO = (TooltipVO) other;
            return Intrinsics.d(this.tooltip, tooltipVO.tooltip) && Intrinsics.d(this.tooltipKey, tooltipVO.tooltipKey) && Intrinsics.d(this.tooltipDelay, tooltipVO.tooltipDelay);
        }

        @NotNull
        public final CartTooltipVO getTooltip() {
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
            CartTooltipVO cartTooltipVO = this.tooltip;
            String str = this.tooltipKey;
            Integer num = this.tooltipDelay;
            StringBuilder sb2 = new StringBuilder("TooltipVO(tooltip=");
            sb2.append(cartTooltipVO);
            sb2.append(", tooltipKey=");
            sb2.append(str);
            sb2.append(", tooltipDelay=");
            return Ep.a.c(sb2, num, ")");
        }
    }

    public SearchBarVO(long j11, @NotNull String deeplink, @NotNull String link, @NotNull String searchText, @NotNull String hint, @NotNull String scanItDeeplink, boolean z11, String str, String str2, String str3, @NotNull String voiceSearch, SearchButton searchButton, t tVar, t tVar2, t tVar3, t tVar4, @NotNull ReturnKeyType returnKeyType, Integer num, Long l11, float f7, Boolean bool, OnBoardingDTO onBoardingDTO, TooltipVO tooltipVO, SearchByImageVO searchByImageVO, SearchBarDTO.DynamicOnScrollColors dynamicOnScrollColors, boolean z12, Integer num2, IconButtonV3DTO iconButtonV3DTO) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(searchText, "searchText");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(scanItDeeplink, "scanItDeeplink");
        Intrinsics.checkNotNullParameter(voiceSearch, "voiceSearch");
        Intrinsics.checkNotNullParameter(returnKeyType, "returnKeyType");
        this.id = j11;
        this.deeplink = deeplink;
        this.link = link;
        this.searchText = searchText;
        this.hint = hint;
        this.scanItDeeplink = scanItDeeplink;
        this.scanItEnabled = z11;
        this.backgroundColor = str;
        this.searchBarTintColor = str2;
        this.expandedBackgroundColor = str3;
        this.voiceSearch = voiceSearch;
        this.searchButton = searchButton;
        this.scanItTokenizedEvent = tVar;
        this.voiceTokenizedEvent = tVar2;
        this.searchBarTokenizedEvent = tVar3;
        this.keyboardSearchTrackingInfo = tVar4;
        this.returnKeyType = returnKeyType;
        this.maxSearchQueryTextLength = num;
        this.searchDelay = l11;
        this.cornerRadius = f7;
        this.isDynamicUpdateDisabled = bool;
        this.onboarding = onBoardingDTO;
        this.tooltip = tooltipVO;
        this.searchByImage = searchByImageVO;
        this.dynamicColors = dynamicOnScrollColors;
        this.isDynamicColorsOnScrollEnabled = z12;
        this.minTextLength = num2;
        this.rightButton = iconButtonV3DTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchBarVO)) {
            return false;
        }
        SearchBarVO searchBarVO = (SearchBarVO) other;
        return this.id == searchBarVO.id && Intrinsics.d(this.deeplink, searchBarVO.deeplink) && Intrinsics.d(this.link, searchBarVO.link) && Intrinsics.d(this.searchText, searchBarVO.searchText) && Intrinsics.d(this.hint, searchBarVO.hint) && Intrinsics.d(this.scanItDeeplink, searchBarVO.scanItDeeplink) && this.scanItEnabled == searchBarVO.scanItEnabled && Intrinsics.d(this.backgroundColor, searchBarVO.backgroundColor) && Intrinsics.d(this.searchBarTintColor, searchBarVO.searchBarTintColor) && Intrinsics.d(this.expandedBackgroundColor, searchBarVO.expandedBackgroundColor) && Intrinsics.d(this.voiceSearch, searchBarVO.voiceSearch) && Intrinsics.d(this.searchButton, searchBarVO.searchButton) && Intrinsics.d(this.scanItTokenizedEvent, searchBarVO.scanItTokenizedEvent) && Intrinsics.d(this.voiceTokenizedEvent, searchBarVO.voiceTokenizedEvent) && Intrinsics.d(this.searchBarTokenizedEvent, searchBarVO.searchBarTokenizedEvent) && Intrinsics.d(this.keyboardSearchTrackingInfo, searchBarVO.keyboardSearchTrackingInfo) && this.returnKeyType == searchBarVO.returnKeyType && Intrinsics.d(this.maxSearchQueryTextLength, searchBarVO.maxSearchQueryTextLength) && Intrinsics.d(this.searchDelay, searchBarVO.searchDelay) && Float.compare(this.cornerRadius, searchBarVO.cornerRadius) == 0 && Intrinsics.d(this.isDynamicUpdateDisabled, searchBarVO.isDynamicUpdateDisabled) && Intrinsics.d(this.onboarding, searchBarVO.onboarding) && Intrinsics.d(this.tooltip, searchBarVO.tooltip) && Intrinsics.d(this.searchByImage, searchBarVO.searchByImage) && Intrinsics.d(this.dynamicColors, searchBarVO.dynamicColors) && this.isDynamicColorsOnScrollEnabled == searchBarVO.isDynamicColorsOnScrollEnabled && Intrinsics.d(this.minTextLength, searchBarVO.minTextLength) && Intrinsics.d(this.rightButton, searchBarVO.rightButton);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final SearchBarDTO.DynamicOnScrollColors getDynamicColors() {
        return this.dynamicColors;
    }

    public final String getExpandedBackgroundColor() {
        return this.expandedBackgroundColor;
    }

    @NotNull
    public final String getHint() {
        return this.hint;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    public final t getScanItTokenizedEvent() {
        return this.scanItTokenizedEvent;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final String getSearchBarTintColor() {
        return this.searchBarTintColor;
    }

    public final t getSearchBarTokenizedEvent() {
        return this.searchBarTokenizedEvent;
    }

    public final SearchButton getSearchButton() {
        return this.searchButton;
    }

    public final SearchByImageVO getSearchByImage() {
        return this.searchByImage;
    }

    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    @NotNull
    public final String getSearchText() {
        return this.searchText;
    }

    public final TooltipVO getTooltip() {
        return this.tooltip;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a(g.a(g.a(g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.deeplink), 31, this.link), 31, this.searchText), 31, this.hint), 31, this.scanItDeeplink), 31, this.scanItEnabled);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.searchBarTintColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expandedBackgroundColor;
        int a12 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.voiceSearch);
        SearchButton searchButton = this.searchButton;
        int hashCode3 = (a12 + (searchButton == null ? 0 : searchButton.hashCode())) * 31;
        t tVar = this.scanItTokenizedEvent;
        int hashCode4 = (hashCode3 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.voiceTokenizedEvent;
        int hashCode5 = (hashCode4 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.searchBarTokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        t tVar4 = this.keyboardSearchTrackingInfo;
        int hashCode7 = (this.returnKeyType.hashCode() + ((hashCode6 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31)) * 31;
        Integer num = this.maxSearchQueryTextLength;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.searchDelay;
        int a13 = Pk0.b.a(this.cornerRadius, (hashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31, 31);
        Boolean bool = this.isDynamicUpdateDisabled;
        int hashCode9 = (a13 + (bool == null ? 0 : bool.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        int hashCode10 = (hashCode9 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        TooltipVO tooltipVO = this.tooltip;
        int hashCode11 = (hashCode10 + (tooltipVO == null ? 0 : tooltipVO.hashCode())) * 31;
        SearchByImageVO searchByImageVO = this.searchByImage;
        int hashCode12 = (hashCode11 + (searchByImageVO == null ? 0 : searchByImageVO.hashCode())) * 31;
        SearchBarDTO.DynamicOnScrollColors dynamicOnScrollColors = this.dynamicColors;
        int a14 = C3532b.a((hashCode12 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode())) * 31, 31, this.isDynamicColorsOnScrollEnabled);
        Integer num2 = this.minTextLength;
        int hashCode13 = (a14 + (num2 == null ? 0 : num2.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        return hashCode13 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
    }

    /* renamed from: isDynamicColorsOnScrollEnabled, reason: from getter */
    public final boolean getIsDynamicColorsOnScrollEnabled() {
        return this.isDynamicColorsOnScrollEnabled;
    }

    /* renamed from: isDynamicUpdateDisabled, reason: from getter */
    public final Boolean getIsDynamicUpdateDisabled() {
        return this.isDynamicUpdateDisabled;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.deeplink;
        String str2 = this.link;
        String str3 = this.searchText;
        String str4 = this.hint;
        String str5 = this.scanItDeeplink;
        boolean z11 = this.scanItEnabled;
        String str6 = this.backgroundColor;
        String str7 = this.searchBarTintColor;
        String str8 = this.expandedBackgroundColor;
        String str9 = this.voiceSearch;
        SearchButton searchButton = this.searchButton;
        t tVar = this.scanItTokenizedEvent;
        t tVar2 = this.voiceTokenizedEvent;
        t tVar3 = this.searchBarTokenizedEvent;
        t tVar4 = this.keyboardSearchTrackingInfo;
        ReturnKeyType returnKeyType = this.returnKeyType;
        Integer num = this.maxSearchQueryTextLength;
        Long l11 = this.searchDelay;
        float f7 = this.cornerRadius;
        Boolean bool = this.isDynamicUpdateDisabled;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        TooltipVO tooltipVO = this.tooltip;
        SearchByImageVO searchByImageVO = this.searchByImage;
        SearchBarDTO.DynamicOnScrollColors dynamicOnScrollColors = this.dynamicColors;
        boolean z12 = this.isDynamicColorsOnScrollEnabled;
        Integer num2 = this.minTextLength;
        IconButtonV3DTO iconButtonV3DTO = this.rightButton;
        StringBuilder c11 = C2436a.c(j11, "SearchBarVO(id=", ", deeplink=", str);
        Nh.a.h(c11, ", link=", str2, ", searchText=", str3);
        Nh.a.h(c11, ", hint=", str4, ", scanItDeeplink=", str5);
        c11.append(", scanItEnabled=");
        c11.append(z11);
        c11.append(", backgroundColor=");
        c11.append(str6);
        Nh.a.h(c11, ", searchBarTintColor=", str7, ", expandedBackgroundColor=", str8);
        c11.append(", voiceSearch=");
        c11.append(str9);
        c11.append(", searchButton=");
        c11.append(searchButton);
        p.d(c11, ", scanItTokenizedEvent=", tVar, ", voiceTokenizedEvent=", tVar2);
        p.d(c11, ", searchBarTokenizedEvent=", tVar3, ", keyboardSearchTrackingInfo=", tVar4);
        c11.append(", returnKeyType=");
        c11.append(returnKeyType);
        c11.append(", maxSearchQueryTextLength=");
        c11.append(num);
        c11.append(", searchDelay=");
        c11.append(l11);
        c11.append(", cornerRadius=");
        c11.append(f7);
        c11.append(", isDynamicUpdateDisabled=");
        c11.append(bool);
        c11.append(", onboarding=");
        c11.append(onBoardingDTO);
        c11.append(", tooltip=");
        c11.append(tooltipVO);
        c11.append(", searchByImage=");
        c11.append(searchByImageVO);
        c11.append(", dynamicColors=");
        c11.append(dynamicOnScrollColors);
        c11.append(", isDynamicColorsOnScrollEnabled=");
        c11.append(z12);
        c11.append(", minTextLength=");
        c11.append(num2);
        c11.append(", rightButton=");
        c11.append(iconButtonV3DTO);
        c11.append(")");
        return c11.toString();
    }

    public /* synthetic */ SearchBarVO(long j11, String str, String str2, String str3, String str4, String str5, boolean z11, String str6, String str7, String str8, String str9, SearchButton searchButton, t tVar, t tVar2, t tVar3, t tVar4, ReturnKeyType returnKeyType, Integer num, Long l11, float f7, Boolean bool, OnBoardingDTO onBoardingDTO, TooltipVO tooltipVO, SearchByImageVO searchByImageVO, SearchBarDTO.DynamicOnScrollColors dynamicOnScrollColors, boolean z12, Integer num2, IconButtonV3DTO iconButtonV3DTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, str3, str4, str5, z11, str6, str7, str8, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? "" : str9, searchButton, tVar, tVar2, tVar3, tVar4, returnKeyType, num, l11, f7, bool, onBoardingDTO, tooltipVO, searchByImageVO, dynamicOnScrollColors, (i11 & 33554432) != 0 ? false : z12, num2, iconButtonV3DTO);
    }
}
