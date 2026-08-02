package ru.ozon.uni.atoms.v3.holders.controls.button;

import Nt.a;
import Sc.InterfaceC3999a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.main.button.ButtonState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u0019\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0004¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/ButtonAtomHolder;", "DTO", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "V", "Landroid/view/View;", "Lru/ozon/uni/atoms/v3/AtomV3;", "view", "atomContext", "", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "mapState", "Lru/ozon/uni/android/wrappers/main/button/ButtonState;", "enabled", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ButtonAtomHolder<DTO extends ButtonsDTO, V extends View> extends AtomV3<DTO, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonAtomHolder(@NotNull V view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    public static final void _init_$lambda$1(ButtonAtomHolder buttonAtomHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        ButtonsDTO buttonsDTO = (ButtonsDTO) buttonAtomHolder.getData();
        CommonControlSettings common = buttonsDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, buttonsDTO.getTrackingInfo())) != null) {
            buttonAtomHolder.handleAction(atomAction);
            return;
        }
        Object parent = buttonAtomHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    @NotNull
    protected final ButtonState mapState(boolean enabled) {
        return enabled ? ButtonState.ENABLED : ButtonState.DISABLED;
    }
}
