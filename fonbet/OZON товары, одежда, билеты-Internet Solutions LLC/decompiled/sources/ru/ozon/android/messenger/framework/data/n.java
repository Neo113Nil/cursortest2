package ru.ozon.android.messenger.framework.data;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;
import ru.ozon.android.messenger.blocks.notification.NotificationDTO;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.parser.DataStringAdapter;
import ru.ozon.android.messenger.framework.data.remote.parser.DateTimeTypeMoshiAdapter;
import ru.ozon.android.messenger.framework.data.remote.parser.ItemAdapter;
import ru.ozon.android.messenger.framework.data.requests.SendMessageRequest;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfAdapterFactory;
import ru.ozon.uni.atoms.data.AtomTypeImpl;
import ru.ozon.uni.atoms.parsing.adapter.AtomDTOAdapterFactory;

/* loaded from: classes10.dex */
public final class n implements Jb.e<Moshi> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f87645a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f87646b;

    public n(Jb.f fVar, ru.ozon.android.messenger.framework.data.remote.parser.b bVar, ru.ozon.android.messenger.framework.data.remote.parser.a aVar, Jb.f fVar2, ru.ozon.android.messenger.framework.logger.e eVar) {
        this.f87645a = fVar;
        this.f87646b = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        d.e moshiExternalConfig = (d.e) this.f87645a.get();
        ItemAdapter itemAdapter = new ItemAdapter();
        DataStringAdapter dataStringAdapter = new DataStringAdapter();
        ru.ozon.android.messenger.framework.core.initialization.d messengerConfig = (ru.ozon.android.messenger.framework.core.initialization.d) this.f87646b.get();
        ru.ozon.android.messenger.framework.logger.d messengerInternalLogger = new ru.ozon.android.messenger.framework.logger.d();
        Intrinsics.checkNotNullParameter(moshiExternalConfig, "moshiExternalConfig");
        Intrinsics.checkNotNullParameter(itemAdapter, "itemAdapter");
        Intrinsics.checkNotNullParameter(dataStringAdapter, "dataStringAdapter");
        Intrinsics.checkNotNullParameter(messengerConfig, "messengerConfig");
        Intrinsics.checkNotNullParameter(messengerInternalLogger, "messengerInternalLogger");
        Moshi.a aVar = new Moshi.a();
        aVar.a(PolymorphicJsonAdapterFactory.b(SocketEventDTO.class).c(SocketEventDTO.AddItem.class, ru.ozon.android.messenger.framework.data.remote.models.a.ADD_ITEM.a()).c(SocketEventDTO.PinItems.class, ru.ozon.android.messenger.framework.data.remote.models.a.PIN_ITEMS.a()).c(SocketEventDTO.RemoveItem.class, ru.ozon.android.messenger.framework.data.remote.models.a.REMOVE_ITEM.a()).c(SocketEventDTO.UpdateItem.class, ru.ozon.android.messenger.framework.data.remote.models.a.UPDATE_ITEM.a()).c(SocketEventDTO.UserIsTyping.class, ru.ozon.android.messenger.framework.data.remote.models.a.USER_IS_TYPING.a()).c(SocketEventDTO.ResetCache.class, ru.ozon.android.messenger.framework.data.remote.models.a.RESET_CACHE.a()).c(SocketEventDTO.UpdateGlobalCounter.class, ru.ozon.android.messenger.framework.data.remote.models.a.UPDATE_GLOBAL_COUNTER.a()).c(SocketEventDTO.RedirectToChatList.class, ru.ozon.android.messenger.framework.data.remote.models.a.REDIRECT_TO_CHAT_LIST.a()).c(SocketEventDTO.Notify.class, ru.ozon.android.messenger.framework.data.remote.models.a.NOTIFY.a()));
        aVar.a(PolymorphicJsonAdapterFactory.b(MessageTextDTO.MessageTextType.class).c(MessageTextDTO.MessageTextType.TextType.class, MessageTextDTO.a.TEXT.a()).c(MessageTextDTO.MessageTextType.NewLine.class, MessageTextDTO.a.NEW_LINE.a()).c(MessageTextDTO.MessageTextType.LinkType.class, MessageTextDTO.a.LINK.a()).c(MessageTextDTO.MessageTextType.BoldType.class, MessageTextDTO.a.BOLD.a()).c(MessageTextDTO.MessageTextType.OlType.class, MessageTextDTO.a.f85801OL.a()).c(MessageTextDTO.MessageTextType.UlType.class, MessageTextDTO.a.f85802UL.a()));
        aVar.a(PolymorphicJsonAdapterFactory.b(SendMessageRequest.TextState.class).c(SendMessageRequest.TextState.Text.class, SendMessageRequest.a.TEXT.a()).c(SendMessageRequest.TextState.Text.class, SendMessageRequest.a.LINK.a()));
        aVar.a(new AtomDTOAdapterFactory());
        aVar.a(new ProtoOneOfAdapterFactory());
        aVar.b(itemAdapter);
        aVar.b(dataStringAdapter);
        aVar.b(new DateTimeTypeMoshiAdapter());
        aVar.a(PolymorphicJsonAdapterFactory.b(NotificationDTO.ButtonDTO.class).c(NotificationDTO.ButtonDTO.Small.class, AtomTypeImpl.SMALL_BUTTON.getValue()).c(NotificationDTO.ButtonDTO.SmallBorderless.class, AtomTypeImpl.SMALL_BORDERLESS_BUTTON.getValue()));
        Iterator<T> it = moshiExternalConfig.a().iterator();
        while (it.hasNext()) {
            aVar.b(it.next());
        }
        aVar.d(new ru.ozon.android.messenger.framework.data.remote.parser.d(messengerConfig, messengerInternalLogger));
        Moshi moshi = new Moshi(aVar);
        Intrinsics.checkNotNullExpressionValue(moshi, "build(...)");
        return moshi;
    }
}
