package ru.ozon.app.android.session.editUserFullName.core;

import Pc.a;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewHolder;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModel;
import ru.ozon.app.android.session.editUserFullName.presentation.EditUserFullNameViewModelImpl;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldBinder;
import ru.ozon.app.android.session.editUserFullName.presentation.TextFieldFactory;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/editUserFullName/presentation/EditUserFullNameViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EditUserFullNameViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, EditUserFullNameViewHolder> {
    final /* synthetic */ EditUserFullNameViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditUserFullNameViewMapper$holderProducer$1(EditUserFullNameViewMapper editUserFullNameViewMapper) {
        super(2);
        this.this$0 = editUserFullNameViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final EditUserFullNameViewHolder invoke(View view, ComposerReferences composerReferences) {
        final a aVar;
        TextFieldFactory textFieldFactory;
        TextFieldBinder textFieldBinder;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        aVar = this.this$0.pViewModel;
        Object a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.session.editUserFullName.core.EditUserFullNameViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                EditUserFullNameViewModelImpl editUserFullNameViewModelImpl = (EditUserFullNameViewModelImpl) a.this.get();
                Intrinsics.g(editUserFullNameViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return editUserFullNameViewModelImpl;
            }
        }).a(EditUserFullNameViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        EditUserFullNameViewModel editUserFullNameViewModel = (EditUserFullNameViewModel) a12;
        textFieldFactory = this.this$0.textFieldFactory;
        textFieldBinder = this.this$0.textFieldBinder;
        return new EditUserFullNameViewHolder(view, composerReferences, editUserFullNameViewModel, textFieldFactory, textFieldBinder);
    }
}
