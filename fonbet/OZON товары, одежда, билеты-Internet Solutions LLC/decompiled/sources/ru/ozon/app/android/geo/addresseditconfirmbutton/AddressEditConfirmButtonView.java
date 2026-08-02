package ru.ozon.app.android.geo.addresseditconfirmbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00140\u001aJ\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/geo/addresseditconfirmbutton/AddressEditConfirmButtonView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp8", "dp16", "atomicLayout", "Landroid/widget/LinearLayout;", "mainButton", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "iconButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "bind", "", "button", "Lru/ozon/uni/atoms/data/AtomDTO;", "sharingButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updatePaddingForLargeButton", "buildButton", "buildIconButton", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditConfirmButtonView extends FrameLayout {

    @NotNull
    private final LinearLayout atomicLayout;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final IconButtonV3View iconButton;

    @NotNull
    private final SingleAtom mainButton;

    public /* synthetic */ AddressEditConfirmButtonView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final SingleAtom buildButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setId(R$id.confirmButton);
        LinearLayout linearLayout = this.atomicLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        Unit unit = Unit.f71690a;
        linearLayout.addView(singleAtom, layoutParams);
        return singleAtom;
    }

    private final IconButtonV3View buildIconButton() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(R$id.sharingButton);
        LinearLayout linearLayout = this.atomicLayout;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, this.dp16, 0);
        Unit unit = Unit.f71690a;
        linearLayout.addView(iconButtonV3View, layoutParams);
        return iconButtonV3View;
    }

    private final void updatePaddingForLargeButton(AtomDTO button) {
        if (button instanceof ButtonV3Atom.LargeButton) {
            LinearLayout linearLayout = this.atomicLayout;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i11 = this.dp16;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i11;
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public final void bind(@NotNull AtomDTO button, IconButtonV3DTO sharingButton, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        SingleAtom.bind$default(this.mainButton, button, false, 2, null);
        this.mainButton.setOnAction(onAction);
        updatePaddingForLargeButton(button);
        IconButtonV3HolderKt.bindOrGone(this.iconButton, sharingButton, onAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressEditConfirmButtonView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8);
        this.dp8 = px;
        this.dp16 = ResourceExtKt.toPx(16);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setPadding(0, px, 0, px);
        linearLayout.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(linearLayout);
        this.atomicLayout = linearLayout;
        setId(ru.ozon.app.android.composer.R$id.addressEditConfirmButton);
        this.mainButton = buildButton();
        this.iconButton = buildIconButton();
    }
}
