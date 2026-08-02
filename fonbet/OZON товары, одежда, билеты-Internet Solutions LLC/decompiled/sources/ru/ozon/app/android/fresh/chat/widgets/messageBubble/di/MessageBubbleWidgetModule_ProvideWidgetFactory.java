package ru.ozon.app.android.fresh.chat.widgets.messageBubble.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.core.MessageBubbleConfig;
import ru.ozon.app.android.fresh.chat.widgets.messageBubble.core.MessageBubbleViewMapper;

/* loaded from: classes6.dex */
public final class MessageBubbleWidgetModule_ProvideWidgetFactory implements e<Widget2> {
    public static Widget2 provideWidget(MessageBubbleConfig messageBubbleConfig, MessageBubbleViewMapper messageBubbleViewMapper) {
        Widget2 provideWidget = MessageBubbleWidgetModule.INSTANCE.provideWidget(messageBubbleConfig, messageBubbleViewMapper);
        j.d(provideWidget);
        return provideWidget;
    }
}
