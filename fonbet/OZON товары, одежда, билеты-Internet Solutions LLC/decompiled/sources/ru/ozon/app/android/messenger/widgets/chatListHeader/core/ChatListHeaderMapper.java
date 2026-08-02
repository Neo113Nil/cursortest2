package ru.ozon.app.android.messenger.widgets.chatListHeader.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.widgets.chatListHeader.data.ChatListHeaderDTO;
import ru.ozon.app.android.messenger.widgets.chatListHeader.presentation.ChatListHeaderVO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/messenger/widgets/chatListHeader/core/ChatListHeaderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/messenger/widgets/chatListHeader/data/ChatListHeaderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/messenger/widgets/chatListHeader/presentation/ChatListHeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/messenger/widgets/chatListHeader/data/ChatListHeaderDTO;Ll20/d;)Ljava/util/List;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChatListHeaderMapper implements Function2<ChatListHeaderDTO, d, List<? extends ChatListHeaderVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ChatListHeaderVO> invoke(@NotNull ChatListHeaderDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        CornerRadius cornerRadius = state.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.RADIUS_600;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        String backgroundColor = state.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        }
        return C7714v.a0(new ChatListHeaderVO(hashCode, title, subtitle, cornerRadius2, backgroundColor));
    }
}
