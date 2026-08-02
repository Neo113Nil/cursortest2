package ru.ozon.android.messenger.framework.presentation.search;

import android.os.SystemClock;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.framework.presentation.search.v;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.search.ChatSearchViewModel$launchDelayedLoader$1", f = "ChatSearchViewModel.kt", l = {509, UserVerificationMethods.USER_VERIFY_NONE}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class q extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f91785d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1<Long, Unit> f91786e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<Boolean, kotlin.coroutines.d<? super Unit>, Object> f91787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(Function2 function2, Function1 function1, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f91786e = function1;
        this.f91787f = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new q(this.f91787f, this.f91786e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((q) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (((ru.ozon.android.messenger.framework.presentation.search.D) r5.f91787f).invoke(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(300, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f91785d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f91785d = 1;
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
        ((v.a) this.f91786e).invoke(new Long(SystemClock.elapsedRealtime()));
        Boolean bool = Boolean.TRUE;
        this.f91785d = 2;
    }
}
