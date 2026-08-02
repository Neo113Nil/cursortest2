package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hq8 extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ hq8(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.a;
        Rect rect = this.b;
        switch (i) {
            case 0:
                break;
            default:
                if (rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
