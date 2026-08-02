package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultVO;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+H\u0014J(\u0010,\u001a\u00020$2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020$01J*\u00103\u001a\u00020$2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020$01J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u00020\u0019H\u0002J\b\u00107\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultOptionsListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "desStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dpf1", "", "dp1", "dp3", "dp6", "dp8", "dpf8", "dp16", "halfStroke", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "toursSearchResultSeparator1", "Landroid/view/View;", "toursSearchResultSeparator2", "toursSearchResultFirstOptionTSROP", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultOptionView;", "toursSearchResultSecondOptionTSROP", "toursSearchResultThirdOptionTSROP", "flowOptions", "Landroidx/constraintlayout/helper/widget/Flow;", "toursSearchResultOptionContinueACIV", "Landroidx/appcompat/widget/AppCompatImageView;", "onSizeChanged", "", "width", "height", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "tourOptions", "", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultVO$TourOptionVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "bindOrGone", "addViews", "setConstraints", "createSeparator", "createToursSearchResultOptionView", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultOptionsListView extends ConstraintLayout {
    private final int dp1;
    private final int dp16;
    private final int dp3;
    private final int dp6;
    private final int dp8;
    private final float dpf1;
    private final float dpf8;

    @NotNull
    private final Flow flowOptions;
    private float halfStroke;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final ToursSearchResultOptionView toursSearchResultFirstOptionTSROP;

    @NotNull
    private final AppCompatImageView toursSearchResultOptionContinueACIV;

    @NotNull
    private final ToursSearchResultOptionView toursSearchResultSecondOptionTSROP;

    @NotNull
    private final View toursSearchResultSeparator1;

    @NotNull
    private final View toursSearchResultSeparator2;

    @NotNull
    private final ToursSearchResultOptionView toursSearchResultThirdOptionTSROP;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultOptionsListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void addViews() {
        addView(this.toursSearchResultSeparator1);
        addView(this.toursSearchResultSeparator2);
        addView(this.toursSearchResultFirstOptionTSROP);
        addView(this.toursSearchResultSecondOptionTSROP);
        addView(this.toursSearchResultThirdOptionTSROP);
        addView(this.toursSearchResultOptionContinueACIV);
        addView(this.flowOptions);
    }

    private final View createSeparator() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(this.dp1, 0));
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultOptionsListView$createSeparator$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                int i11;
                int i12;
                Intrinsics.checkNotNullParameter(view2, "view");
                if (outline != null) {
                    i11 = ToursSearchResultOptionsListView.this.dp6;
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    i12 = ToursSearchResultOptionsListView.this.dp6;
                    outline.setRect(0, i11, width, height - i12);
                }
            }
        });
        return view;
    }

    private final ToursSearchResultOptionView createToursSearchResultOptionView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToursSearchResultOptionView toursSearchResultOptionView = new ToursSearchResultOptionView(context, null, 0, 0, 14, null);
        toursSearchResultOptionView.setId(View.generateViewId());
        toursSearchResultOptionView.setLayoutParams(new ConstraintLayout.b(0, -2));
        int i11 = this.dp8;
        int i12 = this.dp6;
        toursSearchResultOptionView.setPadding(i11, i12, this.dp3, i12);
        return toursSearchResultOptionView;
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new ToursSearchResultOptionsListView$setConstraints$1(this));
    }

    public final void bind(@NotNull List<ToursSearchResultVO.TourOptionVO> tourOptions, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(tourOptions, "tourOptions");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ToursSearchResultVO.TourOptionVO tourOptionVO = (ToursSearchResultVO.TourOptionVO) C7714v.K(tourOptions);
        ToursSearchResultVO.TourOptionVO tourOptionVO2 = (ToursSearchResultVO.TourOptionVO) C7714v.Q(1, tourOptions);
        ToursSearchResultVO.TourOptionVO tourOptionVO3 = (ToursSearchResultVO.TourOptionVO) C7714v.Q(2, tourOptions);
        this.toursSearchResultFirstOptionTSROP.bind(tourOptionVO, actionHandler);
        this.toursSearchResultSecondOptionTSROP.bindOrGone(tourOptionVO2, actionHandler);
        this.toursSearchResultThirdOptionTSROP.bindOrGone(tourOptionVO3, actionHandler);
        int size = tourOptions.size();
        if (size == 1) {
            ViewExtKt.gone(this.toursSearchResultSeparator1);
            ViewExtKt.gone(this.toursSearchResultSeparator2);
        } else if (size == 2) {
            ViewExtKt.show(this.toursSearchResultSeparator1);
            ViewExtKt.gone(this.toursSearchResultSeparator2);
        } else {
            if (size != 3) {
                return;
            }
            ViewExtKt.show(this.toursSearchResultSeparator1);
            ViewExtKt.show(this.toursSearchResultSeparator2);
        }
    }

    public final void bindOrGone(List<ToursSearchResultVO.TourOptionVO> tourOptions, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        List<ToursSearchResultVO.TourOptionVO> list = tourOptions;
        if (list == null || list.isEmpty()) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(tourOptions, actionHandler);
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.path, this.paint);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldw, int oldh) {
        Path path = this.path;
        path.rewind();
        float f7 = this.halfStroke;
        float f11 = this.dpf8;
        path.addRoundRect(f7 + 0.0f, f7 + 0.0f, width - f7, height - f7, f11, f11, Path.Direction.CCW);
    }

    public /* synthetic */ ToursSearchResultOptionsListView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultOptionsListView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(1, context);
        this.dpf1 = pxF;
        this.dp1 = ResourceExtKt.toPx(1, context);
        this.dp3 = ResourceExtKt.toPx(3, context);
        this.dp6 = ResourceExtKt.toPx(6, context);
        int px = ResourceExtKt.toPx(8, context);
        this.dp8 = px;
        this.dpf8 = ResourceExtKt.toPxF(8, context);
        int px2 = ResourceExtKt.toPx(16, context);
        this.dp16 = px2;
        this.halfStroke = pxF / 2;
        this.path = new Path();
        Paint a11 = h.a(true);
        a11.setColor(ThemeExtKt.themeColor(context, R$attr.graphicNeutral));
        a11.setStyle(Paint.Style.STROKE);
        a11.setStrokeWidth(pxF);
        this.paint = a11;
        View createSeparator = createSeparator();
        this.toursSearchResultSeparator1 = createSeparator;
        View createSeparator2 = createSeparator();
        this.toursSearchResultSeparator2 = createSeparator2;
        ToursSearchResultOptionView createToursSearchResultOptionView = createToursSearchResultOptionView();
        this.toursSearchResultFirstOptionTSROP = createToursSearchResultOptionView;
        ToursSearchResultOptionView createToursSearchResultOptionView2 = createToursSearchResultOptionView();
        this.toursSearchResultSecondOptionTSROP = createToursSearchResultOptionView2;
        ToursSearchResultOptionView createToursSearchResultOptionView3 = createToursSearchResultOptionView();
        this.toursSearchResultThirdOptionTSROP = createToursSearchResultOptionView3;
        Flow flow = new Flow(context);
        flow.setId(View.generateViewId());
        flow.setLayoutParams(new ConstraintLayout.b(0, -2));
        flow.setReferencedIds(new int[]{createToursSearchResultOptionView.getId(), createSeparator.getId(), createToursSearchResultOptionView2.getId(), createSeparator2.getId(), createToursSearchResultOptionView3.getId()});
        flow.setWrapMode(1);
        flow.setOrientation(0);
        flow.setHorizontalStyle(1);
        flow.setVerticalAlign(2);
        this.flowOptions = flow;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(px2, px2);
        appCompatImageView.setVisibility(8);
        bVar.setMarginEnd(px);
        appCompatImageView.setLayoutParams(bVar);
        appCompatImageView.setImageResource(R$drawable.ic_s_disclosure);
        ThemeExtKt.tint(appCompatImageView, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicNeutral)));
        this.toursSearchResultOptionContinueACIV = appCompatImageView;
        setWillNotDraw(false);
        addViews();
        setConstraints();
    }
}
