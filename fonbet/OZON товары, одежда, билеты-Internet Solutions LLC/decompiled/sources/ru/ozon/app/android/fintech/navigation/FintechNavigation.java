package ru.ozon.app.android.fintech.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fintech/navigation/FintechNavigation;", "", "<init>", "()V", "Landroid/net/Uri;", "bankTabModal", "()Landroid/net/Uri;", "bankTabFull", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechNavigation {

    @NotNull
    public static final FintechNavigation INSTANCE = new FintechNavigation();

    private FintechNavigation() {
    }

    @NotNull
    public final Uri bankTabFull() {
        Uri build = new Uri.Builder().scheme("ozon").authority("finance").path("banklanding").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @NotNull
    public final Uri bankTabModal() {
        Uri build = new Uri.Builder().scheme("ozon").authority("modal").path("banklanding").build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
