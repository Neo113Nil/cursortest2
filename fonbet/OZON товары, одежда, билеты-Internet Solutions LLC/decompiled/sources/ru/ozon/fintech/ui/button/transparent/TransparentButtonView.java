package ru.ozon.fintech.ui.button.transparent;

import E30.f;
import H30.t;
import Sc.o;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.transparent.TransparentButtonState;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/fintech/ui/button/transparent/TransparentButtonView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/button/transparent/TransparentButtonState;", "getState", "()Lru/ozon/fintech/ui/button/transparent/TransparentButtonState;", "setState", "(Lru/ozon/fintech/ui/button/transparent/TransparentButtonState;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransparentButtonView extends AppCompatTextView {
    private TransparentButtonState state;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransparentButtonState.Type.values().length];
            try {
                iArr[TransparentButtonState.Type.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransparentButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TransparentButtonView transparentButtonView, View view) {
        TransparentButtonState transparentButtonState = transparentButtonView.state;
        if (transparentButtonState != null) {
            transparentButtonState.getOnClick().invoke(transparentButtonState.getId());
        }
    }

    public final void bindState(@NotNull TransparentButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        setText(state.getTitle());
        if (WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()] != 1) {
            throw new o();
        }
        setTextColor(a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_secondary));
        Integer icon = state.getIcon();
        Intrinsics.f(icon);
        t.a(this, icon.intValue(), R.color.oz_semantic_accent_primary);
    }

    public final TransparentButtonState getState() {
        return this.state;
    }

    public final void setState(TransparentButtonState transparentButtonState) {
        this.state = transparentButtonState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TransparentButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TransparentButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransparentButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        setTextAppearance(R.style.TextStyle_Body_L);
        setPadding(f.i(), f.g(), f.i(), f.g());
        setBackground(a.getDrawable(context, R.drawable.ripple_rect_round_bluewave_s));
        setOnClickListener(new CG.a(this, 11));
        setCompoundDrawablePadding(f.i());
        setClickable(true);
        setFocusable(true);
        setTextColor(a.getColorStateList(context, R.color.o2_selector_color_text_for_button_secondary));
        t.a(this, R.drawable.fintech_ic_right_chevron, R.color.oz_accent_primary);
    }
}
