package ru.ozon.app.android.favorites.familyProfileAvatar.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.favorites.familyProfileAvatar.data.FamilyProfileAvatarConfig;
import ru.ozon.app.android.favorites.familyProfileAvatar.presentation.FamilyProfileAvatarViewMapper;

/* loaded from: classes6.dex */
public final class FamilyProfileAvatarModule_ProvideFamilyProfileAvatarWidgetFactory implements e<Widget2> {
    public static Widget2 provideFamilyProfileAvatarWidget(FamilyProfileAvatarConfig familyProfileAvatarConfig, FamilyProfileAvatarViewMapper familyProfileAvatarViewMapper) {
        Widget2 provideFamilyProfileAvatarWidget = FamilyProfileAvatarModule.INSTANCE.provideFamilyProfileAvatarWidget(familyProfileAvatarConfig, familyProfileAvatarViewMapper);
        j.d(provideFamilyProfileAvatarWidget);
        return provideFamilyProfileAvatarWidget;
    }
}
