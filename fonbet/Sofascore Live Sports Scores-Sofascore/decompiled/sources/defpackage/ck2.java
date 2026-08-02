package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamCardView;
import com.google.firebase.inappmessaging.model.MessageType;
import com.sofascore.results.R;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ck2 extends y0 {
    public FiamCardView d;
    public d51 e;
    public ScrollView f;
    public Button g;
    public Button h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public jk2 l;
    public w38 m;
    public jc0 n;

    @Override // defpackage.y0
    public final mw9 e() {
        return (mw9) this.b;
    }

    @Override // defpackage.y0
    public final View.OnClickListener f() {
        return this.m;
    }

    @Override // defpackage.y0
    public final ImageView h() {
        return this.i;
    }

    @Override // defpackage.y0
    public final ViewGroup i() {
        return this.d;
    }

    @Override // defpackage.y0
    public final ViewTreeObserver.OnGlobalLayoutListener j(HashMap hashMap, w38 w38Var) {
        o72 o72Var;
        String str;
        View inflate = ((LayoutInflater) this.c).inflate(R.layout.card, (ViewGroup) null);
        this.f = (ScrollView) inflate.findViewById(R.id.body_scroll);
        this.g = (Button) inflate.findViewById(R.id.primary_button);
        this.h = (Button) inflate.findViewById(R.id.secondary_button);
        this.i = (ImageView) inflate.findViewById(R.id.image_view);
        this.j = (TextView) inflate.findViewById(R.id.message_body);
        this.k = (TextView) inflate.findViewById(R.id.message_title);
        this.d = (FiamCardView) inflate.findViewById(R.id.card_root);
        this.e = (d51) inflate.findViewById(R.id.card_content_root);
        lw9 lw9Var = (lw9) this.a;
        if (lw9Var.a.equals(MessageType.CARD)) {
            jk2 jk2Var = (jk2) lw9Var;
            n7j n7jVar = jk2Var.c;
            this.l = jk2Var;
            this.k.setText(n7jVar.a);
            this.k.setTextColor(Color.parseColor(n7jVar.b));
            n7j n7jVar2 = jk2Var.d;
            if (n7jVar2 == null || (str = n7jVar2.a) == null) {
                this.f.setVisibility(8);
                this.j.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.j.setVisibility(0);
                this.j.setText(str);
                this.j.setTextColor(Color.parseColor(n7jVar2.b));
            }
            jk2 jk2Var2 = this.l;
            if (jk2Var2.h == null && jk2Var2.i == null) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
            jk2 jk2Var3 = this.l;
            wa waVar = jk2Var3.f;
            wa waVar2 = jk2Var3.g;
            y0.o(this.g, waVar.b);
            Button button = this.g;
            View.OnClickListener onClickListener = (View.OnClickListener) hashMap.get(waVar);
            if (button != null) {
                button.setOnClickListener(onClickListener);
            }
            this.g.setVisibility(0);
            if (waVar2 == null || (o72Var = waVar2.b) == null) {
                this.h.setVisibility(8);
            } else {
                y0.o(this.h, o72Var);
                Button button2 = this.h;
                View.OnClickListener onClickListener2 = (View.OnClickListener) hashMap.get(waVar2);
                if (button2 != null) {
                    button2.setOnClickListener(onClickListener2);
                }
                this.h.setVisibility(0);
            }
            mw9 mw9Var = (mw9) this.b;
            this.i.setMaxHeight(mw9Var.a());
            this.i.setMaxWidth(mw9Var.b());
            this.m = w38Var;
            this.d.setDismissListener(w38Var);
            y0.n(this.e, this.l.e);
        }
        return this.n;
    }
}
