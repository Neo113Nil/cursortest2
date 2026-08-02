package com.bytedance.sdk.component.adexpress.wh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends com.bytedance.adsdk.sf.wh {
    private Map<String, Bitmap> pcc;
    private String sf;

    public ork(Context context) {
        super(context);
        this.pcc = new HashMap();
    }

    public void kj() {
        if (TextUtils.isEmpty(this.sf)) {
            return;
        }
        setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        pcc(true);
        setAnimationFromUrl(this.sf);
        setImageAssetDelegate(new com.bytedance.adsdk.sf.oo() { // from class: com.bytedance.sdk.component.adexpress.wh.ork.1
            @Override // com.bytedance.adsdk.sf.oo
            public Bitmap pcc(final com.bytedance.adsdk.sf.ork orkVar) {
                final String kj = orkVar.kj();
                String ork = orkVar.ork();
                String vy = orkVar.vy();
                if (TextUtils.equals(kj, "image_0") && TextUtils.equals(vy, "Lark20201123-180048_2.png")) {
                    vy = "hand.png";
                }
                Bitmap bitmap = (Bitmap) ork.this.pcc.get(kj);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(ork) || !TextUtils.isEmpty(vy)) {
                    ork = (TextUtils.isEmpty(vy) || !TextUtils.isEmpty(ork)) ? (TextUtils.isEmpty(vy) || TextUtils.isEmpty(ork)) ? "" : dmi.y(ork, vy) : vy;
                }
                if (TextUtils.isEmpty(ork)) {
                    return null;
                }
                com.bytedance.sdk.component.vj.ork pcc2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj().pcc(ork).gm(2).pcc(new com.bytedance.sdk.component.vj.kj() { // from class: com.bytedance.sdk.component.adexpress.wh.ork.1.1
                    @Override // com.bytedance.sdk.component.vj.kj
                    public Bitmap pcc(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, orkVar.pcc(), orkVar.sf(), false);
                        ork.this.pcc.put(kj, createScaledBitmap);
                        return createScaledBitmap;
                    }
                });
                ork orkVar2 = ork.this;
                pcc2.pcc(new pcc(orkVar2, orkVar, kj, orkVar2.pcc));
                return (Bitmap) ork.this.pcc.get(kj);
            }
        });
        pcc();
    }

    public void setImageLottieTosPath(String str) {
        this.sf = str;
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements com.bytedance.sdk.component.vj.dax {
        private final String gm;
        private final Map<String, Bitmap> oo;
        private final WeakReference<ork> pcc;
        private final com.bytedance.adsdk.sf.ork sf;

        public pcc(ork orkVar, com.bytedance.adsdk.sf.ork orkVar2, String str, Map<String, Bitmap> map) {
            this.pcc = new WeakReference<>(orkVar);
            this.sf = orkVar2;
            this.gm = str;
            this.oo = map;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap((Bitmap) sf, this.sf.pcc(), this.sf.sf(), false);
                this.oo.put(this.gm, createScaledBitmap);
                ork orkVar = this.pcc.get();
                if (orkVar != null) {
                    orkVar.pcc(this.sf.kj(), createScaledBitmap);
                }
            }
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }
    }
}
