package ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86704a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String packageName) {
            super(0);
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            this.f86704a = packageName;
        }

        @NotNull
        public final String a() {
            return this.f86704a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86704a, ((a) obj).f86704a);
        }

        public final int hashCode() {
            return this.f86704a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("NoInternet(packageName="), this.f86704a, ")");
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f86705a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -828332391;
        }

        @NotNull
        public final String toString() {
            return "NoScreen";
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.composer.emptyscreen.widgetfactory.c$c, reason: collision with other inner class name */
    public static final class C1547c extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1547c f86706a = new C1547c(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1547c);
        }

        public final int hashCode() {
            return 77330820;
        }

        @NotNull
        public final String toString() {
            return "Other";
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f86707a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -441749814;
        }

        @NotNull
        public final String toString() {
            return "ServerIssue";
        }
    }

    public c(int i11) {
    }
}
