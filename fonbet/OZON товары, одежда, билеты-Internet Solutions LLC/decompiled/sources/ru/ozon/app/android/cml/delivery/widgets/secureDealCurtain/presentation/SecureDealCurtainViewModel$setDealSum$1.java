package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation;

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
@e(c = "ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel$setDealSum$1", f = "SecureDealCurtainViewModel.kt", l = {60, 61}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class SecureDealCurtainViewModel$setDealSum$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $action;
    int label;
    final /* synthetic */ SecureDealCurtainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SecureDealCurtainViewModel$setDealSum$1(SecureDealCurtainViewModel secureDealCurtainViewModel, AtomAction atomAction, d<? super SecureDealCurtainViewModel$setDealSum$1> dVar) {
        super(2, dVar);
        this.this$0 = secureDealCurtainViewModel;
        this.$action = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SecureDealCurtainViewModel$setDealSum$1(this.this$0, this.$action, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (xe.Y.b(r4, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j11;
        Object requestAsyncUpdate;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            j11 = this.this$0.debounceDelayMillis;
            this.label = 1;
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
        SecureDealCurtainViewModel secureDealCurtainViewModel = this.this$0;
        AtomAction atomAction = this.$action;
        this.label = 2;
        requestAsyncUpdate = secureDealCurtainViewModel.requestAsyncUpdate(atomAction, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SecureDealCurtainViewModel$setDealSum$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
