package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface fsl extends t {
    static /* synthetic */ Object getVideos$default(fsl fslVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, boolean z, boolean z2, String str3, String str4, Map map, rq3 rq3Var, int i, Object obj) {
        if (obj == null) {
            return ((qom) fslVar).a(rq3Var, blazeDataSourceType, str, str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : map, (i & 8) != 0 ? false : z, z2);
        }
        a70.m("Super calls with default arguments not supported in this target, function: getVideos");
        return null;
    }

    static boolean hasDataSourceChanged$default(fsl fslVar, String str, BlazeDataSourceType blazeDataSourceType, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: hasDataSourceChanged");
            return false;
        }
        mom momVar = null;
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        ((qom) fslVar).getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        str2.getClass();
        str.getClass();
        try {
            momVar = (mom) qom.j.get(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return !Intrinsics.c(momVar, new mom(blazeDataSourceType, z, str2, str3, str4));
    }
}
