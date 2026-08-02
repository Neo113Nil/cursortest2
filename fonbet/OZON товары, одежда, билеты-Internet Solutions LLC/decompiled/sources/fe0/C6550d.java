package fe0;

import Sc.s;
import android.util.Log;
import fe0.C6547a;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.algo.Algorithm;
import we0.u;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.f1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$collectClusterizerUpdateEvents$1", f = "BasePlacemarkClusterizer.kt", l = {289, 302}, m = "invokeSuspend")
/* renamed from: fe0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6550d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63334d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f63335e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C6547a<Algorithm<u>> f63336f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$collectClusterizerUpdateEvents$1$1", f = "BasePlacemarkClusterizer.kt", l = {291}, m = "invokeSuspend")
    /* renamed from: fe0.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63337d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6547a<Algorithm<u>> f63338e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6547a.b f63339f;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.clusterizer.BasePlacemarkClusterizer$collectClusterizerUpdateEvents$1$1$1", f = "BasePlacemarkClusterizer.kt", l = {293}, m = "invokeSuspend")
        /* renamed from: fe0.d$a$a, reason: collision with other inner class name */
        static final class C1018a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Object>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f63340d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C6547a<Algorithm<u>> f63341e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6547a.b f63342f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1018a(C6547a<Algorithm<u>> c6547a, C6547a.b bVar, kotlin.coroutines.d<? super C1018a> dVar) {
                super(2, dVar);
                this.f63341e = c6547a;
                this.f63342f = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C1018a(this.f63341e, this.f63342f, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Object> dVar) {
                return ((C1018a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f63340d;
                try {
                    if (i11 == 0) {
                        s.b(obj);
                        C6547a<Algorithm<u>> c6547a = this.f63341e;
                        C6547a.b bVar = this.f63342f;
                        this.f63340d = 1;
                        if (C6547a.t(c6547a, bVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                } catch (CancellationException e11) {
                    Log.d("PlacemarkClusterizerImpl", "clusterizing cancelled");
                    throw e11;
                } catch (Exception e12) {
                    return new Integer(Log.e("PlacemarkClusterizerImpl", "clusterizing: " + e12, e12));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C6547a<Algorithm<u>> c6547a, C6547a.b bVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f63338e = c6547a;
            this.f63339f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f63338e, this.f63339f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63337d;
            if (i11 == 0) {
                s.b(obj);
                C6547a<Algorithm<u>> c6547a = this.f63338e;
                long B11 = c6547a.B();
                C1018a c1018a = new C1018a(c6547a, this.f63339f, null);
                this.f63337d = 1;
                if (f1.c(B11, c1018a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6550d(C6547a<Algorithm<u>> c6547a, kotlin.coroutines.d<? super C6550d> dVar) {
        super(2, dVar);
        this.f63336f = c6547a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C6550d c6550d = new C6550d(this.f63336f, dVar);
        c6550d.f63335e = obj;
        return c6550d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C6550d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0066, code lost:
    
        if (r10.r0(r9) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:6:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0066 -> B:6:0x0069). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        M m12;
        B0 z11;
        C6547a.c cVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63334d;
        C6547a<Algorithm<u>> c6547a = this.f63336f;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.f63335e;
            if (!N.f(m11)) {
            }
        } else if (i11 == 1) {
            m12 = (M) this.f63335e;
            s.b(obj);
            c6547a.G(C10727i.c(m12, ((C6547a) c6547a).f63283m, null, new a(c6547a, (C6547a.b) obj, null), 2));
            z11 = c6547a.z();
            if (z11 != null) {
            }
            m11 = m12;
            if (!N.f(m11)) {
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m12 = (M) this.f63335e;
            s.b(obj);
            m11 = m12;
            if (!N.f(m11)) {
                cVar = ((C6547a) c6547a).f63285o;
                this.f63335e = m11;
                this.f63334d = 1;
                Object e11 = cVar.e(this);
                if (e11 != aVar) {
                    m12 = m11;
                    obj = e11;
                    c6547a.G(C10727i.c(m12, ((C6547a) c6547a).f63283m, null, new a(c6547a, (C6547a.b) obj, null), 2));
                    z11 = c6547a.z();
                    if (z11 != null) {
                        this.f63335e = m12;
                        this.f63334d = 2;
                    }
                    m11 = m12;
                    if (!N.f(m11)) {
                        return Unit.f71690a;
                    }
                }
                return aVar;
            }
        }
    }
}
