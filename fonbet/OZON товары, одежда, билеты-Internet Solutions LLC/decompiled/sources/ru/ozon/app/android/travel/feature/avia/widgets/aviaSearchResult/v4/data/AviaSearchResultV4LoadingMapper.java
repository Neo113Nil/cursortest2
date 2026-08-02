package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4ListItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4LoadingVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.DirectFlightsSkeleton;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.FlightSkeleton;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4LoadingMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4LoadingVO$State;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$Flight;", "flights", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboardingApp", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO$DirectFlightsSkeletonDTO;", "directFlightsSkeleton", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4ListItemVO;", "createFlightsList-HEBmIZI", "(Ljava/util/List;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)Ljava/util/List;", "createFlightsList", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaSearchResultV4LoadingMapper implements Function2<AviaSearchResultV4DTO, d, List<? extends AviaSearchResultV4LoadingVO>>, AsyncWidgetStateMapper<AviaSearchResultV4DTO, AviaSearchResultV4LoadingVO.State> {

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<IconDTO> imagePrefetcher;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AviaSearchResultV4DTO.AsyncBehaviorType.values().length];
            try {
                iArr[AviaSearchResultV4DTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AviaSearchResultV4DTO.AsyncBehaviorType.REFRESH_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AviaSearchResultV4LoadingMapper(@NotNull Context context, @NotNull ImagePrefetcher<IconDTO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.imagePrefetcher = imagePrefetcher;
    }

    /* renamed from: createFlightsList-HEBmIZI, reason: not valid java name */
    private final List<AviaSearchResultV4ListItemVO> m1075createFlightsListHEBmIZI(List<AviaSearchResultV4DTO.Flight> flights, OnBoardingDTO onboardingApp, TextDTO directFlightsSkeleton) {
        ArrayList arrayList = new ArrayList();
        if (directFlightsSkeleton != null) {
            arrayList.add(new DirectFlightsSkeleton(directFlightsSkeleton.hashCode(), directFlightsSkeleton));
        }
        if (flights != null) {
            Iterator<T> it = flights.iterator();
            while (it.hasNext()) {
                OnBoardingDTO onBoardingDTO = onboardingApp;
                arrayList.add(AviaSearchResultV4FlightMapperExtKt.toVO$default((AviaSearchResultV4DTO.Flight) it.next(), this.context, onBoardingDTO, false, 4, null));
                onboardingApp = onBoardingDTO;
            }
        }
        int size = 5 - (flights != null ? flights.size() : 0);
        if (size < 1) {
            size = 1;
        }
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new FlightSkeleton(i11));
        }
        return arrayList;
    }

    private final AviaSearchResultV4LoadingVO.State extractState(AviaSearchResultV4DTO state) {
        List<AviaSearchResultV4DTO.Flight> flights = state.getFlights();
        if (flights != null) {
            AviaSearchResultV4FlightMapperExtKt.prefetchImages(flights, this.context, this.imagePrefetcher);
        }
        List<AviaSearchResultV4ListItemVO> m1075createFlightsListHEBmIZI = m1075createFlightsListHEBmIZI(state.getFlights(), state.getOnboardingApp(), state.m1065getDirectFlightsSkeletonrasF5MU());
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAsyncBehaviorType().ordinal()];
        if (i11 == 1) {
            EmptyStateDTO asyncErrorMessage = state.getAsyncErrorMessage();
            return new AviaSearchResultV4LoadingVO.State.FetchState(m1075createFlightsListHEBmIZI, asyncErrorMessage != null ? MapperExtKt.toVO(asyncErrorMessage) : null, state.getAsyncParams());
        }
        if (i11 != 2) {
            return null;
        }
        AtomActionDTO refreshAction = state.getRefreshAction();
        return new AviaSearchResultV4LoadingVO.State.Refresh(m1075createFlightsListHEBmIZI, refreshAction != null ? AtomActionMapperKt.toAtomAction(refreshAction, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaSearchResultV4LoadingVO> invoke(@NotNull AviaSearchResultV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        AviaSearchResultV4LoadingVO.State extractState = extractState(state);
        return extractState == null ? K.f71697a : C7714v.a0(new AviaSearchResultV4LoadingVO(hashCode, a11, extractState));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AviaSearchResultV4LoadingVO.State mapAsyncState(@NotNull AviaSearchResultV4DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        AviaSearchResultV4LoadingVO.State extractState = extractState(state);
        if (extractState != null) {
            return extractState;
        }
        throw new IllegalStateException("Wrong async state type " + state.getAsyncBehaviorType());
    }
}
