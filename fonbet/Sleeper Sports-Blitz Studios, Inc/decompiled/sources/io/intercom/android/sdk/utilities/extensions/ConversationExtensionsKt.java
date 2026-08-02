package io.intercom.android.sdk.utilities.extensions;

import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Ticket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationExtensions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"lastActionCreatedAt", "", "Lio/intercom/android/sdk/models/Conversation;", "hasNonTicketParts", "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationExtensionsKt {
    public static final long lastActionCreatedAt(Conversation conversation) {
        List<Ticket.Status> statusList;
        Object obj;
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        if (!Intrinsics.areEqual(conversation.lastPart(), Part.NULL)) {
            return conversation.lastPart().getCreatedAt();
        }
        Ticket ticket = conversation.getTicket();
        if (ticket == null || (statusList = ticket.getStatusList()) == null) {
            return 0L;
        }
        Iterator<T> it = statusList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long createdDate = ((Ticket.Status) next).getCreatedDate();
                do {
                    Object next2 = it.next();
                    long createdDate2 = ((Ticket.Status) next2).getCreatedDate();
                    if (createdDate < createdDate2) {
                        next = next2;
                        createdDate = createdDate2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Ticket.Status status = (Ticket.Status) obj;
        if (status != null) {
            return status.getCreatedDate();
        }
        return 0L;
    }

    public static final boolean hasNonTicketParts(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "<this>");
        List<Part> parts = conversation.parts();
        if ((parts instanceof Collection) && parts.isEmpty()) {
            return false;
        }
        Iterator<T> it = parts.iterator();
        while (it.hasNext()) {
            if (((Part) it.next()).getMessageStyle() != MessageStyle.TICKET_STATE_UPDATED) {
                return true;
            }
        }
        return false;
    }
}
