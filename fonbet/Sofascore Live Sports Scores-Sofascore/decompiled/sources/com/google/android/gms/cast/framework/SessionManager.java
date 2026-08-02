package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class SessionManager {
    public static final Logger c = new Logger("SessionManager", null);
    public final zzaw a;
    public final Context b;

    public SessionManager(zzaw zzawVar, Context context) {
        this.a = zzawVar;
        this.b = context;
    }

    public final void a(SessionManagerListener sessionManagerListener) {
        if (sessionManagerListener == null) {
            yhk.s("SessionManagerListener can't be null");
            return;
        }
        Preconditions.e("Must be called from the main thread.");
        try {
            this.a.U3(new zzbg(sessionManagerListener));
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "addSessionManagerListener", "zzaw");
        }
    }

    public final void b(boolean z) {
        Logger logger = c;
        Preconditions.e("Must be called from the main thread.");
        try {
            logger.c("End session for %s", this.b.getPackageName());
            this.a.g4(z);
        } catch (RemoteException unused) {
            logger.b("Unable to call %s on %s.", "endCurrentSession", "zzaw");
        }
    }

    public final CastSession c() {
        Preconditions.e("Must be called from the main thread.");
        Session d = d();
        if (d == null || !(d instanceof CastSession)) {
            return null;
        }
        return (CastSession) d;
    }

    public final Session d() {
        Preconditions.e("Must be called from the main thread.");
        try {
            return (Session) ObjectWrapper.Z1(this.a.zze());
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "getWrappedCurrentSession", "zzaw");
            return null;
        }
    }

    public final void e(SessionManagerListener sessionManagerListener) {
        Preconditions.e("Must be called from the main thread.");
        if (sessionManagerListener == null) {
            return;
        }
        try {
            this.a.B4(new zzbg(sessionManagerListener));
        } catch (RemoteException unused) {
            c.b("Unable to call %s on %s.", "removeSessionManagerListener", "zzaw");
        }
    }
}
