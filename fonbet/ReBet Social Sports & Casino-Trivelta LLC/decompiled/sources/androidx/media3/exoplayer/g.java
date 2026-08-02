package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.media.RoutingSessionInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.s;
import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import e1.C4140g;
import e1.InterfaceC4143j;
import e1.Z;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import m1.AbstractC5489B;
import m1.AbstractC5490C;
import m1.AbstractC5521n;
import m1.AbstractC5534u;
import m1.AbstractC5536v;
import m1.AbstractC5538w;

/* loaded from: classes.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final s f21132a;

    public static final class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public AudioManager f21133a;

        /* renamed from: b, reason: collision with root package name */
        public AudioDeviceCallback f21134b;

        /* renamed from: c, reason: collision with root package name */
        public C4140g f21135c;

        public class a extends AudioDeviceCallback {
            public a() {
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f21135c.g(Boolean.valueOf(b.this.h()));
            }

            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                b.this.f21135c.g(Boolean.valueOf(b.this.h()));
            }
        }

        public b() {
        }

        public static /* synthetic */ void d(b bVar, Context context) {
            AudioManager audioManager;
            AbstractC4134a.e(bVar.f21135c);
            if (Z.U0(context) && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                bVar.f21133a = audioManager;
                a aVar = bVar.new a();
                bVar.f21134b = aVar;
                audioManager.registerAudioDeviceCallback(aVar, new Handler((Looper) AbstractC4134a.e(Looper.myLooper())));
                bVar.f21135c.g(Boolean.valueOf(bVar.h()));
            }
        }

        public static /* synthetic */ void e(b bVar) {
            AudioManager audioManager = bVar.f21133a;
            if (audioManager != null) {
                audioManager.unregisterAudioDeviceCallback((AudioDeviceCallback) AbstractC4134a.e(bVar.f21134b));
            }
        }

        @Override // androidx.media3.exoplayer.s
        public boolean a() {
            C4140g c4140g = this.f21135c;
            if (c4140g == null) {
                return true;
            }
            return ((Boolean) c4140g.d()).booleanValue();
        }

        @Override // androidx.media3.exoplayer.s
        public void b(final s.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC4143j interfaceC4143j) {
            C4140g c4140g = new C4140g(Boolean.TRUE, looper2, looper, interfaceC4143j, new C4140g.a() { // from class: m1.k
                @Override // e1.C4140g.a
                public final void a(Object obj, Object obj2) {
                    s.a.this.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f21135c = c4140g;
            c4140g.e(new Runnable() { // from class: m1.l
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.d(g.b.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.s
        public void disable() {
            ((C4140g) AbstractC4134a.e(this.f21135c)).e(new Runnable() { // from class: m1.j
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.e(g.b.this);
                }
            });
        }

        public final boolean h() {
            for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) AbstractC4134a.i(this.f21133a)).getDevices(2)) {
                if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 5 || audioDeviceInfo.getType() == 6 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                    return true;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26 && audioDeviceInfo.getType() == 22) {
                    return true;
                }
                if (i10 >= 28 && audioDeviceInfo.getType() == 23) {
                    return true;
                }
                if (i10 >= 31 && (audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 27)) {
                    return true;
                }
                if (i10 >= 33 && audioDeviceInfo.getType() == 30) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class c implements s {

        /* renamed from: e, reason: collision with root package name */
        public static final RouteDiscoveryPreference f21137e;

        /* renamed from: a, reason: collision with root package name */
        public MediaRouter2 f21138a;

        /* renamed from: b, reason: collision with root package name */
        public MediaRouter2$RouteCallback f21139b;

        /* renamed from: c, reason: collision with root package name */
        public MediaRouter2$ControllerCallback f21140c;

        /* renamed from: d, reason: collision with root package name */
        public C4140g f21141d;

        public class a extends MediaRouter2$RouteCallback {
            public a() {
            }
        }

        public class b extends MediaRouter2$ControllerCallback {
            public b() {
            }

            public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
                c.this.f21141d.g(Boolean.valueOf(c.j(c.this.f21138a)));
            }
        }

        static {
            RouteDiscoveryPreference build;
            AbstractC5538w.a();
            build = AbstractC5536v.a(AbstractC3445z.t(), false).build();
            f21137e = build;
        }

        public c() {
        }

        public static /* synthetic */ void c(c cVar) {
            AbstractC5489B.a(AbstractC4134a.e(cVar.f21138a)).unregisterControllerCallback(AbstractC5490C.a(AbstractC4134a.e(cVar.f21140c)));
            cVar.f21140c = null;
            cVar.f21138a.unregisterRouteCallback(AbstractC5521n.a(AbstractC4134a.e(cVar.f21139b)));
        }

        public static /* synthetic */ void e(c cVar, Context context) {
            MediaRouter2 mediaRouter2;
            AbstractC4134a.e(cVar.f21141d);
            mediaRouter2 = MediaRouter2.getInstance(context);
            cVar.f21138a = mediaRouter2;
            cVar.f21139b = cVar.new a();
            final C4140g c4140g = cVar.f21141d;
            Objects.requireNonNull(c4140g);
            Executor executor = new Executor() { // from class: m1.H
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C4140g.this.e(runnable);
                }
            };
            cVar.f21138a.registerRouteCallback(executor, cVar.f21139b, f21137e);
            b bVar = cVar.new b();
            cVar.f21140c = bVar;
            cVar.f21138a.registerControllerCallback(executor, bVar);
            cVar.f21141d.g(Boolean.valueOf(j(cVar.f21138a)));
        }

        public static boolean i(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
            int suitabilityStatus;
            suitabilityStatus = mediaRoute2Info.getSuitabilityStatus();
            return suitabilityStatus == 1 ? (i10 == 1 || i10 == 2) && z10 : suitabilityStatus == 0;
        }

        public static boolean j(MediaRouter2 mediaRouter2) {
            MediaRouter2.RoutingController systemController;
            RoutingSessionInfo routingSessionInfo;
            int transferReason;
            MediaRouter2.RoutingController systemController2;
            boolean wasTransferInitiatedBySelf;
            MediaRouter2.RoutingController systemController3;
            List selectedRoutes;
            systemController = AbstractC5489B.a(AbstractC4134a.e(mediaRouter2)).getSystemController();
            routingSessionInfo = systemController.getRoutingSessionInfo();
            transferReason = routingSessionInfo.getTransferReason();
            systemController2 = mediaRouter2.getSystemController();
            wasTransferInitiatedBySelf = systemController2.wasTransferInitiatedBySelf();
            systemController3 = mediaRouter2.getSystemController();
            selectedRoutes = systemController3.getSelectedRoutes();
            Iterator it = selectedRoutes.iterator();
            while (it.hasNext()) {
                if (i(AbstractC5534u.a(it.next()), transferReason, wasTransferInitiatedBySelf)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.s
        public boolean a() {
            C4140g c4140g = this.f21141d;
            if (c4140g == null) {
                return true;
            }
            return ((Boolean) c4140g.d()).booleanValue();
        }

        @Override // androidx.media3.exoplayer.s
        public void b(final s.a aVar, final Context context, Looper looper, Looper looper2, InterfaceC4143j interfaceC4143j) {
            C4140g c4140g = new C4140g(Boolean.TRUE, looper2, looper, interfaceC4143j, new C4140g.a() { // from class: m1.F
                @Override // e1.C4140g.a
                public final void a(Object obj, Object obj2) {
                    s.a.this.a(((Boolean) obj2).booleanValue());
                }
            });
            this.f21141d = c4140g;
            c4140g.e(new Runnable() { // from class: m1.G
                @Override // java.lang.Runnable
                public final void run() {
                    g.c.e(g.c.this, context);
                }
            });
        }

        @Override // androidx.media3.exoplayer.s
        public void disable() {
            ((C4140g) AbstractC4134a.i(this.f21141d)).e(new Runnable() { // from class: m1.E
                @Override // java.lang.Runnable
                public final void run() {
                    g.c.c(g.c.this);
                }
            });
        }
    }

    public g() {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f21132a = new c();
        } else {
            this.f21132a = new b();
        }
    }

    @Override // androidx.media3.exoplayer.s
    public boolean a() {
        s sVar = this.f21132a;
        return sVar == null || sVar.a();
    }

    @Override // androidx.media3.exoplayer.s
    public void b(s.a aVar, Context context, Looper looper, Looper looper2, InterfaceC4143j interfaceC4143j) {
        s sVar = this.f21132a;
        if (sVar != null) {
            sVar.b(aVar, context, looper, looper2, interfaceC4143j);
        }
    }

    @Override // androidx.media3.exoplayer.s
    public void disable() {
        s sVar = this.f21132a;
        if (sVar != null) {
            sVar.disable();
        }
    }
}
