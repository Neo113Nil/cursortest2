package ki;

import Ae.AbstractC2381a;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import S0.n1;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import m0.Y;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1", f = "ButtonUtils.kt", l = {47}, m = "invokeSuspend")
/* renamed from: ki.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C7682b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71600d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y<Boolean> f71601e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<Boolean> f71602f;

    /* renamed from: ki.b$a */
    static final class a extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Y<Boolean> f71603b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Y<Boolean> y11) {
            super(0);
            this.f71603b = y11;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f71603b.h());
        }
    }

    /* renamed from: ki.b$b, reason: collision with other inner class name */
    static final class C1178b<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y<Boolean> f71604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3978p0<Boolean> f71605b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ds.compose.component.button.ButtonUtilsKt$rememberIndicationTransition$1$1$3", f = "ButtonUtils.kt", l = {49}, m = "emit")
        /* renamed from: ki.b$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f71606d;

            /* renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f71607e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C1178b<T> f71608f;

            /* renamed from: g, reason: collision with root package name */
            int f71609g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C1178b<? super T> c1178b, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f71608f = c1178b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f71607e = obj;
                this.f71609g |= LinearLayoutManager.INVALID_OFFSET;
                return this.f71608f.a(false, this);
            }
        }

        C1178b(Y y11, InterfaceC3978p0 interfaceC3978p0) {
            this.f71604a = y11;
            this.f71605b = interfaceC3978p0;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(boolean z11, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            int i11;
            C1178b<T> c1178b;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i12 = aVar.f71609g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f71609g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = aVar.f71607e;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f71609g;
                    if (i11 != 0) {
                        s.b(obj);
                        kotlin.time.b.INSTANCE.getClass();
                        if (!kotlin.time.b.g(0L, 0L)) {
                            aVar.f71606d = this;
                            aVar.f71609g = 1;
                            if (xe.Y.c(0L, aVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        c1178b = this;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1178b = (C1178b) aVar.f71606d;
                        s.b(obj);
                    }
                    InterfaceC3978p0<Boolean> interfaceC3978p0 = c1178b.f71605b;
                    Boolean bool = Boolean.FALSE;
                    interfaceC3978p0.setValue(bool);
                    c1178b.f71604a.i(bool);
                    return Unit.f71690a;
                }
            }
            aVar = new a(this, dVar);
            Object obj2 = aVar.f71607e;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = aVar.f71609g;
            if (i11 != 0) {
            }
            InterfaceC3978p0<Boolean> interfaceC3978p02 = c1178b.f71605b;
            Boolean bool2 = Boolean.FALSE;
            interfaceC3978p02.setValue(bool2);
            c1178b.f71604a.i(bool2);
            return Unit.f71690a;
        }

        @Override // Ae.InterfaceC2397i
        public final /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.d dVar) {
            return a(((Boolean) obj).booleanValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7682b(Y y11, InterfaceC3978p0 interfaceC3978p0, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f71601e = y11;
        this.f71602f = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C7682b(this.f71601e, this.f71602f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7682b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71600d;
        if (i11 == 0) {
            s.b(obj);
            Y<Boolean> y11 = this.f71601e;
            InterfaceC2395h m11 = n1.m(new a(y11));
            InterfaceC3978p0<Boolean> interfaceC3978p0 = this.f71602f;
            C1178b c1178b = new C1178b(y11, interfaceC3978p0);
            this.f71600d = 1;
            Object collect = ((AbstractC2381a) m11).collect(new C7683c(c1178b, interfaceC3978p0), this);
            if (collect != aVar) {
                collect = Unit.f71690a;
            }
            if (collect == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
