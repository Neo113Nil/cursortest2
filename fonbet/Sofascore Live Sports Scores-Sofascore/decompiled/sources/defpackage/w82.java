package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w82 implements krk {
    public final /* synthetic */ int a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public w82(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.a = 0;
        this.b = constraintLayout;
        this.d = textView;
        this.e = textView2;
        this.c = imageView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ w82(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, int i) {
        this.a = i;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.e = textView2;
    }
}
