package ru.ozon.app.android.pdp.widgets.crosssale.core;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingDTOKt;
import ru.ozon.app.android.pdp.widgets.crosssale.data.CrossSaleDTO;
import ru.ozon.app.android.pdp.widgets.crosssale.presentation.CrossSaleVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/crosssale/core/CrossSaleMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/crosssale/presentation/CrossSaleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/crosssale/data/CrossSaleDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CrossSaleMapper implements Function2<CrossSaleDTO, d, List<? extends CrossSaleVO>> {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<CrossSaleVO> invoke(@NotNull CrossSaleDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        OnBoardingDTO onBoardingDTO;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList2 = new ArrayList();
        for (CrossSaleDTO.CrossSaleItem crossSaleItem : state.getItems()) {
            long hashCode = (crossSaleItem.getTitle() + "." + crossSaleItem.getSubtitle()).hashCode();
            String title = crossSaleItem.getTitle();
            String subtitle = crossSaleItem.getSubtitle();
            String deeplink = crossSaleItem.getDeeplink();
            List<CrossSaleDTO.CrossSaleItem.Image> images = crossSaleItem.getImages();
            t tVar = null;
            if (images != null) {
                List<CrossSaleDTO.CrossSaleItem.Image> list = images;
                arrayList = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CrossSaleDTO.CrossSaleItem.Image) it.next()).getUrl());
                }
            } else {
                arrayList = null;
            }
            CrossSaleDTO.CrossSaleItem.Subitems subitems = crossSaleItem.getSubitems();
            OnBoardingDTO commonOnboarding = crossSaleItem.getCommonOnboarding();
            if (commonOnboarding == null) {
                PDPOnBoardingDTO onboarding = crossSaleItem.getOnboarding();
                if (onboarding != null) {
                    commonOnboarding = PDPOnBoardingDTOKt.toCommonOnboardingDTO$default(onboarding, null, 0, null, 7, null);
                } else {
                    onBoardingDTO = null;
                    trackingInfo = crossSaleItem.getTrackingInfo();
                    if (trackingInfo == null) {
                        tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
                    }
                    arrayList2.add(new CrossSaleVO(hashCode, title, subtitle, deeplink, arrayList, subitems, onBoardingDTO, tVar));
                }
            }
            onBoardingDTO = commonOnboarding;
            trackingInfo = crossSaleItem.getTrackingInfo();
            if (trackingInfo == null) {
            }
            arrayList2.add(new CrossSaleVO(hashCode, title, subtitle, deeplink, arrayList, subitems, onBoardingDTO, tVar));
        }
        return arrayList2;
    }
}
