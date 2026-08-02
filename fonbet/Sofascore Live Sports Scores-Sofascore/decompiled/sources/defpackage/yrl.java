package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface yrl {
    static /* synthetic */ Object fetchStories$default(yrl yrlVar, BlazeDataSourceType blazeDataSourceType, String str, Map map, String str2, boolean z, boolean z2, String str3, String str4, rq3 rq3Var, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: fetchStories");
            return null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        return ((StoriesRepositoryImpl) yrlVar).a(rq3Var, blazeDataSourceType, str, str2, str3, str4, map, z, z2);
    }

    static boolean hasDataSourceChanged$default(yrl yrlVar, String str, BlazeDataSourceType blazeDataSourceType, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: hasDataSourceChanged");
            return false;
        }
        tvl tvlVar = null;
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        ((StoriesRepositoryImpl) yrlVar).getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        str2.getClass();
        str.getClass();
        try {
            tvlVar = (tvl) StoriesRepositoryImpl.k.get(str);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
        return !Intrinsics.c(tvlVar, new tvl(blazeDataSourceType, z, str2, str3, str4));
    }
}
