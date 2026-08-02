package ru.ozon.uni.atoms.v3.holders.selectionControls;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/selectionControls/CheckBoxHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckBoxHolder extends AtomV3<CheckBoxDTO, CheckBoxView> implements WrappedAtomHolder {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckBoxDTO.CheckboxState.values().length];
            try {
                iArr[CheckBoxDTO.CheckboxState.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckBoxDTO.CheckboxState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckBoxHolder(@NotNull CheckBoxView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckBoxHolder(@NotNull Context context, String str) {
        this(new CheckBoxView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CheckBoxDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CheckBoxHolder) item);
        CheckBoxView containerView = getContainerView();
        CheckBoxDTO.CheckboxState state = item.getState();
        int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            containerView.clearCheckboxError();
            containerView.setEnabled(true);
        } else if (i11 == 2) {
            containerView.setEnabled(false);
        } else if (i11 != 3) {
            containerView.clearCheckboxError();
            getContainerView().setEnabled(true);
        } else {
            containerView.setCheckboxError();
        }
        CheckBoxDTO.CheckboxStatus status = item.getStatus();
        if (status == null) {
            status = CheckBoxDTO.CheckboxStatus.EMPTY;
        }
        containerView.setCheckboxState(status);
    }
}
