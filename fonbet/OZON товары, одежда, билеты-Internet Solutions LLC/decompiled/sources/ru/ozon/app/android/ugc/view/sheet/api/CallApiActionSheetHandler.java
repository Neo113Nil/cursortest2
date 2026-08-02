package ru.ozon.app.android.ugc.view.sheet.api;

import GZ.g;
import Sc.o;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.AtomActionSheetHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.R$string;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.app.android.pdp.ui.configurators.ugc.question.VoteUpdateKey;
import ru.ozon.app.android.ugc.view.sheet.ExtionSheetExtensionsKt;
import ru.ozon.app.android.ugc.view.sheet.bind.ActionSheetInfo;
import ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/ugc/view/sheet/api/CallApiActionSheetHandler;", "Lru/ozon/app/android/ugc/view/sheet/bind/ActionSheetInfo;", "T", "Lru/ozon/app/android/ugc/view/sheet/bind/ReviewActionSheetHandler;", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "callApiViewModel", "LGZ/g;", "router", "", "isSelectApp", "", "Lru/ozon/app/android/action/sheet/AtomActionSheetHandler$SheetAction;", "supported", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;LGZ/g;ZLjava/util/Set;)V", "", "id", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "updateLocal", "(JLru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;)V", "refresh", "()V", "showReportSuccess", "markPreviousPageToBeRefreshed", "isNetworkError", "showError", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ActionType;Z)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "handle", "(Lru/ozon/uni/atoms/af/AtomAction;)Z", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "LGZ/g;", "Z", "Ljava/util/Set;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CallApiActionSheetHandler<T extends ActionSheetInfo> extends ReviewActionSheetHandler<T> {

    @NotNull
    private final CallApiViewModel callApiViewModel;
    private final boolean isSelectApp;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final g router;

    @NotNull
    private final Set<AtomActionSheetHandler.SheetAction> supported;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.view.sheet.api.CallApiActionSheetHandler$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<CallApiViewModelImpl.Action, Unit> {
        final /* synthetic */ CallApiActionSheetHandler<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(CallApiActionSheetHandler<T> callApiActionSheetHandler) {
            super(1);
            this.this$0 = callApiActionSheetHandler;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CallApiViewModelImpl.Action action) {
            invoke2(action);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CallApiViewModelImpl.Action action) {
            Object valueOf;
            if (action instanceof CallApiViewModelImpl.Action.LocalChange) {
                CallApiViewModelImpl.Action.LocalChange localChange = (CallApiViewModelImpl.Action.LocalChange) action;
                this.this$0.updateLocal(localChange.getId(), localChange.getActionType());
                valueOf = Unit.f71690a;
            } else if (action instanceof CallApiViewModelImpl.Action.Refresh) {
                this.this$0.refresh();
                valueOf = Unit.f71690a;
            } else if (action instanceof CallApiViewModelImpl.Action.Report) {
                this.this$0.showReportSuccess();
                valueOf = Unit.f71690a;
            } else if (action instanceof CallApiViewModelImpl.Action.Error) {
                CallApiViewModelImpl.Action.Error error = (CallApiViewModelImpl.Action.Error) action;
                this.this$0.showError(error.getActionType(), error.getIsNetworkError());
                valueOf = Unit.f71690a;
            } else {
                if (!(action instanceof CallApiViewModelImpl.Action.Auth)) {
                    throw new o();
                }
                g gVar = ((CallApiActionSheetHandler) this.this$0).router;
                String uri = LinkGenerator.INSTANCE.auth().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                valueOf = Boolean.valueOf(g.a.a(gVar, uri, null, null, 6));
            }
            WhenExtKt.getExhaustive(valueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallApiActionSheetHandler(@NotNull ComposerReferences refs, @NotNull CallApiViewModel callApiViewModel, @NotNull g router, boolean z11, @NotNull Set<? extends AtomActionSheetHandler.SheetAction> supported) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(callApiViewModel, "callApiViewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(supported, "supported");
        this.refs = refs;
        this.callApiViewModel = callApiViewModel;
        this.router = router;
        this.isSelectApp = z11;
        this.supported = supported;
        P<CallApiViewModelImpl.Action> actionLiveData = callApiViewModel.getActionLiveData();
        T t2 = new T();
        t2.a(actionLiveData, new CallApiActionSheetHandler$inlined$sam$i$androidx_lifecycle_Observer$0(new CallApiActionSheetHandler$special$$inlined$filter$1(t2, this)));
        t2.observe(refs.getContainer().g(), new CallApiActionSheetHandler$sam$androidx_lifecycle_Observer$0(new AnonymousClass2(this)));
    }

    private final void markPreviousPageToBeRefreshed() {
        ComponentCallbacksC5392m targetFragment = this.refs.getContainer().j().getTargetFragment();
        if (targetFragment != null) {
            targetFragment.onActivityResult(9820, -1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        InterfaceC7851b.a.a(this.refs.getController(), null, null, null, null, 15);
        markPreviousPageToBeRefreshed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(ActionType actionType, boolean isNetworkError) {
        showNotification(isNetworkError ? NotificationBarHelperKt.createNetworkErrorNotificationDTO(this.isSelectApp) : C7714v.b0(ActionType.LIKE, ActionType.DISLIKE, ActionType.VOTE_QUESTION, ActionType.REPORT).contains(actionType) ? NotificationsKt.createFailedToSendNotification() : NotificationsKt.createUnknownErrorNotification());
    }

    private final void showNotification(NotificationDTO notification) {
        ViewGroup rootView;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(rootView)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, this.refs.getContainer().g(), null, 8, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showReportSuccess() {
        showNotification(new NotificationDTO(StringProvider.getString(R$string.abuse_report_success), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 478, null));
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLocal(long id2, ActionType actionType) {
        this.refs.getController().update(new VoteUpdateKey(id2, actionType));
        markPreviousPageToBeRefreshed();
    }

    @Override // ru.ozon.app.android.ugc.view.sheet.bind.ReviewActionSheetHandler
    public boolean handle(@NotNull AtomAction action) {
        T item;
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof AtomAction.ComposerAction) || (item = getItem()) == null) {
            return false;
        }
        AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
        AtomActionSheetHandler.SheetAction fromValue = AtomActionSheetHandler.SheetAction.INSTANCE.fromValue(composerAction.getId());
        if (fromValue == null) {
            return false;
        }
        ActionType actionType = ExtionSheetExtensionsKt.toActionType(fromValue);
        boolean contains = this.supported.contains(fromValue);
        if (contains) {
            this.callApiViewModel.proceedComposerAction(item.getId(), actionType, composerAction.getActionName(), composerAction.getParams());
        }
        return contains;
    }
}
