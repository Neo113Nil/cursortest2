package ru.ozon.app.android.common.filterWidgets.filters.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.filterWidgets.filters.data.FiltersDTO;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects.BrandAspectsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000¨\u0006\b"}, d2 = {"toVO", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsVO;", "Lru/ozon/app/android/common/filterWidgets/filters/data/BrandAspectsModel;", "id", "", "toLargeBorderlessButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeBorderlessButton;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandAspectsModelKt {
    @NotNull
    public static final ButtonV3Atom.LargeBorderlessButton toLargeBorderlessButton(@NotNull ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(buttonV3DTO, "<this>");
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(buttonV3DTO.getTitle());
        CommonControlSettings common = buttonV3DTO.getCommon();
        AtomActionDTO action = common != null ? common.getAction() : null;
        CommonControlSettings common2 = buttonV3DTO.getCommon();
        TestInfo testInfo = common2 != null ? common2.getTestInfo() : null;
        CommonControlSettings common3 = buttonV3DTO.getCommon();
        return new ButtonV3Atom.LargeBorderlessButton(ozonSpannableString, action, null, null, testInfo, common3 != null ? common3.getTrackingInfo() : null, 12, null);
    }

    @NotNull
    public static final BrandAspectsVO toVO(@NotNull BrandAspectsModel brandAspectsModel, long j11) {
        Iterator it;
        t tVar;
        Intrinsics.checkNotNullParameter(brandAspectsModel, "<this>");
        String title = brandAspectsModel.getTitle();
        ButtonV3DTO rightButton = brandAspectsModel.getRightButton();
        ButtonV3Atom.LargeBorderlessButton largeBorderlessButton = rightButton != null ? toLargeBorderlessButton(rightButton) : null;
        IconDTO rightIcon = brandAspectsModel.getRightIcon();
        boolean scrollEnabled = brandAspectsModel.getScrollEnabled();
        AtomActionDTO action = brandAspectsModel.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, brandAspectsModel.getTrackingInfo()) : null;
        List<FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand> aspects = brandAspectsModel.getAspects();
        ArrayList arrayList = new ArrayList(C7714v.z(aspects, 10));
        Iterator it2 = aspects.iterator();
        while (it2.hasNext()) {
            FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand aspectBrand = (FiltersDTO.Section.Filter.AspectBrandFilter.AspectBrand) it2.next();
            long hashCode = aspectBrand.hashCode();
            AspectDTO aspect = aspectBrand.getAspect();
            IconDTO icon = aspectBrand.getIcon();
            String title2 = aspectBrand.getTitle();
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(aspectBrand.getAction(), aspectBrand.getTrackingInfo());
            Map<String, TokenizedTrackingInfo> trackingInfo = aspectBrand.getTrackingInfo();
            if (trackingInfo != null) {
                it = it2;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            } else {
                it = it2;
                tVar = null;
            }
            arrayList.add(new BrandAspectsVO.AspectBrand(hashCode, aspect, icon, title2, atomAction2, tVar, brandAspectsModel.getScrollEnabled(), aspectBrand.getTestInfo()));
            it2 = it;
        }
        String originalUrl = brandAspectsModel.getOriginalUrl();
        boolean showSeparator = brandAspectsModel.getShowSeparator();
        Integer maxRowsCount = brandAspectsModel.getMaxRowsCount();
        Integer totalValuesCount = brandAspectsModel.getTotalValuesCount();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = brandAspectsModel.getTrackingInfo();
        return new BrandAspectsVO(j11, title, atomAction, largeBorderlessButton, rightIcon, scrollEnabled, arrayList, originalUrl, showSeparator, maxRowsCount, totalValuesCount, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
    }
}
