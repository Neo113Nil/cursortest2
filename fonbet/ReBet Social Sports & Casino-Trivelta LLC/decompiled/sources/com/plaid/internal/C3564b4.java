package com.plaid.internal;

import com.plaid.internal.C3556a6;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.plaid.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3564b4 {
    @NotNull
    public static final String a(@NotNull String key, @NotNull String str, @NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(str, "default");
        String str2 = (String) map.get(key);
        if (str2 != null) {
            return str2;
        }
        C3556a6.a.b(C3556a6.f39823a, "Missing field: " + key);
        return str;
    }
}
