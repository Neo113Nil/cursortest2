package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.adsbynimbus.adsession.AdSession;
import com.iab.omid.library.adsbynimbus.adsession.AdSessionConfiguration;
import com.iab.omid.library.adsbynimbus.adsession.AdSessionContext;
import com.iab.omid.library.adsbynimbus.adsession.CreativeType;
import com.iab.omid.library.adsbynimbus.adsession.ImpressionType;
import com.iab.omid.library.adsbynimbus.adsession.Owner;
import com.iab.omid.library.adsbynimbus.adsession.Partner;
import com.iab.omid.library.adsbynimbus.adsession.media.MediaEvents;
import com.sofascore.results.R;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class mjd extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CreativeType j;
    public final /* synthetic */ njd k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjd(njd njdVar, CreativeType creativeType) {
        super(0);
        this.i = 0;
        this.k = njdVar;
        this.j = creativeType;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AdSessionContext createNativeAdSessionContext;
        int i = this.i;
        njd njdVar = this.k;
        CreativeType creativeType = this.j;
        switch (i) {
            case 0:
                Object value = njdVar.d.getValue();
                value.getClass();
                AdSessionConfiguration adSessionConfiguration = (AdSessionConfiguration) value;
                if (creativeType == CreativeType.HTML_DISPLAY) {
                    Partner partner = std.a;
                    View f = njdVar.b.f();
                    WebView webView = f != null ? (WebView) f.findViewById(R.id.nimbus_web_view) : null;
                    webView.getClass();
                    createNativeAdSessionContext = AdSessionContext.createHtmlAdSessionContext(partner, webView, null, "");
                } else {
                    createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(std.a, (String) njd.i.getValue(), njdVar.a, null, "");
                }
                return AdSession.createAdSession(adSessionConfiguration, createNativeAdSessionContext);
            case 1:
                return AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.ONE_PIXEL, Owner.NATIVE, njdVar.c, false);
            default:
                if (creativeType == CreativeType.VIDEO) {
                    return MediaEvents.createMediaEvents(njdVar.a());
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mjd(CreativeType creativeType, njd njdVar, int i) {
        super(0);
        this.i = i;
        this.j = creativeType;
        this.k = njdVar;
    }
}
