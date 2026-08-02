package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamRelativeLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.sofascore.results.R;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class msc extends y0 {
    public FiamRelativeLayout d;
    public ViewGroup e;
    public ScrollView f;
    public Button g;
    public View h;
    public ImageView i;
    public TextView j;
    public TextView k;
    public gtc l;
    public jc0 m;

    @Override // defpackage.y0
    public final mw9 e() {
        return (mw9) this.b;
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
        wa waVar;
        o72 o72Var;
        View inflate = ((LayoutInflater) this.c).inflate(R.layout.modal, (ViewGroup) null);
        this.f = (ScrollView) inflate.findViewById(R.id.body_scroll);
        this.g = (Button) inflate.findViewById(R.id.button);
        this.h = inflate.findViewById(R.id.collapse_button);
        this.i = (ImageView) inflate.findViewById(R.id.image_view);
        this.j = (TextView) inflate.findViewById(R.id.message_body);
        this.k = (TextView) inflate.findViewById(R.id.message_title);
        this.d = (FiamRelativeLayout) inflate.findViewById(R.id.modal_root);
        this.e = (ViewGroup) inflate.findViewById(R.id.modal_content_root);
        lw9 lw9Var = (lw9) this.a;
        if (lw9Var.a.equals(MessageType.MODAL)) {
            gtc gtcVar = (gtc) lw9Var;
            this.l = gtcVar;
            sr9 sr9Var = gtcVar.e;
            n7j n7jVar = gtcVar.d;
            n7j n7jVar2 = gtcVar.c;
            if (sr9Var == null || TextUtils.isEmpty(sr9Var.a)) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
            if (n7jVar2 != null) {
                String str = n7jVar2.b;
                String str2 = n7jVar2.a;
                boolean isEmpty = TextUtils.isEmpty(str2);
                TextView textView = this.k;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    this.k.setText(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.k.setTextColor(Color.parseColor(str));
                }
            }
            if (n7jVar != null) {
                String str3 = n7jVar.a;
                if (!TextUtils.isEmpty(str3)) {
                    this.f.setVisibility(0);
                    this.j.setVisibility(0);
                    this.j.setTextColor(Color.parseColor(n7jVar.b));
                    this.j.setText(str3);
                    waVar = this.l.f;
                    if (waVar != null || (o72Var = waVar.b) == null || TextUtils.isEmpty(o72Var.a.a)) {
                        this.g.setVisibility(8);
                    } else {
                        y0.o(this.g, o72Var);
                        Button button = this.g;
                        View.OnClickListener onClickListener = (View.OnClickListener) hashMap.get(this.l.f);
                        if (button != null) {
                            button.setOnClickListener(onClickListener);
                        }
                        this.g.setVisibility(0);
                    }
                    mw9 mw9Var = (mw9) this.b;
                    this.i.setMaxHeight(mw9Var.a());
                    this.i.setMaxWidth(mw9Var.b());
                    this.h.setOnClickListener(w38Var);
                    this.d.setDismissListener(w38Var);
                    y0.n(this.e, this.l.g);
                }
            }
            this.f.setVisibility(8);
            this.j.setVisibility(8);
            waVar = this.l.f;
            if (waVar != null) {
            }
            this.g.setVisibility(8);
            mw9 mw9Var2 = (mw9) this.b;
            this.i.setMaxHeight(mw9Var2.a());
            this.i.setMaxWidth(mw9Var2.b());
            this.h.setOnClickListener(w38Var);
            this.d.setDismissListener(w38Var);
            y0.n(this.e, this.l.g);
        }
        return this.m;
    }
}
