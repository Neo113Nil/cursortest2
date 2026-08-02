package com.ironsource;

import com.ironsource.C4190m1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4136j1 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.j1$b */
    public static final class b implements InterfaceC4136j1 {
        private final int a;

        @NotNull
        private final List<InterfaceC4208n1> b;

        public b(int i, @NotNull List<InterfaceC4208n1> list) {
            list.getClass();
            this.a = i;
            this.b = list;
        }

        @Override // com.ironsource.InterfaceC4136j1
        public void a(@NotNull InterfaceC4262q1 interfaceC4262q1) {
            interfaceC4262q1.getClass();
            interfaceC4262q1.a(this.a, this.b);
        }
    }

    void a(@NotNull InterfaceC4262q1 interfaceC4262q1);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.j1$a */
    public static final class a {

        @NotNull
        public static final C1203a a = new C1203a(null);

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$a$b */
        public static final class b {

            @NotNull
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

        @NotNull
        public static final InterfaceC4136j1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4136j1 b(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.b(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 c(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.c(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 d(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.d(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 e(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.e(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 f(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.f(interfaceC4208n1Arr);
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$a$a, reason: collision with other inner class name */
        public static final class C1203a {
            public /* synthetic */ C1203a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4136j1 a(boolean z) {
                return z ? new b(410, new ArrayList()) : new b(411, new ArrayList());
            }

            @NotNull
            public final InterfaceC4136j1 b(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(404, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 c(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(409, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 d(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(401, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 e(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(408, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 f(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(405, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            private C1203a() {
            }

            @NotNull
            public final InterfaceC4136j1 a() {
                return new b(406, new ArrayList());
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(407, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar) {
                jVar.getClass();
                kVar.getClass();
                return new b(403, kotlin.collections.b.l(jVar, kVar));
            }
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.a(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 a(boolean z) {
            return a.a(z);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar) {
            return a.a(jVar, kVar);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.j1$c */
    public static final class c {

        @NotNull
        public static final a a = new a(null);

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$c$b */
        public static final class b {

            @NotNull
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

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.a(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 b() {
            return a.b();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar, @NotNull C4190m1.f fVar) {
                jVar.getClass();
                kVar.getClass();
                fVar.getClass();
                return new b(203, kotlin.collections.b.l(jVar, kVar, fVar));
            }

            @NotNull
            public final InterfaceC4136j1 b() {
                return new b(206, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.l lVar) {
                lVar.getClass();
                return new b(207, kotlin.collections.b.l(lVar));
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull InterfaceC4208n1 interfaceC4208n1) {
                interfaceC4208n1.getClass();
                return new b(202, kotlin.collections.b.l(interfaceC4208n1));
            }

            @NotNull
            public final InterfaceC4136j1 a() {
                return new b(201, new ArrayList());
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(204, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }
        }

        @NotNull
        public static final InterfaceC4136j1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar, @NotNull C4190m1.f fVar) {
            return a.a(jVar, kVar, fVar);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull InterfaceC4208n1 interfaceC4208n1) {
            return a.a(interfaceC4208n1);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.l lVar) {
            return a.a(lVar);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.j1$d */
    public static final class d {

        @NotNull
        public static final a a = new a(null);

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$d$b */
        public static final class b {

            @NotNull
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

        @NotNull
        public static final InterfaceC4136j1 a() {
            return a.a();
        }

        @NotNull
        public static final InterfaceC4136j1 b() {
            return a.b();
        }

        @NotNull
        public static final b c() {
            return a.c();
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.j1$d$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar, @NotNull C4190m1.f fVar, @NotNull C4190m1.l lVar) {
                jVar.getClass();
                kVar.getClass();
                fVar.getClass();
                lVar.getClass();
                return new b(104, kotlin.collections.b.l(jVar, kVar, fVar, lVar));
            }

            @NotNull
            public final InterfaceC4136j1 b(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(110, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final b c() {
                return new b(105, new ArrayList());
            }

            private a() {
            }

            @NotNull
            public final InterfaceC4136j1 b() {
                return new b(112, new ArrayList());
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
                interfaceC4208n1Arr.getClass();
                return new b(102, kotlin.collections.b.l(Arrays.copyOf(interfaceC4208n1Arr, interfaceC4208n1Arr.length)));
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.f fVar) {
                fVar.getClass();
                return new b(103, kotlin.collections.b.l(fVar));
            }

            @NotNull
            public final InterfaceC4136j1 a() {
                return new b(101, new ArrayList());
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar) {
                jVar.getClass();
                kVar.getClass();
                return new b(109, kotlin.collections.b.l(jVar, kVar));
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull InterfaceC4208n1 interfaceC4208n1) {
                interfaceC4208n1.getClass();
                return new b(111, kotlin.collections.b.l(interfaceC4208n1));
            }

            @NotNull
            public final InterfaceC4136j1 a(@NotNull C4190m1.k kVar) {
                kVar.getClass();
                return new b(113, kotlin.collections.b.l(kVar));
            }
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.a(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 b(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
            return a.b(interfaceC4208n1Arr);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar) {
            return a.a(jVar, kVar);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.j jVar, @NotNull C4190m1.k kVar, @NotNull C4190m1.f fVar, @NotNull C4190m1.l lVar) {
            return a.a(jVar, kVar, fVar, lVar);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull InterfaceC4208n1 interfaceC4208n1) {
            return a.a(interfaceC4208n1);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.f fVar) {
            return a.a(fVar);
        }

        @NotNull
        public static final InterfaceC4136j1 a(@NotNull C4190m1.k kVar) {
            return a.a(kVar);
        }
    }
}
