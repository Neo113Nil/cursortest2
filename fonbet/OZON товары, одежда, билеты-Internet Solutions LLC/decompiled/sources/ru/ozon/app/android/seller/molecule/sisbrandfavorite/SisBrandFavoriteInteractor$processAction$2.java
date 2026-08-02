package ru.ozon.app.android.seller.molecule.sisbrandfavorite;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteResponse;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;", "<anonymous>", "(Lxe/M;)Lru/ozon/uni/atoms/data/notification/NotificationModelWrapper;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.seller.molecule.sisbrandfavorite.SisBrandFavoriteInteractor$processAction$2", f = "SisBrandFavoriteInteractor.kt", l = {141}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SisBrandFavoriteInteractor$processAction$2 extends j implements Function2<M, d<? super NotificationModelWrapper>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ long $moleculeId;
    int label;
    final /* synthetic */ SisBrandFavoriteInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SisBrandFavoriteInteractor$processAction$2(AtomAction.ComposerAction composerAction, SisBrandFavoriteInteractor sisBrandFavoriteInteractor, long j11, d<? super SisBrandFavoriteInteractor$processAction$2> dVar) {
        super(2, dVar);
        this.$action = composerAction;
        this.this$0 = sisBrandFavoriteInteractor;
        this.$moleculeId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SisBrandFavoriteInteractor$processAction$2(this.$action, this.this$0, this.$moleculeId, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SisBrandFavoriteInteractor.Companion companion;
        ActionV2Repository actionV2Repository;
        SisBrandFavoriteResponse sisBrandFavoriteResponse;
        NotificationDTO createDefaultError;
        NotificationModelWrapper m995getNotification;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            companion = SisBrandFavoriteInteractor.Companion;
            if (!C7714v.A(companion.getSUPPORTED_ACTIONS(), this.$action.getId())) {
                return null;
            }
            this.this$0.updateState(this.$action.getId(), this.$moleculeId);
            actionV2Repository = this.this$0.actionV2Repository;
            ActionV2Request actionV2Request = new ActionV2Request(this.$action.getParams(), this.$action.getActionName(), false, 4, null);
            this.label = 1;
            obj = actionV2Repository.callActionSuspend(actionV2Request, SisBrandFavoriteResponse.class, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        ActionV2Response actionV2Response = (ActionV2Response) obj;
        if (actionV2Response.getError() == null) {
            SisBrandFavoriteResponse sisBrandFavoriteResponse2 = (SisBrandFavoriteResponse) actionV2Response.getData();
            if (!(sisBrandFavoriteResponse2 != null ? Intrinsics.d(sisBrandFavoriteResponse2.isError(), Boolean.TRUE) : false)) {
                this.this$0.sendEvent(this.$action.getId());
                sisBrandFavoriteResponse = (SisBrandFavoriteResponse) actionV2Response.getData();
                if (sisBrandFavoriteResponse == null && (m995getNotification = sisBrandFavoriteResponse.m995getNotification()) != null) {
                    return m995getNotification;
                }
                if (actionV2Response.getError() != null) {
                    return null;
                }
                createDefaultError = this.this$0.createDefaultError(this.$action.getId());
                return createDefaultError;
            }
        }
        this.this$0.revertState(this.$action.getId(), this.$moleculeId);
        sisBrandFavoriteResponse = (SisBrandFavoriteResponse) actionV2Response.getData();
        if (sisBrandFavoriteResponse == null) {
        }
        if (actionV2Response.getError() != null) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super NotificationModelWrapper> dVar) {
        return ((SisBrandFavoriteInteractor$processAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
