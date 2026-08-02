package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ks8 implements krk {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final ConstraintLayout c;
    public final ImageView d;
    public final ImageView e;

    public ks8(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout3) {
        this.b = constraintLayout;
        this.d = imageView;
        this.e = imageView2;
        this.c = constraintLayout3;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public ks8(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, ImageView imageView2) {
        this.b = constraintLayout;
        this.c = constraintLayout3;
        this.d = imageView;
        this.e = imageView2;
    }
}
