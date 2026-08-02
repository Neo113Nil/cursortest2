package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.os.Build;
import io.sentry.J0;
import io.sentry.android.core.I;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I f67196a = new I(J0.e());

    @SuppressLint({"NewApi"})
    public final void a(@NotNull ContentProvider contentProvider) {
        this.f67196a.getClass();
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = contentProvider.getCallingPackage();
            String packageName = contentProvider.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }
}
