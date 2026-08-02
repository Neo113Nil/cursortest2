package A8;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import s1.h;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f281a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f282b;

    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* renamed from: A8.b$b, reason: collision with other inner class name */
    public static final class C0008b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final long f283a;

        public C0008b(long j10) {
            this.f283a = j10;
        }

        @Override // A8.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // A8.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // A8.b.a
        public void c() {
            A8.a.i(this.f283a);
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final long f284a;

        /* renamed from: b, reason: collision with root package name */
        public final String f285b;

        /* renamed from: c, reason: collision with root package name */
        public final List f286c;

        public c(long j10, String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.f284a = j10;
            this.f285b = sectionName;
            this.f286c = new ArrayList();
        }

        @Override // A8.b.a
        public a a(String key, int i10) {
            Intrinsics.checkNotNullParameter(key, "key");
            d(key, String.valueOf(i10));
            return this;
        }

        @Override // A8.b.a
        public a b(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            d(key, value.toString());
            return this;
        }

        @Override // A8.b.a
        public void c() {
            String str;
            long j10 = this.f284a;
            String str2 = this.f285b;
            if (!b.f282b || this.f286c.isEmpty()) {
                str = "";
            } else {
                str = " (" + h.a(", ", this.f286c) + ")";
            }
            A8.a.c(j10, str2 + str);
        }

        public final void d(String str, String str2) {
            this.f286c.add(str + ": " + str2);
        }
    }

    public static final a a(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new c(j10, sectionName);
    }

    public static final a b(long j10) {
        return new C0008b(j10);
    }
}
