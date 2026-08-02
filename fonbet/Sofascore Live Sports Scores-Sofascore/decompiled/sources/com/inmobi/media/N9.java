package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.joa;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N9 extends AbstractC3429fo {
    public final C3455go d;
    public final C3904y7 e;
    public final InterfaceC3880x9 f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, C3455go c3455go, C3904y7 c3904y7, InterfaceC3880x9 interfaceC3880x9) {
        super(gestureDetectorOnGestureListenerC3889xi);
        gestureDetectorOnGestureListenerC3889xi.getClass();
        c3455go.getClass();
        c3904y7.getClass();
        this.d = c3455go;
        this.e = c3904y7;
        this.f = interfaceC3880x9;
        this.g = "N9";
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Map map) {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View b = this.d.b();
        if (b != null) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                String str2 = this.g;
                str2.getClass();
                ((C3906y9) interfaceC3880x92).a(str2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewability = this.c.getViewability();
            GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
            gestureDetectorOnGestureListenerC3889xi.getClass();
            gestureDetectorOnGestureListenerC3889xi.setFriendlyViews(map);
            C3904y7 c3904y7 = this.e;
            c3904y7.getClass();
            viewability.getClass();
            InterfaceC3880x9 interfaceC3880x93 = c3904y7.f;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c3904y7.a == 0) {
                InterfaceC3880x9 interfaceC3880x94 = c3904y7.f;
                if (interfaceC3880x94 != null) {
                    ((C3906y9) interfaceC3880x94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (Intrinsics.c(c3904y7.b, "video") || Intrinsics.c(c3904y7.b, "audio")) {
                InterfaceC3880x9 interfaceC3880x95 = c3904y7.f;
                if (interfaceC3880x95 != null) {
                    ((C3906y9) interfaceC3880x95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                R8 a = c3904y7.a(c3904y7.a, viewability);
                InterfaceC3880x9 interfaceC3880x96 = c3904y7.f;
                if (interfaceC3880x96 != null) {
                    ((C3906y9) interfaceC3880x96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i = c3904y7.d;
                int i2 = c3904y7.c;
                P8 p8 = (P8) a.a.get(b);
                if (!Intrinsics.c(p8 != null ? p8.a : null, b)) {
                    a.a.remove(b);
                    a.b.remove(b);
                    a.c.a(b);
                    a.a.put(b, new P8(b, i, i2));
                    C3310b8 c3310b8 = a.c;
                    c3310b8.getClass();
                    c3310b8.a(b, b, b, i);
                }
            }
            this.e.a(b, b, gestureDetectorOnGestureListenerC3889xi.getVISIBILITY_CHANGE_LISTENER(), viewability, false);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View c() {
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void d() {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "stopTrackingForImpression");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.d.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        view.getClass();
        friendlyObstructionPurpose.getClass();
        boolean z = view instanceof Fi;
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (z) {
            if (interfaceC3880x9 != null) {
                String str = this.g;
                str.getClass();
                ((C3906y9) interfaceC3880x9).a(str, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            String str2 = this.g;
            str2.getClass();
            ((C3906y9) interfaceC3880x9).a(str2, "Adding friendly view: " + view.getClass().getSimpleName() + " with obstruction code: " + friendlyObstructionPurpose);
        }
        this.d.a(view, friendlyObstructionPurpose);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view) {
        view.getClass();
        if (view instanceof Fi) {
            return;
        }
        this.d.a(view);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Context context, byte b) {
        context.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "onActivityStateChanged - state - " + ((int) b));
        }
        try {
            if (b == 0) {
                this.e.a();
            } else if (b == 1) {
                C3904y7 c3904y7 = this.e;
                InterfaceC3880x9 interfaceC3880x92 = c3904y7.f;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).c("HtmlAdTracker", "onActivityStopped");
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
                }
            } else if (b == 2) {
                C3904y7 c3904y72 = this.e;
                InterfaceC3880x9 interfaceC3880x93 = c3904y72.f;
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                this.g.getClass();
            }
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x94 = this.f;
            if (interfaceC3880x94 != null) {
                String str2 = this.g;
                str2.getClass();
                ((C3906y9) interfaceC3880x94).b(str2, "Exception in onActivityStateChanged with message : " + e.getMessage());
            }
            joa joaVar = AbstractC3286aa.a;
            AbstractC3286aa.a(new Q2(e));
        } finally {
            this.d.getClass();
            context.getClass();
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            String str = this.g;
            str.getClass();
            ((C3906y9) interfaceC3880x9).a(str, "destroy");
        }
        View b = this.d.b();
        if (b != null) {
            this.e.a(b);
            this.e.b(b);
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.d.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }
}
