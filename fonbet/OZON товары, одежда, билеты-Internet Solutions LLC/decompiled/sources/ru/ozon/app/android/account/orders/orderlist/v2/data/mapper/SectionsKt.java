package ru.ozon.app.android.account.orders.orderlist.v2.data.mapper;

import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.account.orders.orderlist.v2.data.dto.SectionDTO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.PaymentVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.ProductVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.SectionVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.StatusProviderVO;
import ru.ozon.app.android.account.orders.orderlist.v2.presentation.viewObject.TimerVO;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a \u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\f*\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\t\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0012*\u00020\u0013H\u0002¨\u0006\u0014"}, d2 = {"toVO", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/SectionVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO;", "context", "Landroid/content/Context;", "uniqueApplicationId", "", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/TimerVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Timer;", "toVo", "Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Status;", "", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/ProductVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$Product;", "transformToVO", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/PaymentVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$PaymentInfo;", "Lru/ozon/app/android/account/orders/orderlist/v2/presentation/viewObject/StatusProviderVO;", "Lru/ozon/app/android/account/orders/orderlist/v2/data/dto/SectionDTO$StatusProvider;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionsKt {
    @NotNull
    public static final SectionVO toVO(@NotNull SectionDTO sectionDTO, @NotNull Context context, @NotNull String uniqueApplicationId) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(sectionDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uniqueApplicationId, "uniqueApplicationId");
        String title = sectionDTO.getTitle();
        SectionDTO.Timer timer = sectionDTO.getTimer();
        TimerVO vo = timer != null ? toVO(timer) : null;
        SectionDTO.Status status = sectionDTO.getStatus();
        Badge vo2 = status != null ? toVo(status) : null;
        boolean z11 = sectionDTO.getTimer() != null;
        List<SectionDTO.Product> products = sectionDTO.getProducts();
        List<ProductVO> vo3 = products != null ? toVo(products, context) : null;
        SectionDTO.StatusProvider statusProvider = sectionDTO.getStatusProvider();
        StatusProviderVO vo4 = statusProvider != null ? toVO(statusProvider) : null;
        SectionDTO.PaymentInfo paymentInfo = sectionDTO.getPaymentInfo();
        PaymentVO transformToVO = paymentInfo != null ? transformToVO(paymentInfo, uniqueApplicationId) : null;
        List<ButtonV3Atom.SmallButton> buttons = sectionDTO.getButtons();
        List<ButtonV3Atom.SmallButton> list = (buttons == null || buttons.isEmpty()) ? null : buttons;
        List<AtomDTO> description = sectionDTO.getDescription();
        if (description != null) {
            List<AtomDTO> list2 = description;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
            for (Parcelable parcelable : list2) {
                if (parcelable instanceof Annotation) {
                    Annotation annotation = (Annotation) parcelable;
                    AtomDTO control = annotation.getControl();
                    Button button = control instanceof Button ? (Button) control : null;
                    if (button != null) {
                        parcelable = Annotation.copy$default(annotation, null, null, null, Button.copy$default(button, null, null, Button.Style.BORDERLESS_SMALL, null, null, null, null, 123, null), null, null, null, 119, null);
                    }
                }
                arrayList2.add(parcelable);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new SectionVO(title, vo2, arrayList, vo3, vo4, list, transformToVO, vo, z11, sectionDTO.getDeliveryInfo());
    }

    private static final Badge toVo(SectionDTO.Status status) {
        String color = status.getColor();
        return new Badge(status.getName(), null, null, null, color, status.getAction(), null, Badge.StyleType.STYLE_TYPE_DISCOUNT, null, null, null, null, status.getTrackingInfo(), 3904, null);
    }

    private static final int toVo$getSpanCount(Context context) {
        int intValue = ResourceExtKt.getDisplaySizePx(context).a().intValue();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.margin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.default_margin);
        return (intValue - ((dimensionPixelSize2 * 2) + (dimensionPixelSize * 2))) / (context.getResources().getDimensionPixelSize(ru.ozon.app.android.cs_orders.R$dimen.order_list_item_width) + dimensionPixelSize);
    }

    private static final PaymentVO transformToVO(SectionDTO.PaymentInfo paymentInfo, String str) {
        return new PaymentVO(paymentInfo.getLink(), U.j(new Pair("orderNumber", paymentInfo.getOrderNumber()), new Pair("deviceId", str)));
    }

    private static final List<ProductVO> toVo(List<SectionDTO.Product> list, Context context) {
        int vo$getSpanCount = toVo$getSpanCount(context);
        if (list.size() > vo$getSpanCount) {
            list = C7714v.K0(list, vo$getSpanCount);
        }
        List<SectionDTO.Product> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toVo((SectionDTO.Product) it.next()));
        }
        return arrayList;
    }

    private static final ProductVO toVo(SectionDTO.Product product) {
        return new ProductVO(product.getImage(), product.getDeeplink(), product.isAdult());
    }

    private static final TimerVO toVO(SectionDTO.Timer timer) {
        String title = timer.getTitle();
        DateTime m11 = new DateTime().m(timer.getTimeLeft());
        Intrinsics.checkNotNullExpressionValue(m11, "plusSeconds(...)");
        return new TimerVO(title, m11);
    }

    private static final StatusProviderVO toVO(SectionDTO.StatusProvider statusProvider) {
        return new StatusProviderVO(statusProvider.getImage(), statusProvider.getTitle(), statusProvider.getDeliveryName(), statusProvider.getStatus());
    }
}
