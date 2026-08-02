package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.view;

import Am.C2438a;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$string;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.app.android.travel.utils.delegate.PreCreationViewPoolDelegate;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0018¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/view/TotalPriceWithButtonV2TimerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp4", "", "dp8", "dpF12", "", "timerBackground", "Landroid/graphics/drawable/ShapeDrawable;", "timerBackgroundView", "Landroid/view/View;", "countdownIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "getCountdownIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "countdownIconView$delegate", "Lru/ozon/app/android/travel/utils/delegate/PreCreationViewPoolDelegate;", "countdownTitleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getCountdownTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "countdownTitleView$delegate", "countdownTimerView", "getCountdownTimerView", "countdownTimerView$delegate", "bind", "", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/totalPriceWithButton/v2/presentation/TotalPriceWithButtonV2VO$TimerVO;", "bindOrGone", "updateTimerText", "newText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "addChildren", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TotalPriceWithButtonV2TimerView extends ConstraintLayout {
    static final /* synthetic */ m<Object>[] $$delegatedProperties = {C2438a.c(TotalPriceWithButtonV2TimerView.class, "countdownIconView", "getCountdownIconView()Lru/ozon/uni/android/atom/icon/IconView;", 0), C2438a.c(TotalPriceWithButtonV2TimerView.class, "countdownTitleView", "getCountdownTitleView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0), C2438a.c(TotalPriceWithButtonV2TimerView.class, "countdownTimerView", "getCountdownTimerView()Lru/ozon/uni/android/atom/text/TextAtomV2View;", 0)};
    public static final int $stable = 8;

    /* renamed from: countdownIconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate countdownIconView;

    /* renamed from: countdownTimerView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate countdownTimerView;

    /* renamed from: countdownTitleView$delegate, reason: from kotlin metadata */
    @NotNull
    private final PreCreationViewPoolDelegate countdownTitleView;
    private final int dp4;
    private final int dp8;
    private final float dpF12;

    @NotNull
    private final ShapeDrawable timerBackground;

    @NotNull
    private final View timerBackgroundView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TotalPriceWithButtonV2TimerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp4 = ResourceExtKt.toPx(4, context);
        this.dp8 = ResourceExtKt.toPx(8, context);
        float pxF = ResourceExtKt.toPxF(12, context);
        this.dpF12 = pxF;
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(0, pxF);
        this.timerBackground = produce;
        View view = new View(context);
        view.setId(35);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41656t = 0;
        bVar.f41636i = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        view.setLayoutParams(bVar);
        view.setBackground(produce);
        this.timerBackgroundView = view;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.countdownIconView = new PreCreationViewPoolDelegate(context2, N.b(IconView.class), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$1(this), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$2(this));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.countdownTitleView = new PreCreationViewPoolDelegate(context3, N.b(TextAtomV2View.class), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$3(this), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$4(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.countdownTimerView = new PreCreationViewPoolDelegate(context4, N.b(TextAtomV2View.class), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$5(this), new TotalPriceWithButtonV2TimerView$special$$inlined$preCreationViewPool$default$6(this));
        addChildren();
        view.setBackground(produce);
        setTag(StringProvider.getString(R$string.common_tag_not_affect_offset));
    }

    private final void addChildren() {
        addView(this.timerBackgroundView);
        addView(getCountdownIconView());
        addView(getCountdownTitleView());
        addView(getCountdownTimerView());
    }

    private final IconView getCountdownIconView() {
        return (IconView) this.countdownIconView.getValue(this, $$delegatedProperties[0]);
    }

    private final TextAtomV2View getCountdownTimerView() {
        return (TextAtomV2View) this.countdownTimerView.getValue(this, $$delegatedProperties[2]);
    }

    private final TextAtomV2View getCountdownTitleView() {
        return (TextAtomV2View) this.countdownTitleView.getValue(this, $$delegatedProperties[1]);
    }

    public final void bind(@NotNull TotalPriceWithButtonV2VO.TimerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Drawable background = this.timerBackgroundView.getBackground();
        ShapeDrawable shapeDrawable = background instanceof ShapeDrawable ? (ShapeDrawable) background : null;
        if (shapeDrawable != null) {
            Paint paint = shapeDrawable.getPaint();
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Integer parseColor = styleParser.parseColor(context, item.getCountdownColor());
            paint.setColor(parseColor != null ? parseColor.intValue() : 0);
        }
        IconHolderKt.bindOrGone$default(getCountdownIconView(), item.getCountdownIcon(), null, 2, null);
        TextHolderKt.bindOrGone$default(getCountdownTitleView(), item.getCountdownTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(getCountdownTimerView(), item.getCountdownTimer(), null, 2, null);
    }

    public final void bindOrGone(TotalPriceWithButtonV2VO.TimerVO item) {
        if (item == null) {
            ViewExtKt.gone(this);
        } else {
            ViewExtKt.show(this);
            bind(item);
        }
    }

    public final void updateTimerText(@NotNull TextDTO newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        TextHolderKt.bind$default(getCountdownTimerView(), newText, null, 2, null);
    }
}
