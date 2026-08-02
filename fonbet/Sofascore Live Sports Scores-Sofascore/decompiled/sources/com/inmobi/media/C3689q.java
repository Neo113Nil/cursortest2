package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dmi;
import defpackage.k9f;
import defpackage.ku3;
import defpackage.prd;
import defpackage.rfg;
import defpackage.ufl;
import defpackage.w2g;
import defpackage.xw3;
import defpackage.yda;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3689q {
    public static AudioManager b;
    public static C3533k c;
    public static yda f;
    public static Function1 i;
    public static final C3689q a = new C3689q();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicReference e = new AtomicReference(null);
    public static final ku3 g = L9.d;
    public static final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public static void a(Float f2) {
        Float f3 = (Float) e.getAndSet(f2);
        if (f3 == null) {
            if (f2 == null) {
                return;
            }
        } else if (f2 != null && f3.floatValue() == f2.floatValue()) {
            return;
        }
        Iterator it = h.iterator();
        it.getClass();
        while (it.hasNext()) {
            InterfaceC3507j interfaceC3507j = (InterfaceC3507j) ((WeakReference) it.next()).get();
            if (interfaceC3507j != null) {
                ((C3449gi) interfaceC3507j).a(f2 != null ? Float.valueOf(N3.a(f2.floatValue() * 100.0f)) : null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b() {
        try {
            F5.a.getClass();
            if (F5.y()) {
                AudioManager audioManager = b;
                if (audioManager != null && audioManager.isStreamMute(3)) {
                }
                return !AbstractC3424fj.f;
            }
            AudioManager audioManager2 = b;
            if (audioManager2 != null && audioManager2.getStreamVolume(3) == 0) {
            }
            if (!AbstractC3424fj.f) {
            }
        } catch (Throwable unused) {
            return AbstractC3424fj.f;
        }
    }

    public static void a(long j) {
        prd prdVar = new prd(j, 10);
        i = prdVar;
        ((Kc) AbstractC3424fj.e.getValue()).a(new int[]{102, 101}, prdVar);
    }

    public static void a(InterfaceC3880x9 interfaceC3880x9) {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        Throwable a2 = w2g.a(P3.a(new rfg(interfaceC3880x9, context, ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getMraid3().getMuteChangeInterval(), 2)));
        if (a2 != null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).b("AdAudioTracker", dmi.q("Error starting audio volume tracking - ", a2.getMessage()));
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC3880x9 interfaceC3880x9, Context context, long j) {
        if (d.compareAndSet(false, true)) {
            return xw3.L(g, null, null, new C3663p(interfaceC3880x9, context, j, null), 3);
        }
        if (interfaceC3880x9 == null) {
            return null;
        }
        ((C3906y9) interfaceC3880x9).c("AdAudioTracker", "Audio volume tracking is already started");
        return Unit.a;
    }

    public static void a(Context context, InterfaceC3880x9 interfaceC3880x9) {
        Throwable a2 = w2g.a(P3.a(new k9f(context, 18)));
        if (a2 == null || interfaceC3880x9 == null) {
            return;
        }
        ((C3906y9) interfaceC3880x9).b("AdAudioTracker", dmi.q("Error cleaning up audio volume tracker - ", a2.getMessage()));
    }

    public static final Unit a(Context context) {
        C3533k c3533k = c;
        if (c3533k != null) {
            P3.a(new ufl(11, context, c3533k));
            c = null;
        }
        yda ydaVar = f;
        if (ydaVar != null) {
            ydaVar.e(null);
        }
        Function1 function1 = i;
        if (function1 != null) {
            ((Kc) AbstractC3424fj.e.getValue()).a(function1);
        }
        i = null;
        f = null;
        return Unit.a;
    }

    public static final Unit a(Context context, C3533k c3533k) {
        context.unregisterReceiver(c3533k);
        return Unit.a;
    }

    public final synchronized float a() {
        try {
            boolean b2 = b();
            AudioManager audioManager = b;
            int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
            AudioManager audioManager2 = b;
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (b2) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (streamVolume < 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (streamVolume > streamMaxVolume) {
                return 1.0f;
            }
            if (streamMaxVolume == 0) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return streamVolume / streamMaxVolume;
        } catch (Throwable unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static final Unit a(long j, N2 n2) {
        n2.getClass();
        int i2 = n2.a;
        if (i2 != 101) {
            if (i2 == 102) {
                yda ydaVar = f;
                if (ydaVar != null) {
                    ydaVar.e(null);
                }
                f = null;
            }
        } else if (f == null && d.get()) {
            f = N3.a(g, 0L, j, new C3637o(null));
        }
        return Unit.a;
    }
}
