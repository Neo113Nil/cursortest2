package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core;

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
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3HeaderDTO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3HeaderVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3HeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;J)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO$ImageVO;", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO$Image;)Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO$ImageVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/data/HammersV3HeaderDTO;Ll20/d;)Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3HeaderMapper implements Function2<HammersV3HeaderDTO, d, List<? extends HammersV3HeaderVO>> {
    private final HammersV3HeaderVO toVo(HammersV3HeaderDTO hammersV3HeaderDTO, long j11) {
        HammersV3HeaderDTO.Image image = hammersV3HeaderDTO.getImage();
        HammersV3HeaderVO.ImageVO vo = image != null ? toVo(image) : null;
        String subtitle = hammersV3HeaderDTO.getSubtitle();
        SwitchingButton notifyButton = hammersV3HeaderDTO.getNotifyButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = hammersV3HeaderDTO.getTrackingInfo();
        return new HammersV3HeaderVO(j11, vo, subtitle, notifyButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, hammersV3HeaderDTO.getInfoButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HammersV3HeaderVO> invoke(@NotNull HammersV3HeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, state.hashCode()));
    }

    private final HammersV3HeaderVO.ImageVO toVo(HammersV3HeaderDTO.Image image) {
        String link = image.getLink();
        AtomActionDTO action = image.getAction();
        return new HammersV3HeaderVO.ImageVO(link, action != null ? AtomActionMapperKt.toAtomAction(action, image.getTrackingInfo()) : null);
    }
}
