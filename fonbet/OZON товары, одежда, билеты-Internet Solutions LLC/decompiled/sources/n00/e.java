package n00;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import m00.C8029a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e implements InterfaceC2395h<C8029a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f76257a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f76258b;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i f76259a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f76260b;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.debug.menu.data.storage.ComposerDebugMenuStateRepository$stateFlow$$inlined$map$1$2", f = "ComposerDebugMenuStateRepository.kt", l = {223}, m = "emit")
        /* renamed from: n00.e$a$a, reason: collision with other inner class name */
        public static final class C1284a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f76261d;

            /* renamed from: e, reason: collision with root package name */
            int f76262e;

            public C1284a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f76261d = obj;
                this.f76262e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, f fVar) {
            this.f76259a = interfaceC2397i;
            this.f76260b = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
            C1284a c1284a;
            int i11;
            h hVar;
            if (dVar instanceof C1284a) {
                c1284a = (C1284a) dVar;
                int i12 = c1284a.f76262e;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1284a.f76262e = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj2 = c1284a.f76261d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c1284a.f76262e;
                    if (i11 != 0) {
                        s.b(obj2);
                        C8029a c8029a = (C8029a) obj;
                        hVar = this.f76260b.f76268e;
                        C8029a b11 = C8029a.b(c8029a, null, null, hVar.a(c8029a), 3);
                        c1284a.f76262e = 1;
                        if (this.f76259a.emit(b11, c1284a) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj2);
                    }
                    return Unit.f71690a;
                }
            }
            c1284a = new C1284a(dVar);
            Object obj22 = c1284a.f76261d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c1284a.f76262e;
            if (i11 != 0) {
            }
            return Unit.f71690a;
        }
    }

    public e(InterfaceC2395h interfaceC2395h, f fVar) {
        this.f76257a = interfaceC2395h;
        this.f76258b = fVar;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super C8029a> interfaceC2397i, @NotNull kotlin.coroutines.d dVar) {
        Object collect = this.f76257a.collect(new a(interfaceC2397i, this.f76258b), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
