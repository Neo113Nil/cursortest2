package ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.data.UnpaidOrderListDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.unpaidOrderList.presentation.UnpaidOrderListVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.timerFormatter.TimerFormatter;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0003j\u0002`\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "timerFormatter", "<init>", "(Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;", "orderList", "mapStateWrapper", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "dto", "", "isWide", "Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "mapOrder", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO$OrderDTO;Z)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$OrderVO;", "state", "mapAsyncState", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/presentation/UnpaidOrderListVO$UnpaidOrderListStateWrapper;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/unpaidOrderList/data/UnpaidOrderListDTO;Ll20/d;)Ljava/util/List;", "", "ms", "", "formattedTimerText", "(J)Ljava/lang/String;", "Lru/ozon/app/android/travel/utils/timerFormatter/TimerFormatter;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UnpaidOrderListMapper implements Function2<UnpaidOrderListDTO, d, List<? extends UnpaidOrderListVO>>, AsyncWidgetStateMapper<UnpaidOrderListDTO, UnpaidOrderListVO.UnpaidOrderListStateWrapper> {

    @NotNull
    private final TimerFormatter timerFormatter;

    public UnpaidOrderListMapper(@NotNull TimerFormatter timerFormatter) {
        Intrinsics.checkNotNullParameter(timerFormatter, "timerFormatter");
        this.timerFormatter = timerFormatter;
    }

    private final UnpaidOrderListVO.OrderVO mapOrder(UnpaidOrderListDTO.OrderDTO dto, boolean isWide) {
        OzonSpannableString text = dto.getTitle().getText();
        OzonSpannableString text2 = dto.getDates().getText();
        OzonSpannableString text3 = dto.getDetail().getText();
        BadgeDTO priceBadge = dto.getPriceBadge();
        long hashCode = (((Object) text) + ((Object) text2) + ((Object) text3) + (priceBadge != null ? priceBadge.getText() : null)).hashCode();
        BadgeDTO badge = dto.getBadge();
        long timeToPay = dto.getTimeToPay() - 1000;
        long timeToPay2 = dto.getTimeToPay() - dto.getRemainingDisplayTimerValue();
        TextDTO title = dto.getTitle();
        TextDTO dates = dto.getDates();
        TextDTO detail = dto.getDetail();
        BadgeDTO priceBadge2 = dto.getPriceBlock() == null ? dto.getPriceBadge() : null;
        List<IconDTO> routeIcons = dto.getRouteIcons();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(dto.getClickAction(), null);
        Map<String, TokenizedTrackingInfo> viewTracking = dto.getViewTracking();
        Map<String, TokenizedTrackingInfo> clickTracking = dto.getClickTracking();
        UnpaidOrderListDTO.OrderDTO.PriceBlock priceBlock = dto.getPriceBlock();
        PriceDTO firstPrice = priceBlock != null ? priceBlock.getFirstPrice() : null;
        UnpaidOrderListDTO.OrderDTO.PriceBlock priceBlock2 = dto.getPriceBlock();
        return new UnpaidOrderListVO.OrderVO(hashCode, isWide, badge, null, timeToPay, timeToPay2, title, dates, detail, priceBadge2, routeIcons, atomAction, viewTracking, clickTracking, firstPrice, priceBlock2 != null ? priceBlock2.getSecondPrice() : null, 8, null);
    }

    private final UnpaidOrderListVO.UnpaidOrderListStateWrapper mapStateWrapper(List<UnpaidOrderListDTO.OrderDTO> orderList) {
        long j11;
        boolean z11 = orderList.size() == 1;
        List<UnpaidOrderListDTO.OrderDTO> list = orderList;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        long timeToPay = ((UnpaidOrderListDTO.OrderDTO) it.next()).getTimeToPay();
        loop0: while (true) {
            j11 = timeToPay;
            while (it.hasNext()) {
                timeToPay = ((UnpaidOrderListDTO.OrderDTO) it.next()).getTimeToPay();
                if (j11 < timeToPay) {
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(mapOrder((UnpaidOrderListDTO.OrderDTO) it2.next(), z11));
        }
        return new UnpaidOrderListVO.UnpaidOrderListStateWrapper(arrayList, j11, System.currentTimeMillis());
    }

    @NotNull
    public final String formattedTimerText(long ms2) {
        return this.timerFormatter.format(ms2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<UnpaidOrderListVO> invoke(@NotNull UnpaidOrderListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new UnpaidOrderListVO(widgetInfo.d().hashCode(), mapStateWrapper(state.getOrderList()), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public UnpaidOrderListVO.UnpaidOrderListStateWrapper mapAsyncState(@NotNull UnpaidOrderListDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapStateWrapper(state.getOrderList());
    }
}
