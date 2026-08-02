package com.moloco.sdk.internal.ilrd;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import defpackage.a74;
import defpackage.ad2;
import defpackage.g9i;
import defpackage.mqi;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.ypa;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public n(int i) {
        switch (i) {
            case 3:
                this.a = ypa.b(new com.appsflyer.c(25));
                this.c = ypa.b(new com.appsflyer.c(26));
                mqi b = ypa.b(new com.appsflyer.c(27));
                this.d = ypa.b(new com.appsflyer.c(28));
                KeyGenerator keyGenerator = KeyGenerator.getInstance((String) b.getValue());
                keyGenerator.init(NotificationCompat.FLAG_LOCAL_ONLY);
                this.b = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), (String) b.getValue());
                this.e = ypa.b(new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i(1));
                break;
            default:
                this.a = null;
                this.c = null;
                this.d = null;
                this.b = null;
                this.e = null;
                break;
        }
    }

    public synchronized void a(long j, Function1 function1) {
        n nVar;
        Throwable th;
        try {
            try {
                g9i g9iVar = (g9i) this.b;
                if (g9iVar != null) {
                    try {
                        if (g9iVar.isActive()) {
                            g9iVar.e(null);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", "Task " + ((String) this.d) + " cancelled", null, false, 12, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        nVar = this;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.b = xw3.L((ad2) this.a, null, null, new a74(this, j, function1, (rq3) null, 8), 3);
            } catch (Throwable th4) {
                th = th4;
                nVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th5) {
            nVar = this;
            th = th5;
        }
    }

    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        gVar.getClass();
        List list = (List) this.c;
        if (list != null) {
            x.k((f1) this.e, list, ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n) this.b).b(), (com.moloco.sdk.internal.services.events.c) this.a, gVar);
            this.c = null;
        }
    }

    public byte[] c(String str) {
        str.getClass();
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.b;
        secretKeySpec.getEncoded().getClass();
        Cipher cipher = Cipher.getInstance((String) ((mqi) this.c).getValue());
        PublicKey generatePublic = KeyFactory.getInstance((String) ((mqi) this.a).getValue()).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        generatePublic.getClass();
        cipher.init(1, generatePublic);
        byte[] doFinal = cipher.doFinal(secretKeySpec.getEncoded());
        doFinal.getClass();
        return doFinal;
    }

    public com.moloco.sdk.internal.services.bidtoken.providers.o d() {
        e eVar = (e) this.c;
        synchronized (eVar) {
            eVar.c();
            eVar.m.a(eVar.d, new b(eVar, null, 0));
        }
        j jVar = eVar.q;
        if (jVar != null) {
            g b = jVar.b();
            return new com.moloco.sdk.internal.services.bidtoken.providers.o(jVar.c(), jVar.d, b.a, b.b, b.c, b.d, b.e, b.f);
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdService", "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public n(ad2 ad2Var, com.moloco.sdk.internal.services.i iVar, String str) {
        iVar.getClass();
        this.a = ad2Var;
        this.c = iVar;
        this.d = str;
        this.e = new SimpleDateFormat("HH:mm:ss");
    }
}
