package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.button;

import Vg.c;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/button/EmptyScreenButtonWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/button/EmptyScreenButtonVI;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "buttonView", "Ll10/i;", "container", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "defaultActionHandlers", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;Ll10/i;LVg/c;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/button/EmptyScreenButtonVI;)V", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButton;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmptyScreenButtonWidgetViewHolder extends AbstractC6064a<EmptyScreenButtonVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final MorkovskShadowButton buttonView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyScreenButtonWidgetViewHolder(@NotNull MorkovskShadowButton buttonView, @NotNull i container, @NotNull c defaultActionHandlers, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(defaultActionHandlers, "defaultActionHandlers");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.buttonView = buttonView;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new EmptyScreenButtonWidgetViewHolder$actionHandler$1(defaultActionHandlers)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull EmptyScreenButtonVI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.buttonView.bind(item.getButton(), new EmptyScreenButtonWidgetViewHolder$bind$1(this));
    }
}
