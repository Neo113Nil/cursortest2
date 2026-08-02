package com.vk.movika.sdk.base.presenter;

import com.vk.movika.sdk.base.logic.dto.a;
import com.vk.movika.sdk.base.logic.dto.c;
import com.vk.movika.sdk.base.logic.dto.d;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.m;
import com.vk.movika.sdk.base.model.o;
import com.vk.movika.sdk.base.model.s;
import com.vk.movika.sdk.base.presenter.d;
import com.vk.movika.sdk.base.ui.l0;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
import xsna.b6l;
import xsna.c5g;
import xsna.e43;
import xsna.epx;
import xsna.izg0;
import xsna.izi0;
import xsna.ksr;
import xsna.lsr;
import xsna.ozl;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yzs;

@ozl
/* loaded from: classes3.dex */
public final class a {
    public final boolean a;
    public final com.vk.movika.sdk.base.logic.e b;

    public final class e implements ksr<d.C1312d<d.b>> {
        public final /* synthetic */ izg0 b;

        /* renamed from: com.vk.movika.sdk.base.presenter.a$e$a, reason: collision with other inner class name */
        public static final class C1306a<T> implements lsr {
            public final /* synthetic */ lsr b;

            @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$$inlined$filter$1$2", f = "GamePresenterImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "emit")
            /* renamed from: com.vk.movika.sdk.base.presenter.a$e$a$a, reason: collision with other inner class name */
            public static final class C1307a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;

                public C1307a(spj spjVar) {
                    super(spjVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1306a.this.emit(null, this);
                }
            }

