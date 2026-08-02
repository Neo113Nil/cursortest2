package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface Pc extends InterfaceC0381od {
    @NotNull
    List<ModuleServicesDatabase> b();

    @NotNull
    /* synthetic */ Map c();

    @NotNull
    /* synthetic */ Map d();

    @NotNull
    List<Consumer<Location>> e();

    @Nullable
    ModuleLocationSourcesServiceController f();

    @Nullable
    Toggle g();

    @NotNull
    /* synthetic */ List h();
}
