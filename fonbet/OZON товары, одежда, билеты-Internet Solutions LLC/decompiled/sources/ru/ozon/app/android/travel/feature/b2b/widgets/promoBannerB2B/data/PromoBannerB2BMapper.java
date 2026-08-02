package ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.data;

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
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.data.PromoBannerB2BDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.promoBannerB2B.presentation.PromoBannerB2BVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO;", "toVO", "(Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner;)Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO$BgImageVO;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO$Banner$BgImageDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/presentation/PromoBannerB2BVO$BannerVO$BgImageVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/b2b/widgets/promoBannerB2B/data/PromoBannerB2BDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PromoBannerB2BMapper implements Function2<PromoBannerB2BDTO, d, List<? extends PromoBannerB2BVO>> {
    private final PromoBannerB2BVO.BannerVO toVO(PromoBannerB2BDTO.Banner banner) {
        PromoBannerB2BVO.BannerVO.BgImageVO bgImageVO;
        AtomAction atomAction;
        OzonSpannableString text = banner.getTitle().getText();
        OzonSpannableString text2 = banner.getDescription().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        long hashCode = sb2.toString().hashCode();
        String backgroundColor = banner.getBackgroundColor();
        String darkBackgroundColor = banner.getDarkBackgroundColor();
        PromoBannerB2BDTO.Banner.BgImageDTO bgImage = banner.getBgImage();
        if (bgImage != null) {
            bgImageVO = toVO(bgImage);
            atomAction = null;
        } else {
            bgImageVO = null;
            atomAction = null;
        }
        TextAtom title = banner.getTitle();
        AtomAction atomAction2 = atomAction;
        TextAtom description = banner.getDescription();
        AtomAction atomAction3 = atomAction2;
        boolean isRounded = banner.isRounded();
        AtomActionDTO action = banner.getAction();
        if (action != null) {
            atomAction3 = AtomActionMapperKt.toAtomAction(action, banner.getTrackingInfo());
        }
        return new PromoBannerB2BVO.BannerVO(hashCode, backgroundColor, darkBackgroundColor, bgImageVO, title, description, isRounded, atomAction3);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PromoBannerB2BVO> invoke(@NotNull PromoBannerB2BDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        List<PromoBannerB2BDTO.Banner> bannerList = dto.getBannerList();
        ArrayList arrayList = new ArrayList(C7714v.z(bannerList, 10));
        Iterator<T> it = bannerList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((PromoBannerB2BDTO.Banner) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new PromoBannerB2BVO(hashCode, title, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final PromoBannerB2BVO.BannerVO.BgImageVO toVO(PromoBannerB2BDTO.Banner.BgImageDTO bgImageDTO) {
        return new PromoBannerB2BVO.BannerVO.BgImageVO(bgImageDTO.getUrl());
    }
}
