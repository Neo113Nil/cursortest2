package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.input.c;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.A0;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$refreshAndRestoreState$1", f = "ChatViewModel.kt", l = {1227, 1235}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class h0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f90260d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C9467e f90261e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$refreshAndRestoreState$1$1", f = "ChatViewModel.kt", l = {1228}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90262d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9467e f90263e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.coroutines.d dVar, C9467e c9467e) {
            super(2, dVar);
            this.f90263e = c9467e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar, this.f90263e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode.k kVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90262d;
            if (i11 == 0) {
                Sc.s.b(obj);
                kVar = this.f90263e.f90238z;
                this.f90262d = 1;
                if (kVar.l(this) == aVar) {
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

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.ChatViewModelImpl$refreshAndRestoreState$1$2", f = "ChatViewModel.kt", l = {1229}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f90264d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C9467e f90265e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.coroutines.d dVar, C9467e c9467e) {
            super(2, dVar);
            this.f90265e = c9467e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new b(dVar, this.f90265e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Ae.C0 c02;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f90264d;
            if (i11 == 0) {
                Sc.s.b(obj);
                c02 = this.f90265e.f90198P;
                A0.a aVar2 = A0.a.f89963a;
                this.f90264d = 1;
                if (c02.emit(aVar2, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h0(kotlin.coroutines.d dVar, C9467e c9467e) {
        super(2, dVar);
        this.f90261e = c9467e;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h0(dVar, this.f90261e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C9467e.f0(r4, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r7.a(r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ru.ozon.android.messenger.framework.domain.usecases.O o11;
        boolean z11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f90260d;
        C9467e c9467e = this.f90261e;
        if (i11 == 0) {
            Sc.s.b(obj);
            o11 = c9467e.f90230v;
            this.f90260d = 1;
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
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new a(null, c9467e), 3);
        C10727i.c(androidx.lifecycle.x0.a(c9467e), null, null, new b(null, c9467e), 3);
        z11 = c9467e.f90203Y;
        if (!z11) {
            c9467e.getController().v(new c.C1504c(C9467e.A0(c9467e)));
            c9467e.f90203Y = true;
        }
        this.f90260d = 2;
    }
}
