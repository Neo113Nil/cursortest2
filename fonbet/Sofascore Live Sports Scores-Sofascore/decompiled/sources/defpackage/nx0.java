package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nx0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nx0(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        backEvent.getClass();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat(touchX=");
        sb.append(this.a);
        sb.append(", touchY=");
        sb.append(this.b);
        sb.append(", progress=");
        sb.append(this.c);
        sb.append(", swipeEdge=");
        sb.append(this.d);
        sb.append(", frameTimeMillis=");
        return fn0.n(sb, this.e, ')');
    }

    public nx0(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nx0(e8d e8dVar) {
        this(e8dVar.c, e8dVar.d, e8dVar.b, e8dVar.a, e8dVar.e);
        e8dVar.getClass();
    }
}
