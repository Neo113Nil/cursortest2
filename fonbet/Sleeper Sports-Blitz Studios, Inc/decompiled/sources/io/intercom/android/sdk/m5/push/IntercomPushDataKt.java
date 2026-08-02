package io.intercom.android.sdk.m5.push;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomPushData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"getSimplePushDataFromBundle", "Lio/intercom/android/sdk/m5/push/SimplePushData;", "bundle", "Landroid/os/Bundle;", "AppName", "", "AuthorName", "Body", "ContentImageUrl", "ConversationId", "ConversationPartType", "ImageUrl", "InstanceId", "IntercomPushType", "Message", "MessageData", "Receiver", "Title", "Uri", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IntercomPushDataKt {
    private static final String AppName = "app_name";
    private static final String AuthorName = "author_name";
    private static final String Body = "body";
    private static final String ContentImageUrl = "content_image_url";
    private static final String ConversationId = "conversation_id";
    private static final String ConversationPartType = "conversation_part_type";
    private static final String ImageUrl = "image_url";
    private static final String InstanceId = "instance_id";
    private static final String IntercomPushType = "intercom_push_type";
    private static final String Message = "message";
    private static final String MessageData = "message_data";
    private static final String Receiver = "receiver";
    private static final String Title = "title";
    private static final String Uri = "uri";

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimplePushData getSimplePushDataFromBundle(Bundle bundle) {
        String string = bundle.getString(IntercomPushType, "");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = bundle.getString("conversation_id", "");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = bundle.getString("title", "");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = bundle.getString("message", "");
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = bundle.getString("receiver", "");
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = bundle.getString(AuthorName, "");
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        String string7 = bundle.getString("body", "");
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = bundle.getString("app_name", "");
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = bundle.getString(ContentImageUrl, "");
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        String string10 = bundle.getString(ImageUrl, "");
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = bundle.getString("uri", "");
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = bundle.getString(InstanceId, "");
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        String string13 = bundle.getString(ConversationPartType, "");
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = bundle.getString(MessageData, "");
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        return new SimplePushData(string, string2, string3, string4, string7, string5, string6, string8, string9, string10, string11, string12, string13, string14);
    }
}
