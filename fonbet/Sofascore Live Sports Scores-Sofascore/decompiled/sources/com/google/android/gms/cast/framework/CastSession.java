package com.google.android.gms.cast.framework;

import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.internal.zzb;
import com.google.android.gms.cast.framework.media.internal.zzs;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzy;
import com.google.android.gms.tasks.Task;
import defpackage.adp;
import defpackage.dcc;
import defpackage.fjn;
import defpackage.gl5;
import defpackage.hcc;
import defpackage.lnb;
import defpackage.m2p;
import defpackage.n1p;
import defpackage.r3p;
import defpackage.t8p;
import defpackage.w9f;
import defpackage.x7p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CastSession extends Session {
    public static final Logger n = new Logger("CastSession", null);
    public final Context c;
    public final HashSet d;
    public final zzak e;
    public final CastOptions f;
    public final zzbx g;
    public final zzs h;
    public zzbm i;
    public RemoteMediaClient j;
    public CastDevice k;
    public Cast.ApplicationConnectionResult l;
    public n1p m;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CastSession(Context context, String str, String str2, CastOptions castOptions, zzbx zzbxVar, zzs zzsVar) {
        super(context, str, str2);
        IObjectWrapper zzf;
        this.d = new HashSet();
        this.c = context.getApplicationContext();
        this.f = castOptions;
        this.g = zzbxVar;
        this.h = zzsVar;
        zzau zzauVar = this.a;
        zzak zzakVar = null;
        if (zzauVar != null) {
            try {
                zzf = zzauVar.zzf();
            } catch (RemoteException unused) {
                Session.b.b("Unable to call %s on %s.", "getWrappedObject", "zzau");
            }
            x7p x7pVar = new x7p(this);
            Logger logger = com.google.android.gms.internal.cast.zzay.a;
            if (zzf != null) {
                try {
                    zzakVar = com.google.android.gms.internal.cast.zzay.a(context).V1(castOptions, zzf, x7pVar);
                } catch (RemoteException | ModuleUnavailableException unused2) {
                    com.google.android.gms.internal.cast.zzay.a.b("Unable to call %s on %s.", "newCastSessionImpl", "zzbc");
                }
            }
            this.e = zzakVar;
        }
        zzf = null;
        x7p x7pVar2 = new x7p(this);
        Logger logger2 = com.google.android.gms.internal.cast.zzay.a;
        if (zzf != null) {
        }
        this.e = zzakVar;
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void a(boolean z) {
        zzak zzakVar = this.e;
        if (zzakVar != null) {
            try {
                zzakVar.G2(z);
            } catch (RemoteException unused) {
                n.b("Unable to call %s on %s.", "disconnectFromDevice", "zzak");
            }
            zzau zzauVar = this.a;
            if (zzauVar == null) {
                return;
            }
            try {
                zzauVar.E(0);
            } catch (RemoteException unused2) {
                Session.b.b("Unable to call %s on %s.", "notifySessionEnded", "zzau");
            }
        }
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final long b() {
        Preconditions.e("Must be called from the main thread.");
        RemoteMediaClient remoteMediaClient = this.j;
        if (remoteMediaClient == null) {
            return 0L;
        }
        return remoteMediaClient.j() - this.j.d();
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void d(Bundle bundle) {
        this.k = CastDevice.Y0(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void e(Bundle bundle) {
        this.k = CastDevice.Y0(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void f(Bundle bundle) {
        o(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void g(Bundle bundle) {
        o(bundle);
    }

    @Override // com.google.android.gms.cast.framework.Session
    public final void h(Bundle bundle) {
        CastDevice castDevice;
        CastDevice castDevice2;
        CastDevice Y0 = CastDevice.Y0(bundle);
        if (Y0 != null) {
            String str = Y0.d;
            if (Y0.equals(this.k)) {
                return;
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str) && ((castDevice2 = this.k) == null || !TextUtils.equals(castDevice2.d, str))) {
                z = true;
            }
            this.k = Y0;
            n.a("update to device (%s) with name %s", Y0, true != z ? "unchanged" : "changed");
            if (!z || (castDevice = this.k) == null) {
                return;
            }
            zzs zzsVar = this.h;
            if (zzsVar != null) {
                zzs.v.c("update Cast device to %s", castDevice);
                zzsVar.o = castDevice;
                zzsVar.b();
            }
            Iterator it = new HashSet(this.d).iterator();
            while (it.hasNext()) {
                ((Cast.Listener) it.next()).e();
            }
            n1p n1pVar = this.m;
            if (n1pVar != null) {
                ((zzy) n1pVar.b).b().u++;
            }
        }
    }

    public final CastDevice j() {
        Preconditions.e("Must be called from the main thread.");
        return this.k;
    }

    public final RemoteMediaClient k() {
        Preconditions.e("Must be called from the main thread.");
        return this.j;
    }

    public final boolean l() {
        Preconditions.e("Must be called from the main thread.");
        zzbm zzbmVar = this.i;
        if (zzbmVar == null || !zzbmVar.n()) {
            return false;
        }
        zzbmVar.m();
        return zzbmVar.x;
    }

    public final void m(String str, Task task) {
        Logger logger = n;
        zzak zzakVar = this.e;
        if (zzakVar == null) {
            return;
        }
        try {
            if (task.isSuccessful()) {
                Cast.ApplicationConnectionResult applicationConnectionResult = (Cast.ApplicationConnectionResult) task.getResult();
                this.l = applicationConnectionResult;
                if (applicationConnectionResult.getStatus() != null && applicationConnectionResult.getStatus().Y0()) {
                    logger.a("%s() -> success result", str);
                    RemoteMediaClient remoteMediaClient = new RemoteMediaClient(new com.google.android.gms.cast.internal.zzar());
                    this.j = remoteMediaClient;
                    remoteMediaClient.y(this.i);
                    this.j.t(new m2p(this));
                    this.j.z();
                    this.h.a(this.j, j());
                    ApplicationMetadata E0 = applicationConnectionResult.E0();
                    Preconditions.i(E0);
                    String n0 = applicationConnectionResult.n0();
                    String sessionId = applicationConnectionResult.getSessionId();
                    Preconditions.i(sessionId);
                    zzakVar.e0(E0, n0, sessionId, applicationConnectionResult.j0());
                    return;
                }
                if (applicationConnectionResult.getStatus() != null) {
                    logger.a("%s() -> failure result", str);
                    zzakVar.h(applicationConnectionResult.getStatus().a);
                    return;
                }
            } else {
                Exception exception = task.getException();
                if (exception instanceof ApiException) {
                    zzakVar.h(((ApiException) exception).a.a);
                    return;
                }
            }
            zzakVar.h(2476);
        } catch (RemoteException unused) {
            logger.b("Unable to call %s on %s.", "methods", "zzak");
        }
    }

    public final void n(int i) {
        zzs zzsVar = this.h;
        if (zzsVar.q) {
            zzsVar.q = false;
            RemoteMediaClient remoteMediaClient = zzsVar.n;
            if (remoteMediaClient != null) {
                r3p r3pVar = zzsVar.m;
                Preconditions.e("Must be called from the main thread.");
                if (r3pVar != null) {
                    remoteMediaClient.h.remove(r3pVar);
                }
            }
            AudioManager audioManager = (AudioManager) zzsVar.a.getSystemService("audio");
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
            zzsVar.c.S1(null);
            zzb zzbVar = zzsVar.h;
            if (zzbVar != null) {
                zzbVar.b();
                zzbVar.e = null;
            }
            zzb zzbVar2 = zzsVar.i;
            if (zzbVar2 != null) {
                zzbVar2.b();
                zzbVar2.e = null;
            }
            hcc hccVar = zzsVar.p;
            if (hccVar != null) {
                hccVar.Z(null, null);
                zzsVar.p.a0(new MediaMetadataCompat(new Bundle()));
                zzsVar.d(0, null);
            }
            hcc hccVar2 = zzsVar.p;
            if (hccVar2 != null) {
                ((dcc) hccVar2.b).a.setActive(false);
                Iterator it = ((ArrayList) hccVar2.d).iterator();
                if (it.hasNext()) {
                    throw lnb.i(it);
                }
                dcc dccVar = (dcc) zzsVar.p.b;
                MediaSession mediaSession = dccVar.a;
                dccVar.d = true;
                dccVar.e.kill();
                if (Build.VERSION.SDK_INT == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } catch (Exception unused) {
                    }
                }
                mediaSession.setCallback(null);
                mediaSession.release();
                zzsVar.p = null;
            }
            zzsVar.n = null;
            zzsVar.o = null;
            zzsVar.h();
            if (i == 0) {
                zzsVar.j();
            }
        }
        zzbm zzbmVar = this.i;
        if (zzbmVar != null) {
            zzbmVar.p();
            this.i = null;
        }
        this.k = null;
        RemoteMediaClient remoteMediaClient2 = this.j;
        if (remoteMediaClient2 != null) {
            remoteMediaClient2.y(null);
            this.j = null;
        }
    }

    public final void o(Bundle bundle) {
        CastDevice Y0 = CastDevice.Y0(bundle);
        this.k = Y0;
        if (Y0 == null) {
            Preconditions.e("Must be called from the main thread.");
            zzau zzauVar = this.a;
            Logger logger = Session.b;
            if (zzauVar != null) {
                try {
                    r0 = zzauVar.zzm();
                } catch (RemoteException unused) {
                    logger.b("Unable to call %s on %s.", "isResuming", "zzau");
                }
            }
            if (r0) {
                if (zzauVar == null) {
                    return;
                }
                try {
                    zzauVar.zzt();
                    return;
                } catch (RemoteException unused2) {
                    logger.b("Unable to call %s on %s.", "notifyFailedToResumeSession", "zzau");
                    return;
                }
            }
            if (zzauVar == null) {
                return;
            }
            try {
                zzauVar.zzq();
                return;
            } catch (RemoteException unused3) {
                logger.b("Unable to call %s on %s.", "notifyFailedToStartSession", "zzau");
                return;
            }
        }
        zzbm zzbmVar = this.i;
        if (zzbmVar != null) {
            zzbmVar.p();
            this.i = null;
        }
        n.a("Acquiring a connection to Google Play Services for %s", this.k);
        CastDevice castDevice = this.k;
        Preconditions.i(castDevice);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.f;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.f;
        NotificationOptions notificationOptions = castMediaOptions != null ? castMediaOptions.d : null;
        int i = 1;
        boolean z = castMediaOptions != null && castMediaOptions.e;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        zzbx zzbxVar = this.g;
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", zzbxVar.zzo());
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_USE_ROUTE_CONNECTION", zzbxVar.g);
        Cast.CastOptions.Builder builder = new Cast.CastOptions.Builder(castDevice, new t8p(this));
        builder.c = bundle2;
        Cast.CastOptions castOptions2 = new Cast.CastOptions(builder);
        int i2 = Cast.a;
        zzbm zzbmVar2 = new zzbm(this.c, castOptions2);
        zzbmVar2.F.add(new adp(this));
        this.i = zzbmVar2;
        ListenerHolder a = ListenerHolders.a(zzbmVar2.g, zzbmVar2.l, "castDeviceControllerListenerKey");
        RegistrationMethods.Builder builder2 = new RegistrationMethods.Builder();
        builder2.c = gl5.b;
        builder2.f = true;
        fjn fjnVar = new fjn(zzbmVar2, i);
        w9f w9fVar = w9f.b;
        zzbmVar2.G = 2;
        builder2.d = a;
        builder2.a = fjnVar;
        builder2.b = w9fVar;
        builder2.e = new Feature[]{com.google.android.gms.cast.zzaq.a};
        builder2.g = 8428;
        zzbmVar2.e(builder2.a());
    }
}
