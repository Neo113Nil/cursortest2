package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import Ae.x0;
import Sc.o;
import Sc.r;
import Sc.s;
import Tg.b;
import Wc.a;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.SendReactionResponse;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsVI;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewModel$handleSwipeOutStart$2", f = "MatchShoppingCardsViewModel.kt", l = {97, 109}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewModel$handleSwipeOutStart$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ SwipeDirection $direction;
    int label;
    final /* synthetic */ MatchShoppingCardsViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            try {
                iArr[SwipeDirection.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewModel$handleSwipeOutStart$2(SwipeDirection swipeDirection, MatchShoppingCardsViewModel matchShoppingCardsViewModel, d<? super MatchShoppingCardsViewModel$handleSwipeOutStart$2> dVar) {
        super(2, dVar);
        this.$direction = swipeDirection;
        this.this$0 = matchShoppingCardsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MatchShoppingCardsViewModel$handleSwipeOutStart$2(this.$direction, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
    
        if (r15 != r0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006e, code lost:
    
        if (r15 == r0) goto L46;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LinkedList linkedList;
        MatchShoppingCardsInteractor matchShoppingCardsInteractor;
        Object mo810sendReactiongIAlus;
        LinkedList linkedList2;
        Object loadMoreCardsIfNeeded;
        x0 x0Var;
        Object value;
        Function1<NotificationDTO, Unit> onNotificationRequested;
        Function1<b, Unit> onAtomAction;
        x0 x0Var2;
        Object value2;
        LinkedList linkedList3;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            int i12 = WhenMappings.$EnumSwitchMapping$0[this.$direction.ordinal()];
            AtomActionDTO atomActionDTO = null;
            if (i12 == 1) {
                linkedList = this.this$0.cards;
                MatchShoppingCardsVI.Card card = (MatchShoppingCardsVI.Card) C7714v.M(linkedList);
                if (card != null) {
                    atomActionDTO = card.getDislikeAction();
                }
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                linkedList2 = this.this$0.cards;
                MatchShoppingCardsVI.Card card2 = (MatchShoppingCardsVI.Card) C7714v.M(linkedList2);
                if (card2 != null) {
                    atomActionDTO = card2.getLikeAction();
                }
            }
            if (atomActionDTO != null) {
                matchShoppingCardsInteractor = this.this$0.matchShoppingCardsInteractor;
                this.label = 1;
                mo810sendReactiongIAlus = matchShoppingCardsInteractor.mo810sendReactiongIAlus(atomActionDTO, this);
            }
            MatchShoppingCardsViewModel matchShoppingCardsViewModel = this.this$0;
            this.label = 2;
            loadMoreCardsIfNeeded = matchShoppingCardsViewModel.loadMoreCardsIfNeeded(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                x0Var2 = this.this$0.mutableViewState;
                MatchShoppingCardsViewModel matchShoppingCardsViewModel2 = this.this$0;
                do {
                    value2 = x0Var2.getValue();
                    linkedList3 = matchShoppingCardsViewModel2.cards;
                } while (!x0Var2.b(value2, MatchShoppingCardsViewState.copy$default((MatchShoppingCardsViewState) value2, null, false, false, false, false, C7714v.K0(linkedList3, 2), false, 95, null)));
                return Unit.f71690a;
            }
            s.b(obj);
            mo810sendReactiongIAlus = ((r) obj).getF26106a();
        }
        MatchShoppingCardsViewModel matchShoppingCardsViewModel3 = this.this$0;
        Throwable b11 = r.b(mo810sendReactiongIAlus);
        if (b11 == null) {
            SendReactionResponse sendReactionResponse = (SendReactionResponse) mo810sendReactiongIAlus;
            b action = sendReactionResponse.getAction();
            if (action != null && (onAtomAction = matchShoppingCardsViewModel3.getOnAtomAction()) != null) {
                onAtomAction.invoke(action);
            }
            NotificationDTO notification = sendReactionResponse.getNotification();
            if (notification != null && (onNotificationRequested = matchShoppingCardsViewModel3.getOnNotificationRequested()) != null) {
                onNotificationRequested.invoke(notification);
            }
            if (sendReactionResponse.getAddedToSelection()) {
                x0Var = matchShoppingCardsViewModel3.mutableViewState;
                do {
                    value = x0Var.getValue();
                } while (!x0Var.b(value, MatchShoppingCardsViewState.copy$default((MatchShoppingCardsViewState) value, null, true, false, false, false, null, false, 125, null)));
            }
        } else {
            matchShoppingCardsViewModel3.handleRequestError(b11);
        }
        MatchShoppingCardsViewModel matchShoppingCardsViewModel4 = this.this$0;
        this.label = 2;
        loadMoreCardsIfNeeded = matchShoppingCardsViewModel4.loadMoreCardsIfNeeded(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MatchShoppingCardsViewModel$handleSwipeOutStart$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
