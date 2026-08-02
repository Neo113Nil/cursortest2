package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.blocking.a$a, reason: collision with other inner class name */
    public static final class C1447a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1447a f83836a = new C1447a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1447a);
        }

        public final int hashCode() {
            return 1504455322;
        }

        @NotNull
        public final String toString() {
            return "Download";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f83837a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -633145034;
        }

        @NotNull
        public final String toString() {
            return "Error";
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f83838a;

        public c(boolean z11) {
            super(0);
            this.f83838a = z11;
        }

        public final boolean a() {
            return this.f83838a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f83838a == ((c) obj).f83838a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83838a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("InstallUpdate(isGooglePlay="), this.f83838a);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f83839a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1960903654;
        }

        @NotNull
        public final String toString() {
            return "UpdateRequired";
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
