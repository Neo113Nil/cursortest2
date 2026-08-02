package com.vk.push.pushsdk.connection;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.vk.push.common.Logger;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.h7g0;
import xsna.ksr;
import xsna.lsr;
import xsna.mk70;
import xsna.nk70;
import xsna.ok70;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.tk70;
import xsna.tle0;
import xsna.wzs;
import xsna.yvj;

/* compiled from: NotifierConnectionComponent.kt */
@b6l(c = "com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1", f = "NotifierConnectionComponent.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class NotifierConnectionComponent$startConnection$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ok70 this$0;

    /* compiled from: NotifierConnectionComponent.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ok70 b;

        /* compiled from: NotifierConnectionComponent.kt */
        @b6l(c = "com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$2", f = "NotifierConnectionComponent.kt", l = {37, 40}, m = "emit")
        /* renamed from: com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$a$a, reason: collision with other inner class name */
        public static final class C1733a extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1733a(a<? super T> aVar, spj<? super C1733a> spjVar) {
                super(spjVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public a(ok70 ok70Var) {
            this.b = ok70Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ca, code lost:
        
            if (r0.a() == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
        
            r2.L$0 = r14;
            r2.L$1 = r0;
            r2.L$2 = null;
            r2.L$3 = null;
            r2.label = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
        
            if (xsna.qsl.b(100, r2) != r1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
        
            r13 = r14;
            r14 = r0;
            r0 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
        
            r13 = r14;
            r14 = r0;
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c6 A[EDGE_INSN: B:31:0x00c6->B:32:0x00c6 BREAK  A[LOOP:0: B:15:0x0078->B:27:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.lsr
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<tle0> list, spj<? super s3q0> spjVar) {
            C1733a c1733a;
            int i;
            h7g0 h7g0Var;
            a<T> aVar;
            a<T> aVar2;
            Iterator it;
            ok70 ok70Var;
            C1733a c1733a2;
            h7g0 h7g0Var2;
            Object obj;
            if (spjVar instanceof C1733a) {
                c1733a = (C1733a) spjVar;
                int i2 = c1733a.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1733a.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = c1733a.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c1733a.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        h7g0Var = new h7g0(list, 4);
                        aVar = this;
                    } else {
                        if (i == 1) {
                            it = (Iterator) c1733a.L$3;
                            ok70 ok70Var2 = (ok70) c1733a.L$2;
                            h7g0 h7g0Var3 = (h7g0) c1733a.L$1;
                            a<T> aVar3 = (a) c1733a.L$0;
                            kotlin.a.a(obj2);
                            c1733a2 = c1733a;
                            h7g0Var2 = h7g0Var3;
                            ok70Var = ok70Var2;
                            aVar2 = aVar3;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                tle0 tle0Var = (tle0) it.next();
                                c1733a2.L$0 = aVar2;
                                c1733a2.L$1 = h7g0Var2;
                                c1733a2.L$2 = ok70Var;
                                c1733a2.L$3 = it;
                                c1733a2.label = 1;
                                tk70 tk70Var = ok70Var.b;
                                Logger logger = ok70Var.e;
                                Long l = tle0Var.c;
                                String str = tle0Var.b;
                                if (l == null) {
                                    Logger.DefaultImpls.debug$default(logger, "Add push token to connect and subscribe", null, 2, null);
                                    tk70Var.b(str, new mk70(ok70Var));
                                    obj = ok70Var.a.f(str, c1733a2);
                                    if (obj != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        obj = s3q0.a;
                                    }
                                } else {
                                    Logger.DefaultImpls.debug$default(logger, "Remove push token from connect", null, 2, null);
                                    tk70Var.a(str, new nk70(ok70Var));
                                    obj = s3q0.a;
                                }
                                if (obj == coroutineSingletons) {
                                    break;
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h7g0 h7g0Var4 = (h7g0) c1733a.L$1;
                        a<T> aVar4 = (a) c1733a.L$0;
                        kotlin.a.a(obj2);
                        h7g0Var = h7g0Var4;
                        aVar = aVar4;
                    }
                    if (h7g0Var.a()) {
                        return s3q0.a;
                    }
                    ArrayList b = h7g0Var.b();
                    ok70Var = aVar.b;
                    h7g0 h7g0Var5 = h7g0Var;
                    aVar2 = aVar;
                    it = b.iterator();
                    c1733a2 = c1733a;
                    h7g0Var2 = h7g0Var5;
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            c1733a = new C1733a(this, spjVar);
            Object obj22 = c1733a.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = c1733a.label;
            if (i != 0) {
            }
            if (h7g0Var.a()) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifierConnectionComponent$startConnection$1(ok70 ok70Var, spj<? super NotifierConnectionComponent$startConnection$1> spjVar) {
        super(2, spjVar);
        this.this$0 = ok70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new NotifierConnectionComponent$startConnection$1(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((NotifierConnectionComponent$startConnection$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final FlowUtil$createFlow$$inlined$map$1 j = this.this$0.c.j();
            ksr l = rsr.l(new ksr<List<? extends tle0>>() { // from class: com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements lsr {
                    public final /* synthetic */ lsr b;

                    /* compiled from: Emitters.kt */
                    @b6l(c = "com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$invokeSuspend$$inlined$filter$1$2", f = "NotifierConnectionComponent.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    /* renamed from: com.vk.push.pushsdk.connection.NotifierConnectionComponent$startConnection$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
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

                    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
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
                                    a.a(obj2);
                                    if (!((List) obj).isEmpty()) {
                                        anonymousClass1.label = 1;
                                        if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    a.a(obj2);
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
                public final Object collect(lsr<? super List<? extends tle0>> lsrVar, spj spjVar) {
                    Object collect = ksr.this.collect(new AnonymousClass2(lsrVar), spjVar);
                    return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                }
            });
            a aVar = new a(this.this$0);
            this.label = 1;
            if (l.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
