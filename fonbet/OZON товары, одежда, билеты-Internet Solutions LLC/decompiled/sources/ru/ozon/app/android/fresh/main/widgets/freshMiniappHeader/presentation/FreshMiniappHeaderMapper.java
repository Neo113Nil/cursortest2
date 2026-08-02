package ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.presentation;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.freshMiniappHeader.data.FreshMiniappHeaderDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "", "asyncData", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;JLjava/lang/String;)Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/presentation/FreshMiniappHeaderVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/freshMiniappHeader/data/FreshMiniappHeaderDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshMiniappHeaderMapper implements Function2<FreshMiniappHeaderDTO, d, List<? extends FreshMiniappHeaderVO>> {
    private final FreshMiniappHeaderVO toVO(FreshMiniappHeaderDTO freshMiniappHeaderDTO, long j11, String str) {
        TextDTO miniappTitle = freshMiniappHeaderDTO.getMiniappTitle();
        TextDTO timeDeliveryTitle = freshMiniappHeaderDTO.getTimeDeliveryTitle();
        TextDTO addressTitle = freshMiniappHeaderDTO.getAddressTitle();
        IconDTO miniappIcon = freshMiniappHeaderDTO.getMiniappIcon();
        IconDTO timeDeliveryIcon = freshMiniappHeaderDTO.getTimeDeliveryIcon();
        AtomActionDTO action = freshMiniappHeaderDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, freshMiniappHeaderDTO.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = freshMiniappHeaderDTO.getTrackingInfo();
        return new FreshMiniappHeaderVO(j11, miniappTitle, timeDeliveryTitle, addressTitle, miniappIcon, timeDeliveryIcon, atomAction, str, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FreshMiniappHeaderVO> invoke(@NotNull FreshMiniappHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo), widgetInfo.c().a()));
    }
}
