package com.vk.rlottie;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.core.preference.Preference;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.bpn0;
import xsna.c5g;
import xsna.e43;
import xsna.ez3;
import xsna.fyf0;
import xsna.g5g;
import xsna.hon0;
import xsna.i5s;
import xsna.izs;
import xsna.j0;
import xsna.jz30;
import xsna.p31;
import xsna.r6m;
import xsna.s3q0;
import xsna.vb;
import xsna.wy3;
import xsna.yse0;

/* compiled from: RLottieDrawable.kt */
/* loaded from: classes5.dex */
public final class RLottieDrawable extends Drawable {
    public static final Handler r = new Handler(Looper.getMainLooper());
    public static final boolean s;
    public static final AtomicInteger t;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final izs<Canvas, s3q0> g;
    public final Handler h;
    public final ArrayList<WeakReference<View>> i;
    public final long j;
    public final ez3 k;
    public final hon0 l;
    public final wy3 m;
    public volatile fyf0 n;
    public volatile boolean o;
    public final j0 p;
    public final p31 q;

    static {
        boolean z;
        try {
            NativeLibLoader.j(NativeLibLoader.a, NativeLib.VK_RLOTTIE);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        s = z;
        t = new AtomicInteger(0);
    }

    public RLottieDrawable() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r2 >= 3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RLottieDrawable(String str, String str2, int i, int i2, String str3, boolean z, boolean z2, izs izsVar, int i3) {
        boolean z3;
        boolean z4;
        String e;
        String str4 = (i3 & 16) != 0 ? null : str3;
        boolean z5 = (i3 & 32) == 0;
        boolean z6 = (i3 & 64) != 0 ? false : z;
        boolean z7 = (i3 & 128) != 0 ? false : z2;
        izs izsVar2 = (i3 & 256) != 0 ? null : izsVar;
        this.a = str2;
        this.b = i;
        this.c = i2;
        this.d = str4;
        this.e = z5;
        this.f = z7;
        this.g = izsVar2;
        this.h = new Handler(Looper.getMainLooper());
        if (z5 && !z6 && (e = e()) != null && e.length() != 0) {
            if (yse0.c.a()) {
                r6m.a.getClass();
                long c = r6m.c();
                z3 = z5;
                long m = Preference.m(-1L, "stickers", "animated_stickers_avg_dropped_frames");
                if (c * 0.1d > 50.0d) {
                }
            } else {
                z3 = z5;
            }
            z4 = true;
            this.i = new ArrayList<>();
            int[] iArr = new int[3];
            long nativeCreateFromJson = nativeCreateFromJson(str, str2, e(), i, i2, iArr, z4);
            this.j = nativeCreateFromJson;
            ez3 ez3Var = new ez3(nativeCreateFromJson, iArr, z4, z6, new AtomicInteger(0), izsVar2, new AtomicBoolean(false), new AtomicBoolean(false), new AtomicBoolean(false), new AtomicBoolean(false), new Paint(2), new AtomicBoolean(iArr[2] != 1), z3);
            ez3Var.E = null;
            ez3Var.G = true;
            ez3Var.J = 11L;
            this.k = ez3Var;
            this.l = new hon0(ez3Var, this);
            wy3 wy3Var = new wy3(ez3Var, this);
            this.m = wy3Var;
            this.n = wy3Var;
            this.p = new j0(this, 13);
            this.q = new p31(this, 18);
            t.incrementAndGet();
        }
        z3 = z5;
        z4 = false;
        this.i = new ArrayList<>();
        int[] iArr2 = new int[3];
        long nativeCreateFromJson2 = nativeCreateFromJson(str, str2, e(), i, i2, iArr2, z4);
        this.j = nativeCreateFromJson2;
        ez3 ez3Var2 = new ez3(nativeCreateFromJson2, iArr2, z4, z6, new AtomicInteger(0), izsVar2, new AtomicBoolean(false), new AtomicBoolean(false), new AtomicBoolean(false), new AtomicBoolean(false), new Paint(2), new AtomicBoolean(iArr2[2] != 1), z3);
        ez3Var2.E = null;
        ez3Var2.G = true;
        ez3Var2.J = 11L;
        this.k = ez3Var2;
        this.l = new hon0(ez3Var2, this);
        wy3 wy3Var2 = new wy3(ez3Var2, this);
        this.m = wy3Var2;
        this.n = wy3Var2;
        this.p = new j0(this, 13);
        this.q = new p31(this, 18);
        t.incrementAndGet();
    }

    public static boolean d() {
        yse0.b.getClass();
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return true;
        }
        return !(Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeCreateCache(long j);

    private static final native long nativeCreateFromJson(String str, String str2, String str3, int i, int i2, int[] iArr, boolean z);

    private static final native void nativeDestroy(long j);

    private static final native int nativeGetFrame(long j, Bitmap bitmap, int i, boolean z);

    public final void b(View view) {
        if (view == null) {
            return;
        }
        ArrayList<WeakReference<View>> arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((View) ((WeakReference) it.next()).get());
        }
        if (arrayList2.contains(view)) {
            return;
        }
        g5g.D(arrayList, true, new jz30(9));
        arrayList.add(0, new WeakReference<>(view));
    }

    public final Bitmap c() {
        int i;
        int i2 = this.b;
        if (i2 == 0 || (i = this.c) == 0) {
            return null;
        }
        return Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.j == 0 || this.k.k.get() || this.k.j.get()) {
            return;
        }
        this.n.a(canvas, getBounds().left, getBounds().top);
        if (this.k.s || !d()) {
            return;
        }
        g();
    }

