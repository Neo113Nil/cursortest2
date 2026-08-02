package xj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10781a {

    /* renamed from: xj0.a$a, reason: collision with other inner class name */
    public static final class C2284a implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f105607a;

        public C2284a(@NotNull String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f105607a = type;
        }

        @NotNull
        public final String a() {
            return this.f105607a;
        }
    }

    /* renamed from: xj0.a$b */
    public static final class b implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f105608a;

        public b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105608a = value;
        }

        @NotNull
        public final String a() {
            return this.f105608a;
        }
    }

    /* renamed from: xj0.a$c */
    public static final class c implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f105609a;

        public c(@NotNull String count) {
            Intrinsics.checkNotNullParameter(count, "count");
            this.f105609a = count;
        }

        @NotNull
        public final String a() {
            return this.f105609a;
        }
    }

    /* renamed from: xj0.a$d */
    public static final class d implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f105610a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 521985305;
        }

        @NotNull
        public final String toString() {
            return "DispatchEvents";
        }
    }

    /* renamed from: xj0.a$e */
    public static final class e implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f105611a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -605772514;
        }

        @NotNull
        public final String toString() {
            return "TrackEvents";
        }
    }

    /* renamed from: xj0.a$f */
    public static final class f implements InterfaceC10781a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f105612a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1532856676;
        }

        @NotNull
        public final String toString() {
            return "TrackPclPageEvents";
        }
    }
}
