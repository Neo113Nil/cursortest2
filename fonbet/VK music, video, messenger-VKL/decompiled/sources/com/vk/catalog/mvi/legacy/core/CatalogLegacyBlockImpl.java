package com.vk.catalog.mvi.legacy.core;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b6l;
import xsna.e8a;
import xsna.f8a;
import xsna.g8a;
import xsna.izs;
import xsna.jd4;
import xsna.k2a;
import xsna.kai;
import xsna.l8a;
import xsna.lsr;
import xsna.mm50;
import xsna.n8a;
import xsna.nb9;
import xsna.q1a;
import xsna.q630;
import xsna.r1a;
import xsna.r2a;
import xsna.r37;
import xsna.s2a;
import xsna.s3q0;
import xsna.s5;
import xsna.smk;
import xsna.spj;
import xsna.svj;
import xsna.t1a;
import xsna.tn0;
import xsna.up2;
import xsna.w69;
import xsna.wb0;
import xsna.wzs;
import xsna.yzs;
import xsna.z37;
import xsna.zzs;

/* compiled from: CatalogLegacyBlockImpl.kt */
/* loaded from: classes16.dex */
public final class CatalogLegacyBlockImpl implements e8a {
    public final CatalogBlockVariant a;
    public final l8a b;
    public final n8a<? extends CatalogBlockState> c;
    public final t1a<? super CatalogBlockState> d;
    public final s2a<? super CatalogBlockState, ?> e;
    public final k2a f;
    public final g8a g;
    public mm50<CatalogBlockState, f8a, r1a> h;

    /* compiled from: CatalogLegacyBlockImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<CatalogBlockState, r2a> {
        @Override // xsna.izs
        public final r2a invoke(CatalogBlockState catalogBlockState) {
            return ((s2a) this.receiver).a(catalogBlockState);
        }
    }

    /* compiled from: CatalogLegacyBlockImpl.kt */
    @b6l(c = "com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl$Content$2$1", f = "CatalogLegacyBlockImpl.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<z37<q1a>, r1a, spj<? super s3q0>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public b(spj<? super b> spjVar) {
            super(3, spjVar);
        }

