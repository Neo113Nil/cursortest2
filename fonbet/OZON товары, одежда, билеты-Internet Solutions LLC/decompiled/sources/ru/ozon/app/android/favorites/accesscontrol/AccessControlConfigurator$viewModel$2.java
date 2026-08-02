package ru.ozon.app.android.favorites.accesscontrol;

import Pc.a;
import a00.h;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AccessControlConfigurator$viewModel$2 extends AbstractC7737t implements Function0<AccessControlViewModel> {
    final /* synthetic */ AccessControlConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessControlConfigurator$viewModel$2(AccessControlConfigurator accessControlConfigurator) {
        super(0);
        this.this$0 = accessControlConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AccessControlViewModel invoke() {
        h viewModelOwnerProvider;
        B0 a11;
        ConfiguratorReferences references = this.this$0.getReferences();
        if (references == null || (viewModelOwnerProvider = references.getViewModelOwnerProvider()) == null || (a11 = viewModelOwnerProvider.a()) == null) {
            return null;
        }
        final AccessControlConfigurator accessControlConfigurator = this.this$0;
        return (AccessControlViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.favorites.accesscontrol.AccessControlConfigurator$viewModel$2$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = AccessControlConfigurator.this.pAccessControlViewModel;
                AccessControlViewModel accessControlViewModel = (AccessControlViewModel) aVar.get();
                Intrinsics.g(accessControlViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return accessControlViewModel;
            }
        }).a(AccessControlViewModel.class);
    }
}
