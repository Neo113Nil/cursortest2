package ru.ozon.app.android.account.orders.buttonv2;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.buttonv2.data.ActionButtonV2DTO;
import ru.ozon.app.android.account.orders.buttonv2.data.ActionDTO;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionButtonV2VO;
import ru.ozon.app.android.account.orders.buttonv2.presentation.ActionTypeVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/account/orders/buttonv2/ActionButtonV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionButtonV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/account/orders/buttonv2/data/ActionDTO;", "Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$ComposerAction;", "transformToTypeVO", "(Lru/ozon/app/android/account/orders/buttonv2/data/ActionDTO;)Lru/ozon/app/android/account/orders/buttonv2/presentation/ActionTypeVO$ComposerAction;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/buttonv2/data/ActionButtonV2DTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionButtonV2Mapper implements Function2<ActionButtonV2DTO, d, List<? extends ActionButtonV2VO>> {
    private final ActionTypeVO.ComposerAction transformToTypeVO(ActionDTO actionDTO) {
        return new ActionTypeVO.ComposerAction(actionDTO.getName(), actionDTO.getParams());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ActionButtonV2VO> invoke(@NotNull ActionButtonV2DTO dto, @NotNull d widgetInfo) {
        ActionTypeVO moveAction;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(dto.getTitle(), dto.getDeeplink());
        ActionDTO action = dto.getAction();
        if (action == null || (moveAction = transformToTypeVO(action)) == null) {
            String deeplink = dto.getDeeplink();
            if (deeplink == null) {
                deeplink = "";
            }
            moveAction = new ActionTypeVO.MoveAction(deeplink);
        }
        return C7714v.a0(new ActionButtonV2VO(a11, dto.isEnabled(), dto.getTitle(), moveAction, dto.getTrackingInfo()));
    }
}
