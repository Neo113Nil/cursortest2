package io.intercom.android.sdk.m5.push.ui;

import android.net.Uri;
import androidx.core.app.Person;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationStylePushUI.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "", "conversationId", "", "conversationTitle", "messages", "", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getConversationId", "()Ljava/lang/String;", "getConversationTitle", "getMessages", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Message", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomPushConversation {
    public static final int $stable = 8;
    private final String conversationId;
    private final String conversationTitle;
    private final List<Message> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPushConversation copy$default(IntercomPushConversation intercomPushConversation, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intercomPushConversation.conversationId;
        }
        if ((i & 2) != 0) {
            str2 = intercomPushConversation.conversationTitle;
        }
        if ((i & 4) != 0) {
            list = intercomPushConversation.messages;
        }
        return intercomPushConversation.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final List<Message> component3() {
        return this.messages;
    }

    public final IntercomPushConversation copy(String conversationId, String conversationTitle, List<Message> messages) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new IntercomPushConversation(conversationId, conversationTitle, messages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomPushConversation)) {
            return false;
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) other;
        return Intrinsics.areEqual(this.conversationId, intercomPushConversation.conversationId) && Intrinsics.areEqual(this.conversationTitle, intercomPushConversation.conversationTitle) && Intrinsics.areEqual(this.messages, intercomPushConversation.messages);
    }

    public int hashCode() {
        return (((this.conversationId.hashCode() * 31) + this.conversationTitle.hashCode()) * 31) + this.messages.hashCode();
    }

    public String toString() {
        return "IntercomPushConversation(conversationId=" + this.conversationId + ", conversationTitle=" + this.conversationTitle + ", messages=" + this.messages + ')';
    }

    public IntercomPushConversation(String conversationId, String conversationTitle, List<Message> messages) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(conversationTitle, "conversationTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.conversationId = conversationId;
        this.conversationTitle = conversationTitle;
        this.messages = messages;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    /* compiled from: ConversationStylePushUI.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001J\u0013\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\u0007H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "", "person", "Landroidx/core/app/Person;", "timestamp", "", "message", "", "contentImageUri", "Landroid/net/Uri;", "<init>", "(Landroidx/core/app/Person;JLjava/lang/String;Landroid/net/Uri;)V", "getPerson", "()Landroidx/core/app/Person;", "getTimestamp", "()J", "getMessage", "()Ljava/lang/String;", "getContentImageUri", "()Landroid/net/Uri;", "isCurrentUser", "", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Message {
        public static final int $stable = 8;
        private final Uri contentImageUri;
        private final boolean isCurrentUser;
        private final String message;
        private final Person person;
        private final long timestamp;

        public static /* synthetic */ Message copy$default(Message message, Person person, long j, String str, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                person = message.person;
            }
            if ((i & 2) != 0) {
                j = message.timestamp;
            }
            if ((i & 4) != 0) {
                str = message.message;
            }
            if ((i & 8) != 0) {
                uri = message.contentImageUri;
            }
            return message.copy(person, j, str, uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Person getPerson() {
            return this.person;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        public final Message copy(Person person, long timestamp, String message, Uri contentImageUri) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Message(person, timestamp, message, contentImageUri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return Intrinsics.areEqual(this.person, message.person) && this.timestamp == message.timestamp && Intrinsics.areEqual(this.message, message.message) && Intrinsics.areEqual(this.contentImageUri, message.contentImageUri);
        }

        public int hashCode() {
            Person person = this.person;
            int hashCode = (((((person == null ? 0 : person.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.message.hashCode()) * 31;
            Uri uri = this.contentImageUri;
            return hashCode + (uri != null ? uri.hashCode() : 0);
        }

        public String toString() {
            return "Message(person=" + this.person + ", timestamp=" + this.timestamp + ", message=" + this.message + ", contentImageUri=" + this.contentImageUri + ')';
        }

        public Message(Person person, long j, String message, Uri uri) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.person = person;
            this.timestamp = j;
            this.message = message;
            this.contentImageUri = uri;
            this.isCurrentUser = person == null;
        }

        public final Person getPerson() {
            return this.person;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final String getMessage() {
            return this.message;
        }

        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        /* renamed from: isCurrentUser, reason: from getter */
        public final boolean getIsCurrentUser() {
            return this.isCurrentUser;
        }
    }
}
