package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vq4 {
    public final HashMap a;
    public zz0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public Boolean p;

    public vq4() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put(cse.c.a, 144179200);
        this.c = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.d = 1000;
        this.e = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.f = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.g = 1000;
        this.h = 1000;
        this.i = 2000;
        this.j = 1000;
        this.k = false;
        this.l = true;
        this.m = 0;
        this.n = false;
    }

    public final yq4 a() {
        z1a.E(!this.o);
        this.o = true;
        if (this.b == null) {
            this.b = new zz0(5);
        }
        Boolean bool = this.p;
        if (bool != null && bool.booleanValue()) {
            this.d = this.c;
            this.f = this.e;
            this.h = this.g;
            this.j = this.i;
            this.l = this.k;
        }
        return new yq4(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.a);
    }

    public final void b(int i, int i2, int i3, int i4) {
        z1a.E(!this.o);
        yq4.a(i3, 0, "bufferForPlaybackMs", "0");
        yq4.a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        yq4.a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        yq4.a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        yq4.a(i2, i, "maxBufferMs", "minBufferMs");
        this.c = i;
        this.e = i2;
        this.g = i3;
        this.i = i4;
        this.d = i;
        this.f = i2;
        this.h = i3;
        this.j = i4;
        if (this.p == null) {
            this.p = Boolean.TRUE;
        }
    }

    public final void c() {
        z1a.E(!this.o);
        this.k = true;
        this.l = true;
        if (this.p == null) {
            this.p = Boolean.TRUE;
        }
    }
}
