package com.oblador.keychain;

import I0.InterfaceC1344i;
import L0.f;
import L0.i;
import L0.j;
import Ph.AbstractC1455i;
import Ph.P;
import android.content.Context;
import android.util.Base64;
import cc.InterfaceC2910b;
import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;

/* loaded from: classes3.dex */
public final class a implements com.oblador.keychain.d {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property2(new PropertyReference2Impl(a.class, "prefs", "getPrefs(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* renamed from: b, reason: collision with root package name */
    public final P f39090b;

    /* renamed from: c, reason: collision with root package name */
    public final ReadOnlyProperty f39091c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1344i f39092d;

    /* renamed from: com.oblador.keychain.a$a, reason: collision with other inner class name */
    public static final class C0541a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f39093n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Function1 f39094o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0541a(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f39094o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0541a(this.f39094o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0541a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39093n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f39094o;
            this.f39093n = 1;
            Object invoke = function1.invoke(this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1 {
        public b(Object obj) {
            super(1, obj, a.class, "sharedPreferencesMigration", "sharedPreferencesMigration(Landroid/content/Context;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return ((a) this.receiver).n(p02);
        }
    }

    public static final class c extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f39095n;

        public c(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return a.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39095n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC5321f data = a.this.f39092d.getData();
            this.f39095n = 1;
            Object r10 = AbstractC5323h.r(data, this);
            return r10 == coroutine_suspended ? coroutine_suspended : r10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class d extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f39097n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f.a f39099p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ f.a f39100q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f.a f39101r;

        /* renamed from: com.oblador.keychain.a$d$a, reason: collision with other inner class name */
        public static final class C0542a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f39102n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f39103o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ f.a f39104p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ f.a f39105q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f.a f39106r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0542a(f.a aVar, f.a aVar2, f.a aVar3, Continuation continuation) {
                super(2, continuation);
                this.f39104p = aVar;
                this.f39105q = aVar2;
                this.f39106r = aVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0542a c0542a = new C0542a(this.f39104p, this.f39105q, this.f39106r, continuation);
                c0542a.f39103o = obj;
                return c0542a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(L0.c cVar, Continuation continuation) {
                return ((C0542a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f39102n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                L0.c cVar = (L0.c) this.f39103o;
                cVar.j(this.f39104p);
                cVar.j(this.f39105q);
                cVar.j(this.f39106r);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a aVar, f.a aVar2, f.a aVar3, Continuation continuation) {
            super(1, continuation);
            this.f39099p = aVar;
            this.f39100q = aVar2;
            this.f39101r = aVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return a.this.new d(this.f39099p, this.f39100q, this.f39101r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39097n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC1344i interfaceC1344i = a.this.f39092d;
            C0542a c0542a = new C0542a(this.f39099p, this.f39100q, this.f39101r, null);
            this.f39097n = 1;
            Object a10 = j.a(interfaceC1344i, c0542a, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class e extends SuspendLambda implements Function1 {

        /* renamed from: n, reason: collision with root package name */
        public int f39107n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ f.a f39109p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2910b.c f39110q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f.a f39111r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f.a f39112s;

        /* renamed from: com.oblador.keychain.a$e$a, reason: collision with other inner class name */
        public static final class C0543a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f39113n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f39114o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ f.a f39115p;

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2910b.c f39116q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f.a f39117r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f.a f39118s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0543a(f.a aVar, InterfaceC2910b.c cVar, f.a aVar2, f.a aVar3, Continuation continuation) {
                super(2, continuation);
                this.f39115p = aVar;
                this.f39116q = cVar;
                this.f39117r = aVar2;
                this.f39118s = aVar3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0543a c0543a = new C0543a(this.f39115p, this.f39116q, this.f39117r, this.f39118s, continuation);
                c0543a.f39114o = obj;
                return c0543a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(L0.c cVar, Continuation continuation) {
                return ((C0543a) create(cVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f39113n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                L0.c cVar = (L0.c) this.f39114o;
                cVar.k(this.f39115p, Base64.encodeToString((byte[]) this.f39116q.b(), 0));
                cVar.k(this.f39117r, Base64.encodeToString((byte[]) this.f39116q.a(), 0));
                cVar.k(this.f39118s, this.f39116q.c());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f.a aVar, InterfaceC2910b.c cVar, f.a aVar2, f.a aVar3, Continuation continuation) {
            super(1, continuation);
            this.f39109p = aVar;
            this.f39110q = cVar;
            this.f39111r = aVar2;
            this.f39112s = aVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return a.this.new e(this.f39109p, this.f39110q, this.f39111r, this.f39112s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39107n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC1344i interfaceC1344i = a.this.f39092d;
            C0543a c0543a = new C0543a(this.f39109p, this.f39110q, this.f39111r, this.f39112s, null);
            this.f39107n = 1;
            Object a10 = j.a(interfaceC1344i, c0543a, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public a(ReactApplicationContext reactContext, P coroutineScope) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f39090b = coroutineScope;
        this.f39091c = androidx.datastore.preferences.a.b("RN_KEYCHAIN", null, new b(this), coroutineScope, 2, null);
        this.f39092d = l(reactContext);
    }

    @Override // com.oblador.keychain.d
    public d.b a(String service) {
        Intrinsics.checkNotNullParameter(service, "service");
        byte[] j10 = j(service);
        byte[] i10 = i(service);
        String k10 = k(service);
        if (j10 == null || i10 == null || k10 == null) {
            return null;
        }
        return new d.b(k10, j10, i10);
    }

    @Override // com.oblador.keychain.d
    public Set b() {
        HashSet hashSet = new HashSet();
        Set keySet = m().a().keySet();
        ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((f.a) it.next()).a());
        }
        for (String str : arrayList) {
            if (com.oblador.keychain.d.f39120a.d(str)) {
                hashSet.add((String) m().c(i.g(str)));
            }
        }
        return hashSet;
    }

    @Override // com.oblador.keychain.d
    public void c(String service) {
        Intrinsics.checkNotNullParameter(service, "service");
        d.a aVar = com.oblador.keychain.d.f39120a;
        g(new d(i.g(aVar.c(service)), i.g(aVar.b(service)), i.g(aVar.a(service)), null));
    }

    @Override // com.oblador.keychain.d
    public void d(String service, InterfaceC2910b.c encryptionResult) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(encryptionResult, "encryptionResult");
        d.a aVar = com.oblador.keychain.d.f39120a;
        g(new e(i.g(aVar.c(service)), encryptionResult, i.g(aVar.b(service)), i.g(aVar.a(service)), null));
    }

    public final Object g(Function1 function1) {
        return AbstractC1455i.e(this.f39090b.getCoroutineContext(), new C0541a(function1, null));
    }

    public final byte[] h(f.a aVar) {
        String str = (String) m().c(aVar);
        if (str != null) {
            return Base64.decode(str, 0);
        }
        return null;
    }

    public final byte[] i(String str) {
        return h(i.g(com.oblador.keychain.d.f39120a.b(str)));
    }

    public final byte[] j(String str) {
        return h(i.g(com.oblador.keychain.d.f39120a.c(str)));
    }

    public final String k(String str) {
        return (String) m().c(i.g(com.oblador.keychain.d.f39120a.a(str)));
    }

    public final InterfaceC1344i l(Context context) {
        return (InterfaceC1344i) this.f39091c.getValue(context, $$delegatedProperties[0]);
    }

    public final f m() {
        return (f) g(new c(null));
    }

    public final List n(Context context) {
        return CollectionsKt.listOf(androidx.datastore.preferences.i.b(context, "RN_KEYCHAIN", null, 4, null));
    }
}
