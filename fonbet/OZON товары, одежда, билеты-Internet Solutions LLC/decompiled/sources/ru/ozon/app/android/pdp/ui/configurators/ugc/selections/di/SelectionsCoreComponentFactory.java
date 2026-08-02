package ru.ozon.app.android.pdp.ui.configurators.ugc.selections.di;

import gi.C6740b;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponentFactory;", "Lii/a;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponentApi;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "<init>", "()V", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponent;", "create", "(Lgi/b;)Lru/ozon/app/android/pdp/ui/configurators/ugc/selections/di/SelectionsCoreComponent;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionsCoreComponentFactory implements InterfaceC7081a<SelectionsCoreComponentApi> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public SelectionsCoreComponentApi create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        return DaggerSelectionsCoreComponent.factory().create();
    }
}
