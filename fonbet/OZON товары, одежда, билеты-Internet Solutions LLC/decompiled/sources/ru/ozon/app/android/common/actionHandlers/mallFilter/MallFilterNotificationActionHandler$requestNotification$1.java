package ru.ozon.app.android.common.actionHandlers.mallFilter;

import Sc.s;
import W10.c;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
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
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.mallFilter.MallFilterNotificationActionHandler$requestNotification$1", f = "MallFilterNotificationActionHandler.kt", l = {133, RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class MallFilterNotificationActionHandler$requestNotification$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ MallFilterNotificationActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.common.actionHandlers.mallFilter.MallFilterNotificationActionHandler$requestNotification$1$1", f = "MallFilterNotificationActionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.common.actionHandlers.mallFilter.MallFilterNotificationActionHandler$requestNotification$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction.ComposerAction $action;
        final /* synthetic */ MallFilterResponse $data;
        final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
        int label;
        final /* synthetic */ MallFilterNotificationActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MallFilterResponse mallFilterResponse, MallFilterNotificationActionHandler mallFilterNotificationActionHandler, CustomActionHandler.HandlerReferences handlerReferences, AtomAction.ComposerAction composerAction, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$data = mallFilterResponse;
            this.this$0 = mallFilterNotificationActionHandler;
            this.$handlerRefs = handlerReferences;
            this.$action = composerAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$data, this.this$0, this.$handlerRefs, this.$action, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            MallFilterResponse mallFilterResponse = this.$data;
            if (mallFilterResponse != null) {
                this.this$0.showNotificationBar(mallFilterResponse.getNotification(), this.$handlerRefs);
                this.this$0.saveViewCount(this.$action);
            } else {
                this.this$0.showErrorNotification(this.$handlerRefs);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MallFilterNotificationActionHandler$requestNotification$1(AtomAction.ComposerAction composerAction, MallFilterNotificationActionHandler mallFilterNotificationActionHandler, CustomActionHandler.HandlerReferences handlerReferences, d<? super MallFilterNotificationActionHandler$requestNotification$1> dVar) {
        super(2, dVar);
        this.$action = composerAction;
        this.this$0 = mallFilterNotificationActionHandler;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MallFilterNotificationActionHandler$requestNotification$1(this.$action, this.this$0, this.$handlerRefs, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        if (xe.C10727i.f(r11, r3, r10) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ActionV2Request actionV2Request = new ActionV2Request(this.$action.getParams(), this.$action.getActionName(), false, 4, null);
            actionV2Repository = this.this$0.actionV2Repository;
            c trackingData = this.$handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            this.label = 1;
            obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, trackingData, MallFilterResponse.class, this);
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
        MallFilterResponse mallFilterResponse = (MallFilterResponse) ((ActionV2Response) obj).getData();
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(mallFilterResponse, this.this$0, this.$handlerRefs, this.$action, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MallFilterNotificationActionHandler$requestNotification$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
