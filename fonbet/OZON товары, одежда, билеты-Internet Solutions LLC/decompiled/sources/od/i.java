package od;

import T7.E;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.S;
import od.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class i<M extends Member> implements h<M> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final M f78044a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Type f78045b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<?> f78046c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Type> f78047d;

    /* loaded from: classes10.dex */
    public static final class a extends i<Constructor<?>> implements od.g {

        /* renamed from: e, reason: collision with root package name */
        private final Object f78048e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@NotNull Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, (Type[]) (r1.length <= 2 ? new Type[0] : C7705l.w(1, r1.length - 1, r1)));
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            this.f78048e = obj;
        }

        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            Constructor<?> b11 = b();
            S s11 = new S(3);
            s11.a(this.f78048e);
            s11.b(args);
            s11.a(null);
            return b11.newInstance(s11.d(new Object[s11.c()]));
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends i<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(@NotNull Constructor<?> constructor) {
            super(constructor, r0, null, (Type[]) (r1.length <= 1 ? new Type[0] : C7705l.w(0, r1.length - 1, r1)));
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        }

        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            Constructor<?> b11 = b();
            S s11 = new S(2);
            s11.b(args);
            s11.a(null);
            return b11.newInstance(s11.d(new Object[s11.c()]));
        }
    }

    /* loaded from: classes10.dex */
    public static final class c extends i<Constructor<?>> implements od.g {

        /* renamed from: e, reason: collision with root package name */
        private final Object f78049e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(@NotNull Constructor<?> constructor, Object obj) {
            super(constructor, r0, null, r1);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            Class<?> declaringClass = constructor.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            this.f78049e = obj;
        }

        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            Constructor<?> b11 = b();
            S s11 = new S(2);
            s11.a(this.f78049e);
            s11.b(args);
            return b11.newInstance(s11.d(new Object[s11.c()]));
        }
    }

    public static final class d extends i<Constructor<?>> {
        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            return b().newInstance(Arrays.copyOf(args, args.length));
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class e extends i<Field> {

        public static final class a extends e implements od.g {

            /* renamed from: e, reason: collision with root package name */
            private final Object f78050e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Field field, Object obj) {
                super(field, false);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f78050e = obj;
            }

            @Override // od.i.e, od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                return b().get(this.f78050e);
            }
        }

        public static final class b extends e implements od.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Field field) {
                super(field, false);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class c extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull Field field) {
                super(field, true);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class d extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull Field field) {
                super(field, true);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // od.i
            public final void c(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                d(C7705l.F(args));
            }
        }

        /* renamed from: od.i$e$e, reason: collision with other inner class name */
        public static final class C1319e extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1319e(@NotNull Field field) {
                super(field, false);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public e(Field field, boolean z11) {
            super(field, r0, z11 ? field.getDeclaringClass() : null, new Type[0]);
            Type genericType = field.getGenericType();
            Intrinsics.checkNotNullExpressionValue(genericType, "getGenericType(...)");
        }

        @Override // od.h
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            c(args);
            return b().get(e() != null ? C7705l.C(args) : null);
        }
    }

    /* loaded from: classes10.dex */
    public static abstract class f extends i<Field> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f78051e;

        public static final class a extends f implements od.g {

            /* renamed from: f, reason: collision with root package name */
            private final Object f78052f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Field field, boolean z11, Object obj) {
                super(field, z11, false);
                Intrinsics.checkNotNullParameter(field, "field");
                this.f78052f = obj;
            }

            @Override // od.i.f, od.h
            @NotNull
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                c(args);
                b().set(this.f78052f, C7705l.C(args));
                return Unit.f71690a;
            }
        }

        public static final class b extends f implements od.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Field field, boolean z11) {
                super(field, z11, false);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // od.i.f, od.h
            @NotNull
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                c(args);
                b().set(null, C7705l.Q(args));
                return Unit.f71690a;
            }
        }

        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull Field field, boolean z11) {
                super(field, z11, true);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull Field field, boolean z11) {
                super(field, z11, true);
                Intrinsics.checkNotNullParameter(field, "field");
            }

            @Override // od.i.f, od.i
            public final void c(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                super.c(args);
                d(C7705l.F(args));
            }
        }

        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Field field, boolean z11) {
                super(field, z11, false);
                Intrinsics.checkNotNullParameter(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(Field field, boolean z11, boolean z12) {
            super(field, TYPE, z12 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            this.f78051e = z11;
        }

        @Override // od.i
        public void c(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            h.a.a(this, args);
            if (this.f78051e && C7705l.Q(args) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // od.h
        public Object call(@NotNull Object[] args) {
            Intrinsics.checkNotNullParameter(args, "args");
            c(args);
            b().set(e() != null ? C7705l.C(args) : null, C7705l.Q(args));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r1 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> f02;
        this.f78044a = member;
        this.f78045b = type;
        this.f78046c = cls;
        if (cls != null) {
            S s11 = new S(2);
            s11.a(cls);
            s11.b(typeArr);
            f02 = C7714v.b0(s11.d(new Type[s11.c()]));
        }
        f02 = C7705l.f0(typeArr);
        this.f78047d = f02;
    }

    @Override // od.h
    @NotNull
    public final List<Type> a() {
        return this.f78047d;
    }

    @Override // od.h
    @NotNull
    public final M b() {
        return this.f78044a;
    }

    public void c(@NotNull Object[] objArr) {
        h.a.a(this, objArr);
    }

    protected final void d(Object obj) {
        if (obj == null || !this.f78044a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class<?> e() {
        return this.f78046c;
    }

    @Override // od.h
    @NotNull
    public final Type getReturnType() {
        return this.f78045b;
    }

    public static abstract class g extends i<Method> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f78053e;

        /* loaded from: classes10.dex */
        public static final class a extends g implements od.g {

            /* renamed from: f, reason: collision with root package name */
            private final Object f78054f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull Method method, Object obj) {
                super(method, false, 4);
                Intrinsics.checkNotNullParameter(method, "method");
                this.f78054f = obj;
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                return f(args, this.f78054f);
            }
        }

        /* loaded from: classes10.dex */
        public static final class b extends g implements od.g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull Method method) {
                super(method, false, 4);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                return f(args, null);
            }
        }

        /* loaded from: classes10.dex */
        public static final class c extends g implements od.g {

            /* renamed from: f, reason: collision with root package name */
            private final Object f78055f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public c(@NotNull Method method, Object obj) {
                super(method, false, (Type[]) (r0.length <= 1 ? new Type[0] : C7705l.w(1, r0.length, r0)));
                Intrinsics.checkNotNullParameter(method, "method");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                this.f78055f = obj;
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                S s11 = new S(2);
                s11.a(this.f78055f);
                s11.b(args);
                return f(s11.d(new Object[s11.c()]), null);
            }

            public final Object g() {
                return this.f78055f;
            }
        }

        /* loaded from: classes10.dex */
        public static final class d extends g implements od.g {

            /* renamed from: f, reason: collision with root package name */
            @NotNull
            private final Object[] f78056f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public d(@NotNull Method method, @NotNull Object[] boundReceiverComponents) {
                super(method, false, (Type[]) r0.toArray(new Type[0]));
                Collection collection;
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(boundReceiverComponents, "boundReceiverComponents");
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                int length = boundReceiverComponents.length;
                Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
                if (length < 0) {
                    throw new IllegalArgumentException(E.a(length, "Requested element count ", " is less than zero.").toString());
                }
                int length2 = genericParameterTypes.length - length;
                length2 = length2 < 0 ? 0 : length2;
                Intrinsics.checkNotNullParameter(genericParameterTypes, "<this>");
                if (length2 < 0) {
                    throw new IllegalArgumentException(E.a(length2, "Requested element count ", " is less than zero.").toString());
                }
                if (length2 == 0) {
                    collection = K.f71697a;
                } else {
                    int length3 = genericParameterTypes.length;
                    if (length2 >= length3) {
                        collection = C7705l.f0(genericParameterTypes);
                    } else if (length2 == 1) {
                        collection = C7714v.a0(genericParameterTypes[length3 - 1]);
                    } else {
                        ArrayList arrayList = new ArrayList(length2);
                        for (int i11 = length3 - length2; i11 < length3; i11++) {
                            arrayList.add(genericParameterTypes[i11]);
                        }
                        collection = arrayList;
                    }
                }
                this.f78056f = boundReceiverComponents;
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                S s11 = new S(2);
                s11.b(this.f78056f);
                s11.b(args);
                return f(s11.d(new Object[s11.c()]), null);
            }

            @NotNull
            public final Object[] g() {
                return this.f78056f;
            }

            public final int h() {
                return this.f78056f.length;
            }
        }

        public static final class e extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Method method) {
                super(method, false, 6);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                return f(args.length <= 1 ? new Object[0] : C7705l.w(1, args.length, args), args[0]);
            }
        }

        /* loaded from: classes10.dex */
        public static final class f extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(@NotNull Method method) {
                super(method, true, 4);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                d(C7705l.F(args));
                return f(args.length <= 1 ? new Object[0] : C7705l.w(1, args.length, args), null);
            }
        }

        /* renamed from: od.i$g$g, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public static final class C1320g extends g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1320g(@NotNull Method method) {
                super(method, false, 6);
                Intrinsics.checkNotNullParameter(method, "method");
            }

            @Override // od.h
            public final Object call(@NotNull Object[] args) {
                Intrinsics.checkNotNullParameter(args, "args");
                h.a.a(this, args);
                return f(args, null);
            }
        }

        public /* synthetic */ g(Method method, boolean z11, int i11) {
            this(method, (i11 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z11, method.getGenericParameterTypes());
        }

        protected final Object f(@NotNull Object[] args, Object obj) {
            Intrinsics.checkNotNullParameter(args, "args");
            return this.f78053e ? Unit.f71690a : b().invoke(obj, Arrays.copyOf(args, args.length));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(Method method, boolean z11, Type[] typeArr) {
            super(method, r0, z11 ? method.getDeclaringClass() : null, typeArr);
            Type genericReturnType = method.getGenericReturnType();
            Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
            this.f78053e = Intrinsics.d(getReturnType(), Void.TYPE);
        }
    }
}