            public C1306a(lsr lsrVar) {
                this.b = lsrVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, spj spjVar) {
                C1307a c1307a;
                int i;
                if (spjVar instanceof C1307a) {
                    c1307a = (C1307a) spjVar;
                    int i2 = c1307a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1307a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1307a.a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c1307a.b;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            if (!((d.b) ((d.C1312d) obj).b).b.isEmpty()) {
                                c1307a.b = 1;
                                if (this.b.emit(obj, c1307a) == coroutineSingletons) {
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
                c1307a = new C1307a(spjVar);
                Object obj22 = c1307a.a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c1307a.b;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        public e(izg0 izg0Var) {
            this.b = izg0Var;
        }

        @Override // xsna.ksr
        public final Object collect(lsr<? super d.C1312d<d.b>> lsrVar, spj spjVar) {
            Object collect = this.b.collect(new C1306a(lsrVar), spjVar);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
        }
    }

    public final class f implements ksr<d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>>> {
        public final /* synthetic */ g b;
        public final /* synthetic */ d c;

        /* renamed from: com.vk.movika.sdk.base.presenter.a$f$a, reason: collision with other inner class name */
        public static final class C1308a<T> implements lsr {
            public final /* synthetic */ lsr b;
            public final /* synthetic */ d c;

            @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$$inlined$map$1$2", f = "GamePresenterImpl.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "emit")
            /* renamed from: com.vk.movika.sdk.base.presenter.a$f$a$a, reason: collision with other inner class name */
            public static final class C1309a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;

                public C1309a(spj spjVar) {
                    super(spjVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1308a.this.emit(null, this);
                }
            }

            public C1308a(lsr lsrVar, d dVar) {
                this.b = lsrVar;
                this.c = dVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, spj spjVar) {
                C1309a c1309a;
                int i;
                List singletonList;
                if (spjVar instanceof C1309a) {
                    c1309a = (C1309a) spjVar;
                    int i2 = c1309a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1309a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1309a.a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c1309a.b;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            d.C1312d c1312d = (d.C1312d) obj;
                            com.vk.movika.sdk.base.logic.dto.c cVar = (com.vk.movika.sdk.base.logic.dto.c) c1312d.b;
                            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                                com.vk.movika.sdk.utils.c.a(this.c, "GamePresenterImpl");
                                Objects.toString(cVar);
                            }
                            s sVar = c1312d.a;
                            if (cVar instanceof c.f) {
                                singletonList = Collections.singletonList(new a.AbstractC1294a.f(((c.f) cVar).b));
                            } else if (cVar instanceof c.h) {
                                c.h hVar = (c.h) cVar;
                                Long l = hVar.b;
                                singletonList = l != null ? e43.l(new a.AbstractC1294a.l(l.longValue()), new a.b.d(hVar.b)) : Collections.singletonList(new a.b.d(null));
                            } else if (cVar instanceof c.g) {
                                c.g gVar = (c.g) cVar;
                                Long l2 = gVar.b;
                                singletonList = l2 != null ? e43.l(new a.AbstractC1294a.l(l2.longValue()), new a.b.c(gVar.b)) : Collections.singletonList(new a.b.c(null));
                            } else if (cVar instanceof c.i) {
                                c.i iVar = (c.i) cVar;
                                singletonList = Collections.singletonList(new a.AbstractC1294a.g(iVar.b, iVar.c));
                            } else if (cVar instanceof c.j) {
                                ((c.j) cVar).getClass();
                                singletonList = Collections.singletonList(new a.AbstractC1294a.h());
                            } else if (cVar instanceof c.k) {
                                ((c.k) cVar).getClass();
                                singletonList = Collections.singletonList(new a.AbstractC1294a.i());
                            } else if (cVar instanceof c.e) {
                                c.e eVar = (c.e) cVar;
                                a aVar = eVar.c;
                                singletonList = e43.l(new a.AbstractC1294a.e(aVar != null ? aVar.b : null, eVar.d, true, eVar.e, eVar.f), (aVar == null || !aVar.a) ? new a.b.d(null) : new a.b.c(null), new a.b.e(eVar.g));
                            } else if (cVar instanceof c.n) {
                                c.n nVar = (c.n) cVar;
                                singletonList = Collections.singletonList(new a.AbstractC1294a.k(nVar.b, nVar.c));
                            } else if (cVar instanceof c.d) {
                                Chapter chapter = ((c.d) cVar).b;
                                singletonList = Collections.singletonList(new a.AbstractC1294a.d("EndAllChapters"));
                            } else if (cVar instanceof c.b) {
                                singletonList = Collections.singletonList(new a.AbstractC1294a.b(((c.b) cVar).b));
                            } else if (cVar instanceof c.C1298c) {
                                singletonList = Collections.singletonList(new a.AbstractC1294a.c(((c.C1298c) cVar).b));
                            } else if (cVar instanceof c.o) {
                                singletonList = Collections.singletonList(new a.AbstractC1294a.l(((c.o) cVar).b));
                            } else if (cVar instanceof c.a) {
                                ((c.a) cVar).getClass();
                                singletonList = Collections.singletonList(new a.AbstractC1294a.C1295a());
                            } else if (cVar instanceof c.m) {
                                singletonList = Collections.singletonList(new a.b.e(((c.m) cVar).b));
                            } else {
                                if (!(cVar instanceof c.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                singletonList = Collections.singletonList(new a.AbstractC1294a.j(((c.l) cVar).b));
                            }
                            d.C1312d c1312d2 = new d.C1312d(sVar, singletonList);
                            c1309a.b = 1;
                            if (this.b.emit(c1312d2, c1309a) == coroutineSingletons) {
                                return coroutineSingletons;
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
                c1309a = new C1309a(spjVar);
                Object obj22 = c1309a.a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c1309a.b;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        public f(g gVar, d dVar) {
            this.b = gVar;
            this.c = dVar;
        }

        @Override // xsna.ksr
        public final Object collect(lsr<? super d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>>> lsrVar, spj spjVar) {
            Object collect = this.b.collect(new C1308a(lsrVar, this.c), spjVar);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
        }
    }

    public final class g implements ksr<d.C1312d<com.vk.movika.sdk.base.logic.dto.c>> {
        public final /* synthetic */ FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 b;
        public final /* synthetic */ d c;

        /* renamed from: com.vk.movika.sdk.base.presenter.a$g$a, reason: collision with other inner class name */
        public static final class C1310a<T> implements lsr {
            public final /* synthetic */ lsr b;

            @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$$inlined$mapNotNull$1$2", f = "GamePresenterImpl.kt", l = {Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "emit")
            /* renamed from: com.vk.movika.sdk.base.presenter.a$g$a$a, reason: collision with other inner class name */
            public static final class C1311a extends ContinuationImpl {
                public /* synthetic */ Object a;
                public int b;

                public C1311a(spj spjVar) {
                    super(spjVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C1310a.this.emit(null, this);
                }
            }

            public C1310a(lsr lsrVar, d dVar) {
                this.b = lsrVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // xsna.lsr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, spj spjVar) {
                C1311a c1311a;
                int i;
                com.vk.movika.sdk.base.logic.dto.c cVar;
                if (spjVar instanceof C1311a) {
                    c1311a = (C1311a) spjVar;
                    int i2 = c1311a.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1311a.b = i2 - Integer.MIN_VALUE;
                        Object obj2 = c1311a.a;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c1311a.b;
                        if (i != 0) {
                            kotlin.a.a(obj2);
                            d.c cVar2 = (d.c) obj;
                            s sVar = cVar2.a;
                            d.C1312d c1312d = (sVar == null || (cVar = cVar2.b) == null) ? null : new d.C1312d(sVar, cVar);
                            if (c1312d != null) {
                                c1311a.b = 1;
                                if (this.b.emit(c1312d, c1311a) == coroutineSingletons) {
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
                c1311a = new C1311a(spjVar);
                Object obj22 = c1311a.a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c1311a.b;
                if (i != 0) {
                }
                return s3q0.a;
            }
        }

        public g(FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1, d dVar) {
            this.b = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
            this.c = dVar;
        }

        @Override // xsna.ksr
        public final Object collect(lsr<? super d.C1312d<com.vk.movika.sdk.base.logic.dto.c>> lsrVar, spj spjVar) {
            Object collect = this.b.collect(new C1310a(lsrVar, this.c), spjVar);
            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
        }
    }

    @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$2", f = "GamePresenterImpl.kt", l = {}, m = "invokeSuspend")
    public final class h extends SuspendLambda implements yzs<d.c, com.vk.movika.sdk.base.logic.dto.c, spj<? super d.c>, Object> {
        public /* synthetic */ d.c a;
        public /* synthetic */ com.vk.movika.sdk.base.logic.dto.c b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(d dVar, spj<? super h> spjVar) {
            super(3, spjVar);
            this.c = dVar;
        }

        @Override // xsna.yzs
        public final Object invoke(d.c cVar, com.vk.movika.sdk.base.logic.dto.c cVar2, spj<? super d.c> spjVar) {
            h hVar = new h(this.c, spjVar);
            hVar.a = cVar;
            hVar.b = cVar2;
            return hVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            kotlin.a.a(obj);
            d.c cVar = this.a;
            com.vk.movika.sdk.base.logic.dto.c cVar2 = this.b;
            d dVar = this.c;
            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(dVar, "GamePresenterImpl");
                Objects.toString(cVar2);
            }
            this.c.getClass();
            if (!(cVar2 instanceof c.e)) {
                return new d.c(cVar.a, cVar2);
            }
            s sVar = ((c.e) cVar2).b;
            cVar.getClass();
            return new d.c(sVar, cVar2);
        }
    }

    public final /* synthetic */ class i extends AdaptedFunctionReference implements wzs<d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>>, spj<? super d.C1312d<d.b>>, Object> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.wzs
        public final Object invoke(d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>> c1312d, spj<? super d.C1312d<d.b>> spjVar) {
            d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>> c1312d2 = c1312d;
            d dVar = (d) this.receiver;
            dVar.getClass();
            return dVar.b(new d.C1312d(c1312d2.a, new d.b(new com.vk.movika.sdk.base.logic.e(null, null, null, null, null, 0L, null, false, 2047), EmptyList.b)), c1312d2);
        }
    }

    @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$6", f = "GamePresenterImpl.kt", l = {}, m = "invokeSuspend")
    public final class j extends SuspendLambda implements yzs<d.C1312d<d.b>, d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>>, spj<? super d.C1312d<d.b>>, Object> {
        public /* synthetic */ d.C1312d a;
        public /* synthetic */ d.C1312d b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(d dVar, spj<? super j> spjVar) {
            super(3, spjVar);
            this.c = dVar;
        }

        @Override // xsna.yzs
        public final Object invoke(d.C1312d<d.b> c1312d, d.C1312d<List<? extends com.vk.movika.sdk.base.logic.dto.a>> c1312d2, spj<? super d.C1312d<d.b>> spjVar) {
            j jVar = new j(this.c, spjVar);
            jVar.a = c1312d;
            jVar.b = c1312d2;
            return jVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            kotlin.a.a(obj);
            return this.c.b(this.a, this.b);
        }
    }

    @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$8", f = "GamePresenterImpl.kt", l = {}, m = "invokeSuspend")
    public final class k extends SuspendLambda implements yzs<l0, d.C1312d<d.b>, spj<? super l0>, Object> {
        public /* synthetic */ l0 a;
        public /* synthetic */ d.C1312d b;
        public final /* synthetic */ d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(d dVar, spj<? super k> spjVar) {
            super(3, spjVar);
            this.c = dVar;
        }

        @Override // xsna.yzs
        public final Object invoke(l0 l0Var, d.C1312d<d.b> c1312d, spj<? super l0> spjVar) {
            k kVar = new k(this.c, spjVar);
            kVar.a = l0Var;
            kVar.b = c1312d;
            return kVar.invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v20, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r9v21 */
        /* JADX WARN: Type inference failed for: r9v22, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            s sVar;
            s sVar2;
            com.vk.movika.sdk.base.logic.dto.d dVar;
            l0 l0Var;
            l0 l0Var2;
            l0 l0Var3;
            l0 a;
            Object obj2;
            Object obj3;
            List list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            kotlin.a.a(obj);
            l0 l0Var4 = this.a;
            d.C1312d c1312d = this.b;
            d dVar2 = this.c;
            s sVar3 = c1312d.a;
            List<com.vk.movika.sdk.base.logic.dto.d> list2 = ((d.b) c1312d.b).b;
            dVar2.getClass();
            if (com.vk.movika.sdk.utils.f.b.b - 1 <= 0) {
                com.vk.movika.sdk.utils.c.a(dVar2, "GamePresenterImpl");
                Objects.toString(list2);
            }
            s sVar4 = sVar3;
            l0 a2 = l0.a(l0Var4, null, null, false, null, null, 0L, false, null, new l0.a(0), false, false, false, 15359);
            com.vk.movika.sdk.utils.c.b(a2, "GamePresenterImpl", new c(0, sVar4, list2));
            if (sVar4 == null || list2.isEmpty()) {
                sVar = sVar4;
            } else {
                l0 l0Var5 = a2;
                for (com.vk.movika.sdk.base.logic.dto.d dVar3 : list2) {
                    Chapter chapter = l0Var5.c;
                    if (dVar3 instanceof d.a.e) {
                        com.vk.movika.sdk.base.logic.e eVar = ((d.a.e) dVar3).a;
                        s sVar5 = sVar4;
                        dVar = dVar3;
                        sVar2 = sVar5;
                        l0Var3 = new l0(sVar5, sVar4.a(eVar.b), sVar4.a(eVar.g), l0Var5.d, com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar, sVar4), eVar.h, l0.a.a(l0Var5.k, false, false, null, null, null, null, null, 8189), 15200);
                        l0Var = l0Var5;
                    } else {
                        sVar2 = sVar4;
                        dVar = dVar3;
                        if (dVar instanceof d.a.f) {
                            d.a.f fVar = (d.a.f) dVar;
                            if (!l0Var5.m || fVar.e) {
                                l0Var = l0Var5;
                                com.vk.movika.sdk.base.logic.e eVar2 = fVar.a;
                                List<com.vk.movika.sdk.base.logic.processor.e> list3 = fVar.c;
                                ArrayList c = com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar2, sVar2);
                                Iterator it = list3.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (((com.vk.movika.sdk.base.logic.processor.e) obj2) instanceof e.d) {
                                        break;
                                    }
                                }
                                if (!(obj2 instanceof e.d)) {
                                    obj2 = null;
                                }
                                e.d dVar4 = (e.d) obj2;
                                String str = dVar4 != null ? dVar4.a : null;
                                boolean z = eVar2.i;
                                Chapter a3 = sVar2.a(eVar2.g);
                                o oVar = eVar2.j;
                                Iterator it2 = list3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = it2.next();
                                    if (((com.vk.movika.sdk.base.logic.processor.e) obj3) instanceof e.h) {
                                        break;
                                    }
                                }
                                if (!(obj3 instanceof e.h)) {
                                    obj3 = null;
                                }
                                e.h hVar = (e.h) obj3;
                                Boolean valueOf = hVar != null ? Boolean.valueOf(hVar.b) : null;
                                Chapter chapter2 = a3 == null ? chapter : a3;
                                l0.a aVar = l0Var.k;
                                a = l0.a(l0Var, null, chapter2, false, c, null, 0L, z, oVar, l0.a.a(aVar, valueOf != null ? valueOf.booleanValue() : aVar.c, false, null, null, fVar.d, null, str, 3067), false, false, false, 14571);
                                l0Var3 = a;
                            } else {
                                l0Var2 = l0Var5;
                                a = l0.a(l0Var2, null, null, false, null, null, 0L, false, null, l0.a.a(l0Var5.k, false, false, null, null, null, fVar.d, null, 6143), false, false, false, 15359);
                                l0Var = l0Var2;
                                l0Var3 = a;
                            }
                        } else {
                            l0Var = l0Var5;
                            if (dVar instanceof d.a.b) {
                                d.a.b bVar = (d.a.b) dVar;
                                a = l0.a(l0Var, null, null, false, com.vk.movika.sdk.base.logic.processor.actions.a.c(bVar.a, sVar2), null, 0L, false, null, l0.a.a(l0Var.k, false, false, Collections.singletonList(bVar.b), null, null, null, null, 7935), false, false, false, 15343);
                            } else if (dVar instanceof d.a.k) {
                                d.a.k kVar = (d.a.k) dVar;
                                com.vk.movika.sdk.base.logic.e eVar3 = kVar.a;
                                Chapter a4 = sVar2.a(kVar.b);
                                boolean z2 = chapter == null && a4 != null && m.a(a4) == null && com.vk.movika.sdk.base.utils.d.b(a4.d).isEmpty() && a4.e.isEmpty();
                                a = chapter != null ? l0.a(l0Var, sVar2.a(eVar3.b), sVar2.a(eVar3.g), false, com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar3, sVar2), null, 0L, false, null, l0.a.a(l0Var.k, false, z2, null, null, null, null, null, 8157), false, false, eVar3.k, 7017) : l0.a(l0Var, null, null, false, null, null, 0L, false, null, l0.a.a(l0Var.k, false, z2, null, null, null, null, null, 8159), false, false, eVar3.k, 7167);
                            } else if (dVar instanceof d.a.C1300d) {
                                a = l0.a(l0Var, null, null, false, null, null, 0L, false, null, l0.a.a(l0Var.k, false, true, null, null, null, null, null, 8031), false, false, false, 15355);
                            } else {
                                l0Var2 = l0Var;
                                if (dVar instanceof d.a.l) {
                                    a = l0.a(l0Var2, null, null, false, null, null, ((d.a.l) dVar).a.h, false, null, null, false, false, false, 16255);
                                } else {
                                    l0Var = l0Var2;
                                    if (dVar instanceof d.a.C1299a) {
                                        ((d.a.C1299a) dVar).getClass();
                                        a = l0.a(l0Var, null, sVar2.a(null), false, EmptyList.b, null, 0L, false, null, l0.a.a(l0Var.k, true, false, null, null, null, null, null, 8187), false, false, false, 15083);
                                    } else if (dVar instanceof d.a.g) {
                                        d.a.g gVar = (d.a.g) dVar;
                                        com.vk.movika.sdk.base.logic.e eVar4 = gVar.a;
                                        if (gVar.b) {
                                            a = l0.a(l0Var, null, null, false, com.vk.movika.sdk.base.logic.processor.actions.a.c(eVar4, sVar2), null, eVar4.h, false, null, l0.a.a(l0Var.k, false, false, null, null, null, null, null, 8175), false, false, false, 15215);
                                        }
                                        l0Var3 = l0Var;
                                    } else if (dVar instanceof d.a.h) {
                                        if (((d.a.h) dVar).b) {
                                            a = l0.a(l0Var, null, null, false, EmptyList.b, null, 0L, false, null, l0.a.a(l0Var.k, false, false, null, null, null, null, null, 8183), false, false, false, 15215);
                                        }
                                        l0Var3 = l0Var;
                                    } else if (dVar instanceof d.a.i) {
                                        d.a.i iVar = (d.a.i) dVar;
                                        String str2 = iVar.b;
                                        if (str2 != null) {
                                            a = l0.a(l0Var, null, sVar2.a(str2), false, EmptyList.b, null, 0L, false, null, l0.a.a(l0Var.k, true, false, null, null, null, null, null, 8187), false, false, iVar.a.k, 7147);
                                        }
                                        l0Var3 = l0Var;
                                    } else if (dVar instanceof d.a.j) {
                                        a = l0.a(l0Var, null, null, false, null, null, 0L, false, ((d.a.j) dVar).b, l0.a.a(l0Var.k, false, false, null, null, null, null, null, 8190), false, false, false, 14847);
                                    } else if (dVar instanceof d.b.a) {
                                        d.b.a aVar2 = (d.b.a) dVar;
                                        boolean z3 = aVar2.a;
                                        Long l = aVar2.b;
                                        a = l0.a(l0Var, null, null, z3, null, null, l != null ? l.longValue() : l0Var.h, false, null, null, false, aVar2.c, false, 12151);
                                    } else {
                                        l0Var2 = l0Var;
                                        if (dVar instanceof d.b.C1301b) {
                                            a = l0.a(l0Var2, null, null, false, null, null, 0L, false, null, null, ((d.b.C1301b) dVar).a, false, false, 14335);
                                        } else {
                                            l0Var = l0Var2;
                                            l0Var3 = null;
                                        }
                                    }
                                }
                                l0Var = l0Var2;
                            }
                            l0Var3 = a;
                        }
                    }
                    if (l0Var3 == null) {
                        l0Var5 = null;
                    } else if (dVar instanceof d.a) {
                        com.vk.movika.sdk.base.logic.e eVar5 = ((d.a) dVar).a;
                        o oVar2 = eVar5.j;
                        boolean z4 = eVar5.i;
                        Chapter a5 = sVar2.a(eVar5.b);
                        if (a5 != null) {
                            ArrayList arrayList = a5.c;
                            list = new ArrayList(c5g.u(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                com.vk.movika.sdk.base.model.h hVar2 = (com.vk.movika.sdk.base.model.h) it3.next();
                                list.add(new com.vk.movika.sdk.base.model.i(hVar2, eVar5.f.contains(hVar2.a)));
                            }
                        } else {
                            list = EmptyList.b;
                        }
                        l0Var5 = l0.a(l0Var3, null, null, false, null, list, 0L, z4, oVar2, null, false, false, false, 15551);
                    } else {
                        l0Var5 = l0Var3;
                    }
                    if (l0Var5 == null) {
                        l0Var5 = l0Var;
                    }
                    sVar4 = sVar2;
                }
                sVar = sVar4;
                l0 l0Var6 = l0Var5;
                List<com.vk.movika.sdk.base.model.f> list4 = a2.e;
                com.vk.movika.sdk.base.ui.e eVar6 = new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.ui.e
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
                    public final Object get(Object obj4) {
                        return ((com.vk.movika.sdk.base.model.f) obj4).a;
                    }
                };
                Set a6 = com.vk.movika.sdk.utils.b.a(list4, eVar6);
                Set a7 = com.vk.movika.sdk.utils.b.a(l0Var6.e, eVar6);
                Set g = izi0.g(a7, a6);
                Set g2 = izi0.g(a6, a7);
                l0.a aVar3 = l0Var6.k;
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = g.iterator();
                while (it4.hasNext()) {
                    com.vk.movika.sdk.base.model.f b = sVar.b((String) it4.next());
                    if (b != null) {
                        arrayList2.add(b);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = g2.iterator();
                while (it5.hasNext()) {
                    com.vk.movika.sdk.base.model.f b2 = sVar.b((String) it5.next());
                    if (b2 != null) {
                        arrayList3.add(b2);
                    }
                }
                a2 = l0.a(l0Var6, null, null, false, null, null, 0L, false, null, l0.a.a(aVar3, false, false, arrayList2, arrayList3, null, null, null, 7423), false, false, false, 15359);
            }
            Chapter chapter3 = a2.b;
            l0 a8 = ((chapter3 == null || !(chapter3.e.isEmpty() ^ true)) && a2.l && a2.c == null) ? l0.a(a2, null, sVar.h, false, null, null, 0L, false, null, null, false, false, false, 16379) : a2;
            Chapter chapter4 = sVar.h;
            Chapter chapter5 = a8.b;
            boolean f = epx.f(chapter5 != null ? chapter5.a : null, chapter4.a);
            l0.a aVar4 = a8.k;
            if (aVar4.b && f && a8.h == 0) {
                return l0.a(a8, null, null, false, null, null, 0L, false, null, l0.a.a(aVar4, false, false, null, null, null, null, null, 8127), false, false, false, 15359);
            }
            return a8;
        }
    }

    @b6l(c = "com.vk.movika.sdk.base.presenter.GamePresenterImpl$process$9", f = "GamePresenterImpl.kt", l = {}, m = "invokeSuspend")
    public final class l extends SuspendLambda implements wzs<l0, spj<? super s3q0>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(d dVar, spj<? super l> spjVar) {
            super(2, spjVar);
            this.b = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            l lVar = new l(this.b, spjVar);
            lVar.a = obj;
            return lVar;
        }

        @Override // xsna.wzs
        public final Object invoke(l0 l0Var, spj<? super s3q0> spjVar) {
            l lVar = new l(this.b, spjVar);
            lVar.a = l0Var;
            return lVar.invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            kotlin.a.a(obj);
            l0 l0Var = (l0) this.a;
            d dVar = this.b;
            if (!epx.f(dVar.d, l0Var)) {
                dVar.d = l0Var;
                dVar.c = d.a(l0Var, null);
            }
            return s3q0.a;
        }
    }

    public a() {
        this(false, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && epx.f(this.b, aVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        com.vk.movika.sdk.base.logic.e eVar = this.b;
        return (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
    }

    public final String toString() {
        return "PresenterState(isPause=" + this.a + ", initGameLogicState=" + this.b + ", customHistory=null)";
    }

    public a(boolean z, com.vk.movika.sdk.base.logic.e eVar, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        eVar = (i2 & 2) != 0 ? null : eVar;
        this.a = z;
        this.b = eVar;
    }
}
