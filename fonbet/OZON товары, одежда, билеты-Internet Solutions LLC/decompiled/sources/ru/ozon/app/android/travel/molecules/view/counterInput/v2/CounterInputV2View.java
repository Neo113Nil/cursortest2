package ru.ozon.app.android.travel.molecules.view.counterInput.v2;

import F3.G;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.g;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.travel.ui.molecules.R$drawable;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001eJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0007J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/counterInput/v2/CounterInputV2View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dp8", "currentValueTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "decrementButtonIBV", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getDecrementButtonIBV", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "decrementLoaderViewLV", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "getDecrementLoaderViewLV", "()Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "incrementButtonIBV", "getIncrementButtonIBV", "incrementLoaderViewLV", "getIncrementLoaderViewLV", "bind", "", "dto", "Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "setCurrentValueHorizontalMargin", "dp", "addViews", "setConstraints", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CounterInputV2View extends ConstraintLayout {
    public static final int $stable;

    @NotNull
    private final TextAtomV2View currentValueTAV;

    @NotNull
    private final IconButtonV3View decrementButtonIBV;

    @NotNull
    private final LoaderView decrementLoaderViewLV;
    private final int dp8;

    @NotNull
    private final IconButtonV3View incrementButtonIBV;

    @NotNull
    private final LoaderView incrementLoaderViewLV;

    static {
        int i11 = LoaderView.$stable;
        int i12 = IconButtonV3View.$stable;
        $stable = i11 | i11 | i12 | i12 | TextAtomV2View.$stable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CounterInputV2View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViews() {
        addView(this.currentValueTAV);
        addView(this.decrementButtonIBV);
        addView(this.incrementButtonIBV);
        addView(this.decrementLoaderViewLV);
        addView(this.incrementLoaderViewLV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new CounterInputV2View$setConstraints$1(this));
    }

    public final void bind(@NotNull CounterInputV2DTO dto, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        TextHolderKt.bind$default(this.currentValueTAV, dto.getCurrentValue(), null, 2, null);
        IconButtonV3HolderKt.bind(this.decrementButtonIBV, dto.getDecrementButton(), actionHandler);
        IconButtonV3HolderKt.bind(this.incrementButtonIBV, dto.getIncrementButton(), actionHandler);
        LoaderView loaderView = this.decrementLoaderViewLV;
        loaderView.setBackground(this.decrementButtonIBV.getBackground());
        loaderView.setColor(this.decrementButtonIBV.getIconColor());
        LoaderView loaderView2 = this.incrementLoaderViewLV;
        loaderView2.setBackground(this.incrementButtonIBV.getBackground());
        loaderView2.setColor(this.incrementButtonIBV.getIconColor());
    }

    @NotNull
    public final IconButtonV3View getDecrementButtonIBV() {
        return this.decrementButtonIBV;
    }

    @NotNull
    public final LoaderView getDecrementLoaderViewLV() {
        return this.decrementLoaderViewLV;
    }

    @NotNull
    public final IconButtonV3View getIncrementButtonIBV() {
        return this.incrementButtonIBV;
    }

    @NotNull
    public final LoaderView getIncrementLoaderViewLV() {
        return this.incrementLoaderViewLV;
    }

    public final void setCurrentValueHorizontalMargin(int dp) {
        ViewGroup.LayoutParams layoutParams = this.currentValueTAV.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) != dp) {
            ViewGroup.LayoutParams layoutParams2 = this.currentValueTAV.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if ((marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0) != dp) {
                TextAtomV2View textAtomV2View = this.currentValueTAV;
                ViewGroup.LayoutParams layoutParams3 = textAtomV2View.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.leftMargin = dp;
                marginLayoutParams3.rightMargin = dp;
                textAtomV2View.setLayoutParams(marginLayoutParams3);
            }
        }
    }

    public /* synthetic */ CounterInputV2View(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterInputV2View(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context);
        G.g(textAtomV2View, R$id.counterInputV2CurrentValueTAV, -1, -2);
        textAtomV2View.setMinWidth(UiExtKt.toPx(32, context));
        this.currentValueTAV = textAtomV2View;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View == null) {
            iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
            iconButtonV3View.setId(R$id.counterInputV2DecrementButtonIBV);
            iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        }
        this.decrementButtonIBV = iconButtonV3View;
        LoaderView loaderView = new LoaderView(context, null, 0, 6, null);
        loaderView.setId(R$id.counterInputV2DecrementLoaderViewLV);
        loaderView.setLayoutParams(new ConstraintLayout.b(0, 0));
        loaderView.setBackground(g.d(loaderView.getResources(), R$drawable.bg_rounded_primary_8, context.getTheme()));
        loaderView.setPadding(px, px, px, px);
        LoaderSize loaderSize = LoaderSize.LOADER_200;
        loaderView.setLoaderSize(loaderSize);
        loaderView.setVisibility(8);
        this.decrementLoaderViewLV = loaderView;
        IconButtonV3View iconButtonV3View2 = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View2 == null) {
            iconButtonV3View2 = new IconButtonV3View(context, null, 0, 0, 14, null);
            iconButtonV3View2.setId(R$id.counterInputV2IncrementButtonIBV);
            iconButtonV3View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        }
        this.incrementButtonIBV = iconButtonV3View2;
        LoaderView loaderView2 = new LoaderView(context, null, 0, 6, null);
        loaderView2.setId(R$id.counterInputV2IncrementLoaderViewLV);
        loaderView2.setLayoutParams(new ConstraintLayout.b(0, 0));
        loaderView2.setBackground(g.d(loaderView2.getResources(), R$drawable.bg_rounded_primary_8, context.getTheme()));
        loaderView2.setPadding(px, px, px, px);
        loaderView2.setLoaderSize(loaderSize);
        loaderView2.setVisibility(8);
        this.incrementLoaderViewLV = loaderView2;
        addViews();
        setConstraints();
    }
}
