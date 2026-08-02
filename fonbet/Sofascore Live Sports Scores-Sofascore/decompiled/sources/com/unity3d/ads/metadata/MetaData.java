package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEvent;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes6.dex */
public class MetaData extends JsonStorage {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() == null) {
            return str;
        }
        return getCategory() + "." + str;
    }

    public void commit() {
        if (!StorageManager.init(this._context)) {
            DeviceLog.error("Unity Ads could not commit metadata due to storage error");
            return;
        }
        Storage storage = StorageManager.getStorage(getStorageType());
        if (getData() == null || storage == null) {
            return;
        }
        Iterator<String> keys = getData().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = get(next);
            if (storage.get(next) != null && (storage.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                try {
                    obj = Utilities.mergeJsonObjects((JSONObject) obj, (JSONObject) storage.get(next));
                } catch (Exception e) {
                    DeviceLog.exception("Exception merging JSONs", e);
                }
            }
            storage.set(next, obj);
        }
        storage.writeStorage();
        storage.sendEvent(StorageEvent.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    public StorageManager.StorageType getStorageType() {
        return StorageManager.StorageType.PUBLIC;
    }

    @Override // com.unity3d.services.core.misc.JsonStorage
    public synchronized boolean set(String str, Object obj) {
        boolean z;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getActualKey(str));
            sb.append(".ts");
            z = super.set(sb.toString(), Long.valueOf(System.currentTimeMillis()));
        }
        return z;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }

    private synchronized boolean set(String str, int i) {
        return set(str, Integer.valueOf(i));
    }

    private synchronized boolean set(String str, long j) {
        return set(str, Long.valueOf(j));
    }

    private synchronized boolean set(String str, boolean z) {
        return set(str, Boolean.valueOf(z));
    }
}
