package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data;

import T00.a;
import WZ.t;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.data.ToursSearchResultDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u001d\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010#J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010%\u001a\u00060\u0003j\u0002`$H\u0096\u0002¢\u0006\u0004\b&\u0010'J'\u0010)\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/composer/imageprefetch/PrefetchableImage;", "toursSearchResultImagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "", "timeout", "", "timeoutDate", "getTimeout", "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/Long;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$LoaderState;", "state", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "mapLoaderState", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$LoaderStateVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;", "hotel", "widgetId", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "mapHotel", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$Hotel;J)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$HotelVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$TourOption;", "tour", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "mapTourOption", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO$TourOption;J)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;Ll20/d;)Ljava/util/List;", ImagesContract.URL, "mapToursSearchResultDTO", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/data/ToursSearchResultDTO;JLjava/lang/String;)Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO;", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "", "width", "I", "height", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultMapper implements Function2<ToursSearchResultDTO, d, List<? extends ToursSearchResultVO>> {

    @NotNull
    private final Context context;
    private final int height;

    @NotNull
    private final ImagePrefetcher<PrefetchableImage> toursSearchResultImagePrefetcher;
    private final int width;

    public ToursSearchResultMapper(@NotNull Context context, @NotNull ImagePrefetcher<PrefetchableImage> toursSearchResultImagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(toursSearchResultImagePrefetcher, "toursSearchResultImagePrefetcher");
        this.context = context;
        this.toursSearchResultImagePrefetcher = toursSearchResultImagePrefetcher;
        this.width = context.getResources().getDisplayMetrics().widthPixels - ResourceExtKt.toPx(32, context);
        this.height = ResourceExtKt.toPx(164, context);
    }

    private final Long getTimeout(Long timeout, String timeoutDate) {
        if (timeout != null) {
            return Long.valueOf(timeout.longValue() + SystemClock.elapsedRealtime());
        }
        if (timeoutDate == null) {
            return null;
        }
        return Long.valueOf((DateTime.i(timeoutDate).getMillis() + SystemClock.elapsedRealtime()) - new DateTime().getMillis());
    }

    private final ToursSearchResultVO.HotelVO mapHotel(ToursSearchResultDTO.Hotel hotel, long widgetId) {
        ArrayList arrayList;
        OzonSpannableString text = hotel.getTitle().getText();
        OzonSpannableString text2 = hotel.getPrice().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        int hashCode = sb2.toString().hashCode();
        List<String> images = hotel.getImages();
        ArrayList arrayList2 = new ArrayList(C7714v.z(images, 10));
        for (String str : images) {
            arrayList2.add(new ToursSearchResultVO.HotelVO.Image(str.hashCode(), str));
        }
        List<Badge> badges = hotel.getBadges();
        List<Badge> badges2 = hotel.getBadges();
        boolean z11 = !(badges2 == null || badges2.isEmpty());
        TextAtom title = hotel.getTitle();
        TextAtom description = hotel.getDescription();
        List<ToursSearchResultDTO.TourOption> tourOptions = hotel.getTourOptions();
        if (tourOptions != null) {
            List<ToursSearchResultDTO.TourOption> list = tourOptions;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(mapTourOption((ToursSearchResultDTO.TourOption) it.next(), widgetId));
            }
        } else {
            arrayList = null;
        }
        List<ToursSearchResultDTO.TourOption> tourOptions2 = hotel.getTourOptions();
        boolean z12 = !(tourOptions2 == null || tourOptions2.isEmpty());
        List<Badge> hotelFeatures = hotel.getHotelFeatures();
        List<Badge> hotelFeatures2 = hotel.getHotelFeatures();
        boolean z13 = true ^ (hotelFeatures2 == null || hotelFeatures2.isEmpty());
        TextAtom price = hotel.getPrice();
        TextAtom dates = hotel.getDates();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(hotel.getSelectAction(), hotel.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = hotel.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> galleryTrackingInfo = hotel.getGalleryTrackingInfo();
        return new ToursSearchResultVO.HotelVO(hashCode, arrayList2, badges, z11, title, description, hotelFeatures, z13, arrayList, z12, price, dates, atomAction, tokenizedEvent$default, galleryTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(galleryTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    private final ToursSearchResultVO.LoaderStateVO mapLoaderState(List<ToursSearchResultDTO.LoaderState> state) {
        List<ToursSearchResultDTO.LoaderState> list = state;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((ToursSearchResultDTO.LoaderState) it.next()).getPercent() / 100.0f));
        }
        float[] R02 = C7714v.R0(arrayList);
        Intrinsics.checkNotNullParameter(R02, "<this>");
        int length = R02.length;
        float[] copyOf = Arrays.copyOf(R02, length + 1);
        copyOf[length] = 0.97f;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ToursSearchResultDTO.LoaderState) it2.next()).getText());
        }
        return new ToursSearchResultVO.LoaderStateVO((String[]) arrayList2.toArray(new String[0]), copyOf);
    }

    private final ToursSearchResultVO.TourOptionVO mapTourOption(ToursSearchResultDTO.TourOption tour, long widgetId) {
        TextAtom price = tour.getPrice();
        TextAtom date = tour.getDate();
        Icon icon = tour.getIcon();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(tour.getSelectAction(), tour.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = tour.getTrackingInfo();
        return new ToursSearchResultVO.TourOptionVO(price, date, icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    @NotNull
    public final ToursSearchResultVO mapToursSearchResultDTO(@NotNull ToursSearchResultDTO state, long widgetId, String url) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        List<ToursSearchResultDTO.Hotel> hotels = state.getHotels();
        if (hotels != null) {
            List<ToursSearchResultDTO.Hotel> list = hotels;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(mapHotel((ToursSearchResultDTO.Hotel) it.next(), widgetId));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        boolean isAllDone = state.isAllDone();
        Long timeout = getTimeout(state.getTimeoutMs(), state.getTimeoutDate());
        EmptyStateVO vo = MapperExtKt.toVO(state.getErrorMessage());
        NotificationDTO errorNotification = state.getErrorNotification();
        AtomActionDTO timeoutAction = state.getTimeoutAction();
        AtomAction atomAction = timeoutAction != null ? AtomActionMapperKt.toAtomAction(timeoutAction, null) : null;
        AtomActionDTO lazyLoadAction = state.getLazyLoadAction();
        AtomActionDTO pollingAction = state.getPollingAction();
        List<ToursSearchResultDTO.LoaderState> loaderStates = state.getLoaderStates();
        ToursSearchResultVO.LoaderStateVO mapLoaderState = loaderStates != null ? mapLoaderState(loaderStates) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return new ToursSearchResultVO(widgetId, url, arrayList, isAllDone, timeout, vo, errorNotification, atomAction, lazyLoadAction, pollingAction, mapLoaderState, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ToursSearchResultVO> invoke(@NotNull ToursSearchResultDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ToursSearchResultDTO.Hotel> hotels = state.getHotels();
        if (hotels != null && !hotels.isEmpty()) {
            List<ToursSearchResultDTO.Hotel> hotels2 = state.getHotels();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = hotels2.iterator();
            while (it.hasNext()) {
                String str = (String) C7714v.M(((ToursSearchResultDTO.Hotel) it.next()).getImages());
                PrefetchableImage prefetchableImage = str != null ? new PrefetchableImage(this.width, this.height, str) : null;
                if (prefetchableImage != null) {
                    arrayList.add(prefetchableImage);
                }
            }
            if (!arrayList.isEmpty()) {
                this.toursSearchResultImagePrefetcher.prefetch(this.context, arrayList);
            }
        }
        long hashCode = widgetInfo.d().hashCode();
        a b11 = widgetInfo.b();
        return C7714v.a0(mapToursSearchResultDTO(state, hashCode, b11 != null ? b11.c() : null));
    }
}
