package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.emb;
import xsna.izs;
import xsna.j5g;
import xsna.s3q0;
import xsna.vtk0;
import xsna.xh50;
import xsna.zcl;

/* compiled from: Storage.kt */
/* loaded from: classes14.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final xh50<List<izs<StorageEventInfo, s3q0>>> onStorageEventCallbacks = vtk0.a(EmptyList.b);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    /* compiled from: Storage.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void addStorageEventCallback(izs<? super StorageEventInfo, s3q0> izsVar) {
            Object value;
            xh50 xh50Var = Storage.onStorageEventCallbacks;
            do {
                value = xh50Var.getValue();
            } while (!xh50Var.compareAndSet(value, j5g.v0(izsVar, (List) value)));
        }

        public final void removeStorageEventCallback(izs<? super StorageEventInfo, s3q0> izsVar) {
            Object value;
            xh50 xh50Var = Storage.onStorageEventCallbacks;
            do {
                value = xh50Var.getValue();
            } while (!xh50Var.compareAndSet(value, j5g.s0((List) value, izsVar)));
        }

        private Companion() {
        }
    }

    public Storage(String str, StorageManager.StorageType storageType) {
        this._targetFileName = str;
        this.type = storageType;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] readFileBytes;
        boolean z = false;
        try {
            try {
                readFileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (FileNotFoundException e) {
                DeviceLog.debug("Storage JSON file not found in local cache:", e);
            }
        } catch (Exception e2) {
            DeviceLog.debug("Failed to read storage JSON file:", e2);
        }
        if (readFileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(readFileBytes, emb.b)));
        z = true;
        return z;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List<izs<StorageEventInfo, s3q0>> value = onStorageEventCallbacks.getValue();
        if (value.isEmpty()) {
            return;
        }
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
