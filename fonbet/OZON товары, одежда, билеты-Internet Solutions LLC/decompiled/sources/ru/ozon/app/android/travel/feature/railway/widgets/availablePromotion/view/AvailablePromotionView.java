package ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.view;

import B90.i0;
import Bi.a;
import Bl.b;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.presentation.AvailablePromotionVO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015J&\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\u001c\u0010\u001a\u001a\u00020\u000e*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\f\u0010\u001d\u001a\u00020\u000e*\u00020\fH\u0002J\f\u0010\u001e\u001a\u00020\u000e*\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/view/AvailablePromotionView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "bgDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "promoCell", "Lru/ozon/uni/android/cell/CellView;", "detailsCell", "descriptionText", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "bind", "", "state", "Lru/ozon/app/android/travel/feature/railway/widgets/availablePromotion/presentation/AvailablePromotionVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "animationEndedCallback", "Lkotlin/Function0;", "setExpandedState", "isOpened", "", "playAnimation", "rotateArrow", "Lru/ozon/uni/android/atom/icon/IconView;", "isExpanded", "expand", "collapse", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AvailablePromotionView extends LinearLayout {

    @NotNull
    private final ShapeDrawable bgDrawable;

    @NotNull
    private final TextAtomV2View descriptionText;

    @NotNull
    private final CellView detailsCell;

    @NotNull
    private final CellView promoCell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailablePromotionView(@NotNull Context context) {
        super(context);
        int i11;
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.bgDrawable = shapeDrawable;
        q qVar = q.f64554a;
        CellView cellView = (CellView) b.a(CellView.class, "type", qVar, null);
        if (cellView == null) {
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        CellView cellView2 = cellView;
        cellView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.promoCell = cellView2;
        CellView cellView3 = (CellView) b.a(CellView.class, "type", qVar, null);
        if (cellView3 == null) {
            i11 = -2;
            context2 = context;
            cellView3 = new CellView(context2, null, 0, 0, null, 30, null);
        } else {
            i11 = -2;
            context2 = context;
        }
        cellView3.setLayoutParams(new LinearLayout.LayoutParams(-1, i11));
        cellView3.setElevation(2.0f);
        if (Build.VERSION.SDK_INT >= 28) {
            cellView3.setOutlineSpotShadowColor(0);
        }
        this.detailsCell = cellView3;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.g(N.b(TextAtomV2View.class), context2);
        a.d(-1, i11, textAtomV2View);
        this.descriptionText = textAtomV2View;
        setBackground(shapeDrawable);
        setOrientation(1);
        setClipToOutline(true);
        addView(cellView2);
        addView(cellView3);
        addView(textAtomV2View);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collapse(TextAtomV2View textAtomV2View) {
        textAtomV2View.animate().translationY((-textAtomV2View.getHeight()) / 2.0f).alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new i0(textAtomV2View, 2)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void expand(TextAtomV2View textAtomV2View) {
        textAtomV2View.setTranslationY((-textAtomV2View.getHeight()) / 2.0f);
        textAtomV2View.setAlpha(0.0f);
        textAtomV2View.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
    }

    private final void rotateArrow(IconView iconView, boolean z11, boolean z12) {
        float f7 = z11 ? 180.0f : 0.0f;
        if (z12) {
            iconView.animate().rotation(f7).setDuration(200L).start();
        } else {
            iconView.setRotation(f7);
        }
    }

    private final void setExpandedState(boolean isOpened, boolean playAnimation, Function0<Unit> animationEndedCallback) {
        if (playAnimation) {
            if (isOpened) {
                ViewExtKt.show(this.descriptionText);
                if (!isLaidOut() || isLayoutRequested()) {
                    addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.view.AvailablePromotionView$setExpandedState$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            AvailablePromotionView availablePromotionView = AvailablePromotionView.this;
                            availablePromotionView.expand(availablePromotionView.descriptionText);
                        }
                    });
                } else {
                    expand(this.descriptionText);
                }
            } else if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.railway.widgets.availablePromotion.view.AvailablePromotionView$setExpandedState$$inlined$doOnLayout$2
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        AvailablePromotionView availablePromotionView = AvailablePromotionView.this;
                        availablePromotionView.collapse(availablePromotionView.descriptionText);
                    }
                });
            } else {
                collapse(this.descriptionText);
            }
            animationEndedCallback.invoke();
        } else {
            this.descriptionText.setVisibility(isOpened ? 0 : 8);
        }
        rotateArrow(this.detailsCell.getRightBlock().getIconView(), isOpened, playAnimation);
    }

    public final void bind(@NotNull AvailablePromotionVO state, @NotNull Function1<? super AtomAction, Unit> onAction, @NotNull Function0<Unit> animationEndedCallback) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(animationEndedCallback, "animationEndedCallback");
        CellHolderKt.bind(this.promoCell, state.getPromo(), onAction);
        CellHolderKt.bind(this.detailsCell, state.getDetails(), onAction);
        TextHolderKt.bind$default(this.descriptionText, state.getDescription(), null, 2, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, state.getBgColor(), UniColors.LAYER_FLOOR_0.getResId());
        if (this.bgDrawable.getPaint().getColor() != parseColor) {
            this.bgDrawable.getPaint().setColor(parseColor);
        }
        int px = state.getCornerRadius().getPx();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        float pxF = ResourceExtKt.toPxF(px, context2);
        ShapeDrawable shapeDrawable = this.bgDrawable;
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = pxF;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        setExpandedState(state.getIsOpened(), state.getPlayAnimation(), animationEndedCallback);
    }
}
