package ru.ozon.app.android.cart.controls.v3.presentation;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
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
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3VO;
import ru.ozon.app.android.cart.controls.v3.presentation.ControlsV3View$widgetOutlineProvider$2;
import ru.ozon.app.android.cart.feature.R$id;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.selectionControls.CheckBoxHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\"\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0001;B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\f*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\f0\u001b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010)\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00102\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u00106\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "", "setOldSelection", "(Ljava/lang/Boolean;)V", "", "selectionText", "isSelectApp", "setSelectionText", "(Ljava/lang/String;Z)V", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "cartProductSelectMode", "rightMargin", "setMargins", "(Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;ZI)V", "Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3VO;Lkotlin/jvm/functions/Function1;ZZ)V", "setupViewForApp", "(Z)V", "ru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View$widgetOutlineProvider$2$1", "widgetOutlineProvider$delegate", "LSc/j;", "getWidgetOutlineProvider", "()Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View$widgetOutlineProvider$2$1;", "widgetOutlineProvider", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "checkbox", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "getCheckbox", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "Landroidx/appcompat/widget/AppCompatTextView;", "checkboxTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getCheckboxTv", "()Landroidx/appcompat/widget/AppCompatTextView;", "removeIconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getRemoveIconButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "shareIconButton", "getShareIconButton", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "productsTotal", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsV3View extends ConstraintLayout {

    @NotNull
    private final CheckBoxView checkbox;

    @NotNull
    private final AppCompatTextView checkboxTv;

    @NotNull
    private final TextAtomV2View productsTotal;

    @NotNull
    private final IconButtonV3View removeIconButton;

    @NotNull
    private final IconButtonV3View shareIconButton;

    /* renamed from: widgetOutlineProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j widgetOutlineProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int dp4 = ResourceExtKt.toPx(4);
    private static final int dp6 = ResourceExtKt.toPx(6);
    private static final int dp8 = ResourceExtKt.toPx(8);
    private static final int dp12 = ResourceExtKt.toPx(12);
    private static final int layoutHeight = ResourceExtKt.toPx(56);
    private static final int cornerRadius = ResourceExtKt.toPx(24);
    private static final float cornerRadiusF = ResourceExtKt.toPxF(24);

    @NotNull
    private static final IconButtonV3DTO stubButton = new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE, "ic_s_trash_bin_filled", null, null, null, null, null, null, null, null, null, null, 16368, null);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/cart/controls/v3/presentation/ControlsV3View$Companion;", "", "<init>", "()V", "", "cornerRadius", "I", "getCornerRadius", "()I", "", "cornerRadiusF", "F", "getCornerRadiusF", "()F", "", "CHECKBOX_LOCATOR", "Ljava/lang/String;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getCornerRadius() {
            return ControlsV3View.cornerRadius;
        }

        public final float getCornerRadiusF() {
            return ControlsV3View.cornerRadiusF;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ControlsV3View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final ControlsV3View$widgetOutlineProvider$2.AnonymousClass1 getWidgetOutlineProvider() {
        return (ControlsV3View$widgetOutlineProvider$2.AnonymousClass1) this.widgetOutlineProvider.getValue();
    }

    private final void setMargins(IconButtonV3View iconButtonV3View, boolean z11, int i11) {
        ViewGroup.LayoutParams layoutParams = iconButtonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i12 = dp6;
        bVar.setMargins(0, i12, i11, z11 ? i12 : dp12);
        iconButtonV3View.setLayoutParams(bVar);
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

    private final void setSelectionText(String selectionText, boolean isSelectApp) {
        TextViewExtKt.setTextOrGone(this.checkboxTv, selectionText);
        if (isSelectApp) {
            this.checkboxTv.setTextColor(a.getColor(getContext(), R$color.text_light_key));
        }
    }

    public final void bind(@NotNull ControlsV3VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, boolean cartProductSelectMode, boolean isSelectApp) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ControlsV3VO.SelectAll selectAll = item.getSelectAll();
        setOldSelection(selectAll != null ? selectAll.isSelected() : null);
        ControlsV3VO.SelectAll selectAll2 = item.getSelectAll();
        setSelectionText(selectAll2 != null ? selectAll2.getName() : null, isSelectApp);
        IconButtonV3View iconButtonV3View = this.shareIconButton;
        IconButtonV3HolderKt.bindOrGone(iconButtonV3View, item.getShareIconButton(), actionHandler);
        int i11 = dp8;
        setMargins(iconButtonV3View, cartProductSelectMode, i11);
        IconButtonV3View iconButtonV3View2 = this.removeIconButton;
        if (item.getSetStubButton()) {
            IconButtonV3HolderKt.bindOrGone$default(iconButtonV3View2, stubButton, null, 2, null);
            iconButtonV3View2.setVisibility(4);
        } else {
            IconButtonV3HolderKt.bindOrGone(iconButtonV3View2, item.getRemoveIconButton(), actionHandler);
        }
        setMargins(iconButtonV3View2, cartProductSelectMode, 0);
        CheckBoxView checkBoxView = this.checkbox;
        ControlsV3VO.SelectAll selectAll3 = item.getSelectAll();
        CheckBoxHolderKt.bindOrGone$default(checkBoxView, selectAll3 != null ? selectAll3.getCheckbox() : null, null, 2, null);
        AppCompatTextView appCompatTextView = this.checkboxTv;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ControlsV3VO.SelectAll selectAll4 = item.getSelectAll();
        if ((selectAll4 != null ? selectAll4.getCheckbox() : null) == null) {
            i11 = 0;
        }
        bVar.setMarginStart(i11);
        bVar.f41657u = (item.getShareIconButton() != null ? this.shareIconButton : this.removeIconButton).getId();
        appCompatTextView.setLayoutParams(bVar);
        TextHolderKt.bindOrGone$default(this.productsTotal, item.getProductsTotal(), null, 2, null);
        setPadding(item.getHorizontalMargins(), 0, item.getHorizontalMargins(), 0);
        setOutlineProvider(item.getIsRounded() ? getWidgetOutlineProvider() : null);
        setupViewForApp(isSelectApp);
    }

    @NotNull
    public final CheckBoxView getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final AppCompatTextView getCheckboxTv() {
        return this.checkboxTv;
    }

    @NotNull
    public final IconButtonV3View getRemoveIconButton() {
        return this.removeIconButton;
    }

    @NotNull
    public final IconButtonV3View getShareIconButton() {
        return this.shareIconButton;
    }

    public final void setupViewForApp(boolean isSelectApp) {
        if (isSelectApp) {
            setBackgroundResource(R$color.bg_dark_key);
        } else {
            setBackgroundResource(R$color.layer_floor_1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlsV3View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.widgetOutlineProvider = LazyUtilsKt.unsafeLazy(ControlsV3View$widgetOutlineProvider$2.INSTANCE);
        q qVar = q.f64554a;
        View i12 = qVar.i(N.b(CheckBoxView.class), context);
        if (i12 == null) {
            context2 = context;
            i12 = new CheckBoxView(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        CheckBoxView checkBoxView = (CheckBoxView) i12;
        checkBoxView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        int i13 = dp6;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i13;
        checkBoxView.setLayoutParams(bVar);
        checkBoxView.setVisibility(8);
        checkBoxView.setLocatorTag("controls.checkbox");
        addView(i12);
        this.checkbox = checkBoxView;
        View i14 = qVar.i(N.b(AppCompatTextView.class), context2);
        i14 = i14 == null ? new AppCompatTextView(context2) : i14;
        AppCompatTextView appCompatTextView = (AppCompatTextView) i14;
        appCompatTextView.setId(R$id.checkboxTv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.f41655s = checkBoxView.getId();
        bVar2.f41636i = 0;
        bVar2.f41642l = 0;
        bVar2.f41616W = true;
        bVar2.f41598E = 0.0f;
        ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin = i13;
        appCompatTextView.setLayoutParams(bVar2);
        appCompatTextView.setGravity(16);
        int i15 = dp4;
        appCompatTextView.setPadding(0, i15, i15, i15);
        appCompatTextView.setCompoundDrawablePadding(i13);
        appCompatTextView.setBackground(a.getDrawable(context2, R$drawable.bg_ripple_blue_rounded));
        appCompatTextView.setTextAppearance(R$style.TextStyle_Body_L);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(i14);
        this.checkboxTv = appCompatTextView;
        View i16 = qVar.i(N.b(IconButtonV3View.class), context2);
        i16 = i16 == null ? new IconButtonV3View(context2, null, 0, 0, 14, null) : i16;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) i16;
        iconButtonV3View.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(-2, -2);
        bVar3.f41658v = 0;
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        iconButtonV3View.setLayoutParams(bVar3);
        addView(i16);
        this.removeIconButton = iconButtonV3View;
        View i17 = qVar.i(N.b(IconButtonV3View.class), context2);
        i17 = i17 == null ? new IconButtonV3View(context2, null, 0, 0, 14, null) : i17;
        IconButtonV3View iconButtonV3View2 = (IconButtonV3View) i17;
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(-2, -2);
        bVar4.f41657u = iconButtonV3View.getId();
        bVar4.f41636i = 0;
        bVar4.f41642l = 0;
        iconButtonV3View2.setLayoutParams(bVar4);
        addView(i17);
        this.shareIconButton = iconButtonV3View2;
        View i18 = qVar.i(N.b(TextAtomV2View.class), context2);
        i18 = i18 == null ? new TextAtomV2View(context2, null, 0, 6, null) : i18;
        TextAtomV2View textAtomV2View = (TextAtomV2View) i18;
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(-2, -2);
        bVar5.f41656t = 0;
        bVar5.f41636i = 0;
        bVar5.f41642l = 0;
        textAtomV2View.setLayoutParams(bVar5);
        addView(i18);
        this.productsTotal = textAtomV2View;
        setId(R$id.cartControlsRootContainer);
        setLayoutParams(new ConstraintLayout.b(-1, layoutHeight));
        setClickable(true);
        setFocusable(true);
        setClipToOutline(true);
    }
}
