package wg0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: wg0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC10555b {

    /* renamed from: wg0.b$a */
    public static final class a implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f104509a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1828685852;
        }

        @NotNull
        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* renamed from: wg0.b$b, reason: collision with other inner class name */
    public static final class C2261b implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f104510a;

        public C2261b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f104510a = value;
        }

        @NotNull
        public final String a() {
            return this.f104510a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2261b) && Intrinsics.d(this.f104510a, ((C2261b) obj).f104510a);
        }

        public final int hashCode() {
            return this.f104510a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("OnEventMessageChanged(value="), this.f104510a, ")");
        }
    }

    /* renamed from: wg0.b$c */
    public static final class c implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f104511a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1597881851;
        }

        @NotNull
        public final String toString() {
            return "OnNotificationDismiss";
        }
    }

    /* renamed from: wg0.b$d */
    public static final class d implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f104512a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 722968783;
        }

        @NotNull
        public final String toString() {
            return "OnSendFatalClicked";
        }
    }

    /* renamed from: wg0.b$e */
    public static final class e implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f104513a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 249883684;
        }

        @NotNull
        public final String toString() {
            return "OnSendNonFatalClicked";
        }
    }

    /* renamed from: wg0.b$f */
    public static final class f implements InterfaceC10555b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f104514a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 966493683;
        }

        @NotNull
        public final String toString() {
            return "OnStgStatusClicked";
        }
    }
}
