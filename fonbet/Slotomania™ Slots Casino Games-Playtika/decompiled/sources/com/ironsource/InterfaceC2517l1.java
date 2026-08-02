package com.ironsource;

import com.ironsource.C2571o1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.l1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2517l1 {

    /* renamed from: com.ironsource.l1$a */
    public static final class a {
        public static final C0212a a = new C0212a(null);

        /* renamed from: com.ironsource.l1$a$a, reason: collision with other inner class name */
        public static final class C0212a {
            public /* synthetic */ C0212a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.j errorCode, C2571o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(403, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC2517l1 b(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.d, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 c(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.i, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 d(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(401, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 e(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.h, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 f(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.e, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            private C0212a() {
            }

            @JvmStatic
            public final InterfaceC2517l1 a() {
                return new b(b.f, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC2517l1 a(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(b.g, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(boolean z) {
                if (z) {
                    return new b(b.j, new ArrayList());
                }
                return new b(b.k, new ArrayList());
            }
        }

        /* renamed from: com.ironsource.l1$a$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 401;
            public static final int c = 403;
            public static final int d = 404;
            public static final int e = 405;
            public static final int f = 406;
            public static final int g = 407;
            public static final int h = 408;
            public static final int i = 409;
            public static final int j = 410;
            public static final int k = 411;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC2517l1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC2517l1 b(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.b(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 c(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.c(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 d(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.d(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 e(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.e(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 f(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.f(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.a(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(boolean z) {
            return a.a(z);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.j jVar, C2571o1.k kVar) {
            return a.a(jVar, kVar);
        }
    }

    /* renamed from: com.ironsource.l1$b */
    public static final class b implements InterfaceC2517l1 {
        private final int a;
        private final List<InterfaceC2589p1> b;

        public b(int i, List<InterfaceC2589p1> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "arrayList");
            this.a = i;
            this.b = arrayList;
        }

        @Override // com.ironsource.InterfaceC2517l1
        public void a(InterfaceC2642s1 analytics) {
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            analytics.a(this.a, this.b);
        }
    }

    /* renamed from: com.ironsource.l1$c */
    public static final class c {
        public static final a a = new a(null);

        /* renamed from: com.ironsource.l1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC2517l1 a() {
                return new b(201, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC2517l1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.l ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(207, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(InterfaceC2589p1 duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(202, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.j errorCode, C2571o1.k errorReason, C2571o1.f duration) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(203, CollectionsKt.mutableListOf(errorCode, errorReason, duration));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(204, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }
        }

        /* renamed from: com.ironsource.l1$c$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 201;
            public static final int c = 202;
            public static final int d = 203;
            public static final int e = 204;
            public static final int f = 205;
            public static final int g = 206;
            public static final int h = 207;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.a(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 b() {
            return a.b();
        }

        @JvmStatic
        public static final InterfaceC2517l1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.j jVar, C2571o1.k kVar, C2571o1.f fVar) {
            return a.a(jVar, kVar, fVar);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(InterfaceC2589p1 interfaceC2589p1) {
            return a.a(interfaceC2589p1);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.l lVar) {
            return a.a(lVar);
        }
    }

    /* renamed from: com.ironsource.l1$d */
    public static final class d {
        public static final a a = new a(null);

        /* renamed from: com.ironsource.l1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final InterfaceC2517l1 a() {
                return new b(101, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC2517l1 b(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(110, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @JvmStatic
            public final InterfaceC2517l1 a(InterfaceC2589p1... entity) {
                Intrinsics.checkNotNullParameter(entity, "entity");
                return new b(102, CollectionsKt.mutableListOf(Arrays.copyOf(entity, entity.length)));
            }

            @JvmStatic
            public final InterfaceC2517l1 b() {
                return new b(112, new ArrayList());
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.f duration) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                return new b(103, CollectionsKt.mutableListOf(duration));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.j errorCode, C2571o1.k errorReason, C2571o1.f duration, C2571o1.l loaderState) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(loaderState, "loaderState");
                return new b(104, CollectionsKt.mutableListOf(errorCode, errorReason, duration, loaderState));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.j errorCode, C2571o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(109, CollectionsKt.mutableListOf(errorCode, errorReason));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(InterfaceC2589p1 ext1) {
                Intrinsics.checkNotNullParameter(ext1, "ext1");
                return new b(111, CollectionsKt.mutableListOf(ext1));
            }

            @JvmStatic
            public final InterfaceC2517l1 a(C2571o1.k errorReason) {
                Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                return new b(113, CollectionsKt.mutableListOf(errorReason));
            }
        }

        /* renamed from: com.ironsource.l1$d$b */
        public static final class b {
            public static final b a = new b();
            public static final int b = 101;
            public static final int c = 102;
            public static final int d = 103;
            public static final int e = 104;
            public static final int f = 105;
            public static final int g = 109;
            public static final int h = 110;
            public static final int i = 111;
            public static final int j = 112;
            public static final int k = 113;

            private b() {
            }
        }

        @JvmStatic
        public static final InterfaceC2517l1 a() {
            return a.a();
        }

        @JvmStatic
        public static final InterfaceC2517l1 b() {
            return a.b();
        }

        @JvmStatic
        public static final b c() {
            return a.c();
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.a(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 b(InterfaceC2589p1... interfaceC2589p1Arr) {
            return a.b(interfaceC2589p1Arr);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.j jVar, C2571o1.k kVar) {
            return a.a(jVar, kVar);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.j jVar, C2571o1.k kVar, C2571o1.f fVar, C2571o1.l lVar) {
            return a.a(jVar, kVar, fVar, lVar);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(InterfaceC2589p1 interfaceC2589p1) {
            return a.a(interfaceC2589p1);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.f fVar) {
            return a.a(fVar);
        }

        @JvmStatic
        public static final InterfaceC2517l1 a(C2571o1.k kVar) {
            return a.a(kVar);
        }
    }

    void a(InterfaceC2642s1 interfaceC2642s1);
}
