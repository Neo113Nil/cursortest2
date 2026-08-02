package io.sentry.android.replay.util;

import android.os.Build;
import gf.m;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {
    public static String a(h key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i5 = i.$EnumSwitchMapping$0[key.ordinal()];
        if (i5 == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i5 != 2) {
                throw new m();
            }
            str = Build.SOC_MANUFACTURER;
        }
        Intrinsics.checkNotNull(str);
        return str;
    }
}
