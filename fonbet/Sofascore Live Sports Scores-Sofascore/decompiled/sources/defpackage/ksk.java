package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ksk implements krk {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final LinearLayout d;
    public final ImageView e;

    public ksk(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
        this.d = linearLayout4;
        this.e = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
