package io.sentry.android.core.internal.util;

import android.content.ContentProvider;
import io.sentry.U0;
import io.sentry.android.core.C4683i0;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C4683i0 f51135a;

    public m() {
        this(new C4683i0(U0.e()));
    }

    public void a(ContentProvider contentProvider) {
        int d10 = this.f51135a.d();
        if (d10 < 26 || d10 > 28) {
            return;
        }
        String callingPackage = contentProvider.getCallingPackage();
        String packageName = contentProvider.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    public m(C4683i0 c4683i0) {
        this.f51135a = c4683i0;
    }
}
