package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class kwg extends r7 {
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwg(js2 js2Var, fvg fvgVar) {
        super(js2Var, fvgVar);
        fvgVar.getClass();
        this.f = this.b.getColor(R.color.n_lv_3);
    }

    @Override // defpackage.r7, defpackage.p8
    public final void b(int i, int i2, Object obj) {
        Manager manager = (Manager) obj;
        manager.getClass();
        super.b(i, i2, manager);
        js2 js2Var = (js2) this.d;
        ImageView imageView = (ImageView) js2Var.c;
        ImageView imageView2 = (ImageView) js2Var.e;
        TextView textView = (TextView) js2Var.m;
        as9.g(imageView, manager.getId());
        Object[] objArr = {tba.s(manager)};
        Context context = this.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.search_manager, objArr));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f);
        int length = tba.s(manager).length() + 1;
        int length2 = spannableStringBuilder.length();
        if (length > length2) {
            length = length2;
        }
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 0);
        ((TextView) js2Var.l).setText(spannableStringBuilder);
        Team team = manager.getTeam();
        if (team == null) {
            imageView2.setVisibility(8);
            textView.setVisibility(8);
            f(manager.getSport(), false);
        } else {
            imageView2.setVisibility(0);
            as9.o(imageView2, team.getId());
            textView.setVisibility(0);
            textView.setText(tba.p(context, team));
            f(manager.getSport(), true);
        }
    }
}
