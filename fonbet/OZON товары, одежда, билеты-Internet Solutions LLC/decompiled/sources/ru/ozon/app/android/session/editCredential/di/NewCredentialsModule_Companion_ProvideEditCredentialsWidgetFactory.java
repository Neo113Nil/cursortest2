package ru.ozon.app.android.session.editCredential.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.session.editCredential.newCredentials.core.NewCredentialsConfig;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewMapper;

/* loaded from: classes7.dex */
public final class NewCredentialsModule_Companion_ProvideEditCredentialsWidgetFactory implements e<Widget> {
    public static Widget provideEditCredentialsWidget(NewCredentialsConfig newCredentialsConfig, NewCredentialsViewMapper newCredentialsViewMapper) {
        Widget provideEditCredentialsWidget = NewCredentialsModule.INSTANCE.provideEditCredentialsWidget(newCredentialsConfig, newCredentialsViewMapper);
        j.d(provideEditCredentialsWidget);
        return provideEditCredentialsWidget;
    }
}
