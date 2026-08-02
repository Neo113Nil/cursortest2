package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate;

import BZ.f;
import Sc.r;
import Sc.s;
import Sg.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.api.FavoriteRequest;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.FavoriteActionV2Response;
import ru.ozon.app.android.favorites.domain.favoritemanager.FavoriteManager;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate$requestFavoriteStateChange$1", f = "FreshFavoriteDelegate.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FreshFavoriteDelegate$requestFavoriteStateChange$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $targetFavoriteState;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ FreshFavoriteDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshFavoriteDelegate$requestFavoriteStateChange$1(FreshFavoriteDelegate freshFavoriteDelegate, boolean z11, d<? super FreshFavoriteDelegate$requestFavoriteStateChange$1> dVar) {
        super(2, dVar);
        this.this$0 = freshFavoriteDelegate;
        this.$targetFavoriteState = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        FreshFavoriteDelegate$requestFavoriteStateChange$1 freshFavoriteDelegate$requestFavoriteStateChange$1 = new FreshFavoriteDelegate$requestFavoriteStateChange$1(this.this$0, this.$targetFavoriteState, dVar);
        freshFavoriteDelegate$requestFavoriteStateChange$1.L$0 = obj;
        return freshFavoriteDelegate$requestFavoriteStateChange$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FreshFavoriteState freshFavoriteState;
        a aVar;
        BZ.e eVar;
        FreshFavoriteState freshFavoriteState2;
        Function0 function0;
        ActionV2Repository actionV2Repository;
        Object callActionSuspend;
        FreshFavoriteState freshFavoriteState3;
        Object a11;
        h hVar;
        FreshFavoriteDelegate.Companion companion;
        FreshFavoriteDelegate.Companion companion2;
        h hVar2;
        FavoriteManager favoriteManager;
        FavoriteManager favoriteManager2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        NotificationModelWrapper notificationModelWrapper = null;
        if (i11 == 0) {
            s.b(obj);
            freshFavoriteState = this.this$0.currentState;
            if (freshFavoriteState != null && freshFavoriteState.getSku() != null) {
                String favoriteActionName = this.$targetFavoriteState ? freshFavoriteState.getFavoriteActionName() : freshFavoriteState.getUnfavoriteActionName();
                if (favoriteActionName == null) {
                    return Unit.f71690a;
                }
                aVar = this.this$0.analyticsScreenStorage;
                Rg.a a12 = aVar.a();
                String c11 = a12 != null ? a12.c() : null;
                eVar = this.this$0.miniAppConfigHolder;
                ActionV2Request actionV2Request = new ActionV2Request(new FavoriteRequest(C7714v.a0(freshFavoriteState.getSku()), c11, f.a(eVar)), favoriteActionName, false, 4, null);
                FreshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1 freshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1 = new FreshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1(this.$targetFavoriteState, this.this$0, freshFavoriteState);
                FreshFavoriteDelegate freshFavoriteDelegate = this.this$0;
                try {
                    r.Companion companion3 = r.INSTANCE;
                    actionV2Repository = freshFavoriteDelegate.actionV2Repository;
                    this.L$0 = freshFavoriteState;
                    this.L$1 = freshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1;
                    this.label = 1;
                    callActionSuspend = actionV2Repository.callActionSuspend(actionV2Request, FavoriteActionV2Response.class, this);
                    if (callActionSuspend == aVar2) {
                        return aVar2;
                    }
                    freshFavoriteState3 = freshFavoriteState;
                    function0 = freshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1;
                } catch (Throwable th2) {
                    th = th2;
                    freshFavoriteState2 = freshFavoriteState;
                    function0 = freshFavoriteDelegate$requestFavoriteStateChange$1$reverseAction$1;
                    r.Companion companion4 = r.INSTANCE;
                    freshFavoriteState3 = freshFavoriteState2;
                    a11 = s.a(th);
                    boolean z11 = this.$targetFavoriteState;
                    FreshFavoriteDelegate freshFavoriteDelegate2 = this.this$0;
                    if (!(a11 instanceof r.b)) {
                    }
                    FreshFavoriteDelegate freshFavoriteDelegate3 = this.this$0;
                    if (r.b(a11) != null) {
                    }
                    return Unit.f71690a;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function0 = (Function0) this.L$1;
        freshFavoriteState2 = (FreshFavoriteState) this.L$0;
        try {
            s.b(obj);
            freshFavoriteState3 = freshFavoriteState2;
            callActionSuspend = obj;
        } catch (Throwable th3) {
            th = th3;
            r.Companion companion42 = r.INSTANCE;
            freshFavoriteState3 = freshFavoriteState2;
            a11 = s.a(th);
            boolean z112 = this.$targetFavoriteState;
            FreshFavoriteDelegate freshFavoriteDelegate22 = this.this$0;
            if (!(a11 instanceof r.b)) {
            }
            FreshFavoriteDelegate freshFavoriteDelegate32 = this.this$0;
            if (r.b(a11) != null) {
            }
            return Unit.f71690a;
        }
        try {
            a11 = (ActionV2Response) callActionSuspend;
            r.Companion companion5 = r.INSTANCE;
        } catch (Throwable th4) {
            th = th4;
            freshFavoriteState2 = freshFavoriteState3;
            r.Companion companion422 = r.INSTANCE;
            freshFavoriteState3 = freshFavoriteState2;
            a11 = s.a(th);
            boolean z1122 = this.$targetFavoriteState;
            FreshFavoriteDelegate freshFavoriteDelegate222 = this.this$0;
            if (!(a11 instanceof r.b)) {
            }
            FreshFavoriteDelegate freshFavoriteDelegate322 = this.this$0;
            if (r.b(a11) != null) {
            }
            return Unit.f71690a;
        }
        boolean z11222 = this.$targetFavoriteState;
        FreshFavoriteDelegate freshFavoriteDelegate2222 = this.this$0;
        if (!(a11 instanceof r.b)) {
            ActionV2Response actionV2Response = (ActionV2Response) a11;
            if (actionV2Response.getError() == null) {
                FavoriteActionV2Response favoriteActionV2Response = (FavoriteActionV2Response) actionV2Response.getData();
                if ((favoriteActionV2Response != null ? favoriteActionV2Response.getNotification() : null) == null) {
                    if (z11222) {
                        favoriteManager2 = freshFavoriteDelegate2222.favoriteManager;
                        FavoriteManager.DefaultImpls.addFavorite$default(favoriteManager2, freshFavoriteState3.getSku().longValue(), null, 2, null);
                    } else {
                        favoriteManager = freshFavoriteDelegate2222.favoriteManager;
                        FavoriteManager.DefaultImpls.removeFromFavorites$default(favoriteManager, freshFavoriteState3.getSku().longValue(), null, 2, null);
                    }
                }
            }
            FavoriteActionV2Response favoriteActionV2Response2 = (FavoriteActionV2Response) actionV2Response.getData();
            if ((favoriteActionV2Response2 != null ? favoriteActionV2Response2.getNotification() : null) != null) {
                FavoriteActionV2Response favoriteActionV2Response3 = (FavoriteActionV2Response) actionV2Response.getData();
                if (favoriteActionV2Response3 != null) {
                    notificationModelWrapper = favoriteActionV2Response3.getNotification();
                }
            } else {
                companion2 = FreshFavoriteDelegate.Companion;
                notificationModelWrapper = companion2.getDefaultErrorNotification();
            }
            function0.invoke();
            hVar2 = freshFavoriteDelegate2222.notificationEventsFlow;
            hVar2.b(notificationModelWrapper);
        }
        FreshFavoriteDelegate freshFavoriteDelegate3222 = this.this$0;
        if (r.b(a11) != null) {
            function0.invoke();
            hVar = freshFavoriteDelegate3222.notificationEventsFlow;
            companion = FreshFavoriteDelegate.Companion;
            hVar.b(companion.getDefaultErrorNotification());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FreshFavoriteDelegate$requestFavoriteStateChange$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
