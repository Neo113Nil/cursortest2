package ru.ozon.android.messenger.framework.data.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.MessageModelDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.b;

/* loaded from: classes10.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.local.mapper.c f88438a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.g f88439b;

    public X(@NotNull ru.ozon.android.messenger.framework.data.local.mapper.c undeliveredMessagesMapper, @NotNull ru.ozon.android.messenger.framework.data.remote.mapper.g responseMapper) {
        Intrinsics.checkNotNullParameter(undeliveredMessagesMapper, "undeliveredMessagesMapper");
        Intrinsics.checkNotNullParameter(responseMapper, "responseMapper");
        this.f88438a = undeliveredMessagesMapper;
        this.f88439b = responseMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0048  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ru.ozon.android.messenger.framework.presentation.models.responses.h a(@NotNull GetMessagesResponseDTO remoteResponse, @NotNull b.a direction, @NotNull List<UndeliveredMessageEntity> undeliveredMessages) {
        Object obj;
        MessageModelDTO messageModelDTO;
        List<ItemDTO> items;
        Object obj2;
        ru.ozon.android.messenger.framework.data.remote.mapper.g gVar;
        DateTime createdAt;
        DateTime createdAt2;
        ItemDTO itemDTO;
        Object obj3;
        Intrinsics.checkNotNullParameter(remoteResponse, "remoteResponse");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(undeliveredMessages, "undeliveredMessages");
        List<ItemDTO> items2 = remoteResponse.getItems();
        if (items2 != null) {
            Iterator<T> it = items2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                ItemDTO itemDTO2 = (ItemDTO) obj3;
                if ((itemDTO2 != null ? itemDTO2.getParsedModel() : null) instanceof MessageModelDTO) {
                    break;
                }
            }
            ItemDTO itemDTO3 = (ItemDTO) obj3;
            if (itemDTO3 != null) {
                obj = itemDTO3.getParsedModel();
                messageModelDTO = !(obj instanceof MessageModelDTO) ? (MessageModelDTO) obj : null;
                items = remoteResponse.getItems();
                if (items != null) {
                    ListIterator<ItemDTO> listIterator = items.listIterator(items.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            itemDTO = null;
                            break;
                        }
                        itemDTO = listIterator.previous();
                        ItemDTO itemDTO4 = itemDTO;
                        if ((itemDTO4 != null ? itemDTO4.getParsedModel() : null) instanceof MessageModelDTO) {
                            break;
                        }
                    }
                    ItemDTO itemDTO5 = itemDTO;
                    if (itemDTO5 != null) {
                        obj2 = itemDTO5.getParsedModel();
                        MessageModelDTO messageModelDTO2 = obj2 instanceof MessageModelDTO ? (MessageModelDTO) obj2 : null;
                        gVar = this.f88439b;
                        if (messageModelDTO != null || (createdAt = messageModelDTO.getCreatedAt()) == null) {
                            return gVar.f(remoteResponse, kotlin.collections.K.f71697a);
                        }
                        long millis = createdAt.getMillis();
                        if (messageModelDTO2 == null || (createdAt2 = messageModelDTO2.getCreatedAt()) == null) {
                            return gVar.f(remoteResponse, kotlin.collections.K.f71697a);
                        }
                        long millis2 = createdAt2.getMillis();
                        long j11 = millis < millis2 ? millis : millis2;
                        if (millis2 > millis) {
                            millis = millis2;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : undeliveredMessages) {
                            UndeliveredMessageEntity undeliveredMessageEntity = (UndeliveredMessageEntity) obj4;
                            long d11 = undeliveredMessageEntity.d();
                            if ((j11 <= d11 && d11 <= millis) || ((undeliveredMessageEntity.d() > millis && !Intrinsics.d(remoteResponse.getHasItemsAfter(), Boolean.TRUE) && direction != b.a.BACKWARD) || (undeliveredMessageEntity.d() < j11 && !Intrinsics.d(remoteResponse.getHasItemsBefore(), Boolean.TRUE) && direction != b.a.FORWARD))) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(this.f88438a.c((UndeliveredMessageEntity) it2.next()));
                        }
                        return gVar.f(remoteResponse, arrayList2);
                    }
                }
                obj2 = null;
                if (obj2 instanceof MessageModelDTO) {
                }
                gVar = this.f88439b;
                if (messageModelDTO != null) {
                }
                return gVar.f(remoteResponse, kotlin.collections.K.f71697a);
            }
        }
        obj = null;
        if (!(obj instanceof MessageModelDTO)) {
        }
        items = remoteResponse.getItems();
        if (items != null) {
        }
        obj2 = null;
        if (obj2 instanceof MessageModelDTO) {
        }
        gVar = this.f88439b;
        if (messageModelDTO != null) {
        }
        return gVar.f(remoteResponse, kotlin.collections.K.f71697a);
    }
}
