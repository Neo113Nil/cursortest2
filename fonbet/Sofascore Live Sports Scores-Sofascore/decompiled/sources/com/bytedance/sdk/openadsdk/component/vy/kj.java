package com.bytedance.sdk.openadsdk.component.vy;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private static boolean pcc;
    private static Drawable sf;
    private nac gm;
    private TextView oo;

    public static Drawable gm() {
        return sf;
    }

    public void pcc(gm gmVar, of ofVar, float f, float f2, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (gmVar != null) {
            this.gm = gmVar.getHostAppIcon();
            this.oo = gmVar.getHostAppName();
            View userInfo = gmVar.getUserInfo();
            if (gmVar instanceof oo) {
                nac nacVar = this.gm;
                if (nacVar != null && (layoutParams2 = nacVar.getLayoutParams()) != null) {
                    int ial = ofVar.ial();
                    nac nacVar2 = this.gm;
                    if (ial == 1) {
                        int sf2 = rj.sf(nacVar2.getContext(), 40.0f);
                        layoutParams2.width = sf2;
                        layoutParams2.height = sf2;
                    } else {
                        int sf3 = rj.sf(nacVar2.getContext(), 30.0f);
                        layoutParams2.width = sf3;
                        layoutParams2.height = sf3;
                    }
                    this.gm.setLayoutParams(layoutParams2);
                }
                if (this.oo != null) {
                    int ial2 = ofVar.ial();
                    TextView textView = this.oo;
                    if (ial2 == 1) {
                        textView.setTextSize(30.0f);
                    } else {
                        textView.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (ofVar.ial() == 1) {
                        layoutParams.height = rj.sf(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = rj.sf(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.vy.kj.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void sf() {
        if (pcc) {
            return;
        }
        try {
            int vy = ork.sf().vy();
            if (vy != 0) {
                sf = lu.pcc().getResources().getDrawable(vy);
            }
            pcc = true;
        } catch (Throwable unused) {
            pcc = true;
        }
    }

    public void pcc() {
        String kj = ork.sf().kj();
        boolean isEmpty = TextUtils.isEmpty(kj);
        TextView textView = this.oo;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(kj);
        }
        sf();
        try {
            Drawable drawable = sf;
            nac nacVar = this.gm;
            if (drawable == null) {
                nacVar.setVisibility(8);
                return;
            }
            nacVar.setImageDrawable(drawable);
            if (this.oo.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.gm.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.gm.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.gm.setVisibility(8);
        }
    }
}
