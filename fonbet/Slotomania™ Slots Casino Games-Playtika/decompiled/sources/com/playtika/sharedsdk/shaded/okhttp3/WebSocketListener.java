package com.playtika.sharedsdk.shaded.okhttp3;

import com.braze.Constants;
import com.playtika.sharedsdk.shaded.okio.ByteString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketListener.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0017"}, d2 = {"Lcom/playtika/sharedsdk/shaded/okhttp3/WebSocketListener;", "", "<init>", "()V", "onOpen", "", "webSocket", "Lcom/playtika/sharedsdk/shaded/okhttp3/WebSocket;", "response", "Lcom/playtika/sharedsdk/shaded/okhttp3/Response;", "onMessage", "text", "", "bytes", "Lcom/playtika/sharedsdk/shaded/okio/ByteString;", "onClosing", "code", "", "reason", "onClosed", "onFailure", Constants.BRAZE_PUSH_TITLE_KEY, "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int code, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onClosing(WebSocket webSocket, int code, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
    }

    public void onMessage(WebSocket webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
    }
}
