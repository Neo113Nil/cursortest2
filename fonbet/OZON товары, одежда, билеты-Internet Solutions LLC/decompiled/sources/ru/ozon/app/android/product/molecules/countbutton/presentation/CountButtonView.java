package ru.ozon.app.android.product.molecules.countbutton.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import DN.b;
import De.s;
import GI.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.DisposableActionHandler;
import ru.ozon.app.android.product.R$color;
import ru.ozon.app.android.product.R$id;
import ru.ozon.app.android.product.addToCart.presentation.ToCartIconColorStorage;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import xe.B0;
import xe.C10720e0;
import xe.E0;
import xe.H0;
import xe.J;
import xe.L;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\"\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\bR\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0006\u0018\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "configureShadow", "()V", "Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;", "buttonState", "onButtonStateChanged", "(Lru/ozon/app/android/product/molecules/countbutton/presentation/ButtonState;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "vo", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "countButtonViewModel", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "actionHandler", "bindOrGone", "(Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;Lru/ozon/app/android/action/sheet/DisposableActionHandler;)V", "recycle", "_viewModel", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "shadowColor", "I", "Lru/ozon/app/android/action/sheet/DisposableActionHandler;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/IconDrawer;", "iconDrawer", "Lru/ozon/app/android/product/molecules/countbutton/presentation/IconDrawer;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/BadgeDrawer;", "badgeDrawer", "Lru/ozon/app/android/product/molecules/countbutton/presentation/BadgeDrawer;", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonVO;", "Lxe/M;", "scope", "Lxe/M;", "", "isHapticEnabled", "Z", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/graphics/PointF;", "backgroundPoint", "Landroid/graphics/PointF;", "Lkotlin/Function1;", "click", "Lkotlin/jvm/functions/Function1;", "getViewModel", "()Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonViewModel;", "viewModel", "Companion", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class CountButtonView extends View {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private CountButtonViewModel _viewModel;
    private DisposableActionHandler actionHandler;

    @NotNull
    private final Paint backgroundPaint;

    @NotNull
    private final PointF backgroundPoint;

    @NotNull
    private final BadgeDrawer badgeDrawer;
    private final Function1<View, Unit> click;

    @NotNull
    private final IconDrawer iconDrawer;
    private boolean isHapticEnabled;

    @NotNull
    private final M scope;
    private final int shadowColor;
    private CountButtonVO vo;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/product/molecules/countbutton/presentation/CountButtonView;", "context", "Landroid/content/Context;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CountButtonView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CountButtonView(context, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ CountButtonView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object bindOrGone$onButtonStateChanged(CountButtonView countButtonView, ButtonState buttonState, d dVar) {
        countButtonView.onButtonStateChanged(buttonState);
        return Unit.f71690a;
    }

    private final void configureShadow() {
        setElevation(TileGrid2Constants.INSTANCE.getCountButtonElevation());
        setLayerType(2, null);
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.product.molecules.countbutton.presentation.CountButtonView$configureShadow$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
                int countButtonSize = (tileGrid2Constants.getCountButtonSize() - tileGrid2Constants.getCountButtonBackgroundSize()) / 2;
                outline.setOval(countButtonSize, countButtonSize, tileGrid2Constants.getCountButtonBackgroundSize() + countButtonSize, tileGrid2Constants.getCountButtonBackgroundSize() + countButtonSize);
            }
        });
        if (Build.VERSION.SDK_INT >= 28) {
            setOutlineSpotShadowColor(this.shadowColor);
            setOutlineAmbientShadowColor(this.shadowColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CountButtonViewModel getViewModel() {
        CountButtonViewModel countButtonViewModel = this._viewModel;
        if (countButtonViewModel != null) {
            return countButtonViewModel;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void onButtonStateChanged(ButtonState buttonState) {
        this.isHapticEnabled = buttonState.getIsHapticEnabled();
        if (Intrinsics.d(this.badgeDrawer.getBadgeText(), buttonState.getBadgeText()) && this.iconDrawer.getIsDisabled() == buttonState.getIsDisabled()) {
            return;
        }
        this.badgeDrawer.onTextChanged(buttonState.getBadgeText());
        this.iconDrawer.setDisabled(buttonState.getIsDisabled());
        Function1<View, Unit> function1 = buttonState.getIsDisabled() ? null : this.click;
        setOnClickListener(function1 != null ? new c(function1, 1) : null);
        invalidate();
    }

    public final void bindOrGone(CountButtonVO vo, CountButtonViewModel countButtonViewModel, DisposableActionHandler actionHandler) {
        this._viewModel = countButtonViewModel;
        Function1<View, Unit> function1 = this.click;
        setOnClickListener(function1 != null ? new b(function1, 2) : null);
        this.actionHandler = actionHandler;
        setVisibility(vo != null ? 0 : 8);
        if (vo == null) {
            this.vo = null;
            return;
        }
        CountButtonVO countButtonVO = this.vo;
        if (!Intrinsics.d(countButtonVO != null ? countButtonVO.getBackgroundColor() : null, vo.getBackgroundColor())) {
            ToCartIconColorStorage toCartIconColorStorage = ToCartIconColorStorage.INSTANCE;
            String backgroundColor = vo.getBackgroundColor();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer color = toCartIconColorStorage.getColor(backgroundColor, context);
            if (color != null) {
                this.backgroundPaint.setColor(color.intValue());
            }
        }
        CountButtonVO countButtonVO2 = this.vo;
        if (!Intrinsics.d(countButtonVO2 != null ? countButtonVO2.getIcon() : null, vo.getIcon())) {
            IconDrawer iconDrawer = this.iconDrawer;
            String icon = vo.getIcon();
            String iconColor = vo.getIconColor();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iconDrawer.updateIcon(icon, iconColor, context2);
        }
        this.vo = vo;
        getViewModel().attach(vo);
        C2399j.C(new C2408n0(getViewModel().getButtonState(), new CountButtonView$bindOrGone$2(this)), this.scope);
        setContentDescription(vo.getAutomatizationId());
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        PointF pointF = this.backgroundPoint;
        canvas.drawCircle(pointF.x, pointF.y, TileGrid2Constants.INSTANCE.getCountButtonBackgroundRadius(), this.backgroundPaint);
        this.iconDrawer.onDraw(canvas);
        this.badgeDrawer.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        TileGrid2Constants tileGrid2Constants = TileGrid2Constants.INSTANCE;
        setMeasuredDimension(tileGrid2Constants.getCountButtonSize(), tileGrid2Constants.getCountButtonSize());
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        this.iconDrawer.onSizeChanged(width, height);
        this.backgroundPoint.set(width / 2.0f, height / 2.0f);
    }

    public final void recycle() {
        getViewModel().detach();
        setOnClickListener(null);
        E0.d(this.scope.getCoroutineContext());
    }

    private CountButtonView(Context context) {
        super(context);
        this.shadowColor = context.getColor(R$color.shadow_color);
        this.iconDrawer = new IconDrawer(context);
        this.badgeDrawer = new BadgeDrawer(context);
        B0 b11 = X0.b();
        C10720e0 c10720e0 = C10720e0.f105451a;
        CoroutineContext d11 = CoroutineContext.Element.a.d(s.f6650a.x(), (H0) b11);
        Intrinsics.checkNotNullExpressionValue("CountButtonView", "getSimpleName(...)");
        this.scope = N.a(d11.plus(new L("CountButtonView")).plus(new CountButtonView$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        this.backgroundPoint = new PointF();
        this.click = new CountButtonView$click$1(this);
        setId(R$id.countButton);
        configureShadow();
    }
}
