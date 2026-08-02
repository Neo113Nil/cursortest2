package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import Ae.x0;
import Sc.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.content.a;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.f;
import xe.M;
import xe.Y;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.AiMessageActionsViewModel$handleClick$2", f = "AiMessageActionsViewModel.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f84037d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a.C1454a f84038e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f84039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(a.C1454a c1454a, h hVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f84038e = c1454a;
        this.f84039f = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f84038e, this.f84039f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object value;
        f fVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f84037d;
        a.C1454a c1454a = this.f84038e;
        if (i11 == 0) {
            s.b(obj);
            long a11 = c1454a.a();
            this.f84037d = 1;
            if (Y.b(a11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        x0Var = this.f84039f.f84026g;
        do {
            value = x0Var.getValue();
            f fVar2 = (f) value;
            if (fVar2 != null) {
                List<f.a> b11 = fVar2.b();
                ArrayList arrayList = new ArrayList(C7714v.z(b11, 10));
                for (f.a aVar2 : b11) {
                    if (aVar2.d() == c1454a.getId()) {
                        aVar2 = f.a.a(aVar2, Boolean.FALSE);
                    }
                    arrayList.add(aVar2);
                }
                fVar = f.a(fVar2, arrayList);
            } else {
                fVar = null;
            }
        } while (!x0Var.b(value, fVar));
        return Unit.f71690a;
    }
}
