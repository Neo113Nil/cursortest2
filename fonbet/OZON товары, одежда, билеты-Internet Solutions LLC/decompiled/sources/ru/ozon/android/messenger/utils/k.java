package ru.ozon.android.messenger.utils;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {
    @NotNull
    public static final j a(SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter("PREFERENCES_HIDE_READ_KEY", "key");
        return new j(sharedPreferences);
    }
}
