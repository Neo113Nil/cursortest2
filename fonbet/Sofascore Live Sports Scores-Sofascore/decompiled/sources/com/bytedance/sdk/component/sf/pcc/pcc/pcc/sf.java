package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.hc;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4094gc;
import defpackage.mz1;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements com.bytedance.sdk.component.sf.pcc.sf {
    private static List<Object> vj;
    tmg pcc;
    com.bytedance.sdk.component.sf.pcc.oo sf;
    private AtomicBoolean oo = new AtomicBoolean(false);
    private final String gm = System.identityHashCode(this) + "-" + System.currentTimeMillis();

    static {
        try {
            vj = new ArrayList();
            Class<?> cls = Class.forName("com.android.okhttp.Protocol");
            Enum valueOf = Enum.valueOf(cls, "HTTP_1_1");
            if (valueOf != null) {
                vj.add(valueOf);
            }
            Enum valueOf2 = Enum.valueOf(cls, "HTTP_2");
            if (valueOf2 != null) {
                vj.add(valueOf2);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public sf(tmg tmgVar, com.bytedance.sdk.component.sf.pcc.oo ooVar) {
        this.pcc = tmgVar;
        this.sf = ooVar;
    }

    private static void gm(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass().getDeclaredMethod("setRetryOnConnectionFailure", Boolean.TYPE).invoke(obj2, Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0140 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private gbb pcc(tmg tmgVar, List<String> list) throws IOException {
        long j;
        boolean z;
        int i;
        gbb sf;
        gbb gbbVar;
        String url = tmgVar.oo().pcc().toString();
        List<String> pcc = com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(url, list);
        long currentTimeMillis = System.currentTimeMillis();
        long sf2 = tmgVar.sf();
        int size = pcc.size();
        boolean z2 = false;
        gbb gbbVar2 = null;
        int i2 = 0;
        while (i2 < size) {
            String str = pcc.get(i2);
            boolean z3 = (str == null || !str.equals(url)) ? z2 : true;
            if (System.currentTimeMillis() - currentTimeMillis > sf2) {
                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, -1, "Total timeout", false, i2 + 1, size);
                return gbbVar2 != null ? gbbVar2 : new kj(-1, "Total timeout", tmgVar, str);
            }
            int i3 = i2;
            if (this.oo.get()) {
                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.sf, "Request canceled", false, 1 + i3, size);
                return new kj(kj.sf, "Request canceled", tmgVar, str);
            }
            int i4 = i3 + 1;
            try {
                pcc.size();
                sf = sf(z3 ? tmgVar : pcc(tmgVar, str), com.bytedance.sdk.component.qf.pcc.vj());
                if (sf instanceof kj) {
                    ((kj) sf).pcc(str);
                }
                try {
                } catch (IOException e) {
                    e = e;
                    gbbVar = sf;
                    j = currentTimeMillis;
                    z = z2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (sf.oo()) {
                try {
                    com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, true);
                    return sf;
                } catch (IOException e3) {
                    e = e3;
                    gbbVar2 = sf;
                    j = currentTimeMillis;
                    z = z2;
                    i = i3;
                    e.getMessage();
                    com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z);
                    com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.pcc, e.getMessage(), true, i + 1, size);
                    if (i == pcc.size() - 1) {
                    }
                    i2 = i + 1;
                    z2 = z;
                    currentTimeMillis = j;
                }
            } else {
                com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z2);
                boolean z4 = z2;
                try {
                    try {
                        try {
                            gbbVar = sf;
                            j = currentTimeMillis;
                            z = z4;
                            i = i3;
                            try {
                                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, sf.gm(), sf.vj(), true, i4, size);
                                gbbVar.gm();
                            } catch (IOException e4) {
                                e = e4;
                                gbbVar2 = gbbVar;
                                e.getMessage();
                                com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z);
                                com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.pcc, e.getMessage(), true, i + 1, size);
                                if (i == pcc.size() - 1) {
                                    e.getMessage();
                                }
                                i2 = i + 1;
                                z2 = z;
                                currentTimeMillis = j;
                            }
                        } catch (IOException e5) {
                            e = e5;
                            gbbVar = sf;
                            j = currentTimeMillis;
                            z = z4;
                            i = i3;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        gbbVar = sf;
                        j = currentTimeMillis;
                        z = z4;
                        i = i3;
                        gbbVar2 = gbbVar;
                        e.getMessage();
                        com.bytedance.sdk.component.qf.gm.gm.pcc().pcc(str, url, z);
                        com.bytedance.sdk.component.qf.pcc.pcc(this.gm, url, str, kj.pcc, e.getMessage(), true, i + 1, size);
                        if (i == pcc.size() - 1) {
                        }
                        i2 = i + 1;
                        z2 = z;
                        currentTimeMillis = j;
                    }
                } catch (IOException e7) {
                    e = e7;
                    gbbVar = sf;
                }
                if (i == pcc.size() - 1) {
                    return gbbVar;
                }
                gbbVar2 = gbbVar;
                i2 = i + 1;
                z2 = z;
                currentTimeMillis = j;
            }
        }
        return gbbVar2 != null ? gbbVar2 : new kj(kj.pcc, "No URLs to try", tmgVar, (String) mz1.g(1, pcc));
    }

    private gbb sf(tmg tmgVar, boolean z) throws IOException {
        HttpURLConnection httpURLConnection;
        IOException e;
        String pcc;
        int responseCode;
        int i = kj.pcc;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(tmgVar.oo().pcc().toString()).openConnection()));
            if (z) {
                try {
                    if (!"setting".equals(tmgVar.kj()) && !"gecko".equals(tmgVar.kj()) && !"load_ug_t".equals(tmgVar.kj()) && !"pixel_web".equals(tmgVar.kj())) {
                        sf(httpURLConnection);
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (i == -1 && z) {
                        tmgVar.oo().pcc().toString();
                        return sf(tmgVar, false);
                    }
                    pcc = pcc(httpURLConnection, e);
                    return new kj(i, pcc, tmgVar);
                } catch (Exception e3) {
                    e = e3;
                    httpURLConnection2 = httpURLConnection;
                    pcc = pcc(httpURLConnection2, e);
                    return new kj(i, pcc, tmgVar);
                }
            }
            if (tmgVar.wh() != null && !tmgVar.wh().isEmpty()) {
                for (Map.Entry<String, List<String>> entry : tmgVar.wh().entrySet()) {
                    String key = entry.getKey();
                    for (String str : entry.getValue()) {
                        if ("_disable_retry".equals(key) && "1".equals(str)) {
                            gm(httpURLConnection);
                        } else {
                            httpURLConnection.addRequestProperty(key, str);
                        }
                    }
                }
            }
            vh vhVar = tmgVar.pcc;
            if (vhVar != null) {
                TimeUnit timeUnit = vhVar.gm;
                if (timeUnit != null) {
                    httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(vhVar.sf));
                }
                vh vhVar2 = tmgVar.pcc;
                TimeUnit timeUnit2 = vhVar2.vj;
                if (timeUnit2 != null) {
                    httpURLConnection.setReadTimeout((int) timeUnit2.toMillis(vhVar2.oo));
                }
            }
            if (tmgVar.ork() == null) {
                httpURLConnection.setRequestMethod(C4094gc.a);
            } else {
                if (!vj() && tmgVar.ork().gm != null) {
                    httpURLConnection.addRequestProperty("Content-Type", tmgVar.ork().gm.pcc());
                }
                httpURLConnection.setRequestMethod(tmgVar.vj());
                if (C4094gc.b.equalsIgnoreCase(tmgVar.vj())) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    if (pcc(tmgVar.ork())) {
                        outputStream.write(tmgVar.ork().vj);
                    } else if (sf(tmgVar.ork())) {
                        outputStream.write(tmgVar.ork().oo.getBytes());
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
            com.bytedance.sdk.component.gm.pcc.pcc pccVar = tmgVar.sf;
            if (pccVar != null) {
                pccVar.sf();
            }
            httpURLConnection.connect();
            com.bytedance.sdk.component.gm.pcc.pcc pccVar2 = tmgVar.sf;
            if (pccVar2 != null) {
                pccVar2.gm();
            }
            responseCode = httpURLConnection.getResponseCode();
            com.bytedance.sdk.component.gm.pcc.pcc pccVar3 = tmgVar.sf;
            if (pccVar3 != null) {
                pccVar3.vj();
            }
        } catch (IOException e4) {
            httpURLConnection = null;
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
        if (!this.oo.get()) {
            return new kj(httpURLConnection, tmgVar, responseCode);
        }
        i = kj.sf;
        pcc(httpURLConnection);
        pcc = "internal error";
        return new kj(i, pcc, tmgVar);
    }

    private boolean vj() {
        if (this.pcc.wh() == null) {
            return false;
        }
        return this.pcc.wh().containsKey("Content-Type");
    }

    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.sf.pcc.sf clone() {
        return new sf(this.pcc, this.sf);
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public void gm() {
        this.oo.set(true);
    }

    private boolean pcc(hc hcVar) {
        tmg tmgVar;
        byte[] bArr;
        return hcVar != null && (tmgVar = this.pcc) != null && C4094gc.b.equalsIgnoreCase(tmgVar.vj()) && hcVar.wh == hc.pcc.BYTE_ARRAY_TYPE && (bArr = hcVar.vj) != null && bArr.length > 0;
    }

    public gbb pcc(tmg tmgVar) throws IOException {
        return pcc(tmgVar, com.bytedance.sdk.component.qf.pcc.vj());
    }

    public gbb pcc(tmg tmgVar, boolean z) throws IOException {
        boolean wh = com.bytedance.sdk.component.qf.pcc.wh();
        List<String> pcc = tmgVar != null ? tmgVar.pcc() : null;
        boolean z2 = (pcc == null || pcc.isEmpty()) ? false : true;
        if (wh && z2) {
            return pcc(tmgVar, pcc);
        }
        return sf(tmgVar, z);
    }

    private tmg pcc(tmg tmgVar, String str) {
        return tmgVar.vh().sf(str).sf();
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public tmg pcc() {
        return this.pcc;
    }

    private void pcc(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    private static String pcc(HttpURLConnection httpURLConnection, Exception exc) {
        try {
            return httpURLConnection.getErrorStream().toString();
        } catch (Throwable unused) {
            return exc.getMessage();
        }
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public void pcc(final com.bytedance.sdk.component.sf.pcc.gm gmVar) {
        com.bytedance.sdk.component.gm.pcc.pcc pccVar;
        tmg tmgVar = this.pcc;
        if (tmgVar != null && (pccVar = tmgVar.sf) != null) {
            pccVar.jr();
        }
        this.sf.sf().submit(new com.bytedance.sdk.component.kj.sf.gm(this.pcc.kj(), this.pcc.vy()) { // from class: com.bytedance.sdk.component.sf.pcc.pcc.pcc.sf.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    gbb sf = sf.this.sf();
                    com.bytedance.sdk.component.sf.pcc.gm gmVar2 = gmVar;
                    if (sf == null) {
                        gmVar2.pcc(sf.this, new IOException("response is null"));
                    } else {
                        gmVar2.pcc(sf.this, sf);
                    }
                } catch (IOException e) {
                    gmVar.pcc(sf.this, e);
                }
            }
        });
    }

    private boolean sf(hc hcVar) {
        tmg tmgVar;
        return (hcVar == null || (tmgVar = this.pcc) == null || !C4094gc.b.equalsIgnoreCase(tmgVar.vj()) || hcVar.wh != hc.pcc.STRING_TYPE || TextUtils.isEmpty(hcVar.oo)) ? false : true;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.sf
    public gbb sf() throws IOException {
        List<com.bytedance.sdk.component.sf.pcc.kj> list;
        com.bytedance.sdk.component.gm.pcc.pcc pccVar;
        tmg tmgVar = this.pcc;
        if (tmgVar != null && (pccVar = tmgVar.sf) != null) {
            if (pccVar.gbb() == 0) {
                this.pcc.sf.jr();
            }
            this.pcc.sf.pcc();
        }
        this.sf.gm().remove(this);
        this.sf.oo().add(this);
        com.bytedance.sdk.component.sf.pcc.oo ooVar = this.sf;
        if (ooVar instanceof wh) {
            if (this.sf.oo().size() + ooVar.gm().size() > this.sf.pcc() || this.oo.get()) {
                this.sf.oo().remove(this);
                return new kj(kj.pcc, "Maximum number of requests exceeded", this.pcc);
            }
        }
        try {
            vh vhVar = this.pcc.pcc;
            if (vhVar != null && (list = vhVar.pcc) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.pcc.pcc.pcc);
                arrayList.add(new com.bytedance.sdk.component.sf.pcc.kj() { // from class: com.bytedance.sdk.component.sf.pcc.pcc.pcc.sf.1
                    @Override // com.bytedance.sdk.component.sf.pcc.kj
                    public gbb pcc(kj.pcc pccVar2) throws IOException {
                        return sf.this.pcc(pccVar2.pcc());
                    }
                });
                return ((com.bytedance.sdk.component.sf.pcc.kj) arrayList.get(0)).pcc(new gm(arrayList, this.pcc));
            }
            return pcc(this.pcc);
        } finally {
        }
    }

    private static void sf(HttpURLConnection httpURLConnection) {
        try {
            Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(httpURLConnection);
            Field declaredField2 = obj.getClass().getDeclaredField("client");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (vj.size() == 2) {
                obj2.getClass().getDeclaredMethod("setProtocols", List.class).invoke(obj2, vj);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
