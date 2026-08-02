package ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTO;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.data.FormBuilderDTOKt;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.SplitDynamicElementsAdapter;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.app.android.common.progressivemolecula.core.ExtentionsKt;
import ru.ozon.app.android.common.progressivemolecula.data.ProgressiveTextWidgetDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toDynamicElementVO", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/SplitDynamicElementVO;", "", "context", "Landroid/content/Context;", "isAutoToggleDisabled", "", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SplitDynamicElementsDTOKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r2.equals(ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_CHECKBOX_RADIO) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ee, code lost:
    
        r3 = ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.SplitDynamicElementsAdapter.ElementType.CELL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if ((r31 instanceof ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
    
        r6 = (ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fc, code lost:
    
        if (r6 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fe, code lost:
    
        r5 = r6.copy((r32 & 1) != 0 ? r6.isSelected : false, (r32 & 2) != 0 ? r6.isRadio : false, (r32 & 4) != 0 ? r6.isAutoToggleDisabled : r33, (r32 & 8) != 0 ? r6.title : null, (r32 & 16) != 0 ? r6.titleColor : null, (r32 & 32) != 0 ? r6.subtitle : null, (r32 & 64) != 0 ? r6.subtitleColor : null, (r32 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r6.align : null, (r32 & 256) != 0 ? r6.maxLines : null, (r32 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r6.action : null, (r32 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r6.hideSeparator : false, (r32 & 2048) != 0 ? r6.colorDisabledAsEnabled : false, (r32 & 4096) != 0 ? r6.context : null, (r32 & 8192) != 0 ? r6.testInfo : null, (r32 & 16384) != 0 ? r6.trackingInfo : null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011c, code lost:
    
        if (r5 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0159, code lost:
    
        return new ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO.AtomElement(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        if ((r31 instanceof ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
    
        r4 = (ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter) r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0127, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0128, code lost:
    
        if (r6 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012a, code lost:
    
        r1 = ru.ozon.app.android.atoms.data.cells.CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter.copy$default(r6, false, null, null, null, null, null, null, null, null, r33, null, null, null, null, null, null, null, false, false, null, null, null, 4193791, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r2.equals("cellWithSubtitle24Icon") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r2.equals(ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_24_ICON_TOGGLE_COUNTER) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
    
        if (r2.equals(ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_CHECKBOX_RADIO) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        if (r2.equals(ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_VALUE) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e4, code lost:
    
        if (r2.equals(ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO.CELL_WITH_SUBTITLE_DEFAULT) == false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SplitDynamicElementVO toDynamicElementVO(@NotNull Object obj, @NotNull Context context, boolean z11) {
        SplitDynamicElementVO.TagListElement.Tooltip tooltip;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (obj instanceof DynamicElementDTO.LogosCarouselDTO) {
            SplitDynamicElementsAdapter.ElementType elementType = SplitDynamicElementsAdapter.ElementType.SELECTOR;
            DynamicElementDTO.LogosCarouselDTO logosCarouselDTO = (DynamicElementDTO.LogosCarouselDTO) obj;
            List<DynamicElementDTO.LogosCarouselDTO.LogosElement> elements = logosCarouselDTO.getElements();
            ArrayList arrayList = new ArrayList(C7714v.z(elements, 10));
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                arrayList.add(((DynamicElementDTO.LogosCarouselDTO.LogosElement) it.next()).toVO());
            }
            return new SplitDynamicElementVO.LogosCarousel(elementType, arrayList, logosCarouselDTO.getScrollPosition());
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24IconToggleCounter cellWithSubtitle24IconToggleCounter = null;
        if (!(obj instanceof AtomDTO)) {
            int i11 = 0;
            if (obj instanceof FormBuilderDTO) {
                return new SplitDynamicElementVO.Form(SplitDynamicElementsAdapter.ElementType.FORM, FormBuilderDTOKt.toVO$default((FormBuilderDTO) obj, null, false, 3, null));
            }
            if (obj instanceof DynamicElementDTO.VerticalSpacerDTO) {
                return new SplitDynamicElementVO.VerticalSpacer(SplitDynamicElementsAdapter.ElementType.VERTICAL_SPACER, ((DynamicElementDTO.VerticalSpacerDTO) obj).getSpacing());
            }
            if (obj instanceof DynamicElementDTO.SeparatorDTO) {
                DynamicElementDTO.SeparatorDTO separatorDTO = (DynamicElementDTO.SeparatorDTO) obj;
                return new SplitDynamicElementVO.Separator(SplitDynamicElementsAdapter.ElementType.SEPARATOR, StyleParser.INSTANCE.parseColor(context, separatorDTO.getColor(), R$color.graphic_neutral), separatorDTO.getLeftInset(), separatorDTO.getRightInset());
            }
            if (obj instanceof ProgressiveTextWidgetDTO.ProgressiveTextDTO) {
                return new SplitDynamicElementVO.ProgressiveTextElement(SplitDynamicElementsAdapter.ElementType.PROGRESSIVE_TEXT, ExtentionsKt.toVO((ProgressiveTextWidgetDTO.ProgressiveTextDTO) obj, r0.hashCode()));
            }
            if (obj instanceof DynamicElementDTO.ProductsBlockDTO) {
                SplitDynamicElementsAdapter.ElementType elementType2 = SplitDynamicElementsAdapter.ElementType.PRODUCTS_BLOCK;
                DynamicElementDTO.ProductsBlockDTO productsBlockDTO = (DynamicElementDTO.ProductsBlockDTO) obj;
                TextDTO title = productsBlockDTO.getTitle();
                TextDTO subtitle = productsBlockDTO.getSubtitle();
                BadgeDTO badge = productsBlockDTO.getBadge();
                List<DynamicElementDTO.ProductsBlockDTO.PromotedProduct> promotedProducts = productsBlockDTO.getPromotedProducts();
                if (promotedProducts == null) {
                    promotedProducts = K.f71697a;
                }
                return new SplitDynamicElementVO.ProductsBlock(elementType2, title, subtitle, badge, promotedProducts, productsBlockDTO.getAction(), productsBlockDTO.getTrackingInfo());
            }
            if (obj instanceof CheckoutCellListDTO) {
                return new SplitDynamicElementVO.CheckoutCellListElement(SplitDynamicElementsAdapter.ElementType.CHECKOUT_CELL_LIST, (CheckoutCellListDTO) obj);
            }
            if (!(obj instanceof DynamicElementDTO.TagListDTO)) {
                return null;
            }
            SplitDynamicElementsAdapter.ElementType elementType3 = SplitDynamicElementsAdapter.ElementType.TAG_LIST;
            DynamicElementDTO.TagListDTO tagListDTO = (DynamicElementDTO.TagListDTO) obj;
            List<TagButtonDTO> buttons = tagListDTO.getButtons();
            ArrayList arrayList2 = new ArrayList(C7714v.z(buttons, 10));
            for (Object obj2 : buttons) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                TagButtonDTO tagButtonDTO = (TagButtonDTO) obj2;
                DynamicElementDTO.TagListDTO.Tooltip tooltip2 = tagListDTO.getTooltip();
                if (tooltip2 != null) {
                    if (tooltip2.getIndex() != i11) {
                        tooltip2 = null;
                    }
                    if (tooltip2 != null) {
                        tooltip = tooltip2.toVO();
                        arrayList2.add(new SplitDynamicElementVO.TagListElement.TagItem(tagButtonDTO, tooltip));
                        i11 = i12;
                    }
                }
                tooltip = null;
                arrayList2.add(new SplitDynamicElementVO.TagListElement.TagItem(tagButtonDTO, tooltip));
                i11 = i12;
            }
            return new SplitDynamicElementVO.TagListElement(elementType3, arrayList2);
        }
        AtomDTO atomDTO = (AtomDTO) obj;
        String value = atomDTO.getType().getValue();
        switch (value.hashCode()) {
            case -1275778911:
                break;
            case -914424879:
                break;
            case -771623848:
                break;
            case -189690771:
                break;
            case 3049826:
                if (value.equals("cell")) {
                    SplitDynamicElementsAdapter.ElementType elementType4 = SplitDynamicElementsAdapter.ElementType.CELL;
                    CellDTO cellDTO = obj instanceof CellDTO ? (CellDTO) obj : null;
                    if (cellDTO != null) {
                        CellDTO.Settings settings = ((CellDTO) obj).getSettings();
                        CellDTO copy$default = CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.valueOf(z11), null, 1535, null) : null, null, null, null, 29, null);
                        if (copy$default != null) {
                            atomDTO = copy$default;
                        }
                    }
                    return new SplitDynamicElementVO.AtomElement(elementType4, atomDTO);
                }
                return new SplitDynamicElementVO.AtomElement(SplitDynamicElementsAdapter.ElementType.ATOM, atomDTO);
            case 644332379:
                break;
            case 1178987101:
                break;
            default:
                return new SplitDynamicElementVO.AtomElement(SplitDynamicElementsAdapter.ElementType.ATOM, atomDTO);
        }
    }

    public static /* synthetic */ SplitDynamicElementVO toDynamicElementVO$default(Object obj, Context context, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return toDynamicElementVO(obj, context, z11);
    }
}
