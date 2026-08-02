package z4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f68578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68579b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f68580c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68581d;

    public static final class a {

        /* renamed from: i, reason: collision with root package name */
        public static final int f68582i;

        /* renamed from: a, reason: collision with root package name */
        public final Context f68583a;

        /* renamed from: b, reason: collision with root package name */
        public ActivityManager f68584b;

        /* renamed from: c, reason: collision with root package name */
        public c f68585c;

        /* renamed from: e, reason: collision with root package name */
        public float f68587e;

        /* renamed from: d, reason: collision with root package name */
        public float f68586d = 2.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f68588f = 0.4f;

        /* renamed from: g, reason: collision with root package name */
        public float f68589g = 0.33f;

        /* renamed from: h, reason: collision with root package name */
        public int f68590h = 4194304;

        static {
            f68582i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f68587e = f68582i;
            this.f68583a = context;
            this.f68584b = (ActivityManager) context.getSystemService("activity");
            this.f68585c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f68584b)) {
                return;
            }
            this.f68587e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f68591a;

        public b(DisplayMetrics displayMetrics) {
            this.f68591a = displayMetrics;
        }

        @Override // z4.i.c
        public int a() {
            return this.f68591a.heightPixels;
        }

        @Override // z4.i.c
        public int b() {
            return this.f68591a.widthPixels;
        }
    }

    public interface c {
        int a();

        int b();
    }

    public i(a aVar) {
        this.f68580c = aVar.f68583a;
        int i10 = e(aVar.f68584b) ? aVar.f68590h / 2 : aVar.f68590h;
        this.f68581d = i10;
        int c10 = c(aVar.f68584b, aVar.f68588f, aVar.f68589g);
        float b10 = aVar.f68585c.b() * aVar.f68585c.a() * 4;
        int round = Math.round(aVar.f68587e * b10);
        int round2 = Math.round(b10 * aVar.f68586d);
        int i11 = c10 - i10;
        if (round2 + round <= i11) {
            this.f68579b = round2;
            this.f68578a = round;
        } else {
            float f10 = i11;
            float f11 = aVar.f68587e;
            float f12 = aVar.f68586d;
            float f13 = f10 / (f11 + f12);
            this.f68579b = Math.round(f12 * f13);
            this.f68578a = Math.round(f13 * aVar.f68587e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            f(this.f68579b);
            f(this.f68578a);
            f(i10);
            f(c10);
            aVar.f68584b.getMemoryClass();
            e(aVar.f68584b);
        }
    }

    public static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * PKIFailureInfo.badCertTemplate;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f68581d;
    }

    public int b() {
        return this.f68578a;
    }

    public int d() {
        return this.f68579b;
    }

    public final String f(int i10) {
        return Formatter.formatFileSize(this.f68580c, i10);
    }
}
