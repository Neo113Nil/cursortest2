package com.vk.update.core;

import xsna.epx;
import xsna.oq;
import xsna.vu5;

/* compiled from: StatEvent.kt */
/* loaded from: classes6.dex */
public abstract class c {

    /* compiled from: StatEvent.kt */
    public static final class a extends c {
        public final long a;
        public final String b = "retryDownloading";

        public a(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("RetryDownloading(versionCode="));
        }
    }

    /* compiled from: StatEvent.kt */
    public static final class b extends c {
        public final long a;
        public final String b = "downloading";

        public b(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateDownloading(versionCode="));
        }
    }

    /* compiled from: StatEvent.kt */
    /* renamed from: com.vk.update.core.c$c, reason: collision with other inner class name */
    public static final class C1936c extends c {
        public final long a;
        public final String b = "downloadingError";

        public C1936c(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1936c) && this.a == ((C1936c) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateErrorDownloading(versionCode="));
        }
    }

    /* compiled from: StatEvent.kt */
    public static final class d extends c {
        public final long a;
        public final String b = "installed";

        public d(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateInstalled(versionCode="));
        }
    }

    /* compiled from: StatEvent.kt */
    public static final class e extends c {
        public final long a;
        public final Throwable b;
        public final String c = "installingError";

        public e(long j, Throwable th) {
            this.a = j;
            this.b = th;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.c;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateInstalledError(versionCode=");
            sb.append(this.a);
            sb.append(", error=");
            return oq.c(sb, this.b, ')');
        }
    }

    /* compiled from: StatEvent.kt */
    public static final class f extends c {
        public final long a;
        public final String b = "readyToDownload";

        public f(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateReadyToDownload(versionCode="));
        }
    }

    /* compiled from: StatEvent.kt */
    public static final class g extends c {
        public final long a;
        public final String b = "readyToInstall";

        public g(long j) {
            this.a = j;
        }

        @Override // com.vk.update.core.c
        public final String a() {
            return this.b;
        }

        @Override // com.vk.update.core.c
        public final long b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("UpdateReadyToInstall(versionCode="));
        }
    }

    public abstract String a();

    public abstract long b();
}
