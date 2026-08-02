package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view;

import FG.a;
import Hj.C3143a;
import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.ServicePackageCarouselCardContentAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent.ServicePackageCarouselCardContentDecorator;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ$\u0010#\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ$\u0010$\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"J\u0010\u0010&\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/view/ServicePackageCarouselCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp16", "borderWidth", "outerRadius", "", "cardContentDecorator", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentDecorator;", "cardContentAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "smsCell", "Lru/ozon/uni/android/cell/CellView;", "button", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "onClickOverlay", "Landroid/view/View;", "boundDataId", "onCardClick", "Lkotlin/Function1;", "", "actionHandler", "Lru/ozon/uni/atoms/af/AtomAction;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "bindSmsToggle", "bindButton", "bindIsActive", "bindBackground", "setupConstraints", "setupBorder", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int borderWidth;
    private int boundDataId;

    @NotNull
    private final ButtonV3View button;

    @NotNull
    private final ServicePackageCarouselCardContentAdapter cardContentAdapter;

    @NotNull
    private final ServicePackageCarouselCardContentDecorator cardContentDecorator;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final GradientDrawable gradientDrawable;
    private Function1<? super Integer, Unit> onCardClick;

    @NotNull
    private final View onClickOverlay;
    private float outerRadius;

    @NotNull
    private final RecyclerView recyclerView;

    @NotNull
    private final CellView smsCell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServicePackageCarouselCardView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.borderWidth = ResourceExtKt.toPx(1, context);
        this.outerRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_600.getPx(), context);
        ServicePackageCarouselCardContentDecorator servicePackageCarouselCardContentDecorator = new ServicePackageCarouselCardContentDecorator(context);
        this.cardContentDecorator = servicePackageCarouselCardContentDecorator;
        ServicePackageCarouselCardContentAdapter servicePackageCarouselCardContentAdapter = new ServicePackageCarouselCardContentAdapter();
        this.cardContentAdapter = servicePackageCarouselCardContentAdapter;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.servicePackageCarouselCardContentList);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(servicePackageCarouselCardContentAdapter);
        recyclerView.addItemDecoration(servicePackageCarouselCardContentDecorator);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        addView(recyclerView);
        this.recyclerView = recyclerView;
        q qVar = q.f64554a;
        CellView cellView = (CellView) qVar.i(N.b(CellView.class), context);
        if (cellView == null) {
            context2 = context;
            cellView = new CellView(context2, null, 0, 0, null, 30, null);
        } else {
            context2 = context;
        }
        cellView.setId(R$id.servicePackageCarouselCardContentSmsCell);
        cellView.setLayoutParams(new RecyclerView.p(0, -2));
        addView(cellView);
        this.smsCell = cellView;
        ButtonV3View buttonV3View = (ButtonV3View) qVar.i(N.b(ButtonV3View.class), context2);
        Context context3 = context2;
        if (buttonV3View == null) {
            buttonV3View = new ButtonV3View(context3, null, 0, 0, 14, null);
        }
        buttonV3View.setId(R$id.servicePackageCarouselCardContentApplyButton);
        buttonV3View.setLayoutParams(new RecyclerView.p(0, -2));
        addView(buttonV3View);
        this.button = buttonV3View;
        View view = new View(context3);
        view.setId(R$id.servicePackageCarouselCardContentClickOverlay);
        view.setLayoutParams(new RecyclerView.p(0, 0));
        addView(view);
        this.onClickOverlay = view;
        this.boundDataId = -1;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        setupConstraints();
        setupBorder();
        view.setOnClickListener(new a(this, 21));
        setBackground(gradientDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(ServicePackageCarouselCardView servicePackageCarouselCardView, View view) {
        Function1<? super Integer, Unit> function1 = servicePackageCarouselCardView.onCardClick;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(servicePackageCarouselCardView.boundDataId));
        }
    }

    private final void bindBackground(ServicePackageCarouselVO.ServicePackageCarouselCardVO item) {
        UniGradient backgroundGradient = item.getBackgroundGradient();
        if (backgroundGradient != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Color.Gradient gradient = TokensExtKt.toGradient(backgroundGradient, context);
            if (gradient != null) {
                gradient.applyTo(this.gradientDrawable);
            }
        }
        GradientDrawable gradientDrawable = this.gradientDrawable;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.outerRadius);
        if (item.getBorderColor() == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        gradientDrawable.setStroke(this.borderWidth, styleParser.parseColor(context2, item.getBorderColor(), R$color.graphic_disabled));
    }

    private final void setupBorder() {
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.view.ServicePackageCarouselCardView$setupBorder$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                float f7;
                int f11 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                f7 = ServicePackageCarouselCardView.this.outerRadius;
                outline.setRoundRect(0, 0, f11, height, f7);
            }
        });
        int i11 = this.borderWidth;
        setPadding(i11, i11, i11, i11);
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new ServicePackageCarouselCardView$setupConstraints$1(this));
    }

    public final void bind(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO item, Function1<? super AtomAction, Unit> actionHandler, Function1<? super Integer, Unit> onCardClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindIsActive(item);
        this.actionHandler = actionHandler;
        this.boundDataId = item.getId();
        this.onCardClick = onCardClick;
        this.cardContentAdapter.submitList(item.getItems());
        bindSmsToggle(item, actionHandler);
        bindButton(item, actionHandler);
        bindBackground(item);
    }

    public final void bindButton(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getDarkThemeButton() != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (ThemeExtKt.isDarkThemeActive(context)) {
                ButtonV3HolderKt.bind(this.button, item.getDarkThemeButton(), actionHandler);
                return;
            }
        }
        ButtonV3HolderKt.bind(this.button, item.getLightThemeButton(), actionHandler);
    }

    public final void bindIsActive(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.onClickOverlay.setVisibility(item.getIsActive() ? 8 : 0);
    }

    public final void bindSmsToggle(@NotNull ServicePackageCarouselVO.ServicePackageCarouselCardVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellHolderKt.bindOrGone(this.smsCell, item.getSmsToggler(), actionHandler);
    }
}
