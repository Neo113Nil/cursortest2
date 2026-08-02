package ru.ozon.app.android.session.session.presentation;

import Sc.o;
import a00.C4911f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.dialog.DialogBuilder;
import ru.ozon.app.android.dialog.sheetView.SheetViewDialogBuilder;
import ru.ozon.app.android.session.databinding.SessionBinding;
import ru.ozon.app.android.session.session.presentation.dataList.SessionDataAdapter;
import ru.ozon.app.android.session.session.presentation.dataList.SessionDataDecoration;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionEvent;
import ru.ozon.app.android.session.session.presentation.viewModel.SessionViewModel;
import ru.ozon.app.android.session.sessionList.data.SessionListNeedUpdate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000e0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/session/session/presentation/SessionViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/session/presentation/SessionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/session/databinding/SessionBinding;", "binding", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/session/databinding/SessionBinding;Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;", "event", "", "onEvent", "(Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent;)V", "onShowError", "()V", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLogoutDialog;", "onShowLogoutDialog", "(Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$ShowLogoutDialog;)V", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$NavigateToSessionList;", "onNavigateToSessionList", "(Lru/ozon/app/android/session/session/presentation/viewModel/SessionEvent$NavigateToSessionList;)V", "", "message", "showMessage", "(Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/session/presentation/SessionVO;Ll20/d;)V", "Lru/ozon/app/android/session/databinding/SessionBinding;", "Lru/ozon/app/android/session/session/presentation/viewModel/SessionViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/session/session/presentation/dataList/SessionDataAdapter;", "sessionDataAdapter", "Lru/ozon/app/android/session/session/presentation/dataList/SessionDataAdapter;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionViewHolder extends k<SessionVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final SessionBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final SessionDataAdapter sessionDataAdapter;

    @NotNull
    private final SessionViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SessionViewHolder(@NotNull SessionBinding binding, @NotNull SessionViewModel viewModel, @NotNull ComposerReferences refs) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        LinearLayoutCompat constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new SessionViewHolder$actionHandler$1(viewModel)).buildHandler();
        SessionDataAdapter sessionDataAdapter = new SessionDataAdapter();
        this.sessionDataAdapter = sessionDataAdapter;
        RecyclerView recyclerView = binding.dataRecyclerView;
        recyclerView.setAdapter(sessionDataAdapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new SessionDataDecoration(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEvent(SessionEvent event) {
        if (Intrinsics.d(event, SessionEvent.ShowLoadingOverlay.INSTANCE)) {
            this.refs.getController().e(new l.a.C1079a(0L, null, 3));
            return;
        }
        if (Intrinsics.d(event, SessionEvent.HideLoadingOverlay.INSTANCE)) {
            this.refs.getController().hideLoader();
            return;
        }
        if (event instanceof SessionEvent.ShowLogoutDialog) {
            onShowLogoutDialog((SessionEvent.ShowLogoutDialog) event);
        } else if (event instanceof SessionEvent.NavigateToSessionList) {
            onNavigateToSessionList((SessionEvent.NavigateToSessionList) event);
        } else {
            if (!Intrinsics.d(event, SessionEvent.ShowError.INSTANCE)) {
                throw new o();
            }
            onShowError();
        }
    }

    private final void onNavigateToSessionList(SessionEvent.NavigateToSessionList event) {
        String message = event.getMessage();
        if (message != null) {
            showMessage(message);
        }
        SessionListNeedUpdate.INSTANCE.getValue().set(true);
        this.refs.getNavigator().popBackStack();
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

    private final void onShowLogoutDialog(SessionEvent.ShowLogoutDialog event) {
        r a11 = this.refs.getContainer().a();
        if (a11 == null) {
            return;
        }
        DialogBuilder title = new SheetViewDialogBuilder(a11).setTitle(event.getTitle());
        String subtitle = event.getSubtitle();
        if (subtitle != null) {
            title.setSubtitle(subtitle);
        }
        DialogBuilder.setCancelButton$default(DialogBuilder.setSubmitButton$default(title, event.getConfirmActionText(), null, new SessionViewHolder$onShowLogoutDialog$2(this, event), 2, null), event.getCancelActionText(), null, SessionViewHolder$onShowLogoutDialog$3.INSTANCE, 2, null).build().show();
    }

    private final void showMessage(String message) {
        ViewGroup rootView;
        C4911f container = this.refs.getContainer();
        r a11 = container.a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, Integer.valueOf(R$drawable.ic_m_exclamation), null, null, null, null, null, null, null, null, null, null, container.f(), 65498, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.viewModel.getEvents().observe(lifecycle, new SessionViewHolder$sam$androidx_lifecycle_Observer$0(new SessionViewHolder$onAttachViewModel$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SessionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SessionBinding sessionBinding = this.binding;
        sessionBinding.headerTextView.setText(item.getHeader().getTitle());
        LargeButtonView logoutButton = sessionBinding.logoutButton;
        Intrinsics.checkNotNullExpressionValue(logoutButton, "logoutButton");
        LargeButtonHolderKt.bindOrGone(logoutButton, item.getLogoutButton(), this.actionHandler);
        this.sessionDataAdapter.submitList(item.getDataList());
    }
}
