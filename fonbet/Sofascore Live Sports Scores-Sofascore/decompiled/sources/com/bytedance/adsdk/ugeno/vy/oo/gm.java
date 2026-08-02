package com.bytedance.adsdk.ugeno.vy.oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.core.wh;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.qf.oo;
import com.bytedance.adsdk.ugeno.vj;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends com.bytedance.adsdk.ugeno.sf.gm<pcc> {
    private int gga;
    private float gpa;
    private float kez;
    private int ofe;
    protected String pcc;
    private float rc;
    protected String uae;
    protected ImageView.ScaleType vd;
    protected boolean xf;

    public gm(Context context) {
        super(context);
        this.vd = ImageView.ScaleType.FIT_XY;
        this.gga = -1;
        this.rc = -1.0f;
        this.kez = -1.0f;
        this.ofe = 0;
        this.gpa = 50.0f;
    }

    private ImageView.ScaleType hc(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void ork() {
        if (this.rc > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            vj.pcc().sf().pcc(this.vy, this.pcc, new pcc.InterfaceC0032pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0032pcc
                public void pcc(Bitmap bitmap) {
                    gm gmVar = gm.this;
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.sf.gm) gmVar).vo != null) {
                            wh unused = ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vo;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.sf.gm) gmVar).vo != null) {
                        wh unused2 = ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vo;
                    }
                    final Bitmap pcc = kj.pcc(((com.bytedance.adsdk.ugeno.sf.gm) gm.this).sf, bitmap, (int) gm.this.rc);
                    if (pcc != null) {
                        kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((pcc) ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vj).setImageBitmap(pcc);
                            }
                        });
                    }
                    gm gmVar2 = gm.this;
                    if (gmVar2.xf || gmVar2.kez > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Bitmap pcc2 = kj.pcc(((com.bytedance.adsdk.ugeno.sf.gm) gm.this).sf, bitmap, gm.this.kez > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) gm.this.kez : 10);
                        if (pcc2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.sf.gm) gm.this).sf.getResources(), pcc2);
                            kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((pcc) ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vj).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.pcc sf = vj.pcc().sf();
        vh vhVar = this.vy;
        String str = this.pcc;
        T t = this.vj;
        sf.pcc(vhVar, str, (ImageView) t, ((pcc) t).getWidth(), ((pcc) this.vj).getHeight(), new pcc.InterfaceC0032pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.2
            @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0032pcc
            public void pcc(Bitmap bitmap) {
                gm gmVar = gm.this;
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.sf.gm) gmVar).vo != null) {
                        wh unused = ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vo;
                    }
                } else if (((com.bytedance.adsdk.ugeno.sf.gm) gmVar).vo != null) {
                    wh unused2 = ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vo;
                }
            }
        });
        if (this.xf || this.kez > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            vj.pcc().sf().pcc(this.vy, this.pcc, new pcc.InterfaceC0032pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.3
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0032pcc
                public void pcc(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap pcc = kj.pcc(((com.bytedance.adsdk.ugeno.sf.gm) gm.this).sf, bitmap, gm.this.kez > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) gm.this.kez : 10);
                    kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (pcc != null) {
                                ((pcc) ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vj).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.sf.gm) gm.this).sf.getResources(), pcc));
                            }
                        }
                    });
                }
            });
        }
    }

    private void vy() {
        if (TextUtils.isEmpty(this.pcc)) {
            return;
        }
        ((pcc) this.vj).setImageDrawable(null);
        boolean startsWith = this.pcc.startsWith("local://");
        String str = this.pcc;
        if (!startsWith) {
            if (!str.startsWith("@")) {
                ork();
                return;
            } else {
                ((pcc) this.vj).setImageResource(Integer.parseInt(this.pcc.substring(1)));
                return;
            }
        }
        try {
            String replace = str.replace("local://", "");
            boolean equals = TextUtils.equals(gm(), "raw");
            T t = this.vj;
            if (equals) {
                ((pcc) t).setImageResource(oo.pcc(this.sf, replace));
            } else {
                pcc((ImageView) t, replace);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void kj() {
        super.kj();
        Drawable drawable = ((pcc) this.vj).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !zzl.n(drawable)) {
            return;
        }
        a70.e(drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        T t;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.vd = hc(str2);
                break;
            case "imageBlur":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "eraseRadius":
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 50.0f);
                this.gpa = pcc;
                T t2 = this.vj;
                if (t2 != 0) {
                    ((pcc) t2).setEraseRadius(pcc);
                    break;
                }
                break;
            case "isBgGaussianBlur":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "src":
                this.pcc = str2;
                break;
            case "erase":
                int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                this.ofe = pcc2;
                if (pcc2 == 1 && (t = this.vj) != 0) {
                    ((pcc) t).setEraseEnabled(true);
                    break;
                }
                break;
            case "tintColor":
                this.gga = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "imageBgBlur":
                this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void qf() {
        super.qf();
        ((pcc) this.vj).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((pcc) ((com.bytedance.adsdk.ugeno.sf.gm) gm.this).vj).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !zzl.n(drawable)) {
                    return;
                }
                a70.e(drawable).start();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        vy();
        ((pcc) this.vj).setScaleType(this.vd);
        ((pcc) this.vj).setBorderColor(this.qcw);
        ((pcc) this.vj).setCornerRadius(this.xb);
        ((pcc) this.vj).setBorderWidth(this.hoh);
        int i = this.gga;
        if (i != -1) {
            ((pcc) this.vj).setColorFilter(i);
        }
        ((pcc) this.vj).setEraseEnabled(this.ofe == 1);
        ((pcc) this.vj).setEraseRadius(this.gpa);
    }

    public void gbb(String str) {
        this.pcc = str;
    }

    public String gm() {
        return this.uae;
    }

    public void pcc(ImageView imageView, String str) {
        imageView.setImageResource(oo.sf(this.sf, str));
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void pcc(String str, Map<String, Object> map) {
        this.qf = (com.bytedance.adsdk.ugeno.sf.pcc) sf((com.bytedance.adsdk.ugeno.sf.gm) this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pq());
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        pcc(this.qf, str, arrayList.toArray());
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(str, objArr);
        if (!(gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) || (vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy()) == null || vy.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
        while (it.hasNext()) {
            pcc(it.next(), str, objArr);
        }
    }
}
