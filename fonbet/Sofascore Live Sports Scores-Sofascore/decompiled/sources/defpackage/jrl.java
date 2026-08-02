package defpackage;

import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface jrl extends t {
    static /* synthetic */ Object getMomentsAndDontCache$default(jrl jrlVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, boolean z, boolean z2, String str3, String str4, Map map, rq3 rq3Var, int i, Object obj) {
        if (obj == null) {
            return ((gum) jrlVar).b(blazeDataSourceType, str, str2, z2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : map, rq3Var);
        }
        a70.m("Super calls with default arguments not supported in this target, function: getMomentsAndDontCache");
        return null;
    }

    static /* synthetic */ Object getMomentsAndSaveToCache$default(jrl jrlVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, boolean z, boolean z2, String str3, String str4, Map map, boolean z3, rq3 rq3Var, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getMomentsAndSaveToCache");
            return null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            map = null;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            z3 = false;
        }
        return ((gum) jrlVar).c(blazeDataSourceType, str, str2, z, z2, str3, str4, map, z3, rq3Var);
    }

    static boolean hasDataSourceChanged$default(jrl jrlVar, String str, BlazeDataSourceType blazeDataSourceType, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: hasDataSourceChanged");
            return false;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        ((gum) jrlVar).getClass();
        str.getClass();
        blazeDataSourceType.getClass();
        str2.getClass();
        return !Intrinsics.c(gum.o(str), new h9m(blazeDataSourceType, z, str2, str3, str4));
    }
}
