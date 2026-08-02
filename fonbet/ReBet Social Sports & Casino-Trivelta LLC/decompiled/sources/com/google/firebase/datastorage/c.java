package com.google.firebase.datastorage;

import I0.C1339d;
import I0.InterfaceC1344i;
import L0.f;
import L0.g;
import L0.j;
import Ph.AbstractC1457j;
import Ph.P;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.preferences.i;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes3.dex */
public final class c {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final Context f37735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37736b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f37737c;

    /* renamed from: d, reason: collision with root package name */
    public final ReadOnlyProperty f37738d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1344i f37739e;

    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f37740n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Function1 f37742p;

        /* renamed from: com.google.firebase.datastorage.c$a$a, reason: collision with other inner class name */
        public static final class C0524a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f37743n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f37744o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ Function1 f37745p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0524a(Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f37745p = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0524a c0524a = new C0524a(this.f37745p, continuation);
                c0524a.f37744o = obj;
                return c0524a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(L0.c cVar, Continuation continuation) {
                return ((C0524a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f37743n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f37745p.invoke((L0.c) this.f37744o);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f37742p = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(this.f37742p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f37740n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(c.this.f37737c.get(), Boxing.boxBoolean(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.f37737c.set(Boxing.boxBoolean(true));
                    InterfaceC1344i interfaceC1344i = c.this.f37739e;
                    C0524a c0524a = new C0524a(this.f37742p, null);
                    this.f37740n = 1;
                    obj = j.a(interfaceC1344i, c0524a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (f) obj;
            } finally {
                c.this.f37737c.set(Boxing.boxBoolean(false));
            }
        }
    }

    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f37746n;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Map a10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f37746n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f data = c.this.f37739e.getData();
                this.f37746n = 1;
                obj = AbstractC5323h.t(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (a10 = fVar.a()) == null) ? MapsKt.emptyMap() : a10;
        }
    }

    /* renamed from: com.google.firebase.datastorage.c$c, reason: collision with other inner class name */
    public static final class C0525c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f37748n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f.a f37750p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f37751q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0525c(f.a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f37750p = aVar;
            this.f37751q = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new C0525c(this.f37750p, this.f37751q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0525c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object c10;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f37748n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f data = c.this.f37739e.getData();
                this.f37748n = 1;
                obj = AbstractC5323h.t(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (c10 = fVar.c(this.f37750p)) == null) ? this.f37751q : c10;
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f37752n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f.a f37754p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f37755q;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f37756n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f37757o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ f.a f37758p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ Object f37759q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, Object obj, Continuation continuation) {
                super(2, continuation);
                this.f37758p = aVar;
                this.f37759q = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f37758p, this.f37759q, continuation);
                aVar.f37757o = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(L0.c cVar, Continuation continuation) {
                return ((a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f37756n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((L0.c) this.f37757o).k(this.f37758p, this.f37759q);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a aVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f37754p = aVar;
            this.f37755q = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new d(this.f37754p, this.f37755q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f37752n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC1344i interfaceC1344i = c.this.f37739e;
            a aVar = new a(this.f37754p, this.f37755q, null);
            this.f37752n = 1;
            Object a10 = j.a(interfaceC1344i, aVar, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        }
    }

    public c(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f37735a = context;
        this.f37736b = name;
        this.f37737c = new ThreadLocal();
        this.f37738d = androidx.datastore.preferences.a.b(name, new J0.b(new Function1() { // from class: com.google.firebase.datastorage.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                f e10;
                e10 = c.e(c.this, (C1339d) obj);
                return e10;
            }
        }), new Function1() { // from class: com.google.firebase.datastorage.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List f10;
                f10 = c.f(c.this, (Context) obj);
                return f10;
            }
        }, null, 8, null);
        this.f37739e = i(context);
    }

    public static final f e(c cVar, C1339d ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        Log.w(Reflection.getOrCreateKotlinClass(c.class).getSimpleName(), "CorruptionException in " + cVar.f37736b + " DataStore running in process " + Process.myPid(), ex);
        return g.a();
    }

    public static final List f(c cVar, Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(i.b(it, cVar.f37736b, null, 4, null));
    }

    public final f g(Function1 transform) {
        Object b10;
        Intrinsics.checkNotNullParameter(transform, "transform");
        b10 = AbstractC1457j.b(null, new a(transform, null), 1, null);
        return (f) b10;
    }

    public final Map h() {
        Object b10;
        b10 = AbstractC1457j.b(null, new b(null), 1, null);
        return (Map) b10;
    }

    public final InterfaceC1344i i(Context context) {
        return (InterfaceC1344i) this.f37738d.getValue(context, $$delegatedProperties[0]);
    }

    public final Object j(f.a key, Object obj) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = AbstractC1457j.b(null, new C0525c(key, obj, null), 1, null);
        return b10;
    }

    public final f k(f.a key, Object obj) {
        Object b10;
        Intrinsics.checkNotNullParameter(key, "key");
        b10 = AbstractC1457j.b(null, new d(key, obj, null), 1, null);
        return (f) b10;
    }
}
