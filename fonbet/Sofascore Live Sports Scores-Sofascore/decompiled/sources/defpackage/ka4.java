package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ka4 implements s6b {
    public rzf a;

    public ka4() {
        if (kik.I(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            return;
        }
        a70.p("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        throw null;
    }

    public abstract void a(Drawable drawable);

    public abstract void c(Object obj);

    @Override // defpackage.s6b
    public final void onDestroy() {
    }

    @Override // defpackage.s6b
    public final void onStart() {
    }

    @Override // defpackage.s6b
    public final void onStop() {
    }

    public void b(Drawable drawable) {
    }
}
