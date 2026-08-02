package com.moloco.sdk.internal.services.init;

import android.net.Uri;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.a3;
import com.moloco.sdk.b3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.r2;
import com.moloco.sdk.s2;
import com.moloco.sdk.t2;
import com.moloco.sdk.u2;
import com.moloco.sdk.v2;
import com.moloco.sdk.w2;
import com.moloco.sdk.x2;
import defpackage.ndd;
import defpackage.qp3;
import defpackage.zzl;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e a;

    public p(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    public static byte[] b(j jVar, long j) {
        t2 t2Var;
        a3 h = b3.h();
        r2 h2 = x2.h();
        if (jVar instanceof h) {
            s2 h3 = u2.h();
            switch (o.a[((h) jVar).a.ordinal()]) {
                case 1:
                    t2Var = t2.UNKNOWN;
                    break;
                case 2:
                    t2Var = t2.HTTP_REQUEST_TIMEOUT;
                    break;
                case 3:
                    t2Var = t2.HTTP_UKNOWN_HOST;
                    break;
                case 4:
                    t2Var = t2.HTTP_SOCKET;
                    break;
                case 5:
                    t2Var = t2.HTTP_SSL_ERROR;
                    break;
                case 6:
                    t2Var = t2.ANDROID_WORK_MANAGER_ISSUE;
                    break;
                default:
                    zzl.b();
                    return null;
            }
            h3.d(t2Var);
            h2.d((u2) h3.build());
        } else {
            if (!(jVar instanceof i)) {
                zzl.b();
                return null;
            }
            v2 h4 = w2.h();
            h4.d(((i) jVar).a);
            h2.h((w2) h4.build());
        }
        h.d((x2) h2.build());
        h.h(j);
        byte[] byteArray = ((b3) h.build()).toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public final Unit a(j jVar, long j) {
        try {
            if (jVar instanceof h) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking client failure: " + ((h) jVar).a, false, 4, null);
            } else {
                if (!(jVar instanceof i)) {
                    throw new ndd();
                }
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Reporting InitTracking server failure: " + ((i) jVar).a, false, 4, null);
            }
            Uri build = Uri.parse(BuildConfig.MOLOCO_ENDPOINT_INIT_TRACKING).buildUpon().build();
            byte[] b = b(jVar, j);
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar = this.a;
            String uri = build.toString();
            uri.getClass();
            eVar.a(uri, b, qp3.b, null);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "InitTrackingApi", "Failed to send notifyFailure post request", e, false, 8, null);
        }
        return Unit.a;
    }
}
