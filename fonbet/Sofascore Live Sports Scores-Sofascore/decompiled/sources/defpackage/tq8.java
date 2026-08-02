package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.results.profile.view.UserBadgesGridView;
import com.sofascore.results.view.SofaTextInputLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tq8 implements krk {
    public final ScrollView a;
    public final TextView b;
    public final MaterialButton c;
    public final TextInputEditText d;
    public final CardView e;
    public final SofaTextInputLayout f;
    public final ImageView g;
    public final ImageView h;
    public final UserBadgesGridView i;

    public tq8(ScrollView scrollView, TextView textView, MaterialButton materialButton, TextInputEditText textInputEditText, CardView cardView, SofaTextInputLayout sofaTextInputLayout, ImageView imageView, ImageView imageView2, UserBadgesGridView userBadgesGridView) {
        this.a = scrollView;
        this.b = textView;
        this.c = materialButton;
        this.d = textInputEditText;
        this.e = cardView;
        this.f = sofaTextInputLayout;
        this.g = imageView;
        this.h = imageView2;
        this.i = userBadgesGridView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
