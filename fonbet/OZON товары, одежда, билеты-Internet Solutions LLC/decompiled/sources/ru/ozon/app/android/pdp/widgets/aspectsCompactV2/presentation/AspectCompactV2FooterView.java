package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "leftButtonV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getLeftButtonV", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "rightButtonV", "getRightButtonV", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO;", "setupConstraints", "createLeftButtonView", "createRightButtonView", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectCompactV2FooterView extends ConstraintLayout {
    public static final int $stable = TextAtomV2View.$stable;

    @NotNull
    private final TextAtomV2View leftButtonV;

    @NotNull
    private final TextAtomV2View rightButtonV;

    public /* synthetic */ AspectCompactV2FooterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final TextAtomV2View createLeftButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.leftButtonTav);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomV2View.setClickable(true);
        textAtomV2View.setTextIsSelectable(false);
        return textAtomV2View;
    }

    private final TextAtomV2View createRightButtonView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(R$id.rightButtonTav);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setClickable(true);
        textAtomV2View.setTextIsSelectable(false);
        return textAtomV2View;
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new AspectCompactV2FooterView$setupConstraints$1(this));
    }

    public final void bind(@NotNull AspectCompactV2FooterVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomV2View textAtomV2View = this.leftButtonV;
        AspectCompactV2FooterVO.TextButton leftButton = item.getLeftButton();
        TextHolderKt.bindOrGone$default(textAtomV2View, leftButton != null ? leftButton.getButton() : null, null, 2, null);
        TextAtomV2View textAtomV2View2 = this.rightButtonV;
        AspectCompactV2FooterVO.TextButton rightButton = item.getRightButton();
        TextHolderKt.bindOrGone$default(textAtomV2View2, rightButton != null ? rightButton.getButton() : null, null, 2, null);
    }

    @NotNull
    public final TextAtomV2View getLeftButtonV() {
        return this.leftButtonV;
    }

    @NotNull
    public final TextAtomV2View getRightButtonV() {
        return this.rightButtonV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectCompactV2FooterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams.setMargins(dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, dimens.getDP_16(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        setLayoutParams(layoutParams);
        TextAtomV2View createLeftButtonView = createLeftButtonView();
        this.leftButtonV = createLeftButtonView;
        TextAtomV2View createRightButtonView = createRightButtonView();
        this.rightButtonV = createRightButtonView;
        addView(createLeftButtonView);
        addView(createRightButtonView);
        setupConstraints();
    }
}
