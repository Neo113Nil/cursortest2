package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import defpackage.joa;
import defpackage.wv8;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class O9 extends AbstractC3429fo {
    public final Fi d;
    public final C3904y7 e;
    public final C3906y9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9(Fi fi, Fi fi2, C3904y7 c3904y7, C3906y9 c3906y9) {
        super(fi);
        fi.getClass();
        fi2.getClass();
        c3904y7.getClass();
        this.d = fi2;
        this.e = c3904y7;
        this.f = c3906y9;
        this.g = "O9";
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Context context, byte b) {
        context.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.g;
            str.getClass();
            c3906y9.a(str, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
                return;
            }
            if (b == 1) {
                C3904y7 c3904y7 = this.e;
                InterfaceC3880x9 interfaceC3880x9 = c3904y7.f;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).c("HtmlAdTracker", "onActivityStopped");
                }
                R8 r8 = c3904y7.g;
                if (r8 != null) {
                    r8.d.getClass();
                    r8.c.a();
                    r8.e.removeCallbacksAndMessages(null);
                    r8.b.clear();
                }
                C3310b8 c3310b8 = c3904y7.h;
                if (c3310b8 != null) {
                    c3310b8.e();
                    return;
                }
                return;
            }
            if (b != 2) {
                this.g.getClass();
                return;
            }
            C3904y7 c3904y72 = this.e;
            InterfaceC3880x9 interfaceC3880x92 = c3904y72.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).c("HtmlAdTracker", "onActivityDestroyed");
            }
            R8 r82 = c3904y72.g;
            if (r82 != null) {
                r82.a.clear();
                r82.b.clear();
                r82.c.a();
                r82.e.removeMessages(0);
                r82.c.b();
            }
            c3904y72.g = null;
            C3310b8 c3310b82 = c3904y72.h;
            if (c3310b82 != null) {
                c3310b82.b();
            }
            c3904y72.h = null;
        } catch (Exception e) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str2 = this.g;
                str2.getClass();
                wv8.x("Exception in onActivityStateChanged with message : ", e.getMessage(), c3906y92, str2);
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3776t9.a(e);
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View c() {
        this.b = new WeakReference(this.d);
        return this.d;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void d() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.g;
            str.getClass();
            c3906y9.a(str, "stopTrackingForImpression");
        }
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.g;
            str2.getClass();
            c3906y92.a(str2, "stopTrackingForVisibility");
        }
        C3904y7 c3904y7 = this.e;
        View b = b();
        if (b == null) {
            return;
        }
        c3904y7.b(b);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        view.getClass();
        friendlyObstructionPurpose.getClass();
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.g;
            str.getClass();
            c3906y9.a(str, "addFriendlyView - childView: " + view + ", obstructionCode: " + friendlyObstructionPurpose);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view) {
        view.getClass();
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Map map) {
        View b;
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.g;
            str.getClass();
            c3906y9.a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.d.setFriendlyViews(map);
        C3906y9 c3906y92 = this.f;
        if (c3906y92 != null) {
            String str2 = this.g;
            str2.getClass();
            c3906y92.a(str2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        Fi fi = gestureDetectorOnGestureListenerC3889xi instanceof Fi ? (Fi) gestureDetectorOnGestureListenerC3889xi : null;
        if (fi == null) {
            return;
        }
        C3904y7 c3904y7 = this.e;
        View b2 = b();
        if (b2 == null || (b = b()) == null) {
            return;
        }
        c3904y7.a(b2, b, fi.getVISIBILITY_CHANGE_LISTENER(), this.c.getViewability(), true);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a() {
        C3906y9 c3906y9 = this.f;
        if (c3906y9 != null) {
            String str = this.g;
            str.getClass();
            c3906y9.a(str, "destroy");
        }
        if (b() != null) {
            C3906y9 c3906y92 = this.f;
            if (c3906y92 != null) {
                String str2 = this.g;
                str2.getClass();
                c3906y92.a(str2, "stopTrackingForVisibility");
            }
            C3904y7 c3904y7 = this.e;
            View b = b();
            if (b != null) {
                c3904y7.b(b);
            }
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }
}
