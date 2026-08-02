package ru.ozon.app.android.messenger.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.messenger.widgets.chatList.core.ChatListConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderViewMapper;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2Config;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2ViewMapper;

/* loaded from: classes6.dex */
public final class MessengerWidgetsV2Module_ProvideWidgets$messenger_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$messenger_prodGoogleAllVendorsRelease(MessengerCounterV2Config messengerCounterV2Config, MessengerCounterV2ViewMapper messengerCounterV2ViewMapper, ChatListConfig chatListConfig, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, CellListV2ViewMapper cellListV2ViewMapper, ChatListHeaderConfig chatListHeaderConfig, ChatListHeaderViewMapper chatListHeaderViewMapper) {
        Set<Widget2> provideWidgets$messenger_prodGoogleAllVendorsRelease = MessengerWidgetsV2Module.INSTANCE.provideWidgets$messenger_prodGoogleAllVendorsRelease(messengerCounterV2Config, messengerCounterV2ViewMapper, chatListConfig, commonIslandSeparatorViewMapper2, cellListV2ViewMapper, chatListHeaderConfig, chatListHeaderViewMapper);
        j.d(provideWidgets$messenger_prodGoogleAllVendorsRelease);
        return provideWidgets$messenger_prodGoogleAllVendorsRelease;
    }
}
