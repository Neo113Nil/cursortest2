package ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.presentation;

import Fj.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingExtKt;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProvider;
import ru.ozon.app.android.travel.utils.ds.DesignSystemDimensProviderKt;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "applyConstraints", "()V", "setupBackground", "setupRippleEffect", "", "radius", "Landroid/graphics/drawable/Drawable;", "provideRippleBackground", "(F)Landroid/graphics/drawable/Drawable;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "dsProvider", "Lru/ozon/app/android/travel/utils/ds/DesignSystemDimensProvider;", "", "dp8", "I", "dp16", "radius20", "F", "Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "toursSortingSelectionView", "Lru/ozon/app/android/uikit/view/atoms/select/SelectView;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "toursSortingResultCountTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSortingView extends ConstraintLayout {
    private final int dp16;
    private final int dp8;

    @NotNull
    private final DesignSystemDimensProvider dsProvider;
    private final float radius20;

    @NotNull
    private final TextAtomV2View toursSortingResultCountTextView;

    @NotNull
    private final SelectView toursSortingSelectionView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSortingView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        DesignSystemDimensProvider dimens$default = DesignSystemDimensProviderKt.dimens$default(context, null, 1, null);
        this.dsProvider = dimens$default;
        this.dp8 = dimens$default.getMargin8();
        this.dp16 = dimens$default.getMargin16();
        this.radius20 = dimens$default.getRadius20();
        SelectView selectView = new SelectView(context, null, 0, 6, null);
        selectView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41616W = true;
        bVar.f41603J = 1;
        selectView.setLayoutParams(bVar);
        this.toursSortingSelectionView = selectView;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.g(N.b(TextAtomV2View.class), context);
        ConstraintLayout.b b11 = c.b(-2, -2, textAtomV2View);
        b11.f41616W = true;
        b11.f41598E = 1.0f;
        textAtomV2View.setLayoutParams(b11);
        this.toursSortingResultCountTextView = textAtomV2View;
        addView(selectView);
        addView(textAtomV2View);
        applyConstraints();
        setupBackground();
        setupRippleEffect();
    }

    private final void applyConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.toursSortingSelectionView);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.toursSortingSelectionView);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.toursSortingSelectionView);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.toursSortingResultCountTextView);
        ConstraintLayoutExtensionsKt.bottomToParent(dVar, this.toursSortingResultCountTextView);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.toursSortingResultCountTextView, this.toursSortingSelectionView, this.dp8);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.toursSortingResultCountTextView, this.dp16);
        dVar.f(this);
    }

    private final Drawable provideRippleBackground(float radius) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, radius, radius}, null, null));
        shapeDrawable.getPaint().setColor(-1);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new RippleDrawable(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgActionSecondary)), null, shapeDrawable);
    }

    private final void setupBackground() {
        RoundedBackgroundProducer roundedBackgroundProducer = new RoundedBackgroundProducer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        float f7 = this.radius20;
        setBackground(RoundedBackgroundProducer.produce$default(roundedBackgroundProducer, themeColor, 0.0f, 0.0f, f7, f7, 6, null));
    }

    private final void setupRippleEffect() {
        this.toursSortingSelectionView.setBackground(provideRippleBackground(this.radius20));
    }

    public final void bind(@NotNull ToursSortingVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        TravelSortingExtKt.bind(this.toursSortingSelectionView, item.getSortingInfo(), onAction);
        TextHolderKt.bindOrGone$default(this.toursSortingResultCountTextView, item.getSearchResultCount(), null, 2, null);
    }
}
