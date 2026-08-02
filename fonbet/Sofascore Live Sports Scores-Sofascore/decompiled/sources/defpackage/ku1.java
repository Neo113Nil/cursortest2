package defpackage;

import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ku1 extends p8 {
    public final pu1 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ku1(pu1 pu1Var) {
        super(r0);
        LinearLayout linearLayout = pu1Var.b;
        linearLayout.getClass();
        this.c = pu1Var;
        ImageView imageView = pu1Var.c;
        as9.k(imageView, 1);
        aba.y(imageView, 0, 3);
        z8e.a0(imageView, 1000L, new ju1(imageView, 0));
        pu1Var.e.setOnClickListener(new s0(this, 8));
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        ((hu1) obj).getClass();
        this.c.d.setText(this.b.getString(R.string.bet_boost_offer_sign_up));
    }
}
