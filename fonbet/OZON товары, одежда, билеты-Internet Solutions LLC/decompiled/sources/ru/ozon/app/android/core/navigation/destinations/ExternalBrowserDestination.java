package ru.ozon.app.android.core.navigation.destinations;

import EZ.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.core.navigation.navigators.ExternalBrowserNavigationHandler;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/core/navigation/destinations/ExternalBrowserDestination;", "Lru/ozon/app/android/core/navigation/destinations/ExternalDestination;", "Landroid/net/Uri;", "uri", "", "newTask", "<init>", "(Landroid/net/Uri;Z)V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Z", "getNewTask", "()Z", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExternalBrowserDestination extends ExternalDestination {

    @NotNull
    private final d<? extends a<?>> navigator;
    private final boolean newTask;

    @NotNull
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalBrowserDestination(@NotNull Uri uri, boolean z11) {
        super(uri, z11);
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.newTask = z11;
        this.navigator = N.b(ExternalBrowserNavigationHandler.class);
    }

    @Override // ru.ozon.app.android.core.navigation.destinations.ExternalDestination, pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    @Override // ru.ozon.app.android.core.navigation.destinations.ExternalDestination
    public boolean getNewTask() {
        return this.newTask;
    }

    @Override // ru.ozon.app.android.core.navigation.destinations.ExternalDestination
    @NotNull
    public Uri getUri() {
        return this.uri;
    }
}
