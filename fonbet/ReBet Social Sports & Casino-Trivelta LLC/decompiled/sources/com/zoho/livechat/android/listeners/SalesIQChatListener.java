package com.zoho.livechat.android.listeners;

import android.net.Uri;
import androidx.annotation.Keep;
import com.zoho.livechat.android.VisitorChat;
import we.b;

/* loaded from: classes4.dex */
public interface SalesIQChatListener {
    @Keep
    void handleChatAttended(VisitorChat visitorChat);

    @Keep
    void handleChatClosed(VisitorChat visitorChat);

    @Keep
    void handleChatMissed(VisitorChat visitorChat);

    @Keep
    void handleChatOpened(VisitorChat visitorChat);

    @Keep
    void handleChatReOpened(VisitorChat visitorChat);

    @Keep
    void handleChatViewClose(String str);

    @Keep
    void handleChatViewOpen(String str);

    @Keep
    void handleFeedback(VisitorChat visitorChat);

    @Keep
    void handleQueuePositionChange(VisitorChat visitorChat);

    @Keep
    void handleRating(VisitorChat visitorChat);

    @Keep
    default boolean handleUri(Uri uri, VisitorChat visitorChat) {
        return true;
    }

    @Keep
    default void onChatExpired(VisitorChat visitorChat) {
    }

    @Keep
    default void onError(VisitorChat visitorChat, b bVar) {
    }
}
