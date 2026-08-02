package io.intercom.android.sdk.m5.push;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: IntercomPushData.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \b2\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData;", "", "notificationId", "", "getNotificationId", "()I", "ConversationPushData", "DeepLinkPushData", "Companion", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface IntercomPushData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int getNotificationId();

    /* compiled from: IntercomPushData.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001f\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u0015H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "authorName", "", "avatarUrl", "conversationId", "messageData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "isCurrentUser", "", "isNewConversation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;ZZ)V", "getAuthorName", "()Ljava/lang/String;", "getAvatarUrl", "getConversationId", "getMessageData", "()Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "()Z", "notificationId", "", "getNotificationId", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "MessageData", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConversationPushData implements IntercomPushData {
        public static final int $stable = 8;
        private final String authorName;
        private final String avatarUrl;
        private final String conversationId;
        private final boolean isCurrentUser;
        private final boolean isNewConversation;
        private final MessageData messageData;

        public static /* synthetic */ ConversationPushData copy$default(ConversationPushData conversationPushData, String str, String str2, String str3, MessageData messageData, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationPushData.authorName;
            }
            if ((i & 2) != 0) {
                str2 = conversationPushData.avatarUrl;
            }
            if ((i & 4) != 0) {
                str3 = conversationPushData.conversationId;
            }
            if ((i & 8) != 0) {
                messageData = conversationPushData.messageData;
            }
            if ((i & 16) != 0) {
                z = conversationPushData.isCurrentUser;
            }
            if ((i & 32) != 0) {
                z2 = conversationPushData.isNewConversation;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return conversationPushData.copy(str, str2, str3, messageData, z3, z4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAuthorName() {
            return this.authorName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component4, reason: from getter */
        public final MessageData getMessageData() {
            return this.messageData;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsCurrentUser() {
            return this.isCurrentUser;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsNewConversation() {
            return this.isNewConversation;
        }

        public final ConversationPushData copy(String authorName, String avatarUrl, String conversationId, MessageData messageData, boolean isCurrentUser, boolean isNewConversation) {
            Intrinsics.checkNotNullParameter(authorName, "authorName");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            return new ConversationPushData(authorName, avatarUrl, conversationId, messageData, isCurrentUser, isNewConversation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationPushData)) {
                return false;
            }
            ConversationPushData conversationPushData = (ConversationPushData) other;
            return Intrinsics.areEqual(this.authorName, conversationPushData.authorName) && Intrinsics.areEqual(this.avatarUrl, conversationPushData.avatarUrl) && Intrinsics.areEqual(this.conversationId, conversationPushData.conversationId) && Intrinsics.areEqual(this.messageData, conversationPushData.messageData) && this.isCurrentUser == conversationPushData.isCurrentUser && this.isNewConversation == conversationPushData.isNewConversation;
        }

        public int hashCode() {
            return (((((((((this.authorName.hashCode() * 31) + this.avatarUrl.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.messageData.hashCode()) * 31) + Boolean.hashCode(this.isCurrentUser)) * 31) + Boolean.hashCode(this.isNewConversation);
        }

        public String toString() {
            return "ConversationPushData(authorName=" + this.authorName + ", avatarUrl=" + this.avatarUrl + ", conversationId=" + this.conversationId + ", messageData=" + this.messageData + ", isCurrentUser=" + this.isCurrentUser + ", isNewConversation=" + this.isNewConversation + ')';
        }

        public ConversationPushData(String authorName, String avatarUrl, String conversationId, MessageData messageData, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(authorName, "authorName");
            Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(messageData, "messageData");
            this.authorName = authorName;
            this.avatarUrl = avatarUrl;
            this.conversationId = conversationId;
            this.messageData = messageData;
            this.isCurrentUser = z;
            this.isNewConversation = z2;
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final MessageData getMessageData() {
            return this.messageData;
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public final boolean isNewConversation() {
            return this.isNewConversation;
        }

        /* compiled from: IntercomPushData.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "", "Text", "Image", "Attachment", "Companion", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public interface MessageData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = Companion.$$INSTANCE;

            /* compiled from: IntercomPushData.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                private Companion() {
                }

                public final KSerializer<MessageData> serializer() {
                    return new SealedClassSerializer("io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData", Reflection.getOrCreateKotlinClass(MessageData.class), new KClass[]{Reflection.getOrCreateKotlinClass(Attachment.class), Reflection.getOrCreateKotlinClass(Image.class), Reflection.getOrCreateKotlinClass(Text.class)}, new KSerializer[]{IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE}, new Annotation[0]);
                }
            }

            /* compiled from: IntercomPushData.kt */
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0007H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "message", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @Serializable
            @SerialName("text")
            public static final /* data */ class Text implements MessageData {
                public static final int $stable = 0;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String message;

                public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = text.message;
                    }
                    return text.copy(str);
                }

                /* renamed from: component1, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                public final Text copy(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    return new Text(message);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Text) && Intrinsics.areEqual(this.message, ((Text) other).message);
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return "Text(message=" + this.message + ')';
                }

                /* compiled from: IntercomPushData.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Text;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Text> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Text(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    if (1 != (i & 1)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 1, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE.getDescriptor());
                    }
                    this.message = str;
                }

                public Text(String message) {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.message = message;
                }

                public final String getMessage() {
                    return this.message;
                }
            }

            /* compiled from: IntercomPushData.kt */
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\bH×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "title", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @Serializable
            @SerialName("image")
            public static final /* data */ class Image implements MessageData {
                public static final int $stable = 0;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String title;
                private final String url;

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = image.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = image.url;
                    }
                    return image.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final Image copy(String title, String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Image(title, url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) other;
                    return Intrinsics.areEqual(this.title, image.title) && Intrinsics.areEqual(this.url, image.url);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                public String toString() {
                    return "Image(title=" + this.title + ", url=" + this.url + ')';
                }

                /* compiled from: IntercomPushData.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Image;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Image> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Image(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Image self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    output.encodeStringElement(serialDesc, 0, self.title);
                    output.encodeStringElement(serialDesc, 1, self.url);
                }

                public Image(String title, String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.title = title;
                    this.url = url;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }
            }

            /* compiled from: IntercomPushData.kt */
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\bH×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData;", "title", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @Serializable
            @SerialName("attachment")
            public static final /* data */ class Attachment implements MessageData {
                public static final int $stable = 0;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final String title;
                private final String url;

                public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = attachment.title;
                    }
                    if ((i & 2) != 0) {
                        str2 = attachment.url;
                    }
                    return attachment.copy(str, str2);
                }

                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component2, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                public final Attachment copy(String title, String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    return new Attachment(title, url);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Attachment)) {
                        return false;
                    }
                    Attachment attachment = (Attachment) other;
                    return Intrinsics.areEqual(this.title, attachment.title) && Intrinsics.areEqual(this.url, attachment.url);
                }

                public int hashCode() {
                    return (this.title.hashCode() * 31) + this.url.hashCode();
                }

                public String toString() {
                    return "Attachment(title=" + this.title + ", url=" + this.url + ')';
                }

                /* compiled from: IntercomPushData.kt */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData$MessageData$Attachment;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Attachment> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ Attachment(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE.getDescriptor());
                    }
                    this.title = str;
                    this.url = str2;
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Attachment self, CompositeEncoder output, SerialDescriptor serialDesc) {
                    output.encodeStringElement(serialDesc, 0, self.title);
                    output.encodeStringElement(serialDesc, 1, self.url);
                }

                public Attachment(String title, String url) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.title = title;
                    this.url = url;
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }
            }
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.conversationId.hashCode();
        }
    }

    /* compiled from: IntercomPushData.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH×\u0003J\t\u0010\u001e\u001a\u00020\u0011H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "contentTitle", "", "contentText", "uri", "contentImageUrl", "instanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentTitle", "()Ljava/lang/String;", "getContentText", "getUri", "getContentImageUrl", "getInstanceId", "notificationId", "", "getNotificationId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeepLinkPushData implements IntercomPushData {
        public static final int $stable = 0;
        private final String contentImageUrl;
        private final String contentText;
        private final String contentTitle;
        private final String instanceId;
        private final String uri;

        public static /* synthetic */ DeepLinkPushData copy$default(DeepLinkPushData deepLinkPushData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deepLinkPushData.contentTitle;
            }
            if ((i & 2) != 0) {
                str2 = deepLinkPushData.contentText;
            }
            if ((i & 4) != 0) {
                str3 = deepLinkPushData.uri;
            }
            if ((i & 8) != 0) {
                str4 = deepLinkPushData.contentImageUrl;
            }
            if ((i & 16) != 0) {
                str5 = deepLinkPushData.instanceId;
            }
            String str6 = str5;
            String str7 = str3;
            return deepLinkPushData.copy(str, str2, str7, str4, str6);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentTitle() {
            return this.contentTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContentText() {
            return this.contentText;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        /* renamed from: component5, reason: from getter */
        public final String getInstanceId() {
            return this.instanceId;
        }

        public final DeepLinkPushData copy(String contentTitle, String contentText, String uri, String contentImageUrl, String instanceId) {
            Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
            Intrinsics.checkNotNullParameter(contentText, "contentText");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return new DeepLinkPushData(contentTitle, contentText, uri, contentImageUrl, instanceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeepLinkPushData)) {
                return false;
            }
            DeepLinkPushData deepLinkPushData = (DeepLinkPushData) other;
            return Intrinsics.areEqual(this.contentTitle, deepLinkPushData.contentTitle) && Intrinsics.areEqual(this.contentText, deepLinkPushData.contentText) && Intrinsics.areEqual(this.uri, deepLinkPushData.uri) && Intrinsics.areEqual(this.contentImageUrl, deepLinkPushData.contentImageUrl) && Intrinsics.areEqual(this.instanceId, deepLinkPushData.instanceId);
        }

        public int hashCode() {
            return (((((((this.contentTitle.hashCode() * 31) + this.contentText.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.contentImageUrl.hashCode()) * 31) + this.instanceId.hashCode();
        }

        public String toString() {
            return "DeepLinkPushData(contentTitle=" + this.contentTitle + ", contentText=" + this.contentText + ", uri=" + this.uri + ", contentImageUrl=" + this.contentImageUrl + ", instanceId=" + this.instanceId + ')';
        }

        public DeepLinkPushData(String contentTitle, String contentText, String uri, String contentImageUrl, String instanceId) {
            Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
            Intrinsics.checkNotNullParameter(contentText, "contentText");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(contentImageUrl, "contentImageUrl");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.contentTitle = contentTitle;
            this.contentText = contentText;
            this.uri = uri;
            this.contentImageUrl = contentImageUrl;
            this.instanceId = instanceId;
        }

        public final String getContentTitle() {
            return this.contentTitle;
        }

        public final String getContentText() {
            return this.contentText;
        }

        public final String getUri() {
            return this.uri;
        }

        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        public final String getInstanceId() {
            return this.instanceId;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.instanceId.hashCode();
        }
    }

    /* compiled from: IntercomPushData.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushData$Companion;", "", "<init>", "()V", "createFrom", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "isIntercomPush", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final IntercomPushData createFrom(Context context, Bundle bundle) {
            SimplePushData simplePushDataFromBundle;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            simplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            if (!simplePushDataFromBundle.isIntercomPush()) {
                return null;
            }
            if (Intrinsics.areEqual(simplePushDataFromBundle.getIntercomPushType(), "push_only")) {
                return new DeepLinkPushData(simplePushDataFromBundle.getContentTitle(context), simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getUri(), simplePushDataFromBundle.getContentImageUrl(), simplePushDataFromBundle.getInstanceId());
            }
            String authorName = simplePushDataFromBundle.getAuthorName();
            String imageUrl = simplePushDataFromBundle.getImageUrl();
            String conversationId = simplePushDataFromBundle.getConversationId();
            boolean areEqual = Intrinsics.areEqual(simplePushDataFromBundle.getConversationPartType(), "message");
            ConversationPushData.MessageData.Text messageData = simplePushDataFromBundle.getMessageData();
            if (messageData == null) {
                messageData = new ConversationPushData.MessageData.Text(StringsKt.trim((CharSequence) StringsKt.removePrefix(simplePushDataFromBundle.getContentText(), (CharSequence) (simplePushDataFromBundle.getAuthorName() + AbstractJsonLexerKt.COLON))).toString());
            }
            return new ConversationPushData(authorName, imageUrl, conversationId, messageData, false, areEqual);
        }

        public final boolean isIntercomPush(Bundle bundle) {
            SimplePushData simplePushDataFromBundle;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            simplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            return simplePushDataFromBundle.isIntercomPush();
        }
    }
}
