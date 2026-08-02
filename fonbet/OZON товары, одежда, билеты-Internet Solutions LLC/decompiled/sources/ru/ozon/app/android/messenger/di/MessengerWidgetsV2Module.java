package ru.ozon.app.android.messenger.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.messenger.widgets.chatList.core.ChatListConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderConfig;
import ru.ozon.app.android.messenger.widgets.chatListHeader.core.ChatListHeaderViewMapper;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2Config;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.core.MessengerCounterV2ViewMapper;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/messenger/di/MessengerWidgetsV2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "messengerCounterV2Config", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2Config;", "messengerCounterV2ViewMapper", "Lru/ozon/app/android/messenger/widgets/messengerCounterV2/core/MessengerCounterV2ViewMapper;", "chatListConfig", "Lru/ozon/app/android/messenger/widgets/chatList/core/ChatListConfig;", "commonIslandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "cellListViewMapper", "Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "chatListHeaderConfig", "Lru/ozon/app/android/messenger/widgets/chatListHeader/core/ChatListHeaderConfig;", "chatListHeaderViewMapper", "Lru/ozon/app/android/messenger/widgets/chatListHeader/core/ChatListHeaderViewMapper;", "provideWidgets$messenger_prodGoogleAllVendorsRelease", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerWidgetsV2Module {

    @NotNull
    public static final MessengerWidgetsV2Module INSTANCE = new MessengerWidgetsV2Module();

    private MessengerWidgetsV2Module() {
    }

    @NotNull
    public final Set<Widget2> provideWidgets$messenger_prodGoogleAllVendorsRelease(@NotNull MessengerCounterV2Config messengerCounterV2Config, @NotNull MessengerCounterV2ViewMapper messengerCounterV2ViewMapper, @NotNull ChatListConfig chatListConfig, @NotNull CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper, @NotNull CellListV2ViewMapper cellListViewMapper, @NotNull ChatListHeaderConfig chatListHeaderConfig, @NotNull ChatListHeaderViewMapper chatListHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(messengerCounterV2Config, "messengerCounterV2Config");
        Intrinsics.checkNotNullParameter(messengerCounterV2ViewMapper, "messengerCounterV2ViewMapper");
        Intrinsics.checkNotNullParameter(chatListConfig, "chatListConfig");
        Intrinsics.checkNotNullParameter(commonIslandSeparatorViewMapper, "commonIslandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(cellListViewMapper, "cellListViewMapper");
        Intrinsics.checkNotNullParameter(chatListHeaderConfig, "chatListHeaderConfig");
        Intrinsics.checkNotNullParameter(chatListHeaderViewMapper, "chatListHeaderViewMapper");
        Widget2[] elements = {new Widget2("messenger", "messengerCounter", messengerCounterV2Config, new ViewMapper2[]{messengerCounterV2ViewMapper}), new Widget2("messenger", "chatList", chatListConfig, new ViewMapper2[]{commonIslandSeparatorViewMapper, cellListViewMapper}), new Widget2("messenger", "chatListHeader", chatListHeaderConfig, new ViewMapper2[]{chatListHeaderViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
