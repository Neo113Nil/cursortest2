package com.vk.id.common.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "", "getInternalVkIdIsDarkTheme", "(Landroid/content/Context;)Z", "getInternalVkIdIsDarkTheme$annotations", "(Landroid/content/Context;)V", "internalVkIdIsDarkTheme", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IsDarkThemeKt {
    public static final boolean getInternalVkIdIsDarkTheme(@NotNull Context context) {
        Configuration configuration;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        return (resources == null || (configuration = resources.getConfiguration()) == null || (configuration.uiMode & 48) != 32) ? false : true;
    }
}
