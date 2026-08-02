package ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.view;

import BQ.b;
import Kk.C3531a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchFormBar.presentation.SearchFormBarVO;
import ru.ozon.app.android.travel.molecules.extensions.DrawableExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\r\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0014J\"\u0010)\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 J\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010.\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010/\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "margin", "", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "placeholderTextView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "roundedOutlineProvider", "ru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView$roundedOutlineProvider$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/view/SearchFormBarView$roundedOutlineProvider$1;", "rippleColor", "backgroundPaint", "Landroid/graphics/Paint;", "patchPaint", "patchTintPaint", "outerRadius", "", "innerRadius", "outerColor", "Ljava/lang/Integer;", "innerColor", "lhsPatchColor", "rhsPatchColor", "patchTintColor", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchFormBar/presentation/SearchFormBarVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "setOnClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/View$OnClickListener;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "setUpClickListener", "newPaint", "drawLeftPatch", "drawRightPatch", "drawBackgroundColor", "drawInnerBackgroundColor", "bindOuterRadius", "radius", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormBarView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final IconView iconView;
    private Integer innerColor;
    private float innerRadius;
    private SearchFormBarVO item;
    private Integer lhsPatchColor;
    private final int margin;
    private Integer outerColor;
    private float outerRadius;

    @NotNull
    private final Paint patchPaint;
    private Integer patchTintColor;

    @NotNull
    private final Paint patchTintPaint;

    @NotNull
    private final TextAtomV2View placeholderTextView;
    private Integer rhsPatchColor;
    private final int rippleColor;

    @NotNull
    private final SearchFormBarView$roundedOutlineProvider$1 roundedOutlineProvider;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormBarView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(12, context);
        this.margin = px;
        IconView iconView = new IconView(context, null, 0, 6, null);
        ConstraintLayout.b a11 = C3531a.a(iconView, 971, -2, -2);
        a11.f41636i = 0;
        a11.f41656t = 0;
        a11.f41642l = 0;
        a11.f41617X = true;
        a11.setMargins(px, px, 0, px);
        iconView.setLayoutParams(a11);
        this.iconView = iconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41655s = 971;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        bVar.setMargins(px, px, px, px);
        textAtomV2View.setLayoutParams(bVar);
        this.placeholderTextView = textAtomV2View;
        SearchFormBarView$roundedOutlineProvider$1 searchFormBarView$roundedOutlineProvider$1 = new SearchFormBarView$roundedOutlineProvider$1();
        this.roundedOutlineProvider = searchFormBarView$roundedOutlineProvider$1;
        this.rippleColor = ThemeExtKt.themeColor(context, R$attr.bgActionSecondary);
        this.backgroundPaint = newPaint();
        this.patchPaint = newPaint();
        this.patchTintPaint = newPaint();
        setWillNotDraw(false);
        setUpClickListener();
        addView(iconView);
        addView(textAtomV2View);
        setOutlineProvider(searchFormBarView$roundedOutlineProvider$1);
    }

    private final void bindOuterRadius(float radius) {
        if (this.outerRadius == radius) {
            return;
        }
        this.outerRadius = radius;
        this.roundedOutlineProvider.setRadius(radius);
        invalidateOutline();
        setForeground(DrawableExtensionsKt.contentlessRipple(this.rippleColor, radius));
    }

    private final void drawBackgroundColor(Canvas canvas) {
        Integer num = this.outerColor;
        if (num != null) {
            this.backgroundPaint.setColor(num.intValue());
            float width = getWidth();
            float height = getHeight();
            float f7 = this.outerRadius;
            canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.backgroundPaint);
        }
    }

    private final void drawInnerBackgroundColor(Canvas canvas) {
        Integer num = this.innerColor;
        if (num != null) {
            this.backgroundPaint.setColor(num.intValue());
            float f7 = this.innerRadius;
            canvas.drawRoundRect(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom(), f7, f7, this.backgroundPaint);
        }
    }

    private final void drawLeftPatch(Canvas canvas) {
        Canvas canvas2;
        Integer num = this.lhsPatchColor;
        if (num != null) {
            this.patchPaint.setColor(num.intValue());
            float f7 = this.outerRadius;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f7, f7, this.patchPaint);
        } else {
            canvas2 = canvas;
        }
        Integer num2 = this.patchTintColor;
        if (num2 != null) {
            this.patchTintPaint.setColor(num2.intValue());
            float f11 = this.outerRadius;
            canvas2.drawRect(0.0f, 0.0f, f11, f11, this.patchTintPaint);
        }
    }

    private final void drawRightPatch(Canvas canvas) {
        Canvas canvas2;
        Integer num = this.rhsPatchColor;
        if (num != null) {
            this.patchPaint.setColor(num.intValue());
            canvas2 = canvas;
            canvas2.drawRect(getWidth() - this.outerRadius, 0.0f, getWidth(), this.outerRadius, this.patchPaint);
        } else {
            canvas2 = canvas;
        }
        Integer num2 = this.patchTintColor;
        if (num2 != null) {
            this.patchTintPaint.setColor(num2.intValue());
            canvas2.drawRect(getWidth() - this.outerRadius, 0.0f, getWidth(), this.outerRadius, this.patchTintPaint);
        }
    }

    private final Paint newPaint() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    private final void setUpClickListener() {
        super.setOnClickListener(new b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpClickListener$lambda$5(SearchFormBarView searchFormBarView, View view) {
        AtomAction action;
        Function1<? super AtomAction, Unit> function1;
        SearchFormBarVO searchFormBarVO = searchFormBarView.item;
        if (searchFormBarVO == null || (action = searchFormBarVO.getAction()) == null || (function1 = searchFormBarView.actionHandler) == null) {
            return;
        }
        function1.invoke(action);
    }

    public final void bind(@NotNull SearchFormBarVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.item = item;
        this.actionHandler = actionHandler;
        bindOuterRadius(item.getCornerRadius());
        this.innerRadius = item.getBar().getCornerRadius();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.outerColor = styleParser.parseColor(context, item.getBackgroundColor());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.innerColor = styleParser.parseColor(context2, item.getBar().getBackgroundColor());
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.lhsPatchColor = styleParser.parseColor(context3, item.getLeftPatchColor());
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.rhsPatchColor = styleParser.parseColor(context4, item.getRightPatchColor());
        IconHolderKt.bind$default(this.iconView, item.getBar().getIcon(), null, 2, null);
        TextHolderKt.bind$default(this.placeholderTextView, item.getBar().getPlaceholder(), null, 2, null);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        drawLeftPatch(canvas);
        drawRightPatch(canvas);
        drawBackgroundColor(canvas);
        drawInnerBackgroundColor(canvas);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
    }
}
