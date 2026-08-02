package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.atb;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.vy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm implements tsz.pcc {
    private boolean dax;
    private final int gm;
    private String gpj;
    private int hc;
    private volatile float kj;
    private View.OnTouchListener lo;
    private float lu;
    private float nac;
    private final List<Integer> oo;
    private volatile float qf;
    private final int sf;
    private long tmg;
    private long vh;
    private final int vj;
    private final Context wh;
    private float vy = -1.0f;
    private float ork = -1.0f;
    private final Handler jr = new tsz(vy.pcc().getLooper(), this);
    InterfaceC0057pcc pcc = new InterfaceC0057pcc() { // from class: com.bytedance.sdk.component.vy.pcc.1
        @Override // com.bytedance.sdk.component.vy.pcc.InterfaceC0057pcc
        public void pcc() {
            if (pcc.this.vy == -1.0f && pcc.this.ork == -1.0f && pcc.this.tmg == -1) {
                float unused = pcc.this.vy;
                float unused2 = pcc.this.ork;
                pcc pccVar = pcc.this;
                pccVar.vy = pccVar.qf;
                pcc pccVar2 = pcc.this;
                pccVar2.ork = pccVar2.kj;
                pcc pccVar3 = pcc.this;
                pccVar3.tmg = pccVar3.vh;
                pcc.this.dax = true;
            }
            float unused3 = pcc.this.vy;
            float unused4 = pcc.this.ork;
        }

        @Override // com.bytedance.sdk.component.vy.pcc.InterfaceC0057pcc
        public void pcc(int i) {
            pcc.this.hc = i;
            pcc.this.sf();
        }
    };
    private int fum = -1;
    private final List<Integer> gbb = new ArrayList();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.vy.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0057pcc {
        void pcc();

        void pcc(int i);
    }

    public pcc(Context context, int i, int i2, List<Integer> list, int i3) {
        this.wh = context;
        if (i == -1) {
            this.sf = atb.pcc(context);
        } else {
            this.sf = atb.pcc(context, i);
        }
        this.gm = atb.pcc(context, i2);
        this.oo = list;
        this.vj = i3;
    }

    private void pcc(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.hc);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.jr.sendMessageDelayed(obtain, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        this.vy = -1.0f;
        this.ork = -1.0f;
        this.tmg = -1L;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        pcc pccVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.vh = SystemClock.elapsedRealtime();
        this.qf = x;
        this.kj = y;
        if (action == 0) {
            pccVar = this;
            pccVar.nac = x;
            pccVar.lu = y;
        } else if (action != 1) {
            pccVar = this;
        } else {
            pccVar = this;
            if (pccVar.pcc(x, y, this.nac, this.lu, this.wh)) {
                int pcc = pccVar.pcc(pccVar.qf, pccVar.kj, pccVar.vh);
                boolean contains = pccVar.gbb.contains(Integer.valueOf(pccVar.hc));
                pccVar.pcc(view, motionEvent, pcc, !contains);
                if (!contains) {
                    pccVar.gbb.add(Integer.valueOf(pccVar.hc));
                }
                if (pcc == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = pccVar.lo;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.vy.gm
    public void pcc(View.OnTouchListener onTouchListener) {
        this.lo = onTouchListener;
    }

    public InterfaceC0057pcc pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.gpj = str;
    }

    private int pcc(float f, float f2, long j) {
        if (this.vy == -1.0f && this.ork == -1.0f && this.tmg == -1) {
            return 1;
        }
        if (!this.oo.contains(Integer.valueOf(this.hc))) {
            return 2;
        }
        if (j - this.tmg > this.vj) {
            sf();
            return 3;
        }
        float abs = Math.abs(f - this.vy);
        float abs2 = Math.abs(f2 - this.ork);
        if (abs <= this.sf / 2.0f && abs2 <= this.gm / 2.0f) {
            return 0;
        }
        sf();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.dax ? 1 : 0);
                    this.dax = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf() != null) {
                com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf().pcc(this.gpj, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
