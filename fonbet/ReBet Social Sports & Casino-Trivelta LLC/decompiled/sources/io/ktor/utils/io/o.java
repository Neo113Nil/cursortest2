package io.ktor.utils.io;

import Ph.F;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int f49534a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    public static final ReentrantReadWriteLock f49535b = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f49536c = new WeakHashMap();

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Constructor f49537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f49537d = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e10) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(e10, "e");
            try {
                Result.Companion companion = Result.INSTANCE;
                Object newInstance = this.f49537d.newInstance(e10.getMessage(), e10);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                m147constructorimpl = Result.m147constructorimpl((Throwable) newInstance);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            return (Throwable) m147constructorimpl;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Constructor f49538d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f49538d = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e10) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(e10, "e");
            try {
                Result.Companion companion = Result.INSTANCE;
                Object newInstance = this.f49538d.newInstance(e10);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                m147constructorimpl = Result.m147constructorimpl((Throwable) newInstance);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            return (Throwable) m147constructorimpl;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Constructor f49539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f49539d = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e10) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(e10, "e");
            try {
                Result.Companion companion = Result.INSTANCE;
                Object newInstance = this.f49539d.newInstance(e10.getMessage());
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) newInstance;
                th2.initCause(e10);
                m147constructorimpl = Result.m147constructorimpl(th2);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            return (Throwable) m147constructorimpl;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Constructor f49540d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f49540d = constructor;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable e10) {
            Object m147constructorimpl;
            Intrinsics.checkNotNullParameter(e10, "e");
            try {
                Result.Companion companion = Result.INSTANCE;
                Object newInstance = this.f49540d.newInstance(null);
                Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) newInstance;
                th2.initCause(e10);
                m147constructorimpl = Result.m147constructorimpl(th2);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th3));
            }
            return (Throwable) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }

    public static final class f extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f49541d = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final class g extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f49542d = new g();

        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final Function1 a(Constructor constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        if (length != 1) {
            if (length == 2 && Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) {
                return new a(constructor);
            }
            return null;
        }
        Class<?> cls = parameterTypes[0];
        if (Intrinsics.areEqual(cls, Throwable.class)) {
            return new b(constructor);
        }
        if (Intrinsics.areEqual(cls, String.class)) {
            return new c(constructor);
        }
        return null;
    }

    public static final int b(Class cls, int i10) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
            int i11 = 0;
            for (Field field : declaredFields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    public static /* synthetic */ int c(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b(cls, i10);
    }

    public static final int d(Class cls, int i10) {
        Object m147constructorimpl;
        JvmClassMappingKt.getKotlinClass(cls);
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            m147constructorimpl = valueOf;
        }
        return ((Number) m147constructorimpl).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable e(Throwable exception, Throwable cause) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (exception instanceof F) {
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(((F) exception).a());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            return (Throwable) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f49535b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            Function1 function1 = (Function1) f49536c.get(exception.getClass());
            if (function1 != null) {
                return (Throwable) function1.invoke(exception);
            }
            int i10 = 0;
            if (f49534a != d(exception.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i11 = 0; i11 < readHoldCount; i11++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f49536c.put(exception.getClass(), f.f49541d);
                    Unit unit = Unit.INSTANCE;
                    return null;
                } finally {
                    while (i10 < readHoldCount) {
                        readLock2.lock();
                        i10++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "exception.javaClass.constructors");
            Function1 function12 = null;
            for (Constructor constructor : ArraysKt.sortedWith(constructors, new e())) {
                Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
                function12 = a(constructor);
                if (function12 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f49535b;
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock2.readLock();
            int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i12 = 0; i12 < readHoldCount2; i12++) {
                readLock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            try {
                f49536c.put(exception.getClass(), function12 == null ? g.f49542d : function12);
                Unit unit2 = Unit.INSTANCE;
                while (i10 < readHoldCount2) {
                    readLock3.lock();
                    i10++;
                }
                writeLock2.unlock();
                if (function12 != null) {
                    return (Throwable) function12.invoke(cause);
                }
                return null;
            } catch (Throwable th3) {
                while (i10 < readHoldCount2) {
                    readLock3.lock();
                    i10++;
                }
                writeLock2.unlock();
                throw th3;
            }
        } finally {
            readLock.unlock();
        }
    }
}
