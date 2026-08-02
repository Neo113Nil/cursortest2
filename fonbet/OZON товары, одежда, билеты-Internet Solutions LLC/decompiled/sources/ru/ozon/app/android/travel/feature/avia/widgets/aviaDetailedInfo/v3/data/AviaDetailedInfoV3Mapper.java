package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.data.AviaDetailedInfoV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3TabItemVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.AviaDetailedInfoV3VO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020$2\u0006\u0010\n\u001a\u00020#H\u0002¢\u0006\u0004\b!\u0010%J*\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010&\u001a\u00020\u00022\n\u0010(\u001a\u00060\u0003j\u0002`'H\u0096\u0002¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "content", "", "widgetId", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "mapTabContentToVO", "(Ljava/lang/Object;J)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3TabItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$AviaDetailsContent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO;", "mapAviaDetailsContentToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$AviaDetailsContent;J)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$AviaDetailsContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentVO;", "mapLuggageContentToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent;J)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent$LuggageItem;", "item", "", "isFullScreen", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "mapLuggageItemToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$LuggageContent$LuggageItem;ZJ)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$LuggageContentItemsVO$LuggageItemVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO;", "mapReturnPolicyContentVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$RouteBlockReturnPolicy;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO$RouteBlockVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO$ReturnPolicyContent$RouteBlockReturnPolicy;)Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/presentation/content/AviaDetailedInfoV3VO$ReturnPolicyContentVO$RouteBlockVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaDetailedInfo/v3/data/AviaDetailedInfoV3DTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaDetailedInfoV3Mapper implements Function2<AviaDetailedInfoV3DTO, d, List<? extends AviaDetailedInfoV3VO>> {
    private final AviaDetailedInfoV3VO.AviaDetailsContentVO mapAviaDetailsContentToVO(AviaDetailedInfoV3DTO.AviaDetailsContent content, long widgetId) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = content.getFlights().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                TextDTO noticeTime = content.getNoticeTime();
                OzonSpannableString text = noticeTime != null ? noticeTime.getText() : null;
                TextDTO noticeLuggage = content.getNoticeLuggage();
                OzonSpannableString text2 = noticeLuggage != null ? noticeLuggage.getText() : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) text);
                sb2.append((Object) text2);
                arrayList.add(new AviaDetailedInfoV3VO.AviaDetailsContentVO.NoticeVO(sb2.toString().hashCode(), content.getNoticeTime(), content.getNoticeLuggage(), content.getAnnotation()));
                int marginBetweenFlights = content.getMarginBetweenFlights();
                Map<String, TokenizedTrackingInfo> viewTrackingInfo = content.getViewTrackingInfo();
                return new AviaDetailedInfoV3VO.AviaDetailsContentVO(arrayList, marginBetweenFlights, viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new AviaDetailedInfoV3VO.AviaDetailsContentVO.AviaDetails(i11, FlightDetailsMapperKt.toVO((FlightDetailsDTO) next)));
            i11 = i12;
        }
    }

    private final AviaDetailedInfoV3VO.LuggageContentVO mapLuggageContentToVO(AviaDetailedInfoV3DTO.LuggageContent content, long widgetId) {
        OzonSpannableString subtitle;
        OzonSpannableString subtitle2;
        C7665d it = C7714v.O(content.getItems()).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        int b11 = it.b();
        if (it.hasNext()) {
            CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter = (CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) C7714v.Z(content.getItems().get(b11).getCells());
            int length = (cellWithReverseSubtitleCounter == null || (subtitle2 = cellWithReverseSubtitleCounter.getSubtitle()) == null) ? 0 : subtitle2.length();
            do {
                int b12 = it.b();
                CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter cellWithReverseSubtitleCounter2 = (CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) C7714v.Z(content.getItems().get(b12).getCells());
                int length2 = (cellWithReverseSubtitleCounter2 == null || (subtitle = cellWithReverseSubtitleCounter2.getSubtitle()) == null) ? 0 : subtitle.length();
                if (length < length2) {
                    b11 = b12;
                    length = length2;
                }
            } while (it.hasNext());
        }
        List<AviaDetailedInfoV3DTO.LuggageContent.LuggageItem> items = content.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it2 = items.iterator();
        while (true) {
            boolean z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            AviaDetailedInfoV3DTO.LuggageContent.LuggageItem luggageItem = (AviaDetailedInfoV3DTO.LuggageContent.LuggageItem) it2.next();
            if (content.getItems().size() != 1) {
                z11 = false;
            }
            arrayList.add(mapLuggageItemToVO(luggageItem, z11, widgetId));
        }
        int size = content.getItems().size();
        OzonSpannableString text = content.getNoticeLuggage().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(size);
        sb2.append((Object) text);
        return new AviaDetailedInfoV3VO.LuggageContentVO(C7714v.a0(new AviaDetailedInfoV3VO.LuggageContentItemsVO(sb2.toString().hashCode(), arrayList, (AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO) C7714v.Q(b11, arrayList), content.getItems().size() == 1, content.getNoticeLuggage())));
    }

    private final AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO mapLuggageItemToVO(AviaDetailedInfoV3DTO.LuggageContent.LuggageItem item, boolean isFullScreen, long widgetId) {
        OzonSpannableString text = item.getRoute().getText();
        OzonSpannableString subtitle = ((CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter) C7714v.K(item.getCells())).getSubtitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) subtitle);
        int hashCode = sb2.toString().hashCode();
        TextDTO route = item.getRoute();
        IconDTO airlineLogo = item.getAirlineLogo();
        IconDTO subAirlineLogo = item.getSubAirlineLogo();
        List<CellAtom.CellAtomWithSubtitle.CellWithReverseSubtitleCounter> cells = item.getCells();
        String backgroundColor = item.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = item.getViewTrackingInfo();
        return new AviaDetailedInfoV3VO.LuggageContentItemsVO.LuggageItemVO(hashCode, isFullScreen, route, airlineLogo, subAirlineLogo, cells, backgroundColor, viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    private final AviaDetailedInfoV3VO.ReturnPolicyContentVO mapReturnPolicyContentVO(AviaDetailedInfoV3DTO.ReturnPolicyContent content) {
        ArrayList arrayList = new ArrayList();
        AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO disclaimerVO = content.getDisclaimer() != null ? new AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO(AviaDetailedInfoV3VO.ReturnPolicyContentVO.DisclaimerVO.class.getSimpleName().hashCode(), content.getDisclaimer().getTexts(), content.getDisclaimer().getBackgroundColor()) : null;
        List<AviaDetailedInfoV3DTO.ReturnPolicyContent.RouteBlockReturnPolicy> routeBlocks = content.getRouteBlocks();
        ArrayList arrayList2 = new ArrayList(C7714v.z(routeBlocks, 10));
        Iterator<T> it = routeBlocks.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapReturnPolicyContentVO((AviaDetailedInfoV3DTO.ReturnPolicyContent.RouteBlockReturnPolicy) it.next()));
        }
        if (disclaimerVO != null) {
            arrayList.add(disclaimerVO);
        }
        arrayList.addAll(arrayList2);
        return new AviaDetailedInfoV3VO.ReturnPolicyContentVO(arrayList);
    }

    private final AviaDetailedInfoV3TabItemVO mapTabContentToVO(Object content, long widgetId) {
        if (content instanceof AviaDetailedInfoV3DTO.AviaDetailsContent) {
            return mapAviaDetailsContentToVO((AviaDetailedInfoV3DTO.AviaDetailsContent) content, widgetId);
        }
        if (content instanceof AviaDetailedInfoV3DTO.LuggageContent) {
            return mapLuggageContentToVO((AviaDetailedInfoV3DTO.LuggageContent) content, widgetId);
        }
        if (content instanceof AviaDetailedInfoV3DTO.ReturnPolicyContent) {
            return mapReturnPolicyContentVO((AviaDetailedInfoV3DTO.ReturnPolicyContent) content);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AviaDetailedInfoV3VO> invoke(@NotNull AviaDetailedInfoV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<AviaDetailedInfoV3DTO.Tab> items = state.getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            AviaDetailedInfoV3TabItemVO mapTabContentToVO = mapTabContentToVO(((AviaDetailedInfoV3DTO.Tab) it.next()).getContent(), hashCode);
            if (mapTabContentToVO != null) {
                arrayList.add(mapTabContentToVO);
            }
        }
        Object content = ((AviaDetailedInfoV3DTO.Tab) C7714v.K(state.getItems())).getContent();
        AviaDetailedInfoV3VO.AviaDetailsContentVO aviaDetailsContentVO = content instanceof AviaDetailedInfoV3VO.AviaDetailsContentVO ? (AviaDetailedInfoV3VO.AviaDetailsContentVO) content : null;
        int marginBetweenFlights = aviaDetailsContentVO != null ? aviaDetailsContentVO.getMarginBetweenFlights() : 0;
        List<AviaDetailedInfoV3DTO.Tab> items2 = state.getItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(items2, 10));
        Iterator<T> it2 = items2.iterator();
        while (it2.hasNext()) {
            Map<String, TokenizedTrackingInfo> trackingInfo = ((AviaDetailedInfoV3DTO.Tab) it2.next()).getTrackingInfo();
            arrayList2.add(trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        }
        return C7714v.a0(new AviaDetailedInfoV3VO(hashCode, arrayList, marginBetweenFlights, arrayList2));
    }

    private final AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO mapReturnPolicyContentVO(AviaDetailedInfoV3DTO.ReturnPolicyContent.RouteBlockReturnPolicy content) {
        return new AviaDetailedInfoV3VO.ReturnPolicyContentVO.RouteBlockVO((content.getAirlineLogo().getText() + ((Object) content.getText().getText())).hashCode(), content.getAirlineLogo(), content.getRoute(), content.getText());
    }
}
