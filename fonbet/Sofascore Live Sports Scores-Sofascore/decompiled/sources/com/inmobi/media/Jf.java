package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jf extends AbstractC3403eo {
    public static final /* synthetic */ int g = 0;
    public final AbstractC3429fo d;
    public InterfaceC3432g1 e;
    public final InterfaceC3880x9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jf(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, AbstractC3429fo abstractC3429fo, InterfaceC3432g1 interfaceC3432g1, InterfaceC3880x9 interfaceC3880x9) {
        super(gestureDetectorOnGestureListenerC3889xi);
        gestureDetectorOnGestureListenerC3889xi.getClass();
        abstractC3429fo.getClass();
        this.d = abstractC3429fo;
        this.e = interfaceC3432g1;
        this.f = interfaceC3880x9;
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Map map) {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("Jf", "startTrackingForImpression");
        }
        try {
            try {
                if (this.c.getViewability().getOmidConfig().isOmidEnabled()) {
                    Rf.a.getClass();
                    if (Omid.isActive()) {
                        View b = this.d.b();
                        WebView webView = b instanceof WebView ? (WebView) b : null;
                        if (webView != null) {
                            InterfaceC3880x9 interfaceC3880x92 = this.f;
                            if (interfaceC3880x92 != null) {
                                ((C3906y9) interfaceC3880x92).a("Jf", "creating OMSDK session");
                            }
                            InterfaceC3432g1 interfaceC3432g1 = this.e;
                            if (interfaceC3432g1 != null) {
                                ((C3886xf) interfaceC3432g1).a(webView, map);
                            }
                        }
                    }
                }
                this.d.a(map);
            } catch (Exception e) {
                InterfaceC3880x9 interfaceC3880x93 = this.f;
                if (interfaceC3880x93 != null) {
                    ((C3906y9) interfaceC3880x93).b("Jf", "Exception in startTrackingForImpression with message : " + e.getMessage());
                }
                this.d.a(map);
            }
        } catch (Throwable th) {
            this.d.a(map);
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final View c() {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("Jf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void d() {
        try {
            try {
                InterfaceC3880x9 interfaceC3880x9 = this.f;
                if (interfaceC3880x9 != null) {
                    ((C3906y9) interfaceC3880x9).a("Jf", "stopTrackingForImpression");
                }
                InterfaceC3432g1 interfaceC3432g1 = this.e;
                if (interfaceC3432g1 != null) {
                    C3886xf c3886xf = (C3886xf) interfaceC3432g1;
                    AdSession adSession = c3886xf.f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c3886xf.f = null;
                    c3886xf.e = (byte) 3;
                    c3886xf.c = null;
                }
                this.d.d();
            } catch (Exception e) {
                InterfaceC3880x9 interfaceC3880x92 = this.f;
                if (interfaceC3880x92 != null) {
                    ((C3906y9) interfaceC3880x92).b("Jf", "Exception in stopTrackingForImpression with message : " + e.getMessage());
                }
                this.d.d();
            }
        } catch (Throwable th) {
            this.d.d();
            throw th;
        }
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view) {
        AdSession adSession;
        view.getClass();
        InterfaceC3432g1 interfaceC3432g1 = this.e;
        if (interfaceC3432g1 != null) {
            C3886xf c3886xf = (C3886xf) interfaceC3432g1;
            view.getClass();
            if (C3886xf.a(c3886xf.e) && (adSession = c3886xf.f) != null) {
                adSession.removeFriendlyObstruction(view);
            }
        }
        this.d.a(view);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession;
        view.getClass();
        friendlyObstructionPurpose.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("Jf", "addFriendlyView with obstruction code: " + friendlyObstructionPurpose);
        }
        InterfaceC3432g1 interfaceC3432g1 = this.e;
        if (interfaceC3432g1 != null) {
            C3886xf c3886xf = (C3886xf) interfaceC3432g1;
            view.getClass();
            friendlyObstructionPurpose.getClass();
            if (C3886xf.a(c3886xf.e) && (adSession = c3886xf.f) != null) {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
            }
        }
        this.d.a(view, friendlyObstructionPurpose);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a(Context context, byte b) {
        context.getClass();
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.AbstractC3429fo
    public final void a() {
        InterfaceC3880x9 interfaceC3880x9 = this.f;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).c("Jf", "destroy");
        }
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.e = null;
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x92 = this.f;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("Jf", "Exception in destroy with message", e);
            }
        } finally {
            this.d.a();
        }
    }
}
