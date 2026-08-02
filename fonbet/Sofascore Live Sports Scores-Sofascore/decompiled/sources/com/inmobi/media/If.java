package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class If {
    public static C3886xf a(String str, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, boolean z, String str2, byte b, String str3) {
        str.getClass();
        Sf sf = Rf.a;
        sf.getClass();
        gestureDetectorOnGestureListenerC3889xi.getClass();
        AdSessionContext createHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(sf.b, gestureDetectorOnGestureListenerC3889xi, str2, str3);
        createHtmlAdSessionContext.getClass();
        ImpressionType impressionType = b == 1 ? ImpressionType.DEFINED_BY_JAVASCRIPT : b == 2 ? ImpressionType.UNSPECIFIED : b == 3 ? ImpressionType.LOADED : b == 4 ? ImpressionType.BEGIN_TO_RENDER : b == 5 ? ImpressionType.ONE_PIXEL : b == 6 ? ImpressionType.VIEWABLE : b == 7 ? ImpressionType.AUDIBLE : b == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        int hashCode = str.hashCode();
        if (hashCode == -284840886) {
            str.equals("unknown");
            return null;
        }
        if (hashCode == 93166550) {
            if (str.equals("audio")) {
                return new C3886xf("html_audio_ad", impressionType, createHtmlAdSessionContext, z);
            }
            return null;
        }
        if (hashCode == 112202875) {
            if (str.equals("video")) {
                return new C3886xf("html_video_ad", impressionType, createHtmlAdSessionContext, z);
            }
            return null;
        }
        if (hashCode == 1425678798 && str.equals("nonvideo")) {
            return new C3886xf("html_display_ad", impressionType, createHtmlAdSessionContext, false);
        }
        return null;
    }
}
