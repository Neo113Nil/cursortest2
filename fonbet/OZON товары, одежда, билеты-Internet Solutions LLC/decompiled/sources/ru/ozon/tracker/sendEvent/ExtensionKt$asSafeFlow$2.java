package ru.ozon.tracker.sendEvent;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.tracker.sendEvent.EventUpdateHandler;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/tracker/sendEvent/EventUpdateHandler$UpdateState;", "", "cause", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.tracker.sendEvent.ExtensionKt$asSafeFlow$2", f = "Extension.kt", l = {34, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExtensionKt$asSafeFlow$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super EventUpdateHandler.UpdateState>, Throwable, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> $catch;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExtensionKt$asSafeFlow$2(InterfaceC6511n<? super CoroutineContext, ? super Throwable, ? super d<? super Unit>, ? extends Object> interfaceC6511n, d<? super ExtensionKt$asSafeFlow$2> dVar) {
        super(3, dVar);
        this.$catch = interfaceC6511n;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super EventUpdateHandler.UpdateState> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        ExtensionKt$asSafeFlow$2 extensionKt$asSafeFlow$2 = new ExtensionKt$asSafeFlow$2(this.$catch, dVar);
        extensionKt$asSafeFlow$2.L$0 = interfaceC2397i;
        extensionKt$asSafeFlow$2.L$1 = th2;
        return extensionKt$asSafeFlow$2.invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4.invoke(r5, r7, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.L$0;
            Throwable th2 = (Throwable) this.L$1;
            InterfaceC6511n<CoroutineContext, Throwable, d<? super Unit>, Object> interfaceC6511n = this.$catch;
            CoroutineContext context = getContext();
            this.L$0 = interfaceC2397i;
            this.label = 1;
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
        EventUpdateHandler.UpdateState updateState = EventUpdateHandler.UpdateState.FORCE;
        this.L$0 = null;
        this.label = 2;
    }
}
