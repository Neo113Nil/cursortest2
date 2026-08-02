package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.posting;

import Ej.b;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.common.progressivemolecula.core.ExtentionsKt;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.app.android.common.progressivemolecula.presentation.ProgressiveTextWidgetVO;
import ru.ozon.app.android.orderdetails.R$integer;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.data.OrderShipmentItemDTO;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.OrderShipmentItemVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\b\u0001\u0018\u0000 &2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001&B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0005*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/posting/PostingOrderShipmentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/account/adult/presenter/AdultHandler;)V", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingsDTO;", "item", "mapDTOtoVO", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingsDTO;)Ljava/util/List;", "", "getPostingColumnCount", "()I", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO;", "toVO", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO;)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/OrderShipmentItemVO$PostingVO;", "", "getId", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO$PostingDTO;)J", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/data/OrderShipmentItemDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "postingColumnCount", "I", "maxVisibleItems", "itemSize", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostingOrderShipmentMapper implements Function2<OrderShipmentItemDTO, d, List<? extends OrderShipmentItemVO.PostingVO>> {

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final Context context;
    private int itemSize;
    private final int maxVisibleItems;
    private final int postingColumnCount;
    public static final int $stable = 8;

    public PostingOrderShipmentMapper(@NotNull Context context, @NotNull AdultHandler adultHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        this.context = context;
        this.adultHandler = adultHandler;
        int postingColumnCount = getPostingColumnCount();
        this.postingColumnCount = postingColumnCount;
        this.maxVisibleItems = postingColumnCount * 3;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        this.itemSize = (displayMetrics.widthPixels - ResourceExtKt.toPx(50)) / postingColumnCount;
    }

    private final long getId(OrderShipmentItemDTO.PostingDTO postingDTO) {
        String title = postingDTO.getTitle();
        int hashCode = title != null ? title.hashCode() : 0;
        String trackDeliveryTitle = postingDTO.getTrackDeliveryTitle();
        int hashCode2 = hashCode + (trackDeliveryTitle != null ? trackDeliveryTitle.hashCode() : 0);
        AtomActionDTO action = postingDTO.getAction();
        int hashCode3 = hashCode2 + (action != null ? action.hashCode() : 0);
        Map<String, TokenizedTrackingInfo> trackingInfo = postingDTO.getTrackingInfo();
        int hashCode4 = hashCode3 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
        for (OrderShipmentItemDTO.ShipmentProductDTO shipmentProductDTO : postingDTO.getProducts()) {
            hashCode4 = Boolean.hashCode(shipmentProductDTO.isAdult()) + shipmentProductDTO.getImage().hashCode() + hashCode4;
        }
        return hashCode4;
    }

    private final int getPostingColumnCount() {
        try {
            return this.context.getResources().getInteger(R$integer.order_posting_column_count);
        } catch (Resources.NotFoundException unused) {
            return 4;
        }
    }

    private final List<OrderShipmentItemVO.PostingVO> mapDTOtoVO(OrderShipmentItemDTO.PostingsDTO item) {
        List<OrderShipmentItemDTO.PostingDTO> postings = item.getPostings();
        ArrayList arrayList = new ArrayList(C7714v.z(postings, 10));
        Iterator<T> it = postings.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((OrderShipmentItemDTO.PostingDTO) it.next()));
        }
        return arrayList;
    }

    private final OrderShipmentItemVO.PostingVO toVO(OrderShipmentItemDTO.PostingDTO postingDTO) {
        ArrayList arrayList;
        int size = postingDTO.getProducts().size();
        boolean isUserAnAdult = this.adultHandler.isUserAnAdult();
        if (size > this.maxVisibleItems) {
            List<OrderShipmentItemDTO.ShipmentProductDTO> subList = postingDTO.getProducts().subList(0, this.maxVisibleItems - 1);
            ArrayList arrayList2 = new ArrayList(C7714v.z(subList, 10));
            for (OrderShipmentItemDTO.ShipmentProductDTO shipmentProductDTO : subList) {
                arrayList2.add(new OrderShipmentItemVO.PostingItemVO.PostingProductVO(shipmentProductDTO.getImage(), shipmentProductDTO.isAdult() && !isUserAnAdult));
            }
            ArrayList W02 = C7714v.W0(arrayList2);
            W02.add(new OrderShipmentItemVO.PostingItemVO.PostingMoreProductVO(b.a(size - this.maxVisibleItems, "+")));
            arrayList = W02;
        } else {
            List<OrderShipmentItemDTO.ShipmentProductDTO> products = postingDTO.getProducts();
            ArrayList arrayList3 = new ArrayList(C7714v.z(products, 10));
            for (OrderShipmentItemDTO.ShipmentProductDTO shipmentProductDTO2 : products) {
                arrayList3.add(new OrderShipmentItemVO.PostingItemVO.PostingProductVO(shipmentProductDTO2.getImage(), shipmentProductDTO2.isAdult() && !isUserAnAdult));
            }
            arrayList = arrayList3;
        }
        long id2 = getId(postingDTO);
        String title = postingDTO.getTitle();
        String trackDeliveryTitle = postingDTO.getTrackDeliveryTitle();
        OrderShipmentItemDTO.PostingDTO.ShareButton shareButton = postingDTO.getShareButton();
        ButtonV3Atom.SmallBorderlessButton button = shareButton != null ? shareButton.getButton() : null;
        ProgressiveTextWidgetDTO.ProgressiveTextDTO progressiveText = postingDTO.getProgressiveText();
        ProgressiveTextWidgetVO.ProgressiveTextVO vo = progressiveText != null ? ExtentionsKt.toVO(progressiveText, getId(postingDTO)) : null;
        AtomActionDTO action = postingDTO.getAction();
        return new OrderShipmentItemVO.PostingVO(id2, title, trackDeliveryTitle, button, vo, arrayList, action != null ? AtomActionMapperKt.toAtomAction(action, postingDTO.getTrackingInfo()) : null, this.itemSize, this.postingColumnCount);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OrderShipmentItemVO.PostingVO> invoke(@NotNull OrderShipmentItemDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return state instanceof OrderShipmentItemDTO.PostingsDTO ? mapDTOtoVO((OrderShipmentItemDTO.PostingsDTO) state) : K.f71697a;
    }
}
