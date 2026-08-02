package ru.ozon.app.android.abtool.presentation;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.abtool.AbToolImpl;
import ru.ozon.app.android.abtool.AbToolNamespace;
import ru.ozon.app.android.abtool.domain.FeatureDebugModel;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LAe/i;", "", "Lru/ozon/app/android/abtool/domain/FeatureDebugModel;", "", "<anonymous>", "(LAe/i;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.abtool.presentation.AbToggleViewModel$1$2$1", f = "AbToggleViewModel.kt", l = {53, 53}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class AbToggleViewModel$1$2$1 extends j implements Function2<InterfaceC2397i<? super List<? extends FeatureDebugModel>>, d<? super Unit>, Object> {
    final /* synthetic */ String $query;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbToggleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbToggleViewModel$1$2$1(AbToggleViewModel abToggleViewModel, String str, d<? super AbToggleViewModel$1$2$1> dVar) {
        super(2, dVar);
        this.this$0 = abToggleViewModel;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AbToggleViewModel$1$2$1 abToggleViewModel$1$2$1 = new AbToggleViewModel$1$2$1(this.this$0, this.$query, dVar);
        abToggleViewModel$1$2$1.L$0 = obj;
        return abToggleViewModel$1$2$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC2397i<? super List<FeatureDebugModel>> interfaceC2397i, d<? super Unit> dVar) {
        return ((AbToggleViewModel$1$2$1) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        AbToolImpl abToolImpl;
        AbToolNamespace abToolNamespace;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            abToolImpl = this.this$0.abTool;
            String str = this.$query;
            abToolNamespace = this.this$0.namespace;
            this.L$0 = interfaceC2397i;
            this.label = 1;
            obj = abToolImpl.getFeatureUiStates$abzone_release(str, abToolNamespace, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            s.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC2397i<? super List<? extends FeatureDebugModel>> interfaceC2397i, d<? super Unit> dVar) {
        return invoke2((InterfaceC2397i<? super List<FeatureDebugModel>>) interfaceC2397i, dVar);
    }
}
