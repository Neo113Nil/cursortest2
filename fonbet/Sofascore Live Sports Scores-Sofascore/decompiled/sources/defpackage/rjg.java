package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.smartadserver1.adsession.AdEvents;
import com.iab.omid.library.smartadserver1.adsession.AdSession;
import com.iab.omid.library.smartadserver1.adsession.AdSessionConfiguration;
import com.iab.omid.library.smartadserver1.adsession.AdSessionContext;
import com.iab.omid.library.smartadserver1.adsession.CreativeType;
import com.iab.omid.library.smartadserver1.adsession.ImpressionType;
import com.iab.omid.library.smartadserver1.adsession.Owner;
import com.iab.omid.library.smartadserver1.adsession.Partner;
import com.iab.omid.library.smartadserver1.adsession.VerificationScriptResource;
import com.iab.omid.library.smartadserver1.adsession.media.MediaEvents;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rjg {
    public AdSession a;
    public final AdEvents b;
    public final MediaEvents c;
    public final View d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ sjg f;

    public rjg(sjg sjgVar, Partner partner, View view, List list, boolean z, boolean z2) {
        CreativeType creativeType;
        AdSessionContext createNativeAdSessionContext;
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        this.f = sjgVar;
        this.d = view;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                lkg lkgVar = (lkg) it.next();
                String str = lkgVar.d;
                String str2 = lkgVar.a;
                Iterator it2 = lkgVar.b.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (it2.hasNext()) {
                    nkg nkgVar = (nkg) it2.next();
                    int i = nkgVar.a;
                    String str3 = nkgVar.b;
                    if (i == 1) {
                        if (str2 != null) {
                            try {
                                if (str2.length() != 0 && str != null && str.length() != 0) {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(str2, new URL(str3), str);
                                    this.e.add(createVerificationScriptResourceWithoutParameters);
                                    z3 = true;
                                }
                            } catch (MalformedURLException unused) {
                            }
                        }
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(new URL(str3));
                        this.e.add(createVerificationScriptResourceWithoutParameters);
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                }
                if (!z3 && z4) {
                    Iterator it3 = lkgVar.c.iterator();
                    while (it3.hasNext()) {
                        mkg mkgVar = (mkg) it3.next();
                        if (sjgVar.d != null) {
                            String str4 = mkgVar.a;
                            List list2 = hig.a;
                            if (str4.equals("verificationNotExecuted")) {
                                sjgVar.d.J(mkgVar.b.replace("%5DREASON%5B", "2"));
                            }
                        }
                    }
                }
            }
        }
        ImpressionType impressionType = z2 ? ImpressionType.LOADED : ImpressionType.BEGIN_TO_RENDER;
        Owner owner = z ? Owner.NATIVE : Owner.NONE;
        if (view instanceof WebView) {
            creativeType = CreativeType.HTML_DISPLAY;
            createNativeAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, (WebView) view, null, "");
        } else {
            creativeType = z ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY;
            createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(partner, sjg.e(), this.e, null, "");
        }
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, Owner.NATIVE, owner, false), createNativeAdSessionContext);
        this.a = createAdSession;
        this.b = AdEvents.createAdEvents(createAdSession);
        if (creativeType == CreativeType.VIDEO) {
            this.c = MediaEvents.createMediaEvents(this.a);
        }
        this.a.registerAdView(view);
        this.a.start();
    }

    public final void a(int i, View view) {
        hkg.T().post(new tc0(this, i, view, 4));
    }

    public final void b(boolean z) {
        if (this.c != null) {
            hkg.T().post(new wh0(this, z, 3));
        }
    }

    public final synchronized void c() {
        this.f.e.remove(this.d);
        if (this.a != null) {
            hkg.T().post(new ojg(this, 6));
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
