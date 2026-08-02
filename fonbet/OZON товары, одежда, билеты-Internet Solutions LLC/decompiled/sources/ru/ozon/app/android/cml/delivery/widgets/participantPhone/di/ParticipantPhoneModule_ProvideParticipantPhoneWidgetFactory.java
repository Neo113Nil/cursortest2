package ru.ozon.app.android.cml.delivery.widgets.participantPhone.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.data.ParticipantPhoneConfig;
import ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation.ParticipantPhoneViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class ParticipantPhoneModule_ProvideParticipantPhoneWidgetFactory implements e<Widget2> {
    public static Widget2 provideParticipantPhoneWidget(ParticipantPhoneConfig participantPhoneConfig, ParticipantPhoneViewMapper participantPhoneViewMapper) {
        Widget2 provideParticipantPhoneWidget = ParticipantPhoneModule.INSTANCE.provideParticipantPhoneWidget(participantPhoneConfig, participantPhoneViewMapper);
        j.d(provideParticipantPhoneWidget);
        return provideParticipantPhoneWidget;
    }
}
