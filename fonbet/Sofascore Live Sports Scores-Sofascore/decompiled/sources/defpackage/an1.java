package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class an1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GestureDetector b;

    public /* synthetic */ an1(GestureDetector gestureDetector, int i) {
        this.a = i;
        this.b = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        GestureDetector gestureDetector = this.b;
        switch (i) {
        }
        return gestureDetector.onTouchEvent(motionEvent);
    }
}
