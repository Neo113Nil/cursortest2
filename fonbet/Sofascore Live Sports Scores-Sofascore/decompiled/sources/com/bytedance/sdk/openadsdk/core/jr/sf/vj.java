package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.gpj;
import com.bytedance.sdk.openadsdk.core.widget.lo;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import defpackage.bsm;
import defpackage.kwm;
import defpackage.mtm;
import defpackage.oem;
import defpackage.owm;
import defpackage.pem;
import defpackage.qtm;
import defpackage.qzm;
import defpackage.swm;
import defpackage.w1l;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj implements kwm, qtm, tsz.pcc, pcc.InterfaceC0074pcc, gpj.pcc, lo.sf {
    com.bytedance.sdk.openadsdk.core.gm.pcc atb;
    int dax;
    int fum;
    int gbb;
    ViewGroup gm;
    boolean gpj;
    TextView hc;
    int jr;
    boolean jsj;
    ImageView kj;
    int lo;
    boolean lq;
    boolean lu;
    oem mk;
    private final String mu;
    int nac;
    Context of;
    owm oo;
    View ork;
    protected final int pcc;
    private long pq;
    View qf;
    pcc qy;
    protected final int sf;
    View tmg;
    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm tsz;
    of tz;
    ImageView vh;
    ImageView vj;
    View vy;
    View wh;
    com.bytedance.sdk.openadsdk.core.gm.pcc ye;
    lo yt;
    private wh.pcc zti;

    public vj(Context context, ViewGroup viewGroup, boolean z, int i, of ofVar, oem oemVar, boolean z2) {
        this.pcc = 228;
        this.sf = 160;
        this.lu = true;
        this.jsj = true;
        this.lq = true;
        this.mu = Build.MODEL;
        if (this instanceof oo) {
            return;
        }
        this.of = lu.pcc().getApplicationContext();
        oo(z2);
        this.gm = viewGroup;
        this.lu = z;
        this.fum = i;
        this.mk = oemVar;
        this.tz = ofVar;
        oo(8);
        pcc(context, this.gm);
        oo();
        tmg();
    }

    private boolean qy() {
        boolean pcc = com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tz.rt());
        of ofVar = this.tz;
        return of.vj(this.tz) && (!pcc ? ofVar.kx() == null : ofVar.uae() == null) && this.tz.ra() == 1;
    }

    private int vj(int i) {
        if (this.dax <= 0 || this.nac <= 0) {
            return 0;
        }
        int sf = rj.sf(this.of, 228.0f);
        int sf2 = rj.sf(this.of, 160.0f);
        int i2 = (int) (this.nac * ((i * 1.0f) / this.dax));
        return i2 > sf ? sf : i2 < sf2 ? sf2 : i2;
    }

    private void wh(int i) {
        rj.pcc(this.tmg, i);
    }

    public boolean dax() {
        return this.qy != null;
    }

    public boolean fum() {
        return this.lu;
    }

    public void gbb() {
        if (this.qy == null || this.yt != null) {
            return;
        }
        System.currentTimeMillis();
        lo loVar = new lo();
        this.yt = loVar;
        loVar.pcc(this.of, this.gm);
        this.yt.pcc(this.qy, this);
        System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0074pcc
    public long getVideoProgress() {
        if (this.pq <= 0) {
            of ofVar = this.tz;
            if (ofVar != null && ofVar.kez() != null) {
                this.pq = (long) (this.tz.kez().d * 1000.0d);
            }
            oem oemVar = this.mk;
            if (oemVar != null) {
                this.pq = oemVar.vy();
            }
        }
        return this.pq;
    }

    public void gm(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.gm.getParent() == null) {
            viewGroup.addView(this.gm);
        }
        oo(0);
    }

    public void gpj() {
        try {
            rj.pcc(this.ork, 8);
            rj.pcc((View) this.vh, 8);
            rj.pcc(this.tmg, 8);
            rj.pcc((View) this.hc, 8);
        } catch (Exception unused) {
        }
    }

    public owm hc() {
        return this.oo;
    }

    public void jr() {
        lo loVar = this.yt;
        if (loVar != null) {
            loVar.pcc(false);
        }
    }

    public void kj() {
        rj.vj(this.wh);
    }

    public void lo() {
        ImageView imageView = this.vh;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
    }

    public void lu() {
        rj.pcc((View) this.gm, 0);
        owm owmVar = this.oo;
        if (owmVar != null) {
            rj.pcc(owmVar.getView(), 0);
        }
    }

    public void nac() {
        rj.wh(this.wh);
        rj.wh(this.qf);
        if (this.vj.getVisibility() == 0) {
            rj.pcc((View) this.vj, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.gpj.pcc
    public boolean of() {
        lo loVar = this.yt;
        return loVar != null && loVar.pcc();
    }

    public void oo(boolean z) {
        this.jsj = z;
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.atb;
        if (z) {
            if (pccVar != null) {
                pccVar.pcc(true);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = this.ye;
            if (pccVar2 != null) {
                pccVar2.pcc(true);
                return;
            }
            return;
        }
        if (pccVar != null) {
            pccVar.pcc(false);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar3 = this.ye;
        if (pccVar3 != null) {
            pccVar3.pcc(false);
        }
    }

    public boolean ork() {
        return false;
    }

    public void pcc(of ofVar, WeakReference<Context> weakReference, boolean z) {
        of ofVar2;
        of ofVar3;
        if (ofVar == null) {
            return;
        }
        pcc(false, this.lu);
        pcc(this.gm, lu.pcc());
        View view = this.ork;
        if (view != null) {
            rj.pcc(view, 0);
        }
        ImageView imageView = this.vh;
        if (imageView != null) {
            rj.pcc((View) imageView, 0);
        }
        rj.pcc(this.tmg, 0);
        if (this.vh == null || (ofVar3 = this.tz) == null || ofVar3.kez() == null || this.tz.kez().f == null) {
            ofVar2 = ofVar;
        } else {
            ofVar2 = ofVar;
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().f, this.tz.kez().b, this.tz.kez().a, this.vh, ofVar2);
        }
        rj.pcc((View) this.hc, 0);
        String bgf = ofVar2.bgf();
        if (TextUtils.isEmpty(bgf)) {
            int az = ofVar2.az();
            if (az != 2 && az != 3) {
                if (az == 4) {
                    bgf = tz.pcc(this.of, "tt_video_download_apk");
                } else if (az == 5) {
                    bgf = tz.pcc(this.of, "tt_video_dial_phone");
                } else if (az != 8) {
                    bgf = tz.pcc(this.of, "tt_video_mobile_go_detail");
                }
            }
            bgf = tz.pcc(this.of, "tt_video_mobile_go_detail");
        }
        TextView textView = this.hc;
        if (textView != null) {
            textView.setText(bgf);
            this.hc.setOnClickListener(this.atb);
            this.hc.setOnTouchListener(this.atb);
        }
        if (this.lq) {
            return;
        }
        wh(4);
    }

    public void qf() {
        of ofVar;
        rj.wh(this.wh);
        rj.wh(this.qf);
        if (this.kj != null && (ofVar = this.tz) != null && ofVar.kez() != null && this.tz.kez().f != null) {
            rj.wh(this.kj);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().f, this.tz.kez().b, this.tz.kez().a, this.kj, this.tz);
        }
        if (this.vj.getVisibility() == 0) {
            rj.pcc((View) this.vj, 8);
        }
    }

    public void sf(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.gm.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.gm.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void tmg() {
        String str;
        int i;
        String str2;
        int i2;
        boolean z;
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar;
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar;
        String str3 = this.jsj ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.tz.tuy()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else if (this.tz.qra()) {
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        } else {
            if (!this.tz.jl()) {
                str = str3;
                i = 1;
                if (this.tz.az() == 4) {
                    this.tsz = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.of, str);
                }
                com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i);
                this.atb = pccVar2;
                pccVar2.pcc(this);
                this.atb.sf(true);
                z = this.jsj;
                com.bytedance.sdk.openadsdk.core.gm.pcc pccVar3 = this.atb;
                if (z) {
                    pccVar3.pcc(false);
                    this.atb.gm(true);
                } else {
                    pccVar3.pcc(true);
                }
                this.atb.pcc(this.mk);
                this.atb.vj(true);
                this.atb.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.1
                    @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
                    public void pcc(View view, int i3) {
                        if (vj.this.zti != null) {
                            vj.this.zti.pcc(view, i3);
                        }
                    }
                });
                gmVar = this.tsz;
                if (gmVar != null && (pccVar = this.atb) != null) {
                    pccVar.pcc(gmVar);
                }
                if (qy()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.gm.pcc pccVar4 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i) { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.2
                    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc
                    public boolean gm() {
                        View view = vj.this.ork;
                        if (view != null && view.getVisibility() == 0) {
                            return true;
                        }
                        View view2 = vj.this.tmg;
                        return view2 != null && view2.getVisibility() == 0;
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc
                    public boolean sf() {
                        lo loVar = vj.this.yt;
                        boolean pcc = loVar != null ? loVar.pcc() : false;
                        vj.this.vj.getVisibility();
                        return pcc || vj.this.vj.getVisibility() == 0;
                    }
                };
                this.ye = pccVar4;
                pccVar4.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.3
                    @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
                    public void pcc(View view, int i3) {
                        if (vj.this.zti != null) {
                            vj.this.zti.pcc(view, i3);
                        }
                    }
                });
                this.ye.sf(true);
                this.ye.pcc(this.jsj);
                this.ye.pcc(this.mk);
                this.ye.vj(true);
                com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar2 = this.tsz;
                if (gmVar2 != null) {
                    this.ye.pcc(gmVar2);
                }
                this.ye.pcc(this);
                return;
            }
            str2 = "banner_ad";
            i2 = 2;
        }
        str = str2;
        i = i2;
        if (this.tz.az() == 4) {
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar22 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i);
        this.atb = pccVar22;
        pccVar22.pcc(this);
        this.atb.sf(true);
        z = this.jsj;
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar32 = this.atb;
        if (z) {
        }
        this.atb.pcc(this.mk);
        this.atb.vj(true);
        this.atb.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i3) {
                if (vj.this.zti != null) {
                    vj.this.zti.pcc(view, i3);
                }
            }
        });
        gmVar = this.tsz;
        if (gmVar != null) {
            pccVar.pcc(gmVar);
        }
        if (qy()) {
        }
    }

    public boolean tz() {
        return this.gpj;
    }

    public void vh() {
        pcc(true, false);
    }

    public void vy() {
        oo(8);
        if (yt()) {
            this.oo.setVisibility(8);
        }
        ImageView imageView = this.kj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        oo(8);
        rj.pcc(this.ork, 8);
        rj.pcc((View) this.vh, 8);
        rj.pcc(this.tmg, 8);
        lo loVar = this.yt;
        if (loVar != null) {
            loVar.pcc(true);
        }
    }

    public boolean yt() {
        return (this.fum & 4) != 4 || this.lu;
    }

    public void wh() {
    }

    public void gm(int i) {
        rj.pcc((View) this.gm, 0);
        owm owmVar = this.oo;
        if (owmVar != null) {
            owmVar.setVisibility(i);
        }
    }

    public void gm(int i, int i2) {
        this.dax = i;
        this.nac = i2;
    }

    public void gm(boolean z) {
    }

    @Override // defpackage.kwm
    public View gm() {
        return this.gm;
    }

    public void sf(boolean z) {
    }

    public void oo() {
        this.oo.a(this);
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (vj.this.dax()) {
                    TextView textView = vj.this.hc;
                    if (textView == null || textView.getVisibility() != 0) {
                        vj vjVar = vj.this;
                        vjVar.qy.pcc(vjVar, view);
                    }
                }
            }
        });
    }

    public boolean sf(int i) {
        return false;
    }

    public void sf(boolean z, boolean z2) {
        ImageView imageView = this.vj;
        if (imageView != null) {
            Context context = this.of;
            if (z) {
                imageView.setImageDrawable(vh.pcc(context, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(vh.pcc(context, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void oo(int i) {
        this.lo = i;
        rj.pcc((View) this.gm, i);
    }

    public void sf(@Nullable ViewGroup viewGroup) {
    }

    @Override // defpackage.kwm
    public void sf() {
        rj.vj(this.wh);
        rj.vj(this.qf);
        ImageView imageView = this.kj;
        if (imageView != null) {
            rj.vj(imageView);
        }
    }

    @Override // defpackage.qtm
    public void sf(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        this.gpj = false;
        if (dax()) {
            this.qy.sf(this, surfaceHolder);
        }
    }

    public void vj() {
    }

    @Override // defpackage.qtm
    public void sf(SurfaceTexture surfaceTexture) {
        oem oemVar = this.mk;
        if (oemVar != null) {
            oemVar.pcc(surfaceTexture);
        }
    }

    public vj(Context context, ViewGroup viewGroup, boolean z, int i, of ofVar, oem oemVar) {
        this(context, viewGroup, z, i, ofVar, oemVar, true);
    }

    public void pcc(long j) {
    }

    public void pcc(long j, long j2) {
    }

    public void pcc(Message message) {
    }

    public void pcc(View view, boolean z) {
    }

    public void pcc(@Nullable ViewGroup viewGroup) {
    }

    public void pcc(String str) {
    }

    @Override // defpackage.kwm
    public /* bridge */ /* synthetic */ void pcc(Object obj, WeakReference weakReference, boolean z) {
        pcc((of) obj, (WeakReference<Context>) weakReference, z);
    }

    public void pcc(wh.pcc pccVar) {
        this.zti = pccVar;
    }

    public void pcc(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.atb;
        if (pccVar != null) {
            pccVar.pcc(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = this.ye;
        if (pccVar2 != null) {
            pccVar2.pcc(pAGNativeAd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19, types: [android.view.TextureView] */
    public void pcc(Context context, View view) {
        pem pemVar;
        System.currentTimeMillis();
        of ofVar = this.tz;
        if ((ofVar == null || ((!ofVar.tg() && !this.tz.jl()) || com.bytedance.sdk.openadsdk.core.settings.vh.sf().kx())) && view != null) {
            view.setKeepScreenOn(true);
        }
        oem oemVar = this.mk;
        if (oemVar != null && oemVar.jr()) {
            pemVar = new bsm(this.of, null);
        } else {
            pem pemVar2 = new pem(this.of);
            qzm qzmVar = new qzm(pemVar2);
            pemVar2.b = qzmVar;
            pem.c.add(qzmVar);
            pemVar = pemVar2;
        }
        if (view instanceof RelativeLayout) {
            ((RelativeLayout) view).addView(pemVar, 0, w1l.c(-2, -2, 13));
        }
        rj.pcc((View) pemVar, 8);
        this.oo = pemVar;
        this.vj = (ImageView) view.findViewById(nac.bgf);
        this.wh = view.findViewById(nac.pzh);
        this.qf = view.findViewById(nac.lc);
        this.kj = (ImageView) view.findViewById(nac.gmh);
        this.vy = view.findViewById(nac.ln);
        System.currentTimeMillis();
    }

    public void pcc(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.vy) == null || view2.getParent() == null || this.ork != null) {
            return;
        }
        this.ork = this.vy;
        this.vh = (ImageView) view.findViewById(nac.oyx);
        this.tmg = view.findViewById(nac.eko);
        this.hc = (TextView) view.findViewById(nac.ri);
    }

    public boolean pcc(int i, swm swmVar, boolean z) {
        lo loVar = this.yt;
        return loVar == null || loVar.pcc(i, swmVar, z);
    }

    public void pcc(mtm mtmVar) {
        if (mtmVar instanceof pcc) {
            this.qy = (pcc) mtmVar;
            gbb();
        }
    }

    public void pcc(int i, int i2) {
        if (i == -1) {
            i = rj.gm(this.of);
        }
        if (i <= 0) {
            return;
        }
        this.gbb = i;
        if (!fum() && !ork() && (this.fum & 8) != 8) {
            i2 = vj(i);
            this.jr = i2;
        } else {
            this.jr = i2;
        }
        sf(this.gbb, i2);
    }

    @Override // defpackage.kwm
    public void pcc() {
        pcc(false, this.lu);
        gpj();
    }

    @Override // defpackage.kwm
    public void pcc(boolean z) {
        this.lq = z;
    }

    public void pcc(int i) {
    }

    @Override // defpackage.qtm
    public void pcc(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        this.gpj = true;
        if (dax()) {
            this.qy.pcc(this, surfaceHolder);
        }
    }

    @Override // defpackage.qtm
    public void pcc(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        dax();
    }

    @Override // defpackage.qtm
    public void pcc(SurfaceTexture surfaceTexture, int i, int i2) {
        this.gpj = true;
        if (dax()) {
            this.qy.pcc(this, surfaceTexture);
        }
    }

    @Override // defpackage.qtm
    public boolean pcc(SurfaceTexture surfaceTexture) {
        this.gpj = false;
        if (!dax()) {
            return true;
        }
        this.qy.sf(this, surfaceTexture);
        return true;
    }

    public void pcc(boolean z, boolean z2, boolean z3) {
        rj.pcc((View) this.vj, (!z || this.wh.getVisibility() == 0) ? 8 : 0);
    }

    public void pcc(boolean z, boolean z2) {
        rj.pcc((View) this.vj, 8);
    }

    @Override // defpackage.kwm
    public void pcc(Drawable drawable) {
        ViewGroup viewGroup = this.gm;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
