package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import XT.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J$\u0010\u0018\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultOptionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "desStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "iconSize", "pricePV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "dateTAV", "iconACIV", "Landroidx/appcompat/widget/AppCompatImageView;", "bind", "", "tourOption", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindOrGone", "addViews", "setConstrains", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultOptionView extends ConstraintLayout {

    @NotNull
    private final TextAtomView dateTAV;

    @NotNull
    private final AppCompatImageView iconACIV;
    private final int iconSize;

    @NotNull
    private final TextAtomView pricePV;

    public /* synthetic */ ToursSearchResultOptionView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.pricePV);
        addView(this.dateTAV);
        addView(this.iconACIV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4$lambda$3(Function1 function1, ToursSearchResultVO.TourOptionVO tourOptionVO, View view) {
        function1.invoke(tourOptionVO.getSelectAction());
    }

    private final void setConstrains() {
        d dVar = new d();
        dVar.p(this);
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.pricePV);
        ConstraintLayoutExtensionsKt.topToParent(dVar, this.pricePV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.pricePV);
        dVar.c0(0.0f, this.pricePV.getId());
        ConstraintLayoutExtensionsKt.startToParent(dVar, this.dateTAV);
        ConstraintLayoutExtensionsKt.topToBottom(dVar, this.dateTAV, this.pricePV);
        ConstraintLayoutExtensionsKt.startToEnd(dVar, this.iconACIV, this.dateTAV);
        ConstraintLayoutExtensionsKt.bottomToBottom(dVar, this.iconACIV, this.dateTAV);
        ConstraintLayoutExtensionsKt.topToTop(dVar, this.iconACIV, this.dateTAV);
        ConstraintLayoutExtensionsKt.endToParent(dVar, this.iconACIV);
        dVar.c0(0.0f, this.iconACIV.getId());
        dVar.f(this);
    }

    public final void bind(@NotNull ToursSearchResultVO.TourOptionVO tourOption, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(tourOption, "tourOption");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextAtomHolderKt.bind$default(this.pricePV, tourOption.getPrice(), null, 2, null);
        TextAtomHolderKt.bind$default(this.dateTAV, tourOption.getDate(), null, 2, null);
        ImageViewExtKt.load$default(this.iconACIV, tourOption.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, tourOption.getIcon().getTintColor());
        if (parseColor != null) {
            ThemeExtKt.tint(this.iconACIV, parseColor);
        }
        setOnClickListener(new a(0, actionHandler, tourOption));
    }

    public final void bindOrGone(ToursSearchResultVO.TourOptionVO tourOption, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (tourOption == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(tourOption, actionHandler);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultOptionView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.iconSize = px;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setId(View.generateViewId());
        textAtomView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.pricePV = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.dateTAV = textAtomView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px, px));
        this.iconACIV = appCompatImageView;
        addViews();
        setConstrains();
    }
}
