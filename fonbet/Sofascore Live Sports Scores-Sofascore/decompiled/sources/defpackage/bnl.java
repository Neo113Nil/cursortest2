package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.Y5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class bnl implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Y5 b;

    public /* synthetic */ bnl(Y5 y5, int i) {
        this.a = i;
        this.b = y5;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        Y5 y5 = this.b;
        switch (i) {
            case 0:
                return Y5.d(y5, view, motionEvent);
            case 1:
                return Y5.b(y5, view, motionEvent);
            case 2:
                return Y5.a(y5, view, motionEvent);
            default:
                return Y5.c(y5, view, motionEvent);
        }
    }
}
