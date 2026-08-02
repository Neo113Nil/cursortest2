package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.EventListScoreTextView;
import com.sofascore.results.view.SofascoreSmallRatingView;
import com.sofascore.results.view.WDLView;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class r7 extends p8 {
    public final /* synthetic */ int c = 1;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(View view) {
        super(view);
        view.getClass();
        this.d = inb.h;
        this.e = ypa.a(ysa.c, new z0(this, 20));
    }

    public static void n(FrameLayout frameLayout, String str, boolean z, boolean z2) {
        frameLayout.getClass();
        str.getClass();
        frameLayout.setVisibility(0);
        dd e = dd.e(frameLayout);
        TextView textView = (TextView) e.d;
        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) e.c;
        if (z) {
            textView.setVisibility(8);
            sofascoreSmallRatingView.setVisibility(0);
            SofascoreSmallRatingView.l(sofascoreSmallRatingView, str);
        } else {
            sofascoreSmallRatingView.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(str);
            haa.C(textView);
            textView.setTypeface(Typeface.create(textView.getTypeface(), 0), z2 ? 1 : 0);
        }
    }

    @Override // defpackage.p8
    public void a(Object obj) {
        switch (this.c) {
            case 1:
                obj.getClass();
                if (!(obj instanceof scb)) {
                    if (obj instanceof ucb) {
                        EventListScoreTextView i = i();
                        Event event = ((ucb) obj).a;
                        f6a.h(i, new jfj(6, s9a.v(this.b, event, event.getHideDate()), (Integer) null), false, Boolean.FALSE);
                        break;
                    }
                } else {
                    BellButton g = g();
                    g.getClass();
                    ((inb) this.d).getClass();
                    inb.o(g, (scb) obj);
                    break;
                }
                break;
            default:
                super.a(obj);
                break;
        }
    }

    @Override // defpackage.p8
    public void b(int i, int i2, Object obj) {
        js2 js2Var = (js2) this.d;
        ImageView imageView = (ImageView) js2Var.e;
        ImageView imageView2 = (ImageView) js2Var.b;
        imageView2.setVisibility(((obj instanceof IRecent) && ((IRecent) obj).getIsRecent()) ? 0 : 8);
        imageView2.setOnClickListener(new u5(this, i, obj, 1));
        aik.Q(imageView).a();
        imageView.setImageTintList(null);
    }

    public void d(BellButton bellButton, WDLView wDLView, Event event, Integer num) {
        event.getClass();
        ((inb) this.d).getClass();
        inb.p(bellButton, wDLView, event, num);
    }

    public FrameLayout e() {
        FrameLayout frameLayout = (FrameLayout) dd.e(LayoutInflater.from(this.b).inflate(R.layout.player_league_career_stats_item_with_rating, (ViewGroup) ((z82) this.d).f, false)).b;
        frameLayout.getClass();
        return frameLayout;
    }

    public void f(Sport sport, boolean z) {
        js2 js2Var = (js2) this.d;
        ImageView imageView = (ImageView) js2Var.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) js2Var.n;
        TextView textView = (TextView) js2Var.o;
        ImageView imageView2 = (ImageView) js2Var.g;
        if (sport == null) {
            if (!z) {
                constraintLayout.setVisibility(8);
                return;
            }
            constraintLayout.setVisibility(0);
            imageView.setVisibility(8);
            textView.setVisibility(8);
            imageView2.setVisibility(8);
            return;
        }
        constraintLayout.setVisibility(0);
        imageView.setVisibility(z ? 0 : 8);
        textView.setVisibility(0);
        imageView2.setVisibility(0);
        String slug = sport.getSlug();
        Context context = this.b;
        textView.setText(wyh.c(context, slug));
        imageView2.setImageDrawable(context.getDrawable(wyh.a(sport.getSlug())));
        z8e.Y(imageView2, context, R.color.n_lv_3);
    }

    public abstract BellButton g();

    public b16 h() {
        return (b16) ((joa) this.e).getValue();
    }

    public abstract EventListScoreTextView i();

    public abstract View j();

    public abstract List k();

    public boolean l(int i, int i2, y21 y21Var) {
        return y21Var.n || i == i2 - 1;
    }

    public void m(y21 y21Var) {
        h().a();
        g().setVisibility(0);
        BellButton g = g();
        Event d = y21Var.d();
        wu wuVar = y21Var.k;
        if (wuVar == null) {
            wuVar = wu.MAIN_FAVORITES;
        }
        g.e(d, wuVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r7(z82 z82Var, tug tugVar) {
        super(r0);
        tugVar.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) z82Var.b;
        constraintLayout.getClass();
        this.d = z82Var;
        this.e = tugVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r7(js2 js2Var, Function2 function2) {
        super(r0);
        function2.getClass();
        LinearLayout linearLayout = (LinearLayout) js2Var.i;
        linearLayout.getClass();
        this.d = js2Var;
        this.e = function2;
    }
}
