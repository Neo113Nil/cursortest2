package ru.ozon.app.android.button.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.button.data.ActionButtonDTO;
import ru.ozon.app.android.button.presentation.ActionButtonVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/button/core/ActionButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/button/data/ActionButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/button/presentation/ActionButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "widgetInfo", "invoke", "(Lru/ozon/app/android/button/data/ActionButtonDTO;Ll20/d;)Ljava/util/List;", "button_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionButtonMapper implements Function2<ActionButtonDTO, d, List<? extends ActionButtonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ActionButtonVO> invoke(@NotNull ActionButtonDTO dto, @NotNull d widgetInfo) {
        List list;
        Button.Style style;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ActionButtonDTO.ButtonsItem> buttons = dto.getButtons();
        if (buttons != null) {
            List<ActionButtonDTO.ButtonsItem> list2 = buttons;
            list = new ArrayList(C7714v.z(list2, 10));
            for (ActionButtonDTO.ButtonsItem buttonsItem : list2) {
                ActionButtonDTO.ButtonsItem.Action action = buttonsItem.getAction();
                String type = action != null ? action.getType() : null;
                if (type == null) {
                    type = "";
                }
                ActionButtonDTO.ButtonsItem.Action action2 = buttonsItem.getAction();
                String title = buttonsItem.getTitle();
                Button.Style[] values = Button.Style.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        style = null;
                        break;
                    }
                    style = values[i11];
                    if (h.D(style.getKey(), buttonsItem.getStyle(), true)) {
                        break;
                    }
                    i11++;
                }
                if (style == null) {
                    style = Button.Style.PRIMARY;
                }
                list.add(new ActionButtonVO.Button(type, action2, new Button(title, null, style, buttonsItem.getAction() != null ? new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, null, null, 14, null) : null, null, null, null, 114, null)));
            }
        } else {
            list = K.f71697a;
        }
        return C7714v.a0(new ActionButtonVO(hashCode, list));
    }
}
