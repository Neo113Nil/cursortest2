package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view;

import B90.C2618u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.presentation.SearchFormV5VO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldVO;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import zQ.c;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\"\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J4\u0010.\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J\u000e\u00103\u001a\u00020%2\u0006\u0010)\u001a\u00020/J,\u00104\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J\u0010\u00107\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u000105J,\u00108\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J\u0010\u00109\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u000105J,\u0010:\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002012\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J\u0010\u0010;\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u000105J\"\u0010<\u001a\u00020%2\u0006\u0010)\u001a\u00020=2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J$\u0010>\u001a\u00020%2\b\u0010?\u001a\u0004\u0018\u00010@2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020%0,J\u0010\u0010A\u001a\u00020%2\b\u0010B\u001a\u0004\u0018\u00010CJ\u000e\u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020\u0013J\u0010\u0010F\u001a\u00020%2\b\u0010B\u001a\u0004\u0018\u00010CJ\u0010\u0010G\u001a\u00020%2\b\u0010B\u001a\u0004\u0018\u00010CJ\b\u0010H\u001a\u00020%H\u0007J\b\u0010I\u001a\u00020%H\u0007J\u0012\u0010J\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010K\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010L\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "patchPaint", "Landroid/graphics/Paint;", "backgroundPaint", "pathTintPaint", "dp24", "", "dp16", "dp12", "dp10", "dp8", "dp6", "dp4", "cornerRadius", "", "leftPathColor", "Ljava/lang/Integer;", "rightPathColor", "pathTintColor", "locationsView", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5LocationsView;", "dateFieldView", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldView;", "rightFieldView", "bottomBarrier", "Landroidx/constraintlayout/widget/Barrier;", "touristFieldView", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindLocations", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/presentation/SearchFormV5VO$Content$Locations;", "isCrossFadeDepartureAnimated", "", "isCrossFadeDestinationAnimated", "swapLocations", "bindDateField", "Lru/ozon/app/android/travel/molecules/view/iconField/IconFieldVO;", "isTextAnimated", "updateDateFieldModel", "bindRightField", "updateRightFieldModel", "bindTouristField", "updateTouristFieldModel", "bindSearchButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "bindToggleCell", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "bindBackgroundColor", "color", "", "bindCornerRadius", "radius", "bindLeftPatchColor", "bindRightPatchColor", "showLoader", "hideLoader", "parseColor", "bindPatches", "drawPatchTint", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5View extends ConstraintLayout {

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final Barrier bottomBarrier;

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final CellView cellView;
    private float cornerRadius;

    @NotNull
    private final IconFieldView dateFieldView;
    private final int dp10;
    private final int dp12;
    private final int dp16;
    private final int dp24;
    private final int dp4;
    private final int dp6;
    private final int dp8;
    private Integer leftPathColor;

    @NotNull
    private final SearchFormV5LocationsView locationsView;

    @NotNull
    private final Paint patchPaint;
    private Integer pathTintColor;

    @NotNull
    private final Paint pathTintPaint;

    @NotNull
    private final IconFieldView rightFieldView;
    private Integer rightPathColor;

    @NotNull
    private final IconFieldView touristFieldView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFormV5View(@NotNull Context context) {
        super(context);
        View view;
        q qVar;
        ButtonV3View buttonV3View;
        View view2;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.patchPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.backgroundPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.pathTintPaint = paint3;
        this.dp24 = UiExtKt.toPx(24, context);
        int px = UiExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = UiExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = UiExtKt.toPx(10, context);
        this.dp10 = px3;
        int px4 = UiExtKt.toPx(8, context);
        this.dp8 = px4;
        int px5 = UiExtKt.toPx(6, context);
        this.dp6 = px5;
        int px6 = UiExtKt.toPx(4, context);
        this.dp4 = px6;
        SearchFormV5LocationsView searchFormV5LocationsView = new SearchFormV5LocationsView(context);
        searchFormV5LocationsView.setId(7163);
        searchFormV5LocationsView.setPadding(px, px5, px, px5);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41636i = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.setMargins(px, 0, px, 0);
        searchFormV5LocationsView.setLayoutParams(bVar);
        this.locationsView = searchFormV5LocationsView;
        IconFieldView iconFieldView = new IconFieldView(context, null, 0, 6, null);
        iconFieldView.setId(7164);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = 7163;
        bVar2.f41656t = 0;
        bVar2.f41657u = 7165;
        bVar2.setMargins(px, px4, px6, 0);
        bVar2.f41660x = 0;
        bVar2.f41595B = px;
        iconFieldView.setLayoutParams(bVar2);
        this.dateFieldView = iconFieldView;
        IconFieldView iconFieldView2 = new IconFieldView(context, null, 0, 6, null);
        iconFieldView2.setId(7165);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41638j = 7163;
        bVar3.f41655s = 7164;
        bVar3.f41658v = 0;
        bVar3.setMargins(px6, px4, px, 0);
        iconFieldView2.setLayoutParams(bVar3);
        this.rightFieldView = iconFieldView2;
        Barrier barrier = new Barrier(context);
        barrier.setId(7166);
        barrier.setLayoutParams(new ConstraintLayout.b(-2, -2));
        barrier.setReferencedIds(new int[]{7164, 7165});
        barrier.f(3);
        this.bottomBarrier = barrier;
        IconFieldView iconFieldView3 = new IconFieldView(context, null, 0, 6, null);
        iconFieldView3.setId(7167);
        ConstraintLayout.b bVar4 = new ConstraintLayout.b(0, -2);
        bVar4.f41638j = 7166;
        bVar4.f41656t = 0;
        bVar4.f41658v = 0;
        bVar4.setMargins(px, px4, px, 0);
        iconFieldView3.setLayoutParams(bVar4);
        this.touristFieldView = iconFieldView3;
        q qVar2 = q.f64554a;
        ButtonV3View buttonV3View2 = (ButtonV3View) qVar2.i(N.b(ButtonV3View.class), context);
        if (buttonV3View2 == null) {
            view = iconFieldView3;
            qVar = qVar2;
            buttonV3View = new ButtonV3View(context, null, 0, 0, 14, null);
        } else {
            view = iconFieldView3;
            qVar = qVar2;
            buttonV3View = buttonV3View2;
        }
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, 7168, 0, -2);
        e11.f41638j = 7167;
        e11.f41656t = 0;
        e11.f41658v = 0;
        e11.f41640k = 7169;
        e11.f41662z = px3;
        e11.setMargins(px, px2, px, px6);
        buttonV3View.setLayoutParams(e11);
        this.buttonView = buttonV3View;
        CellView cellView = (CellView) qVar.i(N.b(CellView.class), context);
        if (cellView == null) {
            i12 = 7169;
            view2 = buttonV3View;
            i11 = 7168;
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        } else {
            view2 = buttonV3View;
            i11 = 7168;
            i12 = 7169;
        }
        cellView.setId(i12);
        ConstraintLayout.b bVar5 = new ConstraintLayout.b(0, -2);
        bVar5.f41638j = i11;
        bVar5.f41656t = 0;
        bVar5.f41658v = 0;
        bVar5.f41642l = 0;
        cellView.setLayoutParams(bVar5);
        this.cellView = cellView;
        setWillNotDraw(false);
        addView(searchFormV5LocationsView);
        addView(iconFieldView);
        addView(iconFieldView2);
        addView(barrier);
        addView(view);
        addView(view2);
        addView(cellView);
    }

    private final void bindPatches(Canvas canvas) {
        Canvas canvas2;
        Integer num = this.leftPathColor;
        if (num != null) {
            this.patchPaint.setColor(num.intValue());
            float f7 = this.cornerRadius;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f7, f7, this.patchPaint);
        } else {
            canvas2 = canvas;
        }
        Integer num2 = this.rightPathColor;
        if (num2 != null) {
            this.patchPaint.setColor(num2.intValue());
            canvas2.drawRect(getWidth() - this.cornerRadius, 0.0f, getWidth(), this.cornerRadius, this.patchPaint);
        }
    }

    private final void drawPatchTint(Canvas canvas) {
        if (this.pathTintColor != null) {
            float f7 = this.cornerRadius;
            canvas.drawRect(0.0f, 0.0f, f7, f7, this.pathTintPaint);
            canvas.drawRect(getWidth() - this.cornerRadius, 0.0f, getWidth(), this.cornerRadius, this.pathTintPaint);
        }
    }

    private final int parseColor(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, color);
        if (parseColor != null) {
            return parseColor.intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$18(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void bind(@NotNull SearchFormV5VO.Content item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        bindLocations(item.getLocations(), false, false, actionHandler);
        bindDateField(item.getDateField(), false, actionHandler);
        bindRightField(item.getRightField(), false, actionHandler);
        bindTouristField(item.getTouristField(), false, actionHandler);
        bindSearchButton(item.getSearchButton(), actionHandler);
        bindToggleCell(item.getToggleCell(), actionHandler);
        bindBackgroundColor(item.getBackgroundColor());
        bindCornerRadius(item.getCornerRadius());
        bindLeftPatchColor(item.getLeftPatchColor());
        bindRightPatchColor(item.getRightPatchColor());
    }

    public final void bindBackgroundColor(String color) {
        this.backgroundPaint.setColor(parseColor(color));
        invalidate();
    }

    public final void bindCornerRadius(float radius) {
        this.cornerRadius = radius;
        invalidate();
    }

    public final void bindDateField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.dateFieldView.bindOrGone(item, isTextAnimated, actionHandler);
    }

    public final void bindLeftPatchColor(String color) {
        this.leftPathColor = Integer.valueOf(parseColor(color));
        invalidate();
    }

    public final void bindLocations(SearchFormV5VO.Content.Locations item, boolean isCrossFadeDepartureAnimated, boolean isCrossFadeDestinationAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (item == null) {
            ViewExtKt.gone(this.locationsView);
        } else {
            this.locationsView.bind(item, isCrossFadeDepartureAnimated, isCrossFadeDestinationAnimated, actionHandler);
            ViewExtKt.show(this.locationsView);
        }
    }

    public final void bindRightField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.rightFieldView.bindOrGone(item, isTextAnimated, actionHandler);
    }

    public final void bindRightPatchColor(String color) {
        this.rightPathColor = Integer.valueOf(parseColor(color));
        invalidate();
    }

    public final void bindSearchButton(@NotNull ButtonV3DTO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ButtonV3HolderKt.bind(this.buttonView, item, actionHandler);
        ButtonV3View buttonV3View = this.buttonView;
        ViewGroup.LayoutParams layoutParams = buttonV3View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = this.locationsView.getVisibility() == 0 ? this.dp12 : this.dp24;
        buttonV3View.setLayoutParams(marginLayoutParams);
    }

    public final void bindToggleCell(CellDTO cell, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        CellHolderKt.bindOrGone(this.cellView, cell, actionHandler);
    }

    public final void bindTouristField(IconFieldVO item, boolean isTextAnimated, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.touristFieldView.bindOrGone(item, isTextAnimated, actionHandler);
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        bindPatches(canvas);
        drawPatchTint(canvas);
        float width = getWidth();
        float height = getHeight();
        float f7 = this.cornerRadius;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f7, f7, this.backgroundPaint);
        super.draw(canvas);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void hideLoader() {
        this.buttonView.hideLoader();
        this.buttonView.setOnTouchListener(null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void showLoader() {
        this.buttonView.setOnTouchListener(new c());
        this.buttonView.showLoader();
    }

    public final void swapLocations(@NotNull SearchFormV5VO.Content.Locations item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.locationsView.swapLocations(item);
    }

    public final void updateDateFieldModel(IconFieldVO item) {
        this.dateFieldView.updateModel(item);
    }

    public final void updateRightFieldModel(IconFieldVO item) {
        this.rightFieldView.updateModel(item);
    }

    public final void updateTouristFieldModel(IconFieldVO item) {
        this.touristFieldView.updateModel(item);
    }
}
