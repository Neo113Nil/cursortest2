package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import defpackage.fc6;
import defpackage.ng2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbx extends WebView {
    public static final /* synthetic */ int d = 0;
    public final Handler a;
    public final ng2 b;
    public boolean c;

    public zzbx(zzbz zzbzVar, Handler handler, ng2 ng2Var) {
        super(zzbzVar);
        this.c = false;
        this.a = handler;
        this.b = ng2Var;
    }

    public final void a(String str, String str2) {
        final String n = fc6.n(str, "(", str2, ");");
        this.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                boolean booleanValue;
                zzbx zzbxVar = zzbx.this;
                String str3 = n;
                synchronized (zzda.class) {
                    Boolean bool = zzda.a;
                    if (bool == null) {
                        try {
                            zzbxVar.evaluateJavascript("(function(){})()", null);
                            bool = Boolean.TRUE;
                            zzda.a = bool;
                        } catch (IllegalStateException unused) {
                            bool = Boolean.FALSE;
                            zzda.a = bool;
                        }
                    }
                    booleanValue = bool.booleanValue();
                }
                if (booleanValue) {
                    zzbxVar.evaluateJavascript(str3, null);
                } else {
                    zzbxVar.loadUrl("javascript:".concat(str3));
                }
            }
        });
    }
}
