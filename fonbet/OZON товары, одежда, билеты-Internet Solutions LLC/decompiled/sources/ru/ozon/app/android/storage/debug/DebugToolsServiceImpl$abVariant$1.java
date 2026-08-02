package ru.ozon.app.android.storage.debug;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import pf0.InterfaceC8918a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storage.debug.DebugToolsServiceImpl$abVariant$1", f = "DebugToolsServiceImpl.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class DebugToolsServiceImpl$abVariant$1 extends j implements Function2<M, d<? super String>, Object> {
    int label;
    final /* synthetic */ DebugToolsServiceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugToolsServiceImpl$abVariant$1(DebugToolsServiceImpl debugToolsServiceImpl, d<? super DebugToolsServiceImpl$abVariant$1> dVar) {
        super(2, dVar);
        this.this$0 = debugToolsServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DebugToolsServiceImpl$abVariant$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8918a extraHeadersRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            extraHeadersRepository = this.this$0.getExtraHeadersRepository();
            this.label = 1;
            obj = extraHeadersRepository.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return ((Map) obj).get("x-o3-ab-variants");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((DebugToolsServiceImpl$abVariant$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
