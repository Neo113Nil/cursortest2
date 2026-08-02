package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation;

import NV.a;
import Sc.InterfaceC4008j;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.core.PinnedReviewViewMapper;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.data.FooterControlDTO;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.PinnedReviewView;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0012\u0010\u0016J)\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R'\u0010,\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00110&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewWidgetVH;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/BaseReviewWidgetVH;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "clickAction", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "getContainerView", "()Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler$delegate", "LSc/j;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "actionHandler", "", "isLiked", "()Ljava/lang/Boolean;", "isDisliked", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewWidgetVH extends BaseReviewWidgetVH<PinnedReviewVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    @NotNull
    private final PinnedReviewView containerView;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PinnedReviewViewMapper.PinnedReviewPayload.values().length];
            try {
                iArr[PinnedReviewViewMapper.PinnedReviewPayload.EXPAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PinnedReviewViewMapper.PinnedReviewPayload.COLLAPSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PinnedReviewViewMapper.PinnedReviewPayload.VOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnedReviewWidgetVH(@NotNull PinnedReviewView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor) {
        super(containerView, refs, tokenizedAnalytics, handlersInhibitor);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = LazyUtilsKt.unsafeLazy(new PinnedReviewWidgetVH$actionHandler$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0(PinnedReviewVO pinnedReviewVO, PinnedReviewWidgetVH pinnedReviewWidgetVH, View view) {
        AtomAction action = pinnedReviewVO.getAction();
        if (action != null) {
            pinnedReviewWidgetVH.getActionHandler().invoke(action);
        }
    }

    private final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.BaseReviewWidgetVH
    protected void clickAction(@NotNull AtomAction.Click action) {
        String id2;
        Intrinsics.checkNotNullParameter(action, "action");
        PinnedReviewVO pinnedReviewVO = (PinnedReviewVO) getBoundData();
        if (pinnedReviewVO == null || (id2 = action.getId()) == null) {
            return;
        }
        if (id2.equals("expand") && pinnedReviewVO.getIsCollapsed()) {
            this.refs.getController().update(new PinnedReviewViewMapper.PinnedReviewExpandUpdateKey(pinnedReviewVO.getId()));
            sendClickEvent(pinnedReviewVO.getId(), action);
        } else {
            if (id2.equals("expand")) {
                return;
            }
            super.clickAction(action);
        }
    }

    @NotNull
    protected PinnedReviewView getContainerView() {
        return this.containerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.BaseReviewWidgetVH
    public Boolean isDisliked() {
        PinnedReviewFooter footer;
        FooterControlDTO dislike;
        PinnedReviewVO pinnedReviewVO = (PinnedReviewVO) getBoundData();
        if (pinnedReviewVO == null || (footer = pinnedReviewVO.getFooter()) == null || (dislike = footer.getDislike()) == null) {
            return null;
        }
        return Boolean.valueOf(dislike.isSelected());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.BaseReviewWidgetVH
    public Boolean isLiked() {
        PinnedReviewFooter footer;
        FooterControlDTO like;
        PinnedReviewVO pinnedReviewVO = (PinnedReviewVO) getBoundData();
        if (pinnedReviewVO == null || (footer = pinnedReviewVO.getFooter()) == null || (like = footer.getLike()) == null) {
            return null;
        }
        return Boolean.valueOf(like.isSelected());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PinnedReviewVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PinnedReviewWidgetVH) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PinnedReviewVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PinnedReviewVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            getContainerView().bind(item, getActionHandler());
            getContainerView().setOnClickListener(new a(0, item, this));
        }
        List list = payload instanceof List ? (List) payload : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof PinnedReviewViewMapper.PinnedReviewPayload) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[((PinnedReviewViewMapper.PinnedReviewPayload) it.next()).ordinal()];
                if (i11 == 1) {
                    getContainerView().updateExpand(item.getIsCollapsed(), true);
                } else if (i11 == 2) {
                    getContainerView().updateExpand(item.getIsCollapsed(), false);
                    getContainerView().updateFooter(item.getFooter(), getActionHandler());
                } else if (i11 == 3) {
                    getContainerView().updateFooter(item.getFooter(), getActionHandler());
                } else {
                    throw new o();
                }
            }
        }
    }
}
