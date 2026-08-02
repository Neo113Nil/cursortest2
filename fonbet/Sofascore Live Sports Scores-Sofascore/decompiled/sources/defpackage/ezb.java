package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ezb implements krk {
    public final LinearLayout a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final ViewPager2 e;

    public ezb(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, ViewPager2 viewPager2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = viewPager2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
