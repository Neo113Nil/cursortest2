package ie;

import C.o0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: ie.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7056e implements o {

    /* renamed from: d, reason: collision with root package name */
    private static final String f66259d = kotlin.text.h.o0(C7056e.class.getCanonicalName(), ".", "");

    /* renamed from: e, reason: collision with root package name */
    public static final o f66260e = new a("NO_LOCKS", C7055d.f66258a);

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC7063l f66261a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1094e f66262b;

    /* renamed from: c, reason: collision with root package name */
    private final String f66263c;

    /* renamed from: ie.e$a */
    static class a extends C7056e {
        @Override // ie.C7056e
        @NotNull
        protected final n l(Object obj, @NotNull String str) {
            return n.a();
        }
    }

    /* renamed from: ie.e$b */
    final class b extends j<Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1 f66264e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f66265f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C7056e c7056e, Function0 function0, Function1 function1, Function1 function12) {
            super(c7056e, function0);
            this.f66264e = function1;
            this.f66265f = function12;
        }

        @Override // ie.C7056e.g
        @NotNull
        protected final n<Object> c(boolean z11) {
            return n.d(this.f66264e.invoke(Boolean.valueOf(z11)));
        }

        @Override // ie.C7056e.h
        protected final void d(@NotNull Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", AppMeasurementSdk.ConditionalUserProperty.VALUE, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
            }
            this.f66265f.invoke(obj);
        }
    }

    /* renamed from: ie.e$c */
    private static class c<K, V> extends d<K, V> implements InterfaceC7052a<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C7056e c7056e, ConcurrentHashMap concurrentHashMap) {
            super(c7056e, concurrentHashMap);
            if (c7056e != null) {
            } else {
                b(0);
                throw null;
            }
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "computation";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i11 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // ie.InterfaceC7052a
        @NotNull
        public final Object a(Sd.c cVar, @NotNull Function0 function0) {
            V invoke = invoke(new f(cVar, function0));
            if (invoke != null) {
                return invoke;
            }
            b(3);
            throw null;
        }
    }

    /* renamed from: ie.e$d */
    private static class d<K, V> extends k<f<K, V>, V> implements InterfaceC7053b<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C7056e c7056e, ConcurrentHashMap concurrentHashMap) {
            super(c7056e, concurrentHashMap, new C7058g());
            if (c7056e == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "storageManager", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction", "<init>"));
            }
        }
    }

    /* renamed from: ie.e$e, reason: collision with other inner class name */
    public interface InterfaceC1094e {

        /* renamed from: a, reason: collision with root package name */
        public static final InterfaceC1094e f66266a = new a();

        /* renamed from: ie.e$e$a */
        static class a implements InterfaceC1094e {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ie.e$f */
    static class f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final Sd.c f66267a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0<? extends V> f66268b;

        public f(Sd.c cVar, Function0 function0) {
            this.f66267a = cVar;
            this.f66268b = function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && f.class == obj.getClass() && this.f66267a.equals(((f) obj).f66267a);
        }

        public final int hashCode() {
            return this.f66267a.hashCode();
        }
    }

    /* renamed from: ie.e$g */
    private static class g<T> implements InterfaceC7062k<T> {

        /* renamed from: a, reason: collision with root package name */
        private final C7056e f66269a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0<? extends T> f66270b;

        /* renamed from: c, reason: collision with root package name */
        private volatile Object f66271c;

        public g(@NotNull C7056e c7056e, @NotNull Function0<? extends T> function0) {
            if (c7056e == null) {
                a(0);
                throw null;
            }
            this.f66271c = m.NOT_COMPUTED;
            this.f66269a = c7056e;
            this.f66270b = function0;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 2 || i11 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 2 || i11 == 3) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 == 2 || i11 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i11 != 2 && i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        protected void b(T t2) {
        }

        @NotNull
        protected n<T> c(boolean z11) {
            n<T> l11 = this.f66269a.l(null, "in a lazy value");
            if (l11 != null) {
                return l11;
            }
            a(2);
            throw null;
        }

        public final boolean i() {
            return (this.f66271c == m.NOT_COMPUTED || this.f66271c == m.COMPUTING) ? false : true;
        }

        @Override // kotlin.jvm.functions.Function0
        public T invoke() {
            T t2 = (T) this.f66271c;
            if (!(t2 instanceof m)) {
                te.j.d(t2);
                return t2;
            }
            this.f66269a.f66261a.lock();
            try {
                T t11 = (T) this.f66271c;
                if (t11 instanceof m) {
                    m mVar = m.COMPUTING;
                    if (t11 == mVar) {
                        this.f66271c = m.RECURSION_WAS_DETECTED;
                        n<T> c11 = c(true);
                        if (!c11.c()) {
                            t11 = c11.b();
                        }
                    }
                    if (t11 == m.RECURSION_WAS_DETECTED) {
                        n<T> c12 = c(false);
                        if (!c12.c()) {
                            t11 = c12.b();
                        }
                    }
                    this.f66271c = mVar;
                    try {
                        t11 = this.f66270b.invoke();
                        b(t11);
                        this.f66271c = t11;
                    } catch (Throwable th2) {
                        if (te.d.a(th2)) {
                            this.f66271c = m.NOT_COMPUTED;
                            throw th2;
                        }
                        if (this.f66271c == m.COMPUTING) {
                            this.f66271c = te.j.b(th2);
                        }
                        ((InterfaceC1094e.a) this.f66269a.f66262b).getClass();
                        te.d.b(th2);
                        throw null;
                    }
                } else {
                    te.j.d(t11);
                }
                return t11;
            } finally {
                this.f66269a.f66261a.unlock();
            }
        }
    }

    /* renamed from: ie.e$h */
    private static abstract class h<T> extends g<T> {

        /* renamed from: d, reason: collision with root package name */
        private volatile ie.m<T> f66272d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@NotNull C7056e c7056e, @NotNull Function0<? extends T> function0) {
            super(c7056e, function0);
            if (c7056e == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "storageManager", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute", "<init>"));
            }
            this.f66272d = null;
        }

        @Override // ie.C7056e.g
        protected final void b(T t2) {
            this.f66272d = new ie.m<>(t2);
            try {
                d(t2);
            } finally {
                this.f66272d = null;
            }
        }

        protected abstract void d(T t2);

        @Override // ie.C7056e.g, kotlin.jvm.functions.Function0
        public T invoke() {
            ie.m<T> mVar = this.f66272d;
            return (mVar == null || !mVar.b()) ? (T) super.invoke() : mVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ie.e$i */
    static class i<T> extends g<T> implements InterfaceC7061j<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@NotNull C7056e c7056e, @NotNull Function0<? extends T> function0) {
            super(c7056e, function0);
            if (c7056e != null) {
            } else {
                a(0);
                throw null;
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // ie.C7056e.g, kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            T t2 = (T) super.invoke();
            if (t2 != null) {
                return t2;
            }
            a(2);
            throw null;
        }
    }

    /* renamed from: ie.e$j */
    private static abstract class j<T> extends h<T> implements InterfaceC7061j<T> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@NotNull C7056e c7056e, @NotNull Function0<? extends T> function0) {
            super(c7056e, function0);
            if (c7056e != null) {
            } else {
                a(0);
                throw null;
            }
        }

        private static /* synthetic */ void a(int i11) {
            String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 2 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "computable";
            } else if (i11 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i11 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 2) {
                throw new IllegalStateException(format);
            }
        }

        @Override // ie.C7056e.h, ie.C7056e.g, kotlin.jvm.functions.Function0
        @NotNull
        public final T invoke() {
            T t2 = (T) super.invoke();
            if (t2 != null) {
                return t2;
            }
            a(2);
            throw null;
        }
    }

    /* renamed from: ie.e$k */
    private static class k<K, V> implements InterfaceC7060i<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final C7056e f66273a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap f66274b;

        /* renamed from: c, reason: collision with root package name */
        private final Function1<? super K, ? extends V> f66275c;

        public k(@NotNull C7056e c7056e, @NotNull ConcurrentHashMap concurrentHashMap, @NotNull Function1 function1) {
            if (c7056e == null) {
                b(0);
                throw null;
            }
            this.f66273a = c7056e;
            this.f66274b = concurrentHashMap;
            this.f66275c = function1;
        }

        private static /* synthetic */ void b(int i11) {
            String str = (i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 3 || i11 == 4) ? 2 : 3];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 == 3 || i11 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i11 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i11 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 3 && i11 != 4) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        private AssertionError c(K k11, Object obj) {
            AssertionError assertionError = new AssertionError("Inconsistent key detected. " + m.COMPUTING + " is expected, was: " + obj + ", most probably race condition detected on input " + k11 + " under " + this.f66273a);
            C7056e.m(assertionError);
            return assertionError;
        }

        @NotNull
        private AssertionError d(K k11, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k11 + ". Old value is " + obj + " under " + this.f66273a);
            C7056e.m(assertionError);
            return assertionError;
        }

        private AssertionError e(K k11, Throwable th2) {
            AssertionError assertionError = new AssertionError("Unable to remove " + k11 + " under " + this.f66273a, th2);
            C7056e.m(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public V invoke(K k11) {
            AssertionError assertionError;
            AssertionError e11;
            AssertionError e12;
            ConcurrentHashMap concurrentHashMap = this.f66274b;
            Object obj = concurrentHashMap.get(k11);
            if (obj != null && obj != m.COMPUTING) {
                return (V) te.j.c(obj);
            }
            C7056e c7056e = this.f66273a;
            InterfaceC7063l interfaceC7063l = c7056e.f66261a;
            InterfaceC7063l interfaceC7063l2 = c7056e.f66261a;
            interfaceC7063l.lock();
            try {
                Object obj2 = concurrentHashMap.get(k11);
                m mVar = m.COMPUTING;
                if (obj2 == mVar) {
                    obj2 = m.RECURSION_WAS_DETECTED;
                    n l11 = c7056e.l(k11, "");
                    if (l11 == null) {
                        b(3);
                        throw null;
                    }
                    if (!l11.c()) {
                        return (V) l11.b();
                    }
                }
                if (obj2 == m.RECURSION_WAS_DETECTED) {
                    n l12 = c7056e.l(k11, "");
                    if (l12 == null) {
                        b(3);
                        throw null;
                    }
                    if (!l12.c()) {
                        return (V) l12.b();
                    }
                }
                if (obj2 != null) {
                    return (V) te.j.c(obj2);
                }
                try {
                    concurrentHashMap.put(k11, mVar);
                    V invoke = this.f66275c.invoke(k11);
                    Object put = concurrentHashMap.put(k11, te.j.a(invoke));
                    if (put == mVar) {
                        return invoke;
                    }
                    assertionError = d(k11, put);
                    try {
                        throw assertionError;
                    } catch (Throwable th2) {
                        th = th2;
                        if (te.d.a(th)) {
                            try {
                                Object remove = concurrentHashMap.remove(k11);
                                if (remove != m.COMPUTING) {
                                    throw c(k11, remove);
                                }
                                throw th;
                            } finally {
                            }
                        }
                        if (th == assertionError) {
                            try {
                                concurrentHashMap.remove(k11);
                                ((InterfaceC1094e.a) c7056e.f66262b).getClass();
                                te.d.b(th);
                                throw null;
                            } finally {
                            }
                        }
                        Object put2 = concurrentHashMap.put(k11, te.j.b(th));
                        if (put2 != m.COMPUTING) {
                            throw d(k11, put2);
                        }
                        ((InterfaceC1094e.a) c7056e.f66262b).getClass();
                        te.d.b(th);
                        throw null;
                        interfaceC7063l2.unlock();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    assertionError = null;
                }
            } finally {
                interfaceC7063l2.unlock();
            }
        }

        @Override // ie.InterfaceC7060i
        public final boolean p(Sd.c cVar) {
            Object obj = this.f66274b.get(cVar);
            return (obj == null || obj == m.COMPUTING) ? false : true;
        }
    }

    /* renamed from: ie.e$l */
    private static class l<K, V> extends k<K, V> implements InterfaceC7059h<K, V> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@NotNull C7056e c7056e, @NotNull ConcurrentHashMap concurrentHashMap, @NotNull Function1 function1) {
            super(c7056e, concurrentHashMap, function1);
            if (c7056e != null) {
            } else {
                b(0);
                throw null;
            }
        }

        private static /* synthetic */ void b(int i11) {
            String str = i11 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 3 ? 3 : 2];
            if (i11 == 1) {
                objArr[0] = "map";
            } else if (i11 == 2) {
                objArr[0] = "compute";
            } else if (i11 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i11 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i11 != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 3) {
                throw new IllegalStateException(format);
            }
        }

        @Override // ie.C7056e.k, kotlin.jvm.functions.Function1
        @NotNull
        public final V invoke(K k11) {
            V v11 = (V) super.invoke(k11);
            if (v11 != null) {
                return v11;
            }
            b(3);
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ie.e$m */
    private static final class m {
        private static final /* synthetic */ m[] $VALUES;
        public static final m COMPUTING;
        public static final m NOT_COMPUTED;
        public static final m RECURSION_WAS_DETECTED;

        static {
            m mVar = new m("NOT_COMPUTED", 0);
            NOT_COMPUTED = mVar;
            m mVar2 = new m("COMPUTING", 1);
            COMPUTING = mVar2;
            m mVar3 = new m("RECURSION_WAS_DETECTED", 2);
            RECURSION_WAS_DETECTED = mVar3;
            $VALUES = new m[]{mVar, mVar2, mVar3};
        }

        private m() {
            throw null;
        }

        public static m valueOf(String str) {
            return (m) Enum.valueOf(m.class, str);
        }

        public static m[] values() {
            return (m[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ie.e$n */
    /* loaded from: classes10.dex */
    static class n<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f66276a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f66277b;

        private n(T t2, boolean z11) {
            this.f66276a = t2;
            this.f66277b = z11;
        }

        @NotNull
        public static <T> n<T> a() {
            return new n<>(null, true);
        }

        @NotNull
        public static <T> n<T> d(T t2) {
            return new n<>(t2, false);
        }

        public final T b() {
            return this.f66276a;
        }

        public final boolean c() {
            return this.f66277b;
        }

        public final String toString() {
            return this.f66277b ? "FALL_THROUGH" : String.valueOf(this.f66276a);
        }
    }

    public C7056e() {
        throw null;
    }

    public C7056e(String str) {
        this(str, new C7054c(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public static void m(@NotNull AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            } else if (!stackTrace[i11].getClassName().startsWith(f66259d)) {
                break;
            } else {
                i11++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i11, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    @Override // ie.o
    @NotNull
    public final <T> InterfaceC7061j<T> a(@NotNull Function0<? extends T> function0) {
        return new i(this, function0);
    }

    @Override // ie.o
    @NotNull
    public final <T> InterfaceC7062k<T> b(@NotNull Function0<? extends T> function0) {
        return new g(this, function0);
    }

    @Override // ie.o
    @NotNull
    public final InterfaceC7061j c(Function1 function1, @NotNull Function0 function0, @NotNull Function1 function12) {
        return new b(this, function0, function1, function12);
    }

    @Override // ie.o
    @NotNull
    public final <K, V> InterfaceC7059h<K, V> d(@NotNull Function1<? super K, ? extends V> function1) {
        return new l(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final <T> T g(@NotNull Function0<? extends T> function0) {
        this.f66261a.lock();
        try {
            function0.invoke();
            return null;
        } finally {
        }
    }

    @NotNull
    public final <K, V> InterfaceC7052a<K, V> h() {
        return new c(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @NotNull
    public final <K, V> InterfaceC7053b<K, V> i() {
        return new d(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    @NotNull
    public final <K, V> InterfaceC7060i<K, V> j(@NotNull Function1<? super K, ? extends V> function1) {
        return new k(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    @NotNull
    public final InterfaceC7061j k(@NotNull Function0 function0, @NotNull K k11) {
        if (k11 != null) {
            return new C7057f(this, function0, k11);
        }
        Object[] objArr = new Object[3];
        switch (27) {
            case 8:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 9:
            case 11:
            case 14:
            case 16:
            case 19:
            case 21:
                objArr[0] = "compute";
                break;
            case 10:
            case 13:
            case 20:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case 12:
            case 17:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[0] = "onRecursiveCall";
                break;
            case 15:
            case 18:
            case 22:
                objArr[0] = "map";
                break;
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case 28:
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 32:
            case 34:
                objArr[0] = "computable";
                break;
            case 29:
            case 33:
                objArr[0] = "postCompute";
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[0] = "source";
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[0] = "throwable";
                break;
            default:
                objArr[0] = "debugText";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        switch (27) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                break;
            case 19:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                objArr[2] = "createLazyValue";
                break;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 28:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                objArr[2] = "createNullableLazyValue";
                break;
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                objArr[2] = "recursionDetectedDefault";
                break;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @NotNull
    protected n l(Object obj, @NotNull String str) {
        StringBuilder sb2 = new StringBuilder("Recursion detected ");
        sb2.append(str);
        sb2.append(obj == null ? "" : U7.m.b(obj, "on input: "));
        sb2.append(" under ");
        sb2.append(this);
        AssertionError assertionError = new AssertionError(sb2.toString());
        m(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(" (");
        return o0.c(sb2, this.f66263c, ")");
    }

    private C7056e(@NotNull String str, @NotNull InterfaceC7063l interfaceC7063l) {
        InterfaceC1094e interfaceC1094e = InterfaceC1094e.f66266a;
        this.f66261a = interfaceC7063l;
        this.f66262b = interfaceC1094e;
        this.f66263c = str;
    }
}
