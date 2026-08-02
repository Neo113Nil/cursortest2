package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import ru.ozon.android.messenger.framework.domain.model.f;
import ve.EnumC10311b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantViewModel$postponeThinkingRemoval$1", f = "AiAssistantViewModel.kt", l = {672, 680}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class C0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f89231d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9414c0 f89232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0(kotlin.coroutines.d dVar, C9414c0 c9414c0) {
        super(2, dVar);
        this.f89232e = c9414c0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C0(dVar, this.f89232e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7.g(r3, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (xe.Y.c(r4, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        ru.ozon.android.messenger.framework.domain.usecases.F f7;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f89231d;
        if (i11 == 0) {
            Sc.s.b(obj);
            b.Companion companion = kotlin.time.b.INSTANCE;
            long h11 = kotlin.time.c.h(1500L, EnumC10311b.MILLISECONDS);
            this.f89231d = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        C9414c0 c9414c0 = this.f89232e;
        str = c9414c0.f89515r;
        if (str == null) {
            return Unit.f71690a;
        }
        c9414c0.f89515r = null;
        c9414c0.f89514q = null;
        f7 = c9414c0.f89510m;
        f.b bVar = new f.b(str);
        this.f89231d = 2;
    }
}
