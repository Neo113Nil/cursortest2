package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.inappmessaging.display.internal.ResizableImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.sofascore.results.R;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uz0 extends y0 {
    public FiamFrameLayout d;
    public ViewGroup e;
    public TextView f;
    public ResizableImageView g;
    public TextView h;
    public w38 i;

    @Override // defpackage.y0
    public final mw9 e() {
        return (mw9) this.b;
    }

    @Override // defpackage.y0
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.y0
    public final ImageView h() {
        return this.g;
    }

    @Override // defpackage.y0
    public final ViewGroup i() {
        return this.d;
    }

    @Override // defpackage.y0
    public final ViewTreeObserver.OnGlobalLayoutListener j(HashMap hashMap, w38 w38Var) {
        View inflate = ((LayoutInflater) this.c).inflate(R.layout.banner, (ViewGroup) null);
        this.d = (FiamFrameLayout) inflate.findViewById(R.id.banner_root);
        this.e = (ViewGroup) inflate.findViewById(R.id.banner_content_root);
        this.f = (TextView) inflate.findViewById(R.id.banner_body);
        this.g = (ResizableImageView) inflate.findViewById(R.id.banner_image);
        this.h = (TextView) inflate.findViewById(R.id.banner_title);
        lw9 lw9Var = (lw9) this.a;
        if (lw9Var.a.equals(MessageType.BANNER)) {
            wz0 wz0Var = (wz0) lw9Var;
            String str = wz0Var.g;
            n7j n7jVar = wz0Var.d;
            n7j n7jVar2 = wz0Var.c;
            if (!TextUtils.isEmpty(str)) {
                y0.n(this.e, str);
            }
            ResizableImageView resizableImageView = this.g;
            sr9 sr9Var = wz0Var.e;
            resizableImageView.setVisibility((sr9Var == null || TextUtils.isEmpty(sr9Var.a)) ? 8 : 0);
            if (n7jVar2 != null) {
                String str2 = n7jVar2.b;
                String str3 = n7jVar2.a;
                if (!TextUtils.isEmpty(str3)) {
                    this.h.setText(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.h.setTextColor(Color.parseColor(str2));
                }
            }
            if (n7jVar != null) {
                String str4 = n7jVar.b;
                String str5 = n7jVar.a;
                if (!TextUtils.isEmpty(str5)) {
                    this.f.setText(str5);
                }
                if (!TextUtils.isEmpty(str4)) {
                    this.f.setTextColor(Color.parseColor(str4));
                }
            }
            mw9 mw9Var = (mw9) this.b;
            int min = Math.min(mw9Var.d.intValue(), mw9Var.c.intValue());
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            }
            layoutParams.width = min;
            this.d.setLayoutParams(layoutParams);
            this.g.setMaxHeight(mw9Var.a());
            this.g.setMaxWidth(mw9Var.b());
            this.i = w38Var;
            this.d.setDismissListener(w38Var);
            this.e.setOnClickListener((View.OnClickListener) hashMap.get(wz0Var.f));
        }
        return null;
    }
}
