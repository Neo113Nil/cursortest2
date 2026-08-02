package defpackage;

import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.C4364ve;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wsl implements q7a {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    @Override // defpackage.q7a
    public final d2g intercept(p7a p7aVar) {
        String str;
        epf epfVar = (epf) p7aVar;
        qzf qzfVar = epfVar.e;
        qzfVar.getClass();
        dba dbaVar = (dba) qzfVar.c(duf.a.getOrCreateKotlinClass(dba.class));
        BlazeNetworkRequest blazeNetworkRequest = dbaVar != null ? (BlazeNetworkRequest) dbaVar.c.getAnnotation(BlazeNetworkRequest.class) : null;
        if (blazeNetworkRequest == null) {
            return epfVar.b(qzfVar);
        }
        il9 g = qzfVar.a.g();
        if (blazeNetworkRequest.includeApiKey()) {
            g.a("ApiKey", BlazeSDK.INSTANCE.getApiKey$blazesdk_release());
        }
        if (blazeNetworkRequest.includeClientPlatform()) {
            g.a("clientPlatform", U3.d);
        }
        if (blazeNetworkRequest.includeExperiments()) {
            wdm wdmVar = wdm.a;
            String str2 = (String) td4.t0(g.a, new t5m(null));
            if (str2 != null) {
                g.a(C4364ve.d, str2);
            }
        }
        if (blazeNetworkRequest.includePreferredLanguage()) {
            String preferredLanguage$blazesdk_release = BlazeSDK.INSTANCE.getPreferredLanguage$blazesdk_release();
            if (preferredLanguage$blazesdk_release == null) {
                preferredLanguage$blazesdk_release = C.LANGUAGE_UNDETERMINED;
            }
            g.a("PreferredLanguage", preferredLanguage$blazesdk_release);
        }
        if (blazeNetworkRequest.includeGeo() && (str = wba.e) != null) {
            g.a("Geo", str);
        }
        if (blazeNetworkRequest.contentType() != BlazeNetworkRequest.ContentTypeValues.NONE) {
            g.a("contentType", blazeNetworkRequest.contentType().getRawVal());
        }
        pzf b = qzfVar.b();
        b.a = g.c();
        return epfVar.b(new qzf(b));
    }
}
