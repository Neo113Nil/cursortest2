package com.bytedance.adsdk.ugeno.vy.pcc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.qf.oo;
import com.bytedance.adsdk.ugeno.qf.pcc;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.adsdk.ugeno.vj;
import com.bytedance.adsdk.ugeno.vy.wh.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends sf {
    private boolean az;
    private String gga;
    private int gpa;
    private boolean gr;
    private int kez;
    private pcc.C0034pcc ofe;
    private String rc;
    private String uae;
    private String xf;

    public pcc(Context context) {
        super(context);
        this.uae = "row";
    }

    private void oo() {
        if (TextUtils.isEmpty(this.xf)) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setCompoundDrawables(null, null, null, null);
        if (!this.xf.startsWith("local://")) {
            vj.pcc().sf().pcc(this.vy, this.xf, new pcc.InterfaceC0032pcc() { // from class: com.bytedance.adsdk.ugeno.vy.pcc.pcc.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0032pcc
                public void pcc(final Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.pcc.pcc.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            pcc.this.sf(new BitmapDrawable(((gm) pcc.this).sf.getResources(), bitmap));
                        }
                    });
                }
            });
        } else {
            try {
                hc(this.xf.replace("local://", ""));
            } catch (Throwable unused) {
            }
        }
    }

    public void hc(String str) {
        Context context = this.sf;
        sf(kj.pcc(context, oo.sf(context, str)));
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void iv() {
        super.iv();
        if (this.az) {
            ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setTextColor(((sf) this).vd);
        }
        if (this.gr) {
            if (this.bxz) {
                pcc(this.kx);
            } else {
                oo(this.rnn);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void lrr() {
        super.lrr();
        if (this.az) {
            ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setTextColor(this.gpa);
        }
        if (this.gr) {
            if (this.bxz) {
                pcc(this.ofe);
            } else {
                oo(this.kez);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "direction":
                this.uae = str2;
                break;
            case "highlightTextColor":
            case "highlightedTextColor":
                this.gpa = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                this.az = true;
                break;
            case "image":
                this.xf = str2;
                break;
            case "highlightImage":
                this.gga = str2;
                break;
            case "highlightBackgroundColor":
                if (com.bytedance.adsdk.ugeno.qf.pcc.gm(str2)) {
                    this.bxz = true;
                    this.ofe = com.bytedance.adsdk.ugeno.qf.pcc.sf(str2);
                } else {
                    this.kez = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                    this.bxz = false;
                }
                this.gr = true;
                break;
            case "highlightBackgroundImage":
                this.rc = str2;
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public void sf(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        String str = this.uae;
        switch (str.hashCode()) {
            case -1781065991:
                if (str.equals("column_reverse")) {
                    ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
                    return;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
                    return;
                }
                break;
            case -207799939:
                if (str.equals("row_reverse")) {
                    ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                }
                break;
            case 113114:
                str.equals("row");
                break;
        }
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        oo();
        ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setGravity(17);
    }
}
