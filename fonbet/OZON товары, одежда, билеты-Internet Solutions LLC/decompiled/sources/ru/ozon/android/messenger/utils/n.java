package ru.ozon.android.messenger.utils;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class n {
    @NotNull
    public static final String a() {
        return P4.f.b("toString(...)");
    }

    @NotNull
    public static final String b(@NotNull String str, String str2, @NotNull String currentNamespace) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(currentNamespace, "currentNamespace");
        Uri parse = Uri.parse(str);
        String[] strArr = {"CHAT", "SC_CHAT", "CHAT_SELECT", "CHAT_TRAVEL"};
        for (int i11 = 0; i11 < 4; i11++) {
            if (Intrinsics.d(strArr[i11], currentNamespace)) {
                return str;
            }
        }
        return (new File(str).exists() || !parse.isRelative()) ? str : U7.d.e(str2, str);
    }
}
