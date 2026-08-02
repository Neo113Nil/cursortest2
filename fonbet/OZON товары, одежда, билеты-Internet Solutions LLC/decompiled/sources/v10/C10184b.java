package v10;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v10.C10185c;

/* renamed from: v10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C10184b<T> implements InterfaceC2395h<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<T> f101645a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6511n<Object, Object, kotlin.coroutines.d<? super Boolean>, Object> f101646b;

    /* renamed from: v10.b$a */
    static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference<T> f101647a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<T> f101648b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C10184b<T> f101649c;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.ui.ext.DistinctSuspendFlow$collect$2", f = "FlowExt.kt", l = {53, 55, 57}, m = "emit")
        /* renamed from: v10.b$a$a, reason: collision with other inner class name */
        static final class C2216a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            Object f101650d;

            /* renamed from: e, reason: collision with root package name */
            Object f101651e;

            /* renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f101652f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ a<T> f101653g;

            /* renamed from: h, reason: collision with root package name */
            int f101654h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2216a(a<? super T> aVar, kotlin.coroutines.d<? super C2216a> dVar) {
                super(dVar);
                this.f101653g = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f101652f = obj;
                this.f101654h |= LinearLayoutManager.INVALID_OFFSET;
                return this.f101653g.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(AtomicReference<T> atomicReference, InterfaceC2397i<? super T> interfaceC2397i, C10184b<T> c10184b) {
            this.f101647a = atomicReference;
            this.f101648b = interfaceC2397i;
            this.f101649c = c10184b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            if (r2.f101648b.emit(r8, r0) == r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
        
            if (r7.f101648b.emit(r8, r0) == r1) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            C2216a c2216a;
            int i11;
            a<T> aVar;
            if (dVar instanceof C2216a) {
                c2216a = (C2216a) dVar;
                int i12 = c2216a.f101654h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c2216a.f101654h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c2216a.f101652f;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c2216a.f101654h;
                    if (i11 != 0) {
                        s.b(obj);
                        while (true) {
                            AtomicReference<T> atomicReference = this.f101647a;
                            if (atomicReference.compareAndSet(null, t2)) {
                                c2216a.f101654h = 1;
                            } else if (atomicReference.get() != null) {
                                InterfaceC6511n<Object, Object, kotlin.coroutines.d<? super Boolean>, Object> interfaceC6511n = this.f101649c.f101646b;
                                T t11 = atomicReference.get();
                                c2216a.f101650d = this;
                                c2216a.f101651e = t2;
                                c2216a.f101654h = 2;
                                obj = ((C10185c.a) interfaceC6511n).invoke(t11, t2, c2216a);
                                if (obj != aVar2) {
                                    aVar = this;
                                }
                            }
                        }
                        return Unit.f71690a;
                    }
                    if (i11 == 1) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    t2 = (T) c2216a.f101651e;
                    aVar = (a) c2216a.f101650d;
                    s.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Unit.f71690a;
                    }
                    aVar.f101647a.set(t2);
                    c2216a.f101650d = null;
                    c2216a.f101651e = null;
                    c2216a.f101654h = 3;
                }
            }
            c2216a = new C2216a(this, dVar);
            Object obj2 = c2216a.f101652f;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            i11 = c2216a.f101654h;
            if (i11 != 0) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10184b(@NotNull InterfaceC2395h<? extends T> upstream, @NotNull InterfaceC6511n<Object, Object, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> areEquivalent) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(areEquivalent, "areEquivalent");
        this.f101645a = upstream;
        this.f101646b = areEquivalent;
    }

    @Override // Ae.InterfaceC2395h
    public final Object collect(@NotNull InterfaceC2397i<? super T> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object collect = this.f101645a.collect(new a(new AtomicReference(), interfaceC2397i, this), dVar);
        return collect == Wc.a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
    }
}
