package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import Sc.InterfaceC4008j;
import Sc.o;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.ui.configurators.NotificationsKt;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.ReviewVoteUpdateKey;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"H\u0004¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u001b\u00102\u001a\u00020-8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00107\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/BaseReviewWidgetVH;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "T", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "voId", "", "actionId", "", "liked", "disliked", "", "updateVote", "(JLjava/lang/String;ZZ)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$VoteError;", "error", "showVoteErrorNotification", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModel$VoteError;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "sendClickEvent", "(JLru/ozon/uni/atoms/af/AtomAction$Click;)V", "clickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder$delegate", "LSc/j;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "actionHandlerBuilder", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewViewModelImpl;", "viewModel", "isLiked", "()Ljava/lang/Boolean;", "isDisliked", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseReviewWidgetVH<T extends c> extends k<T> {

    /* renamed from: actionHandlerBuilder$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandlerBuilder;

    @NotNull
    private final View containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinnedReviewViewModel$VoteError.values().length];
            try {
                iArr[PinnedReviewViewModel$VoteError.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinnedReviewViewModel$VoteError.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseReviewWidgetVH(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandlerBuilder = LazyUtilsKt.unsafeLazy(new BaseReviewWidgetVH$actionHandlerBuilder$2(this, handlersInhibitor));
    }

    private final PinnedReviewViewModelImpl getViewModel() {
        return (PinnedReviewViewModelImpl) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showVoteErrorNotification(PinnedReviewViewModel$VoteError error) {
        r a11;
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        NotificationDTO createNetworkErrorNotificationDTO$default;
        r a12 = this.refs.getContainer().a();
        if (a12 == null || (a11 = this.refs.getContainer().a()) == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion companion = NotificationBar.INSTANCE;
        int i11 = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
        if (i11 == 1) {
            createNetworkErrorNotificationDTO$default = NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            createNetworkErrorNotificationDTO$default = NotificationsKt.createFailedToSendNotification();
        }
        NotificationBar.Companion.make$default(companion, asNotificationLayoutManager$default, createNetworkErrorNotificationDTO$default, a12, null, 8, null).show();
    }

    private final void updateVote(long voId, String actionId, boolean liked, boolean disliked) {
        InterfaceC7851b controller = this.refs.getController();
        boolean z11 = (Intrinsics.d(actionId, "like") || (Intrinsics.d(actionId, "dislike") && !disliked && liked)) ? !liked : liked;
        if (Intrinsics.d(actionId, "dislike") || (Intrinsics.d(actionId, "like") && !liked && disliked)) {
            disliked = !disliked;
        }
        controller.update(new ReviewVoteUpdateKey(voId, z11, disliked));
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [l20.c] */
    protected void clickAction(@NotNull AtomAction.Click action) {
        Boolean isLiked;
        Intrinsics.checkNotNullParameter(action, "action");
        String id2 = action.getId();
        if (id2 == null || (isLiked = isLiked()) == null) {
            return;
        }
        boolean booleanValue = isLiked.booleanValue();
        Boolean isDisliked = isDisliked();
        if (isDisliked != null) {
            boolean booleanValue2 = isDisliked.booleanValue();
            if (id2.equals("like") || id2.equals("dislike")) {
                PinnedReviewViewModelImpl viewModel = getViewModel();
                if (viewModel != null) {
                    viewModel.votePressed(action, new PinnedReviewViewModel$PreviousVoteState(booleanValue, booleanValue2));
                }
                ?? boundData = getBoundData();
                if (boundData != 0) {
                    updateVote(boundData.getId(), id2, booleanValue, booleanValue2);
                }
            }
        }
    }

    @NotNull
    protected final ActionHandler.Builder getActionHandlerBuilder() {
        return (ActionHandler.Builder) this.actionHandlerBuilder.getValue();
    }

    public abstract Boolean isDisliked();

    public abstract Boolean isLiked();

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        SingleLiveEvent<PinnedReviewViewModel$VoteError> showErrorEvent;
        SingleLiveEvent<PinnedReviewViewModel$PreviousVoteState> revertVoteStateEvent;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        PinnedReviewViewModelImpl viewModel = getViewModel();
        if (viewModel != null && (revertVoteStateEvent = viewModel.getRevertVoteStateEvent()) != null) {
            revertVoteStateEvent.observe(this, new BaseReviewWidgetVHKt$sam$androidx_lifecycle_Observer$0(new BaseReviewWidgetVH$onAttachViewModel$1(this)));
        }
        PinnedReviewViewModelImpl viewModel2 = getViewModel();
        if (viewModel2 == null || (showErrorEvent = viewModel2.getShowErrorEvent()) == null) {
            return;
        }
        showErrorEvent.observe(this, new BaseReviewWidgetVHKt$sam$androidx_lifecycle_Observer$0(new BaseReviewWidgetVH$onAttachViewModel$2(this)));
    }

    protected final void sendClickEvent(long voId, @NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(voId);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            t b11 = x.b(trackingInfo, valueOf, null);
            if (b11 != null) {
                TokenizedAnalyticsExtKt.processClickEvents(this.tokenizedAnalytics, b11);
            }
        }
    }
}
