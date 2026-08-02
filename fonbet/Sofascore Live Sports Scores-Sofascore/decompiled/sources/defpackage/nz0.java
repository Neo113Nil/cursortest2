package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.view.MmaRoundInfoView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nz0 implements krk {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;
    public final View e;

    public nz0(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout) {
        this.b = constraintLayout;
        this.c = imageView;
        this.e = view;
        this.d = textView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public nz0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, View view, MmaRoundInfoView mmaRoundInfoView, ImageView imageView4, ImageView imageView5, TextView textView3, jlc jlcVar, TextView textView4, lsc lscVar, lsc lscVar2) {
        this.b = constraintLayout;
        this.c = imageView;
        this.d = textView2;
        this.e = view;
    }
}
