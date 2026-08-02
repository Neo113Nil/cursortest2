package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.C8004n;
import r0.C9105F;
import v0.InterfaceC10174n;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantListKt$messageBubble$1$2$2$1$1", f = "AiAssistantList.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89282d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v0.I f89283e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f89284f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Integer> f89285g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> f89286h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<String> f89287i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ boolean f89288j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    L(v0.I i11, String str, Function0<Integer> function0, Function1<? super ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o, Unit> function1, Function0<String> function02, boolean z11, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f89283e = i11;
        this.f89284f = str;
        this.f89285g = function0;
        this.f89286h = function1;
        this.f89287i = function02;
        this.f89288j = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new L(this.f89283e, this.f89284f, this.f89285g, this.f89286h, this.f89287i, this.f89288j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f89282d;
        String str = this.f89284f;
        if (i12 == 0) {
            Sc.s.b(obj);
            int intValue = this.f89285g.invoke().intValue();
            v0.I i13 = this.f89283e;
            v0.y t2 = i13.t();
            Iterator<T> it = t2.g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (Intrinsics.d(((InterfaceC10174n) obj2).getKey(), str)) {
                    break;
                }
            }
            InterfaceC10174n interfaceC10174n = (InterfaceC10174n) obj2;
            if (interfaceC10174n != null) {
                int c11 = t2.c() + t2.f();
                int h11 = t2.h() - intValue;
                if (interfaceC10174n.getOffset() < c11) {
                    i11 = interfaceC10174n.getOffset() - c11;
                } else {
                    if (interfaceC10174n.getSize() + interfaceC10174n.getOffset() > h11) {
                        i11 = (interfaceC10174n.getSize() + interfaceC10174n.getOffset()) - h11;
                    }
                }
                if (i11 != 0) {
                    this.f89282d = 1;
                    if (C9105F.a(i13, i11, C8004n.c(0.0f, null, 7), this) == aVar) {
                        return aVar;
                    }
                }
            }
            i11 = 0;
            if (i11 != 0) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        this.f89286h.invoke(new ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.o(str, this.f89287i.invoke(), this.f89288j));
        return Unit.f71690a;
    }
}
