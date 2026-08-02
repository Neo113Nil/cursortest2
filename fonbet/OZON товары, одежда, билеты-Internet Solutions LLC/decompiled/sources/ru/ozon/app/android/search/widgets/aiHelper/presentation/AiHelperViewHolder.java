package ru.ozon.app.android.search.widgets.aiHelper.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import T00.a;
import U7.d;
import Ve.C4598rp;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.R$string;
import ru.ozon.app.android.search.widgets.aiHelper.data.ProcessingStatus;
import ru.ozon.app.android.search.widgets.utils.SearchAiUtilsKt;
import ru.ozon.app.android.search.widgets.utils.TimerHelper;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperView;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;)V", "", "maxRetries", "", "startTimer", "(Ljava/lang/Long;)V", "stopTimer", "()V", "showNotification", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;Ll20/d;)V", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/SearchAiViewModel;", "Lru/ozon/app/android/search/widgets/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/search/widgets/utils/TimerHelper;", "", "currentPage", "Ljava/lang/String;", "Lru/ozon/app/android/search/widgets/aiHelper/data/ProcessingStatus;", "prevPollingStatus", "Lru/ozon/app/android/search/widgets/aiHelper/data/ProcessingStatus;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperViewHolder extends k<AiHelperVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private String currentPage;
    private ProcessingStatus prevPollingStatus;

    @NotNull
    private final ComposerReferences refs;
    private TimerHelper timerHelper;

    @NotNull
    private final AiHelperView view;

    @NotNull
    private final SearchAiViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperViewHolder$Companion;", "", "<init>", "()V", "LIKE_SEARCH_AI_KEY", "", "DISLIKE_SEARCH_AI_KEY", "RESTART_SEARCH_AI_KEY", "COPY_DEBUG_INFO_KEY", "DEBUG_INFO_KEY", "AI_RESULT_ID_KEY", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiHelperViewHolder(@NotNull AiHelperView view, @NotNull ComposerReferences refs, @NotNull SearchAiViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.refs = refs;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new AiHelperViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification() {
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        View view = c11 != null ? c11.getView() : null;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(viewGroup, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, new NotificationDTO(StringProvider.getString(R$string.ai_helper_notification_message_copy), null, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 478, null), this.refs.getContainer().g(), this.actionHandler).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startTimer(Long maxRetries) {
        AiHelperVO boundData = getBoundData();
        if (boundData != null) {
            TimerHelper timerHelper = this.timerHelper;
            if (timerHelper != null) {
                timerHelper.stopTimer();
            }
            TimerHelper timerHelper2 = new TimerHelper(d.c(this.refs));
            this.timerHelper = timerHelper2;
            timerHelper2.startTimer(maxRetries, boundData.getPollingIntervalMs(), new AiHelperViewHolder$startTimer$1$1(this), new AiHelperViewHolder$startTimer$1$2(this, boundData));
        }
    }

    static /* synthetic */ void startTimer$default(AiHelperViewHolder aiHelperViewHolder, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        aiHelperViewHolder.startTimer(l11);
    }

    private final void stopTimer() {
        AtomActionDTO stopAction;
        Map<String, String> params;
        if (SearchAiUtilsKt.isAiInitMode(this.currentPage)) {
            TimerHelper timerHelper = this.timerHelper;
            if (timerHelper != null) {
                timerHelper.stopTimer();
            }
            SearchAiViewModel searchAiViewModel = this.viewModel;
            AiHelperVO boundData = getBoundData();
            String str = (boundData == null || (stopAction = boundData.getStopAction()) == null || (params = stopAction.getParams()) == null) ? null : params.get("aiResultId");
            if (str == null) {
                str = "";
            }
            searchAiViewModel.stopSearchAi(str);
            this.timerHelper = null;
            this.prevPollingStatus = null;
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        C4598rp.f(this.refs, new C2408n0(C2399j.o(C5427n.a(this.viewModel.getPollingStatus(), d.c(this.refs), AbstractC5434v.b.STARTED)), new AiHelperViewHolder$onAttachViewModel$1(this, null)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AiHelperVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item, this.actionHandler);
        a b11 = info.b();
        String c11 = b11 != null ? b11.c() : null;
        this.currentPage = c11;
        if (SearchAiUtilsKt.isAiInitMode(c11)) {
            startTimer$default(this, null, 1, null);
        }
    }
}
