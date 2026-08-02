package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import defpackage.fc6;
import defpackage.ljg;
import defpackage.lm5;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3858wd {
    public final C3884xd a;
    public long b;
    public String c;
    public String d;
    public final C3468hb e;

    public C3858wd(C3884xd c3884xd) {
        c3884xd.getClass();
        this.a = c3884xd;
        C3806ud c3806ud = new C3806ud(this);
        C3832vd c3832vd = new C3832vd(this);
        this.e = new C3468hb(c3884xd.a, new C3494ib(false, c3884xd.d.i, c3884xd.b.a.b.getCctEnabled(), 16), c3806ud, c3832vd, c3884xd.d, c3884xd.g, 128);
    }

    public final void a(Intent intent) {
        C3884xd c3884xd = this.a;
        InterfaceC3880x9 interfaceC3880x9 = c3884xd.g;
        if (interfaceC3880x9 != null) {
            G g = c3884xd.b;
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g.e + ", placementId=" + g.a.a.a);
        }
        intent.putExtra("creativeId", this.a.b.e);
        intent.putExtra("impressionId", this.a.b.m.b);
        intent.putExtra("placementId", this.a.b.a.a.a);
        intent.putExtra("supportLockScreen", this.a.c);
        Context context = AbstractC3424fj.a;
        Context context2 = this.a.a;
        context2.getClass();
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context2.startActivity(intent);
        InterfaceC3880x9 interfaceC3880x92 = this.a.g;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }

    public final void b(String str, String str2) {
        str.getClass();
        InterfaceC3880x9 interfaceC3880x9 = this.a.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", fc6.n("handleNativeAssetClickUrl: url=", str, ", fallbackUrl=", str2));
        }
        this.c = str;
        this.d = str2;
        C3884xd c3884xd = this.a;
        boolean z = c3884xd.b.a.a.g;
        InterfaceC3880x9 interfaceC3880x92 = c3884xd.g;
        if (z) {
            if (interfaceC3880x92 != null) {
                ((C3906y9) interfaceC3880x92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            InterfaceC3613n1 interfaceC3613n1 = this.a.f;
            lm5 lm5Var = lm5.a;
            lm5Var.getClass();
            ((AbstractC3456h) interfaceC3613n1).a(lm5Var);
            return;
        }
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        InterfaceC3613n1 interfaceC3613n12 = this.a.f;
        lm5 lm5Var2 = lm5.a;
        lm5Var2.getClass();
        ((AbstractC3456h) interfaceC3613n12).a(lm5Var2);
        a();
    }

    public final void b() {
        C3884xd c3884xd = this.a;
        InterfaceC3880x9 interfaceC3880x9 = c3884xd.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", com.appsflyer.internal.i.j("takeAction called, isLockScreen=", c3884xd.b.a.a.g));
        }
        if (this.a.b.a.a.g) {
            a();
        }
    }

    public final void a(String str, String str2) {
        InterfaceC3880x9 interfaceC3880x9 = this.a.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        C3442gb a = C3468hb.a(this.e, "nativeOpen", (String) null, str, (C3571lb) null, 24);
        InterfaceC3880x9 interfaceC3880x92 = this.a.g;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).a("PublisherViewClickHandler", ljg.j(a.a, "processOpenRequest result: "));
        }
        if (a.a == 1) {
            InterfaceC3880x9 interfaceC3880x93 = this.a.g;
            if (interfaceC3880x93 != null) {
                ((C3906y9) interfaceC3880x93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        C3884xd c3884xd = this.a;
        if (str2 != null) {
            InterfaceC3880x9 interfaceC3880x94 = c3884xd.g;
            if (interfaceC3880x94 != null) {
                ((C3906y9) interfaceC3880x94).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: ".concat(str2));
            }
            a(str2, null);
            return;
        }
        InterfaceC3880x9 interfaceC3880x95 = c3884xd.g;
        if (interfaceC3880x95 != null) {
            ((C3906y9) interfaceC3880x95).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        InterfaceC3880x9 interfaceC3880x9 = this.a.g;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + elapsedRealtime + ", lastClickedAssetUrl=" + this.c);
        }
        String str = this.c;
        if (str != null) {
            a(str, this.d);
        }
    }
}
