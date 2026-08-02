package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class r51 implements Cloneable {
    public int a;
    public int d;
    public boolean i;
    public boolean m;
    public boolean n;
    public boolean p;
    public t35 b = t35.d;
    public k7f c = k7f.c;
    public boolean e = true;
    public int f = -1;
    public int g = -1;
    public pia h = sm5.b;
    public uvd j = new uvd();
    public pf2 k = new pf2(0);
    public Class l = Object.class;
    public boolean o = true;

    public static boolean f(int i, int i2) {
        return (i & i2) != 0;
    }

    public r51 a(r51 r51Var) {
        if (this.n) {
            return clone().a(r51Var);
        }
        int i = r51Var.a;
        if (f(r51Var.a, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.p = r51Var.p;
        }
        if (f(r51Var.a, 4)) {
            this.b = r51Var.b;
        }
        if (f(r51Var.a, 8)) {
            this.c = r51Var.c;
        }
        if (f(r51Var.a, 16)) {
            this.a &= -33;
        }
        if (f(r51Var.a, 32)) {
            this.a &= -17;
        }
        if (f(r51Var.a, 64)) {
            this.d = 0;
            this.a &= -129;
        }
        if (f(r51Var.a, 128)) {
            this.d = r51Var.d;
            this.a &= -65;
        }
        if (f(r51Var.a, NotificationCompat.FLAG_LOCAL_ONLY)) {
            this.e = r51Var.e;
        }
        if (f(r51Var.a, 512)) {
            this.g = r51Var.g;
            this.f = r51Var.f;
        }
        if (f(r51Var.a, 1024)) {
            this.h = r51Var.h;
        }
        if (f(r51Var.a, 4096)) {
            this.l = r51Var.l;
        }
        if (f(r51Var.a, 8192)) {
            this.a &= -16385;
        }
        if (f(r51Var.a, 16384)) {
            this.a &= -8193;
        }
        if (f(r51Var.a, 131072)) {
            this.i = r51Var.i;
        }
        if (f(r51Var.a, a.o)) {
            this.k.putAll(r51Var.k);
            this.o = r51Var.o;
        }
        this.a |= r51Var.a;
        this.j.b.h(r51Var.j.b);
        k();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r51 clone() {
        try {
            r51 r51Var = (r51) super.clone();
            uvd uvdVar = new uvd();
            r51Var.j = uvdVar;
            uvdVar.b.h(this.j.b);
            pf2 pf2Var = new pf2(0);
            r51Var.k = pf2Var;
            pf2Var.putAll(this.k);
            r51Var.m = false;
            r51Var.n = false;
            return r51Var;
        } catch (CloneNotSupportedException e) {
            is8.h(e);
            return null;
        }
    }

    public final r51 c(Class cls) {
        if (this.n) {
            return clone().c(cls);
        }
        this.l = cls;
        this.a |= 4096;
        k();
        return this;
    }

    public final r51 d(t35 t35Var) {
        if (this.n) {
            return clone().d(t35Var);
        }
        this.b = t35Var;
        this.a |= 4;
        k();
        return this;
    }

    public final boolean e(r51 r51Var) {
        r51Var.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.d == r51Var.d && this.e == r51Var.e && this.f == r51Var.f && this.g == r51Var.g && this.i == r51Var.i && this.b.equals(r51Var.b) && this.c == r51Var.c && this.j.equals(r51Var.j) && this.k.equals(r51Var.k) && this.l.equals(r51Var.l) && this.h.equals(r51Var.h);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r51) {
            return e((r51) obj);
        }
        return false;
    }

    public final r51 g(int i, int i2) {
        if (this.n) {
            return clone().g(i, i2);
        }
        this.g = i;
        this.f = i2;
        this.a |= 512;
        k();
        return this;
    }

    public int hashCode() {
        return kik.E(kik.E(kik.E(kik.E(kik.E(kik.E(kik.E(kik.D(0, kik.D(0, kik.D(1, kik.D(this.i ? 1 : 0, kik.D(this.g, kik.D(this.f, kik.D(this.e ? 1 : 0, kik.E(kik.D(0, kik.E(kik.D(this.d, kik.E(kik.D(0, kik.D(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.b), this.c), this.j), this.k), this.l), this.h), null);
    }

    public final r51 i() {
        if (this.n) {
            return clone().i();
        }
        this.d = R.drawable.image_placeholder;
        this.a = (this.a | 128) & (-65);
        k();
        return this;
    }

    public final r51 j() {
        if (this.n) {
            return clone().j();
        }
        this.c = k7f.d;
        this.a |= 8;
        k();
        return this;
    }

    public final void k() {
        if (this.m) {
            a70.r("You cannot modify locked T, consider clone()");
        }
    }

    public final r51 l(ivd ivdVar) {
        if (this.n) {
            return clone().l(ivdVar);
        }
        w1a.l(ivdVar);
        this.j.b.put(ivdVar, rl4.a);
        k();
        return this;
    }

    public final r51 m(wjd wjdVar) {
        if (this.n) {
            return clone().m(wjdVar);
        }
        this.h = wjdVar;
        this.a |= 1024;
        k();
        return this;
    }

    public final r51 n() {
        if (this.n) {
            return clone().n();
        }
        this.e = false;
        this.a |= NotificationCompat.FLAG_LOCAL_ONLY;
        k();
        return this;
    }

    public final r51 o(Class cls, bwj bwjVar) {
        if (this.n) {
            return clone().o(cls, bwjVar);
        }
        this.k.put(cls, bwjVar);
        int i = this.a;
        this.o = false;
        this.a = i | 198656;
        this.i = true;
        k();
        return this;
    }

    public final r51 p() {
        if (this.n) {
            return clone().p();
        }
        ab5 ab5Var = new ab5();
        o(Bitmap.class, abk.b);
        o(Drawable.class, ab5Var);
        o(BitmapDrawable.class, ab5Var);
        o(xx8.class, new zx8());
        k();
        return this;
    }

    public final r51 q() {
        if (this.n) {
            return clone().q();
        }
        this.p = true;
        this.a |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        k();
        return this;
    }
}
