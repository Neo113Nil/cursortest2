package com.mattermost.pasteinputtext;

import android.net.Uri;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Metadata;

/* compiled from: IPasteInputListener.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/mattermost/pasteinputtext/IPasteInputListener;", "", "onPaste", "", "itemUri", "Landroid/net/Uri;", "eventDispatcher", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "mattermost_react-native-paste-input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IPasteInputListener {
    void onPaste(Uri itemUri, EventDispatcher eventDispatcher);
}
