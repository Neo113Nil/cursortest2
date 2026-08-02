package r0;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x1.C10638m;
import x1.EnumC10640o;
import x1.InterfaceC10628c;
import xe.E0;

/* renamed from: r0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9140t {

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
    /* renamed from: r0.t$a */
    static final class a extends kotlin.coroutines.jvm.internal.i implements Function2<InterfaceC10628c, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82639d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82640e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f82641f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.jvm.internal.i f82642g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CoroutineContext coroutineContext, Function2<? super InterfaceC10628c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f82641f = coroutineContext;
            this.f82642g = (kotlin.coroutines.jvm.internal.i) function2;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f82641f, this.f82642g, dVar);
            aVar.f82640e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC10628c interfaceC10628c, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC10628c, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, x1.c] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, x1.c] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.Function2] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            InterfaceC10628c interfaceC10628c;
            InterfaceC10628c interfaceC10628c2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f82639d;
            CoroutineContext coroutineContext = this.f82641f;
            try {
            } catch (CancellationException e11) {
                e = e11;
                if (E0.i(coroutineContext)) {
                    throw e;
                }
                this.f82640e = r12;
                this.f82639d = 3;
                Object a11 = C9140t.a(r12, this);
                interfaceC10628c2 = r12;
            }
            if (r12 == 0) {
                Sc.s.b(obj);
                interfaceC10628c = (InterfaceC10628c) this.f82640e;
                if (E0.i(coroutineContext)) {
                }
            } else {
                if (r12 != 1) {
                    if (r12 == 2) {
                        InterfaceC10628c interfaceC10628c3 = (InterfaceC10628c) this.f82640e;
                        Sc.s.b(obj);
                        interfaceC10628c2 = interfaceC10628c3;
                    } else {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        InterfaceC10628c interfaceC10628c4 = (InterfaceC10628c) this.f82640e;
                        Sc.s.b(obj);
                        interfaceC10628c2 = interfaceC10628c4;
                    }
                    interfaceC10628c = interfaceC10628c2;
                    if (E0.i(coroutineContext)) {
                        return Unit.f71690a;
                    }
                    try {
                    } catch (CancellationException e12) {
                        r12 = interfaceC10628c;
                        e = e12;
                        if (E0.i(coroutineContext)) {
                        }
                    }
                    ?? r13 = this.f82642g;
                    this.f82640e = interfaceC10628c;
                    this.f82639d = 1;
                    if (r13.invoke(interfaceC10628c, this) != aVar) {
                        r12 = interfaceC10628c;
                        this.f82640e = r12;
                        this.f82639d = 2;
                        Object a12 = C9140t.a(r12, this);
                        interfaceC10628c2 = r12;
                    }
                    return aVar;
                }
                InterfaceC10628c interfaceC10628c5 = (InterfaceC10628c) this.f82640e;
                Sc.s.b(obj);
                r12 = interfaceC10628c5;
                this.f82640e = r12;
                this.f82639d = 2;
                Object a122 = C9140t.a(r12, this);
                interfaceC10628c2 = r12;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull InterfaceC10628c interfaceC10628c, @NotNull kotlin.coroutines.jvm.internal.a aVar) {
        C9139s c9139s;
        int i11;
        int size;
        int i12;
        if (aVar instanceof C9139s) {
            c9139s = (C9139s) aVar;
            int i13 = c9139s.f82638f;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9139s.f82638f = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9139s.f82637e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9139s.f82638f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    List<x1.x> b11 = interfaceC10628c.b1().b();
                    int size2 = b11.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        if (b11.get(i14).g()) {
                            EnumC10640o enumC10640o = EnumC10640o.Final;
                            c9139s.f82636d = interfaceC10628c;
                            c9139s.f82638f = 1;
                            obj = interfaceC10628c.i0(enumC10640o, c9139s);
                            if (obj == aVar2) {
                            }
                            List<x1.x> b12 = ((C10638m) obj).b();
                            size = b12.size();
                            i12 = 0;
                            while (i12 < size) {
                            }
                            return Unit.f71690a;
                        }
                    }
                    return Unit.f71690a;
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC10628c = c9139s.f82636d;
                Sc.s.b(obj);
                List<x1.x> b122 = ((C10638m) obj).b();
                size = b122.size();
                i12 = 0;
                while (i12 < size) {
                    if (b122.get(i12).g()) {
                        EnumC10640o enumC10640o2 = EnumC10640o.Final;
                        c9139s.f82636d = interfaceC10628c;
                        c9139s.f82638f = 1;
                        obj = interfaceC10628c.i0(enumC10640o2, c9139s);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        List<x1.x> b1222 = ((C10638m) obj).b();
                        size = b1222.size();
                        i12 = 0;
                        while (i12 < size) {
                        }
                    } else {
                        i12++;
                    }
                }
                return Unit.f71690a;
            }
        }
        c9139s = new C9139s(aVar);
        Object obj2 = c9139s.f82637e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9139s.f82638f;
        if (i11 != 0) {
        }
    }

    public static final Object b(@NotNull x1.F f7, @NotNull Function2<? super InterfaceC10628c, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object N02 = f7.N0(new a(dVar.getContext(), function2, null), dVar);
        return N02 == Wc.a.COROUTINE_SUSPENDED ? N02 : Unit.f71690a;
    }
}
