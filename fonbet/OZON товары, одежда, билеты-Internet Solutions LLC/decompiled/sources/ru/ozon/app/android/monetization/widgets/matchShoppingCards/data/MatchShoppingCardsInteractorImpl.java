package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.core.MatchShoppingCardsMapper;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.RequestCardsResponse;
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.SendReactionResponse;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\n\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\u000eJ\u001f\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsInteractorImpl;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/MatchShoppingCardsInteractor;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionRepository", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;", "mapper", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;)V", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/RequestCardsResponseDTO;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/RequestCardsResponse;", "toDomain", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/RequestCardsResponseDTO;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/RequestCardsResponse;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/SendReactionResponseDTO;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/SendReactionResponse;", "(Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/SendReactionResponseDTO;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/domain/SendReactionResponse;", "T", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "unwrap", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "LSc/r;", "requestCards-gIAlu-s", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requestCards", "sendReaction-gIAlu-s", "sendReaction", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/core/MatchShoppingCardsMapper;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsInteractorImpl implements MatchShoppingCardsInteractor {

    @NotNull
    private final ActionV2Repository actionRepository;

    @NotNull
    private final MatchShoppingCardsMapper mapper;

    public MatchShoppingCardsInteractorImpl(@NotNull ActionV2Repository actionRepository, @NotNull MatchShoppingCardsMapper mapper) {
        Intrinsics.checkNotNullParameter(actionRepository, "actionRepository");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.actionRepository = actionRepository;
        this.mapper = mapper;
    }

    private final RequestCardsResponse toDomain(RequestCardsResponseDTO requestCardsResponseDTO) {
        List<MatchShoppingCardsDTO.Card> cards = requestCardsResponseDTO.getCards();
        ArrayList arrayList = new ArrayList(C7714v.z(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(this.mapper.toVI((MatchShoppingCardsDTO.Card) it.next()));
        }
        return new RequestCardsResponse(arrayList, requestCardsResponseDTO.getNextPageAction());
    }

    private final <T> T unwrap(ActionV2Response<T> actionV2Response) {
        T data = actionV2Response.getData();
        if (data != null) {
            return data;
        }
        throw new IllegalStateException(actionV2Response.getError());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor
    /* renamed from: requestCards-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo809requestCardsgIAlus(@NotNull AtomActionDTO atomActionDTO, @NotNull d<? super r<RequestCardsResponse>> dVar) {
        MatchShoppingCardsInteractorImpl$requestCards$1 matchShoppingCardsInteractorImpl$requestCards$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        MatchShoppingCardsInteractorImpl matchShoppingCardsInteractorImpl;
        if (dVar instanceof MatchShoppingCardsInteractorImpl$requestCards$1) {
            matchShoppingCardsInteractorImpl$requestCards$1 = (MatchShoppingCardsInteractorImpl$requestCards$1) dVar;
            int i12 = matchShoppingCardsInteractorImpl$requestCards$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                matchShoppingCardsInteractorImpl$requestCards$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = matchShoppingCardsInteractorImpl$requestCards$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = matchShoppingCardsInteractorImpl$requestCards$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Repository actionV2Repository = this.actionRepository;
                    Map<String, String> params = atomActionDTO.getParams();
                    if (params == null) {
                        params = U.c();
                    }
                    Map<String, String> map = params;
                    String link = atomActionDTO.getLink();
                    if (link == null) {
                        link = "";
                    }
                    ActionV2Request actionV2Request = new ActionV2Request(map, link, false, 4, null);
                    matchShoppingCardsInteractorImpl$requestCards$1.L$0 = this;
                    matchShoppingCardsInteractorImpl$requestCards$1.label = 1;
                    mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, RequestCardsResponseDTO.class, matchShoppingCardsInteractorImpl$requestCards$1);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                    matchShoppingCardsInteractorImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    matchShoppingCardsInteractorImpl = (MatchShoppingCardsInteractorImpl) matchShoppingCardsInteractorImpl$requestCards$1.L$0;
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                    return mo479requestActionResult0E7RQCE;
                }
                try {
                    return matchShoppingCardsInteractorImpl.toDomain((RequestCardsResponseDTO) matchShoppingCardsInteractorImpl.unwrap((ActionV2Response) mo479requestActionResult0E7RQCE));
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    return s.a(th2);
                }
            }
        }
        matchShoppingCardsInteractorImpl$requestCards$1 = new MatchShoppingCardsInteractorImpl$requestCards$1(this, dVar);
        Object obj2 = matchShoppingCardsInteractorImpl$requestCards$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = matchShoppingCardsInteractorImpl$requestCards$1.label;
        if (i11 != 0) {
        }
        r.Companion companion3 = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.monetization.widgets.matchShoppingCards.domain.MatchShoppingCardsInteractor
    /* renamed from: sendReaction-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo810sendReactiongIAlus(@NotNull AtomActionDTO atomActionDTO, @NotNull d<? super r<SendReactionResponse>> dVar) {
        MatchShoppingCardsInteractorImpl$sendReaction$1 matchShoppingCardsInteractorImpl$sendReaction$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        MatchShoppingCardsInteractorImpl matchShoppingCardsInteractorImpl;
        if (dVar instanceof MatchShoppingCardsInteractorImpl$sendReaction$1) {
            matchShoppingCardsInteractorImpl$sendReaction$1 = (MatchShoppingCardsInteractorImpl$sendReaction$1) dVar;
            int i12 = matchShoppingCardsInteractorImpl$sendReaction$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                matchShoppingCardsInteractorImpl$sendReaction$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = matchShoppingCardsInteractorImpl$sendReaction$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = matchShoppingCardsInteractorImpl$sendReaction$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ActionV2Repository actionV2Repository = this.actionRepository;
                    Map<String, String> params = atomActionDTO.getParams();
                    if (params == null) {
                        params = U.c();
                    }
                    Map<String, String> map = params;
                    String link = atomActionDTO.getLink();
                    if (link == null) {
                        link = "";
                    }
                    ActionV2Request actionV2Request = new ActionV2Request(map, link, false, 4, null);
                    matchShoppingCardsInteractorImpl$sendReaction$1.L$0 = this;
                    matchShoppingCardsInteractorImpl$sendReaction$1.label = 1;
                    mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, SendReactionResponseDTO.class, matchShoppingCardsInteractorImpl$sendReaction$1);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                    matchShoppingCardsInteractorImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    matchShoppingCardsInteractorImpl = (MatchShoppingCardsInteractorImpl) matchShoppingCardsInteractorImpl$sendReaction$1.L$0;
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                    return mo479requestActionResult0E7RQCE;
                }
                try {
                    return matchShoppingCardsInteractorImpl.toDomain((SendReactionResponseDTO) matchShoppingCardsInteractorImpl.unwrap((ActionV2Response) mo479requestActionResult0E7RQCE));
                } catch (Throwable th2) {
                    r.Companion companion2 = r.INSTANCE;
                    return s.a(th2);
                }
            }
        }
        matchShoppingCardsInteractorImpl$sendReaction$1 = new MatchShoppingCardsInteractorImpl$sendReaction$1(this, dVar);
        Object obj2 = matchShoppingCardsInteractorImpl$sendReaction$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = matchShoppingCardsInteractorImpl$sendReaction$1.label;
        if (i11 != 0) {
        }
        r.Companion companion3 = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
        }
    }

    private final SendReactionResponse toDomain(SendReactionResponseDTO sendReactionResponseDTO) {
        Boolean addedToSelection = sendReactionResponseDTO.getAddedToSelection();
        boolean booleanValue = addedToSelection != null ? addedToSelection.booleanValue() : false;
        AtomActionDTO action = sendReactionResponseDTO.getAction();
        return new SendReactionResponse(booleanValue, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, sendReactionResponseDTO.getNotificationBar());
    }
}
