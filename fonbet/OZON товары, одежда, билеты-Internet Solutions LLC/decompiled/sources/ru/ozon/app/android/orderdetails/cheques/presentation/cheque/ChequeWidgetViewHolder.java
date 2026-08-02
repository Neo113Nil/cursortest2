package ru.ozon.app.android.orderdetails.cheques.presentation.cheque;

import DQ.b;
import Hj.C3143a;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeWidgetViewHolder;
import ru.ozon.app.android.orderdetails.databinding.WidgetChequesLayoutBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeVO;Ll20/d;)V", "Lru/ozon/app/android/orderdetails/databinding/WidgetChequesLayoutBinding;", "binding", "Lru/ozon/app/android/orderdetails/databinding/WidgetChequesLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "Lkotlin/jvm/functions/Function1;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ChequeWidgetViewHolder extends k<ChequeVO> {

    @NotNull
    private final WidgetChequesLayoutBinding binding;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float CARD_RADIUS = UiExtKt.toPxF(12);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/orderdetails/cheques/presentation/cheque/ChequeWidgetViewHolder$Companion;", "", "<init>", "()V", "CARD_RADIUS", "", "getCARD_RADIUS", "()F", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCARD_RADIUS() {
            return ChequeWidgetViewHolder.CARD_RADIUS;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChequeWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerRefs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        WidgetChequesLayoutBinding bind = WidgetChequesLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.onAction = new ActionHandler.Builder(composerRefs, this).buildHandler();
        bind.chequesTitleTv.setOnClickListener(new b(this, 5));
        ConstraintLayout constraintLayout = bind.rootCl;
        constraintLayout.setClipToOutline(true);
        constraintLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.app.android.orderdetails.cheques.presentation.cheque.ChequeWidgetViewHolder$2$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                ChequeWidgetViewHolder.Companion companion;
                int f7 = C3143a.f(view, "view", outline, "outline");
                int height = view.getHeight();
                companion = ChequeWidgetViewHolder.Companion;
                outline.setRoundRect(0, 0, f7, height, companion.getCARD_RADIUS());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(ChequeWidgetViewHolder chequeWidgetViewHolder, View view) {
        AtomAction action;
        ChequeVO boundData = chequeWidgetViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        chequeWidgetViewHolder.onAction.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ChequeVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetChequesLayoutBinding widgetChequesLayoutBinding = this.binding;
        widgetChequesLayoutBinding.chequesTitleTv.setText(item.getTitle());
        widgetChequesLayoutBinding.chequesSubtitleTv.setText(item.getSubtitle());
        widgetChequesLayoutBinding.chequesPriceTv.setText(item.getPrice());
        SmallButtonView chequesButtonB = widgetChequesLayoutBinding.chequesButtonB;
        Intrinsics.checkNotNullExpressionValue(chequesButtonB, "chequesButtonB");
        WrappedButtonHolderKt.bind(chequesButtonB, item.getButton(), this.onAction);
    }
}
