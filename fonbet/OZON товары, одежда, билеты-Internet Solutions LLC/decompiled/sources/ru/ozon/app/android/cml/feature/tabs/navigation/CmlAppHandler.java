package ru.ozon.app.android.cml.feature.tabs.navigation;

import BZ.a;
import BZ.e;
import CZ.c;
import CZ.f;
import CZ.g;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/navigation/CmlAppHandler;", "LBZ/a;", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LBZ/e;)V", "", "miniAppName", "", "canSwitchApp", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "LEZ/e;", "LCZ/g;", "response", "isSaved", "LCZ/c;", "getMiniAppDestination", "(Landroid/content/Context;Ljava/lang/String;LEZ/e;Z)LCZ/c;", "LBZ/e;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlAppHandler implements a {

    @NotNull
    private final e miniAppConfigHolder;

    public CmlAppHandler(@NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.miniAppConfigHolder = miniAppConfigHolder;
    }

    @Override // BZ.a
    public boolean canSwitchApp(@NotNull String miniAppName) {
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        return Intrinsics.d(miniAppName, "cml");
    }

    @Override // BZ.a
    @NotNull
    public c getMiniAppDestination(@NotNull Context context, @NotNull String miniAppName, @NotNull EZ.e<g> response, boolean isSaved) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
        Intrinsics.checkNotNullParameter(response, "response");
        return f.b(this, miniAppName, k.b(new CmlAppHandler$getMiniAppDestination$1(response, miniAppName, BZ.f.a(this.miniAppConfigHolder))), null, false, 12);
    }
}
