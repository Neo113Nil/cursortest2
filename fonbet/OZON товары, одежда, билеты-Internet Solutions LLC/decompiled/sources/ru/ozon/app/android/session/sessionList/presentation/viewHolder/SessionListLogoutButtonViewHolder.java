package ru.ozon.app.android.session.sessionList.presentation.viewHolder;

import Sc.o;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.dialog.DialogBuilder;
import ru.ozon.app.android.dialog.sheetView.SheetViewDialogBuilder;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.session.sessionList.data.LogoutOnAllMessage;
import ru.ozon.app.android.session.sessionList.presentation.SessionListEvent;
import ru.ozon.app.android.session.sessionList.presentation.SessionListVO;
import ru.ozon.app.android.session.sessionList.presentation.SessionListViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.Style;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/viewHolder/SessionListLogoutButtonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$LogoutButton;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "view", "Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;", "event", "", "onEvent", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent;)V", "onShowError", "()V", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog;", "onShowOnAllLogoutDialog", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog;)V", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$NavigateToHome;", "onNavigateToHome", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$NavigateToHome;)V", "navigateToHome", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$CloseScreen;", "onCloseScreen", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$CloseScreen;)V", "Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;", "Lru/ozon/uni/atoms/data/controls/button/Style;", "toButtonStyle", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListEvent$ShowLogoutOnAllDialog$DialogTheme;)Lru/ozon/uni/atoms/data/controls/button/Style;", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/sessionList/presentation/SessionListVO$LogoutButton;Ll20/d;)V", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "Lru/ozon/app/android/session/sessionList/presentation/SessionListViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListLogoutButtonViewHolder extends k<SessionListVO.LogoutButton> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final LargeButtonView view;

    @NotNull
    private final SessionListViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionListEvent.ShowLogoutOnAllDialog.DialogTheme.values().length];
            try {
                iArr[SessionListEvent.ShowLogoutOnAllDialog.DialogTheme.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionListEvent.ShowLogoutOnAllDialog.DialogTheme.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionListLogoutButtonViewHolder(@NotNull LargeButtonView view, @NotNull SessionListViewModel viewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new SessionListLogoutButtonViewHolder$actionHandler$1(viewModel)).buildHandler();
    }

    private final void navigateToHome() {
        String uri = LinkGenerator.INSTANCE.clearBackStack().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), uri, null, 2, null);
    }

    private final void onCloseScreen(SessionListEvent.CloseScreen event) {
        LogoutOnAllMessage logoutOnAllMessage = LogoutOnAllMessage.INSTANCE;
        C4911f container = this.refs.getContainer();
        String message = event.getMessage();
        if (message == null) {
            return;
        }
        logoutOnAllMessage.show(container, message);
        this.refs.getNavigator().popBackStack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEvent(SessionListEvent event) {
        if (Intrinsics.d(event, SessionListEvent.ShowLoadingOverlay.INSTANCE)) {
            this.refs.getController().e(new l.a.C1079a(0L, null, 3));
            return;
        }
        if (Intrinsics.d(event, SessionListEvent.HideLoadingOverlay.INSTANCE)) {
            this.refs.getController().hideLoader();
            return;
        }
        if (event instanceof SessionListEvent.ShowLogoutOnAllDialog) {
            onShowOnAllLogoutDialog((SessionListEvent.ShowLogoutOnAllDialog) event);
            return;
        }
        if (event instanceof SessionListEvent.NavigateToHome) {
            onNavigateToHome((SessionListEvent.NavigateToHome) event);
        } else if (event instanceof SessionListEvent.CloseScreen) {
            onCloseScreen((SessionListEvent.CloseScreen) event);
        } else {
            if (!Intrinsics.d(event, SessionListEvent.ShowError.INSTANCE)) {
                throw new o();
            }
            onShowError();
        }
    }

    private final void onNavigateToHome(SessionListEvent.NavigateToHome event) {
        LogoutOnAllMessage.INSTANCE.setPendingValue(event.getMessage());
        navigateToHome();
    }

    private final void onShowError() {
        ViewGroup rootView;
        C4911f container = this.refs.getContainer();
        r a11 = container.a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    private final void onShowOnAllLogoutDialog(SessionListEvent.ShowLogoutOnAllDialog event) {
        r a11 = this.refs.getContainer().a();
        if (a11 == null) {
            return;
        }
        DialogBuilder title = new SheetViewDialogBuilder(a11).setTitle(event.getTitle());
        String subtitle = event.getSubtitle();
        if (subtitle != null) {
            title.setSubtitle(subtitle);
        }
        DialogBuilder.setCancelButton$default(title.setSubmitButton(event.getConfirmActionText(), toButtonStyle(event.getTheme()), new SessionListLogoutButtonViewHolder$onShowOnAllLogoutDialog$2(this, event)), event.getCancelActionText(), null, SessionListLogoutButtonViewHolder$onShowOnAllLogoutDialog$3.INSTANCE, 2, null).build().show();
    }

    private final Style toButtonStyle(SessionListEvent.ShowLogoutOnAllDialog.DialogTheme dialogTheme) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[dialogTheme.ordinal()];
        if (i11 == 1) {
            return Style.ACTION_PRIMARY;
        }
        if (i11 == 2) {
            return Style.NEGATIVE_SECONDARY;
        }
        throw new o();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getEvents().observe(lifecycle, new SessionListLogoutButtonViewHolder$sam$androidx_lifecycle_Observer$0(new SessionListLogoutButtonViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SessionListVO.LogoutButton item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        LargeButtonHolderKt.bind(this.view, item.getAtom(), this.actionHandler);
    }
}
