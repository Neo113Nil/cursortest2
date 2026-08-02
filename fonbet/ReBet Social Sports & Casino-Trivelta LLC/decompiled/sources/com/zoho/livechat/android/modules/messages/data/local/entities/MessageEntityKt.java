package com.zoho.livechat.android.modules.messages.data.local.entities;

import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"replaceClientTimeWithServerTimeIfAbsent", "Lcom/zoho/livechat/android/modules/messages/data/local/entities/MessageEntity;", "mobilisten_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessageEntityKt {
    @NotNull
    public static final MessageEntity replaceClientTimeWithServerTimeIfAbsent(@NotNull MessageEntity messageEntity) {
        Intrinsics.checkNotNullParameter(messageEntity, "<this>");
        return messageEntity.getTime().getClientTime() < 1 ? MessageEntity.copy$default(messageEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, MessageEntity.Time.copy$default(messageEntity.getTime(), 0L, messageEntity.getTime().getServerTime(), 0L, 0L, 0L, null, 61, null), 67108863, null) : messageEntity;
    }
}
