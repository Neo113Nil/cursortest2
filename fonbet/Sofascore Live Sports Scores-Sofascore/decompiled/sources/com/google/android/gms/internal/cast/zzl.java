package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzl implements SessionManagerListener {
    public final /* synthetic */ zzn a;

    public zzl(zzn zznVar) {
        this.a = zznVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void a(Session session, int i) {
        Logger logger = zzn.j;
        zzn.j.a("onSessionSuspended with reason = %d", Integer.valueOf(i));
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.e();
        Preconditions.i(zznVar.g);
        zznVar.a.a(zznVar.c.a(zznVar.g, i), Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        zznVar.a();
        zznVar.e.removeCallbacks(zznVar.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00f0  */
    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Session session, String str) {
        zzo zzoVar;
        Logger logger = zzn.j;
        logger.a("onSessionResuming with sessionId = %s", str);
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        SharedPreferences sharedPreferences = zznVar.f;
        boolean z = false;
        if (zznVar.h(str)) {
            logger.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            Preconditions.i(zznVar.g);
        } else {
            zzax zzaxVar = zznVar.b;
            if (sharedPreferences == null) {
                Logger logger2 = zzo.q;
            } else {
                zzoVar = new zzo(zzaxVar);
                zzoVar.o = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    zzoVar.b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        zzoVar.c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            zzoVar.d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                zzoVar.e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    zzoVar.f = sharedPreferences.getString("receiver_session_id", "");
                                    zzoVar.g = sharedPreferences.getInt("device_capabilities", 0);
                                    zzoVar.h = sharedPreferences.getString("device_model_name", "");
                                    zzoVar.i = sharedPreferences.getString("manufacturer", "");
                                    zzoVar.j = sharedPreferences.getString("product_name", "");
                                    zzoVar.k = sharedPreferences.getString("build_type", "");
                                    zzoVar.l = sharedPreferences.getString("cast_build_version", "");
                                    zzoVar.m = sharedPreferences.getString("system_build_number", "");
                                    zzoVar.n = sharedPreferences.getInt("device_category", 0);
                                    zzoVar.p = sharedPreferences.getInt("analytics_session_start_type", 0);
                                    zznVar.g = zzoVar;
                                    if (zznVar.h(str)) {
                                        logger.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                                        zzo zzoVar2 = new zzo(zzaxVar);
                                        zzo.r++;
                                        zznVar.g = zzoVar2;
                                        CastSession castSession = zznVar.h;
                                        if (castSession != null && castSession.g.zzo()) {
                                            z = true;
                                        }
                                        zzoVar2.o = z;
                                        zzo zzoVar3 = zznVar.g;
                                        Preconditions.i(zzoVar3);
                                        Logger logger3 = CastContext.l;
                                        Preconditions.e("Must be called from the main thread.");
                                        CastContext castContext = CastContext.n;
                                        Preconditions.i(castContext);
                                        Preconditions.e("Must be called from the main thread.");
                                        zzoVar3.b = castContext.e.a;
                                        zzo zzoVar4 = zznVar.g;
                                        Preconditions.i(zzoVar4);
                                        zzoVar4.f = str;
                                    } else {
                                        logger.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                                        Preconditions.i(zznVar.g);
                                        zzo.r = zznVar.g.d + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            zzoVar = null;
            zznVar.g = zzoVar;
            if (zznVar.h(str)) {
            }
        }
        Preconditions.i(zznVar.g);
        zzp zzpVar = zznVar.c;
        zzo zzoVar5 = zznVar.g;
        zzj zzjVar = zznVar.a;
        zzqq b = zzpVar.b(zzoVar5);
        zzqf o = zzqg.o(b.e());
        o.b();
        ((zzqg) o.b).v(10);
        b.f((zzqg) o.c());
        zzqf o2 = zzqg.o(b.e());
        o2.b();
        ((zzqg) o2.b).r(true);
        b.b();
        ((zzqr) b.b).z((zzqg) o2.c());
        zzjVar.a((zzqr) b.c(), Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void d(Session session, int i) {
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.b(i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void e(Session session, int i) {
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.b(i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void f(Session session) {
        Logger logger = zzn.j;
        logger.a("onSessionStarting", new Object[0]);
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        if (zznVar.g != null) {
            logger.c("Start a session while there's already an active session. Create a new one.", new Object[0]);
        }
        zznVar.d();
        zzo zzoVar = zznVar.g;
        zzp zzpVar = zznVar.c;
        zzj zzjVar = zznVar.a;
        zzqq b = zzpVar.b(zzoVar);
        if (zzoVar.p == 1) {
            zzqf o = zzqg.o(b.e());
            o.b();
            ((zzqg) o.b).v(17);
            b.f((zzqg) o.c());
        }
        zzjVar.a((zzqr) b.c(), Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        zzn.j.a("onSessionStarted with sessionId = %s", str);
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.e();
        zzo zzoVar = zznVar.g;
        zzoVar.f = str;
        zznVar.a.a((zzqr) zznVar.c.b(zzoVar).c(), Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
        zznVar.a();
        zznVar.c();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void m(Session session, boolean z) {
        Logger logger = zzn.j;
        zzn.j.a("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.e();
        Preconditions.i(zznVar.g);
        zzp zzpVar = zznVar.c;
        zzo zzoVar = zznVar.g;
        zzj zzjVar = zznVar.a;
        zzqq b = zzpVar.b(zzoVar);
        zzqf o = zzqg.o(b.e());
        o.b();
        ((zzqg) o.b).r(z);
        b.b();
        ((zzqr) b.b).z((zzqg) o.c());
        zzjVar.a((zzqr) b.c(), Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
        zznVar.a();
        zznVar.c();
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void n(Session session, int i) {
        zzn zznVar = this.a;
        zznVar.h = (CastSession) session;
        zznVar.b(i);
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void o(Session session) {
        this.a.h = (CastSession) session;
    }
}
