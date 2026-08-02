package yg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: yg0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10901d {

    /* renamed from: yg0.d$a */
    public static final class a extends AbstractC10901d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f106632a;

        public a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f106632a = message;
        }

        @NotNull
        public final String a() {
            return this.f106632a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f106632a, ((a) obj).f106632a);
        }

        public final int hashCode() {
            return this.f106632a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("Failure(message="), this.f106632a, ")");
        }
    }

    /* renamed from: yg0.d$b */
    public static final class b extends AbstractC10901d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f106633a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1040960055;
        }

        @NotNull
        public final String toString() {
            return "NoInitialDsn";
        }
    }

    /* renamed from: yg0.d$c */
    public static final class c extends AbstractC10901d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f106634a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1546298730;
        }

        @NotNull
        public final String toString() {
            return "Success";
        }
    }

    /* renamed from: yg0.d$d, reason: collision with other inner class name */
    public static final class C2305d extends AbstractC10901d {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C2305d f106635a = new C2305d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C2305d);
        }

        public final int hashCode() {
            return -323133491;
        }

        @NotNull
        public final String toString() {
            return "WrongEnv";
        }
    }
}
