package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yk2 implements krk {
    public final FrameLayout a;
    public final ImageView b;

    public yk2(FrameLayout frameLayout, ImageView imageView, TextView textView) {
        this.a = frameLayout;
        this.b = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
