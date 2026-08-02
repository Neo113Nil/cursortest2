package ru.ozon.app.android.storefront.widgets.navbarv2.core;

import android.content.Context;
import gk0.n;
import gk0.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.precreation.PreCreateInfoProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/core/ShellNavBarV2PreCreateInfoProvider;", "Lru/ozon/app/android/precreation/PreCreateInfoProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lgk0/n;", "provide", "(Landroid/content/Context;)Ljava/util/List;", "", "widgetId", "Ljava/lang/String;", "getWidgetId", "()Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ShellNavBarV2PreCreateInfoProvider implements PreCreateInfoProvider {

    @NotNull
    private final String widgetId = "navBarV2";

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public String getWidgetId() {
        return this.widgetId;
    }

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public List<n> provide(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.b0(new p(2, new ShellNavBarV2PreCreateInfoProvider$provide$1(context)), new p(1, new ShellNavBarV2PreCreateInfoProvider$provide$2(context)));
    }
}
