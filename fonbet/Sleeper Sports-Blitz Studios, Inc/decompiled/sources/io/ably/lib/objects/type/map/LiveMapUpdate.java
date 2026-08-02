package io.ably.lib.objects.type.map;

import io.ably.lib.objects.type.ObjectUpdate;
import java.util.Map;

/* loaded from: classes9.dex */
public class LiveMapUpdate extends ObjectUpdate {

    public enum Change {
        UPDATED,
        REMOVED
    }

    public LiveMapUpdate() {
        super(null);
    }

    public LiveMapUpdate(Map<String, Change> map) {
        super(map);
    }

    public Map<String, Change> getUpdate() {
        return (Map) this.update;
    }

    public String toString() {
        if (this.update == null) {
            return "LiveMapUpdate{no change}";
        }
        return "LiveMapUpdate{changes=" + getUpdate() + "}";
    }
}
