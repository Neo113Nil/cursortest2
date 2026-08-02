package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

import B3.p;
import B90.C2618u;
import C.o0;
import D3.g;
import D40.d;
import Fm.C3051a;
import Kk.C3532b;
import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003678B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010#Jt\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00069"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "", "asyncBehaviorType", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;", "flights", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "asyncErrorMessage", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "asyncParams", "", "", "refreshAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onboardingApp", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "directFlightsSkeleton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$DirectFlightsSkeletonDTO;", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAsyncBehaviorType", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;", "getFlights$annotations", "()V", "getFlights", "()Ljava/util/List;", "getAsyncErrorMessage", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getAsyncParams", "()Ljava/util/Map;", "getRefreshAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getOnboardingApp", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "getDirectFlightsSkeleton-rasF5MU", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-rasF5MU", "copy", "copy-pMEwtI0", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;Ljava/util/List;Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "equals", "", "other", "hashCode", "", "toString", "AsyncBehaviorType", "Flight", "DirectFlightsSkeletonDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AviaSearchResultV4DTO {
    public static final int $stable = 8;

    @NotNull
    private final AsyncBehaviorType asyncBehaviorType;
    private final EmptyStateDTO asyncErrorMessage;
    private final Map<String, String> asyncParams;
    private final TextDTO directFlightsSkeleton;
    private final List<Flight> flights;
    private final OnBoardingDTO onboardingApp;
    private final AtomActionDTO refreshAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$AsyncBehaviorType;", "", "<init>", "(Ljava/lang/String;I)V", "NO_ACTION", "FETCH_STATE", "REFRESH_STATE", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AsyncBehaviorType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AsyncBehaviorType[] $VALUES;

        @i(name = "NO_ACTION")
        public static final AsyncBehaviorType NO_ACTION = new AsyncBehaviorType("NO_ACTION", 0);

        @i(name = "FETCH_STATE")
        public static final AsyncBehaviorType FETCH_STATE = new AsyncBehaviorType("FETCH_STATE", 1);

        @i(name = "REFRESH_STATE")
        public static final AsyncBehaviorType REFRESH_STATE = new AsyncBehaviorType("REFRESH_STATE", 2);

        private static final /* synthetic */ AsyncBehaviorType[] $values() {
            return new AsyncBehaviorType[]{NO_ACTION, FETCH_STATE, REFRESH_STATE};
        }

        static {
            AsyncBehaviorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AsyncBehaviorType(String str, int i11) {
        }

        public static AsyncBehaviorType valueOf(String str) {
            return (AsyncBehaviorType) Enum.valueOf(AsyncBehaviorType.class, str);
        }

        public static AsyncBehaviorType[] values() {
            return (AsyncBehaviorType[]) $VALUES.clone();
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$DirectFlightsSkeletonDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "constructor-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "equals", "", "other", "equals-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)I", "toString", "", "toString-impl", "(Lru/ozon/uni/atoms/data/text/TextDTO;)Ljava/lang/String;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class DirectFlightsSkeletonDTO {

        @NotNull
        private final TextDTO title;

        private /* synthetic */ DirectFlightsSkeletonDTO(TextDTO textDTO) {
            this.title = textDTO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ DirectFlightsSkeletonDTO m1066boximpl(TextDTO textDTO) {
            return new DirectFlightsSkeletonDTO(textDTO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static TextDTO m1067constructorimpl(@NotNull TextDTO title) {
            Intrinsics.checkNotNullParameter(title, "title");
            return title;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1068equalsimpl(TextDTO textDTO, Object obj) {
            return (obj instanceof DirectFlightsSkeletonDTO) && Intrinsics.d(textDTO, ((DirectFlightsSkeletonDTO) obj).m1072unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1069equalsimpl0(TextDTO textDTO, TextDTO textDTO2) {
            return Intrinsics.d(textDTO, textDTO2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1070hashCodeimpl(TextDTO textDTO) {
            return textDTO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1071toStringimpl(TextDTO textDTO) {
            return "DirectFlightsSkeletonDTO(title=" + textDTO + ")";
        }

        public boolean equals(Object obj) {
            return m1068equalsimpl(this.title, obj);
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            return m1070hashCodeimpl(this.title);
        }

        public String toString() {
            return m1071toStringimpl(this.title);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ TextDTO m1072unboximpl() {
            return this.title;
        }
    }

    public /* synthetic */ AviaSearchResultV4DTO(AsyncBehaviorType asyncBehaviorType, List list, EmptyStateDTO emptyStateDTO, Map map, AtomActionDTO atomActionDTO, OnBoardingDTO onBoardingDTO, TextDTO textDTO, DefaultConstructorMarker defaultConstructorMarker) {
        this(asyncBehaviorType, list, emptyStateDTO, map, atomActionDTO, onBoardingDTO, textDTO);
    }

    /* renamed from: copy-pMEwtI0$default, reason: not valid java name */
    public static /* synthetic */ AviaSearchResultV4DTO m1062copypMEwtI0$default(AviaSearchResultV4DTO aviaSearchResultV4DTO, AsyncBehaviorType asyncBehaviorType, List list, EmptyStateDTO emptyStateDTO, Map map, AtomActionDTO atomActionDTO, OnBoardingDTO onBoardingDTO, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            asyncBehaviorType = aviaSearchResultV4DTO.asyncBehaviorType;
        }
        if ((i11 & 2) != 0) {
            list = aviaSearchResultV4DTO.flights;
        }
        if ((i11 & 4) != 0) {
            emptyStateDTO = aviaSearchResultV4DTO.asyncErrorMessage;
        }
        if ((i11 & 8) != 0) {
            map = aviaSearchResultV4DTO.asyncParams;
        }
        if ((i11 & 16) != 0) {
            atomActionDTO = aviaSearchResultV4DTO.refreshAction;
        }
        if ((i11 & 32) != 0) {
            onBoardingDTO = aviaSearchResultV4DTO.onboardingApp;
        }
        if ((i11 & 64) != 0) {
            textDTO = aviaSearchResultV4DTO.directFlightsSkeleton;
        }
        OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
        TextDTO textDTO2 = textDTO;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        EmptyStateDTO emptyStateDTO2 = emptyStateDTO;
        return aviaSearchResultV4DTO.m1064copypMEwtI0(asyncBehaviorType, list, emptyStateDTO2, map, atomActionDTO2, onBoardingDTO2, textDTO2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getFlights$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final List<Flight> component2() {
        return this.flights;
    }

    /* renamed from: component3, reason: from getter */
    public final EmptyStateDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    public final Map<String, String> component4() {
        return this.asyncParams;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    /* renamed from: component6, reason: from getter */
    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    /* renamed from: component7-rasF5MU, reason: not valid java name and from getter */
    public final TextDTO getDirectFlightsSkeleton() {
        return this.directFlightsSkeleton;
    }

    @NotNull
    /* renamed from: copy-pMEwtI0, reason: not valid java name */
    public final AviaSearchResultV4DTO m1064copypMEwtI0(@NotNull AsyncBehaviorType asyncBehaviorType, List<Flight> flights, EmptyStateDTO asyncErrorMessage, Map<String, String> asyncParams, AtomActionDTO refreshAction, OnBoardingDTO onboardingApp, TextDTO directFlightsSkeleton) {
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        return new AviaSearchResultV4DTO(asyncBehaviorType, flights, asyncErrorMessage, asyncParams, refreshAction, onboardingApp, directFlightsSkeleton, null);
    }

    public boolean equals(Object other) {
        boolean m1069equalsimpl0;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AviaSearchResultV4DTO)) {
            return false;
        }
        AviaSearchResultV4DTO aviaSearchResultV4DTO = (AviaSearchResultV4DTO) other;
        if (this.asyncBehaviorType != aviaSearchResultV4DTO.asyncBehaviorType || !Intrinsics.d(this.flights, aviaSearchResultV4DTO.flights) || !Intrinsics.d(this.asyncErrorMessage, aviaSearchResultV4DTO.asyncErrorMessage) || !Intrinsics.d(this.asyncParams, aviaSearchResultV4DTO.asyncParams) || !Intrinsics.d(this.refreshAction, aviaSearchResultV4DTO.refreshAction) || !Intrinsics.d(this.onboardingApp, aviaSearchResultV4DTO.onboardingApp)) {
            return false;
        }
        TextDTO textDTO = this.directFlightsSkeleton;
        TextDTO textDTO2 = aviaSearchResultV4DTO.directFlightsSkeleton;
        if (textDTO == null) {
            if (textDTO2 == null) {
                m1069equalsimpl0 = true;
            }
            m1069equalsimpl0 = false;
        } else {
            if (textDTO2 != null) {
                m1069equalsimpl0 = DirectFlightsSkeletonDTO.m1069equalsimpl0(textDTO, textDTO2);
            }
            m1069equalsimpl0 = false;
        }
        return m1069equalsimpl0;
    }

    @NotNull
    public final AsyncBehaviorType getAsyncBehaviorType() {
        return this.asyncBehaviorType;
    }

    public final EmptyStateDTO getAsyncErrorMessage() {
        return this.asyncErrorMessage;
    }

    public final Map<String, String> getAsyncParams() {
        return this.asyncParams;
    }

    /* renamed from: getDirectFlightsSkeleton-rasF5MU, reason: not valid java name */
    public final TextDTO m1065getDirectFlightsSkeletonrasF5MU() {
        return this.directFlightsSkeleton;
    }

    public final List<Flight> getFlights() {
        return this.flights;
    }

    public final OnBoardingDTO getOnboardingApp() {
        return this.onboardingApp;
    }

    public final AtomActionDTO getRefreshAction() {
        return this.refreshAction;
    }

    public int hashCode() {
        int hashCode = this.asyncBehaviorType.hashCode() * 31;
        List<Flight> list = this.flights;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        EmptyStateDTO emptyStateDTO = this.asyncErrorMessage;
        int hashCode3 = (hashCode2 + (emptyStateDTO == null ? 0 : emptyStateDTO.hashCode())) * 31;
        Map<String, String> map = this.asyncParams;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.refreshAction;
        int hashCode5 = (hashCode4 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        int hashCode6 = (hashCode5 + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode())) * 31;
        TextDTO textDTO = this.directFlightsSkeleton;
        return hashCode6 + (textDTO != null ? DirectFlightsSkeletonDTO.m1070hashCodeimpl(textDTO) : 0);
    }

    @NotNull
    public String toString() {
        AsyncBehaviorType asyncBehaviorType = this.asyncBehaviorType;
        List<Flight> list = this.flights;
        EmptyStateDTO emptyStateDTO = this.asyncErrorMessage;
        Map<String, String> map = this.asyncParams;
        AtomActionDTO atomActionDTO = this.refreshAction;
        OnBoardingDTO onBoardingDTO = this.onboardingApp;
        TextDTO textDTO = this.directFlightsSkeleton;
        String m1071toStringimpl = textDTO == null ? "null" : DirectFlightsSkeletonDTO.m1071toStringimpl(textDTO);
        StringBuilder sb2 = new StringBuilder("AviaSearchResultV4DTO(asyncBehaviorType=");
        sb2.append(asyncBehaviorType);
        sb2.append(", flights=");
        sb2.append(list);
        sb2.append(", asyncErrorMessage=");
        sb2.append(emptyStateDTO);
        sb2.append(", asyncParams=");
        sb2.append(map);
        sb2.append(", refreshAction=");
        sb2.append(atomActionDTO);
        sb2.append(", onboardingApp=");
        sb2.append(onBoardingDTO);
        sb2.append(", directFlightsSkeleton=");
        return o0.c(sb2, m1071toStringimpl, ")");
    }

    private AviaSearchResultV4DTO(AsyncBehaviorType asyncBehaviorType, List<Flight> list, EmptyStateDTO emptyStateDTO, Map<String, String> map, AtomActionDTO atomActionDTO, OnBoardingDTO onBoardingDTO, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(asyncBehaviorType, "asyncBehaviorType");
        this.asyncBehaviorType = asyncBehaviorType;
        this.flights = list;
        this.asyncErrorMessage = emptyStateDTO;
        this.asyncParams = map;
        this.refreshAction = atomActionDTO;
        this.onboardingApp = onBoardingDTO;
        this.directFlightsSkeleton = textDTO;
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u0001:\u0002PQB©\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u0010HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010F\u001a\u00020\u0016HÆ\u0003J\t\u0010G\u001a\u00020\u0018HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003JÌ\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00182\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\t\u0010O\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "", "flightId", "", "badges", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "premiumBadge", "luggageText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "airlineIcons", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "airlinesText", "wayThereDetails", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;", "wayBackDetails", "borderColor", "", "backgroundColor", "cardClickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "canShowOnboarding", "", "additionalInfo", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;Ljava/util/Map;)V", "getFlightId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBadges", "()Ljava/util/List;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPremiumBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getLuggageText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getAirlineIcons", "getAirlinesText", "getWayThereDetails", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;", "getWayBackDetails", "getBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getCardClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getCanShowOnboarding", "()Z", "getAdditionalInfo", "()Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Integer;Ljava/util/List;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "equals", "other", "hashCode", "toString", "TripRoute", "AdditionalInfoDTO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Flight {
        public static final int $stable = 8;
        private final AdditionalInfoDTO additionalInfo;

        @NotNull
        private final List<IconDTO> airlineIcons;

        @NotNull
        private final TextDTO airlinesText;
        private final String backgroundColor;
        private final List<BadgeDTO> badges;
        private final String borderColor;
        private final boolean canShowOnboarding;

        @NotNull
        private final AtomActionDTO cardClickAction;
        private final Integer flightId;

        @NotNull
        private final TextDTO luggageText;
        private final BadgeDTO premiumBadge;

        @NotNull
        private final PriceDTO price;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final TripRoute wayBackDetails;

        @NotNull
        private final TripRoute wayThereDetails;

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute;", "", "tripTime", "Lru/ozon/uni/atoms/data/text/TextDTO;", "tripDuration", "routeInfo", "timeDifference", "transfers", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute$Transfer;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getTripTime", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTripDuration", "getRouteInfo", "getTimeDifference", "getTransfers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Transfer", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class TripRoute {
            public static final int $stable = 8;

            @NotNull
            private final TextDTO routeInfo;
            private final TextDTO timeDifference;

            @NotNull
            private final List<Transfer> transfers;

            @NotNull
            private final TextDTO tripDuration;

            @NotNull
            private final TextDTO tripTime;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$TripRoute$Transfer;", "", "city", "Lru/ozon/uni/atoms/data/text/TextDTO;", "icons", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "getCity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcons", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Transfer {
                public static final int $stable = 8;

                @NotNull
                private final TextDTO city;
                private final List<IconDTO> icons;

                public Transfer(@NotNull TextDTO city, List<IconDTO> list) {
                    Intrinsics.checkNotNullParameter(city, "city");
                    this.city = city;
                    this.icons = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Transfer copy$default(Transfer transfer, TextDTO textDTO, List list, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        textDTO = transfer.city;
                    }
                    if ((i11 & 2) != 0) {
                        list = transfer.icons;
                    }
                    return transfer.copy(textDTO, list);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final TextDTO getCity() {
                    return this.city;
                }

                public final List<IconDTO> component2() {
                    return this.icons;
                }

                @NotNull
                public final Transfer copy(@NotNull TextDTO city, List<IconDTO> icons) {
                    Intrinsics.checkNotNullParameter(city, "city");
                    return new Transfer(city, icons);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Transfer)) {
                        return false;
                    }
                    Transfer transfer = (Transfer) other;
                    return Intrinsics.d(this.city, transfer.city) && Intrinsics.d(this.icons, transfer.icons);
                }

                @NotNull
                public final TextDTO getCity() {
                    return this.city;
                }

                public final List<IconDTO> getIcons() {
                    return this.icons;
                }

                public int hashCode() {
                    int hashCode = this.city.hashCode() * 31;
                    List<IconDTO> list = this.icons;
                    return hashCode + (list == null ? 0 : list.hashCode());
                }

                @NotNull
                public String toString() {
                    return "Transfer(city=" + this.city + ", icons=" + this.icons + ")";
                }
            }

            public TripRoute(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, TextDTO textDTO, @NotNull List<Transfer> transfers) {
                Intrinsics.checkNotNullParameter(tripTime, "tripTime");
                Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
                Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                this.tripTime = tripTime;
                this.tripDuration = tripDuration;
                this.routeInfo = routeInfo;
                this.timeDifference = textDTO;
                this.transfers = transfers;
            }

            public static /* synthetic */ TripRoute copy$default(TripRoute tripRoute, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, TextDTO textDTO4, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    textDTO = tripRoute.tripTime;
                }
                if ((i11 & 2) != 0) {
                    textDTO2 = tripRoute.tripDuration;
                }
                if ((i11 & 4) != 0) {
                    textDTO3 = tripRoute.routeInfo;
                }
                if ((i11 & 8) != 0) {
                    textDTO4 = tripRoute.timeDifference;
                }
                if ((i11 & 16) != 0) {
                    list = tripRoute.transfers;
                }
                List list2 = list;
                TextDTO textDTO5 = textDTO3;
                return tripRoute.copy(textDTO, textDTO2, textDTO5, textDTO4, list2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final TextDTO getTripTime() {
                return this.tripTime;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getTripDuration() {
                return this.tripDuration;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final TextDTO getRouteInfo() {
                return this.routeInfo;
            }

            /* renamed from: component4, reason: from getter */
            public final TextDTO getTimeDifference() {
                return this.timeDifference;
            }

            @NotNull
            public final List<Transfer> component5() {
                return this.transfers;
            }

            @NotNull
            public final TripRoute copy(@NotNull TextDTO tripTime, @NotNull TextDTO tripDuration, @NotNull TextDTO routeInfo, TextDTO timeDifference, @NotNull List<Transfer> transfers) {
                Intrinsics.checkNotNullParameter(tripTime, "tripTime");
                Intrinsics.checkNotNullParameter(tripDuration, "tripDuration");
                Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
                Intrinsics.checkNotNullParameter(transfers, "transfers");
                return new TripRoute(tripTime, tripDuration, routeInfo, timeDifference, transfers);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TripRoute)) {
                    return false;
                }
                TripRoute tripRoute = (TripRoute) other;
                return Intrinsics.d(this.tripTime, tripRoute.tripTime) && Intrinsics.d(this.tripDuration, tripRoute.tripDuration) && Intrinsics.d(this.routeInfo, tripRoute.routeInfo) && Intrinsics.d(this.timeDifference, tripRoute.timeDifference) && Intrinsics.d(this.transfers, tripRoute.transfers);
            }

            @NotNull
            public final TextDTO getRouteInfo() {
                return this.routeInfo;
            }

            public final TextDTO getTimeDifference() {
                return this.timeDifference;
            }

            @NotNull
            public final List<Transfer> getTransfers() {
                return this.transfers;
            }

            @NotNull
            public final TextDTO getTripDuration() {
                return this.tripDuration;
            }

            @NotNull
            public final TextDTO getTripTime() {
                return this.tripTime;
            }

            public int hashCode() {
                int a11 = Ns.b.a(this.routeInfo, Ns.b.a(this.tripDuration, this.tripTime.hashCode() * 31, 31), 31);
                TextDTO textDTO = this.timeDifference;
                return this.transfers.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.tripTime;
                TextDTO textDTO2 = this.tripDuration;
                TextDTO textDTO3 = this.routeInfo;
                TextDTO textDTO4 = this.timeDifference;
                List<Transfer> list = this.transfers;
                StringBuilder g10 = g.g("TripRoute(tripTime=", textDTO, ", tripDuration=", textDTO2, ", routeInfo=");
                d.e(", timeDifference=", ", transfers=", g10, textDTO3, textDTO4);
                return C2618u.h(g10, list, ")");
            }
        }

        public Flight(Integer num, List<BadgeDTO> list, @NotNull PriceDTO price, BadgeDTO badgeDTO, @NotNull TextDTO luggageText, @NotNull List<IconDTO> airlineIcons, @NotNull TextDTO airlinesText, @NotNull TripRoute wayThereDetails, TripRoute tripRoute, String str, String str2, @NotNull AtomActionDTO cardClickAction, boolean z11, AdditionalInfoDTO additionalInfoDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(luggageText, "luggageText");
            Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
            Intrinsics.checkNotNullParameter(airlinesText, "airlinesText");
            Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
            Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
            this.flightId = num;
            this.badges = list;
            this.price = price;
            this.premiumBadge = badgeDTO;
            this.luggageText = luggageText;
            this.airlineIcons = airlineIcons;
            this.airlinesText = airlinesText;
            this.wayThereDetails = wayThereDetails;
            this.wayBackDetails = tripRoute;
            this.borderColor = str;
            this.backgroundColor = str2;
            this.cardClickAction = cardClickAction;
            this.canShowOnboarding = z11;
            this.additionalInfo = additionalInfoDTO;
            this.trackingInfo = map;
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getFlightId() {
            return this.flightId;
        }

        /* renamed from: component10, reason: from getter */
        public final String getBorderColor() {
            return this.borderColor;
        }

        /* renamed from: component11, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component12, reason: from getter */
        public final AtomActionDTO getCardClickAction() {
            return this.cardClickAction;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getCanShowOnboarding() {
            return this.canShowOnboarding;
        }

        /* renamed from: component14, reason: from getter */
        public final AdditionalInfoDTO getAdditionalInfo() {
            return this.additionalInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component15() {
            return this.trackingInfo;
        }

        public final List<BadgeDTO> component2() {
            return this.badges;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component4, reason: from getter */
        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final TextDTO getLuggageText() {
            return this.luggageText;
        }

        @NotNull
        public final List<IconDTO> component6() {
            return this.airlineIcons;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final TextDTO getAirlinesText() {
            return this.airlinesText;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final TripRoute getWayThereDetails() {
            return this.wayThereDetails;
        }

        /* renamed from: component9, reason: from getter */
        public final TripRoute getWayBackDetails() {
            return this.wayBackDetails;
        }

        @NotNull
        public final Flight copy(Integer flightId, List<BadgeDTO> badges, @NotNull PriceDTO price, BadgeDTO premiumBadge, @NotNull TextDTO luggageText, @NotNull List<IconDTO> airlineIcons, @NotNull TextDTO airlinesText, @NotNull TripRoute wayThereDetails, TripRoute wayBackDetails, String borderColor, String backgroundColor, @NotNull AtomActionDTO cardClickAction, boolean canShowOnboarding, AdditionalInfoDTO additionalInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(luggageText, "luggageText");
            Intrinsics.checkNotNullParameter(airlineIcons, "airlineIcons");
            Intrinsics.checkNotNullParameter(airlinesText, "airlinesText");
            Intrinsics.checkNotNullParameter(wayThereDetails, "wayThereDetails");
            Intrinsics.checkNotNullParameter(cardClickAction, "cardClickAction");
            return new Flight(flightId, badges, price, premiumBadge, luggageText, airlineIcons, airlinesText, wayThereDetails, wayBackDetails, borderColor, backgroundColor, cardClickAction, canShowOnboarding, additionalInfo, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flight)) {
                return false;
            }
            Flight flight = (Flight) other;
            return Intrinsics.d(this.flightId, flight.flightId) && Intrinsics.d(this.badges, flight.badges) && Intrinsics.d(this.price, flight.price) && Intrinsics.d(this.premiumBadge, flight.premiumBadge) && Intrinsics.d(this.luggageText, flight.luggageText) && Intrinsics.d(this.airlineIcons, flight.airlineIcons) && Intrinsics.d(this.airlinesText, flight.airlinesText) && Intrinsics.d(this.wayThereDetails, flight.wayThereDetails) && Intrinsics.d(this.wayBackDetails, flight.wayBackDetails) && Intrinsics.d(this.borderColor, flight.borderColor) && Intrinsics.d(this.backgroundColor, flight.backgroundColor) && Intrinsics.d(this.cardClickAction, flight.cardClickAction) && this.canShowOnboarding == flight.canShowOnboarding && Intrinsics.d(this.additionalInfo, flight.additionalInfo) && Intrinsics.d(this.trackingInfo, flight.trackingInfo);
        }

        public final AdditionalInfoDTO getAdditionalInfo() {
            return this.additionalInfo;
        }

        @NotNull
        public final List<IconDTO> getAirlineIcons() {
            return this.airlineIcons;
        }

        @NotNull
        public final TextDTO getAirlinesText() {
            return this.airlinesText;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final List<BadgeDTO> getBadges() {
            return this.badges;
        }

        public final String getBorderColor() {
            return this.borderColor;
        }

        public final boolean getCanShowOnboarding() {
            return this.canShowOnboarding;
        }

        @NotNull
        public final AtomActionDTO getCardClickAction() {
            return this.cardClickAction;
        }

        public final Integer getFlightId() {
            return this.flightId;
        }

        @NotNull
        public final TextDTO getLuggageText() {
            return this.luggageText;
        }

        public final BadgeDTO getPremiumBadge() {
            return this.premiumBadge;
        }

        @NotNull
        public final PriceDTO getPrice() {
            return this.price;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final TripRoute getWayBackDetails() {
            return this.wayBackDetails;
        }

        @NotNull
        public final TripRoute getWayThereDetails() {
            return this.wayThereDetails;
        }

        public int hashCode() {
            Integer num = this.flightId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            List<BadgeDTO> list = this.badges;
            int b11 = C3051a.b(this.price, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
            BadgeDTO badgeDTO = this.premiumBadge;
            int hashCode2 = (this.wayThereDetails.hashCode() + Ns.b.a(this.airlinesText, G.g.b(Ns.b.a(this.luggageText, (b11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31, 31), 31, this.airlineIcons), 31)) * 31;
            TripRoute tripRoute = this.wayBackDetails;
            int hashCode3 = (hashCode2 + (tripRoute == null ? 0 : tripRoute.hashCode())) * 31;
            String str = this.borderColor;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.backgroundColor;
            int a11 = C3532b.a(Ih.a.b(this.cardClickAction, (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.canShowOnboarding);
            AdditionalInfoDTO additionalInfoDTO = this.additionalInfo;
            int hashCode5 = (a11 + (additionalInfoDTO == null ? 0 : additionalInfoDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Integer num = this.flightId;
            List<BadgeDTO> list = this.badges;
            PriceDTO priceDTO = this.price;
            BadgeDTO badgeDTO = this.premiumBadge;
            TextDTO textDTO = this.luggageText;
            List<IconDTO> list2 = this.airlineIcons;
            TextDTO textDTO2 = this.airlinesText;
            TripRoute tripRoute = this.wayThereDetails;
            TripRoute tripRoute2 = this.wayBackDetails;
            String str = this.borderColor;
            String str2 = this.backgroundColor;
            AtomActionDTO atomActionDTO = this.cardClickAction;
            boolean z11 = this.canShowOnboarding;
            AdditionalInfoDTO additionalInfoDTO = this.additionalInfo;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("Flight(flightId=");
            sb2.append(num);
            sb2.append(", badges=");
            sb2.append(list);
            sb2.append(", price=");
            sb2.append(priceDTO);
            sb2.append(", premiumBadge=");
            sb2.append(badgeDTO);
            sb2.append(", luggageText=");
            Tl.a.e(sb2, textDTO, ", airlineIcons=", list2, ", airlinesText=");
            sb2.append(textDTO2);
            sb2.append(", wayThereDetails=");
            sb2.append(tripRoute);
            sb2.append(", wayBackDetails=");
            sb2.append(tripRoute2);
            sb2.append(", borderColor=");
            sb2.append(str);
            sb2.append(", backgroundColor=");
            p.c(str2, ", cardClickAction=", ", canShowOnboarding=", sb2, atomActionDTO);
            sb2.append(z11);
            sb2.append(", additionalInfo=");
            sb2.append(additionalInfoDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight$AdditionalInfoDTO;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "offsetX", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getOffsetX", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AdditionalInfoDTO {
            public static final int $stable = 0;
            private final BadgeDTO badge;
            private final int offsetX;
            private final TextDTO text;

            public AdditionalInfoDTO(TextDTO textDTO, BadgeDTO badgeDTO, int i11) {
                this.text = textDTO;
                this.badge = badgeDTO;
                this.offsetX = i11;
            }

            public static /* synthetic */ AdditionalInfoDTO copy$default(AdditionalInfoDTO additionalInfoDTO, TextDTO textDTO, BadgeDTO badgeDTO, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    textDTO = additionalInfoDTO.text;
                }
                if ((i12 & 2) != 0) {
                    badgeDTO = additionalInfoDTO.badge;
                }
                if ((i12 & 4) != 0) {
                    i11 = additionalInfoDTO.offsetX;
                }
                return additionalInfoDTO.copy(textDTO, badgeDTO, i11);
            }

            /* renamed from: component1, reason: from getter */
            public final TextDTO getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final BadgeDTO getBadge() {
                return this.badge;
            }

            /* renamed from: component3, reason: from getter */
            public final int getOffsetX() {
                return this.offsetX;
            }

            @NotNull
            public final AdditionalInfoDTO copy(TextDTO text, BadgeDTO badge, int offsetX) {
                return new AdditionalInfoDTO(text, badge, offsetX);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdditionalInfoDTO)) {
                    return false;
                }
                AdditionalInfoDTO additionalInfoDTO = (AdditionalInfoDTO) other;
                return Intrinsics.d(this.text, additionalInfoDTO.text) && Intrinsics.d(this.badge, additionalInfoDTO.badge) && this.offsetX == additionalInfoDTO.offsetX;
            }

            public final BadgeDTO getBadge() {
                return this.badge;
            }

            public final int getOffsetX() {
                return this.offsetX;
            }

            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                TextDTO textDTO = this.text;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                BadgeDTO badgeDTO = this.badge;
                return Integer.hashCode(this.offsetX) + ((hashCode + (badgeDTO != null ? badgeDTO.hashCode() : 0)) * 31);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                BadgeDTO badgeDTO = this.badge;
                int i11 = this.offsetX;
                StringBuilder sb2 = new StringBuilder("AdditionalInfoDTO(text=");
                sb2.append(textDTO);
                sb2.append(", badge=");
                sb2.append(badgeDTO);
                sb2.append(", offsetX=");
                return K00.b.e(i11, ")", sb2);
            }

            public /* synthetic */ AdditionalInfoDTO(TextDTO textDTO, BadgeDTO badgeDTO, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(textDTO, badgeDTO, (i12 & 4) != 0 ? 16 : i11);
            }
        }

        public /* synthetic */ Flight(Integer num, List list, PriceDTO priceDTO, BadgeDTO badgeDTO, TextDTO textDTO, List list2, TextDTO textDTO2, TripRoute tripRoute, TripRoute tripRoute2, String str, String str2, AtomActionDTO atomActionDTO, boolean z11, AdditionalInfoDTO additionalInfoDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, list, priceDTO, badgeDTO, textDTO, list2, textDTO2, tripRoute, tripRoute2, str, str2, atomActionDTO, (i11 & 4096) != 0 ? false : z11, additionalInfoDTO, map);
        }
    }
}
