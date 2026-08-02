package ru.ozon.app.android.favorites.accesscontrol.presentation.users;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlViewModel;
import ru.ozon.app.android.favorites.accesscontrol.presentation.ChangeAccessControlDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserWidgetViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AccessControlUserViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AccessControlUserWidgetViewHolder> {
    final /* synthetic */ AccessControlUserViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessControlUserViewMapper$holderProducer$1(AccessControlUserViewMapper accessControlUserViewMapper) {
        super(2);
        this.this$0 = accessControlUserViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AccessControlUserWidgetViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        B0 a11 = references.getViewModelOwnerProvider().a();
        final AccessControlUserViewMapper accessControlUserViewMapper = this.this$0;
        return new AccessControlUserWidgetViewHolder(view, references, new ChangeAccessControlDelegate((AccessControlViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.favorites.accesscontrol.presentation.users.AccessControlUserViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AccessControlViewModel accessControlViewModel = AccessControlUserViewMapper.this.component().getAccessControlViewModel();
                Intrinsics.g(accessControlViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return accessControlViewModel;
            }
        }).a(AccessControlViewModel.class), this.this$0.component().getFavoritesListsEventsManager(), references, references.getContainer().f(), references.getContainer().g()));
    }
}
