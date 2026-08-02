package ru.ozon.app.android.cabinet.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarConfig;
import ru.ozon.app.android.cabinet.profileAvatar.core.ProfileAvatarViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/cabinet/di/DeliveryCabinetWidgetV2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "profileAvatarConfig", "Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarConfig;", "profileAvatarViewMapper", "Lru/ozon/app/android/cabinet/profileAvatar/core/ProfileAvatarViewMapper;", "provideWidgets$cabinet_prodGoogleAllVendorsRelease", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeliveryCabinetWidgetV2Module {
    @NotNull
    public final Set<Widget2> provideWidgets$cabinet_prodGoogleAllVendorsRelease(@NotNull ProfileAvatarConfig profileAvatarConfig, @NotNull ProfileAvatarViewMapper profileAvatarViewMapper) {
        Intrinsics.checkNotNullParameter(profileAvatarConfig, "profileAvatarConfig");
        Intrinsics.checkNotNullParameter(profileAvatarViewMapper, "profileAvatarViewMapper");
        return e0.h(new Widget2("csma", "profileAvatar", profileAvatarConfig, new ViewMapper2[]{profileAvatarViewMapper}));
    }
}
