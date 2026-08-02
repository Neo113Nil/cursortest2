package ru.ozon.app.android.pdp.widgets.deliveryV6.core.sections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.PickupButtonVo;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.VoKt;
import ru.ozon.app.android.pdp.widgets.deliveryV6.presentation.sections.adapter.DeliveryV6SectionItem;
import ru.ozon.app.android.pdp.widgets.sellerV4.presentation.SellerV4DisclosureViewFactory;
import ru.ozon.app.android.uikit.view.discount.ProgressiveDiscountViewKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"map", "", "Lru/ozon/app/android/pdp/widgets/deliveryV6/presentation/sections/adapter/DeliveryV6SectionItem;", "", "id", "", "hasMoreInfoButton", "", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeliveryV6SectionsMapperKt {
    @NotNull
    public static final List<DeliveryV6SectionItem> map(@NotNull List<? extends Object> list, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            boolean z12 = C7714v.Q(i12, list) instanceof DeliveryDTO.PickupButton;
            if (obj instanceof DeliveryDTO.DeliveryVariant) {
                DeliveryDTO.DeliveryVariant deliveryVariant = (DeliveryDTO.DeliveryVariant) obj;
                if (deliveryVariant.getIcon() != null && deliveryVariant.getIconTintColor() != null && deliveryVariant.getTitle() != null) {
                    arrayList.add(new DeliveryV6SectionItem.SectionHeader(deliveryVariant.getIcon(), deliveryVariant.getIconTintColor(), TextMapperKt.getDsTextAtom(deliveryVariant.getTitle())));
                }
                int i13 = 0;
                for (Object obj2 : deliveryVariant.getCells()) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault = (CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) obj2;
                    Map<String, TokenizedTrackingInfo> trackingInfo = deliveryVariant.getTrackingInfo();
                    arrayList.add(new DeliveryV6SectionItem.CellDefault(cellWithSubtitleDefault, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null));
                    if (i13 == deliveryVariant.getCells().size() - 1 && i11 != list.size() - 1 && !z12) {
                        arrayList.add(DeliveryV6SectionItem.Separator.INSTANCE);
                    }
                    i13 = i14;
                }
            } else if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) {
                arrayList.add(new DeliveryV6SectionItem.CellSingleAtom((AtomDTO) obj));
            } else if (obj instanceof DeliveryDTO.PickupButton) {
                DeliveryDTO.PickupButton pickupButton = (DeliveryDTO.PickupButton) obj;
                TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(pickupButton.getTitle());
                TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(pickupButton.getSubtitle());
                DeliveryDTO.PickupBadge pickupBadge = pickupButton.getPickupBadge();
                PickupButtonVo pickupButtonVo = new PickupButtonVo(dsTextAtom, dsTextAtom2, pickupBadge != null ? VoKt.pickupBadgeToVo(pickupBadge) : null, pickupButton.getIcon(), pickupButton.getIconTintColor(), pickupButton.getBackgroundColor());
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(pickupButton.getAction(), pickupButton.getTrackingInfo());
                Map<String, TokenizedTrackingInfo> trackingInfo2 = pickupButton.getTrackingInfo();
                arrayList.add(new DeliveryV6SectionItem.Pickup(pickupButtonVo, atomAction, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null));
            } else if (obj instanceof BadgeTitleSubtitleCellDTO) {
                ((BadgeTitleSubtitleCellDTO) obj).getTitle().setTagSupported(true);
                arrayList.add(new DeliveryV6SectionItem.CellSingleAtom((AtomDTO) obj));
            }
            if (i11 == list.size() - 1 && !z11) {
                arrayList.add(new DeliveryV6SectionItem.VerticalSpace(C7714v.Z(list) instanceof DeliveryAdapterItem.Pickup ? SellerV4DisclosureViewFactory.INSTANCE.getDp16() : ProgressiveDiscountViewKt.getDp8()));
            }
            i11 = i12;
        }
        return arrayList;
    }
}
