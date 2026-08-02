package defpackage;

import com.blaze.blazesdk.ads.ima.models.b;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.props.AnalyticsPropsAd;
import com.blaze.blazesdk.players.models.InterfaceC1358b;
import com.blaze.blazesdk.players.models.a;
import com.blaze.blazesdk.players.models.c;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class ccm {
    public static final AnalyticsPropsAd a(x8m x8mVar, String str, String str2, String str3, String str4, Double d, Boolean bool, Double d2, String str5) {
        Map<String, String> map;
        Map<String, String> storyPageExtraInfoForAnalytics$blazesdk_release;
        x8mVar.getClass();
        String str6 = x8mVar.f;
        String str7 = x8mVar.k;
        String str8 = x8mVar.l;
        String str9 = x8mVar.m;
        String str10 = x8mVar.n;
        String str11 = x8mVar.o;
        String str12 = x8mVar.p;
        ContentType contentType = x8mVar.h;
        c cVar = x8mVar.s;
        Map<String, String> map2 = null;
        InterfaceC1358b interfaceC1358b = cVar != null ? cVar.c : null;
        a aVar = interfaceC1358b instanceof a ? (a) interfaceC1358b : null;
        b bVar = aVar != null ? aVar.a : null;
        String str13 = bVar != null ? bVar.a : null;
        BlazeContentExtraInfo blazeContentExtraInfo = x8mVar.j;
        if (blazeContentExtraInfo == null || (map = blazeContentExtraInfo.getExtraInfoForAnalytics$blazesdk_release()) == null || !x5m.f()) {
            map = null;
        }
        BlazeContentExtraInfo blazeContentExtraInfo2 = x8mVar.j;
        if (blazeContentExtraInfo2 != null && (storyPageExtraInfoForAnalytics$blazesdk_release = blazeContentExtraInfo2.getStoryPageExtraInfoForAnalytics$blazesdk_release()) != null && x5m.f()) {
            map2 = storyPageExtraInfoForAnalytics$blazesdk_release;
        }
        return new AnalyticsPropsAd(str6, str7, str8, str9, str10, d, str5, contentType, map, map2, x8mVar.i, null, null, null, null, null, null, null, null, null, null, null, str, str2, str3, str4, bool, d2, str13, str11, str12, null, -2143291392, null);
    }

    public static /* synthetic */ AnalyticsPropsAd createImaProps$default(x8m x8mVar, String str, String str2, String str3, String str4, Double d, Boolean bool, Double d2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            d = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            d2 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        return a(x8mVar, str, str2, str3, str4, d, bool, d2, str5);
    }
}
