package ru.ozon.fintech.ui.button.radio;

import Ar.c;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/button/radio/FinRadioButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/widget/TextView;", "description", "icon", "Landroid/widget/ImageView;", "radioButton", "Landroid/widget/RadioButton;", "state", "Lru/ozon/fintech/ui/button/radio/FinRadioButtonState;", "getState", "()Lru/ozon/fintech/ui/button/radio/FinRadioButtonState;", "setState", "(Lru/ozon/fintech/ui/button/radio/FinRadioButtonState;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinRadioButtonView extends ConstraintLayout {

    @NotNull
    private final TextView description;

    @NotNull
    private final ImageView icon;

    @NotNull
    private final RadioButton radioButton;
    private FinRadioButtonState state;

    @NotNull
    private final TextView title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FinRadioButtonView finRadioButtonView, View view) {
        Function1<Integer, Unit> onClick;
        FinRadioButtonState finRadioButtonState = finRadioButtonView.state;
        if (finRadioButtonState == null || (onClick = finRadioButtonState.getOnClick()) == null) {
            return;
        }
        FinRadioButtonState finRadioButtonState2 = finRadioButtonView.state;
        onClick.invoke(finRadioButtonState2 != null ? Integer.valueOf(finRadioButtonState2.getThemeId()) : null);
    }

    public final void bindState(@NotNull FinRadioButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.title.setText(state.getTitleId());
        if (state.getDescriptionId() != null) {
            this.description.setVisibility(0);
            this.description.setText(state.getDescriptionId().intValue());
        }
        Integer iconId = state.getIconId();
        if (iconId != null) {
            this.icon.setImageResource(iconId.intValue());
            this.icon.setVisibility(0);
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getIconColor());
        if (parseColor != null) {
            this.icon.setColorFilter(parseColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
        this.radioButton.setChecked(state.isChecked());
    }

    public final FinRadioButtonState getState() {
        return this.state;
    }

    public final void setState(FinRadioButtonState finRadioButtonState) {
        this.state = finRadioButtonState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinRadioButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinRadioButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.radio_button_view, this);
        setMinHeight(getResources().getDimensionPixelSize(R.dimen.radio_button_height_root));
        this.title = (TextView) findViewById(R.id.tv_title);
        this.description = (TextView) findViewById(R.id.tv_description);
        this.icon = (ImageView) findViewById(R.id.iv_image);
        this.radioButton = (RadioButton) findViewById(R.id.rb_selector);
        setOnClickListener(new c(this, 8));
    }
}
