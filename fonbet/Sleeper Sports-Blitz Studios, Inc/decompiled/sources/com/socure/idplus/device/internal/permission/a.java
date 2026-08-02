package com.socure.idplus.device.internal.permission;

import android.content.Context;
import androidx.core.content.ContextCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class a {
    public static boolean a(b permission, Context context) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(context, "context");
        int ordinal = permission.ordinal();
        if (ordinal == 0) {
            Intrinsics.checkNotNullParameter(context, "context");
            if ((context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) && (context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
                return false;
            }
        } else if (ordinal == 1) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                return false;
            }
        } else if (ordinal == 2) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") != 0) {
                return false;
            }
        } else {
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(context, "context");
            if (context == null || ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                return false;
            }
        }
        return true;
    }
}
