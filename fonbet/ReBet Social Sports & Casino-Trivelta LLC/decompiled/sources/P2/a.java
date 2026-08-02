package P2;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public abstract class a implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final Set f8711c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f8712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8713b;

    /* renamed from: P2.a$a, reason: collision with other inner class name */
    public static class C0174a {

        /* renamed from: a, reason: collision with root package name */
        public static final Set f8714a = new HashSet(Arrays.asList(v.d().a()));
    }

    public static class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return true;
        }
    }

    public static class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return true;
        }
    }

    public static class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return false;
        }
    }

    public static class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // P2.a
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f8712a = str;
        this.f8713b = str2;
        f8711c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(f8711c);
    }

    @Override // P2.j
    public String a() {
        return this.f8712a;
    }

    public abstract boolean b();

    public boolean c() {
        return AbstractC6757a.b(C0174a.f8714a, this.f8713b);
    }

    @Override // P2.j
    public boolean isSupported() {
        return b() || c();
    }
}
