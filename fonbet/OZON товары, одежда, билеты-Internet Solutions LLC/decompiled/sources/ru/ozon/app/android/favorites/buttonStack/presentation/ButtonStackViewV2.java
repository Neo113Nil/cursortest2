package ru.ozon.app.android.favorites.buttonStack.presentation;

import B3.D;
import B90.C2618u;
import D40.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.buttonStack.data.ButtonStackDTO;
import ru.ozon.app.android.favorites.feature.R$id;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackViewV2;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftButton", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "rightButton", "additionalButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "bind", "", "item", "Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setCustomBackground", "setViewPaddings", "paddings", "Lru/ozon/app/android/favorites/buttonStack/data/ButtonStackDTO$StackPaddings;", "updateLeftButtonEndConstraint", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ButtonStackViewV2 extends ConstraintLayout {

    @NotNull
    private final IconButtonV3View additionalButton;

    @NotNull
    private final ButtonV3View leftButton;

    @NotNull
    private final ButtonV3View rightButton;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final float STACK_VIEW_CORNER_RADIUS = ResourceExtKt.toPx(24);
    private static final int STACK_VIEW_STROKE_WIDTH = ResourceExtKt.toPx(1);
    private static final int STACK_VIEW_BOTTOM_LINE_WIDTH = ResourceExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/favorites/buttonStack/presentation/ButtonStackViewV2$Companion;", "", "<init>", "()V", "", "STACK_VIEW_BOTTOM_LINE_DRAWABLE_INDEX", "I", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ButtonStackViewV2(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void setCustomBackground() {
        GradientDrawable b11 = D.b(0);
        b11.setColor(a.getColor(getContext(), R$color.layer_floor_1));
        float f7 = STACK_VIEW_CORNER_RADIUS;
        b11.setCornerRadii(new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f});
        b11.setStroke(STACK_VIEW_STROKE_WIDTH, a.getColor(getContext(), R$color.graphic_neutral));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(a.getColor(getContext(), R$color.layer_floor_1));
        gradientDrawable.setSize(0, STACK_VIEW_BOTTOM_LINE_WIDTH);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{b11, gradientDrawable});
        layerDrawable.setLayerGravity(1, 80);
        setBackground(layerDrawable);
    }

    private final void setViewPaddings(ButtonStackDTO.StackPaddings paddings) {
        Paddings bottom;
        Paddings top;
        Paddings right;
        Paddings left;
        int i11 = 0;
        int px = (paddings == null || (left = paddings.getLeft()) == null) ? 0 : ResourceExtKt.toPx(left.getPx());
        int px2 = (paddings == null || (right = paddings.getRight()) == null) ? 0 : ResourceExtKt.toPx(right.getPx());
        int px3 = (paddings == null || (top = paddings.getTop()) == null) ? 0 : ResourceExtKt.toPx(top.getPx());
        if (paddings != null && (bottom = paddings.getBottom()) != null) {
            i11 = ResourceExtKt.toPx(bottom.getPx());
        }
        setPadding(px, px3, px2, i11);
    }

    private final void updateLeftButtonEndConstraint(ButtonStackVO item) {
        ButtonV3View buttonV3View = this.leftButton;
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41657u = item.getIconButton() != null ? this.additionalButton.getId() : this.rightButton.getId();
        buttonV3View.setLayoutParams(bVar);
    }

    public final void bind(@NotNull ButtonStackVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setViewPaddings(item.getPaddings());
        ButtonV3HolderKt.bindOrGone(this.leftButton, item.getLeftButton(), actionHandler);
        ButtonV3HolderKt.bindOrGone(this.rightButton, item.getRightButton(), actionHandler);
        IconButtonV3HolderKt.bindOrGone(this.additionalButton, item.getIconButton(), actionHandler);
        updateLeftButtonEndConstraint(item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonStackViewV2(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ButtonV3View buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.leftButton, 0, -2);
        e11.f41656t = 0;
        e11.f41636i = 0;
        e11.f41642l = 0;
        e11.setMarginEnd(DP_8);
        e11.f41595B = 0;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.leftButton = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b e12 = C2618u.e(buttonV3View2, R$id.rightButton, 0, -2);
        e12.f41658v = 0;
        e12.f41636i = 0;
        e12.f41642l = 0;
        buttonV3View2.setLayoutParams(e12);
        addView(buttonV3View2);
        this.rightButton = buttonV3View2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        ConstraintLayout.b c11 = d.c(iconButtonV3View, R$id.additionalButton, -2, -2);
        c11.f41658v = 0;
        c11.f41636i = 0;
        c11.f41642l = 0;
        iconButtonV3View.setLayoutParams(c11);
        addView(iconButtonV3View);
        this.additionalButton = iconButtonV3View;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setCustomBackground();
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41657u = iconButtonV3View.getId();
        buttonV3View.setLayoutParams(bVar);
        ViewGroup.LayoutParams layoutParams2 = buttonV3View2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.f41655s = buttonV3View.getId();
        buttonV3View2.setLayoutParams(bVar2);
    }
}
