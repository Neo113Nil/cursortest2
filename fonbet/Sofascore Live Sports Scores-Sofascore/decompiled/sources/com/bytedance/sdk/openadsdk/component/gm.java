package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.vy.vj;
import com.bytedance.sdk.openadsdk.component.wh;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import defpackage.a70;
import defpackage.mz1;
import defpackage.zzl;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private kj dax;
    private float fum;
    private ImageView gbb;
    protected final boolean gm;
    private kj gpj;
    private RelativeLayout hc;
    private PAGLogoView jr;
    private com.bytedance.sdk.openadsdk.core.wh.oo jsj;
    protected FrameLayout kj;
    private kj lo;
    private nac lu;
    private View mk;
    private ImageView nac;

    @NonNull
    private final com.bytedance.sdk.openadsdk.component.vy.kj of = new com.bytedance.sdk.openadsdk.component.vy.kj();
    protected final FrameLayout oo;
    protected com.bytedance.sdk.openadsdk.core.wh.oo ork;
    protected final Activity pcc;
    protected int qf;
    private kj qy;
    protected final of sf;
    protected final com.bytedance.sdk.openadsdk.component.kj.pcc tmg;
    private dax tsz;
    private float tz;
    protected kj vh;
    protected final com.bytedance.sdk.openadsdk.component.pcc vj;
    protected View vy;
    protected final int wh;
    private com.bytedance.sdk.openadsdk.component.kj.gm yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc implements wh.gm {
        WeakReference<Activity> pcc;
        private final WeakReference<gm> sf;

        public pcc(Activity activity, gm gmVar) {
            this.pcc = new WeakReference<>(activity);
            this.sf = new WeakReference<>(gmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.wh.gm
        public void pcc(Object obj) {
            gm gmVar;
            if (this.pcc.get() == null || this.pcc.get().isFinishing() || (gmVar = this.sf.get()) == null) {
                return;
            }
            gmVar.pcc(obj);
        }
    }

    public gm(Activity activity, of ofVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.pcc pccVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar2) {
        this.pcc = activity;
        this.sf = ofVar;
        this.oo = frameLayout;
        this.qf = i;
        this.gm = z;
        this.vj = pccVar;
        this.wh = ofVar.kot();
        this.tmg = pccVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void kj() {
        boolean z;
        dax daxVar;
        View view;
        this.of.pcc();
        this.dax.setText(this.sf.bgf());
        if (this.sf.ye()) {
            vy();
            return;
        }
        if (this.gm) {
            sf(0);
            pcc(8);
            boolean pcc2 = pcc(this.kj);
            com.bytedance.sdk.openadsdk.component.pcc pccVar = this.vj;
            if (pcc2) {
                pccVar.gm();
            } else {
                pccVar.oo();
            }
            wh.pcc(this.sf, new pcc(this.pcc, this), 25);
        } else {
            sf(8);
            pcc(0);
            ork();
            this.vj.gm();
        }
        boolean z2 = true;
        if (this.qy != null) {
            if (!TextUtils.isEmpty(this.sf.ofe())) {
                this.qy.setText(this.sf.ofe());
            } else if (this.sf.xfm() != null) {
                this.qy.setText(this.sf.xfm().sf());
            }
            z = true;
            if (this.jsj != null) {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.sf.zk(), this.jsj, this.sf);
            }
            daxVar = this.tsz;
            if (daxVar != null) {
                rj.pcc((TextView) null, daxVar, this.sf);
                if (this.sf.xfm() == null || this.sf.xfm().oo() < 0.0d) {
                    this.tsz.setVisibility(8);
                }
                view = this.mk;
                if (view != null) {
                    view.setVisibility(z2 ? 0 : 8);
                    return;
                }
                return;
            }
            z2 = z;
            view = this.mk;
            if (view != null) {
            }
        }
        z = false;
        if (this.jsj != null) {
        }
        daxVar = this.tsz;
        if (daxVar != null) {
        }
        z2 = z;
        view = this.mk;
        if (view != null) {
        }
    }

    private void ork() {
        lu luVar = this.sf.by().get(0);
        String pcc2 = TextUtils.isEmpty(luVar.qf()) ? com.bytedance.sdk.component.utils.vj.pcc(luVar.pcc()) : luVar.qf();
        if (TextUtils.isEmpty(pcc2) || pcc2.contains("../") || pcc2.contains("/") || pcc2.contains("..")) {
            return;
        }
        File sf2 = com.bytedance.sdk.openadsdk.component.qf.pcc.sf(pcc2);
        com.bytedance.sdk.openadsdk.utils.lu.pcc(new com.bytedance.sdk.openadsdk.lo.pcc(luVar.pcc(), luVar.qf()), luVar.sf(), luVar.gm(), new sf(this), sf2 != null ? sf2.getParent() : null, 25);
    }

    private void vy() {
        if (this.gpj != null) {
            if (this.sf.xfm() == null || TextUtils.isEmpty(this.sf.xfm().sf())) {
                boolean isEmpty = TextUtils.isEmpty(this.sf.ofe());
                kj kjVar = this.gpj;
                if (isEmpty) {
                    kjVar.setVisibility(8);
                } else {
                    kjVar.setText(this.sf.ofe());
                }
            } else {
                this.gpj.setText(this.sf.xfm().sf());
            }
        }
        if (this.lo != null) {
            boolean isEmpty2 = TextUtils.isEmpty(this.sf.gmh());
            kj kjVar2 = this.lo;
            if (isEmpty2) {
                kjVar2.setVisibility(8);
            } else {
                kjVar2.setText(this.sf.gmh());
            }
        }
        if (this.lu != null && this.sf.zk() != null && !TextUtils.isEmpty(this.sf.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.sf.zk().pcc(), this.sf.zk().sf(), this.sf.zk().gm(), this.lu, this.sf);
        }
        this.vj.gm();
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = this.yt;
        if (gmVar != null) {
            gmVar.tmg();
        }
    }

    public int oo() {
        return -1;
    }

    public void pcc(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.vy.gm ooVar = new com.bytedance.sdk.openadsdk.component.vy.oo(this.pcc, this.sf);
        int hoh = this.sf.hoh();
        if (hoh == 5) {
            ooVar = new com.bytedance.sdk.openadsdk.component.vy.wh(this.pcc, this.sf);
        } else if (hoh == 4) {
            ooVar = new com.bytedance.sdk.openadsdk.component.vy.vj(this.pcc, this.sf);
        }
        com.bytedance.sdk.openadsdk.component.vy.gm gmVar = ooVar;
        this.hc = gmVar;
        viewGroup.addView(gmVar);
        this.nac = gmVar.getBackImage();
        this.kj = gmVar.getVideoContainer();
        this.gbb = gmVar.getImageView();
        this.dax = gmVar.getClickButton();
        this.jr = gmVar.getAdLogo();
        this.qy = gmVar.getAdTitleTextView();
        this.jsj = gmVar.getAdIconView();
        this.tsz = gmVar.getScoreBar();
        this.mk = gmVar.getOverlayLayout();
        if (this.sf.ye()) {
            this.lu = gmVar.getIconOnlyView();
            this.gpj = gmVar.getTitle();
            this.lo = gmVar.getContent();
        }
        if (gmVar.getDspAdChoice() != null) {
            gmVar.getDspAdChoice().pcc(14, this.sf);
        }
        if (!this.sf.uxz()) {
            this.of.pcc(gmVar, this.sf, this.tz, this.fum, this.gm);
        }
        this.vy = gmVar.getTopDisLike();
        this.ork = gmVar.getTopSkip();
        this.vh = gmVar.getTopCountDown();
        if (gmVar instanceof com.bytedance.sdk.openadsdk.component.vy.vj) {
            ((com.bytedance.sdk.openadsdk.component.vy.vj) gmVar).setRenderListener(new vj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.gm.1
                @Override // com.bytedance.sdk.openadsdk.component.vy.vj.pcc
                public void pcc(View view, int i) {
                    gm.this.vj.vj();
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.component.kj.gm qf() {
        return this.yt;
    }

    public void sf() {
        Window window;
        if (this.sf.uxz()) {
            this.vj.gm();
        } else {
            kj();
        }
        Activity activity = this.pcc;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    public void wh() {
        View view = this.vy;
        if (view == null || this.ork == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.pcc pccVar = gm.this.vj;
                if (pccVar != null) {
                    pccVar.sf(view2);
                }
            }
        });
        this.ork.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                com.bytedance.sdk.openadsdk.component.pcc pccVar = gm.this.vj;
                if (pccVar != null) {
                    pccVar.pcc(view2);
                }
            }
        });
    }

    public void vj() {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf implements lu.pcc {
        private final WeakReference<gm> pcc;

        public sf(gm gmVar) {
            this.pcc = new WeakReference<>(gmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
        public void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
            gm gmVar;
            if (!sfVar.vj() || (gmVar = this.pcc.get()) == null) {
                return;
            }
            gmVar.pcc(sfVar);
            if (sfVar.sf() != null) {
                gmVar.pcc(sfVar.pcc());
            }
        }

        @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
        public void pcc() {
        }
    }

    private void sf(int i) {
        rj.pcc((View) this.kj, i);
    }

    public JSONObject pcc(JSONObject jSONObject) {
        return null;
    }

    public void pcc() {
        this.jr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                        gm gmVar = gm.this;
                        IABLandingPageActivity.pcc(gmVar.pcc, gmVar.sf, "open_ad");
                    } else {
                        gm gmVar2 = gm.this;
                        TTWebsiteActivity.pcc(gmVar2.pcc, gmVar2.sf, "open_ad");
                    }
                } catch (Throwable th) {
                    lo.gm("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        wh();
        if (this.sf.uxz()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.pcc.pcc pcc2 = com.bytedance.sdk.openadsdk.component.pcc.sf.pcc(this.sf, this.pcc, this.tmg);
        pcc2.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.gm.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                gm.this.vj.vj();
            }
        });
        pcc2.pcc(this.yt);
        if (this.sf.ptr() == 1) {
            this.hc.setOnClickListener(pcc2);
            this.hc.setOnTouchListener(pcc2);
        }
        this.dax.setOnClickListener(pcc2);
        this.dax.setOnTouchListener(pcc2);
    }

    public boolean pcc(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = new com.bytedance.sdk.openadsdk.component.kj.gm(this.pcc);
        this.yt = gmVar;
        return gmVar.pcc(frameLayout, this.vj, this.sf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.nac.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.lu.pcc().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            lo.gm("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
        if (this.gbb == null) {
            return;
        }
        if (sfVar.sf() != null) {
            this.gbb.setImageBitmap(sfVar.sf());
            return;
        }
        Drawable oo = sfVar.oo();
        if (oo != null) {
            this.gbb.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && zzl.n(oo)) {
                a70.e(oo).start();
            }
            this.gbb.setImageDrawable(oo);
            return;
        }
        if (this.sf.by() == null || this.sf.by().get(0) == null) {
            return;
        }
        Drawable pcc2 = com.bytedance.sdk.openadsdk.utils.lu.pcc(sfVar.gm(), this.sf.by().get(0).sf());
        this.gbb.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.gbb.setImageDrawable(pcc2);
    }

    public void pcc(int i) {
        rj.pcc((View) this.gbb, i);
    }

    public void pcc(float f, float f2) {
        this.tz = f;
        this.fum = f2;
    }

    public void pcc(int i, boolean z) {
        kj kjVar;
        if (this.ork == null || (kjVar = this.vh) == null) {
            return;
        }
        if (z) {
            if (kjVar.getVisibility() != 8) {
                this.vh.setVisibility(8);
            }
            if (this.ork.getVisibility() != 0) {
                this.ork.setVisibility(0);
                return;
            }
            return;
        }
        this.vh.setText(mz1.i(i, "s"));
        if (this.vh.getVisibility() != 0) {
            this.vh.setVisibility(0);
        }
    }
}
