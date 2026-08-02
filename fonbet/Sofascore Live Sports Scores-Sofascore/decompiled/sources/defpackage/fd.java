package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.results.view.SofaTextInputLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fd implements krk {
    public final CoordinatorLayout a;
    public final TextView b;
    public final TextInputEditText c;
    public final SofaTextInputLayout d;
    public final TextInputEditText e;
    public final SofaTextInputLayout f;
    public final ShapeableImageView g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final MaterialButton k;
    public final ViewStub l;

    public fd(CoordinatorLayout coordinatorLayout, TextView textView, TextInputEditText textInputEditText, SofaTextInputLayout sofaTextInputLayout, TextInputEditText textInputEditText2, SofaTextInputLayout sofaTextInputLayout2, ShapeableImageView shapeableImageView, ImageView imageView, ImageView imageView2, TextView textView2, MaterialButton materialButton, ViewStub viewStub) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = textInputEditText;
        this.d = sofaTextInputLayout;
        this.e = textInputEditText2;
        this.f = sofaTextInputLayout2;
        this.g = shapeableImageView;
        this.h = imageView;
        this.i = imageView2;
        this.j = textView2;
        this.k = materialButton;
        this.l = viewStub;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
