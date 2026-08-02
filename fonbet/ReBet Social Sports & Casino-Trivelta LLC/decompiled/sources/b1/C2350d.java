package b1;

import android.media.AudioAttributes;
import android.os.Build;
import e1.Z;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2350d {

    /* renamed from: h, reason: collision with root package name */
    public static final C2350d f24567h = new e().a();

    /* renamed from: i, reason: collision with root package name */
    public static final String f24568i = Z.K0(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24569j = Z.K0(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24570k = Z.K0(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24571l = Z.K0(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24572m = Z.K0(4);

    /* renamed from: n, reason: collision with root package name */
    public static final String f24573n = Z.K0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f24574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24576c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24577d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24579f;

    /* renamed from: g, reason: collision with root package name */
    public C0430d f24580g;

    /* renamed from: b1.d$b */
    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    /* renamed from: b1.d$c */
    public static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z10) {
            builder.setIsContentSpatialized(z10);
        }

        public static void b(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    /* renamed from: b1.d$d, reason: collision with other inner class name */
    public static final class C0430d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f24581a;

        public C0430d(C2350d c2350d) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2350d.f24574a).setFlags(c2350d.f24575b).setUsage(c2350d.f24576c);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                b.a(usage, c2350d.f24577d);
            }
            if (i10 >= 32) {
                c.b(usage, c2350d.f24578e);
                c.a(usage, c2350d.f24579f);
            }
            this.f24581a = usage.build();
        }
    }

    /* renamed from: b1.d$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f24582a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f24583b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f24584c = 1;

        /* renamed from: d, reason: collision with root package name */
        public int f24585d = 1;

        /* renamed from: e, reason: collision with root package name */
        public int f24586e = 0;

        /* renamed from: f, reason: collision with root package name */
        public boolean f24587f = false;

        public C2350d a() {
            return new C2350d(this.f24582a, this.f24583b, this.f24584c, this.f24585d, this.f24586e, this.f24587f);
        }

        public e b(int i10) {
            this.f24582a = i10;
            return this;
        }

        public e c(int i10) {
            this.f24584c = i10;
            return this;
        }
    }

    public C0430d a() {
        if (this.f24580g == null) {
            this.f24580g = new C0430d();
        }
        return this.f24580g;
    }

    public int b() {
        if ((this.f24575b & 1) == 1) {
            return 1;
        }
        switch (this.f24576c) {
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2350d.class == obj.getClass()) {
            C2350d c2350d = (C2350d) obj;
            if (this.f24574a == c2350d.f24574a && this.f24575b == c2350d.f24575b && this.f24576c == c2350d.f24576c && this.f24577d == c2350d.f24577d && this.f24578e == c2350d.f24578e && this.f24579f == c2350d.f24579f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f24574a) * 31) + this.f24575b) * 31) + this.f24576c) * 31) + this.f24577d) * 31) + this.f24578e) * 31) + (this.f24579f ? 1 : 0);
    }

    public C2350d(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this.f24574a = i10;
        this.f24575b = i11;
        this.f24576c = i12;
        this.f24577d = i13;
        this.f24578e = i14;
        this.f24579f = z10;
    }
}
