package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class eoc implements krk {
    public final /* synthetic */ int a = 0;
    public final ConstraintLayout b;
    public final TextView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public eoc(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.c = textView;
        this.d = imageView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
    }

    public static eoc a(View view) {
        int i = R.id.barrier_opponent_name_start;
        if (((Guideline) nq8.B(R.id.barrier_opponent_name_start, view)) != null) {
            i = R.id.fighter_image;
            ImageView imageView = (ImageView) nq8.B(R.id.fighter_image, view);
            if (imageView != null) {
                i = R.id.fighter_name;
                TextView textView = (TextView) nq8.B(R.id.fighter_name, view);
                if (textView != null) {
                    i = R.id.last_fight_date;
                    TextView textView2 = (TextView) nq8.B(R.id.last_fight_date, view);
                    if (textView2 != null) {
                        i = R.id.last_fight_opponent;
                        TextView textView3 = (TextView) nq8.B(R.id.last_fight_opponent, view);
                        if (textView3 != null) {
                            i = R.id.last_fight_result;
                            TextView textView4 = (TextView) nq8.B(R.id.last_fight_result, view);
                            if (textView4 != null) {
                                i = R.id.rank;
                                TextView textView5 = (TextView) nq8.B(R.id.rank, view);
                                if (textView5 != null) {
                                    return new eoc((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        switch (this.a) {
        }
        return this.b;
    }

    public eoc(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.b = constraintLayout;
        this.d = imageView;
        this.c = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
    }
}
