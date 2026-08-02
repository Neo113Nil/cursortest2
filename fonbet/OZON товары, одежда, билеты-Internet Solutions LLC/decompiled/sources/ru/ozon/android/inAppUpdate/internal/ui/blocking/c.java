package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f83860a = new a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1353114677;
        }

        @NotNull
        public final String toString() {
            return "OnDownloadClicked";
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f83861a = new b(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1348624462;
        }

        @NotNull
        public final String toString() {
            return "OnDownloadInProgress";
        }
    }

    /* renamed from: ru.ozon.android.inAppUpdate.internal.ui.blocking.c$c, reason: collision with other inner class name */
    public static final class C1448c extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f83862a;

        public C1448c(boolean z11) {
            super(0);
            this.f83862a = z11;
        }

        public final boolean a() {
            return this.f83862a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1448c) && this.f83862a == ((C1448c) obj).f83862a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83862a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("OnDownloadResult(isSuccess="), this.f83862a);
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final d f83863a = new d(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 518368494;
        }

        @NotNull
        public final String toString() {
            return "OnInstallButtonClicked";
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f83864a;

        public e(boolean z11) {
            super(0);
            this.f83864a = z11;
        }

        public final boolean a() {
            return this.f83864a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f83864a == ((e) obj).f83864a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f83864a);
        }

        @NotNull
        public final String toString() {
            return Pk0.a.a(")", new StringBuilder("OnPermissionResult(isSuccess="), this.f83864a);
        }
    }

    public static final class f extends c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final f f83865a = new f(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 763955713;
        }

        @NotNull
        public final String toString() {
            return "OnRetryButtonClicked";
        }
    }

    public /* synthetic */ c(int i11) {
        this();
    }

    private c() {
    }
}
