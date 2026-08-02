package ru.ozon.app.android.tabbar.feature.tab.profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.tabbar.feature.tab.profile.ProfileViewModelImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ProfileTabUiController$observeViewModel$1$1 extends C7719a implements Function2<ProfileViewModelImpl.BadgeVariant, d<? super Unit>, Object> {
    ProfileTabUiController$observeViewModel$1$1(Object obj) {
        super(2, obj, ProfileTabUiController.class, "bindBadge", "bindBadge(Lru/ozon/app/android/tabbar/feature/tab/profile/ProfileViewModelImpl$BadgeVariant;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProfileViewModelImpl.BadgeVariant badgeVariant, d<? super Unit> dVar) {
        Object observeViewModel$lambda$1$bindBadge;
        observeViewModel$lambda$1$bindBadge = ProfileTabUiController.observeViewModel$lambda$1$bindBadge((ProfileTabUiController) this.receiver, badgeVariant, dVar);
        return observeViewModel$lambda$1$bindBadge;
    }
}
