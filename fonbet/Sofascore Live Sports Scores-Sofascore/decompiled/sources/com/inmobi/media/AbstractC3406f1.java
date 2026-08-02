package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import defpackage.dmi;
import defpackage.ku3;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.f1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3406f1 implements InterfaceC3382e3, InterfaceC3530jm {
    public static final String f = "f1";
    public final ku3 a;
    public final InterfaceC3880x9 b;
    public AdSession c;
    public MediaEvents d;
    public AdEvents e;

    public AbstractC3406f1(ku3 ku3Var, InterfaceC3880x9 interfaceC3880x9) {
        ku3Var.getClass();
        this.a = ku3Var;
        this.b = interfaceC3880x9;
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        adSessionConfiguration.getClass();
        adSessionContext.getClass();
        AdSession adSession = this.c;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (adSession != null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(f, "initAdSession");
        }
        try {
            this.c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a(f, "AdSession creation failed. " + e);
            }
        }
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z);

    public final void b() {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(f, "initAdEvents");
        }
        try {
            this.e = AdEvents.createAdEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a(f, dmi.q("Failure initAdEvents: ", Log.getStackTraceString(e)));
            }
        }
    }

    public final void c() {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = MediaEvents.createMediaEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC3880x9 interfaceC3880x92 = this.b;
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a(f, dmi.q("Failure initMediaAdEvents: ", Log.getStackTraceString(e)));
            }
        }
    }

    public void a(boolean z) {
    }

    public void a(AbstractC3712qm abstractC3712qm) {
        abstractC3712qm.getClass();
    }

    public final void a(InteractionType interactionType) {
        interactionType.getClass();
        MediaEvents mediaEvents = this.d;
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (mediaEvents == null) {
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a(f, "Failed to register adUserInteractionEvent with type: " + interactionType);
                return;
            }
            return;
        }
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a(f, "trackAdUserInteractionEvent with type: " + interactionType);
        }
        X4.a(this.a, new C3380e1(this, interactionType, null));
    }

    public void a() {
    }
}
