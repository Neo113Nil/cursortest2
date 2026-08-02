package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class by8 extends ka4 {
    public final Handler b;
    public final int c;
    public final long d;
    public Bitmap e;

    public by8(Handler handler, int i, long j) {
        this.b = handler;
        this.c = i;
        this.d = j;
    }

    @Override // defpackage.ka4
    public final void a(Drawable drawable) {
        this.e = null;
    }

    @Override // defpackage.ka4
    public final void c(Object obj) {
        this.e = (Bitmap) obj;
        Handler handler = this.b;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.d);
    }
}
