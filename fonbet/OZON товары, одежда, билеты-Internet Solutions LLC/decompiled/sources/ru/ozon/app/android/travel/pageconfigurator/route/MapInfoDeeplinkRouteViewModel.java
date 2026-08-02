package ru.ozon.app.android.travel.pageconfigurator.route;

import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.collections.C7704k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/pageconfigurator/route/MapInfoDeeplinkRouteViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "currentPage", "", "pushRoute", "(Ljava/lang/String;)V", "popRoute", "()Ljava/lang/String;", "Lkotlin/collections/k;", "routeStack", "Lkotlin/collections/k;", "pageconfigurator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapInfoDeeplinkRouteViewModel extends w0 {

    @NotNull
    private final C7704k<String> routeStack = new C7704k<>();

    public final String popRoute() {
        C7704k<String> c7704k = this.routeStack;
        return c7704k.isEmpty() ? null : c7704k.removeLast();
    }

    public final void pushRoute(@NotNull String currentPage) {
        Intrinsics.checkNotNullParameter(currentPage, "currentPage");
        this.routeStack.addLast(currentPage);
    }
}
