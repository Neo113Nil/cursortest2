package ru.ozon.app.android.account.orders.emptyscreen.antibot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/antibot/AntibotBarcodeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "navbarBackground", "Landroid/view/View;", "getNavbarBackground", "()Landroid/view/View;", "toolbarTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getToolbarTextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getIconButtonView", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "barcodeView", "Landroidx/compose/ui/platform/ComposeView;", "getBarcodeView", "()Landroidx/compose/ui/platform/ComposeView;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AntibotBarcodeView extends ConstraintLayout {

    @NotNull
    private final ComposeView barcodeView;

    @NotNull
    private final IconButtonV3View iconButtonView;

    @NotNull
    private final View navbarBackground;

    @NotNull
    private final TextAtomV2View toolbarTextView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.account.orders.emptyscreen.antibot.AntibotBarcodeView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            ConstraintSetExtKt.startToStart$default(updateConstraints, AntibotBarcodeView.this.getToolbarTextView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(updateConstraints, AntibotBarcodeView.this.getToolbarTextView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToTop(updateConstraints, AntibotBarcodeView.this.getToolbarTextView().getId(), 0, ResourceExtKt.toPx(10, this.$context));
            updateConstraints.C(AntibotBarcodeView.this.getToolbarTextView().getId(), true);
            ConstraintSetExtKt.endToEnd(updateConstraints, AntibotBarcodeView.this.getIconButtonView().getId(), 0, ResourceExtKt.toPx(16, this.$context));
            ConstraintSetExtKt.topToTop$default(updateConstraints, AntibotBarcodeView.this.getIconButtonView().getId(), AntibotBarcodeView.this.getToolbarTextView().getId(), 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(updateConstraints, AntibotBarcodeView.this.getIconButtonView().getId(), AntibotBarcodeView.this.getToolbarTextView().getId(), 0, 4, null);
            ConstraintSetExtKt.startToStart$default(updateConstraints, AntibotBarcodeView.this.getNavbarBackground().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(updateConstraints, AntibotBarcodeView.this.getNavbarBackground().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToTop$default(updateConstraints, AntibotBarcodeView.this.getNavbarBackground().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.bottomToTop(updateConstraints, AntibotBarcodeView.this.getNavbarBackground().getId(), AntibotBarcodeView.this.getBarcodeView().getId(), ResourceExtKt.toPx(40, this.$context) * (-1));
            ConstraintSetExtKt.startToStart$default(updateConstraints, AntibotBarcodeView.this.getBarcodeView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.endToEnd$default(updateConstraints, AntibotBarcodeView.this.getBarcodeView().getId(), 0, 0, 4, null);
            ConstraintSetExtKt.topToBottom(updateConstraints, AntibotBarcodeView.this.getBarcodeView().getId(), AntibotBarcodeView.this.getToolbarTextView().getId(), ResourceExtKt.toPx(22, this.$context));
        }
    }

    public /* synthetic */ AntibotBarcodeView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final ComposeView getBarcodeView() {
        return this.barcodeView;
    }

    @NotNull
    public final IconButtonV3View getIconButtonView() {
        return this.iconButtonView;
    }

    @NotNull
    public final View getNavbarBackground() {
        return this.navbarBackground;
    }

    @NotNull
    public final TextAtomV2View getToolbarTextView() {
        return this.toolbarTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AntibotBarcodeView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        addView(view);
        this.navbarBackground = view;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-1, -2));
        addView(textAtomV2View);
        this.toolbarTextView = textAtomV2View;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconButtonV3View);
        this.iconButtonView = iconButtonV3View;
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setId(View.generateViewId());
        composeView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        addView(composeView);
        this.barcodeView = composeView;
        setId(View.generateViewId());
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1(context));
    }
}
