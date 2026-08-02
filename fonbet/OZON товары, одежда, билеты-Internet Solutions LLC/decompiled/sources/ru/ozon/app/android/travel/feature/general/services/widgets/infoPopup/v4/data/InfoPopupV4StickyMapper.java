package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4StickyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;Ll20/d;)Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4StickyMapper implements Function2<InfoPopupV4DTO, d, List<? extends InfoPopupV4StickyVO>> {
    private final InfoPopupV4StickyVO toVO(InfoPopupV4DTO infoPopupV4DTO, String str) {
        long a11 = a.a("sticky_", str);
        List<ButtonV3DTO> buttons = infoPopupV4DTO.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        return new InfoPopupV4StickyVO(a11, buttons, infoPopupV4DTO.getDeleteServiceButton());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InfoPopupV4StickyVO> invoke(@NotNull InfoPopupV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ButtonV3DTO> buttons = state.getButtons();
        return (buttons == null || buttons.isEmpty()) ? K.f71697a : C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
