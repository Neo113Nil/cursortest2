package ru.ozon.app.android.pdp.widgets.delivery.presentation;

import Sc.o;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.delivery.data.DeliveryDTO;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliveryAdapterItem;
import ru.ozon.app.android.pdp.widgets.delivery.presentation.DeliverySection;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.cell.BadgeTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0005H\u0000\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\r\u001a\u00020\t*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u000f\u001a\u00020\t*\u00020\u0010H\u0000\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0000\u001aL\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\t0\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001dH\u0000\u001a\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\t2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002\u001a\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020$2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020%2\u0006\u0010!\u001a\u00020\"H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"DP_8", "", "DP_16", "extractFooter", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryFooter;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO;", "extractHeader", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryHeader;", "sectionToVo", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection;", "", "id", "", "variantToVo", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$DeliveryVariant;", "atomCellToVo", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "pickupButtonToVo", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliverySection$Pickup;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupButton;", "pickupBadgeToVo", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupBadgeVO;", "Lru/ozon/app/android/pdp/widgets/delivery/data/DeliveryDTO$PickupBadge;", "toAdapterItems", "", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryAdapterItem;", CommentV3DTO.FOOTER_FIELD_NAME, CommentV3DTO.HEADER_FIELD_NAME, "pageType", "", "pageUrl", "asyncData", "extractAdapterItems", "isLastSection", "", "hasMoreButton", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/DeliveryVariantVO;", "Lru/ozon/app/android/pdp/widgets/delivery/presentation/PickupButtonWrapper;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VoKt {
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);

    @NotNull
    public static final DeliverySection atomCellToVo(@NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon cellWithSubtitle24Icon) {
        Intrinsics.checkNotNullParameter(cellWithSubtitle24Icon, "<this>");
        return new DeliverySection.AtomCell(cellWithSubtitle24Icon);
    }

    private static final List<DeliveryAdapterItem> extractAdapterItems(DeliverySection deliverySection, boolean z11, boolean z12) {
        List<DeliveryAdapterItem> extractAdapterItems;
        if (deliverySection instanceof DeliverySection.Variant) {
            extractAdapterItems = extractAdapterItems(((DeliverySection.Variant) deliverySection).getVariant(), z11);
        } else if (deliverySection instanceof DeliverySection.AtomCell) {
            extractAdapterItems = C7714v.a0(new DeliveryAdapterItem.CellSingleAtom(((DeliverySection.AtomCell) deliverySection).getCell()));
        } else {
            if (!(deliverySection instanceof DeliverySection.Pickup)) {
                throw new o();
            }
            extractAdapterItems = extractAdapterItems(((DeliverySection.Pickup) deliverySection).getPickupButton(), z11);
        }
        if (!z11 || z12) {
            return extractAdapterItems;
        }
        return C7714v.p0(C7714v.a0(new DeliveryAdapterItem.VerticalSpace(C7714v.Z(extractAdapterItems) instanceof DeliveryAdapterItem.Pickup ? DP_16 : DP_8)), extractAdapterItems);
    }

    public static final DeliveryFooter extractFooter(DeliveryDTO deliveryDTO) {
        ButtonV3Atom.SmallBorderlessButton moreInfoButton;
        if (deliveryDTO == null || (moreInfoButton = deliveryDTO.getMoreInfoButton()) == null) {
            return null;
        }
        return new DeliveryFooter(moreInfoButton);
    }

    @NotNull
    public static final DeliveryHeader extractHeader(@NotNull DeliveryDTO deliveryDTO) {
        Intrinsics.checkNotNullParameter(deliveryDTO, "<this>");
        TextAtom title = deliveryDTO.getTitle();
        return new DeliveryHeader(title != null ? TextMapperKt.getDsTextAtom(title) : null, deliveryDTO.getButton(), deliveryDTO.getAnnotation());
    }

    @NotNull
    public static final PickupBadgeVO pickupBadgeToVo(@NotNull DeliveryDTO.PickupBadge pickupBadge) {
        Intrinsics.checkNotNullParameter(pickupBadge, "<this>");
        TextAtom text = pickupBadge.getText();
        CommonCellSettings.LayoutPadding layoutPadding = CommonCellSettings.LayoutPadding.PADDING_300;
        CommonCellSettings.LayoutPadding layoutPadding2 = CommonCellSettings.LayoutPadding.PADDING_100;
        return new PickupBadgeVO(TextMapperKt.dsTextAtom$default(text, null, null, layoutPadding, layoutPadding, layoutPadding2, layoutPadding2, null, null, null, null, null, false, 4035, null), pickupBadge.getBackgroundColor());
    }

    @NotNull
    public static final DeliverySection.Pickup pickupButtonToVo(@NotNull DeliveryDTO.PickupButton pickupButton, long j11) {
        Intrinsics.checkNotNullParameter(pickupButton, "<this>");
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(pickupButton.getAction(), pickupButton.getTrackingInfo());
        Map<String, TokenizedTrackingInfo> trackingInfo = pickupButton.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(pickupButton.getTitle());
        TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(pickupButton.getSubtitle());
        DeliveryDTO.PickupBadge pickupBadge = pickupButton.getPickupBadge();
        return new DeliverySection.Pickup(new PickupButtonWrapper(new PickupButtonVo(dsTextAtom, dsTextAtom2, pickupBadge != null ? pickupBadgeToVo(pickupBadge) : null, pickupButton.getIcon(), pickupButton.getIconTintColor(), pickupButton.getBackgroundColor()), atomAction, mapToTokenizedEvent$default));
    }

    public static final DeliverySection sectionToVo(@NotNull Object obj, long j11) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof DeliveryDTO.DeliveryVariant) {
            return variantToVo((DeliveryDTO.DeliveryVariant) obj, j11);
        }
        if (obj instanceof CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) {
            return atomCellToVo((CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon) obj);
        }
        if (obj instanceof DeliveryDTO.PickupButton) {
            return pickupButtonToVo((DeliveryDTO.PickupButton) obj, j11);
        }
        if (!(obj instanceof BadgeTitleSubtitleCellDTO)) {
            return null;
        }
        ((BadgeTitleSubtitleCellDTO) obj).getTitle().setTagSupported(true);
        return new DeliverySection.AtomCell((AtomDTO) obj);
    }

    @NotNull
    public static final List<DeliveryAdapterItem> toAdapterItems(@NotNull List<? extends DeliverySection> list, DeliveryFooter deliveryFooter, DeliveryHeader deliveryHeader, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            if (Intrinsics.d(str, "pdp") && str3 != null) {
                if (str2 == null) {
                    str2 = "";
                }
                if (!h.t(str2, "apparel-size", false)) {
                    return C7714v.a0(DeliveryAdapterItem.Placeholder.INSTANCE);
                }
            }
            return K.f71697a;
        }
        ArrayList arrayList = new ArrayList();
        if (deliveryHeader != null) {
            arrayList.add(new DeliveryAdapterItem.MainHeader(deliveryHeader));
        }
        boolean z11 = (deliveryFooter != null ? deliveryFooter.getMoreInfoButton() : null) != null;
        List<? extends DeliverySection> list2 = list;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList2.add(extractAdapterItems((DeliverySection) obj, i11 == size + (-1), z11));
            i11 = i12;
        }
        C7714v.p(C7714v.N(arrayList2), arrayList);
        if (deliveryFooter != null) {
            arrayList.add(new DeliveryAdapterItem.Footer(deliveryFooter));
        }
        return arrayList;
    }

    @NotNull
    public static final DeliverySection variantToVo(@NotNull DeliveryDTO.DeliveryVariant deliveryVariant, long j11) {
        Intrinsics.checkNotNullParameter(deliveryVariant, "<this>");
        String icon = deliveryVariant.getIcon();
        String iconTintColor = deliveryVariant.getIconTintColor();
        TextAtom title = deliveryVariant.getTitle();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells = deliveryVariant.getCells();
        Map<String, TokenizedTrackingInfo> trackingInfo = deliveryVariant.getTrackingInfo();
        return new DeliverySection.Variant(new DeliveryVariantVO(j11, icon, iconTintColor, title, cells, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null));
    }

    private static final List<DeliveryAdapterItem> extractAdapterItems(DeliveryVariantVO deliveryVariantVO, boolean z11) {
        ArrayList arrayList = new ArrayList();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells = deliveryVariantVO.getCells();
        ArrayList arrayList2 = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList2.add(new DeliveryAdapterItem.CellDefault((CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) it.next()));
        }
        C7714v.p(arrayList2, arrayList);
        if (!z11) {
            arrayList.add(DeliveryAdapterItem.Separator.INSTANCE);
        }
        return arrayList;
    }

    private static final List<DeliveryAdapterItem> extractAdapterItems(PickupButtonWrapper pickupButtonWrapper, boolean z11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DeliveryAdapterItem.Pickup(pickupButtonWrapper));
        if (!z11) {
            arrayList.add(DeliveryAdapterItem.Separator.INSTANCE);
        }
        return arrayList;
    }
}
