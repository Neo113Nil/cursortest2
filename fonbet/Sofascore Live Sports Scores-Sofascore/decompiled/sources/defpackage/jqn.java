package defpackage;

import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.SessionState;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.SessionTransferCallback;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzce;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jqn implements SessionManagerListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ jqn(zzce zzceVar) {
        Objects.requireNonNull(zzceVar);
        this.b = zzceVar;
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void a(Session session, int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void c(Session session, String str) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* synthetic */ void d(Session session, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                Logger logger = zzce.i;
                Object[] objArr = {Integer.valueOf(i)};
                Logger logger2 = zzce.i;
                logger2.a("onSessionEnded with error = %d", objArr);
                zzce zzceVar = (zzce) obj;
                int i3 = zzceVar.e;
                if (i3 == 0) {
                    logger2.a("No need to notify transferred if the transfer type is unknown", new Object[0]);
                } else if (zzceVar.h == null) {
                    logger2.a("No need to notify with null sessionState", new Object[0]);
                } else {
                    logger2.a("notify transferred with type = %d, sessionState = %s", Integer.valueOf(i3), zzceVar.h);
                    Iterator it = new HashSet(zzceVar.b).iterator();
                    while (it.hasNext()) {
                        ((SessionTransferCallback) it.next()).b(zzceVar.e);
                    }
                }
                if (zzceVar.e != 2) {
                    zzceVar.a();
                    break;
                }
                break;
            default:
                ((ExpandedControllerActivity) obj).finish();
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void e(Session session, int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void f(Session session) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final void k(Session session, String str) {
        MediaLoadRequestData mediaLoadRequestData;
        switch (this.a) {
            case 0:
                zzce zzceVar = (zzce) this.b;
                Object[] objArr = {Integer.valueOf(zzceVar.e)};
                Logger logger = zzce.i;
                logger.a("onSessionStarted with transferType = %d", objArr);
                if (zzceVar.f && zzceVar.a.q && zzceVar.e == 2) {
                    int i = 0;
                    if (zzceVar.h == null) {
                        logger.a("skip restoring session state due to null SessionState", new Object[0]);
                    } else {
                        SessionManager sessionManager = zzceVar.g;
                        RemoteMediaClient remoteMediaClient = null;
                        if (sessionManager == null) {
                            logger.a("skip transferring as SessionManager is null", new Object[0]);
                        } else {
                            CastSession c = sessionManager.c();
                            if (c == null) {
                                logger.a("skip transferring as CastSession is null", new Object[0]);
                            } else {
                                remoteMediaClient = c.k();
                            }
                        }
                        if (remoteMediaClient == null) {
                            logger.a("skip restoring session state due to null RemoteMediaClient", new Object[0]);
                        } else {
                            logger.a("resume SessionState to current session", new Object[0]);
                            SessionState sessionState = zzceVar.h;
                            if (sessionState != null && (mediaLoadRequestData = sessionState.a) != null) {
                                RemoteMediaClient.k.a("resume SessionState", new Object[0]);
                                Preconditions.e("Must be called from the main thread.");
                                if (remoteMediaClient.G()) {
                                    RemoteMediaClient.I(new nhn(remoteMediaClient, mediaLoadRequestData, i));
                                } else {
                                    RemoteMediaClient.F();
                                }
                            }
                        }
                    }
                }
                zzceVar.a();
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void m(Session session, boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void n(Session session, int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.SessionManagerListener
    public final /* bridge */ /* synthetic */ void o(Session session) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
    }

    public /* synthetic */ jqn(ExpandedControllerActivity expandedControllerActivity) {
        this.b = expandedControllerActivity;
    }
}