    public final String e() {
        String str = this.d;
        boolean z = this.e;
        if (!z || (str != null && str.length() != 0)) {
            if (!z || str == null || str.length() == 0) {
                return null;
            }
            return str;
        }
        bpn0 bpn0Var = yse0.a;
        if (yse0.d().a == null) {
            return null;
        }
        String str2 = yse0.d().a;
        if (str2 == null) {
            str2 = "";
        }
        File file = new File(str2);
        String str3 = this.f ? "_d" : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('_');
        sb.append(this.b);
        sb.append('_');
        sb.append(this.c);
        String a2 = i5s.a(sb, str3, ".scache");
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception unused) {
        }
        return yse0.d().a + '/' + a2;
    }

    public final int f(int i, Bitmap bitmap) {
        return nativeGetFrame(this.j, bitmap, i, this.o);
    }

    public final void finalize() {
        k();
    }

    public final void g() {
        Iterator<WeakReference<View>> it = this.i.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view != null) {
                view.invalidate();
            } else {
                it.remove();
            }
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        r.post(this.p);
    }

    public final void i() {
        this.k.s = true;
    }

    public final void j() {
        if (this.k.s && d()) {
            ez3 ez3Var = this.k;
            ez3Var.r = 0;
            ez3Var.s = false;
            this.n.c();
            g();
        }
    }

    public final void k() {
        int i;
        int i2;
        if (this.k.h.get() || this.k.i.get()) {
            this.k.j.set(true);
            return;
        }
        if (this.k.k.getAndSet(true)) {
            return;
        }
        try {
            long j = this.j;
            if (j != 0) {
                nativeDestroy(j);
            }
            ez3 ez3Var = this.k;
            Bitmap bitmap = ez3Var.E;
            if (bitmap != null) {
                bitmap.recycle();
            }
            ez3Var.E = null;
            Bitmap bitmap2 = ez3Var.f;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            ez3Var.f = null;
            if (!this.k.p.get() && (i2 = this.k.C) > 0) {
                yse0.f(i2);
            }
            if (t.decrementAndGet() == 0) {
                yse0.a();
            }
            this.k.D.dispose();
        } catch (Throwable th) {
            if (!this.k.p.get() && (i = this.k.C) > 0) {
                yse0.f(i);
            }
            if (t.decrementAndGet() == 0) {
                yse0.a();
            }
            throw th;
        }
    }

    public final void l() {
        yse0.d().b.execute(this.q);
    }

    public final void m() {
        this.h.post(new vb(this, 15));
    }

    public final void n(int i) {
        this.k.e.set(i);
        this.n.d(i);
    }

    public final void o(boolean z) {
        this.n = z ? this.l : this.m;
        this.o = z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k.o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.o.setColorFilter(colorFilter);
    }

    /* compiled from: RLottieDrawable.kt */
    public interface a {
        default void a() {
        }

        default void b() {
        }
    }
}
