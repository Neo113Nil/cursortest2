package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.sofascore.results.event.EventActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o50 extends Animatable2.AnimationCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o50(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((p50) obj).a(drawable);
                break;
            default:
                EventActivity eventActivity = (EventActivity) obj;
                xw3.L(wca.x(eventActivity.getLifecycle()), null, null, new q3(eventActivity, null, 20), 3);
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((p50) this.b).b(drawable);
                break;
            default:
                super.onAnimationStart(drawable);
                break;
        }
    }
}
