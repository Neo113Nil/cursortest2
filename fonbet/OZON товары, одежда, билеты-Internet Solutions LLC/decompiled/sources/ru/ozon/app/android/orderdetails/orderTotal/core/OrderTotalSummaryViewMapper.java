package ru.ozon.app.android.orderdetails.orderTotal.core;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.orderdetails.R$layout;
import ru.ozon.app.android.orderdetails.orderTotal.data.HeaderDTO;
import ru.ozon.app.android.orderdetails.orderTotal.data.LineDTO;
import ru.ozon.app.android.orderdetails.orderTotal.data.OrderTotalDTO;
import ru.ozon.app.android.orderdetails.orderTotal.data.PriceBlockDTO;
import ru.ozon.app.android.orderdetails.orderTotal.data.SummaryDTO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.FooterPriceBlockVO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.HeaderVO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.LineVO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.OrderTotalVO;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.OrderTotalWidgetViewHolder;
import ru.ozon.app.android.orderdetails.orderTotal.presentation.summary.PriceBlockVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.BadgeMapperKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R2\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00170\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010$\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006&"}, d2 = {"Lru/ozon/app/android/orderdetails/orderTotal/core/OrderTotalSummaryViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/orderdetails/orderTotal/data/OrderTotalDTO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalVO;", "<init>", "()V", "Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;", "", "stateId", "toVO", "(Lru/ozon/app/android/orderdetails/orderTotal/data/SummaryDTO;Ljava/lang/String;)Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalVO;", "Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", "(Lru/ozon/app/android/orderdetails/orderTotal/data/HeaderDTO;)Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/HeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/orderdetails/orderTotal/presentation/summary/OrderTotalWidgetViewHolder;", "holderProducer", "getHolderProducer", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderTotalSummaryViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final Function2<OrderTotalDTO, d, List<OrderTotalVO>> mapper = new OrderTotalSummaryViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_order_total_layout;

    @NotNull
    private final Function2<View, ComposerReferences, OrderTotalWidgetViewHolder> holderProducer = OrderTotalSummaryViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderTotalVO toVO(SummaryDTO summaryDTO, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long hashCode = str.hashCode();
        HeaderVO vo = toVO(summaryDTO.getHeader());
        List<Badge> badges = summaryDTO.getBadges();
        ArrayList arrayList3 = null;
        if (badges != null) {
            List<Badge> list = badges;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(BadgeMapperKt.mapToDsBadge((Badge) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<PriceBlockDTO> prices = summaryDTO.getPrices();
        if (prices != null) {
            List<PriceBlockDTO> list2 = prices;
            arrayList2 = new ArrayList(C7714v.z(list2, 10));
            for (PriceBlockDTO priceBlockDTO : list2) {
                arrayList2.add(new PriceBlockVO(priceBlockDTO.getPrice(), priceBlockDTO.getTitle(), priceBlockDTO.getButton(), priceBlockDTO.getAtomPrice()));
            }
        } else {
            arrayList2 = null;
        }
        if (summaryDTO.getFooter() == null) {
            arrayList3 = arrayList2;
        } else if (arrayList2 != null) {
            arrayList3 = C7714v.q0(new FooterPriceBlockVO(summaryDTO.getFooter().getPrice(), summaryDTO.getFooter().getTitle()), arrayList2);
        }
        return new OrderTotalVO(hashCode, vo, arrayList, arrayList3);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, OrderTotalWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<OrderTotalDTO, d, List<OrderTotalVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }

    private final HeaderVO toVO(HeaderDTO headerDTO) {
        String icon = headerDTO.getIcon();
        TextAtom atomSubtitle = headerDTO.getAtomSubtitle();
        ButtonV3Atom.LargeBorderlessButton button = headerDTO.getButton();
        List<LineDTO> titleLines = headerDTO.getTitleLines();
        ArrayList arrayList = new ArrayList(C7714v.z(titleLines, 10));
        for (LineDTO lineDTO : titleLines) {
            arrayList.add(new LineVO(lineDTO.getPrice(), lineDTO.getTitle()));
        }
        return new HeaderVO(arrayList, atomSubtitle, button, icon);
    }
}
