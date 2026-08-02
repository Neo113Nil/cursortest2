package ru.ozon.app.android.common.disclaimer.customActions;

import Ge.f;
import Sc.s;
import Wc.a;
import io.reactivex.y;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.disclaimer.customActions.ActualizeEmailActionHandler$processAction$1", f = "ActualizeEmailActionHandler.kt", l = {42, 43, 47}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ActualizeEmailActionHandler$processAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ ActualizeEmailActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.common.disclaimer.customActions.ActualizeEmailActionHandler$processAction$1$1", f = "ActualizeEmailActionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.common.disclaimer.customActions.ActualizeEmailActionHandler$processAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ Exception $e;
        final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
        int label;
        final /* synthetic */ ActualizeEmailActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ActualizeEmailActionHandler actualizeEmailActionHandler, Exception exc, CustomActionHandler.HandlerReferences handlerReferences, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = actualizeEmailActionHandler;
            this.$e = exc;
            this.$handlerRefs = handlerReferences;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$e, this.$handlerRefs, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.onError(this.$e, this.$handlerRefs.getRefs());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActualizeEmailActionHandler$processAction$1(ActualizeEmailActionHandler actualizeEmailActionHandler, AtomAction atomAction, CustomActionHandler.HandlerReferences handlerReferences, d<? super ActualizeEmailActionHandler$processAction$1> dVar) {
        super(2, dVar);
        this.this$0 = actualizeEmailActionHandler;
        this.$action = atomAction;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActualizeEmailActionHandler$processAction$1(this.this$0, this.$action, this.$handlerRefs, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r12.emit(r11) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (xe.C10727i.f(r0, r3, r11) != r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionV2Repository actionV2Repository;
        EmailActualizedEventBus emailActualizedEventBus;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (CancellationException e11) {
            throw e11;
        } catch (Exception e12) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            L0 l02 = De.s.f6650a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, e12, this.$handlerRefs, null);
            this.label = 3;
        }
        if (i11 == 0) {
            s.b(obj);
            actionV2Repository = this.this$0.actionV2Repository;
            y callAction = actionV2Repository.callAction(new ActionV2Request(null, ((AtomAction.ComposerAction) this.$action).getActionName(), false, 5, null), Object.class);
            this.label = 1;
            if (f.b(callAction, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    s.b(obj);
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        emailActualizedEventBus = this.this$0.getEmailActualizedEventBus();
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActualizeEmailActionHandler$processAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
