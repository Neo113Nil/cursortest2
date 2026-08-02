package ru.ozon.uni.android.input.textinput.ui.buttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputUIModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013J\u001a\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00160\u001bJ\b\u0010\u001c\u001a\u00020\u0014H\u0002R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonsContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "locatorTag", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "actionButtons", "", "Lru/ozon/uni/android/input/textinput/ui/buttons/InputActionButtonView;", "setButtons", "", "buttons", "Lru/ozon/uni/android/input/textinput/data/OzonTextInputUIModel$ActionButton;", "setActionButtonClickListener", "actionButtonClickListener", "Lkotlin/Function1;", "makeActionButton", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputActionButtonsContainer extends LinearLayoutCompat implements AtomLocatableView {

    @NotNull
    private final List<InputActionButtonView> actionButtons;

    @NotNull
    private String locatorTag;
    public static final int $stable = 8;
    private static final int marginDivider = UiExtKt.toPx(4);
    private static final int maxActionButtonsCount = 3;

    public /* synthetic */ InputActionButtonsContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final InputActionButtonView makeActionButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InputActionButtonView inputActionButtonView = new InputActionButtonView(context, null, 0, 6, null);
        inputActionButtonView.setId(R$id.inputActionButton);
        addView(inputActionButtonView, new LinearLayoutCompat.a(-2, -1));
        return inputActionButtonView;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public final void setActionButtonClickListener(@NotNull Function1<? super OzonTextInputUIModel.ActionButton, Unit> actionButtonClickListener) {
        Intrinsics.checkNotNullParameter(actionButtonClickListener, "actionButtonClickListener");
        Iterator<T> it = this.actionButtons.iterator();
        while (it.hasNext()) {
            ((InputActionButtonView) it.next()).setActionButtonClickListener(actionButtonClickListener);
        }
    }

    public final void setButtons(@NotNull List<? extends OzonTextInputUIModel.ActionButton> buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        List K02 = C7714v.K0(buttons, maxActionButtonsCount);
        int i11 = 0;
        for (Object obj : this.actionButtons) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            InputActionButtonView inputActionButtonView = (InputActionButtonView) obj;
            inputActionButtonView.bind((OzonTextInputUIModel.ActionButton) C7714v.Q(i11, K02));
            ViewGroup.LayoutParams layoutParams = inputActionButtonView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            }
            LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) layoutParams;
            aVar.setMarginEnd(i11 == C7714v.P(this.actionButtons) ? marginDivider : 0);
            inputActionButtonView.setLayoutParams(aVar);
            i11 = i12;
        }
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputActionButtonsContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "inputActionButtonsContainer";
        setOrientation(0);
        ArrayList arrayList = new ArrayList();
        int i12 = maxActionButtonsCount;
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(makeActionButton());
        }
        setContentDescription(getLocatorTag());
        this.actionButtons = arrayList;
    }
}
