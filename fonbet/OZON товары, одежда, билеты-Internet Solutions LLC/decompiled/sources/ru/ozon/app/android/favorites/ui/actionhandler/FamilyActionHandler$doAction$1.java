package ru.ozon.app.android.favorites.ui.actionhandler;

import An.C2439a;
import Sc.s;
import W10.c;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.favorites.data.family.FamilyAccountRefresher;
import ru.ozon.app.android.favorites.data.family.FamilyActionRequest;
import ru.ozon.app.android.favorites.data.family.FamilyActionResponse;
import ru.ozon.app.android.favorites.ui.actionhandler.utils.ActionsUtilsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FamilyActionHandler$doAction$1", f = "FamilyActionHandler.kt", l = {78, 66}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FamilyActionHandler$doAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ FamilyAccountRefresher $familyRefresher;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ JsonParser $jsonDeserializer;
    final /* synthetic */ ActionV2Repository $repository;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.favorites.ui.actionhandler.FamilyActionHandler$doAction$1$1", f = "FamilyActionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.favorites.ui.actionhandler.FamilyActionHandler$doAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
        final /* synthetic */ ActionV2Response<FamilyActionResponse> $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ActionV2Response<FamilyActionResponse> actionV2Response, CustomActionHandler.HandlerReferences handlerReferences, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$result = actionV2Response;
            this.$handlerRefs = handlerReferences;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$result, this.$handlerRefs, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            FamilyActionResponse data = this.$result.getData();
            NotificationDTO notificationBar = data != null ? data.getNotificationBar() : null;
            if (notificationBar != null) {
                ActionsUtilsKt.showNotification(this.$handlerRefs, notificationBar, this.$result.getTrackingPayloads());
            }
            if (notificationBar == null && this.$result.getError() != null) {
                ActionsUtilsKt.showError(this.$handlerRefs);
            }
            ActionsUtilsKt.hideModalIfNeed(this.$handlerRefs);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FamilyActionHandler$doAction$1(InterfaceC7851b interfaceC7851b, AtomAction.ComposerAction composerAction, ActionV2Repository actionV2Repository, CustomActionHandler.HandlerReferences handlerReferences, FamilyAccountRefresher familyAccountRefresher, JsonParser jsonParser, d<? super FamilyActionHandler$doAction$1> dVar) {
        super(2, dVar);
        this.$composerController = interfaceC7851b;
        this.$action = composerAction;
        this.$repository = actionV2Repository;
        this.$handlerRefs = handlerReferences;
        this.$familyRefresher = familyAccountRefresher;
        this.$jsonDeserializer = jsonParser;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FamilyActionHandler$doAction$1(this.$composerController, this.$action, this.$repository, this.$handlerRefs, this.$familyRefresher, this.$jsonDeserializer, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        if (xe.C10727i.f(r1, r4, r11) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r12 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        FamilyActionRequest familyActionRequest;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            C2439a.b(0L, null, 3, this.$composerController);
            Map<String, String> params = this.$action.getParams();
            if (params == null || (str = params.get("postData")) == null || (familyActionRequest = (FamilyActionRequest) this.$jsonDeserializer.fromJson(str, FamilyActionRequest.class)) == null) {
                throw new IllegalStateException("must be key postData");
            }
            ActionV2Request actionV2Request = new ActionV2Request(familyActionRequest, this.$action.getActionName(), false, 4, null);
            ActionV2Repository actionV2Repository = this.$repository;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, FamilyActionResponse.class, this);
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
        ActionV2Response actionV2Response = (ActionV2Response) obj;
        this.$composerController.hideLoader();
        if (actionV2Response.getError() == null) {
            this.$familyRefresher.requireRefreshIfNeed(this.$action);
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(actionV2Response, this.$handlerRefs, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FamilyActionHandler$doAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
