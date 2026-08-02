package io.ably.lib.types;

import com.google.gson.JsonSyntaxException;
import io.ably.lib.util.Log;
import io.ably.lib.util.Serialisation;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class RecoveryKeyContext {
    private static final String TAG = "RecoveryKeyContext";
    private final Map<String, String> channelSerials;
    private final String connectionKey;
    private final long msgSerial;

    public RecoveryKeyContext(String str, long j, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.channelSerials = hashMap;
        this.connectionKey = str;
        this.msgSerial = j;
        hashMap.putAll(map);
    }

    public String getConnectionKey() {
        return this.connectionKey;
    }

    public long getMsgSerial() {
        return this.msgSerial;
    }

    public Map<String, String> getChannelSerials() {
        return this.channelSerials;
    }

    public String encode() {
        return Serialisation.gson.toJson(this);
    }

    public static RecoveryKeyContext decode(String str) {
        try {
            return (RecoveryKeyContext) Serialisation.gson.fromJson(str, RecoveryKeyContext.class);
        } catch (JsonSyntaxException e) {
            Log.e(TAG, "Cannot create recovery key from json: " + e.getMessage());
            return null;
        }
    }
}
