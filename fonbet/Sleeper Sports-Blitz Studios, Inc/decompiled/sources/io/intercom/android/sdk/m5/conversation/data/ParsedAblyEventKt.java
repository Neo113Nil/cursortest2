package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.Gson;
import io.ably.lib.types.Message;
import io.intercom.android.sdk.m5.conversation.data.ParsedAblyEvent;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParsedAblyEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asAblyData", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "Lio/ably/lib/types/Message;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ParsedAblyEventKt {
    public static final ParsedAblyEvent asAblyData(Message message) {
        Intrinsics.checkNotNullParameter(message, "<this>");
        if (Intrinsics.areEqual(message.name, "NewComment")) {
            try {
                AblyMessage ablyMessage = (AblyMessage) new Gson().fromJson(message.data.toString(), AblyMessage.class);
                Part build = ablyMessage.getEventData().getConversationPart().build();
                return new ParsedAblyEvent.ConversationAblyEvent.NewComment(String.valueOf(ablyMessage.getEventData().getConversationId()), build.isUser() ? String.valueOf(build.isUser()) : "", "", ablyMessage.getEventData().getConversationPart());
            } catch (Exception e) {
                System.out.println((Object) ("AblyManager: JSON parsing error: " + e.getMessage()));
                e.printStackTrace();
                return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
            }
        }
        return ParsedAblyEvent.UnSupportedEvent.INSTANCE;
    }
}
