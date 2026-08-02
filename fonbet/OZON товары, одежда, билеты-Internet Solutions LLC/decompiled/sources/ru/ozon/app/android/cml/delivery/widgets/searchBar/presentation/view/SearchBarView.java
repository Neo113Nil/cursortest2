package ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.view;

import Bi.b;
import HY.d;
import Kk.C3531a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.R$id;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.common.ext.Dimens;
import ru.ozon.app.android.cml.delivery.common.ext.DrawableExtKt;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.SearchBarVO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0014J\u0010\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'H\u0014J\u000e\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u0007J\"\u0010*\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/view/SearchBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "barBackground", "Landroid/view/View;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "placeholderTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "item", "Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/SearchBarVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "scrollDistanceToShow", "Ljava/lang/Integer;", "cornersPaint", "Landroid/graphics/Paint;", "topLeftCornerRect", "Landroid/graphics/RectF;", "topLeftCornerPath", "Landroid/graphics/Path;", "topRightCornerRect", "topRightCornerPath", "onSizeChanged", "newWidth", "newHeight", "oldWidth", "oldHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onScrollDistanceChanged", "newDistanceY", "bind", "bindBackground", "backgroundColor", "", "searchBarColor", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchBarView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final View barBackground;

    @NotNull
    private final Paint cornersPaint;

    @NotNull
    private final IconView iconView;
    private SearchBarVO item;

    @NotNull
    private final TextAtomV2View placeholderTv;
    private Integer scrollDistanceToShow;

    @NotNull
    private final Path topLeftCornerPath;

    @NotNull
    private final RectF topLeftCornerRect;

    @NotNull
    private final Path topRightCornerPath;

    @NotNull
    private final RectF topRightCornerRect;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float CONTENT_RADIUS = ResourceExtKt.toPxF(12);
    private static final float topCornersDiameter = Dimens.INSTANCE.getCalculatorTopCornersRadius() * 2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/searchBar/presentation/view/SearchBarView$Companion;", "", "<init>", "()V", "", "DEGREES_180", "F", "DEGREES_90", "DEGREES_0", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SearchBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(SearchBarView searchBarView, View view) {
        CommonControlSettings common;
        AtomAction atomAction$default;
        Function1<? super AtomAction, Unit> function1;
        SearchBarVO searchBarVO = searchBarView.item;
        if (searchBarVO == null || (common = searchBarVO.getCommon()) == null || (atomAction$default = CommonControlSettingsExtKt.atomAction$default(common, null, 1, null)) == null || (function1 = searchBarView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction$default);
    }

    private final void bindBackground(String backgroundColor, String searchBarColor) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawable.setColor(ColorStateList.valueOf(styleParser.parseColor(context, backgroundColor, R$color.layer_floor_1)));
        }
        Drawable background2 = this.barBackground.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            StyleParser styleParser2 = StyleParser.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            gradientDrawable2.setColor(ColorStateList.valueOf(styleParser2.parseColor(context2, searchBarColor, R$color.layer_floor_0)));
        }
    }

    public final void bind(@NotNull SearchBarVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setContentDescription(CommonControlSettingsExtKt.getAutomatizationId(item.getCommon()));
        this.item = item;
        this.actionHandler = actionHandler;
        int scrollDistanceToShow = item.getScrollDistanceToShow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.scrollDistanceToShow = Integer.valueOf(ResourceExtKt.toPx(scrollDistanceToShow, context));
        bindBackground(item.getBackgroundColor(), item.getBar().getBackgroundColor());
        IconHolderKt.bind$default(this.iconView, item.getBar().getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.placeholderTv, item.getBar().getPlaceholder(), null, 2, null);
        Paint paint = this.cornersPaint;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        paint.setColor(styleParser.parseColor(context2, item.getTopPatchColor(), R$color.layer_floor_0));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.topLeftCornerPath, this.cornersPaint);
        canvas.drawPath(this.topRightCornerPath, this.cornersPaint);
    }

    public final void onScrollDistanceChanged(int newDistanceY) {
        Integer num = this.scrollDistanceToShow;
        if (num != null) {
            setVisibility(newDistanceY >= num.intValue() ? 0 : 8);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int newWidth, int newHeight, int oldWidth, int oldHeight) {
        super.onSizeChanged(newWidth, newHeight, oldWidth, oldHeight);
        float width = getWidth();
        RectF rectF = this.topLeftCornerRect;
        rectF.top = 0.0f;
        float f7 = topCornersDiameter;
        rectF.right = f7;
        rectF.bottom = f7;
        RectF rectF2 = this.topRightCornerRect;
        rectF2.left = width - f7;
        rectF2.top = 0.0f;
        rectF2.right = width;
        rectF2.bottom = f7;
        Path path = this.topLeftCornerPath;
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, f7);
        path.arcTo(this.topLeftCornerRect, 180.0f, 90.0f);
        path.lineTo(0.0f, 0.0f);
        Path path2 = this.topRightCornerPath;
        path2.reset();
        path2.moveTo(width, 0.0f);
        path2.lineTo(width, f7);
        path2.arcTo(this.topRightCornerRect, 0.0f, -90.0f);
        path2.lineTo(width, 0.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(context);
        view.setId(R$id.searchBar_contentBackground);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = dimens.getDp10();
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = dimens.getDp10();
        bVar.setMarginStart(dimens.getDp16());
        bVar.setMarginEnd(dimens.getDp16());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f7 = CONTENT_RADIUS;
        DrawableExtKt.setCornerRadius(gradientDrawable, f7, f7, f7, f7);
        view.setBackground(gradientDrawable);
        view.setLayoutParams(bVar);
        this.barBackground = view;
        AttributeSet attributeSet2 = null;
        int i12 = 0;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        IconView iconView = new IconView(context, attributeSet2, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.searchBar_icon, -2, -2);
        int i14 = R$id.searchBar_contentBackground;
        a11.f41636i = i14;
        a11.f41656t = i14;
        a11.f41642l = i14;
        ((ViewGroup.MarginLayoutParams) a11).topMargin = dimens.getDp12();
        ((ViewGroup.MarginLayoutParams) a11).bottomMargin = dimens.getDp12();
        a11.setMarginStart(dimens.getDp12());
        iconView.setLayoutParams(a11);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i12, i13, defaultConstructorMarker);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.searchBar_placeholderTv, 0, -2);
        d11.f41655s = R$id.searchBar_icon;
        int i15 = R$id.searchBar_contentBackground;
        d11.f41636i = i15;
        d11.f41658v = i15;
        d11.f41642l = i15;
        ((ViewGroup.MarginLayoutParams) d11).topMargin = dimens.getDp10();
        d11.setMarginStart(dimens.getDp12());
        ((ViewGroup.MarginLayoutParams) d11).bottomMargin = dimens.getDp10();
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        this.placeholderTv = textAtomV2View;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.cornersPaint = paint;
        this.topLeftCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topLeftCornerPath = new Path();
        this.topRightCornerRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.topRightCornerPath = new Path();
        addView(view);
        addView(iconView);
        addView(textAtomV2View);
        setOnClickListener(new d(this, 6));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        float calculatorTopCornersRadius = dimens.getCalculatorTopCornersRadius();
        DrawableExtKt.setCornerRadius(gradientDrawable2, calculatorTopCornersRadius, calculatorTopCornersRadius, calculatorTopCornersRadius, calculatorTopCornersRadius);
        setBackground(gradientDrawable2);
        setWillNotDraw(false);
        setVisibility(8);
    }
}
