package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import GZ.g;
import Pc.a;
import a00.C4911f;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NewCredentialsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NewCredentialsViewHolder> {
    final /* synthetic */ NewCredentialsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewCredentialsViewMapper$holderProducer$1(NewCredentialsViewMapper newCredentialsViewMapper) {
        super(2);
        this.this$0 = newCredentialsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NewCredentialsViewHolder invoke(View view, ComposerReferences ref) {
        final a aVar;
        HandlersInhibitor handlersInhibitor;
        Ob0.a aVar2;
        g gVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        C4911f container = ref.getContainer();
        B0 b11 = ref.getViewModelOwnerProvider().b();
        aVar = this.this$0.vm;
        Object a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                NewCredentialsViewModelImpl newCredentialsViewModelImpl = (NewCredentialsViewModelImpl) a.this.get();
                Intrinsics.g(newCredentialsViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return newCredentialsViewModelImpl;
            }
        }).a(NewCredentialsViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        NewCredentialsViewModel newCredentialsViewModel = (NewCredentialsViewModel) a11;
        handlersInhibitor = this.this$0.handlersInhibitor;
        InterfaceC7851b controller = ref.getController();
        ComposerNavigator navigator = ref.getNavigator();
        aVar2 = this.this$0.ozonIdApi;
        gVar = this.this$0.ozonRouter;
        return new NewCredentialsViewHolder(view, container, newCredentialsViewModel, handlersInhibitor, controller, navigator, aVar2, gVar);
    }
}
