package ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.core;

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
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.data.SellerTransparencyProfileDTO;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyProfile.presentation.SellerTransparencyProfileVO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.IconLabelButtonDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0013B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\t*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/core/SellerTransparencyProfileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/presentation/SellerTransparencyProfileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;", "", "index", "toVO", "(Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;I)Lru/ozon/uni/atoms/data/controls/button/IconLabelButtonDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/sellerTransparencyProfile/data/SellerTransparencyProfileDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SellerTransparencyProfileMapper implements Function2<SellerTransparencyProfileDTO, d, List<? extends SellerTransparencyProfileVO>> {

    @NotNull
    private static final String TRUST_FACTOR_TITLE = "trustFactorTitle";

    @NotNull
    private static final String TRUST_FACTOR_SUBTITLE = "trustFactorSubtitle";

    private final IconLabelButtonDTO toVO(IconLabelButtonDTO iconLabelButtonDTO, int i11) {
        CommonAtomLabelDTO commonAtomLabelDTO;
        CommonAtomLabelDTO copy$default = CommonAtomLabelDTO.copy$default(iconLabelButtonDTO.getTitle(), null, null, null, null, null, null, null, false, new TestInfo(TRUST_FACTOR_TITLE + i11), 255, null);
        CommonAtomLabelDTO subtitle = iconLabelButtonDTO.getSubtitle();
        if (subtitle != null) {
            commonAtomLabelDTO = CommonAtomLabelDTO.copy$default(subtitle, null, null, null, null, null, null, null, false, new TestInfo(TRUST_FACTOR_SUBTITLE + i11), 255, null);
        } else {
            commonAtomLabelDTO = null;
        }
        return IconLabelButtonDTO.copy$default(iconLabelButtonDTO, null, null, null, copy$default, commonAtomLabelDTO, null, null, null, 231, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SellerTransparencyProfileVO> invoke(@NotNull SellerTransparencyProfileDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        IconDTO avatar = state.getAvatar();
        SellerTransparencyProfileDTO.StatisticsItem subscribers = state.getSubscribers();
        SellerTransparencyProfileDTO.StatisticsItem reviews = state.getReviews();
        SwitchingButton subscribe = state.getSubscribe();
        IconButtonDTO share = state.getShare();
        TextAtom sellerName = state.getSellerName();
        List<IconLabelButtonDTO> trustFactors = state.getTrustFactors();
        if (trustFactors != null) {
            List<IconLabelButtonDTO> list = trustFactors;
            arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                arrayList.add(toVO((IconLabelButtonDTO) obj, i11));
                i11 = i12;
            }
        } else {
            arrayList = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new SellerTransparencyProfileVO(hashCode, avatar, subscribers, reviews, subscribe, share, sellerName, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getTrackingInfo()));
    }
}
