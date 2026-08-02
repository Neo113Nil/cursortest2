package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c {
    public static final int a = 0;

    public static final class a extends c {
        public static final int c = 8;
        public final File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.b = file;
        }

        public final File a() {
            return this.b;
        }

        public final File b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.b, ((a) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Complete(file=" + this.b + ')';
        }

        public final a a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new a(file);
        }

        public static /* synthetic */ a a(a aVar, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                file = aVar.b;
            }
            return aVar.a(file);
        }
    }

    public static final class b extends c {
        public static final int c = 0;
        public final i.a.AbstractC0292a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i.a.AbstractC0292a failure) {
            super(null);
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.b = failure;
        }

        public final i.a.AbstractC0292a a() {
            return this.b;
        }

        public final i.a.AbstractC0292a b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.b, ((b) obj).b);
        }

        public int hashCode() {
            return this.b.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.b + ')';
        }

        public final b a(i.a.AbstractC0292a failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new b(failure);
        }

        public static /* synthetic */ b a(b bVar, i.a.AbstractC0292a abstractC0292a, int i, Object obj) {
            if ((i & 1) != 0) {
                abstractC0292a = bVar.b;
            }
            return bVar.a(abstractC0292a);
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c$c, reason: collision with other inner class name */
    public static final class C0295c extends c {
        public static final int d = 8;
        public final File b;
        public final d c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0295c(File file, d progress) {
            super(null);
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            this.b = file;
            this.c = progress;
        }

        public final File a() {
            return this.b;
        }

        public final d b() {
            return this.c;
        }

        public final File c() {
            return this.b;
        }

        public final d d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0295c)) {
                return false;
            }
            C0295c c0295c = (C0295c) obj;
            return Intrinsics.areEqual(this.b, c0295c.b) && Intrinsics.areEqual(this.c, c0295c.c);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "InProgress(file=" + this.b + ", progress=" + this.c + ')';
        }

        public final C0295c a(File file, d progress) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(progress, "progress");
            return new C0295c(file, progress);
        }

        public static /* synthetic */ C0295c a(C0295c c0295c, File file, d dVar, int i, Object obj) {
            if ((i & 1) != 0) {
                file = c0295c.b;
            }
            if ((i & 2) != 0) {
                dVar = c0295c.c;
            }
            return c0295c.a(file, dVar);
        }
    }

    public static final class d {
        public static final int c = 0;
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final long a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        public final long d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (Long.hashCode(this.a) * 31) + Long.hashCode(this.b);
        }

        public String toString() {
            return "Progress(bytesDownloaded=" + this.a + ", totalBytes=" + this.b + ')';
        }

        public final d a(long j, long j2) {
            return new d(j, j2);
        }

        public static /* synthetic */ d a(d dVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dVar.a;
            }
            if ((i & 2) != 0) {
                j2 = dVar.b;
            }
            return dVar.a(j, j2);
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public c() {
    }
}
