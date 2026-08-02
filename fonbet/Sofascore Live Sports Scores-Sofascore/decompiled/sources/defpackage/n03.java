package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n03 {
    public final WeakReference a;
    public final String b;

    public n03(View view, String str) {
        view.getClass();
        this.a = new WeakReference(view);
        this.b = str;
    }

    public final View a() {
        return (View) this.a.get();
    }
}
