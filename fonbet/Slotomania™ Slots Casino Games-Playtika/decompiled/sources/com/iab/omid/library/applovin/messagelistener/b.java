package com.iab.omid.library.applovin.messagelistener;

import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
