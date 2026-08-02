package ru.ozon.app.android.favorites.ui.actionhandler;

import Sc.s;
import W10.c;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.ui.actionhandler.FavoriteWishlistRemoveActionHandler;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FavoriteWishlistRemoveActionHandler$processAction$1", f = "FavoriteWishlistRemoveActionHandler.kt", l = {85, 91}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FavoriteWishlistRemoveActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Long $giftId;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ long $listId;
    final /* synthetic */ ActionV2Request $request;
    final /* synthetic */ Long $sku;
    final /* synthetic */ String $uniqId;
    int label;
    final /* synthetic */ FavoriteWishlistRemoveActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteWishlistRemoveActionHandler$processAction$1(FavoriteWishlistRemoveActionHandler favoriteWishlistRemoveActionHandler, ActionV2Request actionV2Request, CustomActionHandler.HandlerReferences handlerReferences, Long l11, long j11, Long l12, String str, d<? super FavoriteWishlistRemoveActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = favoriteWishlistRemoveActionHandler;
        this.$request = actionV2Request;
        this.$handlerRefs = handlerReferences;
        this.$sku = l11;
        this.$listId = j11;
        this.$giftId = l12;
        this.$uniqId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FavoriteWishlistRemoveActionHandler$processAction$1(this.this$0, this.$request, this.$handlerRefs, this.$sku, this.$listId, this.$giftId, this.$uniqId, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r13 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        Object handleResponse;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = this.$request;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, FavoriteWishlistRemoveActionHandler.FavoriteWishlistRemoveResponse.class, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        FavoriteWishlistRemoveActionHandler favoriteWishlistRemoveActionHandler = this.this$0;
        Long l11 = this.$sku;
        long j11 = this.$listId;
        Long l12 = this.$giftId;
        String str = this.$uniqId;
        CustomActionHandler.HandlerReferences handlerReferences = this.$handlerRefs;
        this.label = 2;
        handleResponse = favoriteWishlistRemoveActionHandler.handleResponse((ActionV2Response) obj, l11, j11, l12, str, handlerReferences, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FavoriteWishlistRemoveActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
