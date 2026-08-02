package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers;

import Lh.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ButtonsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.viewItem.ButtonsVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/mappers/ButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ButtonsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/viewItem/ButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "", "index", "", "generateId", "(Ljava/lang/String;I)J", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ButtonsDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonsMapper implements Function2<ButtonsDTO, d, List<? extends ButtonsVO>> {
    private final long generateId(String stateId, int index) {
        return b.a(index, stateId, "_buttons_");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ButtonsVO> invoke(@NotNull ButtonsDTO state, @NotNull d widgetInfo) {
        ButtonsVO buttonsVO;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        List<Object> buttons = state.getButtons();
        if (buttons != null) {
            for (Object obj : buttons) {
                boolean z11 = obj instanceof ButtonsDTO.TextButtonDTO;
                if (z11) {
                    ButtonsDTO.TextButtonDTO textButtonDTO = (ButtonsDTO.TextButtonDTO) obj;
                    if (textButtonDTO.isFullWidth()) {
                        arrayList.add(new ButtonsVO(generateId(widgetInfo.d(), arrayList.size()), textButtonDTO.getButton(), null, null, ButtonsVO.Type.FULL_WIDTH, state.getHorizontalPadding(), 12, null));
                    }
                }
                if (z11) {
                    ButtonsVO buttonsVO2 = (ButtonsVO) C7714v.Z(arrayList);
                    if (buttonsVO2 == null || buttonsVO2.getType() == ButtonsVO.Type.FULL_WIDTH || buttonsVO2.getSecondButton() != null) {
                        arrayList.add(new ButtonsVO(generateId(widgetInfo.d(), arrayList.size()), ((ButtonsDTO.TextButtonDTO) obj).getButton(), null, null, ButtonsVO.Type.DEFAULT, state.getHorizontalPadding(), 12, null));
                    } else {
                        arrayList.set(C7714v.P(arrayList), ButtonsVO.copy$default(buttonsVO2, 0L, null, ((ButtonsDTO.TextButtonDTO) obj).getButton(), null, null, null, 59, null));
                    }
                } else if ((obj instanceof IconButtonV3DTO) && (buttonsVO = (ButtonsVO) C7714v.Z(arrayList)) != null) {
                    arrayList.set(C7714v.P(arrayList), ButtonsVO.copy$default(buttonsVO, 0L, null, null, (IconButtonV3DTO) obj, null, null, 55, null));
                }
            }
        }
        return arrayList;
    }
}
