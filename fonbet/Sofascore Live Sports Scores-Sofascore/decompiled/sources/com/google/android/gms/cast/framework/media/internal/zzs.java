package com.google.android.gms.cast.framework.media.internal;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.f;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.ImagePicker;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzfk;
import com.inmobi.media.core.config.models.CrashConfig;
import com.ironsource.Ua;
import com.sofascore.results.R;
import defpackage.a1p;
import defpackage.a70;
import defpackage.axo;
import defpackage.cqa;
import defpackage.dcc;
import defpackage.dh0;
import defpackage.dno;
import defpackage.f0o;
import defpackage.gvo;
import defpackage.hcc;
import defpackage.jke;
import defpackage.kke;
import defpackage.lnb;
import defpackage.mm9;
import defpackage.mxn;
import defpackage.nto;
import defpackage.ohn;
import defpackage.r3p;
import defpackage.wj9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzs {
    public static final Logger v = new Logger("MediaSessionManager", null);
    public final Context a;
    public final CastOptions b;
    public final zzbx c;
    public final SessionManager d;
    public final NotificationOptions e;
    public final ComponentName f;
    public final ComponentName g;
    public final zzb h;
    public final zzb i;
    public final axo j;
    public final zzfk k;
    public final dno l;
    public final r3p m;
    public RemoteMediaClient n;
    public CastDevice o;
    public hcc p;
    public boolean q;
    public PlaybackStateCompat.CustomAction r;
    public PlaybackStateCompat.CustomAction s;
    public PlaybackStateCompat.CustomAction t;
    public PlaybackStateCompat.CustomAction u;

    public zzs(Context context, CastOptions castOptions, zzbx zzbxVar) {
        NotificationOptions notificationOptions;
        int[] iArr;
        this.a = context;
        this.b = castOptions;
        this.c = zzbxVar;
        Logger logger = CastContext.l;
        Preconditions.e("Must be called from the main thread.");
        CastContext castContext = CastContext.n;
        axo axoVar = null;
        this.d = castContext != null ? castContext.b() : null;
        CastMediaOptions castMediaOptions = castOptions.f;
        this.e = castMediaOptions == null ? null : castMediaOptions.d;
        this.m = new r3p(this);
        String str = castMediaOptions == null ? null : castMediaOptions.b;
        this.f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = castMediaOptions == null ? null : castMediaOptions.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        zzb zzbVar = new zzb(context);
        this.h = zzbVar;
        zzbVar.e = new ohn(this, 28);
        zzb zzbVar2 = new zzb(context);
        this.i = zzbVar2;
        zzbVar2.e = new mxn(this, 18);
        this.k = new zzfk(Looper.getMainLooper());
        Logger logger2 = axo.v;
        CastMediaOptions castMediaOptions2 = castOptions.f;
        if (castMediaOptions2 != null && (notificationOptions = castMediaOptions2.d) != null) {
            com.google.android.gms.cast.framework.media.zzg zzgVar = notificationOptions.F;
            if (zzgVar != null) {
                List b = zzt.b(zzgVar);
                try {
                    iArr = zzgVar.zzg();
                } catch (RemoteException unused) {
                    zzt.a.c("Unable to call %s on %s.", "getCompactViewActionIndices", "zzg");
                    iArr = null;
                }
                int size = b == null ? 0 : b.size();
                if (b == null || b.isEmpty()) {
                    logger2.c("NotificationActionsProvider".concat(" doesn't provide any action."), new Object[0]);
                } else if (b.size() > 5) {
                    logger2.c("NotificationActionsProvider".concat(" provides more than 5 actions."), new Object[0]);
                } else if (iArr == null || (iArr.length) == 0) {
                    logger2.c("NotificationActionsProvider".concat(" doesn't provide any actions for compact view."), new Object[0]);
                } else {
                    for (int i : iArr) {
                        if (i < 0 || i >= size) {
                            logger2.c("NotificationActionsProvider".concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                            break;
                        }
                    }
                }
            }
            axoVar = new axo(context);
        }
        this.j = axoVar;
        this.l = new dno(this, 15);
    }

    public final void a(RemoteMediaClient remoteMediaClient, CastDevice castDevice) {
        ComponentName componentName;
        CastOptions castOptions = this.b;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.f;
        if (this.q || castOptions == null || castMediaOptions == null || this.e == null || remoteMediaClient == null || castDevice == null || (componentName = this.g) == null) {
            v.a("skip attaching media session", new Object[0]);
            return;
        }
        this.n = remoteMediaClient;
        remoteMediaClient.t(this.m);
        this.o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        Context context = this.a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
        if (castMediaOptions.f) {
            hcc hccVar = new hcc(context, componentName, broadcast);
            this.p = hccVar;
            d(0, null);
            CastDevice castDevice2 = this.o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.o.d);
                dh0 dh0Var = MediaMetadataCompat.d;
                if (dh0Var.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) dh0Var.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    a70.p("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    return;
                } else {
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    hccVar.a0(new MediaMetadataCompat(bundle));
                }
            }
            hccVar.Z(new a1p(this), null);
            ((dcc) hccVar.b).a.setActive(true);
            Iterator it = ((ArrayList) hccVar.d).iterator();
            if (it.hasNext()) {
                throw lnb.i(it);
            }
            this.c.S1(hccVar);
        }
        this.q = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        MediaInfo f;
        MediaMetadata mediaMetadata;
        boolean z;
        boolean z2;
        nto ntoVar;
        Uri uri;
        gvo gvoVar;
        MediaQueueItem e;
        MediaInfo mediaInfo;
        RemoteMediaClient remoteMediaClient = this.n;
        if (remoteMediaClient == null) {
            return;
        }
        int C = remoteMediaClient.C();
        MediaInfo f2 = remoteMediaClient.f();
        if (remoteMediaClient.n() && (e = remoteMediaClient.e()) != null && (mediaInfo = e.a) != null) {
            f2 = mediaInfo;
        }
        d(C, f2);
        if (!remoteMediaClient.k()) {
            h();
            j();
            return;
        }
        if (C != 0) {
            axo axoVar = this.j;
            if (axoVar != null) {
                v.a("Update media notification.", new Object[0]);
                CastDevice castDevice = this.o;
                RemoteMediaClient remoteMediaClient2 = this.n;
                hcc hccVar = this.p;
                if (castDevice != null && remoteMediaClient2 != null && hccVar != null && (f = remoteMediaClient2.f()) != null && (mediaMetadata = f.d) != null) {
                    List list = mediaMetadata.a;
                    MediaStatus h = remoteMediaClient2.h();
                    if (h != null) {
                        int i = h.p;
                        if (i == 1 || i == 2 || i == 3) {
                            z = true;
                            z2 = z;
                            boolean z3 = remoteMediaClient2.i() == 2;
                            int i2 = f.b;
                            String Y0 = mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE");
                            String str = castDevice.d;
                            nto ntoVar2 = new nto(z3, i2, Y0, str, ((dcc) hccVar.b).b, z, z2);
                            boolean z4 = z3;
                            boolean z5 = z;
                            boolean z6 = z2;
                            ntoVar = axoVar.l;
                            if (ntoVar != null || z4 != ntoVar.b || i2 != ntoVar.c || !CastUtils.c(Y0, ntoVar.d) || !CastUtils.c(str, ntoVar.e) || z5 != ntoVar.f || z6 != ntoVar.g) {
                                axoVar.l = ntoVar2;
                                axoVar.a();
                            }
                            gvo gvoVar2 = new gvo(axoVar.d != null ? ImagePicker.a(mediaMetadata) : (list == null || list.isEmpty()) ? null : (WebImage) list.get(0));
                            uri = (Uri) gvoVar2.b;
                            gvoVar = axoVar.m;
                            if (gvoVar != null || !CastUtils.c(uri, (Uri) gvoVar.b)) {
                                zzb zzbVar = axoVar.j;
                                zzbVar.e = new f0o(axoVar, gvoVar2);
                                zzbVar.a(uri);
                            }
                        } else {
                            Integer num = (Integer) h.x.get(h.c);
                            if (num != null) {
                                boolean z7 = num.intValue() > 0;
                                z = num.intValue() < h.q.size() + (-1);
                                z2 = z7;
                                if (remoteMediaClient2.i() == 2) {
                                }
                                int i22 = f.b;
                                String Y02 = mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE");
                                String str2 = castDevice.d;
                                nto ntoVar22 = new nto(z3, i22, Y02, str2, ((dcc) hccVar.b).b, z, z2);
                                boolean z42 = z3;
                                boolean z52 = z;
                                boolean z62 = z2;
                                ntoVar = axoVar.l;
                                if (ntoVar != null) {
                                }
                                axoVar.l = ntoVar22;
                                axoVar.a();
                                gvo gvoVar22 = new gvo(axoVar.d != null ? ImagePicker.a(mediaMetadata) : (list == null || list.isEmpty()) ? null : (WebImage) list.get(0));
                                uri = (Uri) gvoVar22.b;
                                gvoVar = axoVar.m;
                                if (gvoVar != null) {
                                }
                                zzb zzbVar2 = axoVar.j;
                                zzbVar2.e = new f0o(axoVar, gvoVar22);
                                zzbVar2.a(uri);
                            }
                        }
                    }
                    z = false;
                    z2 = z;
                    if (remoteMediaClient2.i() == 2) {
                    }
                    int i222 = f.b;
                    String Y022 = mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE");
                    String str22 = castDevice.d;
                    nto ntoVar222 = new nto(z3, i222, Y022, str22, ((dcc) hccVar.b).b, z, z2);
                    boolean z422 = z3;
                    boolean z522 = z;
                    boolean z622 = z2;
                    ntoVar = axoVar.l;
                    if (ntoVar != null) {
                    }
                    axoVar.l = ntoVar222;
                    axoVar.a();
                    gvo gvoVar222 = new gvo(axoVar.d != null ? ImagePicker.a(mediaMetadata) : (list == null || list.isEmpty()) ? null : (WebImage) list.get(0));
                    uri = (Uri) gvoVar222.b;
                    gvoVar = axoVar.m;
                    if (gvoVar != null) {
                    }
                    zzb zzbVar22 = axoVar.j;
                    zzbVar22.e = new f0o(axoVar, gvoVar222);
                    zzbVar22.a(uri);
                }
            }
            if (remoteMediaClient.n()) {
                return;
            }
            i(true);
        }
    }

    public final void c(Bitmap bitmap, int i) {
        android.media.MediaMetadata metadata;
        hcc hccVar = this.p;
        if (hccVar == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        hcc hccVar2 = this.p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (hccVar2 != null && (metadata = ((a) ((wj9) hccVar2.c).b).a.getMetadata()) != null) {
            dh0 dh0Var = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        Bundle bundle = (Bundle) (mediaMetadataCompat == null ? new cqa(4) : new cqa(mediaMetadataCompat)).a;
        String str = i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        dh0 dh0Var2 = MediaMetadataCompat.d;
        if (dh0Var2.containsKey(str) && ((Integer) dh0Var2.get(str)).intValue() != 2) {
            a70.p(lnb.o("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            bundle.putParcelable(str, bitmap);
            hccVar.a0(new MediaMetadataCompat(bundle));
        }
    }

    public final void d(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat a;
        RemoteCallbackList remoteCallbackList;
        hcc hccVar;
        MediaMetadata mediaMetadata;
        android.media.MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        PendingIntent activity;
        hcc hccVar2 = this.p;
        if (hccVar2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        f fVar = new f();
        RemoteMediaClient remoteMediaClient = this.n;
        if (remoteMediaClient == null || this.j == null) {
            a = fVar.a();
        } else {
            long d = (remoteMediaClient.C() == 0 || remoteMediaClient.m()) ? 0L : remoteMediaClient.d();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            fVar.b = i;
            fVar.c = d;
            fVar.f = elapsedRealtime;
            fVar.d = 1.0f;
            if (i == 0) {
                a = fVar.a();
            } else {
                NotificationOptions notificationOptions = this.e;
                com.google.android.gms.cast.framework.media.zzg zzgVar = notificationOptions != null ? notificationOptions.F : null;
                RemoteMediaClient remoteMediaClient2 = this.n;
                long j = (remoteMediaClient2 == null || remoteMediaClient2.m() || this.n.q()) ? 0L : 256L;
                if (zzgVar != null) {
                    List<NotificationAction> b = zzt.b(zzgVar);
                    if (b != null) {
                        for (NotificationAction notificationAction : b) {
                            String str = notificationAction.a;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                j |= e(str, i, bundle);
                            } else {
                                f(fVar, str, notificationAction);
                            }
                        }
                    }
                } else if (notificationOptions != null) {
                    Iterator it = notificationOptions.a.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                            j |= e(str2, i, bundle);
                        } else {
                            f(fVar, str2, null);
                        }
                    }
                }
                fVar.e = j;
                a = fVar.a();
            }
        }
        dcc dccVar = (dcc) hccVar2.b;
        dccVar.f = a;
        synchronized (dccVar.c) {
            int beginBroadcast = dccVar.e.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = dccVar.e;
                if (beginBroadcast < 0) {
                    break;
                }
                try {
                    ((mm9) remoteCallbackList.getBroadcastItem(beginBroadcast)).z4(a);
                } catch (RemoteException unused) {
                }
                beginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = dccVar.a;
        PlaybackState playbackState = a.l;
        if (playbackState == null) {
            PlaybackState.Builder d2 = jke.d();
            jke.x(d2, a.a, a.b, a.d, a.h);
            jke.u(d2, a.c);
            jke.s(d2, a.e);
            jke.v(d2, a.g);
            for (PlaybackStateCompat.CustomAction customAction : a.i) {
                PlaybackState.CustomAction customAction2 = customAction.e;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e = jke.e(customAction.a, customAction.b, customAction.c);
                    jke.w(e, customAction.d);
                    customAction2 = jke.b(e);
                }
                jke.a(d2, customAction2);
            }
            jke.t(d2, a.j);
            kke.b(d2, a.k);
            playbackState = jke.c(d2);
            a.l = playbackState;
        }
        mediaSession.setPlaybackState(playbackState);
        NotificationOptions notificationOptions2 = this.e;
        if (notificationOptions2 != null && notificationOptions2.G) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (notificationOptions2 != null && notificationOptions2.H) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((dcc) hccVar2.b).a.setExtras(bundle);
        }
        if (i == 0) {
            hccVar2.a0(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.n != null) {
            ComponentName componentName = this.f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.a, 0, intent, 201326592);
            }
            if (activity != null) {
                ((dcc) hccVar2.b).a.setSessionActivity(activity);
            }
        }
        RemoteMediaClient remoteMediaClient3 = this.n;
        if (remoteMediaClient3 == null || (hccVar = this.p) == null || mediaInfo == null || (mediaMetadata = mediaInfo.d) == null) {
            return;
        }
        long j2 = remoteMediaClient3.m() ? 0L : mediaInfo.e;
        String Y0 = mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE");
        String Y02 = mediaMetadata.Y0("com.google.android.gms.cast.metadata.SUBTITLE");
        hcc hccVar3 = this.p;
        if (hccVar3 == null || (metadata = ((a) ((wj9) hccVar3.c).b).a.getMetadata()) == null) {
            createFromParcel = null;
        } else {
            dh0 dh0Var = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.b = metadata;
        }
        cqa cqaVar = createFromParcel == null ? new cqa(4) : new cqa(createFromParcel);
        dh0 dh0Var2 = MediaMetadataCompat.d;
        if (dh0Var2.containsKey("android.media.metadata.DURATION") && ((Integer) dh0Var2.get("android.media.metadata.DURATION")).intValue() != 0) {
            a70.p("The android.media.metadata.DURATION key cannot be used to put a long");
            return;
        }
        ((Bundle) cqaVar.a).putLong("android.media.metadata.DURATION", j2);
        if (Y0 != null) {
            cqaVar.F("android.media.metadata.TITLE", Y0);
            cqaVar.F("android.media.metadata.DISPLAY_TITLE", Y0);
        }
        if (Y02 != null) {
            cqaVar.F("android.media.metadata.DISPLAY_SUBTITLE", Y02);
        }
        hccVar.a0(new MediaMetadataCompat((Bundle) cqaVar.a));
        Uri g = g(mediaMetadata);
        if (g != null) {
            this.h.a(g);
        } else {
            c(null, 0);
        }
        Uri g2 = g(mediaMetadata);
        if (g2 != null) {
            this.i.a(g2);
        } else {
            c(null, 3);
        }
    }

    public final long e(String str, int i, Bundle bundle) {
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    int i2 = 3;
                    if (i == 3) {
                        j = 514;
                    } else {
                        i2 = i;
                        j = 512;
                    }
                    if (i2 != 2) {
                        return j;
                    }
                    return 516L;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                RemoteMediaClient remoteMediaClient = this.n;
                if (remoteMediaClient != null && remoteMediaClient.D()) {
                    return 16L;
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            RemoteMediaClient remoteMediaClient2 = this.n;
            if (remoteMediaClient2 != null && remoteMediaClient2.E()) {
                return 32L;
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f fVar, String str, NotificationAction notificationAction) {
        PlaybackStateCompat.CustomAction customAction;
        PlaybackStateCompat.CustomAction customAction2;
        PlaybackStateCompat.CustomAction customAction3;
        int hashCode = str.hashCode();
        Context context = this.a;
        NotificationOptions notificationOptions = this.e;
        PlaybackStateCompat.CustomAction customAction4 = null;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    customAction = this.s;
                    if (customAction == null && notificationOptions != null) {
                        long j = notificationOptions.c;
                        Logger logger = zzt.a;
                        int i = notificationOptions.B;
                        if (j == Ua.s) {
                            i = notificationOptions.C;
                        } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            i = notificationOptions.D;
                        }
                        int i2 = notificationOptions.n;
                        if (j == Ua.s) {
                            i2 = notificationOptions.o;
                        } else if (j == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            i2 = notificationOptions.p;
                        }
                        String string = context.getResources().getString(i);
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                            if (!TextUtils.isEmpty(string)) {
                                if (i2 == 0) {
                                    a70.p("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, i2, null);
                                    this.s = customAction2;
                                    customAction4 = customAction2;
                                    if (customAction4 != null) {
                                        fVar.a.add(customAction4);
                                        break;
                                    }
                                }
                            } else {
                                a70.p("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            a70.p("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (notificationAction != null) {
                    String str2 = notificationAction.c;
                    int i3 = notificationAction.b;
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            if (i3 == 0) {
                                a70.p("You must specify an icon resource id to build a CustomAction");
                                break;
                            } else {
                                customAction4 = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                            }
                        } else {
                            a70.p("You must specify a name to build a CustomAction");
                            break;
                        }
                    } else {
                        a70.p("You must specify an action to build a CustomAction");
                        break;
                    }
                }
                if (customAction4 != null) {
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    customAction = this.t;
                    if (customAction == null && notificationOptions != null) {
                        String string2 = context.getResources().getString(notificationOptions.E);
                        int i4 = notificationOptions.q;
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            if (!TextUtils.isEmpty(string2)) {
                                if (i4 == 0) {
                                    a70.p("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i4, null);
                                    this.t = customAction3;
                                    customAction4 = customAction3;
                                    if (customAction4 != null) {
                                    }
                                }
                            } else {
                                a70.p("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            a70.p("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (notificationAction != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    customAction = this.u;
                    if (customAction == null && notificationOptions != null) {
                        String string3 = context.getResources().getString(notificationOptions.E);
                        int i5 = notificationOptions.q;
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            if (!TextUtils.isEmpty(string3)) {
                                if (i5 == 0) {
                                    a70.p("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    customAction3 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i5, null);
                                    this.u = customAction3;
                                    customAction4 = customAction3;
                                    if (customAction4 != null) {
                                    }
                                }
                            } else {
                                a70.p("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            a70.p("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (notificationAction != null) {
                }
                if (customAction4 != null) {
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    customAction = this.r;
                    if (customAction == null && notificationOptions != null) {
                        long j2 = notificationOptions.c;
                        Logger logger2 = zzt.a;
                        int i6 = notificationOptions.y;
                        if (j2 == Ua.s) {
                            i6 = notificationOptions.z;
                        } else if (j2 == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            i6 = notificationOptions.A;
                        }
                        int i7 = notificationOptions.k;
                        if (j2 == Ua.s) {
                            i7 = notificationOptions.l;
                        } else if (j2 == CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                            i7 = notificationOptions.m;
                        }
                        String string4 = context.getResources().getString(i6);
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                            if (!TextUtils.isEmpty(string4)) {
                                if (i7 == 0) {
                                    a70.p("You must specify an icon resource id to build a CustomAction");
                                    break;
                                } else {
                                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i7, null);
                                    this.r = customAction2;
                                    customAction4 = customAction2;
                                    if (customAction4 != null) {
                                    }
                                }
                            } else {
                                a70.p("You must specify a name to build a CustomAction");
                                break;
                            }
                        } else {
                            a70.p("You must specify an action to build a CustomAction");
                            break;
                        }
                    }
                    customAction4 = customAction;
                    if (customAction4 != null) {
                    }
                }
                if (notificationAction != null) {
                }
                if (customAction4 != null) {
                }
                break;
            default:
                if (notificationAction != null) {
                }
                if (customAction4 != null) {
                }
                break;
        }
    }

    public final Uri g(MediaMetadata mediaMetadata) {
        WebImage webImage;
        CastMediaOptions castMediaOptions = this.b.f;
        if ((castMediaOptions == null ? null : castMediaOptions.Y0()) != null) {
            webImage = ImagePicker.a(mediaMetadata);
        } else {
            List list = mediaMetadata.a;
            webImage = (list == null || list.isEmpty()) ? null : (WebImage) mediaMetadata.a.get(0);
        }
        if (webImage == null) {
            return null;
        }
        return webImage.b;
    }

    public final void h() {
        axo axoVar = this.j;
        if (axoVar != null) {
            v.a("Stopping media notification.", new Object[0]);
            zzb zzbVar = axoVar.j;
            zzbVar.b();
            zzbVar.e = null;
            NotificationManager notificationManager = axoVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.b.g) {
            zzfk zzfkVar = this.k;
            dno dnoVar = this.l;
            if (dnoVar != null) {
                zzfkVar.removeCallbacks(dnoVar);
            }
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    zzfkVar.postDelayed(dnoVar, 1000L);
                }
            }
        }
    }

    public final void j() {
        if (this.b.g) {
            this.k.removeCallbacks(this.l);
            Context context = this.a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }
}
