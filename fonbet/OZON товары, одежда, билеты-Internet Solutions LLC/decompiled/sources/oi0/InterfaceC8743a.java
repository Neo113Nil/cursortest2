package oi0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8743a {

    /* renamed from: oi0.a$a, reason: collision with other inner class name */
    public static final class C1330a implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f78370a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f78371b;

        public C1330a(@NotNull String key, boolean z11) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f78370a = key;
            this.f78371b = z11;
        }

        @NotNull
        public final String a() {
            return this.f78370a;
        }

        public final boolean b() {
            return this.f78371b;
        }
    }

    /* renamed from: oi0.a$b */
    public static final class b implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f78372a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1657820755;
        }

        @NotNull
        public final String toString() {
            return "DispatchEvents";
        }
    }

    /* renamed from: oi0.a$c */
    public static final class c implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f78373a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1232207774;
        }

        @NotNull
        public final String toString() {
            return "DispatchTraces";
        }
    }

    /* renamed from: oi0.a$d */
    public static final class d implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f78374a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -642968827;
        }

        @NotNull
        public final String toString() {
            return "ResetAllConfigs";
        }
    }

    /* renamed from: oi0.a$e */
    public static final class e implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f78375a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -371742909;
        }

        @NotNull
        public final String toString() {
            return "SendFailedRequests";
        }
    }

    /* renamed from: oi0.a$f */
    public static final class f implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f78376a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f78377b;

        public f(@NotNull String currentPage, @NotNull String currentUrl) {
            Intrinsics.checkNotNullParameter(currentPage, "currentPage");
            Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
            this.f78376a = currentPage;
            this.f78377b = currentUrl;
        }

        @NotNull
        public final String a() {
            return this.f78376a;
        }

        @NotNull
        public final String b() {
            return this.f78377b;
        }
    }

    /* renamed from: oi0.a$g */
    public static final class g implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f78378a;

        /* renamed from: b, reason: collision with root package name */
        private final long f78379b;

        /* renamed from: c, reason: collision with root package name */
        private final int f78380c;

        public g(int i11, long j11, @NotNull String metricType) {
            Intrinsics.checkNotNullParameter(metricType, "metricType");
            this.f78378a = metricType;
            this.f78379b = j11;
            this.f78380c = i11;
        }

        public final int a() {
            return this.f78380c;
        }

        @NotNull
        public final String b() {
            return this.f78378a;
        }

        public final long c() {
            return this.f78379b;
        }
    }

    /* renamed from: oi0.a$h */
    public static final class h implements InterfaceC8743a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f78381a;

        /* renamed from: b, reason: collision with root package name */
        private final String f78382b;

        /* renamed from: c, reason: collision with root package name */
        private final String f78383c;

        public h(@NotNull String deeplinkUrl, String str, String str2) {
            Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
            this.f78381a = deeplinkUrl;
            this.f78382b = str;
            this.f78383c = str2;
        }

        public final String a() {
            return this.f78383c;
        }

        @NotNull
        public final String b() {
            return this.f78381a;
        }

        public final String c() {
            return this.f78382b;
        }
    }
}
