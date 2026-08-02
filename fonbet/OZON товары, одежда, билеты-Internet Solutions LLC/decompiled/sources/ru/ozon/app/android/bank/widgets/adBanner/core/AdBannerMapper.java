package ru.ozon.app.android.bank.widgets.adBanner.core;

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
import ru.ozon.app.android.bank.widgets.adBanner.data.AdBannerDTO;
import ru.ozon.app.android.bank.widgets.adBanner.data.AdBannerItemDTO;
import ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerItemVO;
import ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/core/AdBannerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "parentVoId", "", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "toAdBannerVO", "(Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;Ljava/lang/Long;)Ljava/util/List;", "", "seed", "generateUniqueId", "(Ljava/lang/String;)J", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;Ll20/d;)Ljava/util/List;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerMapper implements Function2<AdBannerDTO, d, List<? extends AdBannerVO>> {
    private final long generateUniqueId(String seed) {
        return seed.hashCode() ^ System.nanoTime();
    }

    private final List<AdBannerItemVO> toAdBannerVO(AdBannerDTO adBannerDTO, Long l11) {
        Iterator it;
        AtomAction atomAction;
        t tVar;
        List<AdBannerItemDTO> banners = adBannerDTO.getBanners();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = banners.iterator();
        while (it2.hasNext()) {
            AdBannerItemDTO adBannerItemDTO = (AdBannerItemDTO) it2.next();
            long generateUniqueId = generateUniqueId(adBannerItemDTO.hashCode() + "_" + System.nanoTime());
            ImageDTO image = adBannerItemDTO.getImage();
            ImageDTO imageDark = adBannerItemDTO.getImageDark();
            TextDTO title = adBannerItemDTO.getTitle();
            TextDTO subtitle = adBannerItemDTO.getSubtitle();
            ButtonV3DTO button = adBannerItemDTO.getButton();
            IconButtonV3DTO closeButton = adBannerItemDTO.getCloseButton();
            String slug = adBannerItemDTO.getSlug();
            String placementSlug = adBannerItemDTO.getPlacementSlug();
            String adTraceID = adBannerDTO.getAdTraceID();
            AtomActionDTO action = adBannerItemDTO.getAction();
            AtomAction atomAction2 = action != null ? AtomActionMapperKt.toAtomAction(action, adBannerItemDTO.getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = adBannerItemDTO.getTrackingInfo();
            if (trackingInfo != null) {
                it = it2;
                atomAction = atomAction2;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(l11 != null ? l11.longValue() : generateUniqueId), null, 2, null);
            } else {
                it = it2;
                atomAction = atomAction2;
                tVar = null;
            }
            arrayList.add(new AdBannerItemVO(generateUniqueId, title, image, slug, placementSlug, adTraceID, imageDark, subtitle, button, closeButton, atomAction, tVar));
            it2 = it;
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdBannerVO> invoke(@NotNull AdBannerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.getBanners().hashCode();
        return C7714v.a0(new AdBannerVO(hashCode, toAdBannerVO(state, Long.valueOf(hashCode)), state.getAdTraceID(), null, state.getAutoScrollDelay(), state.getBackgroundColor(), 8, null));
    }
}
