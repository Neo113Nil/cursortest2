package ub;

import android.content.ComponentName;
import android.os.IInterface;
import com.vk.push.core.base.AidlResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;
import ub.AbstractC10010q;
import xe.C10737n;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.ipc.BaseIPCClient$makeAsyncRequest$2", f = "BaseIPCClient.kt", l = {381}, m = "invokeSuspend")
/* renamed from: ub.m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10006m extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<Object>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f100480d;

    /* renamed from: e, reason: collision with root package name */
    int f100481e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100482f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f100483g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ String f100484h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f100485i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f100486j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ Object f100487k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C10006m(AbstractC9996c<IInterface> abstractC9996c, Function2<IInterface, ? super InterfaceC7913b, Unit> function2, String str, Function2<? super AidlResult<?>, ? super Za.a, Object> function22, Function1<? super Exception, Object> function1, Function1<? super String, ComponentName> function12, kotlin.coroutines.d<? super C10006m> dVar) {
        super(2, dVar);
        this.f100482f = abstractC9996c;
        this.f100483g = (AbstractC7737t) function2;
        this.f100484h = str;
        this.f100485i = (AbstractC7737t) function22;
        this.f100486j = (AbstractC7737t) function1;
        this.f100487k = function12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        ?? r52 = this.f100486j;
        ?? r62 = this.f100487k;
        return new C10006m(this.f100482f, this.f100483g, this.f100484h, this.f100485i, r52, r62, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<Object> dVar) {
        return ((C10006m) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f100481e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return obj;
        }
        Sc.s.b(obj);
        AbstractC9996c<IInterface> abstractC9996c = this.f100482f;
        ?? r42 = this.f100483g;
        String str = this.f100484h;
        ?? r62 = this.f100485i;
        ?? r82 = this.f100486j;
        ?? r12 = this.f100487k;
        this.f100480d = r12;
        this.f100481e = 1;
        C10737n c10737n = new C10737n(1, Wc.b.b(this));
        c10737n.o();
        AbstractC9996c.f(abstractC9996c, new AbstractC10010q.a(r42, str, r62, abstractC9996c.s(), r82, c10737n), r12);
        Object n11 = c10737n.n();
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(this, "frame");
        }
        return n11 == aVar ? aVar : n11;
    }
}
