package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi;

import D3.h;
import HY.b;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001 B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "states", "", "updateIteration", "<init>", "(JLjava/util/Map;I)V", "copy", "(JLjava/util/Map;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", "I", "getUpdateIteration", "State", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsSearchResultsV5LoadingNoUiVO implements c {
    private final long id;

    @NotNull
    private final Map<String, State> states;
    private final int updateIteration;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bR\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "", "asyncParams", "", "", "getAsyncParams", "()Ljava/util/Map;", "NoActionState", "SkeletonState", "FetchState", "RefreshState", "NewPage", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$NewPage;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$NoActionState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$RefreshState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$SkeletonState;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static Map<String, String> getAsyncParams(@NotNull State state) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "hotels", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "errorNotification", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "", "", "asyncParams", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHotels", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FetchState implements State {
            private final Map<String, String> asyncParams;
            private final NotificationAtom.NotificationWithIcon errorNotification;

            @NotNull
            private final List<HotelsSearchResultsV5CardVO> hotels;
            private final OnBoardingDTO onboarding;

            public FetchState(@NotNull List<HotelsSearchResultsV5CardVO> hotels, NotificationAtom.NotificationWithIcon notificationWithIcon, OnBoardingDTO onBoardingDTO, Map<String, String> map) {
                Intrinsics.checkNotNullParameter(hotels, "hotels");
                this.hotels = hotels;
                this.errorNotification = notificationWithIcon;
                this.onboarding = onBoardingDTO;
                this.asyncParams = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchState)) {
                    return false;
                }
                FetchState fetchState = (FetchState) other;
                return Intrinsics.d(this.hotels, fetchState.hotels) && Intrinsics.d(this.errorNotification, fetchState.errorNotification) && Intrinsics.d(this.onboarding, fetchState.onboarding) && Intrinsics.d(this.asyncParams, fetchState.asyncParams);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO.State
            public Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            public final NotificationAtom.NotificationWithIcon getErrorNotification() {
                return this.errorNotification;
            }

            @NotNull
            public final List<HotelsSearchResultsV5CardVO> getHotels() {
                return this.hotels;
            }

            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public int hashCode() {
                int hashCode = this.hotels.hashCode() * 31;
                NotificationAtom.NotificationWithIcon notificationWithIcon = this.errorNotification;
                int hashCode2 = (hashCode + (notificationWithIcon == null ? 0 : notificationWithIcon.hashCode())) * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                int hashCode3 = (hashCode2 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
                Map<String, String> map = this.asyncParams;
                return hashCode3 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "FetchState(hotels=" + this.hotels + ", errorNotification=" + this.errorNotification + ", onboarding=" + this.onboarding + ", asyncParams=" + this.asyncParams + ")";
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$NewPage;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "asyncParams", "", "", "constructor-impl", "(Ljava/util/Map;)Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "equals", "", "other", "", "equals-impl", "(Ljava/util/Map;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/Map;)I", "toString", "toString-impl", "(Ljava/util/Map;)Ljava/lang/String;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NewPage implements State {
            private final Map<String, String> asyncParams;

            private /* synthetic */ NewPage(Map map) {
                this.asyncParams = map;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ NewPage m1338boximpl(Map map) {
                return new NewPage(map);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static Map<String, ? extends String> m1339constructorimpl(Map<String, String> map) {
                return map;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1340equalsimpl(Map<String, ? extends String> map, Object obj) {
                return (obj instanceof NewPage) && Intrinsics.d(map, ((NewPage) obj).getAsyncParams());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1341hashCodeimpl(Map<String, ? extends String> map) {
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1342toStringimpl(Map<String, ? extends String> map) {
                return b.b("NewPage(asyncParams=", ")", map);
            }

            public boolean equals(Object obj) {
                return m1340equalsimpl(this.asyncParams, obj);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO.State
            public Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            public int hashCode() {
                return m1341hashCodeimpl(this.asyncParams);
            }

            public String toString() {
                return m1342toStringimpl(this.asyncParams);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ Map getAsyncParams() {
                return this.asyncParams;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$NoActionState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "hotels", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "<init>", "(Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHotels", "()Ljava/util/List;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NoActionState implements State {

            @NotNull
            private final List<HotelsSearchResultsV5CardVO> hotels;
            private final OnBoardingDTO onboarding;

            public NoActionState(@NotNull List<HotelsSearchResultsV5CardVO> hotels, OnBoardingDTO onBoardingDTO) {
                Intrinsics.checkNotNullParameter(hotels, "hotels");
                this.hotels = hotels;
                this.onboarding = onBoardingDTO;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoActionState)) {
                    return false;
                }
                NoActionState noActionState = (NoActionState) other;
                return Intrinsics.d(this.hotels, noActionState.hotels) && Intrinsics.d(this.onboarding, noActionState.onboarding);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO.State
            public Map<String, String> getAsyncParams() {
                return DefaultImpls.getAsyncParams(this);
            }

            @NotNull
            public final List<HotelsSearchResultsV5CardVO> getHotels() {
                return this.hotels;
            }

            public final OnBoardingDTO getOnboarding() {
                return this.onboarding;
            }

            public int hashCode() {
                int hashCode = this.hotels.hashCode() * 31;
                OnBoardingDTO onBoardingDTO = this.onboarding;
                return hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode());
            }

            @NotNull
            public String toString() {
                return "NoActionState(hotels=" + this.hotels + ", onboarding=" + this.onboarding + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$RefreshState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/card/HotelsSearchResultsV5CardVO;", "hotels", "Lru/ozon/uni/atoms/af/AtomAction;", "refreshAction", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getHotels", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getRefreshAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RefreshState implements State {

            @NotNull
            private final List<HotelsSearchResultsV5CardVO> hotels;
            private final AtomAction refreshAction;

            public RefreshState(@NotNull List<HotelsSearchResultsV5CardVO> hotels, AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(hotels, "hotels");
                this.hotels = hotels;
                this.refreshAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RefreshState)) {
                    return false;
                }
                RefreshState refreshState = (RefreshState) other;
                return Intrinsics.d(this.hotels, refreshState.hotels) && Intrinsics.d(this.refreshAction, refreshState.refreshAction);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO.State
            public Map<String, String> getAsyncParams() {
                return DefaultImpls.getAsyncParams(this);
            }

            public final AtomAction getRefreshAction() {
                return this.refreshAction;
            }

            public int hashCode() {
                int hashCode = this.hotels.hashCode() * 31;
                AtomAction atomAction = this.refreshAction;
                return hashCode + (atomAction == null ? 0 : atomAction.hashCode());
            }

            @NotNull
            public String toString() {
                return "RefreshState(hotels=" + this.hotels + ", refreshAction=" + this.refreshAction + ")";
            }
        }

        @InterfaceC6346b
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State$SkeletonState;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "asyncParams", "", "", "constructor-impl", "(Ljava/util/Map;)Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "equals", "", "other", "", "equals-impl", "(Ljava/util/Map;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/Map;)I", "toString", "toString-impl", "(Ljava/util/Map;)Ljava/lang/String;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SkeletonState implements State {
            private final Map<String, String> asyncParams;

            private /* synthetic */ SkeletonState(Map map) {
                this.asyncParams = map;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ SkeletonState m1344boximpl(Map map) {
                return new SkeletonState(map);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static Map<String, ? extends String> m1345constructorimpl(Map<String, String> map) {
                return map;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1346equalsimpl(Map<String, ? extends String> map, Object obj) {
                return (obj instanceof SkeletonState) && Intrinsics.d(map, ((SkeletonState) obj).getAsyncParams());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1347hashCodeimpl(Map<String, ? extends String> map) {
                if (map == null) {
                    return 0;
                }
                return map.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1348toStringimpl(Map<String, ? extends String> map) {
                return b.b("SkeletonState(asyncParams=", ")", map);
            }

            public boolean equals(Object obj) {
                return m1346equalsimpl(this.asyncParams, obj);
            }

            @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO.State
            public Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            public int hashCode() {
                return m1347hashCodeimpl(this.asyncParams);
            }

            public String toString() {
                return m1348toStringimpl(this.asyncParams);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ Map getAsyncParams() {
                return this.asyncParams;
            }
        }

        Map<String, String> getAsyncParams();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsSearchResultsV5LoadingNoUiVO(long j11, @NotNull Map<String, ? extends State> states, int i11) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.id = j11;
        this.states = states;
        this.updateIteration = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsSearchResultsV5LoadingNoUiVO copy$default(HotelsSearchResultsV5LoadingNoUiVO hotelsSearchResultsV5LoadingNoUiVO, long j11, Map map, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = hotelsSearchResultsV5LoadingNoUiVO.id;
        }
        if ((i12 & 2) != 0) {
            map = hotelsSearchResultsV5LoadingNoUiVO.states;
        }
        if ((i12 & 4) != 0) {
            i11 = hotelsSearchResultsV5LoadingNoUiVO.updateIteration;
        }
        return hotelsSearchResultsV5LoadingNoUiVO.copy(j11, map, i11);
    }

    @NotNull
    public final HotelsSearchResultsV5LoadingNoUiVO copy(long id2, @NotNull Map<String, ? extends State> states, int updateIteration) {
        Intrinsics.checkNotNullParameter(states, "states");
        return new HotelsSearchResultsV5LoadingNoUiVO(id2, states, updateIteration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsSearchResultsV5LoadingNoUiVO)) {
            return false;
        }
        HotelsSearchResultsV5LoadingNoUiVO hotelsSearchResultsV5LoadingNoUiVO = (HotelsSearchResultsV5LoadingNoUiVO) other;
        return this.id == hotelsSearchResultsV5LoadingNoUiVO.id && Intrinsics.d(this.states, hotelsSearchResultsV5LoadingNoUiVO.states) && this.updateIteration == hotelsSearchResultsV5LoadingNoUiVO.updateIteration;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Map<String, State> getStates() {
        return this.states;
    }

    public final int getUpdateIteration() {
        return this.updateIteration;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return Integer.hashCode(this.updateIteration) + D40.c.a(this.states, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Map<String, State> map = this.states;
        int i11 = this.updateIteration;
        StringBuilder sb2 = new StringBuilder("HotelsSearchResultsV5LoadingNoUiVO(id=");
        sb2.append(j11);
        sb2.append(", states=");
        sb2.append(map);
        return h.b(sb2, ", updateIteration=", i11, ")");
    }

    public /* synthetic */ HotelsSearchResultsV5LoadingNoUiVO(long j11, Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, map, (i12 & 4) != 0 ? 0 : i11);
    }
}
