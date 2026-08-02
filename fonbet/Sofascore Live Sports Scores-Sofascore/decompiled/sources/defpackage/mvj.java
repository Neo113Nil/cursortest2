package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mvj implements krk {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final LinearLayout c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;

    public mvj(ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.b = constraintLayout;
        this.c = linearLayout;
        this.d = textView;
        this.e = imageView;
        this.f = textView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public mvj(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2) {
        this.b = constraintLayout;
        this.d = textView;
        this.c = linearLayout;
        this.e = imageView;
        this.f = textView2;
    }
}
