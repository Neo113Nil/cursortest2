package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c9m implements krk {
    public final LinearLayout a;
    public final ImageView b;
    public final BlazeTextView c;

    public c9m(LinearLayout linearLayout, ImageView imageView, BlazeTextView blazeTextView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = blazeTextView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
