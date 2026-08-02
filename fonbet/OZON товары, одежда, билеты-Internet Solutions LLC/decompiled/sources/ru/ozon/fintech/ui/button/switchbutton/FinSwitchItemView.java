package ru.ozon.fintech.ui.button.switchbutton;

import C.D;
import E30.g;
import QD.b;
import V4.n;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import ca0.C5795b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\fH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "firstText", "Landroid/widget/TextView;", "secondText", "background", "Landroid/view/View;", "isFirstSelected", "", "isFirstBind", "bindState", "", "state", "Lru/ozon/fintech/ui/button/switchbutton/FinSwitchItem$State;", "changeTextColor", "firstSelected", "setTextColorAnimate", "firstColor", "secondColor", "textView", "refreshBackground", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinSwitchItemView extends ConstraintLayout implements FinSwitchItem.View {
    private static final float MIN_HEIGHT_DP = 56.0f;

    @NotNull
    private View background;

    @NotNull
    private final TextView firstText;
    private boolean isFirstBind;
    private boolean isFirstSelected;

    @NotNull
    private final TextView secondText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSwitchItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$3(FinSwitchItemView finSwitchItemView, FinSwitchItem.State state, View view) {
        if (finSwitchItemView.isFirstSelected || !state.getEnabled()) {
            return;
        }
        finSwitchItemView.isFirstSelected = true;
        finSwitchItemView.refreshBackground();
        state.getOnSelectionChanged().invoke(state.getFirst());
        finSwitchItemView.changeTextColor(true, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindState$lambda$4(FinSwitchItemView finSwitchItemView, FinSwitchItem.State state, View view) {
        if (finSwitchItemView.isFirstSelected && state.getEnabled()) {
            finSwitchItemView.isFirstSelected = false;
            finSwitchItemView.refreshBackground();
            state.getOnSelectionChanged().invoke(state.getSecond());
            finSwitchItemView.changeTextColor(false, state);
        }
    }

    private final void changeTextColor(boolean firstSelected, FinSwitchItem.State state) {
        g.a(new Function2() { // from class: ca0.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit changeTextColor$lambda$5;
                changeTextColor$lambda$5 = FinSwitchItemView.changeTextColor$lambda$5(FinSwitchItemView.this, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                return changeTextColor$lambda$5;
            }
        }, firstSelected ? state.getSelectedTextColor() : state.getTextColor(), !firstSelected ? state.getSelectedTextColor() : state.getTextColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeTextColor$lambda$5(FinSwitchItemView finSwitchItemView, int i11, int i12) {
        finSwitchItemView.setTextColorAnimate(i12, i11, finSwitchItemView.firstText);
        finSwitchItemView.setTextColorAnimate(i11, i12, finSwitchItemView.secondText);
        return Unit.f71690a;
    }

    private final void refreshBackground() {
        ViewGroup.LayoutParams layoutParams = this.background.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int id2 = this.isFirstSelected ? this.firstText.getId() : this.secondText.getId();
        bVar.f41656t = id2;
        bVar.f41658v = id2;
        n.a(this, null);
        this.background.setLayoutParams(bVar);
    }

    private final void setTextColorAnimate(int firstColor, int secondColor, TextView textView) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(a.getColor(getContext(), firstColor)), Integer.valueOf(a.getColor(getContext(), secondColor)));
        ofObject.addUpdateListener(new C5795b(textView, 0));
        ofObject.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTextColorAnimate$lambda$6(TextView textView, ValueAnimator valueAnimator) {
        textView.setTextColor(((Integer) Bi.a.b(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Int")).intValue());
    }

    @Override // ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem.View
    public void bindState(@NotNull FinSwitchItem.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setBackgroundResource(state.getBackground());
        setClipToOutline(true);
        this.background.setBackgroundResource(state.getBtnBackground());
        setElevation(state.getElevation());
        Context context = getContext();
        String string = context.getString(state.getFirst().getTitle());
        if (!Intrinsics.d(this.firstText.getText(), string)) {
            this.firstText.setText(string);
        }
        String string2 = context.getString(state.getSecond().getTitle());
        if (!Intrinsics.d(this.secondText.getText(), string2)) {
            this.secondText.setText(string2);
        }
        if (this.isFirstSelected != state.isFirstSelected() || this.isFirstBind) {
            this.isFirstSelected = state.isFirstSelected();
            refreshBackground();
            changeTextColor(this.isFirstSelected, state);
        }
        int i11 = 1;
        this.firstText.setOnClickListener(new PP.a(i11, this, state));
        this.secondText.setOnClickListener(new b(i11, this, state));
        if (this.isFirstBind) {
            setMinHeight(D.c(state.getSize().getHeightInDp()));
        }
        this.isFirstBind = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinSwitchItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FinSwitchItemView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinSwitchItemView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isFirstBind = true;
        LayoutInflater.from(context).inflate(R.layout.input_switch_item_view, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.firstText = (TextView) findViewById(R.id.first_text);
        this.secondText = (TextView) findViewById(R.id.second_text);
        this.background = findViewById(R.id.background);
        setMinHeight(D.c(56.0f));
        setBackgroundResource(R.drawable.background_switch_view);
        setClipToOutline(true);
    }
}
