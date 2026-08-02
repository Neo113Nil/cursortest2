package com.zoho.livechat.android.modules.brand.ui.helpers;

import Ph.AbstractC1459k;
import Ph.P;
import a1.C1908a;
import android.app.Application;
import android.content.Intent;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import ie.EnumC4544a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.C5582a;
import od.w;
import og.AbstractC5891c;
import rd.C6218a;
import td.C6461a;
import ve.InterfaceC6686a;
import we.d;
import we.e;
import xe.C6822a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f42522a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f42523b = LazyKt.lazy(h.f42555d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f42524c = LazyKt.lazy(i.f42556d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f42525d = LazyKt.lazy(p.f42573d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f42526e = LazyKt.lazy(q.f42574d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f42527f = LazyKt.lazy(n.f42569d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f42528g = LazyKt.lazy(k.f42558d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f42529h = LazyKt.lazy(j.f42557d);

    /* renamed from: com.zoho.livechat.android.modules.brand.ui.helpers.a$a, reason: collision with other inner class name */
    public static final class C0608a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42530n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42531o;

        /* renamed from: p, reason: collision with root package name */
        public Object f42532p;

        /* renamed from: q, reason: collision with root package name */
        public Object f42533q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f42534r;

        /* renamed from: s, reason: collision with root package name */
        public int f42535s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f42536t;

        /* renamed from: v, reason: collision with root package name */
        public int f42538v;

        public C0608a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42536t = obj;
            this.f42538v |= Integer.MIN_VALUE;
            Object i10 = a.this.i(null, null, false, null, this);
            return i10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? i10 : Result.m146boximpl(i10);
        }
    }

    public static final class b extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f42539n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f42540o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f42540o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new b(this.f42540o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42539n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f42540o;
            if (function1 == null) {
                return null;
            }
            function1.invoke(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f42541n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f42542o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f42542o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new c(this.f42542o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42541n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f42542o;
            if (function1 == null) {
                return null;
            }
            function1.invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f42543n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f42544o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f42544o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new d(this.f42544o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42543n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f42544o;
            if (function1 == null) {
                return null;
            }
            function1.invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42545n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42546o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f42547p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f42548q;

        /* renamed from: r, reason: collision with root package name */
        public int f42549r;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42548q = obj;
            this.f42549r |= Integer.MIN_VALUE;
            Object n10 = a.n(null, null, null, false, this);
            return n10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? n10 : Result.m146boximpl(n10);
        }
    }

    public static final class f extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f42550n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f42551o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f42551o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new f(this.f42551o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f42550n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f42551o;
            if (function1 == null) {
                return null;
            }
            function1.invoke(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42552n;

        /* renamed from: p, reason: collision with root package name */
        public int f42554p;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42552n = obj;
            this.f42554p |= Integer.MIN_VALUE;
            Object j10 = a.this.j(null, null, false, null, this);
            return j10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? j10 : Result.m146boximpl(j10);
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f42555d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            return Kd.a.f6469f.a(a.f42522a.t());
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f42556d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ke.a invoke() {
            return Ke.a.f6496j.a(a.f42522a.t());
        }
    }

    public static final class j extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final j f42557d = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Re.d invoke() {
            return new Re.d(a.f42522a.y());
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f42558d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.c invoke() {
            return new Od.c(a.f42522a.u());
        }
    }

    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f42559n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6686a f42560o;

        /* renamed from: com.zoho.livechat.android.modules.brand.ui.helpers.a$l$a, reason: collision with other inner class name */
        public static final class C0609a extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f42561n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ InterfaceC6686a f42562o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ we.e f42563p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0609a(InterfaceC6686a interfaceC6686a, we.e eVar, Continuation continuation) {
                super(1, continuation);
                this.f42562o = interfaceC6686a;
                this.f42563p = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0609a(this.f42562o, this.f42563p, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42561n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f42562o.a(this.f42563p);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C0609a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC6686a interfaceC6686a, Continuation continuation) {
            super(2, continuation);
            this.f42560o = interfaceC6686a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new l(this.f42560o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((l) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r1.c(r3, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42559n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.f42522a;
                this.f42559n = 1;
                obj = aVar.C(this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C6461a c6461a = C6461a.f65810a;
            C0609a c0609a = new C0609a(this.f42560o, (we.e) obj, null);
            this.f42559n = 2;
        }
    }

    public static final class m extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42564n;

        /* renamed from: o, reason: collision with root package name */
        public Object f42565o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f42566p;

        /* renamed from: r, reason: collision with root package name */
        public int f42568r;

        public m(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42566p = obj;
            this.f42568r |= Integer.MIN_VALUE;
            return a.this.C(this);
        }
    }

    public static final class n extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final n f42569d = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.d invoke() {
            return new Od.d(a.f42522a.u());
        }
    }

    public static final class o extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f42570n;

        /* renamed from: p, reason: collision with root package name */
        public int f42572p;

        public o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42570n = obj;
            this.f42572p |= Integer.MIN_VALUE;
            return a.this.O(null, this);
        }
    }

    public static final class p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final p f42573d = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.g invoke() {
            return new Od.g(a.f42522a.u());
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final q f42574d = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.h invoke() {
            return new Od.h(a.f42522a.u());
        }
    }

    public static final class r extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f42575n;

        /* renamed from: o, reason: collision with root package name */
        public int f42576o;

        /* renamed from: p, reason: collision with root package name */
        public int f42577p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f42578q;

        /* renamed from: s, reason: collision with root package name */
        public int f42580s;

        public r(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f42578q = obj;
            this.f42580s |= Integer.MIN_VALUE;
            return a.this.P(null, this);
        }
    }

    public static final class s extends SuspendLambda implements Function2 {
        final /* synthetic */ Md.a[] $components;

        /* renamed from: n, reason: collision with root package name */
        public int f42581n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Md.a[] aVarArr, Continuation continuation) {
            super(2, continuation);
            this.$components = aVarArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s(this.$components, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((s) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42581n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = a.f42522a;
                Md.a[] aVarArr = this.$components;
                Md.a[] aVarArr2 = (Md.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                this.f42581n = 1;
                if (aVar.P(aVarArr2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class t extends SuspendLambda implements Function2 {
        final /* synthetic */ Md.a[] $components;

        /* renamed from: n, reason: collision with root package name */
        public Object f42582n;

        /* renamed from: o, reason: collision with root package name */
        public int f42583o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f42584p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Function0 f42585q;

        /* renamed from: com.zoho.livechat.android.modules.brand.ui.helpers.a$t$a, reason: collision with other inner class name */
        public static final class C0610a extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f42586n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function0 f42587o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0610a(Function0 function0, Continuation continuation) {
                super(1, continuation);
                this.f42587o = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C0610a(this.f42587o, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42586n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function0 function0 = this.f42587o;
                if (function0 == null) {
                    return null;
                }
                function0.invoke();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((C0610a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static final class b extends SuspendLambda implements Function1 {

            /* renamed from: n, reason: collision with root package name */
            public int f42588n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Function0 f42589o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function0 function0, Continuation continuation) {
                super(1, continuation);
                this.f42589o = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new b(this.f42589o, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f42588n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function0 function0 = this.f42589o;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation continuation) {
                return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Md.a[] aVarArr, boolean z10, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.$components = aVarArr;
            this.f42584p = z10;
            this.f42585q = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new t(this.$components, this.f42584p, this.f42585q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
        
            if (r10.c(r1, r9) != r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00e9, code lost:
        
            if (r10.P(r1, r9) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
        
            if (r10.c(r1, r9) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
        
            if (r10 == r0) goto L44;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List mutableList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f42583o;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                mutableList = ArraysKt.toMutableList(this.$components);
                Md.a aVar = Md.a.Chat;
                if (mutableList.contains(aVar) && !LiveChatUtil.isChatEnabled()) {
                    mutableList.remove(aVar);
                }
                Md.a aVar2 = Md.a.Call;
                if (mutableList.contains(aVar2) && !Td.e.n0()) {
                    mutableList.remove(aVar2);
                }
                if (mutableList.isEmpty()) {
                    C6461a c6461a = C6461a.f65810a;
                    C0610a c0610a = new C0610a(this.f42585q, null);
                    this.f42583o = 1;
                } else {
                    Od.g F10 = a.f42522a.F();
                    Md.a[] aVarArr = (Md.a[]) mutableList.toArray(new Md.a[0]);
                    Md.a[] aVarArr2 = (Md.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                    this.f42582n = mutableList;
                    this.f42583o = 2;
                    obj = F10.b(aVarArr2, this);
                }
                return coroutine_suspended;
            }
            if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i10 == 2) {
                mutableList = (List) this.f42582n;
                ResultKt.throwOnFailure(obj);
                C5582a c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    Application e10 = MobilistenInitProvider.INSTANCE.e();
                    Intrinsics.checkNotNull(e10);
                    C1908a b10 = C1908a.b(e10);
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "appstatus");
                    b10.d(intent);
                }
                if (this.f42584p) {
                    a aVar3 = a.f42522a;
                    Md.a[] aVarArr3 = (Md.a[]) mutableList.toArray(new Md.a[0]);
                    Md.a[] aVarArr4 = (Md.a[]) Arrays.copyOf(aVarArr3, aVarArr3.length);
                    this.f42582n = null;
                    this.f42583o = 3;
                }
                C6461a c6461a2 = C6461a.f65810a;
                b bVar = new b(this.f42585q, null);
                this.f42582n = null;
                this.f42583o = 4;
            } else if (i10 == 3) {
                ResultKt.throwOnFailure(obj);
                C6461a c6461a22 = C6461a.f65810a;
                b bVar2 = new b(this.f42585q, null);
                this.f42582n = null;
                this.f42583o = 4;
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void D(InterfaceC6686a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC1459k.d(f42522a.p(), null, null, new l(callback, null), 3, null);
    }

    public static final List E(List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            String str = wVar.f61173a;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                linkedHashMap.put(str, w.b(wVar, null, null, null, null, false, 0L, 0L, Se.a.CALL, 127, null));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            w wVar2 = (w) it2.next();
            String str2 = wVar2.f61173a;
            if (str2 != null) {
                if (linkedHashMap.containsKey(str2)) {
                    String str3 = wVar2.f61173a;
                    Intrinsics.checkNotNull(str3);
                    linkedHashMap.put(str3, w.b(wVar2, null, null, null, null, false, 0L, 0L, Se.a.CHAT_AND_CALL, 127, null));
                } else {
                    String str4 = wVar2.f61173a;
                    Intrinsics.checkNotNull(str4);
                    linkedHashMap.put(str4, w.b(wVar2, null, null, null, null, false, 0L, 0L, Se.a.CHAT, 127, null));
                }
            }
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean H() {
        boolean z10;
        if (Td.e.o0() && LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled()) {
            Channel m10 = C6822a.m();
            if (m10 != null && m10.getCallConfigurations() != null && AbstractC5891c.d(m10.getCallDepartments())) {
                Channel.LicenseInfo licenseInfo = m10.getLicenseInfo();
                if (licenseInfo != null ? Intrinsics.areEqual(licenseInfo.getAudiocall(), Boolean.TRUE) : false) {
                    Channel.PortalConfig portalConfig = m10.getPortalConfig();
                    if (Intrinsics.areEqual(portalConfig != null ? portalConfig.getAudioCall() : null, "true")) {
                        z10 = true;
                        if (!z10) {
                            return true;
                        }
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return false;
    }

    public static final boolean I() {
        return LiveChatUtil.isEmbedAllowed() && LiveChatUtil.isAppEnabled() && LiveChatUtil.isChatEnabled();
    }

    public static final boolean J(String str, String str2, boolean z10) {
        return og.i.i((Boolean) f42522a.K().a(w(str, str2, z10), str, str2, z10).b());
    }

    public static final boolean L() {
        Channel m10;
        Channel.HomepageConfigs homepageConfigs;
        List<Channel.HomepageConfigs.a> conversationMode;
        return (!H() || (m10 = C6822a.m()) == null || (homepageConfigs = m10.getHomepageConfigs()) == null || (conversationMode = homepageConfigs.getConversationMode()) == null || !conversationMode.contains(Channel.HomepageConfigs.a.Call)) ? false : true;
    }

    public static final boolean M() {
        Channel m10;
        Channel.HomepageConfigs homepageConfigs;
        List<Channel.HomepageConfigs.a> conversationMode;
        return (!LiveChatUtil.isChatEnabled() || (m10 = C6822a.m()) == null || (homepageConfigs = m10.getHomepageConfigs()) == null || (conversationMode = homepageConfigs.getConversationMode()) == null || !conversationMode.contains(Channel.HomepageConfigs.a.Chat)) ? false : true;
    }

    public static final boolean N(Md.a brandComponent) {
        Intrinsics.checkNotNullParameter(brandComponent, "brandComponent");
        return brandComponent == Md.a.Chat ? Ye.d.e(De.a.ChatsPreChatForm, true) : Ye.d.e(De.a.CallsPreChatForm, true);
    }

    public static final void Q(Md.a... components) {
        Intrinsics.checkNotNullParameter(components, "components");
        AbstractC1459k.d(f42522a.p(), null, null, new s(components, null), 3, null);
    }

    public static final void R(Md.a... components) {
        Intrinsics.checkNotNullParameter(components, "components");
        T(components, false, null, 6, null);
    }

    public static final void S(Md.a[] components, boolean z10, Function0 function0) {
        Intrinsics.checkNotNullParameter(components, "components");
        AbstractC1459k.d(f42522a.p(), null, null, new t(components, z10, function0, null), 3, null);
    }

    public static /* synthetic */ void T(Md.a[] aVarArr, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        S(aVarArr, z10, function0);
    }

    public static /* synthetic */ Object k(a aVar, Pe.a aVar2, String str, boolean z10, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            function1 = null;
        }
        return aVar.j(aVar2, str, z10, function1, continuation);
    }

    public static final List l(String str) {
        return Td.e.P(str, false, 2, null);
    }

    public static final boolean m(boolean z10, String str, EnumC4544a enumC4544a) {
        Form form = (Form) f42522a.B().a(enumC4544a).b();
        List<Form.Message> messages = form != null ? form.getMessages() : null;
        if (messages == null || messages.size() != 1) {
            return false;
        }
        Form.Message.Meta meta = ((Form.Message) CollectionsKt.first((List) messages)).getMeta();
        if (!Intrinsics.areEqual(meta != null ? meta.getFieldName() : null, "department")) {
            return false;
        }
        if (enumC4544a == EnumC4544a.CallOnline || enumC4544a == EnumC4544a.CallOffline) {
            if (l(str).size() != 1) {
                return false;
            }
        } else if (AbstractC3945n.i(z10, null, str).size() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Function1 function1, EnumC4544a enumC4544a, String str, boolean z10, Continuation continuation) {
        e eVar;
        int i10;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f42549r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f42549r = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f42548q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f42549r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    C6461a c6461a = C6461a.f65810a;
                    f fVar = new f(function1, null);
                    eVar.f42545n = enumC4544a;
                    eVar.f42546o = str;
                    eVar.f42547p = z10;
                    eVar.f42549r = 1;
                    if (c6461a.c(fVar, eVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z10 = eVar.f42547p;
                    str = (String) eVar.f42546o;
                    enumC4544a = (EnumC4544a) eVar.f42545n;
                    ResultKt.throwOnFailure(obj);
                }
                if (C6822a.B(enumC4544a, str, null, z10)) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m147constructorimpl(Boxing.boxBoolean(true));
                }
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m147constructorimpl(Boxing.boxBoolean(false));
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f42548q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f42549r;
        if (i10 != 0) {
        }
        if (C6822a.B(enumC4544a, str, null, z10)) {
        }
    }

    public static final boolean o(Md.a brandComponent) {
        Intrinsics.checkNotNullParameter(brandComponent, "brandComponent");
        return brandComponent == Md.a.Chat ? Ye.d.e(De.a.ChatComponentQueuePosition, true) : Ye.d.e(De.a.CallsQueuePosition, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r3 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final EnumC4544a r(boolean z10, boolean z11, List list) {
        if (z10) {
            if (!LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline()) {
                if (list != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                }
                list = Td.e.b0(false, 1, null);
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((Channel.Department) it.next()).isOnline(), Boolean.TRUE)) {
                            return EnumC4544a.CallOnline;
                        }
                    }
                }
            }
            return EnumC4544a.CallOffline;
        }
        if (!LiveChatUtil.isSDKDisabledWithOutsideBusinessHoursAndOffline()) {
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
            }
            list = AbstractC3945n.i(z11, null, null);
            Intrinsics.checkNotNull(list);
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((Channel.Department) it2.next()).isOnline(), Boolean.TRUE)) {
                        return EnumC4544a.Online;
                    }
                }
            }
        }
        return EnumC4544a.Offline;
    }

    public static /* synthetic */ EnumC4544a s(boolean z10, boolean z11, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        return r(z10, z11, list);
    }

    public static final EnumC4544a w(String str, String str2, boolean z10) {
        return f42522a.q(str, AbstractC3945n.e(str2), z10);
    }

    public static final Se.a x() {
        boolean L10 = L();
        boolean M10 = M();
        if (M10 && L10) {
            return Se.a.CHAT_AND_CALL;
        }
        if (M10) {
            return Se.a.CHAT;
        }
        if (L10) {
            return Se.a.CALL;
        }
        return null;
    }

    public static final we.d z() {
        if (!C6218a.c0()) {
            return we.d.f67651e;
        }
        if (Ye.a.l()) {
            return we.d.f67658i;
        }
        if (!LiveChatUtil.isEmbedAllowed()) {
            return we.d.f67659j;
        }
        if (MobilistenUtil.j() || !Q.w()) {
            return we.d.f67653f;
        }
        if (LiveChatUtil.isHideOutsideBusinessHours()) {
            return we.d.f67657h;
        }
        if (!LiveChatUtil.isAppEnabled()) {
            return we.d.f67660k;
        }
        if (LiveChatUtil.isHideWhenOffline()) {
            return we.d.f67655g;
        }
        return null;
    }

    public final Re.d A() {
        return (Re.d) f42529h.getValue();
    }

    public final Od.c B() {
        return (Od.c) f42528g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(Continuation continuation) {
        m mVar;
        int i10;
        List list;
        Channel m10;
        a aVar;
        C5582a c5582a;
        C5582a c5582a2;
        C5582a c5582a3;
        Channel channel;
        List d10;
        List<Channel.Department> chatDepartments;
        List<Channel.Department> callDepartments;
        String str;
        Integer b10;
        C5582a.b c10;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i11 = mVar.f42568r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f42568r = i11 - Integer.MIN_VALUE;
                Object obj = mVar.f42566p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = mVar.f42568r;
                list = null;
                C5582a.b c11 = null;
                list = null;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    m10 = C6822a.m();
                    we.d z10 = z();
                    if (z10 != null) {
                        return we.e.f67680b.a(z10);
                    }
                    if (!H() && !I()) {
                        return we.e.f67680b.a(we.d.f67668s);
                    }
                    long i12 = Ye.d.i(De.a.AppCallStatusSyncTime, -1L);
                    if (!H()) {
                        aVar = this;
                        c5582a = null;
                    } else {
                        if (i12 == -1 || LiveChatUtil.canMakeDepartmentsApiRequest(i12)) {
                            Md.a[] aVarArr = {Md.a.Call};
                            mVar.f42564n = this;
                            mVar.f42565o = m10;
                            mVar.f42568r = 1;
                            obj = O(aVarArr, mVar);
                            if (obj != coroutine_suspended) {
                                aVar = this;
                            }
                            return coroutine_suspended;
                        }
                        c5582a = C5582a.f56502b.d(new Pair(Boxing.boxBoolean(true), Boxing.boxBoolean(true)));
                        aVar = this;
                    }
                    long i13 = Ye.d.i(De.a.AppChatStatusSyncTime, -1L);
                    if (!I()) {
                        c5582a2 = null;
                    } else {
                        if (i13 == -1 || LiveChatUtil.canMakeDepartmentsApiRequest(i13)) {
                            Md.a[] aVarArr2 = {Md.a.Chat};
                            mVar.f42564n = m10;
                            mVar.f42565o = c5582a;
                            mVar.f42568r = 2;
                            Object O10 = aVar.O(aVarArr2, mVar);
                            if (O10 != coroutine_suspended) {
                                c5582a3 = c5582a;
                                obj = O10;
                                channel = m10;
                                m10 = channel;
                                c5582a2 = (C5582a) obj;
                                c5582a = c5582a3;
                            }
                            return coroutine_suspended;
                        }
                        c5582a2 = C5582a.f56502b.d(new Pair(Boxing.boxBoolean(true), Boxing.boxBoolean(true)));
                    }
                    if (H()) {
                    }
                    e.a aVar2 = we.e.f67680b;
                    if (m10 != null) {
                    }
                    if (d10 == null) {
                    }
                    if (m10 != null) {
                        list = Xe.a.d(chatDepartments, null, 1, null);
                    }
                    if (list == null) {
                    }
                    return aVar2.b(E(d10, list));
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5582a3 = (C5582a) mVar.f42565o;
                    channel = (Channel) mVar.f42564n;
                    ResultKt.throwOnFailure(obj);
                    m10 = channel;
                    c5582a2 = (C5582a) obj;
                    c5582a = c5582a3;
                    if ((H() || (c5582a != null && c5582a.d())) && (!I() || (c5582a2 != null && c5582a2.d()))) {
                        e.a aVar22 = we.e.f67680b;
                        d10 = (m10 != null || (callDepartments = m10.getCallDepartments()) == null) ? null : Xe.a.d(callDepartments, null, 1, null);
                        if (d10 == null) {
                            d10 = CollectionsKt.emptyList();
                        }
                        if (m10 != null && (chatDepartments = m10.getChatDepartments()) != null) {
                            list = Xe.a.d(chatDepartments, null, 1, null);
                        }
                        if (list == null) {
                            list = CollectionsKt.emptyList();
                        }
                        return aVar22.b(E(d10, list));
                    }
                    if (c5582a != null && (c10 = c5582a.c()) != null) {
                        c11 = c10;
                    } else if (c5582a2 != null) {
                        c11 = c5582a2.c();
                    }
                    e.a aVar3 = we.e.f67680b;
                    int intValue = (c11 == null || (b10 = c11.b()) == null) ? -1 : b10.intValue();
                    if (c11 == null || (str = c11.c()) == null) {
                        str = "Error in fetching departments";
                    }
                    return aVar3.a(new d.b(intValue, str));
                }
                m10 = (Channel) mVar.f42565o;
                aVar = (a) mVar.f42564n;
                ResultKt.throwOnFailure(obj);
                c5582a = (C5582a) obj;
                long i132 = Ye.d.i(De.a.AppChatStatusSyncTime, -1L);
                if (!I()) {
                }
                if (H()) {
                }
                e.a aVar222 = we.e.f67680b;
                if (m10 != null) {
                }
                if (d10 == null) {
                }
                if (m10 != null) {
                }
                if (list == null) {
                }
                return aVar222.b(E(d10, list));
            }
        }
        mVar = new m(continuation);
        Object obj2 = mVar.f42566p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = mVar.f42568r;
        list = null;
        C5582a.b c112 = null;
        list = null;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        long i1322 = Ye.d.i(De.a.AppChatStatusSyncTime, -1L);
        if (!I()) {
        }
        if (H()) {
        }
        e.a aVar2222 = we.e.f67680b;
        if (m10 != null) {
        }
        if (d10 == null) {
        }
        if (m10 != null) {
        }
        if (list == null) {
        }
        return aVar2222.b(E(d10, list));
    }

    public final Od.g F() {
        return (Od.g) f42525d.getValue();
    }

    public final Od.h G() {
        return (Od.h) f42526e.getValue();
    }

    public final Od.d K() {
        return (Od.d) f42527f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(Md.a[] aVarArr, Continuation continuation) {
        o oVar;
        int i10;
        C5582a c5582a;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f42572p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f42572p = i11 - Integer.MIN_VALUE;
                Object obj = oVar.f42570n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = oVar.f42572p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Od.g F10 = F();
                    Md.a[] aVarArr2 = (Md.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
                    oVar.f42572p = 1;
                    obj = F10.b(aVarArr2, oVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                c5582a = (C5582a) obj;
                if (c5582a.d()) {
                    Application e10 = MobilistenInitProvider.INSTANCE.e();
                    Intrinsics.checkNotNull(e10);
                    C1908a b10 = C1908a.b(e10);
                    Intent intent = new Intent("receivelivechat");
                    intent.putExtra("message", "appstatus");
                    b10.d(intent);
                }
                return c5582a;
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f42570n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = oVar.f42572p;
        if (i10 != 0) {
        }
        c5582a = (C5582a) obj2;
        if (c5582a.d()) {
        }
        return c5582a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:10:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P(Md.a[] aVarArr, Continuation continuation) {
        r rVar;
        int i10;
        Md.a[] aVarArr2;
        int length;
        int i11;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i12 = rVar.f42580s;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                rVar.f42580s = i12 - Integer.MIN_VALUE;
                Object obj = rVar.f42578q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = rVar.f42580s;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    aVarArr2 = aVarArr;
                    length = aVarArr.length;
                    i11 = 0;
                    if (i11 < length) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = rVar.f42577p;
                    i11 = rVar.f42576o;
                    Md.a[] aVarArr3 = (Md.a[]) rVar.f42575n;
                    ResultKt.throwOnFailure(obj);
                    aVarArr2 = aVarArr3;
                    i11++;
                    if (i11 < length) {
                        Md.a aVar = aVarArr2[i11];
                        Od.h G10 = f42522a.G();
                        boolean z10 = !LiveChatUtil.isFormContextStarted();
                        EnumC4544a s10 = s(aVar == Md.a.Call, false, null, 4, null);
                        rVar.f42575n = aVarArr2;
                        rVar.f42576o = i11;
                        rVar.f42577p = length;
                        rVar.f42580s = 1;
                        if (G10.a(z10, null, s10, rVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i11++;
                        if (i11 < length) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        rVar = new r(continuation);
        Object obj2 = rVar.f42578q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = rVar.f42580s;
        if (i10 != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Pe.a aVar, String str, boolean z10, Function1 function1, Continuation continuation) {
        C0608a c0608a;
        Object coroutine_suspended;
        int i10;
        EnumC4544a r10;
        boolean z11;
        a aVar2;
        a aVar3;
        Object a10;
        String str2;
        boolean z12;
        EnumC4544a enumC4544a;
        a aVar4;
        C5582a c5582a;
        Throwable th2;
        ?? r12;
        EnumC4544a enumC4544a2;
        List<Form.Message> messages;
        Form.Message.Meta.InputCard inputCard;
        String str3;
        boolean z13;
        EnumC4544a enumC4544a3;
        Object obj;
        EnumC4544a enumC4544a4;
        int i11;
        String str4 = str;
        boolean z14 = z10;
        Function1 function12 = function1;
        if (continuation instanceof C0608a) {
            c0608a = (C0608a) continuation;
            int i12 = c0608a.f42538v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0608a.f42538v = i12 - Integer.MIN_VALUE;
                Object obj2 = c0608a.f42536t;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0608a.f42538v;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    r10 = aVar == Pe.a.Audio ? r(true, z14, l(str4)) : r(false, z14, AbstractC3945n.i(z14, null, str4));
                    if (C6822a.C(r10)) {
                        z11 = false;
                        aVar2 = this;
                        if (N((r10 != EnumC4544a.CallOnline || r10 == EnumC4544a.CallOffline) ? Md.a.Call : Md.a.Chat)) {
                        }
                        return coroutine_suspended;
                    }
                    C6461a c6461a = C6461a.f65810a;
                    b bVar = new b(function12, null);
                    c0608a.f42530n = this;
                    c0608a.f42531o = str4;
                    c0608a.f42532p = function12;
                    c0608a.f42533q = r10;
                    c0608a.f42534r = z14;
                    c0608a.f42538v = 1;
                    if (c6461a.c(bVar, c0608a) != coroutine_suspended) {
                        aVar3 = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        z12 = c0608a.f42534r;
                        enumC4544a = (EnumC4544a) c0608a.f42533q;
                        function12 = (Function1) c0608a.f42532p;
                        str2 = (String) c0608a.f42531o;
                        aVar4 = (a) c0608a.f42530n;
                        ResultKt.throwOnFailure(obj2);
                        z11 = false;
                        c5582a = (C5582a) obj2;
                        if (c5582a.d()) {
                            Result.Companion companion = Result.INSTANCE;
                            C5582a.b c10 = c5582a.c();
                            if (c10 == null || (th2 = c10.a()) == null) {
                                th2 = new Throwable("Error in syncing forms");
                            }
                            return Result.m147constructorimpl(ResultKt.createFailure(th2));
                        }
                        C6461a c6461a2 = C6461a.f65810a;
                        c cVar = new c(function12, null);
                        c0608a.f42530n = aVar4;
                        c0608a.f42531o = str2;
                        c0608a.f42532p = function12;
                        c0608a.f42533q = enumC4544a;
                        c0608a.f42534r = z12;
                        c0608a.f42538v = 3;
                        if (c6461a2.c(cVar, c0608a) != coroutine_suspended) {
                            aVar2 = aVar4;
                            r10 = enumC4544a;
                            z14 = z12;
                            str4 = str2;
                            if (N((r10 != EnumC4544a.CallOnline || r10 == EnumC4544a.CallOffline) ? Md.a.Call : Md.a.Chat)) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 3) {
                        if (i10 == 4) {
                            z13 = c0608a.f42534r;
                            enumC4544a3 = (EnumC4544a) c0608a.f42532p;
                            enumC4544a4 = (EnumC4544a) c0608a.f42531o;
                            str3 = (String) c0608a.f42530n;
                            ResultKt.throwOnFailure(obj2);
                            obj = ((Result) obj2).getValue();
                            z11 = false;
                            return Result.m147constructorimpl(new Pair(enumC4544a3, Boxing.boxBoolean((Intrinsics.areEqual(Result.m153isFailureimpl(obj) ? null : obj, Boxing.boxBoolean(true)) || m(z13, str3, enumC4544a4)) ? z11 : true)));
                        }
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i13 = c0608a.f42535s;
                        enumC4544a2 = (EnumC4544a) c0608a.f42530n;
                        ResultKt.throwOnFailure(obj2);
                        z11 = false;
                        i11 = i13;
                        Result.Companion companion2 = Result.INSTANCE;
                        return Result.m147constructorimpl(new Pair(enumC4544a2, Boxing.boxBoolean(i11 == 0 ? true : z11)));
                    }
                    z12 = c0608a.f42534r;
                    enumC4544a = (EnumC4544a) c0608a.f42533q;
                    function12 = (Function1) c0608a.f42532p;
                    str2 = (String) c0608a.f42531o;
                    aVar2 = (a) c0608a.f42530n;
                    ResultKt.throwOnFailure(obj2);
                    z11 = false;
                    r10 = enumC4544a;
                    z14 = z12;
                    str4 = str2;
                    if (N((r10 != EnumC4544a.CallOnline || r10 == EnumC4544a.CallOffline) ? Md.a.Call : Md.a.Chat)) {
                        Result.Companion companion3 = Result.INSTANCE;
                        c0608a.f42530n = str4;
                        c0608a.f42531o = r10;
                        c0608a.f42532p = r10;
                        c0608a.f42533q = null;
                        c0608a.f42534r = z14;
                        c0608a.f42538v = 4;
                        Object n10 = n(function12, r10, str4, z14, c0608a);
                        if (n10 != coroutine_suspended) {
                            str3 = str4;
                            z13 = z14;
                            enumC4544a3 = r10;
                            obj = n10;
                            enumC4544a4 = enumC4544a3;
                            return Result.m147constructorimpl(new Pair(enumC4544a3, Boxing.boxBoolean((Intrinsics.areEqual(Result.m153isFailureimpl(obj) ? null : obj, Boxing.boxBoolean(true)) || m(z13, str3, enumC4544a4)) ? z11 : true)));
                        }
                    } else {
                        Form form = (Form) aVar2.B().a(r10).b();
                        if (form != null && (messages = form.getMessages()) != null) {
                            List<Form.Message> list = messages;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                for (Form.Message message : list) {
                                    Form.Message.Meta meta = message.getMeta();
                                    if (Intrinsics.areEqual(meta != null ? meta.getFieldName() : null, "department")) {
                                        if (r10 != EnumC4544a.CallOnline && r10 != EnumC4544a.CallOffline) {
                                            if (AbstractC3945n.i(z14, null, str4).size() != 1) {
                                                r12 = 1;
                                                break;
                                            }
                                        } else if (l(str4).size() != 1) {
                                            r12 = 1;
                                            break;
                                        }
                                    }
                                    Form.Message.Meta meta2 = message.getMeta();
                                    if (((meta2 == null || (inputCard = meta2.getInputCard()) == null) ? null : inputCard.getType()) != null && !Intrinsics.areEqual(message.getMeta().getFieldName(), "department") && Intrinsics.areEqual(message.getMeta().isSkippable(), Boxing.boxBoolean(z11)) && f42522a.A().a(message.getMeta().getInputCard().getType()).b() == null) {
                                        r12 = 1;
                                        break;
                                    }
                                }
                            }
                        }
                        r12 = z11;
                        C6461a c6461a3 = C6461a.f65810a;
                        d dVar = new d(function12, null);
                        c0608a.f42530n = r10;
                        c0608a.f42531o = null;
                        c0608a.f42532p = null;
                        c0608a.f42533q = null;
                        c0608a.f42535s = r12;
                        c0608a.f42538v = 5;
                        if (c6461a3.c(dVar, c0608a) != coroutine_suspended) {
                            enumC4544a2 = r10;
                            i11 = r12;
                            Result.Companion companion22 = Result.INSTANCE;
                            return Result.m147constructorimpl(new Pair(enumC4544a2, Boxing.boxBoolean(i11 == 0 ? true : z11)));
                        }
                    }
                    return coroutine_suspended;
                }
                boolean z15 = c0608a.f42534r;
                EnumC4544a enumC4544a5 = (EnumC4544a) c0608a.f42533q;
                function12 = (Function1) c0608a.f42532p;
                String str5 = (String) c0608a.f42531o;
                aVar3 = (a) c0608a.f42530n;
                ResultKt.throwOnFailure(obj2);
                r10 = enumC4544a5;
                z14 = z15;
                str4 = str5;
                Od.h G10 = aVar3.G();
                z11 = false;
                boolean z16 = !LiveChatUtil.isFormContextStarted();
                c0608a.f42530n = aVar3;
                c0608a.f42531o = str4;
                c0608a.f42532p = function12;
                c0608a.f42533q = r10;
                c0608a.f42534r = z14;
                c0608a.f42538v = 2;
                a10 = G10.a(z16, null, r10, c0608a);
                if (a10 != coroutine_suspended) {
                    str2 = str4;
                    z12 = z14;
                    enumC4544a = r10;
                    obj2 = a10;
                    aVar4 = aVar3;
                    c5582a = (C5582a) obj2;
                    if (c5582a.d()) {
                    }
                }
                return coroutine_suspended;
            }
        }
        c0608a = new C0608a(continuation);
        Object obj22 = c0608a.f42536t;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0608a.f42538v;
        if (i10 != 0) {
        }
        Od.h G102 = aVar3.G();
        z11 = false;
        boolean z162 = !LiveChatUtil.isFormContextStarted();
        c0608a.f42530n = aVar3;
        c0608a.f42531o = str4;
        c0608a.f42532p = function12;
        c0608a.f42533q = r10;
        c0608a.f42534r = z14;
        c0608a.f42538v = 2;
        a10 = G102.a(z162, null, r10, c0608a);
        if (a10 != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Pe.a aVar, String str, boolean z10, Function1 function1, Continuation continuation) {
        g gVar;
        int i10;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f42554p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f42554p = i11 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.f42552n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar2.f42554p;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                gVar2.f42554p = 1;
                Object i12 = i(aVar, str, z10, function1, gVar2);
                return i12 == coroutine_suspended ? coroutine_suspended : i12;
            }
        }
        gVar = new g(continuation);
        g gVar22 = gVar;
        Object obj2 = gVar22.f42552n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar22.f42554p;
        if (i10 == 0) {
        }
    }

    public final P p() {
        return C6461a.f65810a.e();
    }

    public final EnumC4544a q(String str, Channel.Department department, boolean z10) {
        if (department != null) {
            EnumC4544a enumC4544a = Intrinsics.areEqual(department.isOnline(), Boolean.TRUE) ? EnumC4544a.Online : EnumC4544a.Offline;
            if (enumC4544a != null) {
                return enumC4544a;
            }
        }
        List i10 = AbstractC3945n.i(z10, null, str);
        Intrinsics.checkNotNullExpressionValue(i10, "getValidChatDepartments(...)");
        List list = i10;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((Channel.Department) it.next()).isOnline(), Boolean.TRUE)) {
                    return EnumC4544a.Online;
                }
            }
        }
        return EnumC4544a.Offline;
    }

    public final Application t() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Kd.a u() {
        return (Kd.a) f42523b.getValue();
    }

    public final EnumC4544a v(String str) {
        Object obj;
        Iterator it = Td.e.b0(false, 1, null).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Channel.Department) obj).getId(), str)) {
                break;
            }
        }
        Channel.Department department = (Channel.Department) obj;
        return r(true, false, department != null ? CollectionsKt.listOf(department) : null);
    }

    public final Ke.a y() {
        return (Ke.a) f42524c.getValue();
    }
}
