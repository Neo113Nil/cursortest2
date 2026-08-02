package th0;

import android.content.pm.PackageInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: th0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9875a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final PackageInfo f99528a;

    public C9875a(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
        this.f99528a = packageInfo;
    }

    public final boolean a() {
        PackageInfo packageInfo = this.f99528a;
        return packageInfo.firstInstallTime == packageInfo.lastUpdateTime;
    }
}
