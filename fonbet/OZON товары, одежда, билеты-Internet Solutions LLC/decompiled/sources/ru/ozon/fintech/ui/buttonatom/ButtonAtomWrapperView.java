package ru.ozon.fintech.ui.buttonatom;

import CG.c;
import E30.g;
import H30.z;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.uni.android.controls.button.ButtonView;
import ru.ozon.uni.atoms.v3.holders.controls.button.ButtonHolderKt;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "bxButt", "Lru/ozon/uni/android/controls/button/ButtonView;", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonAtomWrapperView extends FrameLayout {

    @NotNull
    private final ButtonView bxButt;
    private ButtonAtomWrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$1(final ButtonAtomWrapperState buttonAtomWrapperState, View view) {
        g.a(new Function2() { // from class: ea0.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit bindState$lambda$1$lambda$0;
                bindState$lambda$1$lambda$0 = ButtonAtomWrapperView.bindState$lambda$1$lambda$0(ButtonAtomWrapperState.this, (Function2) obj, (String) obj2);
                return bindState$lambda$1$lambda$0;
            }
        }, buttonAtomWrapperState.getOnClick(), buttonAtomWrapperState.getActionId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindState$lambda$1$lambda$0(ButtonAtomWrapperState buttonAtomWrapperState, Function2 onClick, String actionId) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(buttonAtomWrapperState.getCloseOnClick()));
        return Unit.f71690a;
    }

    public final void bindState(@NotNull ButtonAtomWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        ButtonHolderKt.bind$default(this.bxButt, state.getButtonDTO(), null, 2, null);
        this.bxButt.setOnClickListener(new c(state, 9));
        z.a(this, state.getPaddings());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ButtonAtomWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonAtomWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonView buttonView = new ButtonView(context, null, 0, 0, 14, null);
        this.bxButt = buttonView;
        setTag("ButtonAtomWrapperView");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(buttonView);
    }
}