        @Override // xsna.yzs
        public final Object invoke(z37<q1a> z37Var, r1a r1aVar, spj<? super s3q0> spjVar) {
            b bVar = CatalogLegacyBlockImpl.this.new b(spjVar);
            bVar.L$0 = r1aVar;
            return bVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            r1a r1aVar = (r1a) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            CatalogLegacyBlockImpl catalogLegacyBlockImpl = CatalogLegacyBlockImpl.this;
            if (r1aVar instanceof smk) {
                catalogLegacyBlockImpl.getClass();
            } else {
                catalogLegacyBlockImpl.b.e(r1aVar);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CatalogLegacyBlockImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<q1a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(q1a q1aVar) {
            ((z37) this.receiver).b(q1aVar);
            return s3q0.a;
        }
    }

    public CatalogLegacyBlockImpl(CatalogBlockVariant catalogBlockVariant, l8a l8aVar, n8a<? extends CatalogBlockState> n8aVar, t1a<? super CatalogBlockState> t1aVar, s2a<? super CatalogBlockState, ?> s2aVar, k2a k2aVar, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = l8aVar;
        this.c = n8aVar;
        this.d = t1aVar;
        this.e = s2aVar;
        this.f = k2aVar;
        this.g = g8aVar;
    }

    @Override // xsna.e8a
    public final void a(int i, androidx.compose.runtime.a aVar) {
        f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> w69Var;
        androidx.compose.runtime.a M = aVar.M(-1701084220);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1701084220, i2, -1, "com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl.Content (CatalogLegacyBlockImpl.kt:66)");
            }
            final mm50<CatalogBlockState, f8a, r1a> mm50Var = this.h;
            if (mm50Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    w69Var = new jd4(this, i, 3);
                    s.d = w69Var;
                }
                return;
            }
            int i3 = i2 & 14;
            boolean y = M.y(mm50Var) | (i3 == 4);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new tn0(5, mm50Var, this);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z = i3 == 4;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new b(null);
                M.R(x2);
            }
            r37.a(izsVar, (yzs) x2, kai.c(-739818167, new zzs() { // from class: xsna.i8a
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i4;
                    z37 z37Var = (z37) obj2;
                    r2a r2aVar = (r2a) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i4 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i4 |= aVar2.J(r2aVar) ? 32 : 16;
                    }
                    if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-739818167, i4, -1, "com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl.Content.<anonymous> (CatalogLegacyBlockImpl.kt:75)");
                        }
                        Object x3 = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x3 == c0012a) {
                            final nb9 k = tci.k(mm50Var);
                            x3 = new a1q(new ksr<Object>() { // from class: com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl$Content$lambda$9$lambda$6$$inlined$filterIsInstance$1

                                /* compiled from: Emitters.kt */
                                /* renamed from: com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl$Content$lambda$9$lambda$6$$inlined$filterIsInstance$1$2, reason: invalid class name */
                                public static final class AnonymousClass2<T> implements lsr {
                                    public final /* synthetic */ lsr b;

                                    @b6l(c = "com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl$Content$lambda$9$lambda$6$$inlined$filterIsInstance$1$2", f = "CatalogLegacyBlockImpl.kt", l = {50}, m = "emit")
                                    /* renamed from: com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl$Content$lambda$9$lambda$6$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        int I$0;
                                        Object L$0;
                                        Object L$1;
                                        Object L$2;
                                        Object L$3;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(spj spjVar) {
                                            super(spjVar);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return AnonymousClass2.this.emit(null, this);
                                        }
                                    }

                                    public AnonymousClass2(lsr lsrVar) {
                                        this.b = lsrVar;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                                    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                                    @Override // xsna.lsr
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, spj spjVar) {
                                        AnonymousClass1 anonymousClass1;
                                        int i;
                                        if (spjVar instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) spjVar;
                                            int i2 = anonymousClass1.label;
                                            if ((i2 & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                                Object obj2 = anonymousClass1.result;
                                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                i = anonymousClass1.label;
                                                if (i != 0) {
                                                    kotlin.a.a(obj2);
                                                    if (obj instanceof smk) {
                                                        anonymousClass1.L$0 = null;
                                                        anonymousClass1.L$1 = null;
                                                        anonymousClass1.L$2 = null;
                                                        anonymousClass1.L$3 = null;
                                                        anonymousClass1.I$0 = 0;
                                                        anonymousClass1.label = 1;
                                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    kotlin.a.a(obj2);
                                                }
                                                return s3q0.a;
                                            }
                                        }
                                        anonymousClass1 = new AnonymousClass1(spjVar);
                                        Object obj22 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                        }
                                        return s3q0.a;
                                    }
                                }

                                @Override // xsna.ksr
                                public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
                                    Object collect = nb9.this.collect(new AnonymousClass2(lsrVar), spjVar);
                                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                                }
                            });
                            aVar2.R(x3);
                        }
                        ksr ksrVar = ((a1q) x3).a;
                        k2a k2aVar = CatalogLegacyBlockImpl.this.f;
                        boolean z2 = (i4 & 14) == 4;
                        Object x4 = aVar2.x();
                        if (z2 || x4 == c0012a) {
                            CatalogLegacyBlockImpl.c cVar = new CatalogLegacyBlockImpl.c(1, z37Var, z37.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0);
                            aVar2.R(cVar);
                            x4 = cVar;
                        }
                        k2aVar.a(zfp.a, r2aVar, (izs) ((fcy) x4), ksrVar, q630.a.a, aVar2, (i4 & 112) | 27654);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            w69Var = new w69(this, i, 1);
            s.d = w69Var;
        }
    }

    @Override // xsna.e8a
    public final void b(UIBlock uIBlock) {
        CatalogBlockState a2 = this.c.a(this.a, uIBlock);
        if (a2 != null) {
            mm50<CatalogBlockState, f8a, r1a> mm50Var = this.h;
            if (mm50Var != null) {
                mm50Var.b(new f8a.b(a2));
                return;
            }
            s5 s5Var = new s5(a2, 16);
            final l8a l8aVar = this.b;
            final t1a<? super CatalogBlockState> t1aVar = this.d;
            final g8a g8aVar = this.g;
            this.h = up2.d(s5Var, new wb0() { // from class: xsna.p8a
                @Override // xsna.izs
                /* renamed from: j */
                public final qj50 invoke(sj50 sj50Var) {
                    return new k8a(l8a.this, t1aVar, g8aVar, sj50Var);
                }
            }, svj.b);
        }
    }

    @Override // xsna.e8a
    public final void destroy() {
        mm50<CatalogBlockState, f8a, r1a> mm50Var = this.h;
        if (mm50Var != null) {
            mm50Var.clear();
        }
        this.h = null;
    }

    @Override // xsna.e8a
    public final CatalogBlockState getCurrentState() {
        mm50<CatalogBlockState, f8a, r1a> mm50Var = this.h;
        if (mm50Var != null) {
            return mm50Var.getCurrentState();
        }
        return null;
    }
}
