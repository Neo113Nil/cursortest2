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
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class go4 implements re4 {
    public final Context a;
    public final ArrayList b;
    public final re4 c;
    public q08 d;
    public qi0 e;
    public qo3 f;
    public re4 g;
    public z8k h;
    public le4 i;
    public pnf j;
    public re4 k;

    public go4(Context context, re4 re4Var) {
        this.a = context.getApplicationContext();
        re4Var.getClass();
        this.c = re4Var;
        this.b = new ArrayList();
    }

    public static void d(re4 re4Var, tn4 tn4Var) {
        if (re4Var != null) {
            re4Var.f(tn4Var);
        }
    }

    @Override // defpackage.re4
    public final long b(xe4 xe4Var) {
        re4 re4Var;
        z1a.E(this.k == null);
        Uri uri = xe4Var.a;
        String scheme = uri.getScheme();
        String str = nik.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (isEmpty || Objects.equals(scheme2, U3.i.b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    q08 q08Var = new q08(false);
                    this.d = q08Var;
                    c(q08Var);
                }
                re4Var = this.d;
                this.k = re4Var;
            } else {
                if (this.e == null) {
                    qi0 qi0Var = new qi0(context);
                    this.e = qi0Var;
                    c(qi0Var);
                }
                re4Var = this.e;
                this.k = re4Var;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                qi0 qi0Var2 = new qi0(context);
                this.e = qi0Var2;
                c(qi0Var2);
            }
            re4Var = this.e;
            this.k = re4Var;
        } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
            if (this.f == null) {
                qo3 qo3Var = new qo3(context);
                this.f = qo3Var;
                c(qo3Var);
            }
            re4Var = this.f;
            this.k = re4Var;
        } else {
            boolean equals = "rtmp".equals(scheme);
            re4 re4Var2 = this.c;
            if (equals) {
                re4Var = this.g;
                if (re4Var == null) {
                    try {
                        re4 re4Var3 = (re4) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = re4Var3;
                        c(re4Var3);
                    } catch (ClassNotFoundException unused) {
                        tgj.d0("Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        vp2.e("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    re4 re4Var4 = this.g;
                    if (re4Var4 == null) {
                        this.g = re4Var2;
                    } else {
                        re4Var2 = re4Var4;
                    }
                    re4Var = re4Var2;
                }
                this.k = re4Var;
            } else if ("udp".equals(scheme)) {
                if (this.h == null) {
                    z8k z8kVar = new z8k();
                    this.h = z8kVar;
                    c(z8kVar);
                }
                re4Var = this.h;
                this.k = re4Var;
            } else if ("data".equals(scheme)) {
                if (this.i == null) {
                    le4 le4Var = new le4(false);
                    this.i = le4Var;
                    c(le4Var);
                }
                re4Var = this.i;
                this.k = re4Var;
            } else if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    pnf pnfVar = new pnf(context);
                    this.j = pnfVar;
                    c(pnfVar);
                }
                re4Var = this.j;
                this.k = re4Var;
            } else {
                this.k = re4Var2;
                re4Var = re4Var2;
            }
        }
        return re4Var.b(xe4Var);
    }

    public final void c(re4 re4Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            re4Var.f((tn4) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.re4
    public final void close() {
        re4 re4Var = this.k;
        if (re4Var != null) {
            try {
                re4Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        this.c.f(tn4Var);
        this.b.add(tn4Var);
        d(this.d, tn4Var);
        d(this.e, tn4Var);
        d(this.f, tn4Var);
        d(this.g, tn4Var);
        d(this.h, tn4Var);
        d(this.i, tn4Var);
        d(this.j, tn4Var);
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        re4 re4Var = this.k;
        return re4Var == null ? Collections.EMPTY_MAP : re4Var.getResponseHeaders();
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        re4 re4Var = this.k;
        if (re4Var == null) {
            return null;
        }
        return re4Var.getUri();
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        re4 re4Var = this.k;
        re4Var.getClass();
        return re4Var.read(bArr, i, i2);
    }
}
