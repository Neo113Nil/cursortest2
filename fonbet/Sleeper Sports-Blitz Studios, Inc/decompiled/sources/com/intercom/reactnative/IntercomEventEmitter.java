package com.intercom.reactnative;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = IntercomEventEmitter.NAME)
/* loaded from: classes8.dex */
public class IntercomEventEmitter extends ReactContextBaseJavaModule {
    public static final String NAME = "IntercomEventEmitter";
    private static final String UNREAD_COUNT_CHANGE_NOTIFICATION = "IntercomUnreadConversationCountDidChangeNotification";
    private int activeListenersCount;
    private final UnreadConversationCountListener unreadConversationCountListener;

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public IntercomEventEmitter(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.activeListenersCount = 0;
        this.unreadConversationCountListener = new UnreadConversationCountListener() { // from class: com.intercom.reactnative.IntercomEventEmitter.1
            @Override // io.intercom.android.sdk.UnreadConversationCountListener
            public void onCountUpdate(int i) {
                IntercomEventEmitter.this.updateUnreadCount();
            }
        };
    }

    @ReactMethod
    public void startEventListener() {
        try {
            if (this.activeListenersCount == 0) {
                Intercom.client().addUnreadConversationCountListener(this.unreadConversationCountListener);
            }
            this.activeListenersCount++;
        } catch (Exception e) {
            Log.e(NAME, "startEventListener error:");
            Log.e(NAME, e.toString());
        }
    }

    @ReactMethod
    public void removeEventListener() {
        try {
            int i = this.activeListenersCount - 1;
            this.activeListenersCount = i;
            if (i == 0) {
                Intercom.client().removeUnreadConversationCountListener(this.unreadConversationCountListener);
            }
        } catch (Exception e) {
            Log.e(NAME, "removeEventListener error:");
            Log.e(NAME, e.toString());
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("UNREAD_COUNT_CHANGE_NOTIFICATION", UNREAD_COUNT_CHANGE_NOTIFICATION);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUnreadCount() {
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("count", Intercom.client().getUnreadConversationCount());
            Log.d(NAME, "handleUpdateUnreadCount");
            sendEvent(UNREAD_COUNT_CHANGE_NOTIFICATION, createMap);
        } catch (Exception unused) {
            Log.e(NAME, "client called before Intercom initialization");
        }
    }

    private void sendEvent(String str, @Nullable WritableMap writableMap) {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception unused) {
                Log.e(NAME, "sendEvent called before bundle loaded");
            }
        }
    }
}
