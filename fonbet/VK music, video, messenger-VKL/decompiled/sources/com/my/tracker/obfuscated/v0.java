package com.my.tracker.obfuscated;

import android.content.Context;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener;
import com.huawei.hms.ads.installreferrer.api.ReferrerDetails;
import xsna.i3w;

/* loaded from: classes.dex */
public final class v0 {
    static int f = 3;
    static volatile v0 g;
    final e0 a;
    final n b;
    final Context c;
    InstallReferrerClient d;
    int e;

    /* loaded from: classes14.dex */
    public final class a implements InstallReferrerStateListener {
        public a() {
        }

        public void onInstallReferrerServiceDisconnected() {
            x2.a("HuaweiReferrerHandler: install referrer service is disconnected. Connection attempts: " + v0.this.e);
            v0.this.a(this);
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == -1) {
                v0.this.a(this);
            } else {
                x2.a("HuaweiReferrerHandler: install referrer setup is finished");
                v0.this.a(i);
            }
        }
    }

    public v0(e0 e0Var, n nVar, Context context) {
        this.a = e0Var;
        this.b = nVar;
        this.c = context.getApplicationContext();
    }

    public static void a(e0 e0Var, n nVar, Context context) {
        if (g != null) {
            return;
        }
        synchronized (v0.class) {
            try {
                if (g != null) {
                    return;
                }
                v0 v0Var = new v0(e0Var, nVar, context);
                m.a(new i3w(v0Var, 1));
                g = v0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x002f -> B:9:0x0034). Please report as a decompilation issue!!! */
    public void a(int i) {
        if (this.d == null) {
            x2.b("HuaweiReferrerHandler: install referrer client is null");
            return;
        }
        try {
            if (i == 0) {
                x2.a("HuaweiReferrerHandler: retrieving install referrer");
                a(this.d.getInstallReferrer());
            } else {
                x2.a("HuaweiReferrerHandler: InstallReferrerResponse code: " + i);
            }
        } catch (Throwable th) {
            x2.b("HuaweiReferrerHandler: error occurred while retrieving install referrer", th);
        }
        try {
            this.d.endConnection();
        } catch (Throwable unused) {
        }
        this.d = null;
    }

    public void a() {
        if (p1.a(this.c).p()) {
            return;
        }
        try {
            x2.a("HuaweiReferrerHandler: initialize InstallReferrerClient");
            this.d = InstallReferrerClient.newBuilder(this.c).build();
            a(new a());
        } catch (Throwable th) {
            x2.b("HuaweiReferrerHandler: error occurred while initialization InstallReferrerClient", th);
        }
    }

    public void a(InstallReferrerStateListener installReferrerStateListener) {
        if (this.d == null) {
            x2.a("HuaweiReferrerHandler: InstallReferrerClient is null");
            return;
        }
        int i = this.e;
        if (i >= f) {
            x2.a("HuaweiReferrerHandler: max count of reconnection attempts is reached");
            try {
                this.d.endConnection();
            } catch (Throwable unused) {
            }
            this.d = null;
            return;
        }
        this.e = i + 1;
        try {
            x2.a("HuaweiReferrerHandler: connect to referrer client");
            this.d.startConnection(installReferrerStateListener);
        } catch (Throwable th) {
            x2.b("HuaweiReferrerHandler: error occurred while connection InstallReferrerClient", th);
            a(installReferrerStateListener);
        }
    }

    public void a(ReferrerDetails referrerDetails) {
        p1 a2 = p1.a(this.c);
        if (a2.p()) {
            x2.a("HuaweiReferrerHandler: api referrer has been tracked");
            return;
        }
        String installReferrer = referrerDetails.getInstallReferrer();
        x2.a("HuaweiReferrerHandler: retrieving install referrer is completed. Referrer: " + installReferrer);
        this.a.b(installReferrer, t.b(this.c), referrerDetails.getInstallBeginTimestampSeconds(), referrerDetails.getReferrerClickTimestampSeconds());
        this.b.a(installReferrer);
        a2.t();
    }
}
