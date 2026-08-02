package ru.ozon.app.android.startup.initializers;

import Pc.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/startup/initializers/NamedActionInitializerProvider;", "", "", "getTag", "()Ljava/lang/String;", "tag", "LPc/a;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "getProvider", "()LPc/a;", "provider", "startup_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NamedActionInitializerProvider {
    @NotNull
    a<? extends ActionInitializer> getProvider();

    @NotNull
    String getTag();
}
