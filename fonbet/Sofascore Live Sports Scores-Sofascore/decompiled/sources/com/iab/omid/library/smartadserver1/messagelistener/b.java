package com.iab.omid.library.smartadserver1.messagelistener;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public interface b {
    String getListenerName();

    void onMessageReceived(String str, JSONObject jSONObject);

    void onWebMessageListenerUnsupported();
}
