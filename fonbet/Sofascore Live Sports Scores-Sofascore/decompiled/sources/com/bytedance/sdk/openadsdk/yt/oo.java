package com.bytedance.sdk.openadsdk.yt;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.yt.sf;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import com.ironsource.C4427z5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private wh gm;
    private pcc oo;
    private gm sf;
    private final String pcc = "StrategyCenter";
    private int vj = 0;
    private final ConcurrentHashMap<String, Object> wh = new ConcurrentHashMap<>();
    private Runnable qf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.oo.2
        @Override // java.lang.Runnable
        public void run() {
            oo.this.gm();
        }
    };

    public oo(wh whVar) {
        this.sf = null;
        qf qfVar = new qf(whVar);
        this.gm = qfVar;
        String gm = qfVar.gm();
        if (!TextUtils.isEmpty(gm) && !gm.startsWith("pag")) {
            gm = "pag_".concat(gm);
        }
        this.sf = new gm(this.gm.sf(), gm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        wh whVar = this.gm;
        if (whVar == null || whVar.vj() == null || this.gm.wh() == null || this.gm.kj()) {
            return;
        }
        this.gm.pcc().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.oo.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                oo.this.vj++;
                try {
                    if (oo.this.oo != null) {
                        oo.this.oo.pcc();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(oo.this.gm.vj()).openConnection()));
                    if (oo.this.gm.qf() != null && oo.this.gm.qf().size() > 0) {
                        for (Map.Entry<String, String> entry : oo.this.gm.qf().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod(C4094gc.b);
                    httpURLConnection.setRequestProperty("Content-Type", C4427z5.M);
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(oo.this.gm.wh().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(readLine);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject pcc = oo.this.gm.pcc(new JSONObject(stringBuffer.toString()));
                                oo.this.sf.sf();
                                oo.this.oo();
                                oo.this.sf.pcc(pcc);
                                if (oo.this.oo != null) {
                                    oo.this.oo.sf();
                                }
                            } else if (oo.this.oo != null) {
                                oo.this.oo.pcc(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    if (th3.getMessage() != null) {
                        th3.getMessage();
                    }
                    if (oo.this.oo != null) {
                        oo.this.oo.pcc(-1, th3.getMessage());
                    }
                }
                oo.this.sf.pcc("local_last_update_time", System.currentTimeMillis());
                oo.this.pcc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        this.wh.clear();
    }

    public void pcc() {
        if (this.gm != null) {
            int i = 3600000;
            int pcc = this.sf.pcc("req_interval", 3600000);
            long j = 0;
            long sf = this.sf.sf("local_last_update_time", 0L);
            if (pcc >= 600000 && pcc <= 86400000) {
                i = pcc;
            }
            long currentTimeMillis = System.currentTimeMillis() - sf;
            "before  realInterval=".concat(String.valueOf(currentTimeMillis));
            if (currentTimeMillis >= 0) {
                long j2 = i;
                if (currentTimeMillis <= j2) {
                    j = j2 - currentTimeMillis;
                }
            }
            "after  realInterval=".concat(String.valueOf(j));
            this.gm.oo().removeCallbacks(this.qf);
            if (this.vj > 24) {
                return;
            }
            this.gm.oo().postDelayed(this.qf, j);
        }
    }

    public gm sf() {
        return this.sf;
    }

    public void pcc(pcc pccVar) {
        this.oo = pccVar;
    }

    public int pcc(String str, int i) {
        gm gmVar = this.sf;
        return gmVar == null ? i : gmVar.pcc(str, i);
    }

    public String pcc(String str, String str2) {
        gm gmVar = this.sf;
        return gmVar == null ? str2 : gmVar.pcc(str, str2);
    }

    public boolean pcc(String str, boolean z) {
        gm gmVar = this.sf;
        return gmVar == null ? z : gmVar.pcc(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r4.getClass().isInstance(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> T pcc(String str, T t, sf.pcc<T> pccVar) {
        if (this.sf != null && str != null) {
            T t2 = (T) this.wh.get(str);
            if (t2 != null) {
                if (t != null) {
                }
                return t2;
            }
            if (pccVar != null) {
                try {
                    T t3 = (T) this.sf.pcc(str, t, pccVar);
                    if (t3 != null) {
                        this.wh.put(str, t3);
                        return t3;
                    }
                } catch (Exception unused) {
                }
            }
        }
        return t;
    }
}
