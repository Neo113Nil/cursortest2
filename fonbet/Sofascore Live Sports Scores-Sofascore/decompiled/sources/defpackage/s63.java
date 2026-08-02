package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s63 implements krk {
    public final /* synthetic */ int a = 1;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;

    public s63(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2) {
        this.b = constraintLayout;
        this.d = textView;
        this.c = imageView;
        this.e = imageView2;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public s63(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2) {
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView;
        this.e = imageView2;
    }
}
