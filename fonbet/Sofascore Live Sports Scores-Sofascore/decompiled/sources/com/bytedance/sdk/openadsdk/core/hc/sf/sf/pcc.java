package com.bytedance.sdk.openadsdk.core.hc.sf.sf;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.sf.oo;
import com.bytedance.adsdk.sf.ork;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.adsdk.ugeno.vj;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm<sf> {
    private boolean az;
    private String gga;
    private boolean gpa;
    private float gr;
    private boolean kez;
    private int ofe;
    protected String pcc;
    private boolean rc;
    protected ImageView.ScaleType uae;
    protected HashMap<String, Bitmap> vd;
    protected ImageView.ScaleType xf;
    private float zpi;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc$1, reason: invalid class name */
    public class AnonymousClass1 implements oo {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.sf.oo
        public Bitmap pcc(final ork orkVar) {
            final String str;
            if (orkVar == null) {
                return null;
            }
            String ork = orkVar.ork();
            String vy = orkVar.vy();
            if (!TextUtils.isEmpty(ork) && TextUtils.isEmpty(vy)) {
                str = com.bytedance.adsdk.ugeno.gm.sf.pcc(ork, ((gm) pcc.this).oo);
            } else if (!TextUtils.isEmpty(vy) && TextUtils.isEmpty(ork)) {
                str = com.bytedance.adsdk.ugeno.gm.sf.pcc(vy, ((gm) pcc.this).oo);
            } else if (TextUtils.isEmpty(vy) || TextUtils.isEmpty(ork)) {
                str = null;
            } else {
                str = com.bytedance.adsdk.ugeno.gm.sf.pcc(ork, ((gm) pcc.this).oo) + com.bytedance.adsdk.ugeno.gm.sf.pcc(vy, ((gm) pcc.this).oo);
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            Bitmap bitmap = pcc.this.vd.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            vj.pcc().sf().pcc(((gm) pcc.this).vy, str, new pcc.InterfaceC0032pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc.1.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0032pcc
                public void pcc(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, orkVar.pcc(), orkVar.sf(), false);
                        pcc.this.vd.put(str, createScaledBitmap);
                        kj.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((sf) ((gm) pcc.this).vj).pcc(orkVar.kj(), createScaledBitmap);
                            }
                        });
                    }
                }
            });
            return pcc.this.vd.get(str);
        }
    }

    public pcc(Context context) {
        super(context);
        this.gga = "images";
        this.az = true;
        this.zpi = 1.0f;
        this.xf = ImageView.ScaleType.FIT_CENTER;
        this.uae = ImageView.ScaleType.FIT_XY;
        this.vd = new HashMap<>();
    }

    private ImageView.ScaleType gbb(String str) {
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
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String hc(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(ServiceProvider.NAMED_LOCAL)) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    private ImageView.ScaleType jr(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public sf pcc() {
        sf sfVar = new sf(this.sf);
        sfVar.pcc(this);
        return sfVar;
    }

    public void oo() {
        T t = this.vj;
        if (t != 0) {
            ((sf) t).pcc();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.uae = jr(str2);
                break;
            case "scaleType":
                this.xf = gbb(str2);
                break;
            case "progress":
                this.gr = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "imagePath":
                this.gga = str2;
                break;
            case "autoReverse":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "src":
                this.pcc = com.bytedance.sdk.openadsdk.core.hc.oo.pcc(str2);
                break;
            case "loop":
                if (!lq()) {
                    this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                    break;
                } else {
                    this.ofe = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                    break;
                }
            case "speed":
                this.zpi = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "autoPlay":
                this.gpa = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "autoplay":
                this.az = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((sf) this.vj).setProgress(this.gr);
        float f = this.zpi;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 1.0f;
            this.zpi = 1.0f;
        }
        ((sf) this.vj).setSpeed(f);
        if (this.pcc.startsWith(ServiceProvider.NAMED_LOCAL)) {
            ((sf) this.vj).setAnimation(hc(this.pcc));
            ((sf) this.vj).setImageAssetsFolder(this.gga);
        } else {
            ((sf) this.vj).setAnimationFromUrl(this.pcc);
        }
        ((sf) this.vj).setImageAssetDelegate(new AnonymousClass1());
        boolean lq = lq();
        T t = this.vj;
        if (lq) {
            ((sf) t).setScaleType(this.uae);
        } else {
            ((sf) t).setScaleType(this.xf);
        }
        boolean lq2 = lq();
        T t2 = this.vj;
        if (lq2) {
            ((sf) t2).setRepeatCount(this.ofe);
        } else {
            ((sf) t2).pcc(this.kez);
        }
        boolean lq3 = lq();
        T t3 = this.vj;
        if (!lq3) {
            if (t3 != 0) {
                ((sf) t3).pcc();
            }
        } else {
            if (t3 == 0 || !this.az) {
                return;
            }
            ((sf) t3).pcc();
        }
    }

    public void pcc(AnimatorListenerAdapter animatorListenerAdapter) {
        ((sf) this.vj).pcc(animatorListenerAdapter);
    }
}
