package ru.ozon.app.android.tabbar.domain;

import Nc.C3667a;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u0003R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00050\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "", "<init>", "()V", "Lio/reactivex/p;", "", "observeTabUpdateRequest", "()Lio/reactivex/p;", "miniAppName", "", "updateTabConfig", "(Ljava/lang/String;)V", "updateMainTabBarConfig", "LNc/a;", "kotlin.jvm.PlatformType", "updateTabConfigListener", "LNc/a;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigUpdateDelegate {

    @NotNull
    private final C3667a<String> updateTabConfigListener;

    public TabConfigUpdateDelegate() {
        C3667a<String> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        this.updateTabConfigListener = d11;
    }

    @NotNull
    public final p<String> observeTabUpdateRequest() {
        return this.updateTabConfigListener;
    }

    public final void updateMainTabBarConfig() {
        updateTabConfig("main");
    }

    public final void updateTabConfig(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        this.updateTabConfigListener.onNext(miniAppName);
    }
}
