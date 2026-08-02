package ru.ozon.app.android.common.buttonwidget.presentation;

import Vg.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.common.ui.buttonwidget.ButtonVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00130\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/common/buttonwidget/presentation/ButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "customActionHandlersStore", "<init>", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;LVg/c;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/ui/buttonwidget/ButtonVO;Ll20/d;)V", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "", "dp16", "I", "dp8", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonWidgetViewHolder extends k<ButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SingleAtom containerView;
    private final int dp16;
    private final int dp8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWidgetViewHolder(@NotNull SingleAtom containerView, @NotNull ComposerReferences references, @NotNull HandlersInhibitor inhibitor, @NotNull c customActionHandlersStore) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        Intrinsics.checkNotNullParameter(customActionHandlersStore, "customActionHandlersStore");
        this.containerView = containerView;
        this.dp16 = UiExtKt.toPx(16);
        this.dp8 = UiExtKt.toPx(8);
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).customActionHandlers(new ButtonWidgetViewHolder$actionHandler$1(customActionHandlersStore)).enableClickThrottling(inhibitor).buildHandler();
        this.actionHandler = buildHandler;
        containerView.setOnAction(buildHandler);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ButtonDTO buttonV2 = item.getButtonV2();
        ButtonV3Atom.LargeButton button = item.getButton();
        if (buttonV2 != null) {
            SingleAtom.bind$default(this.containerView, buttonV2, false, 2, null);
            return;
        }
        if (button != null) {
            SingleAtom singleAtom = this.containerView;
            singleAtom.setBackgroundColor(singleAtom.getContext().getColor(R$color.oz_semantic_bg_secondary));
            int i11 = this.dp16;
            int i12 = this.dp8;
            singleAtom.setPadding(i11, i12, i11, i12);
            SingleAtom.bind$default(singleAtom, button, false, 2, null);
        }
    }
}
