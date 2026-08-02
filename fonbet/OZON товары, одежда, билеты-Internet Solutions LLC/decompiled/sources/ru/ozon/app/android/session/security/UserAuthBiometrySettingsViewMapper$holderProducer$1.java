package ru.ozon.app.android.session.security;

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
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewHolder;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModel;
import ru.ozon.app.android.session.security.presentation.UserAuthBiometryViewModelImpl;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/session/security/presentation/UserAuthBiometryViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UserAuthBiometrySettingsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, UserAuthBiometryViewHolder> {
    final /* synthetic */ UserAuthBiometrySettingsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserAuthBiometrySettingsViewMapper$holderProducer$1(UserAuthBiometrySettingsViewMapper userAuthBiometrySettingsViewMapper) {
        super(2);
        this.this$0 = userAuthBiometrySettingsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final UserAuthBiometryViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final UserAuthBiometrySettingsViewMapper userAuthBiometrySettingsViewMapper = this.this$0;
        Object a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.session.security.UserAuthBiometrySettingsViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = UserAuthBiometrySettingsViewMapper.this.providerViewModel;
                UserAuthBiometryViewModelImpl userAuthBiometryViewModelImpl = (UserAuthBiometryViewModelImpl) aVar.get();
                Intrinsics.g(userAuthBiometryViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return userAuthBiometryViewModelImpl;
            }
        }).a(UserAuthBiometryViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new UserAuthBiometryViewHolder(view, (UserAuthBiometryViewModel) a12, ContextExtKt.getRootView(ref.getContainer().a()), ref.getContainer().g());
    }
}
