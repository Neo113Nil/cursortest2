package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class i {

    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f83875a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -866033144;
        }

        @NotNull
        public final String toString() {
            return "CancelDownload";
        }
    }

    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f83876a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -770489918;
        }

        @NotNull
        public final String toString() {
            return "CheckPermissions";
        }
    }

    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f83877a = new c(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1361136025;
        }

        @NotNull
        public final String toString() {
            return "InstallApk";
        }
    }

    public static final class d extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f83878a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 635287032;
        }

        @NotNull
        public final String toString() {
            return "ObserveDownloadingApk";
        }
    }

    public static final class e extends i {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final e f83879a = new e(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1366255260;
        }

        @NotNull
        public final String toString() {
            return "StartDownload";
        }
    }

    public /* synthetic */ i(int i11) {
        this();
    }

    private i() {
    }
}
