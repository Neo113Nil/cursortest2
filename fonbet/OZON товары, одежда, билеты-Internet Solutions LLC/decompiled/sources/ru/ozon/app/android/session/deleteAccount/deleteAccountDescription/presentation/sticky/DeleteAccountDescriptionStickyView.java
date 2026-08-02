package ru.ozon.app.android.session.deleteAccount.deleteAccountDescription.presentation.sticky;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import j10.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.session.databinding.WidgetDeleteAccountDescriptionStickyBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"¨\u0006)"}, d2 = {"Lru/ozon/app/android/session/deleteAccount/deleteAccountDescription/presentation/sticky/DeleteAccountDescriptionStickyView;", "", "Landroid/view/ViewGroup;", "composerRootView", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "Lj10/h;", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/viewmodel/ComposerVoHelper;", "voHelper", "<init>", "(Landroid/view/ViewGroup;Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lj10/h;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "button", "", "bind", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;)V", ProductAction.ACTION_REMOVE, "()V", "hideKeyboard", "", "message", "showRestriction", "(Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountDescriptionStickyBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetDeleteAccountDescriptionStickyBinding;", "Lkotlin/Function1;", "onComposerActionClick", "Lkotlin/jvm/functions/Function1;", "getOnComposerActionClick", "()Lkotlin/jvm/functions/Function1;", "setOnComposerActionClick", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeleteAccountDescriptionStickyView {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDeleteAccountDescriptionStickyBinding binding;

    @NotNull
    private final ViewGroup composerRootView;

    @NotNull
    private final View containerView;
    private Function1<? super String, Unit> onComposerActionClick;

    @NotNull
    private final ComposerReferences ref;

    public DeleteAccountDescriptionStickyView(@NotNull ViewGroup composerRootView, @NotNull View containerView, @NotNull ComposerReferences ref, @NotNull h<l> voHelper) {
        Intrinsics.checkNotNullParameter(composerRootView, "composerRootView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(voHelper, "voHelper");
        this.composerRootView = composerRootView;
        this.containerView = containerView;
        this.ref = ref;
        WidgetDeleteAccountDescriptionStickyBinding bind = WidgetDeleteAccountDescriptionStickyBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, voHelper, DeleteAccountDescriptionStickyVO.class).onComposerAction(new DeleteAccountDescriptionStickyView$actionHandler$1(this)).buildHandler();
    }

    public final void bind(@NotNull ButtonV3Atom.LargeButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        LargeButtonView deleteAccountDescriptionStickyBtn = this.binding.deleteAccountDescriptionStickyBtn;
        Intrinsics.checkNotNullExpressionValue(deleteAccountDescriptionStickyBtn, "deleteAccountDescriptionStickyBtn");
        LargeButtonHolderKt.bind(deleteAccountDescriptionStickyBtn, button, this.actionHandler);
    }

    public final Function1<String, Unit> getOnComposerActionClick() {
        return this.onComposerActionClick;
    }

    public final void hideKeyboard() {
        KeyboardUtilsKt.hideKeyboard(this.composerRootView);
    }

    public final void remove() {
        ComposerViewExtensionKt.composerBottomContainer(this.composerRootView).removeView(this.binding.deleteAccountDescriptionStickyBtn);
    }

    public final void setOnComposerActionClick(Function1<? super String, Unit> function1) {
        this.onComposerActionClick = function1;
    }

    public final void showRestriction(String message) {
        String string = message == null ? StringProvider.getString(R$string.common_universal_network_error) : message;
        View rootView = this.containerView.getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            FlashbarFactory.create$default(FlashbarFactory.INSTANCE, viewGroup, null, OzonSpannableStringKt.toOzonSpannableString(string), null, null, Integer.valueOf(R$drawable.ic_warning), null, null, null, null, null, null, null, 3000L, null, null, this.ref.getContainer().g(), 57306, null).show();
        }
    }
}
