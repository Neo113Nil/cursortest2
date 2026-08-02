package com.tkporter.sendsms;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class SendSMSObserver extends ContentObserver {
    private static final String COLUMN_ADDRESS = "address";
    private static final String COLUMN_TYPE = "type";
    private static final int MESSAGE_TYPE_ALL = 0;
    private static final int MESSAGE_TYPE_DRAFT = 3;
    private static final int MESSAGE_TYPE_FAILED = 5;
    private static final int MESSAGE_TYPE_INBOX = 1;
    private static final int MESSAGE_TYPE_OUTBOX = 4;
    private static final int MESSAGE_TYPE_QUEUED = 6;
    private static final int MESSAGE_TYPE_SENT = 2;
    private boolean isAuthorizedForCallback;
    private SendSMSModule module;
    private ContentResolver resolver;
    private ReadableArray successTypes;
    private Map<String, Integer> types;
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final Uri uri = Uri.parse("content://sms/");
    private static final String[] PROJECTION = {"address", "type"};

    public SendSMSObserver(Context context, SendSMSModule sendSMSModule, ReadableMap readableMap) {
        super(handler);
        this.resolver = null;
        HashMap hashMap = new HashMap();
        this.types = hashMap;
        hashMap.put("all", 0);
        this.types.put("inbox", 1);
        this.types.put(MetricTracker.Action.SENT, 2);
        this.types.put("draft", 3);
        this.types.put("outbox", 4);
        this.types.put(MetricTracker.Action.FAILED, 5);
        this.types.put("queued", 6);
        this.successTypes = getSuccessTypes(readableMap);
        this.module = sendSMSModule;
        this.resolver = context.getContentResolver();
        this.isAuthorizedForCallback = isAuthorizedForCallback(readableMap);
    }

    private ReadableArray getSuccessTypes(ReadableMap readableMap) {
        if (readableMap.hasKey("successTypes")) {
            return readableMap.getArray("successTypes");
        }
        throw new IllegalStateException("Must provide successTypes. Read react-native-sms/README.md");
    }

    private boolean isAuthorizedForCallback(ReadableMap readableMap) {
        if (readableMap.hasKey("isAuthorizedForCallback")) {
            return readableMap.getBoolean("isAuthorizedForCallback");
        }
        return false;
    }

    public void start() {
        if (this.isAuthorizedForCallback) {
            ContentResolver contentResolver = this.resolver;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(uri, true, this);
                return;
            }
            throw new IllegalStateException("Current SmsSendObserver instance is invalid");
        }
    }

    public void stop() {
        ContentResolver contentResolver = this.resolver;
        if (contentResolver != null) {
            contentResolver.unregisterContentObserver(this);
        }
    }

    private void messageSuccess() {
        this.module.sendCallback(true, false, false);
        stop();
    }

    private void messageGeneric() {
        this.module.sendCallback(false, false, false);
        stop();
    }

    private void messageError() {
        this.module.sendCallback(false, false, true);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        try {
            if (!this.isAuthorizedForCallback) {
                messageGeneric();
                return;
            }
            Cursor query = this.resolver.query(uri, PROJECTION, null, null, null);
            if (query != null && query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndex("type"));
                System.out.println("onChange() type: " + i);
                int i2 = 0;
                while (true) {
                    if (i2 < this.successTypes.size()) {
                        if (i == this.types.get(this.successTypes.getString(i2)).intValue()) {
                            messageSuccess();
                            break;
                        }
                        i2++;
                    } else {
                        messageError();
                        break;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } finally {
        }
    }
}
