package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class R1 extends C3381e2 {
    public final X1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(Context context, C3845w0 c3845w0, C3278a2 c3278a2) {
        super(context, c3845w0, c3278a2);
        context.getClass();
        c3845w0.getClass();
        this.K = new X1();
    }

    @Override // com.inmobi.media.C3381e2
    public final boolean W() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "canProceedToLoad");
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Xb.a((byte) 1, "m1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == this.b) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Xb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.a);
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("m1", "Ad is active. ignore load");
            }
            return false;
        }
        if (this.b == 4) {
            boolean A = A();
            C3906y9 c3906y94 = this.i;
            if (!A) {
                if (c3906y94 != null) {
                    c3906y94.c("m1", "signalCanShowForStateReady");
                }
                C3906y9 c3906y95 = this.i;
                if (c3906y95 != null) {
                    c3906y95.a("m1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3458h1 n = n();
                if (n == null) {
                    Xb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C3906y9 c3906y96 = this.i;
                    if (c3906y96 != null) {
                        c3906y96.b("m1", "listener is null. load show callback missed");
                    }
                } else {
                    C3906y9 c3906y97 = this.i;
                    if (c3906y97 != null) {
                        c3906y97.a("m1", "callback - onLoadSuccess");
                    }
                    d(n);
                }
                return false;
            }
            if (c3906y94 != null) {
                c3906y94.b("m1", "ad is expired, clearing");
            }
            d();
        }
        E();
        return true;
    }

    @Override // com.inmobi.media.C3381e2, com.inmobi.media.AbstractC3941zi
    public final void a(Z1 z1) {
        z1.getClass();
        AbstractC3458h1 n = n();
        if (n != null) {
            n.a(z1);
        }
        X1 x1 = this.K;
        x1.getClass();
        z1.getClass();
        if (!x1.a && z1 == Z1.e) {
            x1.a = true;
            C3363d9 c3363d9 = C3363d9.c;
            c3363d9.a = System.currentTimeMillis();
            c3363d9.b++;
        }
    }

    public final void d0() {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.d("m1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        f((short) 2153);
    }

    public final void f(short s) {
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onShowFailure");
        }
        AbstractC3458h1 n = n();
        if (n == null) {
            Xb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.b("m1", "listener is null. show fail callback missed. ");
            }
        } else {
            C3906y9 c3906y93 = this.i;
            if (c3906y93 != null) {
                c3906y93.b("m1", "callback - onAdShowFailed");
            }
            n.b();
        }
        if (s != 0) {
            C3906y9 c3906y94 = this.i;
            if (c3906y94 != null) {
                c3906y94.b("m1", "show failed - " + ((int) s));
            }
            d(s);
        }
    }

    @Override // com.inmobi.media.C3381e2, com.inmobi.media.AbstractC3587m1, com.inmobi.media.AbstractC3941zi
    public final void i(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi) {
        AbstractC3458h1 n;
        gestureDetectorOnGestureListenerC3889xi.getClass();
        C3906y9 c3906y9 = this.i;
        if (c3906y9 != null) {
            c3906y9.c("m1", "onRenderViewVisible");
        }
        if (this.b == 4 && (n = n()) != null) {
            C3906y9 c3906y92 = this.i;
            if (c3906y92 != null) {
                c3906y92.a("m1", "callback - onAdDisplayed");
            }
            a(n);
        }
        super.i(gestureDetectorOnGestureListenerC3889xi);
    }

    @Override // com.inmobi.media.C3381e2, com.inmobi.media.AbstractC3587m1
    public final String m() {
        return "audio";
    }

    @Override // com.inmobi.media.C3381e2, com.inmobi.media.AbstractC3941zi
    public final void a(boolean z) {
        Context context = AbstractC3424fj.a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "audio_pref_file");
        int i = a.a.getInt("user_mute_count", 0);
        a.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }
}
