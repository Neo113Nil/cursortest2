package ru.ozon.fintech.ui.button.small;

import C.D;
import Cw.b;
import Sc.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.widget.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.fintech.ui.button.small.FinSmallButtonState;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/ui/button/small/FinSmallButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", SelectionItemFormDTO.TITLE_FIELD_NAME, "Landroid/widget/TextView;", "icon", "Landroid/widget/ImageView;", "state", "Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "getState", "()Lru/ozon/fintech/ui/button/small/FinSmallButtonState;", "setState", "(Lru/ozon/fintech/ui/button/small/FinSmallButtonState;)V", "bindState", "", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinSmallButtonView extends ConstraintLayout {

    @NotNull
    private final ImageView icon;
    private FinSmallButtonState state;

    @NotNull
    private final TextView title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinSmallButtonState.Type.values().length];
            try {
                iArr[FinSmallButtonState.Type.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinSmallButtonState.Type.EXPRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinSmallButtonState.Type.PRIMARY_FRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FinSmallButtonState.Type.PRIMARY_GREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FinSmallButtonState.Type.DANGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FinSmallButtonState.Type.IMPORTANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FinSmallButtonState.Type.SECONDARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FinSmallButtonState.Type.SECONDARY_GREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FinSmallButtonState.Type.TERTIARY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSmallButtonView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FinSmallButtonView finSmallButtonView, View view) {
        FinSmallButtonState finSmallButtonState = finSmallButtonView.state;
        if (finSmallButtonState != null) {
            Function1<String, Unit> onClickId = finSmallButtonState.getOnClickId();
            if (onClickId != null) {
                onClickId.invoke(finSmallButtonState.getId());
            }
            Function0<Unit> onClick = finSmallButtonState.getOnClick();
            if (onClick != null) {
                onClick.invoke();
            }
        }
    }

    public final void bindState(@NotNull FinSmallButtonState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.title.setText(state.getTitle());
        this.icon.setVisibility(state.getIcon() != null ? 0 : 8);
        Integer icon = state.getIcon();
        if (icon != null) {
            this.icon.setImageResource(icon.intValue());
        }
        switch (WhenMappings.$EnumSwitchMapping$0[state.getType().ordinal()]) {
            case 1:
                ColorStateList colorStateList = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_primary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_primary));
                this.title.setTextColor(colorStateList);
                g.a(this.icon, colorStateList);
                return;
            case 2:
                ColorStateList colorStateList2 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_primary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_primary_red));
                this.title.setTextColor(colorStateList2);
                g.a(this.icon, colorStateList2);
                return;
            case 3:
                ColorStateList colorStateList3 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_primary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_primary_fresh));
                this.title.setTextColor(colorStateList3);
                g.a(this.icon, colorStateList3);
                return;
            case 4:
                ColorStateList colorStateList4 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_primary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_primary_green));
                this.title.setTextColor(colorStateList4);
                g.a(this.icon, colorStateList4);
                return;
            case 5:
                ColorStateList colorStateList5 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_danger);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_danger));
                this.title.setTextColor(colorStateList5);
                g.a(this.icon, colorStateList5);
                return;
            case 6:
                ColorStateList colorStateList6 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_important);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_important));
                this.title.setTextColor(colorStateList6);
                g.a(this.icon, colorStateList6);
                return;
            case 7:
                ColorStateList colorStateList7 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_secondary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_secondary));
                this.title.setTextColor(colorStateList7);
                g.a(this.icon, colorStateList7);
                return;
            case 8:
                ColorStateList colorStateList8 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_secondary_green);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_secondary));
                this.title.setTextColor(colorStateList8);
                g.a(this.icon, colorStateList8);
                return;
            case 9:
                ColorStateList colorStateList9 = a.getColorStateList(getContext(), R.color.o2_selector_color_text_for_button_tertiary);
                setBackground(a.getDrawable(getContext(), R.drawable.o2_button_tertiary));
                this.title.setTextColor(colorStateList9);
                g.a(this.icon, colorStateList9);
                return;
            default:
                throw new o();
        }
    }

    public final FinSmallButtonState getState() {
        return this.state;
    }

    public final void setState(FinSmallButtonState finSmallButtonState) {
        this.state = finSmallButtonState;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSmallButtonView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinSmallButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinSmallButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.small_button_view, this);
        this.title = (TextView) findViewById(R.id.small_button_title);
        this.icon = (ImageView) findViewById(R.id.small_button_icon);
        setMinHeight(D.c(32.0f));
        setPadding(D.c(12.0f), 0, D.c(12.0f), 0);
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new b(this, 5));
    }
}
