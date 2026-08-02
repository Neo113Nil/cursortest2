package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationStylePushUI.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u001a0\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0000\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a,\u0010\u0017\u001a\u00020\u0018*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0000\"\u000e\u0010\u001f\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"buildConversationStyleNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "conversation", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "shortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "conversationPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "notificationChannel", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "isSilent", "", "customStack", "Landroid/app/TaskStackBuilder;", "buildConversationStyleSummaryNotification", "conversations", "", "getMessagesContentText", "", "messagesCount", "", "toMessage", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation$Message;", "timestamp", "", "avatarBitmap", "Landroid/graphics/Bitmap;", "contentImageUri", "Landroid/net/Uri;", "SUMMARY_NOTIFICATION_ID", "KEY_GROUP_CONVERSATION", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationStylePushUIKt {
    public static final String KEY_GROUP_CONVERSATION = "io.intercom.android.sdk.INTERCOM_KEY_GROUP_CONVERSATION";
    public static final int SUMMARY_NOTIFICATION_ID = 9999997;

    public static /* synthetic */ Notification buildConversationStyleNotification$default(Context context, IntercomPushConversation intercomPushConversation, ShortcutInfoCompat shortcutInfoCompat, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z, TaskStackBuilder taskStackBuilder, int i, Object obj) {
        if ((i & 64) != 0) {
            taskStackBuilder = null;
        }
        return buildConversationStyleNotification(context, intercomPushConversation, shortcutInfoCompat, conversationPushData, notificationChannel, z, taskStackBuilder);
    }

    public static final Notification buildConversationStyleNotification(Context context, IntercomPushConversation conversation, ShortcutInfoCompat shortcutInfoCompat, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z, TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(conversationPushData, "conversationPushData");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String messagesContentText = getMessagesContentText(context, conversation.getMessages().size());
        String string2 = context.getString(R.string.intercom_you);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(new Person.Builder().setName(string2).build());
        for (IntercomPushConversation.Message message : conversation.getMessages()) {
            NotificationCompat.MessagingStyle.Message message2 = new NotificationCompat.MessagingStyle.Message(message.getMessage(), message.getTimestamp(), message.getPerson());
            Uri contentImageUri = message.getContentImageUri();
            if (contentImageUri != null) {
                message2.setData("image/", contentImageUri);
            }
            messagingStyle.addMessage(message2);
        }
        NotificationCompat.Builder contentIntent = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).setStyle(messagingStyle).setShortcutInfo(shortcutInfoCompat).setContentIntent(ConversationDeepLinkRouterKt.buildIntentForConversationScreen(context, conversation.getConversationId(), taskStackBuilder));
        contentIntent.addAction(ConversationActionHandlerKt.buildReplyAction(context, conversation.getConversationId(), taskStackBuilder));
        if (conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Attachment) {
            contentIntent.addAction(ConversationActionHandlerKt.buildContextualAction(context, ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getUrl()));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            contentIntent.setBubbleMetadata(BubbleMetaDataKt.getBubbleMetaData(context, conversation));
        }
        Notification build = contentIntent.setGroup(KEY_GROUP_CONVERSATION).setSilent(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final Notification buildConversationStyleSummaryNotification(Context context, List<IntercomPushConversation> conversations, NotificationChannel notificationChannel, TaskStackBuilder taskStackBuilder) {
        CharSequence name;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversations, "conversations");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        List<IntercomPushConversation> list = conversations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((IntercomPushConversation) it.next()).getMessages());
        }
        String messagesContentText = getMessagesContentText(context, arrayList.size());
        NotificationCompat.InboxStyle bigContentTitle = new NotificationCompat.InboxStyle().setBigContentTitle(string);
        Intrinsics.checkNotNullExpressionValue(bigContentTitle, "setBigContentTitle(...)");
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            for (IntercomPushConversation.Message message : ((IntercomPushConversation) it2.next()).getMessages()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Person person = message.getPerson();
                if (person != null && (name = person.getName()) != null) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) name);
                    sb.append(' ');
                    spannableStringBuilder.append((CharSequence) sb.toString());
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                }
                spannableStringBuilder.append((CharSequence) message.getMessage());
                bigContentTitle.addLine(new SpannedString(spannableStringBuilder));
            }
        }
        Notification build = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel).setContentIntent(ConversationDeepLinkRouterKt.buildIntentForMessagesScreen(context, taskStackBuilder)).setGroup(KEY_GROUP_CONVERSATION).setGroupSummary(true).setStyle(bigContentTitle).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private static final String getMessagesContentText(Context context, int i) {
        String obj;
        if (i == 1) {
            obj = context.getString(R.string.intercom_one_new_message);
        } else {
            obj = Phrase.from(context, R.string.intercom_new_messages).put("n", i).format().toString();
        }
        Intrinsics.checkNotNull(obj);
        return obj;
    }

    public static /* synthetic */ IntercomPushConversation.Message toMessage$default(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        if ((i & 4) != 0) {
            uri = null;
        }
        return toMessage(conversationPushData, j, bitmap, uri);
    }

    public static final IntercomPushConversation.Message toMessage(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri) {
        String title;
        Intrinsics.checkNotNullParameter(conversationPushData, "<this>");
        Person person = null;
        if (!conversationPushData.isCurrentUser()) {
            person = new Person.Builder().setName(conversationPushData.getAuthorName()).setKey(conversationPushData.getAuthorName() + conversationPushData.getAvatarUrl()).setIcon(bitmap != null ? IconCompat.createWithBitmap(bitmap) : null).build();
        }
        Person person2 = person;
        IntercomPushData.ConversationPushData.MessageData messageData = conversationPushData.getMessageData();
        if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Text) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Text) conversationPushData.getMessageData()).getMessage();
        } else if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getTitle();
        } else {
            if (!(messageData instanceof IntercomPushData.ConversationPushData.MessageData.Attachment)) {
                throw new NoWhenBranchMatchedException();
            }
            title = ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getTitle();
        }
        return new IntercomPushConversation.Message(person2, j, title, uri);
    }
}
