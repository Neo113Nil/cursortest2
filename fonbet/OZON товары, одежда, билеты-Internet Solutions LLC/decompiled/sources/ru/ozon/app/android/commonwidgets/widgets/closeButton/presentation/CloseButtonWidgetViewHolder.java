package ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation;

import a00.C4911f;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import nr.DialogInterfaceOnClickListenerC8617a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.common.commonwidgets.databinding.WidgetCloseButtonLayoutBinding;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.data.Dialog;
import ru.ozon.app.android.commonwidgets.widgets.closeButton.presentation.CloseButtonWidgetViewHolder;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;La00/f;)V", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;", "dialog", "", "showRemoveConfirmationDialog", "(Lru/ozon/app/android/commonwidgets/widgets/closeButton/data/Dialog;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "La00/f;", "Lru/ozon/app/android/commonwidgets/widgets/closeButton/presentation/CloseButtonVO;", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCloseButtonLayoutBinding;", "binding", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCloseButtonLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/jvm/functions/Function1;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CloseButtonWidgetViewHolder extends k<CloseButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> action;

    @NotNull
    private final WidgetCloseButtonLayoutBinding binding;

    @NotNull
    private final C4911f container;

    @NotNull
    private final View containerView;
    private CloseButtonVO item;

    @NotNull
    private final ComposerReferences ref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseButtonWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences ref, @NotNull C4911f container) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(container, "container");
        this.containerView = containerView;
        this.ref = ref;
        this.container = container;
        WidgetCloseButtonLayoutBinding bind = WidgetCloseButtonLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.action = new CloseButtonWidgetViewHolder$action$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRemoveConfirmationDialog(Dialog dialog) {
        f.a aVar = new f.a(getContext());
        aVar.setTitle(dialog.getTitle());
        aVar.f(dialog.getText());
        aVar.h(dialog.getCancelButton().getText(), new DialogInterfaceOnClickListenerC8617a());
        aVar.m(dialog.getSubmitButton().getText(), new DialogInterface.OnClickListener() { // from class: nr.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CloseButtonWidgetViewHolder.showRemoveConfirmationDialog$lambda$2$lambda$1(CloseButtonWidgetViewHolder.this, dialogInterface, i11);
            }
        });
        aVar.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRemoveConfirmationDialog$lambda$2$lambda$1(CloseButtonWidgetViewHolder closeButtonWidgetViewHolder, DialogInterface dialogInterface, int i11) {
        if (ComposerExtKt.isFlow(closeButtonWidgetViewHolder.ref.getContainer())) {
            ComposerExtKt.setResult$default(closeButtonWidgetViewHolder.ref.getContainer(), null, 0, null, 7, null);
            ComposerExtKt.closeFlow(closeButtonWidgetViewHolder.ref.getContainer());
        } else {
            closeButtonWidgetViewHolder.ref.getNavigator().popBackStack();
            ComposerExtKt.sendRefreshToTargetFragment$default(closeButtonWidgetViewHolder.container, null, null, null, null, 15, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CloseButtonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        SmallIconButtonView closeSibv = this.binding.closeSibv;
        Intrinsics.checkNotNullExpressionValue(closeSibv, "closeSibv");
        WrappedIconButtonHolderKt.bind(closeSibv, item.getButton(), this.action);
    }
}
