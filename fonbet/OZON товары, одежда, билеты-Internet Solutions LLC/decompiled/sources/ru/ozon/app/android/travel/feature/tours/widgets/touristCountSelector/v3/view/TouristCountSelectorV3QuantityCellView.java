package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
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
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0010H\u0007J.\u0010\u001c\u001a\u00020\u00112\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\b\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/view/TouristCountSelectorV3QuantityCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp2", "dp16", "dp48", "onPlusButtonClicked", "Lkotlin/Function1;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "", "onMinusButtonClicked", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTv", "minusButtonIbv", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "countTv", "plusButtonIbv", "bind", "item", "setupCallbacks", "addViews", "placeViews", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TouristCountSelectorV3QuantityCellView extends ConstraintLayout {

    @NotNull
    private final AppCompatTextView countTv;
    private final int dp16;
    private final int dp2;
    private final int dp48;

    @NotNull
    private final IconButtonV3View minusButtonIbv;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked;
    private Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked;

    @NotNull
    private final IconButtonV3View plusButtonIbv;

    @NotNull
    private final AppCompatTextView subtitleTv;

    @NotNull
    private final AppCompatTextView titleTv;

    public /* synthetic */ TouristCountSelectorV3QuantityCellView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTv);
        addView(this.subtitleTv);
        addView(this.minusButtonIbv);
        addView(this.countTv);
        addView(this.plusButtonIbv);
    }

    private final void placeViews() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.titleTv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.titleTv.getId(), this.minusButtonIbv.getId(), this.dp16);
        dVar.C(this.titleTv.getId(), true);
        dVar.c0(0.0f, this.titleTv.getId());
        ConstraintSetExtKt.startToStart$default(dVar, this.subtitleTv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, this.subtitleTv.getId(), this.titleTv.getId(), this.dp2);
        ConstraintSetExtKt.endToStart(dVar, this.subtitleTv.getId(), this.minusButtonIbv.getId(), this.dp16);
        dVar.C(this.subtitleTv.getId(), true);
        dVar.c0(0.0f, this.subtitleTv.getId());
        ConstraintSetExtKt.topToTop$default(dVar, this.minusButtonIbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.minusButtonIbv.getId(), this.plusButtonIbv.getId(), this.dp48);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.minusButtonIbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToEnd$default(dVar, this.countTv.getId(), this.minusButtonIbv.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.countTv.getId(), this.plusButtonIbv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart$default(dVar, this.countTv.getId(), this.plusButtonIbv.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.countTv.getId(), this.plusButtonIbv.getId(), 0, 4, null);
        dVar.C(this.countTv.getId(), true);
        ConstraintSetExtKt.topToTop$default(dVar, this.plusButtonIbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.plusButtonIbv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.plusButtonIbv.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    @SuppressLint({"SetTextI18n"})
    public final void bind(@NotNull TouristCountSelectorV3QuantityCellVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.titleTv;
        appCompatTextView.setText(item.getTitle().getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(item.getTitle().getTypographyToken());
        if (parseTextStyle != null) {
            appCompatTextView.setTextAppearance(parseTextStyle.intValue());
        }
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, item.getTitle().getTextColor(), UniColors.TEXT_PRIMARY.getResId()));
        AppCompatTextView appCompatTextView2 = this.subtitleTv;
        appCompatTextView2.setText(item.getSubtitle().getText());
        Integer parseTextStyle2 = styleParser.parseTextStyle(item.getSubtitle().getTypographyToken());
        if (parseTextStyle2 != null) {
            appCompatTextView2.setTextAppearance(parseTextStyle2.intValue());
        }
        Context context2 = appCompatTextView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView2.setTextColor(styleParser.parseColor(context2, item.getSubtitle().getTextColor(), UniColors.TEXT_SECONDARY.getResId()));
        this.countTv.setText(String.valueOf(item.getValue()));
        IconButtonV3View iconButtonV3View = this.minusButtonIbv;
        IconButtonV3HolderKt.bind$default(iconButtonV3View, item.getDecreaseButton(), null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(iconButtonV3View, 0L, new TouristCountSelectorV3QuantityCellView$bind$3$1(this, item), 1, null);
        IconButtonV3View iconButtonV3View2 = this.plusButtonIbv;
        IconButtonV3HolderKt.bind$default(iconButtonV3View2, item.getIncreaseButton(), null, 2, null);
        ViewExtKt.setOnClickListenerThrottle$default(iconButtonV3View2, 0L, new TouristCountSelectorV3QuantityCellView$bind$4$1(this, item), 1, null);
    }

    public final void setupCallbacks(@NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onPlusButtonClicked, @NotNull Function1<? super TouristCountSelectorV3QuantityCellVO, Unit> onMinusButtonClicked) {
        Intrinsics.checkNotNullParameter(onPlusButtonClicked, "onPlusButtonClicked");
        Intrinsics.checkNotNullParameter(onMinusButtonClicked, "onMinusButtonClicked");
        this.onPlusButtonClicked = onPlusButtonClicked;
        this.onMinusButtonClicked = onMinusButtonClicked;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouristCountSelectorV3QuantityCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp2 = ResourceExtKt.toPx(2, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp48 = ResourceExtKt.toPx(48, context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.touristCountSelectorV3CellTitleTv);
        appCompatTextView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.titleTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.touristCountSelectorV3CellSubtitleTv);
        appCompatTextView2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.subtitleTv = appCompatTextView2;
        q qVar = q.f64554a;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context);
        if (iconButtonV3View == null) {
            context2 = context;
            iconButtonV3View = new IconButtonV3View(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        iconButtonV3View.setId(R$id.touristCountSelectorV3CellMinusButtonIbv);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.minusButtonIbv = iconButtonV3View;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context2);
        appCompatTextView3.setId(R$id.touristCountSelectorV3CellCountTv);
        appCompatTextView3.setLayoutParams(new ConstraintLayout.b(-2, -2));
        appCompatTextView3.setTextAppearance(R$style.OzonTextAppearance_Body_400small);
        appCompatTextView3.setTextColor(ThemeExtKt.themeColor(context2, R$attr.textPrimary));
        this.countTv = appCompatTextView3;
        IconButtonV3View iconButtonV3View2 = (IconButtonV3View) qVar.i(N.b(IconButtonV3View.class), context2);
        iconButtonV3View2 = iconButtonV3View2 == null ? new IconButtonV3View(context2, null, 0, 0, 14, null) : iconButtonV3View2;
        iconButtonV3View2.setId(R$id.touristCountSelectorV3CellPlusButtonIbv);
        iconButtonV3View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.plusButtonIbv = iconButtonV3View2;
        addViews();
        placeViews();
    }
}
