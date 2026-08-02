package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import Ae.InterfaceC2397i;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadgeHolderKt$tickerFlow$1", f = "TimerBadgeHolder.kt", l = {126, 127}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class e extends j implements Function2<InterfaceC2397i<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f87643d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f87644e;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        e eVar = new e(2, dVar);
        eVar.f87644e = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Unit> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (xe.Y.b(1000, r6) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0044 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        InterfaceC2397i interfaceC2397i2;
        Unit unit;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f87643d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.f87644e;
            unit = Unit.f71690a;
            this.f87644e = interfaceC2397i;
            this.f87643d = 1;
            if (interfaceC2397i.emit(unit, this) != aVar) {
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2397i2 = (InterfaceC2397i) this.f87644e;
            s.b(obj);
            interfaceC2397i = interfaceC2397i2;
            unit = Unit.f71690a;
            this.f87644e = interfaceC2397i;
            this.f87643d = 1;
            if (interfaceC2397i.emit(unit, this) != aVar) {
                interfaceC2397i2 = interfaceC2397i;
                this.f87644e = interfaceC2397i2;
                this.f87643d = 2;
            }
            return aVar;
        }
        interfaceC2397i2 = (InterfaceC2397i) this.f87644e;
        s.b(obj);
        this.f87644e = interfaceC2397i2;
        this.f87643d = 2;
    }
}
