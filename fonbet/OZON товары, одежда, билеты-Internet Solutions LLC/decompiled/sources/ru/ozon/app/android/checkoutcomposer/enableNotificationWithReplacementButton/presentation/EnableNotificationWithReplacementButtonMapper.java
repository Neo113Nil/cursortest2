package ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.data.EnableNotificationWithReplacementButtonDTO;
import ru.ozon.app.android.checkoutcomposer.enableNotificationWithReplacementButton.presentation.EnableNotificationWithReplacementButtonVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO;J)Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;", "Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO$ButtonWithRedDotDTO;)Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/presentation/EnableNotificationWithReplacementButtonVO$ButtonWithRedDotVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/enableNotificationWithReplacementButton/data/EnableNotificationWithReplacementButtonDTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EnableNotificationWithReplacementButtonMapper implements Function2<EnableNotificationWithReplacementButtonDTO, d, List<? extends EnableNotificationWithReplacementButtonVO>> {
    private final EnableNotificationWithReplacementButtonVO toVO(EnableNotificationWithReplacementButtonDTO enableNotificationWithReplacementButtonDTO, long j11) {
        EnableNotificationWithReplacementButtonVO.ButtonWithRedDotVO vo = toVO(enableNotificationWithReplacementButtonDTO.getEnableNotificationButton());
        ButtonV3Atom.SmallIconButton replacementButton = enableNotificationWithReplacementButtonDTO.getReplacementButton();
        EnableNotificationWithReplacementButtonDTO.ButtonWithRedDotDTO replacementButtonWithRedDot = enableNotificationWithReplacementButtonDTO.getReplacementButtonWithRedDot();
        return new EnableNotificationWithReplacementButtonVO(j11, vo, replacementButton, replacementButtonWithRedDot != null ? toVO(replacementButtonWithRedDot) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EnableNotificationWithReplacementButtonVO> invoke(@NotNull EnableNotificationWithReplacementButtonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final EnableNotificationWithReplacementButtonVO.ButtonWithRedDotVO toVO(EnableNotificationWithReplacementButtonDTO.ButtonWithRedDotDTO buttonWithRedDotDTO) {
        Boolean hasRedDot = buttonWithRedDotDTO.getHasRedDot();
        return new EnableNotificationWithReplacementButtonVO.ButtonWithRedDotVO(hasRedDot != null ? hasRedDot.booleanValue() : false, buttonWithRedDotDTO.getButton());
    }
}
