package ru.ozon.app.android.abtool;

import Jb.b;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.abtool.data.repository.AbVariantsRepository;
import ru.ozon.app.android.abtool.domain.AbToolInteractor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/P;", "", "invoke", "()Landroidx/lifecycle/P;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AbToolManager$experimentsHostLiveData$2 extends AbstractC7737t implements Function0<P<String>> {
    final /* synthetic */ AbToolManager this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/Q;", "", "", "<anonymous>", "(Landroidx/lifecycle/Q;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.abtool.AbToolManager$experimentsHostLiveData$2$1", f = "AbToolManager.kt", l = {41, 41}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.abtool.AbToolManager$experimentsHostLiveData$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Q<String>, d<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbToolManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AbToolManager abToolManager, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = abToolManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Q<String> q11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(q11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
        
            if (r1.emit(r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Q q11;
            AbToolInteractor abToolInteractor;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                q11 = (Q) this.L$0;
                abToolInteractor = this.this$0.abToolHostInteractor;
                AbVariantsRepository abVariantRepository = abToolInteractor.getAbVariantRepository();
                this.L$0 = q11;
                this.label = 1;
                obj = abVariantRepository.getAbVariantsIds(this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                q11 = (Q) this.L$0;
                s.b(obj);
            }
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToolManager$experimentsHostLiveData$2(AbToolManager abToolManager) {
        super(0);
        this.this$0 = abToolManager;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final P<String> invoke() {
        return b.d(new AnonymousClass1(this.this$0, null));
    }
}
