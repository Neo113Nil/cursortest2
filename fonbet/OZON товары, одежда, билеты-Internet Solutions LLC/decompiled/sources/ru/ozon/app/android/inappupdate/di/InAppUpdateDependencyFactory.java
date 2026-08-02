package ru.ozon.app.android.inappupdate.di;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.inappupdate.di.InAppUpdateDependencyComponent;
import ru.ozon.app.android.limb.Limb2ComponentApi;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/inappupdate/di/InAppUpdateDependencyFactory;", "Lii/a;", "Lru/ozon/app/android/inappupdate/di/InAppUpdateDependencyComponent;", "<init>", "()V", "Lgi/b;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/inappupdate/di/InAppUpdateDependencyComponent;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppUpdateDependencyFactory implements InterfaceC7081a<InAppUpdateDependencyComponent> {
    @Override // ii.InterfaceC7081a
    @NotNull
    public InAppUpdateDependencyComponent create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        InAppUpdateDependencyComponent.Factory factory = DaggerInAppUpdateDependencyComponent.factory();
        if (Limb2ComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component Limb2ComponentApi is not DiComponent");
        }
        return factory.create((Limb2ComponentApi) componentStorage.b(Limb2ComponentApi.class));
    }
}
