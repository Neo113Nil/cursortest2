package ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview;

import Fn.C3056e;
import GZ.g;
import Lm0.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import nc.C8486a;
import nc.InterfaceC8487b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.Vote;
import ru.ozon.app.android.pdp.ui.configurators.ugc.data.VoteResponse;
import ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.Action;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import xe.C10727i;
import xe.H0;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\"\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0002¢\u0006\u0004\b\"\u0010#J7\u0010&\u001a\u0004\u0018\u00010%*\b\u0012\u0004\u0012\u00020 0$2\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R \u00106\u001a\b\u0012\u0004\u0012\u000205048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010;\u001a\b\u0012\u0004\u0012\u00020+0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "LGZ/g;", "router", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/storage/auth/AuthStateStorage;LGZ/g;)V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote;", "vote", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;", "item", "", "sendVote", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/data/Vote;Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;)V", "", "ex", "handleError", "(Ljava/lang/Throwable;)V", "openAuthPage", "()V", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse;", "voteResponse", "updateVote", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/VoteResponse;)V", "", "action", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "Lru/ozon/uni/atoms/data/AtomDTO;", "replace", "updateTagByAction", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "", "replaceTagByAction", "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Integer;", "clickLike", "(Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/ButtonsVO;)V", "clickDislike", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "checkAuthorise", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "LGZ/g;", "", "isProcessingAction", "Z", "Landroidx/lifecycle/V;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/Action;", "actionLiveData", "Landroidx/lifecycle/V;", "getActionLiveData", "()Landroidx/lifecycle/V;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "completeActionAfterAuthEvent", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "getCompleteActionAfterAuthEvent", "()Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SingleReviewViewModelImpl extends w0 implements SingleReviewViewModel {

    @NotNull
    private final V<Action> actionLiveData;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final AuthStateStorage authManager;

    @NotNull
    private final SingleLiveEvent<AtomAction.Click> completeActionAfterAuthEvent;
    private boolean isProcessingAction;

    @NotNull
    private final g router;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/singleReview/SingleReviewViewModelImpl$Companion;", "", "<init>", "()V", "ITEM_ID_PARAM", "", "REVIEW_UUID_PARAM", "VALUE_PARAM", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SingleReviewViewModelImpl(@NotNull ActionV2Repository actionV2Repository, @NotNull AuthStateStorage authManager, @NotNull g router) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(router, "router");
        this.actionV2Repository = actionV2Repository;
        this.authManager = authManager;
        this.router = router;
        this.actionLiveData = new V<>();
        this.completeActionAfterAuthEvent = new SingleLiveEvent<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean checkAuthorise$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable ex) {
        a.f17149a.e(ex);
        getActionLiveData().setValue(new Action.LikeError(z00.g.c(ex)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAuthPage() {
        g gVar = this.router;
        String uri = LinkGenerator.INSTANCE.login().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(gVar, uri, null, null, 6);
    }

    private final Integer replaceTagByAction(List<AtomDTO> list, String str, Function1<? super TagV3Atom.TagAtom, ? extends AtomDTO> function1) {
        Iterator<AtomDTO> it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            AtomDTO next = it.next();
            if (next instanceof TagV3Atom.TagAtom) {
                AtomActionDTO action = ((TagV3Atom.TagAtom) next).getAction();
                if (Intrinsics.d(action != null ? action.getId() : null, str)) {
                    break;
                }
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        AtomDTO atomDTO = list.get(intValue);
        Intrinsics.g(atomDTO, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.tag.TagV3Atom.TagAtom");
        list.set(intValue, function1.invoke((TagV3Atom.TagAtom) atomDTO));
        return Integer.valueOf(intValue);
    }

    private final void sendVote(Vote vote, ButtonsVO item) {
        if (this.isProcessingAction) {
            return;
        }
        ((H0) C10727i.c(x0.a(this), null, null, new SingleReviewViewModelImpl$sendVote$1(this, item, vote, null), 3)).y(new SingleReviewViewModelImpl$sendVote$2(this));
    }

    private final void updateTagByAction(ButtonsVO buttonsVO, String str, Function1<? super TagV3Atom.TagAtom, ? extends AtomDTO> function1) {
        List<AtomDTO> rightAtoms;
        List<AtomDTO> leftAtoms = buttonsVO.getLeftAtoms();
        if ((leftAtoms == null || replaceTagByAction(leftAtoms, str, function1) == null) && (rightAtoms = buttonsVO.getRightAtoms()) != null) {
            replaceTagByAction(rightAtoms, str, function1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateVote(ButtonsVO item, VoteResponse voteResponse) {
        updateTagByAction(item, ReviewActions.LIKE.getAction(), new SingleReviewViewModelImpl$updateVote$1(voteResponse, this, item));
        updateTagByAction(item, ReviewActions.DISLIKE.getAction(), new SingleReviewViewModelImpl$updateVote$2(voteResponse));
        getActionLiveData().setValue(new Action.BindButtons(item));
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel
    public void checkAuthorise(@NotNull AtomAction.Click action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.authManager.isAuthenticated()) {
            getCompleteActionAfterAuthEvent().postValue(action);
            return;
        }
        openAuthPage();
        C8486a a11 = C5415f.a(this);
        InterfaceC8487b subscribe = this.authManager.getAuthState().subscribeOn(Mc.a.b()).observeOn(C8125a.a()).filter(new C3056e(SingleReviewViewModelImpl$checkAuthorise$1.INSTANCE, 1)).subscribe(new HC.a(new SingleReviewViewModelImpl$checkAuthorise$2(this, action), 0));
        Intrinsics.checkNotNullExpressionValue(subscribe, "subscribe(...)");
        RxExtKt.plusAssign(a11, subscribe);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel
    public void clickDislike(@NotNull ButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        sendVote(new Vote.Dislike(item.getReviewUuid(), item.getProductId()), item);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel
    public void clickLike(@NotNull ButtonsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        sendVote(new Vote.Like(item.getReviewUuid(), item.getProductId()), item);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel
    @NotNull
    public V<Action> getActionLiveData() {
        return this.actionLiveData;
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.ugc.singleReview.SingleReviewViewModel
    @NotNull
    public SingleLiveEvent<AtomAction.Click> getCompleteActionAfterAuthEvent() {
        return this.completeActionAfterAuthEvent;
    }
}
