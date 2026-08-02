package ru.ozon.app.android.fresh.chat.actionHandlers;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CreateFreshAIConversationActionHandler$Companion$commonNetworkError$2 extends AbstractC7737t implements Function0<NotificationDTO> {
    public static final CreateFreshAIConversationActionHandler$Companion$commonNetworkError$2 INSTANCE = new CreateFreshAIConversationActionHandler$Companion$commonNetworkError$2();

    CreateFreshAIConversationActionHandler$Companion$commonNetworkError$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationDTO invoke() {
        return new NotificationDTO(StringProvider.getString(R$string.common_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
    }
}
