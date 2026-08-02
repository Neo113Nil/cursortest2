package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.dax.pcc.pcc;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements tsz.pcc {
    long dax;
    float gbb;
    long gpj;
    float hc;
    float jr;
    boolean kj;
    private boolean lq;
    boolean lu;
    boolean nac;
    WebView oo;
    int ork;
    Context pcc;
    boolean qf;
    of sf;
    float tmg;
    private final boolean tsz;
    float vh;
    String vy;
    private long ye;
    private final Handler jsj = new tsz(jr.sf().getLooper(), this);
    String gm = "landingpage";
    int wh = 0;
    private final String mk = ".*\\/serp\\?sc=.*&clkt=\\d+$";
    private final String atb = ".*\\/\\?caf_results=.*&clkt=\\d+$";
    pcc yt = new pcc() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.qf.1
        @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.qf.pcc
        public void pcc() {
            qf qfVar = qf.this;
            qfVar.kj = true;
            qfVar.wh();
            qf qfVar2 = qf.this;
            qfVar2.pcc(2, qfVar2.vy, qfVar2.ork);
        }
    };
    GestureDetector qy = new GestureDetector(lu.pcc(), new GestureDetector.SimpleOnGestureListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.qf.2
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            qf.this.nac = true;
            return false;
        }
    });
    int vj = lu.oo().lo();
    Map<Integer, Long> lo = new HashMap();
    Map<Integer, Float> fum = new HashMap();
    Map<Integer, Long> tz = new HashMap();
    List<Integer> of = new ArrayList();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();
    }

    public qf(WebView webView, of ofVar, Context context, boolean z) {
        this.sf = ofVar;
        this.oo = webView;
        this.pcc = context;
        this.tsz = z;
    }

    private void gm(int i) {
        if (qf()) {
            return;
        }
        wh();
        this.qf = true;
        com.bytedance.sdk.openadsdk.dax.pcc.pcc pcc2 = new pcc.C0106pcc().pcc(this.vy).pcc(this.ork).pcc(this.vh).sf(this.tmg).gm(this.gpj).gm(i).pcc();
        try {
            if (this.lq) {
                WebView.HitTestResult hitTestResult = this.oo.getHitTestResult();
                pcc2.pcc(hitTestResult.getExtra());
                pcc2.pcc(hitTestResult.getType());
            }
        } catch (Throwable unused) {
        }
        Message obtain = Message.obtain();
        obtain.what = 200;
        obtain.obj = pcc2;
        this.jsj.sendMessageDelayed(obtain, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kj() {
        WebBackForwardList copyBackForwardList = this.oo.copyBackForwardList();
        if (copyBackForwardList != null) {
            int currentIndex = copyBackForwardList.getCurrentIndex();
            this.ork = currentIndex + 1;
            if (this.tsz) {
                this.ork = currentIndex + 2;
            }
        }
    }

    private void oo() {
        if (qf()) {
            return;
        }
        com.bytedance.sdk.openadsdk.dax.pcc.pcc pcc2 = new pcc.C0106pcc().pcc(this.vy).pcc(this.ork).oo(this.vh).vj(this.tmg).wh(this.jr).qf(this.gpj).pcc();
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = pcc2;
        this.jsj.sendMessageDelayed(obtain, 20L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, String str, int i2) {
        if (qf()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long l = this.lo.get(Integer.valueOf(i2));
        long longValue = l != null ? l.longValue() : elapsedRealtime;
        Float f = this.fum.get(Integer.valueOf(i2));
        com.bytedance.sdk.openadsdk.oo.gm.gm(this.sf, new pcc.C0106pcc().pcc(str).pcc(i2).kj(elapsedRealtime - longValue).vy(f == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue()).sf(i).pcc(), this.gm);
    }

    private boolean qf() {
        int i = this.wh + 1;
        this.wh = i;
        if (i > this.vj) {
            return true;
        }
        return ("landingpage".equals(this.gm) || "landingpage_endcard".equals(this.gm) || "landingpage_split_screen".equals(this.gm) || "landingpage_direct".equals(this.gm) || "landingpage_split_ceiling".equals(this.gm)) ? false : true;
    }

    private void sf(int i) {
        if (qf() || this.of.contains(Integer.valueOf(i))) {
            return;
        }
        this.of.add(Integer.valueOf(i));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.sf, new pcc.C0106pcc().pcc(this.vy).pcc(this.ork).ork(elapsedRealtime - (this.tz.get(Integer.valueOf(i)) != null ? r6.longValue() : elapsedRealtime)).pcc(), this.gm);
    }

    private boolean vj() {
        try {
            int i = this.ork;
            if (i != 2 && i != 3) {
                return false;
            }
            if (Pattern.matches(".*\\/serp\\?sc=.*&clkt=\\d+$", this.vy)) {
                return true;
            }
            return Pattern.matches(".*\\/\\?caf_results=.*&clkt=\\d+$", this.vy);
        } catch (Throwable th) {
            lo.gm("WebArbitrageBehavior", th.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        if (this.fum.get(Integer.valueOf(this.ork)) != null) {
            return;
        }
        float height = this.oo.getHeight() / rj.sf(this.pcc, this.oo.getContentHeight());
        if (height < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height > 1.0f) {
            height = 0.0f;
        }
        this.fum.put(Integer.valueOf(this.ork), Float.valueOf(height));
    }

    private void oo(String str) {
        if (qf()) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.sf, new pcc.C0106pcc().pcc(this.vy).sf(Uri.decode(str)).pcc(), this.gm);
    }

    public void sf(String str) {
        this.vy = str;
        kj();
        this.lo.put(Integer.valueOf(this.ork), Long.valueOf(SystemClock.elapsedRealtime()));
        this.tz.put(Integer.valueOf(this.ork), Long.valueOf(SystemClock.elapsedRealtime()));
        this.lq = vj();
    }

    public void pcc(String str) {
        this.gm = str;
    }

    public void pcc() {
        sf(this.ork);
    }

    public void sf() {
        this.oo.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.qf.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z) {
                if (!z) {
                    qf qfVar = qf.this;
                    if (!qfVar.kj) {
                        qfVar.wh();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - qf.this.ye >= 50) {
                            qf qfVar2 = qf.this;
                            qfVar2.pcc(3, qfVar2.vy, qfVar2.ork);
                            qf.this.ye = elapsedRealtime;
                            return;
                        }
                        return;
                    }
                    qfVar.kj = false;
                }
                if (z) {
                    qf.this.kj();
                    qf qfVar3 = qf.this;
                    qfVar3.lo.put(Integer.valueOf(qfVar3.ork), Long.valueOf(SystemClock.elapsedRealtime()));
                }
            }
        });
    }

    public void pcc(int i) {
        float height = (this.oo.getHeight() + i) / rj.sf(this.pcc, this.oo.getContentHeight());
        Float f = this.fum.get(Integer.valueOf(this.ork));
        if (height > (f == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f.floatValue())) {
            this.fum.put(Integer.valueOf(this.ork), Float.valueOf(height));
        }
    }

    private boolean sf(MotionEvent motionEvent) {
        this.hc = motionEvent.getX();
        float y = motionEvent.getY();
        this.gbb = y;
        float f = this.tmg;
        if (y - f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        this.jr = y - f;
        return true;
    }

    public void gm(String str) {
        if (this.qf) {
            this.lu = true;
        }
        if (this.ork == 1 && !TextUtils.isEmpty(str) && str.contains("query=")) {
            int indexOf = str.indexOf("query=") + 6;
            int indexOf2 = str.indexOf(U3.j.c, indexOf);
            if (indexOf < 0 || indexOf2 >= str.length() || indexOf2 <= indexOf) {
                return;
            }
            oo(str.substring(indexOf, indexOf2));
        }
    }

    public void pcc(MotionEvent motionEvent) {
        this.qy.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vh = motionEvent.getX();
            this.tmg = motionEvent.getY();
            this.dax = SystemClock.elapsedRealtime();
        } else if (action != 1) {
            if (action != 3) {
                return;
            }
            gm(2);
        } else {
            this.gpj = SystemClock.elapsedRealtime() - this.dax;
            if (sf(motionEvent)) {
                oo();
            } else {
                gm(1);
            }
        }
    }

    public pcc gm() {
        return this.yt;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        com.bytedance.sdk.openadsdk.dax.pcc.pcc pccVar = (com.bytedance.sdk.openadsdk.dax.pcc.pcc) message.obj;
        if (i == 100) {
            pccVar.oo(this.nac ? 2 : 1);
            com.bytedance.sdk.openadsdk.oo.gm.oo(this.sf, pccVar, this.gm);
            this.nac = false;
        } else if (i == 200) {
            if (this.lu) {
                pcc(1, pccVar.gm(), pccVar.oo());
            }
            pccVar.gm(this.lu ? 1 : 0);
            com.bytedance.sdk.openadsdk.oo.gm.vj(this.sf, pccVar, this.gm);
            this.qf = false;
            this.lu = false;
        }
    }
}
