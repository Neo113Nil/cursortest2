package fh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fh0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6566a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63435a;

    /* renamed from: fh0.a$a, reason: collision with other inner class name */
    public static final class C1022a extends AbstractC6566a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C1022a f63436b = new C1022a("DELIVERY_STATUS_HIDDEN_DUPLICATE");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1022a);
        }

        public final int hashCode() {
            return 1276273906;
        }

        @NotNull
        public final String toString() {
            return "HiddenDuplicate";
        }
    }

    /* renamed from: fh0.a$b */
    public static final class b extends AbstractC6566a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f63437b = new b("DELIVERY_STATUS_HIDDEN_TEENS_MODE");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -800142845;
        }

        @NotNull
        public final String toString() {
            return "HiddenTeensMode";
        }
    }

    /* renamed from: fh0.a$c */
    public static final class c extends AbstractC6566a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final c f63438b = new c("DELIVERY_STATUS_SHOWN");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1314814782;
        }

        @NotNull
        public final String toString() {
            return "Shown";
        }
    }

    public AbstractC6566a(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f63435a = status;
    }

    @NotNull
    public final String a() {
        return this.f63435a;
    }
}
