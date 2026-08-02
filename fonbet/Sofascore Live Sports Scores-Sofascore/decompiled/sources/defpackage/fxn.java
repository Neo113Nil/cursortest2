package defpackage;

import android.view.View;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fxn {
    public final int[] a = new int[2];

    public final JSONObject a(View view) {
        if (view == null) {
            return myn.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.a;
        view.getLocationOnScreen(iArr);
        return myn.a(iArr[0], iArr[1], width, height);
    }
}
