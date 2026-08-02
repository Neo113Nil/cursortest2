package ru.ozon.app.android.pdp.ui.configurators.ugc.question;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import a00.C4911f;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.pdp.ui.configurators.R$string;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.ActionType;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModel;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.CallApiViewModelImpl;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/question/QuestionsConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "LPc/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModelImpl;", "pViewModel", "<init>", "(LPc/a;)V", "Landroid/content/Intent;", "data", "", "proceedComposerAction", "(Landroid/content/Intent;)V", "refreshPreviousPage", "()V", "showQuestionSentNotification", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onResume", "(Landroidx/lifecycle/J;)V", "", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "LPc/a;", "", "shouldRefresh", "Z", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CallApiViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder$delegate", "getReportAbuseResultNotificationBinder", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "reportAbuseResultNotificationBinder", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class QuestionsConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final a<CallApiViewModelImpl> pViewModel;

    /* renamed from: reportAbuseResultNotificationBinder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j reportAbuseResultNotificationBinder;
    private boolean shouldRefresh;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel;
    public static final int $stable = 8;

    public QuestionsConfigurator(@NotNull a<CallApiViewModelImpl> pViewModel) {
        Intrinsics.checkNotNullParameter(pViewModel, "pViewModel");
        this.pViewModel = pViewModel;
        this.viewModel = k.b(new QuestionsConfigurator$viewModel$2(this));
        this.reportAbuseResultNotificationBinder = DelegatesKt.lazyUnsafe(new QuestionsConfigurator$reportAbuseResultNotificationBinder$2(this));
    }

    private final ReportAbuseResultNotificationBinder getReportAbuseResultNotificationBinder() {
        return (ReportAbuseResultNotificationBinder) this.reportAbuseResultNotificationBinder.getValue();
    }

    private final CallApiViewModel getViewModel() {
        return (CallApiViewModel) this.viewModel.getValue();
    }

    private final void proceedComposerAction(Intent data) {
        CallApiViewModel viewModel;
        if (data != null) {
            long longExtra = data.getLongExtra("extra_id", 0L);
            String stringExtra = data.getStringExtra("extra_action_name");
            if (stringExtra == null) {
                return;
            }
            Serializable serializableExtra = data.getSerializableExtra("extra_action_params");
            HashMap hashMap = serializableExtra instanceof HashMap ? (HashMap) serializableExtra : null;
            if (hashMap == null) {
                return;
            }
            Serializable serializableExtra2 = data.getSerializableExtra("extra_action_type");
            ActionType actionType = serializableExtra2 instanceof ActionType ? (ActionType) serializableExtra2 : null;
            if (actionType == null || (viewModel = getViewModel()) == null) {
                return;
            }
            viewModel.proceedComposerAction(longExtra, actionType, stringExtra, hashMap);
        }
    }

    private final void refreshPreviousPage() {
        C4911f ownerContainer;
        ComponentCallbacksC5392m targetFragment;
        ConfiguratorReferences references = getReferences();
        if (references != null && (ownerContainer = references.getOwnerContainer()) != null && (targetFragment = ownerContainer.j().getTargetFragment()) != null) {
            targetFragment.onActivityResult(9820, -1, null);
        }
        this.shouldRefresh = true;
    }

    private final void showQuestionSentNotification() {
        C4911f ownerContainer;
        r a11;
        ConfiguratorReferences references;
        C4911f ownerContainer2;
        r a12;
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ConfiguratorReferences references2 = getReferences();
        if (references2 == null || (ownerContainer = references2.getOwnerContainer()) == null || (a11 = ownerContainer.a()) == null || (references = getReferences()) == null || (ownerContainer2 = references.getOwnerContainer()) == null || (a12 = ownerContainer2.a()) == null || (rootView = ContextExtKt.getRootView(a12)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.reviews_question_sent_notification_title), StringProvider.getString(R$string.reviews_question_sent_notification_subtitle), null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 476, null), a11, null, 8, null).show();
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            if (requestCode == 8290) {
                proceedComposerAction(data);
            } else if (requestCode == 9082) {
                showQuestionSentNotification();
            } else {
                if (requestCode != 9820) {
                    return;
                }
                refreshPreviousPage();
            }
        }
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ReportAbuseResultNotificationBinder.setupFragmentResultListener$default(getReportAbuseResultNotificationBinder(), false, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getReportAbuseResultNotificationBinder().clearFragmentResultListener();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull J owner) {
        InterfaceC7851b controller;
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.shouldRefresh) {
            this.shouldRefresh = false;
            ConfiguratorReferences references = getReferences();
            if (references == null || (controller = references.getController()) == null) {
                return;
            }
            InterfaceC7851b.a.a(controller, null, null, null, null, 15);
        }
    }
}
