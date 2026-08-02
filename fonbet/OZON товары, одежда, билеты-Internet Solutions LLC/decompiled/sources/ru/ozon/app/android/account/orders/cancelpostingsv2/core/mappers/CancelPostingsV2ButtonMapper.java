package ru.ozon.app.android.account.orders.cancelpostingsv2.core.mappers;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancelpostingsv2.data.ButtonModel;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.ButtonVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/core/mappers/CancelPostingsV2ButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ButtonModel;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ButtonModel;J)Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/button/ButtonVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/data/ButtonModel;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelPostingsV2ButtonMapper implements Function2<ButtonModel, d, List<? extends ButtonVO>> {
    private final ButtonVO toVo(ButtonModel buttonModel, long j11) {
        return new ButtonVO(j11, buttonModel.getButton(), buttonModel.getBadge());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ButtonVO> invoke(@NotNull ButtonModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        ButtonV3Atom.LargeButton button = state.getButton();
        return C7714v.a0(toVo(state, (d11 + "_" + button).hashCode()));
    }
}
