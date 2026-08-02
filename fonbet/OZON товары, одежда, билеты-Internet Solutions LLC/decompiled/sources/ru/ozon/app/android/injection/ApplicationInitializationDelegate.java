package ru.ozon.app.android.injection;

import Xh0.c;
import Yh0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/injection/ApplicationInitializationDelegate;", "", "<init>", "()V", "", "trackingApplicationInit", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationInitializationDelegate {

    @NotNull
    public static final ApplicationInitializationDelegate INSTANCE = new ApplicationInitializationDelegate();

    private ApplicationInitializationDelegate() {
    }

    public final void trackingApplicationInit() {
        int i11 = c.f34471a;
        Intrinsics.checkNotNullParameter("Application init", "stepName");
        f.c("Application init");
    }
}
