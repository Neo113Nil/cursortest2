package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data;

import Sc.o;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.data.HotelsSearchResultsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5LoadingNoUiMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/noUi/HotelsSearchResultsV5LoadingNoUiVO$State;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/data/HotelsSearchResultsV5DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsSearchResultsV5LoadingNoUiMapper implements Function2<HotelsSearchResultsV5DTO, d, List<? extends HotelsSearchResultsV5LoadingNoUiVO>>, AsyncWidgetStateMapper<HotelsSearchResultsV5DTO, HotelsSearchResultsV5LoadingNoUiVO.State> {

    @NotNull
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelsSearchResultsV5DTO.AsyncBehaviorType.values().length];
            try {
                iArr[HotelsSearchResultsV5DTO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HotelsSearchResultsV5DTO.AsyncBehaviorType.SKELETON_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HotelsSearchResultsV5DTO.AsyncBehaviorType.REFRESH_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HotelsSearchResultsV5DTO.AsyncBehaviorType.NO_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HotelsSearchResultsV5LoadingNoUiMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final HotelsSearchResultsV5LoadingNoUiVO.State extractState(HotelsSearchResultsV5DTO state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getAsyncBehaviorType().ordinal()];
        if (i11 == 1) {
            List<HotelsSearchResultsV5DTO.HotelItemDTO> hotels = state.getHotels();
            ArrayList arrayList = new ArrayList(C7714v.z(hotels, 10));
            Iterator<T> it = hotels.iterator();
            while (it.hasNext()) {
                arrayList.add(HotelsSearchResultsV5HotelMapperExtKt.toVO$default((HotelsSearchResultsV5DTO.HotelItemDTO) it.next(), this.context, null, 2, null));
            }
            return new HotelsSearchResultsV5LoadingNoUiVO.State.FetchState(arrayList, state.getErrorNotification(), state.getOnboardingApp(), state.getAsyncParams());
        }
        if (i11 == 2) {
            return HotelsSearchResultsV5LoadingNoUiVO.State.SkeletonState.m1344boximpl(HotelsSearchResultsV5LoadingNoUiVO.State.SkeletonState.m1345constructorimpl(state.getAsyncParams()));
        }
        if (i11 == 3) {
            List<HotelsSearchResultsV5DTO.HotelItemDTO> hotels2 = state.getHotels();
            ArrayList arrayList2 = new ArrayList(C7714v.z(hotels2, 10));
            Iterator<T> it2 = hotels2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(HotelsSearchResultsV5HotelMapperExtKt.toVO$default((HotelsSearchResultsV5DTO.HotelItemDTO) it2.next(), this.context, null, 2, null));
            }
            AtomActionDTO refreshAction = state.getRefreshAction();
            return new HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState(arrayList2, refreshAction != null ? AtomActionMapperKt.toAtomAction(refreshAction, null) : null);
        }
        if (i11 != 4) {
            throw new o();
        }
        List<HotelsSearchResultsV5DTO.HotelItemDTO> hotels3 = state.getHotels();
        ArrayList arrayList3 = new ArrayList(C7714v.z(hotels3, 10));
        Iterator<T> it3 = hotels3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(HotelsSearchResultsV5HotelMapperExtKt.toVO$default((HotelsSearchResultsV5DTO.HotelItemDTO) it3.next(), this.context, null, 2, null));
        }
        return new HotelsSearchResultsV5LoadingNoUiVO.State.NoActionState(arrayList3, state.getOnboardingApp());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsSearchResultsV5LoadingNoUiVO> invoke(@NotNull HotelsSearchResultsV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String a11 = widgetInfo.c().a();
        HotelsSearchResultsV5LoadingNoUiVO.State extractState = extractState(state);
        return extractState == null ? K.f71697a : C7714v.a0(new HotelsSearchResultsV5LoadingNoUiVO(hashCode, U.i(new Pair(a11, extractState)), 0, 4, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsSearchResultsV5LoadingNoUiVO.State mapAsyncState(@NotNull HotelsSearchResultsV5DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        HotelsSearchResultsV5LoadingNoUiVO.State extractState = extractState(state);
        if (extractState != null) {
            return extractState;
        }
        throw new IllegalStateException("Wrong async state type " + state.getAsyncBehaviorType());
    }
}
