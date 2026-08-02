package defpackage;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class xd0 {
    public static final HashSet a = x9h.c(200, 202);
    public static final HashSet b = x9h.c(Integer.valueOf(PglCryptUtils.COMPRESS_FAILED), Integer.valueOf(PglCryptUtils.BASE64_FAILED), Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS));
    public static vd0 c;
    public static List d;
    public static int e;

    public static List a() {
        List list = d;
        if (list != null) {
            return list;
        }
        Intrinsics.i("transformedEvents");
        throw null;
    }
}
