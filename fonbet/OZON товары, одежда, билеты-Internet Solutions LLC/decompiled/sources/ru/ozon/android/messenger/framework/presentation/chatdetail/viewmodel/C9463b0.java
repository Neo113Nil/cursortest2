package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.A;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$observeSocketEvents$1", f = "ChatViewModel.kt", l = {503}, m = "invokeSuspend")
/* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9463b0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90052d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90053e;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.b0$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C9467e f90054a;

        a(C9467e c9467e) {
            this.f90054a = c9467e;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ru.ozon.android.messenger.framework.presentation.models.A a11 = (ru.ozon.android.messenger.framework.presentation.models.A) obj;
            boolean z11 = a11 instanceof A.a;
            C9467e c9467e = this.f90054a;
            if (z11) {
                Object O02 = C9467e.O0(c9467e, (A.a) a11, dVar);
                return O02 == Wc.a.COROUTINE_SUSPENDED ? O02 : Unit.f71690a;
            }
            if (a11 instanceof A.g) {
                Object S02 = C9467e.S0(c9467e, (A.g) a11, dVar);
                return S02 == Wc.a.COROUTINE_SUSPENDED ? S02 : Unit.f71690a;
            }
            if (a11 instanceof A.e) {
                Object d12 = C9467e.d1(c9467e, (A.e) a11, dVar);
                return d12 == Wc.a.COROUTINE_SUSPENDED ? d12 : Unit.f71690a;
            }
            if (a11 instanceof A.c) {
                ((A.c) a11).getClass();
                int i11 = C9467e.f90182B0;
                c9467e.getClass();
                Intrinsics.checkNotNullParameter("An operation is not implemented: [ANDROID-14376]", "message");
                throw new Sc.p("An operation is not implemented: [ANDROID-14376]");
            }
            if (a11 instanceof A.f) {
                Object U02 = C9467e.U0(dVar, c9467e);
                return U02 == Wc.a.COROUTINE_SUSPENDED ? U02 : Unit.f71690a;
            }
            if (a11 instanceof A.d) {
                C9467e.T0(c9467e);
            }
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$observeSocketEvents$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ChatViewModel.kt", l = {219, 193}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.b0$b */
    public static final class b extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A>, String, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90055d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ InterfaceC2397i f90056e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f90057f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C9467e f90058g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, C9467e c9467e) {
            super(3, dVar);
            this.f90058g = c9467e;
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super ru.ozon.android.messenger.framework.presentation.models.A> interfaceC2397i, String str, kotlin.coroutines.d<? super Unit> dVar) {
            b bVar = new b(dVar, this.f90058g);
            bVar.f90056e = interfaceC2397i;
            bVar.f90057f = str;
            return bVar.invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (Ae.C2399j.r(r1, (Ae.InterfaceC2395h) r10, r9) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        
            if (r10 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC2397i interfaceC2397i;
            ru.ozon.android.messenger.framework.domain.usecases.r rVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90055d;
            if (i11 == 0) {
                Sc.s.b(obj);
                interfaceC2397i = this.f90056e;
                String str = (String) this.f90057f;
                rVar = this.f90058g.f90209e;
                ru.ozon.android.messenger.framework.presentation.models.x[] xVarArr = {ru.ozon.android.messenger.framework.presentation.models.x.MESSAGES, ru.ozon.android.messenger.framework.presentation.models.x.FOOTER, ru.ozon.android.messenger.framework.presentation.models.x.ALERT, ru.ozon.android.messenger.framework.presentation.models.x.CURTAIN};
                this.f90056e = interfaceC2397i;
                this.f90055d = 1;
                obj = rVar.a(xVarArr, str, this);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return Unit.f71690a;
                }
                interfaceC2397i = this.f90056e;
                Sc.s.b(obj);
            }
            this.f90056e = null;
            this.f90055d = 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9463b0(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90053e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C9463b0(dVar, this.f90053e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9463b0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90052d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9467e c9467e = this.f90053e;
            Be.m Q11 = C2399j.Q(c9467e.e(), new b(null, c9467e));
            a aVar2 = new a(c9467e);
            this.f90052d = 1;
            if (Q11.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
