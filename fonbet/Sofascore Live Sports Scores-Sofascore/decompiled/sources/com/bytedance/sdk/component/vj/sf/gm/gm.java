package com.bytedance.sdk.component.vj.sf.gm;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.vj.dax;
import com.bytedance.sdk.component.vj.fum;
import com.bytedance.sdk.component.vj.gbb;
import com.bytedance.sdk.component.vj.gpj;
import com.bytedance.sdk.component.vj.kj;
import com.bytedance.sdk.component.vj.ork;
import com.bytedance.sdk.component.vj.vh;
import com.bytedance.sdk.component.vj.vy;
import com.sofascore.model.mvvm.model.StatusKt;
import defpackage.a70;
import defpackage.zzl;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements vy {
    private byte[] atb;
    private gpj dax;
    private int fum;
    private boolean gbb;
    private String gm;
    private boolean gpj;
    private volatile boolean hc;
    private boolean jr;
    private ExecutorService jsj;
    private int kj;
    private com.bytedance.sdk.component.vj.qf lo;
    private final Handler lu;
    private gbb mk;
    private int nac;
    private com.bytedance.sdk.component.vj.sf of;
    private String oo;
    private kj ork;
    Future<?> pcc;
    private Bitmap.Config qf;
    private int qy;
    private String sf;
    private WeakReference<ImageView> tmg;
    private boolean tsz;
    private wh tz;
    private int vh;
    private dax vj;
    private int vy;
    private ImageView.ScaleType wh;
    private int yt;

    private gm(sf sfVar) {
        this.lu = new Handler(Looper.getMainLooper());
        this.gpj = true;
        this.atb = null;
        this.sf = sfVar.oo;
        this.vj = new pcc(sfVar.pcc);
        this.tmg = new WeakReference<>(sfVar.sf);
        this.wh = sfVar.vj;
        this.qf = sfVar.wh;
        this.kj = sfVar.qf;
        this.vy = sfVar.kj;
        this.vh = sfVar.vy;
        this.nac = sfVar.ork;
        this.dax = sfVar.vh;
        this.of = pcc(sfVar);
        if (!TextUtils.isEmpty(sfVar.gm)) {
            sf(sfVar.gm);
            pcc(sfVar.gm);
        }
        this.gbb = sfVar.tmg;
        this.jr = sfVar.hc;
        this.tz = sfVar.dax;
        this.ork = sfVar.nac;
        this.qy = sfVar.gpj;
        this.yt = sfVar.lu;
        this.jsj = sfVar.lo;
        this.tsz = sfVar.fum;
        this.mk = sfVar.tz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vy lo() {
        try {
            if (this.tz == null) {
                dax daxVar = this.vj;
                if (daxVar != null) {
                    daxVar.pcc(1005, "not init !", null);
                    return this;
                }
            } else {
                String pcc2 = pcc();
                if (TextUtils.isEmpty(pcc2)) {
                    this.vj.pcc(2000, "url is empty", null);
                    return this;
                }
                fum qf = this.tz.qf();
                if (!pcc2.startsWith("http://") && !pcc2.startsWith("https://") && qf != null) {
                    qf.pcc(1006, "url is not validate ".concat(pcc2));
                }
                ExecutorService wh = this.jsj == null ? this.tz.wh() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.gm.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gm gmVar = gm.this;
                        com.bytedance.sdk.component.vj.sf.gm.pcc pccVar = new com.bytedance.sdk.component.vj.sf.gm.pcc(gmVar, gmVar.dax);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.vj.sf.sf.sf());
                            arrayList.add(new com.bytedance.sdk.component.vj.sf.sf.vj());
                            arrayList.add(new com.bytedance.sdk.component.vj.sf.sf.pcc());
                            arrayList.add(new com.bytedance.sdk.component.vj.sf.sf.gm());
                            arrayList.add(new com.bytedance.sdk.component.vj.sf.sf.oo());
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (gm.this.hc) {
                                    pccVar.pcc(1003, StatusKt.STATUS_CANCELED, null);
                                    return;
                                }
                                com.bytedance.sdk.component.vj.sf.sf.wh whVar = (com.bytedance.sdk.component.vj.sf.sf.wh) arrayList.get(i);
                                if (gm.this.dax != null && whVar != null && !"data_intercept".equals(whVar.pcc())) {
                                    gm.this.dax.pcc(whVar.pcc(), gm.this);
                                }
                                gm gmVar2 = gm.this;
                                boolean pcc3 = whVar.pcc(gmVar2, gmVar2.dax, pccVar);
                                if (gm.this.dax != null && !"data_intercept".equals(whVar.pcc())) {
                                    gm.this.dax.sf(whVar.pcc(), gm.this);
                                }
                                if (!pcc3) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            pccVar.pcc(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.tsz) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.jsj;
                if (executorService != null) {
                    this.pcc = executorService.submit(runnable);
                    return this;
                }
                if (wh != null) {
                    this.pcc = wh.submit(runnable);
                }
            }
            return this;
        } catch (Exception e) {
            e.getMessage();
            return this;
        }
    }

    private com.bytedance.sdk.component.vj.sf pcc(sf sfVar) {
        return sfVar.jr != null ? sfVar.jr : !TextUtils.isEmpty(sfVar.gbb) ? com.bytedance.sdk.component.vj.sf.gm.pcc.sf.pcc(new File(sfVar.gbb)) : com.bytedance.sdk.component.vj.sf.gm.pcc.sf.vy();
    }

    public wh dax() {
        return this.tz;
    }

    public com.bytedance.sdk.component.vj.qf gbb() {
        return this.lo;
    }

    public String gpj() {
        return kj() + vh();
    }

    public byte[] hc() {
        return this.atb;
    }

    public int jr() {
        return this.fum;
    }

    public gbb lu() {
        return this.mk;
    }

    public com.bytedance.sdk.component.vj.sf nac() {
        return this.of;
    }

    public Bitmap.Config ork() {
        return this.qf;
    }

    public void sf(String str) {
        WeakReference<ImageView> weakReference = this.tmg;
        if (weakReference != null && weakReference.get() != null) {
            this.tmg.get().setTag(1094453505, str);
        }
        this.gm = str;
    }

    public boolean tmg() {
        return this.gpj;
    }

    public int vh() {
        return this.vh;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements ork {
        private wh dax;
        private boolean fum;
        private String gbb;
        private String gm;
        private int gpj;
        private boolean hc;
        private com.bytedance.sdk.component.vj.sf jr;
        private int kj;
        private ExecutorService lo;
        private int lu;
        private kj nac;
        private String oo;
        private dax pcc;
        private int qf;
        private ImageView sf;
        private boolean tmg;
        private gbb tz;
        private gpj vh;
        private ImageView.ScaleType vj;
        private Bitmap.Config wh;
        private int vy = 1;
        private int ork = 5;

        public sf(wh whVar) {
            this.dax = whVar;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public vy pcc(dax daxVar) {
            this.pcc = daxVar;
            return new gm(this).lo();
        }

        public ork gm(String str) {
            this.oo = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork oo(int i) {
            this.lu = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork sf(int i) {
            this.kj = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork vj(int i) {
            this.gpj = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork gm(int i) {
            this.vy = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork sf(String str) {
            this.gbb = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(String str) {
            this.gm = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(ImageView.ScaleType scaleType) {
            this.vj = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(Bitmap.Config config) {
            this.wh = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(int i) {
            this.qf = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(gpj gpjVar) {
            this.vh = gpjVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(boolean z) {
            this.hc = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public vy pcc(dax daxVar, int i) {
            this.ork = i;
            return pcc(daxVar);
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public vy pcc(ImageView imageView) {
            this.sf = imageView;
            return new gm(this).lo();
        }

        @Override // com.bytedance.sdk.component.vj.ork
        public ork pcc(kj kjVar) {
            this.nac = kjVar;
            return this;
        }
    }

    public String kj() {
        return this.gm;
    }

    public int oo() {
        return this.yt;
    }

    public String qf() {
        return this.oo;
    }

    public int vj() {
        return this.qy;
    }

    public ImageView.ScaleType vy() {
        return this.wh;
    }

    public dax wh() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.vj.vy
    public int gm() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.vj.vy
    public int sf() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.vj.vy
    public String pcc() {
        return this.sf;
    }

    public void pcc(String str) {
        this.oo = str;
    }

    public void pcc(boolean z) {
        this.gpj = z;
    }

    public void pcc(byte[] bArr) {
        this.atb = bArr;
    }

    public void pcc(int i) {
        this.fum = i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class pcc implements dax {
        private dax sf;

        public pcc(dax daxVar) {
            this.sf = daxVar;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(final vh vhVar) {
            Bitmap pcc;
            final ImageView imageView = (ImageView) gm.this.tmg.get();
            if (imageView != null && gm.this.vh != 3 && pcc(imageView)) {
                Object sf = vhVar.sf();
                if (sf instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) vhVar.sf();
                    gm.this.lu.post(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.gm.pcc.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (sf instanceof Drawable) {
                    final Drawable drawable = (Drawable) vhVar.sf();
                    gm.this.lu.post(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.gm.pcc.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (zzl.n(drawable2)) {
                                    a70.e(drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (gm.this.ork != null && (vhVar.sf() instanceof Bitmap) && (pcc = gm.this.ork.pcc((Bitmap) vhVar.sf())) != null) {
                    vhVar.pcc(pcc);
                }
            } catch (Throwable unused) {
            }
            if (gm.this.nac == 5) {
                gm.this.lu.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.gm.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pcc.this.sf != null) {
                            pcc.this.sf.pcc(vhVar);
                        }
                    }
                });
                return;
            }
            dax daxVar = this.sf;
            if (daxVar != null) {
                daxVar.pcc(vhVar);
            }
        }

        private boolean pcc(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(gm.this.gm)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(final int i, final String str, final Throwable th) {
            if (gm.this.nac == 5) {
                gm.this.lu.post(new Runnable() { // from class: com.bytedance.sdk.component.vj.sf.gm.gm.pcc.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pcc.this.sf != null) {
                            pcc.this.sf.pcc(i, str, th);
                        }
                    }
                });
                return;
            }
            dax daxVar = this.sf;
            if (daxVar != null) {
                daxVar.pcc(i, str, th);
            }
        }
    }
}
