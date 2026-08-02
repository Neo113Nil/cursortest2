package ru.ozon.app.android.pdp.widgets.cartButtonV4.plain;

import Dy.ViewOnClickListenerC2883a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonSimpleBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainViewV4;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainVO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/plain/PlainVO;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "getOnAction", "()Lkotlin/jvm/functions/Function1;", "setOnAction", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonSimpleBinding;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonSimpleBinding;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlainViewV4 extends ConstraintLayout {

    @NotNull
    private final WidgetCartbuttonSimpleBinding binding;
    private Function1<? super AtomAction, Unit> onAction;

    public /* synthetic */ PlainViewV4(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(PlainVO plainVO, PlainViewV4 plainViewV4, View view) {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        ButtonV3Atom.LargeButton button = plainVO.getButton();
        AtomActionDTO action = button.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, button.getTrackingInfo())) == null || (function1 = plainViewV4.onAction) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    public final void bind(@NotNull PlainVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        WidgetCartbuttonSimpleBinding widgetCartbuttonSimpleBinding = this.binding;
        widgetCartbuttonSimpleBinding.cartButton.setViewState(PlainViewV4Kt.toViewState(vo));
        widgetCartbuttonSimpleBinding.cartButton.setEnabled(vo.getButton().getAction() != null);
        View separatorView = widgetCartbuttonSimpleBinding.separatorView;
        Intrinsics.checkNotNullExpressionValue(separatorView, "separatorView");
        separatorView.setVisibility(vo.getHasShadow() ? 0 : 8);
        setOnClickListener(new ViewOnClickListenerC2883a(12, vo, this));
    }

    public final void setOnAction(Function1<? super AtomAction, Unit> function1) {
        this.onAction = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlainViewV4(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCartbuttonSimpleBinding inflate = WidgetCartbuttonSimpleBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        setId(R$id.cartBtn);
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
    }
}
