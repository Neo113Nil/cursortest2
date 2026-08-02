package ec;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements b3.a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8877a;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialTextView f8878b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f8879c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f8880d;

    /* renamed from: e, reason: collision with root package name */
    public final AppCompatImageView f8881e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f8882f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f8883g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f8884h;

    public c(ConstraintLayout constraintLayout, MaterialTextView materialTextView, AppCompatImageView appCompatImageView, TextView textView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, TextView textView2, TextView textView3) {
        this.f8877a = constraintLayout;
        this.f8878b = materialTextView;
        this.f8879c = appCompatImageView;
        this.f8880d = textView;
        this.f8881e = appCompatImageView2;
        this.f8882f = appCompatImageView3;
        this.f8883g = textView2;
        this.f8884h = textView3;
    }

    @Override // b3.a
    public final View getRoot() {
        return this.f8877a;
    }
}
