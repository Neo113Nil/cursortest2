package androidx.media3.exoplayer;

import Ra.t;
import Ra.u;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import b1.C2350d;
import c1.C2483g;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t f20899a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20900b;

    /* renamed from: c, reason: collision with root package name */
    public a f20901c;

    /* renamed from: d, reason: collision with root package name */
    public C2350d f20902d;

    /* renamed from: f, reason: collision with root package name */
    public int f20904f;

    /* renamed from: h, reason: collision with root package name */
    public C2483g f20906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20907i;

    /* renamed from: g, reason: collision with root package name */
    public float f20905g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f20903e = 0;

    public interface a {
        void f(float f10);

        void g(int i10);
    }

    public b(final Context context, Looper looper, a aVar) {
        this.f20899a = u.a(new t() { // from class: m1.f
            @Override // Ra.t
            public final Object get() {
                AudioManager c10;
                c10 = c1.m.c(context);
                return c10;
            }
        });
        this.f20901c = aVar;
        this.f20900b = new Handler(looper);
    }

    public static int d(C2350d c2350d) {
        if (c2350d == null) {
            return 0;
        }
        switch (c2350d.f24576c) {
            case 0:
                AbstractC4156x.i("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c2350d.f24574a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                AbstractC4156x.i("AudioFocusManager", "Unidentified audio usage: " + c2350d.f24576c);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void c() {
        int i10 = this.f20903e;
        if (i10 == 1 || i10 == 0 || this.f20906h == null) {
            return;
        }
        c1.m.b((AudioManager) this.f20899a.get(), this.f20906h);
    }

    public final void e(int i10) {
        a aVar = this.f20901c;
        if (aVar != null) {
            aVar.g(i10);
        }
    }

    public float f() {
        return this.f20905g;
    }

    public final void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            AbstractC4156x.i("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public void h() {
        this.f20901c = null;
        c();
        l(0);
    }

    public final int i() {
        if (this.f20903e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    public final int j() {
        C2483g c2483g = this.f20906h;
        if (c2483g == null || this.f20907i) {
            this.f20906h = (c2483g == null ? new C2483g.b(this.f20904f) : c2483g.a()).b((C2350d) AbstractC4134a.e(this.f20902d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: m1.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    androidx.media3.exoplayer.b.this.g(i10);
                }
            }, this.f20900b).a();
            this.f20907i = false;
        }
        return c1.m.h((AudioManager) this.f20899a.get(), this.f20906h);
    }

    public void k(C2350d c2350d) {
        if (Objects.equals(this.f20902d, c2350d)) {
            return;
        }
        this.f20902d = c2350d;
        int d10 = d(c2350d);
        this.f20904f = d10;
        boolean z10 = true;
        if (d10 != 1 && d10 != 0) {
            z10 = false;
        }
        AbstractC4134a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void l(int i10) {
        if (this.f20903e == i10) {
            return;
        }
        this.f20903e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f20905g == f10) {
            return;
        }
        this.f20905g = f10;
        a aVar = this.f20901c;
        if (aVar != null) {
            aVar.f(f10);
        }
    }

    public final boolean m(int i10) {
        return i10 != 1 && this.f20904f == 1;
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f20903e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean o() {
        C2350d c2350d = this.f20902d;
        return c2350d != null && c2350d.f24574a == 1;
    }
}
