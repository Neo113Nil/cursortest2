package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fo4 implements qe4 {
    public final Context a;
    public final ArrayList b;
    public final qe4 c;
    public p08 d;
    public pi0 e;
    public po3 f;
    public qe4 g;
    public y8k h;
    public ke4 i;
    public onf j;
    public qe4 k;

    public fo4(Context context, qe4 qe4Var) {
        this.a = context.getApplicationContext();
        qe4Var.getClass();
        this.c = qe4Var;
        this.b = new ArrayList();
    }

    public static void d(qe4 qe4Var, sn4 sn4Var) {
        if (qe4Var != null) {
            qe4Var.c(sn4Var);
        }
    }

    public final void b(qe4 qe4Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            qe4Var.c((sn4) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.qe4
    public final void c(sn4 sn4Var) {
        sn4Var.getClass();
        this.c.c(sn4Var);
        this.b.add(sn4Var);
        d(this.d, sn4Var);
        d(this.e, sn4Var);
        d(this.f, sn4Var);
        d(this.g, sn4Var);
        d(this.h, sn4Var);
        d(this.i, sn4Var);
        d(this.j, sn4Var);
    }

    @Override // defpackage.qe4
    public final void close() {
        qe4 qe4Var = this.k;
        if (qe4Var != null) {
            try {
                qe4Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.qe4
    public final Map getResponseHeaders() {
        qe4 qe4Var = this.k;
        return qe4Var == null ? Collections.EMPTY_MAP : qe4Var.getResponseHeaders();
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        qe4 qe4Var = this.k;
        if (qe4Var == null) {
            return null;
        }
        return qe4Var.getUri();
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        qe4 qe4Var;
        qx9.t(this.k == null);
        Uri uri = we4Var.a;
        String scheme = uri.getScheme();
        int i = lik.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || U3.i.b.equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    p08 p08Var = new p08(false);
                    this.d = p08Var;
                    b(p08Var);
                }
                qe4Var = this.d;
                this.k = qe4Var;
            } else {
                if (this.e == null) {
                    pi0 pi0Var = new pi0(context);
                    this.e = pi0Var;
                    b(pi0Var);
                }
                qe4Var = this.e;
                this.k = qe4Var;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                pi0 pi0Var2 = new pi0(context);
                this.e = pi0Var2;
                b(pi0Var2);
            }
            qe4Var = this.e;
            this.k = qe4Var;
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            if (this.f == null) {
                po3 po3Var = new po3(context);
                this.f = po3Var;
                b(po3Var);
            }
            qe4Var = this.f;
            this.k = qe4Var;
        } else {
            boolean equals = "rtmp".equals(scheme);
            qe4 qe4Var2 = this.c;
            if (equals) {
                qe4Var = this.g;
                if (qe4Var == null) {
                    try {
                        qe4 qe4Var3 = (qe4) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = qe4Var3;
                        b(qe4Var3);
                    } catch (ClassNotFoundException unused) {
                        m6k.f0();
                    } catch (Exception e) {
                        vp2.e("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    qe4 qe4Var4 = this.g;
                    if (qe4Var4 == null) {
                        this.g = qe4Var2;
                    } else {
                        qe4Var2 = qe4Var4;
                    }
                    qe4Var = qe4Var2;
                }
                this.k = qe4Var;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    y8k y8kVar = new y8k();
                    this.h = y8kVar;
                    b(y8kVar);
                }
                qe4Var = this.h;
                this.k = qe4Var;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    ke4 ke4Var = new ke4(false);
                    this.i = ke4Var;
                    b(ke4Var);
                }
                qe4Var = this.i;
                this.k = qe4Var;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    onf onfVar = new onf(context);
                    this.j = onfVar;
                    b(onfVar);
                }
                qe4Var = this.j;
                this.k = qe4Var;
            } else {
                this.k = qe4Var2;
                qe4Var = qe4Var2;
            }
        }
        return qe4Var.k(we4Var);
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        qe4 qe4Var = this.k;
        qe4Var.getClass();
        return qe4Var.read(bArr, i, i2);
    }
}
