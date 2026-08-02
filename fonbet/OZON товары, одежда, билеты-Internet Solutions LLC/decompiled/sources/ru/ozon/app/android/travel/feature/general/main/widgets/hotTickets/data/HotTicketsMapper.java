package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketSkeleton;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.TicketVO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B9\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001f\u001a\u00020\u001e*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\"\u0010#J9\u0010)\u001a\u00020(\"\b\b\u0000\u0010%*\u00020$2\u0006\u0010\n\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00018\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b)\u0010*J*\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010,\u001a\u00060\u0003j\u0002`+H\u0096\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00101R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;", "backgroundImagePrefetcher", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "titleImagePrefetcher", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "imagePrefetcher", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "state", "extractState", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$State;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;", "", "index", "", "borderColor", "", "isSingle", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO$TicketDTO;ILjava/lang/String;Z)Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketSkeleton;", "getListOfSkeletons", "(Ljava/lang/String;)Ljava/util/List;", "", "T", "item", "prefetcher", "", "prefetch", "(Landroid/content/Context;Ljava/lang/Object;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Landroid/content/Context;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsMapper implements Function2<HotTicketsDTO, d, List<? extends HotTicketsVO>>, AsyncWidgetStateMapper<HotTicketsDTO, HotTicketsVO.State> {

    @NotNull
    private final ImagePrefetcher<HotTicketsVO.LoadedState> backgroundImagePrefetcher;

    @NotNull
    private final Context context;

    @NotNull
    private final ImagePrefetcher<ThemeImageV1VO> imagePrefetcher;

    @NotNull
    private final ImagePrefetcher<ImageDTO> titleImagePrefetcher;

    public HotTicketsMapper(@NotNull Context context, @NotNull ImagePrefetcher<HotTicketsVO.LoadedState> backgroundImagePrefetcher, @NotNull ImagePrefetcher<ImageDTO> titleImagePrefetcher, @NotNull ImagePrefetcher<ThemeImageV1VO> imagePrefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundImagePrefetcher, "backgroundImagePrefetcher");
        Intrinsics.checkNotNullParameter(titleImagePrefetcher, "titleImagePrefetcher");
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.context = context;
        this.backgroundImagePrefetcher = backgroundImagePrefetcher;
        this.titleImagePrefetcher = titleImagePrefetcher;
        this.imagePrefetcher = imagePrefetcher;
    }

    private final HotTicketsVO.State extractState(HotTicketsDTO state) {
        List<HotTicketsDTO.TicketDTO> tickets = state.getTickets();
        int i11 = 0;
        boolean z11 = tickets != null && tickets.size() == 1;
        List<HotTicketsDTO.TicketDTO> tickets2 = state.getTickets();
        if (tickets2 == null) {
            ImageDTO titleImage = state.getTitleImage();
            TextDTO title = state.getTitle();
            List<HotTicketSkeleton> listOfSkeletons = getListOfSkeletons(state.getTicketBorderColor());
            ThemeImageV1DTO backgroundImage = state.getBackgroundImage();
            ThemeImageV1VO vo = backgroundImage != null ? MapperExtKt.toVO(backgroundImage) : null;
            ThemeImageV1DTO image = state.getImage();
            return new HotTicketsVO.SkeletonState(titleImage, title, listOfSkeletons, vo, image != null ? MapperExtKt.toVO(image) : null, state.getButton(), state.getWidgetBorderColor(), state.getAsyncParams());
        }
        ImageDTO titleImage2 = state.getTitleImage();
        TextDTO title2 = state.getTitle();
        List<HotTicketsDTO.TicketDTO> list = tickets2;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((HotTicketsDTO.TicketDTO) obj, i11, state.getTicketBorderColor(), z11));
            i11 = i12;
        }
        ThemeImageV1DTO backgroundImage2 = state.getBackgroundImage();
        ThemeImageV1VO vo2 = backgroundImage2 != null ? MapperExtKt.toVO(backgroundImage2) : null;
        ThemeImageV1DTO image2 = state.getImage();
        HotTicketsVO.LoadedState loadedState = new HotTicketsVO.LoadedState(titleImage2, title2, arrayList, vo2, image2 != null ? MapperExtKt.toVO(image2) : null, state.getButton(), state.getWidgetBorderColor(), z11);
        prefetch(this.context, loadedState, this.backgroundImagePrefetcher);
        prefetch(this.context, loadedState.getTitleImage(), this.titleImagePrefetcher);
        prefetch(this.context, loadedState.getImage(), this.imagePrefetcher);
        return loadedState;
    }

    private final List<HotTicketSkeleton> getListOfSkeletons(String borderColor) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 4; i11++) {
            arrayList.add(new HotTicketSkeleton(i11, borderColor));
        }
        return arrayList;
    }

    private final <T> void prefetch(Context context, T item, ImagePrefetcher<T> prefetcher) {
        if (item == null) {
            return;
        }
        prefetcher.prefetch(context, C7714v.a0(item));
    }

    private final TicketVO toVO(HotTicketsDTO.TicketDTO ticketDTO, int i11, String str, boolean z11) {
        List<PriceDTO.Component> price = ticketDTO.getPrice().getPrice();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(price);
        sb2.append(i11);
        int hashCode = sb2.toString().hashCode();
        BadgeDTO dateBadge = ticketDTO.getDateBadge();
        PriceDTO price2 = ticketDTO.getPrice();
        List<ImageDTO> airlineIcons = ticketDTO.getAirlineIcons();
        TextDTO destination = ticketDTO.getDestination();
        TextDTO tripDuration = ticketDTO.getTripDuration();
        TextDTO tripTime = ticketDTO.getTripTime();
        TextDTO transferText = ticketDTO.getTransferText();
        IconDTO transferIcon = ticketDTO.getTransferIcon();
        AtomActionDTO cardClickAction = ticketDTO.getCardClickAction();
        return new TicketVO(hashCode, dateBadge, price2, airlineIcons, destination, tripDuration, tripTime, transferText, transferIcon, cardClickAction != null ? AtomActionMapperKt.toAtomAction(cardClickAction, ticketDTO.getTrackingInfo()) : null, str, z11, ticketDTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotTicketsVO> invoke(@NotNull HotTicketsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new HotTicketsVO(widgetInfo.d().hashCode(), extractState(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotTicketsVO.State mapAsyncState(@NotNull HotTicketsDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return extractState(state);
    }
}
