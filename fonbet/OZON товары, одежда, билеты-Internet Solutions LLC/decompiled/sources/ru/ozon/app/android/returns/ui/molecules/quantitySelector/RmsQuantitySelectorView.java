package ru.ozon.app.android.returns.ui.molecules.quantitySelector;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015J$\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00110\u0015J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelectorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "decreaseButton", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "increaseButton", "quantityText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "quantitySelector", "Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelector;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindOrGone", "initContainer", "connectConstraints", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RmsQuantitySelectorView extends ConstraintLayout {

    @NotNull
    private final IconButtonV3View decreaseButton;

    @NotNull
    private final IconButtonV3View increaseButton;

    @NotNull
    private final TextAtomV2View quantityText;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int ID_DECREASE_BUTTON = View.generateViewId();
    private static final int ID_INCREASE_BUTTON = View.generateViewId();
    private static final int ID_QUANTITY_TEXT = View.generateViewId();
    private static final int VERTICAL_MARGIN = UiExtKt.toPx(12);
    private static final int HORIZONTAL_MARGIN = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/quantitySelector/RmsQuantitySelectorView$Companion;", "", "<init>", "()V", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RmsQuantitySelectorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void connectConstraints() {
        d dVar = new d();
        dVar.p(this);
        int i11 = ID_DECREASE_BUTTON;
        dVar.s(i11, 6, 0, 6);
        dVar.s(i11, 3, 0, 3);
        dVar.s(i11, 4, 0, 4);
        int i12 = ID_QUANTITY_TEXT;
        dVar.s(i11, 7, i12, 6);
        dVar.s(i12, 6, i11, 7);
        dVar.s(i12, 3, 0, 3);
        dVar.s(i12, 4, 0, 4);
        int i13 = ID_INCREASE_BUTTON;
        dVar.s(i12, 7, i13, 6);
        int i14 = HORIZONTAL_MARGIN;
        dVar.e0(i12, 6, i14);
        int i15 = VERTICAL_MARGIN;
        dVar.e0(i12, 3, i15);
        dVar.e0(i12, 4, i15);
        dVar.e0(i12, 7, i14);
        dVar.s(i13, 6, i12, 7);
        dVar.s(i13, 3, 0, 3);
        dVar.s(i13, 4, 0, 4);
        dVar.s(i13, 7, 0, 7);
        dVar.E(new int[]{i11, i12, i13}, null, 1);
        dVar.f(this);
    }

    private final void initContainer() {
        setLayoutParams(new ConstraintLayout.b(-2, -2));
    }

    public final void bind(@NotNull RmsQuantitySelector quantitySelector, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(quantitySelector, "quantitySelector");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ViewExtKt.show(this);
        IconButtonV3HolderKt.bind(this.increaseButton, quantitySelector.getIncrease(), actionHandler);
        IconButtonV3HolderKt.bind(this.decreaseButton, quantitySelector.getDecrease(), actionHandler);
        TextHolderKt.bind(this.quantityText, quantitySelector.getQuantity(), actionHandler);
    }

    public final void bindOrGone(RmsQuantitySelector quantitySelector, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (quantitySelector != null) {
            bind(quantitySelector, actionHandler);
        } else {
            ru.ozon.uni.android.uikit.extensions.view.ViewExtKt.gone(this);
        }
    }

    public /* synthetic */ RmsQuantitySelectorView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RmsQuantitySelectorView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(ID_DECREASE_BUTTON);
        addView(iconButtonV3View);
        this.decreaseButton = iconButtonV3View;
        IconButtonV3View iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View2.setId(ID_INCREASE_BUTTON);
        addView(iconButtonV3View2);
        this.increaseButton = iconButtonV3View2;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(ID_QUANTITY_TEXT);
        addView(textAtomV2View);
        this.quantityText = textAtomV2View;
        connectConstraints();
        initContainer();
    }
}
