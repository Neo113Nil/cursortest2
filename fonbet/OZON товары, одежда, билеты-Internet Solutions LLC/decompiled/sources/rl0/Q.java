package rl0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final AppUpdateInfo.Factory f83634a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final T f83635b;

    public Q(@NotNull AppUpdateInfo.Factory appUpdateInfoFactory, @NotNull T timeProvider) {
        Intrinsics.checkNotNullParameter(appUpdateInfoFactory, "appUpdateInfoFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f83634a = appUpdateInfoFactory;
        this.f83635b = timeProvider;
    }
}
