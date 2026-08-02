package ub0;

import Sc.r;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.U;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker$processFingerprint$fingerprintResult$1", f = "FingerprintChecker.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super r<? extends String>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f100545d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ U<r<String>> f100546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(U<r<String>> u11, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f100546e = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f100546e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super r<? extends String>> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f100545d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        this.f100545d = 1;
        Object s11 = this.f100546e.s(this);
        return s11 == aVar ? aVar : s11;
    }
}
