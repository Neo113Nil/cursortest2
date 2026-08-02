package ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation;

import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.navigation.profileAvatar.presentation.AvatarProfileViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/profileAvatar/presentation/ProfileAvatarViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProfileAvatarViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProfileAvatarViewHolder> {
    final /* synthetic */ ProfileAvatarViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileAvatarViewMapper$holderProducer$1(ProfileAvatarViewMapper profileAvatarViewMapper) {
        super(2);
        this.this$0 = profileAvatarViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProfileAvatarViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ProfileAvatarView profileAvatarView = (ProfileAvatarView) view;
        OrderChangePreferences orderChangePreferences = this.this$0.component().getOrderChangePreferences();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final ProfileAvatarViewMapper profileAvatarViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.profileAvatar.presentation.ProfileAvatarViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AvatarProfileViewModel avatarProfileViewModel = ProfileAvatarViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(avatarProfileViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return avatarProfileViewModel;
            }
        }).a(AvatarProfileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new ProfileAvatarViewHolder(profileAvatarView, (AvatarProfileViewModel) a12, orderChangePreferences, composerReferences, tokenizedAnalytics);
    }
}
