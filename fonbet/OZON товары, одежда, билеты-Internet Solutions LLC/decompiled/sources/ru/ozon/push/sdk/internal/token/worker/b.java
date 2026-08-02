package ru.ozon.push.sdk.internal.token.worker;

import Sc.s;
import Yg0.a;
import Zg0.b;
import androidx.work.n;
import ch.C5832c;
import ch.InterfaceC5830a;
import jh0.c;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@e(c = "ru.ozon.push.sdk.internal.token.worker.SendChannelStateWorker$doWork$2", f = "SendChannelStateWorker.kt", l = {41, 56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends j implements Function2<M, d<? super n.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Yg0.a f97719d;

    /* renamed from: e, reason: collision with root package name */
    c f97720e;

    /* renamed from: f, reason: collision with root package name */
    boolean f97721f;

    /* renamed from: g, reason: collision with root package name */
    boolean f97722g;

    /* renamed from: h, reason: collision with root package name */
    int f97723h;

    /* renamed from: i, reason: collision with root package name */
    int f97724i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ SendChannelStateWorker f97725j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(SendChannelStateWorker sendChannelStateWorker, d<? super b> dVar) {
        super(2, dVar);
        this.f97725j = sendChannelStateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f97725j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super n.a> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Yg0.a aVar;
        c cVar;
        int i11;
        boolean z11;
        boolean z12;
        c cVar2;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f97724i;
        try {
            if (i12 == 0) {
                s.b(obj);
                Yg0.a.f35038y.getClass();
                Yg0.a b11 = a.C0652a.b();
                Zg0.b d11 = b11.p().d();
                b.a aVar3 = d11 != null ? (b.a) d11 : null;
                if (aVar3 != null) {
                    aVar3.a();
                }
                aVar = b11;
                cVar = c.NOTIFICATIONS_STATE_CHANGED_BACKGROUND;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f97723h;
                    z11 = this.f97722g;
                    z12 = this.f97721f;
                    cVar = this.f97720e;
                    aVar = this.f97719d;
                    s.b(obj);
                    int intValue = ((Number) obj).intValue();
                    if (z12 == z11 || i11 != intValue) {
                        aVar.B(cVar, false).get();
                    }
                    return new n.a.c();
                }
                Yg0.a aVar4 = this.f97719d;
                try {
                    s.b(obj);
                    cVar2 = c.NOTIFICATIONS_STATE_CHANGED_BACKGROUND_UI;
                } catch (Exception unused) {
                    cVar2 = c.NOTIFICATIONS_STATE_CHANGED_BACKGROUND;
                }
                cVar = cVar2;
                aVar = aVar4;
            }
            oh0.d n11 = aVar.n();
            oh0.c cVar3 = (oh0.c) aVar.m();
            boolean a11 = cVar3.a();
            boolean a12 = n11.a();
            int b12 = cVar3.b();
            InterfaceC5830a j11 = aVar.j();
            this.f97719d = aVar;
            this.f97720e = cVar;
            this.f97721f = a11;
            this.f97722g = a12;
            this.f97723h = b12;
            this.f97724i = 2;
            Object a13 = C5832c.a(j11, this);
            if (a13 == aVar2) {
                return aVar2;
            }
            i11 = b12;
            z11 = a12;
            obj = a13;
            z12 = a11;
            int intValue2 = ((Number) obj).intValue();
            if (z12 == z11) {
            }
            aVar.B(cVar, false).get();
            return new n.a.c();
        } catch (Exception unused2) {
            return new n.a.C0823a();
        }
    }
}
