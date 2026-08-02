package ru.ozon.app.android.cart.ui.thermometer.presentation.view;

import Hj.C3143a;
import Lc0.e;
import android.R;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/view/ThermometerMoleculeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;", "status", "", "configureStatusIcon", "(Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$StatusVO;)V", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;", "thermometer", "configureCircleProgressBar", "(Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO$ThermometerVO;)V", "", "color", "setBackgroundColor", "(Ljava/lang/String;)V", "Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindOrGone", "(Lru/ozon/app/android/cart/ui/thermometer/presentation/vo/ThermometerMoleculeVO;Lkotlin/jvm/functions/Function1;)V", "circleProgressSize", "I", "statusIconIvSize", "statusIconIvPadding", "", "containerCornerRadius", "F", "Lru/ozon/app/android/cart/ui/thermometer/presentation/view/CircleProgressView;", "circleProgressBar", "Lru/ozon/app/android/cart/ui/thermometer/presentation/view/CircleProgressView;", "Landroidx/appcompat/widget/AppCompatImageView;", "statusIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/cell/CellView;", "cellView", "Lru/ozon/uni/android/cell/CellView;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ThermometerMoleculeView extends ConstraintLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final CellView cellView;

    @NotNull
    private final CircleProgressView circleProgressBar;
    private final int circleProgressSize;
    private final float containerCornerRadius;

    @NotNull
    private final AppCompatImageView statusIconIv;
    private final int statusIconIvPadding;
    private final int statusIconIvSize;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/cart/ui/thermometer/presentation/view/ThermometerMoleculeView$Companion;", "", "<init>", "()V", "DEFAULT_PROGRESS_THICKNESS", "", "getSplitThermometerMoleculeViewIdSet", "", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Integer> getSplitThermometerMoleculeViewIdSet() {
            Integer[] elements = {Integer.valueOf(R$id.cell_center_title), Integer.valueOf(R$id.cell_center_subtitle), Integer.valueOf(R$id.cell_right_icon)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThermometerMoleculeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGone$lambda$7(ThermometerMoleculeVO thermometerMoleculeVO, Function1 function1, View view) {
        AtomAction action = thermometerMoleculeVO.getAction();
        if (action == null || function1 == null) {
            return;
        }
        function1.invoke(action);
    }

    private final void configureCircleProgressBar(ThermometerMoleculeVO.ThermometerVO thermometer) {
        CircleProgressView circleProgressView = this.circleProgressBar;
        circleProgressView.setProgress$cart_prodGoogleAllVendorsRelease(thermometer.getProgressVO().getProgress());
        circleProgressView.setStrokeWidth$cart_prodGoogleAllVendorsRelease(11.0f);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = circleProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String ringProgressColor = thermometer.getProgressVO().getRingProgressColor();
        UniColors uniColors = UniColors.GRAPHIC_FRESH_INVERTED;
        circleProgressView.setRingProgressColor$cart_prodGoogleAllVendorsRelease(styleParser.parseColor(context, ringProgressColor, uniColors.getResId()));
        Context context2 = circleProgressView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        circleProgressView.setRingBackgroundColor$cart_prodGoogleAllVendorsRelease(styleParser.parseColor(context2, thermometer.getProgressVO().getRingBackgroundColor(), uniColors.getResId()));
        circleProgressView.setContentDescription(String.valueOf(thermometer.getProgressVO().getProgress()));
        int px = ResourceExtKt.toPx(thermometer.getVerticalPadding());
        int px2 = ResourceExtKt.toPx(thermometer.getHorizontalPadding());
        circleProgressView.setPadding(px2, px, px2, px);
    }

    private final void configureStatusIcon(ThermometerMoleculeVO.StatusVO status) {
        AppCompatImageView appCompatImageView = this.statusIconIv;
        ImageViewExtKt.loadImageOrGone(appCompatImageView, status != null ? status.getIcon() : null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(appCompatImageView, styleParser.parseColor(context, status != null ? status.getIconColor() : null));
        Context context2 = appCompatImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewExtKt.setBackgroundTint(appCompatImageView, styleParser.parseColor(context2, status != null ? status.getCircleColor() : null, UniColors.GRAPHIC_FRESH_INVERTED.getResId()));
        appCompatImageView.setContentDescription(status != null ? status.getIcon() : null);
    }

    private final void setBackgroundColor(String color) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, color, R.color.transparent));
    }

    public final void bindOrGone(ThermometerMoleculeVO vo, Function1<? super AtomAction, Unit> onAction) {
        if (vo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        CellHolderKt.bind(this.cellView, vo.getCell(), onAction);
        configureStatusIcon(vo.getThermometer().getStatusVO());
        configureCircleProgressBar(vo.getThermometer());
        setBackgroundColor(vo.getBackgroundColor());
        setOnClickListener(new e(3, vo, onAction));
        TestInfo testInfo = vo.getTestInfo();
        setContentDescription(testInfo != null ? testInfo.getAutomatizationId() : null);
    }

    public /* synthetic */ ThermometerMoleculeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThermometerMoleculeView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(44);
        this.circleProgressSize = px;
        int px2 = ResourceExtKt.toPx(30);
        this.statusIconIvSize = px2;
        int px3 = ResourceExtKt.toPx(6);
        this.statusIconIvPadding = px3;
        this.containerCornerRadius = ResourceExtKt.toPxF(16);
        CircleProgressView circleProgressView = new CircleProgressView(context, null, 0, 6, null);
        circleProgressView.setId(ru.ozon.app.android.ui.R$id.circleProgressBar);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px, px);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        circleProgressView.setLayoutParams(bVar);
        addView(circleProgressView);
        this.circleProgressBar = circleProgressView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(ru.ozon.app.android.ui.R$id.statusIconIv);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(px2, px2);
        int i12 = ru.ozon.app.android.ui.R$id.circleProgressBar;
        bVar2.f41656t = i12;
        bVar2.f41658v = i12;
        bVar2.f41636i = i12;
        bVar2.f41642l = i12;
        appCompatImageView.setLayoutParams(bVar2);
        appCompatImageView.setBackgroundResource(R$drawable.circle_gray);
        appCompatImageView.setPadding(px3, px3, px3, px3);
        addView(appCompatImageView);
        this.statusIconIv = appCompatImageView;
        AttributeSet attributeSet2 = null;
        CellView cellView = new CellView(context, attributeSet2, 0, 0, Companion.getSplitThermometerMoleculeViewIdSet(), 14, null);
        cellView.setId(ru.ozon.app.android.ui.R$id.cellView);
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        bVar3.f41655s = ru.ozon.app.android.ui.R$id.circleProgressBar;
        bVar3.f41658v = 0;
        bVar3.f41636i = 0;
        bVar3.f41642l = 0;
        cellView.setLayoutParams(bVar3);
        addView(cellView);
        this.cellView = cellView;
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.cart.ui.thermometer.presentation.view.ThermometerMoleculeView.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, C3143a.f(view, "view", outline, "outline"), view.getHeight(), ThermometerMoleculeView.this.containerCornerRadius);
            }
        });
        setClipToOutline(true);
    }
}
