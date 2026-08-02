package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.jr.sf.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.nn;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import defpackage.cem;
import defpackage.fem;
import defpackage.nem;
import defpackage.p03;
import defpackage.zdm;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends com.bytedance.sdk.openadsdk.core.wh.gm implements fem, tsz.pcc, gm.pcc {
    private long atb;
    public sf dax;
    private String fum;
    boolean gbb;
    protected FrameLayout gm;
    private boolean gpj;
    protected int hc;
    private final AtomicBoolean iv;
    protected boolean jr;
    private boolean jsj;
    protected ImageView kj;
    private ViewTreeObserver.OnGlobalLayoutListener kun;
    private boolean lo;
    private final Handler lq;
    private final Runnable lrr;
    private ViewGroup lu;
    private boolean mk;
    private boolean mu;
    private final Context nac;
    private final String nn;
    protected boolean oo;
    protected ImageView ork;
    protected final of pcc;
    private long pq;
    protected RelativeLayout qf;
    private boolean qy;
    private final AtomicBoolean rj;
    private View rnn;
    protected gm sf;
    protected String tmg;
    private zdm tsx;
    private boolean tsz;
    protected boolean vh;
    public boolean vj;
    protected ImageView vy;
    public qf wh;
    private final ViewTreeObserver.OnScrollChangedListener xb;
    private final boolean ye;
    private String yt;
    private boolean zti;
    private static final Integer tz = 0;
    private static final Integer of = 1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(View view, int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(boolean z, long j, long j2, long j3, boolean z2);
    }

    public wh(@NonNull Context context, @NonNull of ofVar, boolean z, String str, boolean z2, boolean z3, qf qfVar) {
        super(context);
        this.gpj = true;
        this.oo = true;
        this.lo = false;
        this.vj = false;
        this.qy = true;
        this.jsj = false;
        this.tsz = true;
        this.vh = true;
        this.tmg = "embeded_ad";
        this.hc = 50;
        this.mk = true;
        this.ye = false;
        this.lq = new tsz(jr.sf().getLooper(), this);
        this.mu = false;
        this.nn = Build.MODEL;
        this.gbb = false;
        this.jr = true;
        this.rj = new AtomicBoolean(false);
        this.lrr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.4
            @Override // java.lang.Runnable
            public void run() {
                wh whVar = wh.this;
                whVar.pcc(whVar.zti, wh.tz.intValue());
            }
        };
        this.iv = new AtomicBoolean(false);
        this.xb = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.6
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                wh.this.lu();
            }
        };
        try {
            if (ofVar.qte()) {
                this.yt = ((p03) CacheDirFactory.getICacheDir(0)).z();
            }
        } catch (Throwable unused) {
        }
        if (qfVar != null) {
            this.wh = qfVar;
        }
        this.tmg = str;
        this.nac = context;
        this.pcc = ofVar;
        this.lo = z;
        setContentDescription("NativeVideoTsView");
        this.jsj = z2;
        this.tsz = z3;
        sf();
        vj();
    }

    private void atb() {
        if (this.sf == null || zti()) {
            return;
        }
        if ((!qy() || com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_is_update_flag", false)) && qy()) {
            long vy = this.sf.vy();
            long qf = this.sf.qf() + vy;
            boolean pcc2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_native_video_complete", false);
            long pcc3 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_current_play_position", 0L);
            long pcc4 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_total_play_duration", qf);
            long pcc5 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_duration", vy);
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_is_update_flag", Boolean.FALSE);
            this.sf.sf(pcc2);
            this.sf.sf(pcc3);
            this.sf.gm(pcc4);
            this.sf.oo(pcc5);
        }
    }

    private void fum() {
        gm gmVar = this.sf;
        if (gmVar == null) {
            gpj();
        } else if (gmVar != null && !zti()) {
            this.sf.dax();
        }
        if (this.sf == null || !this.rj.get()) {
            return;
        }
        this.rj.set(false);
        sf();
        if (!kj()) {
            if (this.sf.hc()) {
                this.sf.hc();
                sf(true);
                return;
            } else {
                qf();
                rj.pcc((View) this.qf, 0);
                return;
            }
        }
        rj.pcc((View) this.qf, 8);
        ImageView imageView = this.vy;
        if (imageView != null) {
            rj.pcc((View) imageView, 8);
        }
        of ofVar = this.pcc;
        if (ofVar == null || ofVar.kez() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).m(), this.pcc);
        pcc2.sf(this.pcc.esn());
        pcc2.sf(this.lu.getWidth());
        pcc2.gm(this.lu.getHeight());
        pcc2.gm(this.pcc.hl());
        pcc2.pcc(0L);
        pcc2.pcc(vy());
        pcc(pcc2);
        this.sf.pcc(pcc2);
        this.sf.sf(false);
    }

    private void gpj() {
        this.sf = new gm(this.nac, this.gm, this.pcc, this.tmg, !zti(), this.jsj, this.tsz, this.wh);
        lo();
        if (this.kun == null) {
            this.kun = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    wh whVar;
                    gm gmVar;
                    if (wh.this.lu == null || wh.this.lu.getViewTreeObserver() == null || (gmVar = (whVar = wh.this).sf) == null) {
                        return;
                    }
                    gmVar.pcc(whVar.lu.getWidth(), wh.this.lu.getHeight());
                    wh.this.lu.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    wh.this.kun = null;
                }
            };
            this.lu.getViewTreeObserver().addOnGlobalLayoutListener(this.kun);
        }
    }

    private boolean jsj() {
        if (zti() || !qy()) {
            return false;
        }
        return com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_is_from_detail_page", false) || com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", false);
    }

    private void lo() {
        gm gmVar = this.sf;
        if (gmVar == null) {
            return;
        }
        gmVar.oo(this.gpj);
        this.sf.pcc((gm.pcc) this);
        this.sf.pcc((fem) this);
    }

    private boolean lq() {
        return 5 == lu.oo().sf(this.pcc.kot());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lu() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Handler handler = this.lq;
        if (handler == null || elapsedRealtime - this.pq <= 500) {
            return;
        }
        this.pq = elapsedRealtime;
        handler.sendEmptyMessageDelayed(1, 500L);
    }

    private void mk() {
        this.lq.removeMessages(1);
        jr.gm().removeCallbacks(this.lrr);
    }

    private void of() {
        if (!this.rj.get()) {
            this.rj.set(true);
            gm gmVar = this.sf;
            if (gmVar != null) {
                gmVar.pcc(true, 3);
            }
        }
        this.iv.set(false);
    }

    private void oo() {
        pcc(0L, 0);
        this.tsx = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, int i) {
        if (this.pcc == null || this.sf == null) {
            return;
        }
        boolean jsj = jsj();
        tsz();
        if (jsj && this.sf.hc()) {
            this.sf.hc();
            sf(true);
            oo();
            return;
        }
        if (!z || !this.qy || this.sf.hc() || this.sf.of()) {
            if (this.sf.vh() == null || !this.sf.vh().wh()) {
                return;
            }
            this.sf.sf();
            pcc(true);
            zdm zdmVar = this.tsx;
            if (zdmVar != null) {
                zdmVar.h_();
                return;
            }
            return;
        }
        if (this.sf.vh() == null || !this.sf.vh().qf()) {
            if (this.gpj && this.sf.vh() == null) {
                if (!this.rj.get()) {
                    this.rj.set(true);
                }
                this.iv.set(false);
                fum();
                return;
            }
            return;
        }
        if (this.gpj || i == 1) {
            gm gmVar = this.sf;
            if (gmVar != null) {
                pcc(gmVar.yt(), "changeVideoStatus");
            }
            if ("ALP-AL00".equals(this.nn)) {
                this.sf.gm();
            } else {
                if (!ork.sf().gbb()) {
                    jsj = true;
                }
                this.sf.qf(jsj);
            }
            pcc(false);
            zdm zdmVar2 = this.tsx;
            if (zdmVar2 != null) {
                zdmVar2.i_();
            }
        }
    }

    private void pq() {
        rj.vj(this.vy);
        rj.vj(this.qf);
    }

    private boolean qy() {
        of ofVar = this.pcc;
        if (ofVar == null) {
            return false;
        }
        return ofVar.zwm();
    }

    private void tsz() {
        if (zti() || !qy()) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_multi_native_video_data", "key_video_is_from_detail_page", bool);
    }

    private void tz() {
        this.dax = null;
        if (this.sf != null && !zti()) {
            this.sf.mu();
        }
        vh();
        pcc(false);
        of();
    }

    private void vj() {
        addView(pcc(this.nac));
        gpj();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                wh.this.lu();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                wh.this.lu();
            }
        });
    }

    private boolean ye() {
        return 2 == lu.oo().sf(this.pcc.kot());
    }

    private void yt() {
        this.zti = tmg();
        rnn.pcc(this.lrr);
    }

    private boolean zti() {
        return this.lo;
    }

    public void dax() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
        of ofVar = this.pcc;
        if (ofVar == null || (gto = ofVar.gto()) == null || (pcc2 = gto.pcc()) == null) {
            return;
        }
        pcc2.vj(this.atb);
    }

    public void gbb() {
        if (getNativeVideoController() == null || getNativeVideoController() == null) {
            return;
        }
        gm nativeVideoController = getNativeVideoController();
        nativeVideoController.pcc(nativeVideoController.tmg(), this);
    }

    public double getCurrentPlayTime() {
        if (this.sf != null) {
            return (r4.wh() * 1.0d) / 1000.0d;
        }
        return 0.0d;
    }

    public gm getNativeVideoController() {
        return this.sf;
    }

    public void gm() {
        if (hc()) {
            return;
        }
        jr();
    }

    public boolean hc() {
        if (com.bytedance.sdk.component.utils.lu.gm(lu.pcc()) == 0 || this.sf.vh() == null || !this.sf.vh().wh()) {
            return false;
        }
        pcc(false, tz.intValue());
        Handler handler = this.lq;
        if (handler != null) {
            handler.removeMessages(1);
        }
        return true;
    }

    public void jr() {
        if (com.bytedance.sdk.component.utils.lu.gm(lu.pcc()) != 0 && tmg()) {
            if (this.sf.vh() != null) {
                if (this.sf.vh().qf()) {
                    pcc(true, of.intValue());
                    sf();
                    Handler handler = this.lq;
                    if (handler != null) {
                        handler.sendEmptyMessageDelayed(1, 500L);
                        return;
                    }
                    return;
                }
                if (this.sf.vh().sf() && !this.jr) {
                    ork();
                    if (this.sf != null) {
                        this.sf.rnn();
                        return;
                    }
                    return;
                }
            }
            if (kj() || this.iv.get()) {
                return;
            }
            this.iv.set(true);
            pq();
            of ofVar = this.pcc;
            if (ofVar != null && ofVar.kez() != null) {
                pq();
                this.pcc.kez();
                com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).m(), this.pcc);
                pcc2.sf(this.pcc.esn());
                pcc2.sf(this.lu.getWidth());
                pcc2.gm(this.lu.getHeight());
                pcc2.gm(this.pcc.hl());
                pcc2.pcc(this.atb);
                pcc2.pcc(vy());
                pcc2.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).m());
                pcc(pcc2);
                this.sf.pcc(pcc2);
            }
            Handler handler2 = this.lq;
            if (handler2 != null) {
                handler2.sendEmptyMessageDelayed(1, 500L);
            }
            pcc(false);
        }
    }

    public boolean kj() {
        return this.gpj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        fum();
        if (this.jr) {
            getViewTreeObserver().addOnScrollChangedListener(this.xb);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tz();
        if (this.jr) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.xb);
            }
            ViewGroup viewGroup = this.lu;
            if (viewGroup == null || this.kun == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewGroup.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnGlobalLayoutListener(this.kun);
                this.kun = null;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        fum();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        sf sfVar;
        gm gmVar;
        if (!this.lo && (sfVar = this.dax) != null && (gmVar = this.sf) != null) {
            sfVar.pcc(gmVar.hc(), this.sf.vy(), this.sf.zti(), this.sf.wh(), this.gpj);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        tz();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        gm gmVar;
        gm gmVar2;
        gm gmVar3;
        gm gmVar4;
        if ("open_ad".equals(this.tmg)) {
            mk();
            return;
        }
        this.qy = z;
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(this.pcc, z);
        atb();
        if (this.jr) {
            if (jsj() && (gmVar4 = this.sf) != null && gmVar4.hc()) {
                tsz();
                rj.pcc((View) this.qf, 8);
                sf(true);
                oo();
                return;
            }
            sf();
            if (!zti() && kj() && (gmVar2 = this.sf) != null && !gmVar2.of()) {
                if (this.lq != null) {
                    if (z && (gmVar3 = this.sf) != null && !gmVar3.hc()) {
                        this.lq.obtainMessage(1).sendToTarget();
                        return;
                    } else {
                        mk();
                        pcc(false, tz.intValue());
                        return;
                    }
                }
                return;
            }
            if (kj()) {
                return;
            }
            if (!z && (gmVar = this.sf) != null && gmVar.vh() != null && this.sf.vh().wh()) {
                mk();
                pcc(false, tz.intValue());
            } else if (z) {
                this.lq.obtainMessage(1).sendToTarget();
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        gm gmVar;
        of ofVar;
        gm gmVar2;
        gm gmVar3;
        super.onWindowVisibilityChanged(i);
        atb();
        if (jsj() && (gmVar3 = this.sf) != null && gmVar3.hc()) {
            tsz();
            rj.pcc((View) this.qf, 8);
            sf(true);
            oo();
            return;
        }
        sf();
        if (zti() || !kj() || (gmVar = this.sf) == null || gmVar.of() || (ofVar = this.pcc) == null) {
            return;
        }
        if (this.mk && ofVar.kez() != null) {
            this.pcc.kez();
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).m(), this.pcc);
            pcc2.sf(this.pcc.esn());
            pcc2.sf(this.lu.getWidth());
            pcc2.gm(this.lu.getHeight());
            pcc2.gm(this.pcc.hl());
            pcc2.pcc(this.atb);
            pcc2.pcc(vy());
            pcc(pcc2);
            this.sf.pcc(pcc2);
            this.mk = false;
            rj.pcc((View) this.qf, 8);
        }
        if (i != 0 || !this.jr || this.lq == null || (gmVar2 = this.sf) == null || gmVar2.hc()) {
            return;
        }
        this.lq.obtainMessage(1).sendToTarget();
    }

    public void ork() {
        gm gmVar = this.sf;
        if (gmVar != null) {
            vj tmg = gmVar.tmg();
            if (tmg != null) {
                tmg.pcc();
            }
            pq();
        }
    }

    public void qf() {
        View view;
        if (this.nac == null || (view = this.rnn) == null || view.getParent() == null || this.pcc == null || this.qf != null) {
            return;
        }
        ViewParent parent = this.rnn.getParent();
        RelativeLayout sf2 = sf(this.nac);
        if (parent != null && (parent instanceof ViewGroup)) {
            pcc(sf2, (ViewGroup) parent, this.rnn);
        }
        this.qf = sf2;
        if (this.vh) {
            rj.pcc((View) this.ork, 0);
        }
        if (this.pcc.kez() != null && this.pcc.kez().f != null) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.pcc.kez().f, this.pcc.kez().b, this.pcc.kez().a, this.kj, this.pcc);
        }
        ImageView imageView = this.ork;
        if (imageView != null) {
            imageView.setClickable(true);
            this.ork.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    wh.this.gm();
                }
            });
        }
    }

    public void setAdCreativeClickListener(pcc pccVar) {
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.pcc(pccVar);
        }
    }

    public void setControllerStatusCallBack(sf sfVar) {
        this.dax = sfVar;
    }

    public void setIsAutoPlay(boolean z) {
        if (this.mu) {
            return;
        }
        int sf2 = lu.oo().sf(this.pcc.kot());
        if (z && sf2 != 4 && (!com.bytedance.sdk.component.utils.lu.vj(this.nac) ? !(!com.bytedance.sdk.component.utils.lu.wh(this.nac) ? com.bytedance.sdk.component.utils.lu.oo(this.nac) : ye() || lq()) : !ye())) {
            z = false;
        }
        this.gpj = z;
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.oo(z);
        }
        if (this.gpj) {
            rj.pcc((View) this.qf, 8);
        } else {
            qf();
            RelativeLayout relativeLayout = this.qf;
            if (relativeLayout != null) {
                rj.pcc((View) relativeLayout, 0);
                of ofVar = this.pcc;
                if (ofVar != null && ofVar.kez() != null) {
                    com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.pcc.kez().f, this.pcc.kez().b, this.pcc.kez().a, this.kj, this.pcc);
                }
            }
        }
        this.mu = true;
    }

    public void setNeedNativeVideoPlayBtnVisible(boolean z) {
        this.vh = z;
    }

    public void setNeedSelfManagerVideo(boolean z) {
        this.jr = z;
    }

    public void setVideoAdClickListenerTTNativeAd(PAGNativeAd pAGNativeAd) {
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.pcc(pAGNativeAd);
        }
    }

    public void setVideoAdInteractionListener(zdm zdmVar) {
        this.tsx = zdmVar;
    }

    public void setVideoAdLoadListener(cem cemVar) {
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.pcc(cemVar);
        }
    }

    public void setVideoCacheUrl(String str) {
        this.fum = str;
    }

    public void setVideoPlayCallback(com.bytedance.sdk.openadsdk.core.jr.sf.sf sfVar) {
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.pcc(sfVar);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            of();
        }
    }

    public void sf() {
        of ofVar = this.pcc;
        if (ofVar == null) {
            return;
        }
        int kot = ofVar.kot();
        int sf2 = lu.oo().sf(kot);
        int gm = com.bytedance.sdk.component.utils.lu.gm(lu.pcc());
        if (sf2 == 1) {
            this.gpj = kun.oo(gm);
        } else if (sf2 == 2) {
            this.gpj = kun.vj(gm) || kun.oo(gm) || kun.wh(gm);
        } else if (sf2 == 3) {
            this.gpj = false;
        } else if (sf2 == 4) {
            this.gbb = true;
        } else if (sf2 == 5) {
            this.gpj = kun.oo(gm) || kun.wh(gm);
        }
        if (this.lo) {
            this.oo = false;
        } else if (!this.vj || !com.bytedance.sdk.openadsdk.core.ork.tsz.sf(this.tmg)) {
            this.oo = lu.oo().gm(String.valueOf(kot));
        }
        if ("open_ad".equals(this.tmg)) {
            this.gpj = true;
            this.oo = true;
        }
        if (com.bytedance.sdk.openadsdk.core.ork.tsz.sf(this.tmg)) {
            this.oo = true;
        }
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.oo(this.gpj);
        }
        this.vj = true;
    }

    public boolean tmg() {
        return nn.pcc(this, 50, com.bytedance.sdk.openadsdk.core.ork.tsz.sf(this.tmg) ? 1 : 5, false);
    }

    public void vh() {
        vj tmg;
        gm gmVar = this.sf;
        if (gmVar == null || (tmg = gmVar.tmg()) == null) {
            return;
        }
        tmg.pcc();
        View gm = tmg.gm();
        if (gm != null) {
            gm.setVisibility(8);
            if (gm.getParent() != null) {
                ((ViewGroup) gm.getParent()).removeView(gm);
            }
        }
    }

    public boolean vy() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.gm.pcc
    public void wh() {
        zdm zdmVar = this.tsx;
        if (zdmVar != null) {
            zdmVar.g_();
        }
    }

    public wh(@NonNull Context context, @NonNull of ofVar, String str, boolean z, boolean z2, qf qfVar) {
        this(context, ofVar, false, str, z, z2, qfVar);
    }

    public wh(@NonNull Context context, @NonNull of ofVar, qf qfVar) {
        this(context, ofVar, false, qfVar);
    }

    public wh(@NonNull Context context, @NonNull of ofVar, boolean z, qf qfVar) {
        this(context, ofVar, z, "embeded_ad", false, false, qfVar);
    }

    @Override // defpackage.fem
    public void sf(long j, int i) {
    }

    private RelativeLayout sf(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(context);
        qfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        qfVar.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ooVar.setLayoutParams(layoutParams);
        ooVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.kj = ooVar;
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        ooVar2.setLayoutParams(layoutParams2);
        ooVar2.setVisibility(8);
        ooVar2.setBackground(tz.gm(context, "tt_new_play_video"));
        this.ork = ooVar2;
        qfVar.addView(ooVar);
        qfVar.addView(ooVar2);
        return qfVar;
    }

    public void sf(boolean z) {
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.sf(z);
            vj tmg = this.sf.tmg();
            if (tmg != null) {
                tmg.sf();
                View gm = tmg.gm();
                if (gm != null) {
                    if (gm.getParent() != null) {
                        ((ViewGroup) gm.getParent()).removeView(gm);
                    }
                    gm.setVisibility(0);
                    addView(gm);
                    tmg.pcc((Object) this.pcc, new WeakReference(this.nac), false);
                }
            }
        }
    }

    @Override // defpackage.fem
    public void pcc(long j, int i) {
        zdm zdmVar = this.tsx;
        if (zdmVar != null) {
            zdmVar.j_();
        }
    }

    @Override // defpackage.fem
    public void pcc(long j, long j2) {
        zdm zdmVar = this.tsx;
        if (zdmVar != null) {
            zdmVar.pcc(j, j2);
        }
    }

    private View pcc(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        new FrameLayout.LayoutParams(-1, -1).gravity = 17;
        frameLayout.setVisibility(8);
        this.lu = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout.addView(frameLayout2);
        this.gm = frameLayout2;
        View view = new View(context);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(view);
        this.rnn = view;
        return frameLayout;
    }

    private void pcc(View view, ViewGroup viewGroup, View view2) {
        int indexOfChild = viewGroup.indexOfChild(view2);
        viewGroup.removeViewInLayout(view2);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    public boolean pcc(long j, boolean z, boolean z2) {
        boolean z3 = false;
        this.lu.setVisibility(0);
        this.atb = j;
        if (!zti()) {
            return true;
        }
        this.sf.pcc(false);
        of ofVar = this.pcc;
        if (ofVar != null && ofVar.kez() != null) {
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(((p03) CacheDirFactory.getICacheDir(this.pcc.we())).m(), this.pcc);
            pcc2.sf(this.pcc.esn());
            pcc2.sf(this.lu.getWidth());
            pcc2.gm(this.lu.getHeight());
            pcc2.gm(this.pcc.hl());
            pcc2.pcc(j);
            pcc2.pcc(vy());
            pcc(pcc2);
            gm gmVar = this.sf;
            if (z2) {
                gmVar.sf(pcc2);
                return true;
            }
            z3 = gmVar.pcc(pcc2);
        }
        if (((j > 0 && !z && !z2) || (j > 0 && z)) && this.sf != null) {
            jr.pcc pccVar = new jr.pcc();
            pccVar.sf(this.sf.wh());
            pccVar.oo(this.sf.vy());
            pccVar.gm(this.sf.qf());
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(this.sf.tmg(), pccVar);
        }
        return z3;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        if (message.what == 1) {
            yt();
        }
    }

    @Override // defpackage.fem
    public void pcc() {
    }

    public void pcc(boolean z, String str) {
        if (com.bytedance.sdk.openadsdk.core.ork.tsz.sf(this.tmg)) {
            z = true;
        }
        this.oo = z;
        gm gmVar = this.sf;
        if (gmVar != null) {
            gmVar.pcc(z, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.gm.pcc
    public void pcc(int i) {
        sf();
    }

    public void pcc(boolean z) {
        if (this.vy == null) {
            ImageView imageView = new ImageView(getContext());
            this.vy = imageView;
            imageView.setImageResource(tz.oo(lu.pcc(), "tt_new_play_video"));
            this.vy.setScaleType(ImageView.ScaleType.FIT_XY);
            int sf2 = rj.sf(getContext(), this.hc);
            int sf3 = rj.sf(getContext(), 10.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sf2, sf2);
            layoutParams.gravity = 17;
            layoutParams.rightMargin = sf3;
            layoutParams.bottomMargin = sf3;
            this.lu.addView(this.vy, layoutParams);
            this.vy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.wh.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    wh.this.jr();
                }
            });
        }
        ImageView imageView2 = this.vy;
        if (z) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public com.bytedance.sdk.openadsdk.core.gbb.wh pcc(List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (this.sf != null) {
            return this.sf.pcc(this, list);
        }
        return null;
    }

    private void pcc(nem nemVar) {
        try {
            if (this.pcc.qte()) {
                nemVar.pcc(this.yt);
            }
        } catch (Throwable unused) {
        }
    }
}
