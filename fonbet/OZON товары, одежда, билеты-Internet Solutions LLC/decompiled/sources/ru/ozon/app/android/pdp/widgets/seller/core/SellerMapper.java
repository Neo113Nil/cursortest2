package ru.ozon.app.android.pdp.widgets.seller.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.pdp.widgets.seller.data.SellerDTO;
import ru.ozon.app.android.pdp.widgets.seller.presentation.SellerVO;
import ru.ozon.app.android.seller.sellerTag.data.SellerTagDTO;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/seller/core/SellerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/seller/data/SellerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/seller/data/SellerDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SellerMapper implements Function2<SellerDTO, d, List<? extends SellerVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerVO> invoke(@NotNull SellerDTO dto, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String banner = dto.getBanner();
        String logo = dto.getLogo();
        String valueOf = String.valueOf(h.E(dto.getName().getText()));
        Badge premiumBadge = dto.getPremiumBadge();
        TextAtom title = dto.getTitle();
        TextDTO dsTextAtom = title != null ? TextMapperKt.getDsTextAtom(title) : null;
        TextDTO dsTextAtom2 = TextMapperKt.getDsTextAtom(dto.getName());
        AtomActionDTO action = dto.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, dto.getTrackingInfo()) : null;
        List<SellerTagDTO> tags = dto.getTags();
        if (tags != null) {
            List<SellerTagDTO> list = tags;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            for (SellerTagDTO sellerTagDTO : list) {
                arrayList2.add(new SellerTagVO(sellerTagDTO.getIcon(), sellerTagDTO.getText(), AtomActionMapperKt.toAtomAction(sellerTagDTO.getAction(), sellerTagDTO.getTrackingInfo())));
                dsTextAtom = dsTextAtom;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        TextDTO textDTO = dsTextAtom;
        ButtonV3Atom.SmallButton askQuestionButton = dto.getAskQuestionButton();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells = dto.getCells();
        FavoriteProductMolecule favoriteButton = dto.getFavoriteButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new SellerVO(hashCode, banner, logo, valueOf, premiumBadge, textDTO, dsTextAtom2, atomAction, arrayList, askQuestionButton, cells, favoriteButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
