package ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonSimpleBinding;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.button.CartButton;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.plain.PlainViewV4Kt;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\rR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeViewV4;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonSimpleBinding;", "bind", "vo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/subscribe/SubscribeVO;", "shake", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SubscribeViewV4 extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCartbuttonSimpleBinding binding;

    public /* synthetic */ SubscribeViewV4(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void bind(@NotNull SubscribeVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        WidgetCartbuttonSimpleBinding widgetCartbuttonSimpleBinding = this.binding;
        View separatorView = widgetCartbuttonSimpleBinding.separatorView;
        Intrinsics.checkNotNullExpressionValue(separatorView, "separatorView");
        separatorView.setVisibility(vo.getHasShadow() ? 0 : 8);
        CartButton cartButton = widgetCartbuttonSimpleBinding.cartButton;
        if (vo.getIsSubscribed()) {
            cartButton.setViewState(PlainViewV4Kt.toViewState(vo.getUnsubscribe(), vo.getStyle(), vo.getPriorityColor()));
            ViewExtKt.setOnClickListenerThrottle$default(cartButton, 0L, new SubscribeViewV4$bind$1$1$1(vo, this), 1, null);
        } else {
            cartButton.setViewState(PlainViewV4Kt.toViewState(vo.getSubscribe(), vo.getStyle(), vo.getPriorityColor()));
            ViewExtKt.setOnClickListenerThrottle$default(cartButton, 0L, new SubscribeViewV4$bind$1$1$2(vo, this), 1, null);
        }
    }

    public final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    public final void setActionHandler(Function1<? super AtomAction, Unit> function1) {
        this.actionHandler = function1;
    }

    public final void shake() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.shake);
        this.binding.cartButton.startAnimation(loadAnimation);
        loadAnimation.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeViewV4(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCartbuttonSimpleBinding inflate = WidgetCartbuttonSimpleBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setId(R$id.cartBtn);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
