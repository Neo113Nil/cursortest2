package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class utk implements krk {
    public final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public final MediaView e;
    public final TextView f;
    public final TextView g;

    public utk(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, MediaView mediaView, TextView textView3, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = mediaView;
        this.f = textView3;
        this.g = textView4;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
