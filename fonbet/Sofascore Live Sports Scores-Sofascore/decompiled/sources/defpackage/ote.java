package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ote extends o8 {
    public final vy1 d;
    public final LayoutInflater e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ote(Context context) {
        super(context, null, 0);
        context.getClass();
        vy1 a = vy1.a(getRoot());
        this.d = a;
        this.e = LayoutInflater.from(context);
        setVisibility(8);
        a.b.setClipToOutline(true);
    }

    public final void a(Event event) {
        if (getVisibility() == 0) {
            return;
        }
        setVisibility(0);
        Player manOfMatch = event.getManOfMatch();
        if (manOfMatch != null) {
            cv1 e = cv1.e(this.e, this.d.b);
            ImageView imageView = e.e;
            e.f.setText(tba.t(manOfMatch));
            TextView textView = e.d;
            Context context = getContext();
            context.getClass();
            textView.setText(hkg.Q(context, R.string.player_of_the_match, manOfMatch.getGender(), new Object[0]));
            imageView.setImageResource(R.drawable.ic_player_16);
            imageView.setImageTintList(ColorStateList.valueOf(getContext().getColor(R.color.n_lv_1)));
            e.b.setOnClickListener(new qh(this, manOfMatch, event));
        }
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.summary_info_layout;
    }
}
