package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class AFe1ySDK {
    public static boolean values(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int valueOf = AFc1tSDK.valueOf(str);
        int valueOf2 = AFc1tSDK.valueOf(str2);
        Pair<Integer, Integer> AFInAppEventType = AFe1zSDK.AFInAppEventType(str2);
        Pair<Integer, Integer> AFInAppEventParameterName = AFe1zSDK.AFInAppEventParameterName(str2);
        return (valueOf2 == -1 || AFInAppEventType != null) ? AFInAppEventParameterName != null ? AFInAppEventParameterName.e().intValue() <= valueOf && valueOf <= AFInAppEventParameterName.f().intValue() : AFInAppEventType != null && AFInAppEventType.e().intValue() <= valueOf && valueOf <= AFInAppEventType.f().intValue() : valueOf2 == valueOf;
    }
}
