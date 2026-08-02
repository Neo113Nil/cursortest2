package com.tkporter.sendsms;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes8.dex */
public class SendSMSModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int REQUEST_CODE = 5235;
    private Callback callback;
    private final ReactApplicationContext reactContext;

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public SendSMSModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callback = null;
        this.reactContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SendSMS";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE && i2 == 0) {
            sendCallback(false, true, false);
        }
    }

    public void sendCallback(Boolean bool, Boolean bool2, Boolean bool3) {
        Callback callback = this.callback;
        if (callback != null) {
            callback.invoke(bool, bool2, bool3);
            this.callback = null;
        }
    }

    @ReactMethod
    public void send(ReadableMap readableMap, Callback callback) {
        try {
            this.callback = callback;
            new SendSMSObserver(this.reactContext, this, readableMap).start();
            String str = "";
            String string = readableMap.hasKey("body") ? readableMap.getString("body") : "";
            ReadableArray array = readableMap.hasKey("recipients") ? readableMap.getArray("recipients") : null;
            ReadableMap map = readableMap.hasKey("attachment") ? readableMap.getMap("attachment") : null;
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this.reactContext);
            Intent intent = new Intent("android.intent.action.SEND");
            if (defaultSmsPackage != null) {
                intent.setPackage(defaultSmsPackage);
            }
            intent.setType("text/plain");
            intent.putExtra("sms_body", string);
            intent.putExtra("android.intent.extra.TEXT", string);
            intent.putExtra("exit_on_sent", true);
            if (map != null) {
                intent.putExtra("android.intent.extra.STREAM", Uri.parse(map.getString("url")));
                intent.setType(map.getString("androidType"));
            }
            if (array != null) {
                String str2 = ";";
                if (Build.MANUFACTURER.equalsIgnoreCase("Samsung")) {
                    str2 = ",";
                }
                for (int i = 0; i < array.size(); i++) {
                    str = (str + array.getString(i)) + str2;
                }
                intent.putExtra("address", str);
            }
            this.reactContext.startActivityForResult(intent, REQUEST_CODE, intent.getExtras());
        } catch (Exception e) {
            sendCallback(false, false, true);
            throw e;
        }
    }
}
