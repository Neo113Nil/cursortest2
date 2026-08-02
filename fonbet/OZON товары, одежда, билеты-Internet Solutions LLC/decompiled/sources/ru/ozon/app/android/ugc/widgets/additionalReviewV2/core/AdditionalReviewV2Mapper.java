package ru.ozon.app.android.ugc.widgets.additionalReviewV2.core;

import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.data.AdditionalReviewV2DTO;
import ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation.AdditionalReviewV2VO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.rating.RatingDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/additionalReviewV2/core/AdditionalReviewV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;", "widgetInfo", "Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "toVO", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO$HideButtonDTO;Ll20/d;)Lru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VO$HideButtonVO;", "state", "invoke", "(Lru/ozon/app/android/ugc/widgets/additionalReviewV2/data/AdditionalReviewV2DTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewV2Mapper implements Function2<AdditionalReviewV2DTO, d, List<? extends AdditionalReviewV2VO>> {
    private final AdditionalReviewV2VO.HideButtonVO toVO(AdditionalReviewV2DTO.HideButtonDTO hideButtonDTO, d dVar) {
        AtomAction atomAction;
        AtomActionDTO action;
        IconButtonV3DTO iconButton = hideButtonDTO.getIconButton();
        CommonControlSettings common = hideButtonDTO.getIconButton().getCommon();
        if (common == null || (action = common.getAction()) == null) {
            atomAction = null;
        } else {
            CommonControlSettings common2 = hideButtonDTO.getIconButton().getCommon();
            atomAction = AtomActionMapperKt.toAtomAction(action, common2 != null ? common2.getTrackingInfo() : null);
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = hideButtonDTO.getIconButton().getTrackingInfo();
        return new AdditionalReviewV2VO.HideButtonVO(iconButton, atomAction, trackingInfo != null ? x.d(trackingInfo, dVar) : null, hideButtonDTO.getTitle());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalReviewV2VO> invoke(@NotNull AdditionalReviewV2DTO state, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<AdditionalReviewV2DTO.ProductDTO> products = state.getProducts();
        ArrayList arrayList = new ArrayList(C7714v.z(products, 10));
        int i11 = 0;
        for (Object obj : products) {
            int i12 = i11 + 1;
            AdditionalReviewV2VO.HideButtonVO hideButtonVO = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AdditionalReviewV2DTO.ProductDTO productDTO = (AdditionalReviewV2DTO.ProductDTO) obj;
            long hashCode = (widgetInfo.d() + i11).hashCode();
            TextDTO title = productDTO.getTitle();
            IconDTO cornerIcon = productDTO.getCornerIcon();
            TextDTO subtitle = productDTO.getSubtitle();
            RatingDTO rating = productDTO.getRating();
            Map<String, TokenizedTrackingInfo> trackingInfo2 = productDTO.getTrackingInfo();
            t d11 = trackingInfo2 != null ? x.d(trackingInfo2, widgetInfo) : null;
            IconButtonV3DTO rightCornerButton = productDTO.getRightCornerButton();
            ImageDTO imageAtom = productDTO.getImageAtom();
            AtomActionDTO action = productDTO.getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, productDTO.getTrackingInfo()) : null;
            IconButtonV3DTO rightCornerButton2 = productDTO.getRightCornerButton();
            t b11 = (rightCornerButton2 == null || (trackingInfo = rightCornerButton2.getTrackingInfo()) == null) ? null : x.b(trackingInfo, Long.valueOf(hashCode), null);
            boolean z11 = i11 == 0;
            AdditionalReviewV2DTO.HideButtonDTO hideButton = productDTO.getHideButton();
            if (hideButton != null) {
                hideButtonVO = toVO(hideButton, widgetInfo);
            }
            arrayList.add(new AdditionalReviewV2VO(hashCode, title, cornerIcon, subtitle, rating, d11, rightCornerButton, b11, z11, imageAtom, atomAction, hideButtonVO));
            i11 = i12;
        }
        return arrayList;
    }
}
