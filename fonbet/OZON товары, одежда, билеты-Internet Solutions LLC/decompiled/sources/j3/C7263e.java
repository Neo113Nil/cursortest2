package j3;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7263e {

    /* renamed from: b, reason: collision with root package name */
    public static final C7263e f69057b = new C7263e();

    /* renamed from: a, reason: collision with root package name */
    private b f69058a;

    /* renamed from: j3.e$a */
    /* loaded from: classes8.dex */
    private static final class a {
        public static void a(AudioAttributes.Builder builder) {
            builder.setIsContentSpatialized(false);
        }

        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder) {
            builder.setSpatializationBehavior(0);
        }
    }

    /* renamed from: j3.e$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f69059a;

        b(C7263e c7263e) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            c7263e.getClass();
            AudioAttributes.Builder usage = builder.setContentType(0).setFlags(0).setUsage(1);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            if (i11 >= 32) {
                a.b(usage);
                a.a(usage);
            }
            this.f69059a = usage.build();
        }
    }

    static {
        Pk0.h.f(0, 1, 2, 3, 4);
        m3.N.L(5);
    }

    C7263e() {
    }

    public final b a() {
        if (this.f69058a == null) {
            this.f69058a = new b(this);
        }
        return this.f69058a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7263e.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -2092275855;
    }
}
