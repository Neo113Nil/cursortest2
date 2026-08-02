package ub0;

import Sc.InterfaceC4008j;
import Sc.r;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ub0.C10013a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker$processFingerprint$fingerprintResult$deferred$1", f = "FingerprintChecker.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends j implements Function2<M, kotlin.coroutines.d<? super r<? extends String>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f100547d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10014b f100548e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C10013a.EnumC2205a f100549f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f100550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(C10014b c10014b, C10013a.EnumC2205a enumC2205a, String str, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f100548e = c10014b;
        this.f100549f = enumC2205a;
        this.f100550g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f100548e, this.f100549f, this.f100550g, dVar);
        gVar.f100547d = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super r<? extends String>> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        InterfaceC4008j interfaceC4008j;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        C10014b c10014b = this.f100548e;
        C10013a.EnumC2205a enumC2205a = this.f100549f;
        String str = this.f100550g;
        try {
            r.Companion companion = r.INSTANCE;
            interfaceC4008j = c10014b.f100512a;
            a11 = ((C10013a) interfaceC4008j.getValue()).a(enumC2205a, str);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        return r.a(a11);
    }
}
