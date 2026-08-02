package ru.ozon.app.android.cart.controls.v2.presentation;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010\"J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010&\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010(H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionBtn", "Lru/ozon/uni/android/uikit/view/atoms/buttons/borderless/SmallBorderlessButtonView;", "checkbox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "getCheckbox", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkboxTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getCheckboxTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "onActionBtnClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getOnActionBtnClick", "()Lkotlin/jvm/functions/Function1;", "setOnActionBtnClick", "(Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "setOldSelection", "selected", "", "(Ljava/lang/Boolean;)V", "setSelectionText", "selectionText", "", "bindActionButton", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButton;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsView extends ConstraintLayout {

    @NotNull
    private final SmallBorderlessButtonView actionBtn;

    @NotNull
    private final CheckBoxView checkbox;

    @NotNull
    private final AppCompatTextView checkboxTv;
    private Function1<? super AtomAction, Unit> onActionBtnClick;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dividersHeight = ResourceExtKt.toPx(1);
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int dp16 = ResourceExtKt.toPx(16);
    private static final int layoutHeight = ResourceExtKt.toPx(40);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView$Companion;", "", "<init>", "()V", "", "CHECKBOX_LOCATOR", "Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ControlsView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void bindActionButton(ButtonV3Atom.SmallBorderlessButton button) {
        SmallBorderlessButtonView smallBorderlessButtonView = this.actionBtn;
        WrappedBorderlessButtonHolderKt.bindOrGone(smallBorderlessButtonView, button, new ControlsView$bindActionButton$1$1(this));
        smallBorderlessButtonView.setTextAppearance(R$style.TextStyle_Body_L);
        Context context = smallBorderlessButtonView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        smallBorderlessButtonView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textNegative));
    }

    private final void setOldSelection(Boolean selected) {
        AppCompatTextView appCompatTextView = this.checkboxTv;
        if (selected == null) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            appCompatTextView.setSelected(selected.booleanValue());
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(R$drawable.selector_checkbox, 0, 0, 0);
        }
    }

    private final void setSelectionText(String selectionText) {
        TextViewExtKt.setTextOrGone(this.checkboxTv, selectionText);
    }

    public final void bind(@NotNull ControlsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setOldSelection(item.getSelectAll().isSelected());
        setSelectionText(item.getSelectAll().getName());
        bindActionButton(item.getActionButton());
        CheckBoxHolderKt.bindOrGone$default(this.checkbox, item.getSelectAll().getCheckbox(), null, 2, null);
    }

    @NotNull
    public final CheckBoxView getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final AppCompatTextView getCheckboxTv() {
        return this.checkboxTv;
    }

    public final Function1<AtomAction, Unit> getOnActionBtnClick() {
        return this.onActionBtnClick;
    }

    public final void setOnActionBtnClick(Function1<? super AtomAction, Unit> function1) {
        this.onActionBtnClick = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlsView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        SmallBorderlessButtonView smallBorderlessButtonView = (SmallBorderlessButtonView) qVar.i(N.b(SmallBorderlessButtonView.class), context);
        if (smallBorderlessButtonView == null) {
            context2 = context;
            smallBorderlessButtonView = new SmallBorderlessButtonView(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        addView(smallBorderlessButtonView);
        smallBorderlessButtonView.setId(R$id.actionButton);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        int i12 = dp6;
        int i13 = dp16;
        bVar.setMargins(0, i12, i13, i12);
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        smallBorderlessButtonView.setLayoutParams(bVar);
        int i14 = dp4;
        smallBorderlessButtonView.setPadding(i14, 0, i14, 0);
        this.actionBtn = smallBorderlessButtonView;
        Context context3 = context2;
        CheckBoxView checkBoxView = new CheckBoxView(context3, null, 0, 6, null);
        checkBoxView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41656t = 0;
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.setMarginStart(i13);
        checkBoxView.setLayoutParams(bVar2);
        checkBoxView.setVisibility(8);
        checkBoxView.setLocatorTag("controls.checkbox");
        addView(checkBoxView);
        this.checkbox = checkBoxView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) qVar.i(N.b(AppCompatTextView.class), context3);
        appCompatTextView = appCompatTextView == null ? new AppCompatTextView(context3) : appCompatTextView;
        addView(appCompatTextView);
        appCompatTextView.setId(R$id.checkboxTv);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41655s = checkBoxView.getId();
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        bVar3.f41657u = R$id.actionButton;
        bVar3.f41594A = dp12;
        bVar3.setMarginStart(i14);
        bVar3.f41616W = true;
        bVar3.f41598E = 0.0f;
        appCompatTextView.setLayoutParams(bVar3);
        appCompatTextView.setGravity(16);
        appCompatTextView.setPadding(i14, i14, i14, i14);
        appCompatTextView.setCompoundDrawablePadding(i12);
        appCompatTextView.setBackground(a.getDrawable(context3, R$drawable.bg_ripple_blue_rounded));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.checkboxTv = appCompatTextView;
        View view = new View(context3);
        addView(view);
        view.setId(R$id.topDivider);
        int i15 = dividersHeight;
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, i15);
        bVar4.f41656t = 0;
        bVar4.f41636i = 0;
        bVar4.f41658v = 0;
        view.setLayoutParams(bVar4);
        view.setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.graphicNeutral));
        View view2 = new View(context3);
        addView(view2);
        view2.setId(R$id.dividerV);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, i15);
        bVar5.f41656t = 0;
        bVar5.f41642l = 0;
        bVar5.f41658v = 0;
        view2.setLayoutParams(bVar5);
        view2.setBackgroundColor(ThemeExtKt.themeColor(context3, R$attr.layerFloor1));
        setId(R$id.cartControlsRootContainer);
        setLayoutParams(new ConstraintLayout.b(-1, layoutHeight));
        setBackgroundResource(R$color.layer_floor_1);
        setClickable(true);
        setFocusable(true);
    }
}
