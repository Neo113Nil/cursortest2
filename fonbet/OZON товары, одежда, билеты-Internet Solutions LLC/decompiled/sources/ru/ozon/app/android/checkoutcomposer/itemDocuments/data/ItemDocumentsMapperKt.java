package ru.ozon.app.android.checkoutcomposer.itemDocuments.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.itemDocuments.data.ItemDocumentsDTO;
import ru.ozon.app.android.checkoutcomposer.itemDocuments.presentation.ItemDocumentsVO;
import ru.ozon.app.android.checkoutgeo.checkout.data.Paddings;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO;Ll20/d;)Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO;", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO$DocumentDTO;", "Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;", "(Lru/ozon/app/android/checkoutcomposer/itemDocuments/data/ItemDocumentsDTO$DocumentDTO;)Lru/ozon/app/android/checkoutcomposer/itemDocuments/presentation/ItemDocumentsVO$DocumentVO;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ItemDocumentsMapperKt {
    @NotNull
    public static final ItemDocumentsVO toVO(@NotNull ItemDocumentsDTO itemDocumentsDTO, @NotNull d info) {
        ArrayList arrayList;
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(itemDocumentsDTO, "<this>");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        TextDTO title = itemDocumentsDTO.getTitle();
        TextDTO subtitle = itemDocumentsDTO.getSubtitle();
        IconButtonV3DTO rightIcon = itemDocumentsDTO.getRightIcon();
        List<ItemDocumentsDTO.DocumentDTO> documents = itemDocumentsDTO.getDocuments();
        if (documents != null) {
            List<ItemDocumentsDTO.DocumentDTO> list = documents;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toVO((ItemDocumentsDTO.DocumentDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        CellDTO warning = itemDocumentsDTO.getWarning();
        TextDTO infoText = itemDocumentsDTO.getInfoText();
        if (infoText != null) {
            infoText.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = infoText;
        } else {
            textDTO = null;
        }
        Paddings paddings = itemDocumentsDTO.getPaddings();
        Map<String, TokenizedTrackingInfo> trackingInfo = itemDocumentsDTO.getTrackingInfo();
        return new ItemDocumentsVO(hashCode, title, subtitle, rightIcon, arrayList, warning, textDTO, paddings, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    private static final ItemDocumentsVO.DocumentVO toVO(ItemDocumentsDTO.DocumentDTO documentDTO) {
        CommonControlSettings common;
        AtomActionDTO action;
        TextDTO text = documentDTO.getText();
        TextDTO subtext = documentDTO.getSubtext();
        AspectDTO aspect = documentDTO.getAspect();
        AspectDTO aspect2 = documentDTO.getAspect();
        AtomAction atomAction = null;
        atomAction = null;
        atomAction = null;
        if (aspect2 != null && (common = aspect2.getCommon()) != null && (action = common.getAction()) != null) {
            CommonControlSettings common2 = documentDTO.getAspect().getCommon();
            atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        }
        return new ItemDocumentsVO.DocumentVO(text, subtext, aspect, atomAction);
    }
}
