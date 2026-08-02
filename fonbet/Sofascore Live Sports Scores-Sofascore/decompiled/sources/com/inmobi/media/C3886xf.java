package com.inmobi.media;

import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import defpackage.joa;
import defpackage.lnb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3886xf implements InterfaceC3432g1 {
    public final String a;
    public final ImpressionType b;
    public AdSessionContext c;
    public final boolean d;
    public byte e;
    public AdSession f;

    public C3886xf(String str, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z) {
        str.getClass();
        impressionType.getClass();
        this.a = str;
        this.b = impressionType;
        this.c = adSessionContext;
        this.d = z;
    }

    public static boolean b(byte b) {
        if (b == 1) {
            return true;
        }
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(new Exception(lnb.k(b, "Omid AdSession State Error currentState :: ", ", expectedState :: 1"))));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(WebView webView, Map map) {
        AdSession adSession;
        AdSession adSession2;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        webView.getClass();
        if (this.f == null) {
            boolean z = this.d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            String str = this.a;
            switch (str.hashCode()) {
                case -2139264536:
                    if (str.equals("native_display_ad")) {
                        owner2 = Owner.NATIVE;
                        owner = Owner.NONE;
                        creativeType = CreativeType.NATIVE_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1329992236:
                    if (str.equals("html_display_ad")) {
                        owner = Owner.NONE;
                        creativeType = CreativeType.HTML_DISPLAY;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case -1191784049:
                    if (str.equals("native_video_ad")) {
                        owner2 = Owner.NATIVE;
                        creativeType2 = CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 363190080:
                    if (str.equals("html_audio_ad")) {
                        creativeType2 = CreativeType.AUDIO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                case 538665083:
                    if (str.equals("html_video_ad")) {
                        creativeType2 = CreativeType.VIDEO;
                        creativeType = creativeType2;
                        owner = owner2;
                        break;
                    }
                    creativeType = creativeType3;
                    owner = null;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.b, owner2, owner, z), this.c);
            createAdSession.getClass();
            this.f = createAdSession;
            if (createAdSession != null) {
                if (Intrinsics.c(this.a, "native_video_ad")) {
                    MediaEvents.createMediaEvents(createAdSession);
                    AdEvents.createAdEvents(createAdSession);
                } else {
                    AdEvents.createAdEvents(createAdSession);
                }
                this.e = (byte) 1;
            }
        }
        webView.getClass();
        if (b(this.e) && (adSession2 = this.f) != null) {
            adSession2.registerAdView(webView);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) entry.getKey();
                FriendlyObstructionPurpose friendlyObstructionPurpose = (FriendlyObstructionPurpose) entry.getValue();
                view.getClass();
                friendlyObstructionPurpose.getClass();
                if (a(this.e) && (adSession = this.f) != null) {
                    adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
                }
            }
        }
        if (b(this.e)) {
            AdSession adSession3 = this.f;
            if (adSession3 != null) {
                adSession3.start();
            }
            this.e = (byte) 2;
        }
    }

    public static boolean a(byte b) {
        if (b > 0) {
            return true;
        }
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(new Exception(lnb.k(b, "Omid AdSession State Error currentState :: ", ", expectedState :: 1"))));
        return false;
    }
}
