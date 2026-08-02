package rg0;

import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.L0;
import xe.M;
import yg0.AbstractC10901d;
import yg0.AbstractC10902e;
import yg0.C10900c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.limb.deeplinks.SentryHelperDeeplinkHandler$sendFatal$1", f = "SentryHelperDeeplinkHandler.kt", l = {67, 74}, m = "invokeSuspend")
/* renamed from: rg0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9272d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83497d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9270b f83498e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.ozonSentryHelper.internal.limb.deeplinks.SentryHelperDeeplinkHandler$sendFatal$1$1", f = "SentryHelperDeeplinkHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rg0.d$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C9270b f83499d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f83500e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C9270b c9270b, String str, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f83499d = c9270b;
            this.f83500e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f83499d, this.f83500e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C9270b.b(this.f83499d, this.f83500e);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9272d(C9270b c9270b, kotlin.coroutines.d<? super C9272d> dVar) {
        super(2, dVar);
        this.f83498e = c9270b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9272d(this.f83498e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9272d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (xe.C10727i.f(r1, r4, r6) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
    
        if (r7 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC4008j interfaceC4008j;
        String b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83497d;
        C9270b c9270b = this.f83498e;
        if (i11 == 0) {
            s.b(obj);
            interfaceC4008j = c9270b.f83493a;
            C10900c c10900c = (C10900c) interfaceC4008j.getValue();
            AbstractC10902e.a aVar2 = new AbstractC10902e.a(0);
            this.f83497d = 1;
            obj = c10900c.b(aVar2, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        AbstractC10901d abstractC10901d = (AbstractC10901d) obj;
        if (abstractC10901d instanceof AbstractC10901d.c) {
            b11 = "Тестовый Fatal-ивент отправлен в Sentry";
        } else if (abstractC10901d instanceof AbstractC10901d.C2305d) {
            b11 = "Не получилось отправить тестовый Fatal-ивент в Sentry. Переключитесь на STG-окружение.";
        } else if (abstractC10901d instanceof AbstractC10901d.b) {
            b11 = "Ошибка: не задан DSN при первичной инициализации Sentry в приложении";
        } else {
            if (!(abstractC10901d instanceof AbstractC10901d.a)) {
                throw new o();
            }
            b11 = V.e.b(new Object[]{((AbstractC10901d.a) abstractC10901d).a()}, 1, "Неизвестная ошибка: %s", "format(...)");
        }
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        a aVar3 = new a(c9270b, b11, null);
        this.f83497d = 2;
    }
}
