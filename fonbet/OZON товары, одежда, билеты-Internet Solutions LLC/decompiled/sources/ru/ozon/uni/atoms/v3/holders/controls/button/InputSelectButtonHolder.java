package ru.ozon.uni.atoms.v3.holders.controls.button;

import Ez.ViewOnClickListenerC2978b;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.button.InputSelectButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/controls/button/InputSelectButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "Lru/ozon/uni/android/controls/button/InputSelectButtonView;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/controls/button/InputSelectButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputSelectButtonHolder extends AtomV3<InputSelectButtonDTO, InputSelectButtonView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelectButtonHolder(@NotNull InputSelectButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnClickListener(new ViewOnClickListenerC2978b(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(InputSelectButtonHolder inputSelectButtonHolder, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        InputSelectButtonDTO inputSelectButtonDTO = (InputSelectButtonDTO) inputSelectButtonHolder.getData();
        Boolean disabled = inputSelectButtonDTO.getDisabled();
        if (disabled != null ? disabled.booleanValue() : false) {
            return;
        }
        CommonControlSettings common = inputSelectButtonDTO.getCommon();
        if (common != null && (action = common.getAction()) != null && (atomAction = AtomActionMapperKt.toAtomAction(action, inputSelectButtonDTO.getTrackingInfo())) != null) {
            inputSelectButtonHolder.handleAction(atomAction);
            return;
        }
        Object parent = inputSelectButtonHolder.getContainerView().getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull InputSelectButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((InputSelectButtonHolder) item);
        InputSelectButtonView containerView = getContainerView();
        InputSelectButtonDTO.Status status = item.getStatus();
        if (status == null) {
            status = InputSelectButtonDTO.Status.STATUS_NEUTRAL;
        }
        containerView.setStatus(status);
        InputSelectButtonDTO.Size size = item.getSize();
        if (size == null) {
            size = InputSelectButtonDTO.Size.SIZE_600;
        }
        containerView.setSize(size);
        containerView.setCaption(item.getCaption());
        String value = item.getValue();
        String label = item.getLabel();
        Boolean readOnly = item.getReadOnly();
        boolean booleanValue = readOnly != null ? readOnly.booleanValue() : false;
        Boolean disabled = item.getDisabled();
        containerView.setInputState(value, label, disabled != null ? disabled.booleanValue() : false, booleanValue);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputSelectButtonHolder(@NotNull Context context, String str) {
        this(new InputSelectButtonView(context, null, 0, 0, 14, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
