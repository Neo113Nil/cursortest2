package ru.ozon.fintech.ui.button.radioV2;

import Ey.ViewOnClickListenerC2975b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.databinding.RadioButtonV2ViewBinding;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/button/radioV2/FinRadioButtonV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lru/ozon/fintech/ui/databinding/RadioButtonV2ViewBinding;", "state", "Lru/ozon/fintech/ui/button/radioV2/FinRadioButtonV2State;", "getState", "()Lru/ozon/fintech/ui/button/radioV2/FinRadioButtonV2State;", "setState", "(Lru/ozon/fintech/ui/button/radioV2/FinRadioButtonV2State;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinRadioButtonV2View extends ConstraintLayout {

    @NotNull
    private final RadioButtonV2ViewBinding binding;
    private FinRadioButtonV2State state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonV2View(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FinRadioButtonV2View finRadioButtonV2View, View view) {
        Function1<Integer, Unit> onClick;
        FinRadioButtonV2State finRadioButtonV2State = finRadioButtonV2View.state;
        if (finRadioButtonV2State == null || (onClick = finRadioButtonV2State.getOnClick()) == null) {
            return;
        }
        FinRadioButtonV2State finRadioButtonV2State2 = finRadioButtonV2View.state;
        onClick.invoke(finRadioButtonV2State2 != null ? Integer.valueOf(finRadioButtonV2State2.getId()) : null);
    }

    public final void bindState(@NotNull FinRadioButtonV2State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.binding.tvTitle.setText(state.getTitleId());
        Integer iconId = state.getIconId();
        if (iconId != null) {
            this.binding.ivImage.setImageResource(iconId.intValue());
            ImageView ivImage = this.binding.ivImage;
            Intrinsics.checkNotNullExpressionValue(ivImage, "ivImage");
            ivImage.setVisibility(0);
        }
        this.binding.rbSelector.setEnabled(state.isEnabled());
        setClickable(state.isEnabled());
        this.binding.rbSelector.setChecked(state.isChecked());
    }

    public final FinRadioButtonV2State getState() {
        return this.state;
    }

    public final void setState(FinRadioButtonV2State finRadioButtonV2State) {
        this.state = finRadioButtonV2State;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinRadioButtonV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        RadioButtonV2ViewBinding inflate = RadioButtonV2ViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setBackground(a.getDrawable(context, R.drawable.background_radio_button));
        inflate.container.setBackground(a.getDrawable(context, R.drawable.fintech_ripple_rect_round_bluewave));
        setOnClickListener(new ViewOnClickListenerC2975b(this, 8));
    }
}
