package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewModel$onPhoneChanged$1", f = "ParticipantPhoneViewModel.kt", l = {46, 49, 50}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ParticipantPhoneViewModel$onPhoneChanged$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $phoneAction;
    int label;
    final /* synthetic */ ParticipantPhoneViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ParticipantPhoneViewModel$onPhoneChanged$1(AtomAction atomAction, ParticipantPhoneViewModel participantPhoneViewModel, d<? super ParticipantPhoneViewModel$onPhoneChanged$1> dVar) {
        super(2, dVar);
        this.$phoneAction = atomAction;
        this.this$0 = participantPhoneViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ParticipantPhoneViewModel$onPhoneChanged$1(this.$phoneAction, this.this$0, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (r8.emit(null, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (xe.Y.b(500, r7) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        x0 x0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else if (i11 == 1) {
            s.b(obj);
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
            x0Var2 = this.this$0.phoneActionFlow;
            this.label = 3;
        }
        AtomAction atomAction = this.$phoneAction;
        AtomAction addEnteredPhoneToAction = atomAction != null ? this.this$0.addEnteredPhoneToAction(atomAction) : null;
        x0Var = this.this$0.phoneActionFlow;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ParticipantPhoneViewModel$onPhoneChanged$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
