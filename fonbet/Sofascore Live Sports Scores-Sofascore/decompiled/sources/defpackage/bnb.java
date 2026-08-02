package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.inmobi.media.C3475hi;
import com.inmobi.media.M0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class bnb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ M0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ C3475hi e;
    public final /* synthetic */ KeyEvent.Callback f;

    public /* synthetic */ bnb(M0 m0, KeyEvent.Callback callback, long j, boolean z, C3475hi c3475hi, int i) {
        this.a = i;
        this.b = m0;
        this.f = callback;
        this.c = j;
        this.d = z;
        this.e = c3475hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        KeyEvent.Callback callback = this.f;
        switch (i) {
            case 0:
                boolean z = this.d;
                C3475hi c3475hi = this.e;
                M0.a(this.b, (View) callback, this.c, z, c3475hi);
                break;
            default:
                boolean z2 = this.d;
                C3475hi c3475hi2 = this.e;
                M0.a(this.b, (Activity) callback, this.c, z2, c3475hi2);
                break;
        }
    }
}
