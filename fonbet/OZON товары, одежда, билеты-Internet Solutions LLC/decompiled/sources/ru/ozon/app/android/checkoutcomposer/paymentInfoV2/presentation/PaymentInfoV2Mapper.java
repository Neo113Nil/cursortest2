package ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.data.PaymentInfoV2DTO;
import ru.ozon.app.android.checkoutcomposer.paymentInfoV2.presentation.PaymentInfoV2VO;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO$Payment;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO$Payment;)Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO$Payment$StyleType;", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO$Payment$StyleType;)Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$Payment$StyleType;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "disableAutoToggle", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "", "element", "Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "mapDynamicElementToVO", "(Ljava/lang/Object;)Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/presentation/PaymentInfoV2VO$DynamicElementVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/paymentInfoV2/data/PaymentInfoV2DTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentInfoV2Mapper implements Function2<PaymentInfoV2DTO, d, List<? extends PaymentInfoV2VO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentInfoV2DTO.Payment.StyleType.values().length];
            try {
                iArr[PaymentInfoV2DTO.Payment.StyleType.STYLE_TYPE_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentInfoV2DTO.Payment.StyleType.STYLE_TYPE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final CheckoutCellListDTO disableAutoToggle(CheckoutCellListDTO checkoutCellListDTO) {
        List<CellDTO> cells = checkoutCellListDTO.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        for (CellDTO cellDTO : cells) {
            CellDTO.Settings settings = cellDTO.getSettings();
            arrayList.add(CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null));
        }
        return CheckoutCellListDTO.copy$default(checkoutCellListDTO, arrayList, null, null, null, null, null, 62, null);
    }

    private final PaymentInfoV2VO.DynamicElementVO mapDynamicElementToVO(Object element) {
        if (element instanceof PaymentInfoV2DTO.Separator) {
            return PaymentInfoV2VO.DynamicElementVO.Separator.INSTANCE;
        }
        if (element instanceof PaymentInfoV2DTO.VerticalSpacer) {
            return new PaymentInfoV2VO.DynamicElementVO.VerticalSpacer(((PaymentInfoV2DTO.VerticalSpacer) element).getSpacing());
        }
        if (element instanceof CheckoutCellListDTO) {
            return new PaymentInfoV2VO.DynamicElementVO.CheckoutCellList(disableAutoToggle((CheckoutCellListDTO) element));
        }
        if (element instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) {
            return new PaymentInfoV2VO.DynamicElementVO.CellWithSubtitleCheckboxRadio((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) element);
        }
        if (element instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle) {
            return new PaymentInfoV2VO.DynamicElementVO.CellWithSubtitleToggle((CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle) element, null, 2, null);
        }
        if (element instanceof ButtonV3DTO) {
            return new PaymentInfoV2VO.DynamicElementVO.Button((ButtonV3DTO) element);
        }
        if (element instanceof AtomDTO) {
            return new PaymentInfoV2VO.DynamicElementVO.Atom((AtomDTO) element);
        }
        throw new IllegalArgumentException("Wrong dynamic element: " + N.b(element.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    private final PaymentInfoV2VO toVO(PaymentInfoV2DTO paymentInfoV2DTO, String str) {
        ArrayList arrayList;
        List list;
        long hashCode = str.hashCode();
        TextAtom title = paymentInfoV2DTO.getTitle();
        ButtonV3Atom.SmallButton titleButton = paymentInfoV2DTO.getTitleButton();
        List<PaymentInfoV2DTO.Payment> payments = paymentInfoV2DTO.getPayments();
        if (payments != null) {
            List<PaymentInfoV2DTO.Payment> list2 = payments;
            arrayList = new ArrayList(C7714v.z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((PaymentInfoV2DTO.Payment) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<Object> elements = paymentInfoV2DTO.getElements();
        if (elements != null) {
            List<Object> list3 = elements;
            list = new ArrayList(C7714v.z(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                list.add(mapDynamicElementToVO(it2.next()));
            }
        } else {
            list = K.f71697a;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = paymentInfoV2DTO.getTrackingInfo();
        return new PaymentInfoV2VO(hashCode, title, titleButton, arrayList, list, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PaymentInfoV2VO> invoke(@NotNull PaymentInfoV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }

    private final PaymentInfoV2VO.Payment toVO(PaymentInfoV2DTO.Payment payment) {
        PaymentInfoV2VO.Payment.StyleType styleType;
        TextAtom title = payment.getTitle();
        String icon = payment.getIcon();
        String iconRight = payment.getIconRight();
        String background = payment.getBackground();
        String backgroundColor = payment.getBackgroundColor();
        PaymentInfoV2DTO.Payment.StyleType type = payment.getType();
        if (type == null || (styleType = toVO(type)) == null) {
            styleType = PaymentInfoV2VO.Payment.StyleType.STYLE_TYPE_DEFAULT;
        }
        AtomActionDTO action = payment.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, payment.getTrackingInfo()) : null;
        Boolean isSelected = payment.isSelected();
        return new PaymentInfoV2VO.Payment(title, icon, iconRight, background, backgroundColor, styleType, atomAction, isSelected != null ? isSelected.booleanValue() : false, payment.getPromoteLabel(), payment.getAutomatizationDescription());
    }

    private final PaymentInfoV2VO.Payment.StyleType toVO(PaymentInfoV2DTO.Payment.StyleType styleType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[styleType.ordinal()];
        if (i11 == 1) {
            return PaymentInfoV2VO.Payment.StyleType.STYLE_TYPE_DEFAULT;
        }
        if (i11 == 2) {
            return PaymentInfoV2VO.Payment.StyleType.STYLE_TYPE_CARD;
        }
        throw new o();
    }
}
