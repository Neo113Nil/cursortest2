package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.room.c;
import androidx.room.d;
import androidx.room.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.b6l;
import xsna.brm0;
import xsna.caj0;
import xsna.hpj;
import xsna.j5g;
import xsna.ksr;
import xsna.lsr;
import xsna.lyd;
import xsna.myc0;
import xsna.rl3;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: MultiInstanceInvalidationClient.android.kt */
/* loaded from: classes12.dex */
public final class g {
    public final String a;
    public final e b;
    public final Context c;
    public final yvj d;
    public final AtomicBoolean e;
    public int f;
    public d g;
    public final caj0 h;
    public final b i;
    public final a j;
    public final c k;

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class a extends c.a {

        /* compiled from: MultiInstanceInvalidationClient.android.kt */
        @b6l(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        /* renamed from: androidx.room.g$a$a, reason: collision with other inner class name */
        public static final class C0089a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ String[] $tables;
            Object L$0;
            int label;
            final /* synthetic */ g this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0089a(String[] strArr, g gVar, spj<? super C0089a> spjVar) {
                super(2, spjVar);
                this.$tables = strArr;
                this.this$0 = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C0089a(this.$tables, this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C0089a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Set<String> set2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    String[] strArr = this.$tables;
                    Set y0 = rl3.y0(Arrays.copyOf(strArr, strArr.length));
                    caj0 caj0Var = this.this$0.h;
                    this.L$0 = y0;
                    this.label = 1;
                    if (caj0Var.emit(y0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = y0;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.L$0;
                    kotlin.a.a(obj);
                }
                e eVar = this.this$0.b;
                ReentrantLock reentrantLock = eVar.e;
                reentrantLock.lock();
                try {
                    List<h> O0 = j5g.O0(eVar.d.values());
                    reentrantLock.unlock();
                    for (h hVar : O0) {
                        e.a aVar = hVar.a;
                        aVar.getClass();
                        if (!(aVar instanceof b)) {
                            String[] strArr2 = hVar.c;
                            int length = strArr2.length;
                            if (length == 0) {
                                set2 = EmptySet.b;
                            } else if (length != 1) {
                                SetBuilder setBuilder = new SetBuilder();
                                for (String str : set) {
                                    int length2 = strArr2.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length2) {
                                            String str2 = strArr2[i2];
                                            if (brm0.w(str2, str, true)) {
                                                setBuilder.add(str2);
                                                break;
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                set2 = setBuilder.d();
                            } else {
                                Set set3 = set;
                                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                    Iterator it = set3.iterator();
                                    while (it.hasNext()) {
                                        if (brm0.w((String) it.next(), strArr2[0], true)) {
                                            set2 = hVar.d;
                                            break;
                                        }
                                    }
                                }
                                set2 = EmptySet.b;
                            }
                            if (!set2.isEmpty()) {
                                hVar.a.a(set2);
                            }
                        }
                    }
                    return s3q0.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, androidx.room.c.c);
        }

        @Override // androidx.room.c
        public final void x0(String[] strArr) {
            g gVar = g.this;
            myc0.h(gVar.d, null, null, new C0089a(strArr, gVar, null), 3);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class b extends e.a {
        public b(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.a
        public final void a(Set<String> set) {
            g gVar = g.this;
            if (gVar.e.get()) {
                return;
            }
            try {
                d dVar = gVar.g;
                if (dVar != null) {
                    dVar.o1(gVar.f, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.android.kt */
    public static final class c implements ServiceConnection {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v7, types: [androidx.room.d] */
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.a.C0088a c0088a;
            int i = d.a.a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface(d.d);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                d.a.C0088a c0088a2 = new d.a.C0088a();
                c0088a2.a = iBinder;
                c0088a = c0088a2;
            } else {
                c0088a = (d) queryLocalInterface;
            }
            g gVar = g.this;
            gVar.g = c0088a;
            try {
                gVar.f = c0088a.i0(gVar.j, gVar.a);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            g.this.g = null;
        }
    }

    public g(Context context, String str, e eVar) {
        this.a = str;
        this.b = eVar;
        this.c = context.getApplicationContext();
        hpj hpjVar = eVar.a.b;
        this.d = hpjVar == null ? null : hpjVar;
        this.e = new AtomicBoolean(true);
        this.h = lyd.a(0, 0, BufferOverflow.SUSPEND);
        this.i = new b(eVar.b);
        this.j = new a();
        this.k = new c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1] */
    public final MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1 a(final String[] strArr) {
        final caj0 caj0Var = this.h;
        return new ksr<Set<? extends String>>() { // from class: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            /* renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements lsr {
                public final /* synthetic */ lsr b;
                public final /* synthetic */ String[] c;

                /* compiled from: Emitters.kt */
                @b6l(c = "androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2", f = "MultiInstanceInvalidationClient.android.kt", l = {239}, m = "emit")
                /* renamed from: androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(lsr lsrVar, String[] strArr) {
                    this.b = lsrVar;
                    this.c = strArr;
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
                                kotlin.a.a(obj2);
                                Set set = (Set) obj;
                                SetBuilder setBuilder = new SetBuilder();
                                for (String str : this.c) {
                                    Iterator<T> it = set.iterator();
                                    while (it.hasNext()) {
                                        if (brm0.w(str, (String) it.next(), true)) {
                                            setBuilder.add(str);
                                        }
                                    }
                                }
                                SetBuilder d = setBuilder.d();
                                if (d.isEmpty()) {
                                    d = null;
                                }
                                if (d != null) {
                                    anonymousClass1.label = 1;
                                    if (this.b.emit(d, anonymousClass1) == coroutineSingletons) {
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
            public final Object collect(lsr<? super Set<? extends String>> lsrVar, spj spjVar) {
                Object collect = caj0Var.collect(new AnonymousClass2(lsrVar, strArr), spjVar);
                return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
            }
        };
    }

    public final void b(Intent intent) {
        if (this.e.compareAndSet(true, false)) {
            this.c.bindService(intent, this.k, 1);
            b bVar = this.i;
            if (bVar == null) {
                throw new IllegalStateException("isRemote was false of observer argument");
            }
            this.b.a(bVar);
        }
    }

    public final void c() {
        if (this.e.compareAndSet(false, true)) {
            this.b.b(this.i);
            try {
                d dVar = this.g;
                if (dVar != null) {
                    dVar.s0(this.j, this.f);
                }
            } catch (RemoteException unused) {
            }
            this.c.unbindService(this.k);
        }
    }
}
