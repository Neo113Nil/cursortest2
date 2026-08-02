package com.unity3d.services.core.device;

import com.ironsource.U3;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.km5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0006\u0010\u000f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/unity3d/services/core/device/Storage;", "Lcom/unity3d/services/core/misc/JsonStorage;", "_targetFileName", "", "type", "Lcom/unity3d/services/core/device/StorageManager$StorageType;", "<init>", "(Ljava/lang/String;Lcom/unity3d/services/core/device/StorageManager$StorageType;)V", "getType", "()Lcom/unity3d/services/core/device/StorageManager$StorageType;", "readStorage", "", "initStorage", "writeStorage", "clearStorage", "storageFileExists", "sendEvent", "", "eventType", "Lcom/unity3d/services/core/device/StorageEvent;", U3.i.X, "", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Storage extends JsonStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final f1d onStorageEventCallbacks = gdi.a(km5.a);

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    public Storage(@NotNull String str, @NotNull StorageManager.StorageType storageType) {
        str.getClass();
        storageType.getClass();
        this._targetFileName = str;
        this.type = storageType;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @NotNull
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
        setData(new JSONObject(new String(readFileBytes, Charsets.UTF_8)));
        z = true;
        return z;
    }

    public final synchronized void sendEvent(@Nullable StorageEvent eventType, @Nullable Object value) {
        List list = (List) ((fdi) onStorageEventCallbacks).getValue();
        if (list.isEmpty()) {
            return;
        }
        eventType.getClass();
        StorageEventInfo storageEventInfo = new StorageEventInfo(eventType, this.type, value);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(storageEventInfo);
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\tR,\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/device/Storage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "", "callback", "addStorageEventCallback", "(Lkotlin/jvm/functions/Function1;)V", "removeStorageEventCallback", "Lf1d;", "", "onStorageEventCallbacks", "Lf1d;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            fdi fdiVar;
            Object value;
            callback.getClass();
            f1d f1dVar = Storage.onStorageEventCallbacks;
            do {
                fdiVar = (fdi) f1dVar;
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, CollectionsKt.x0((List) value, callback)));
        }

        public final void removeStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            fdi fdiVar;
            Object value;
            callback.getClass();
            f1d f1dVar = Storage.onStorageEventCallbacks;
            do {
                fdiVar = (fdi) f1dVar;
                value = fdiVar.getValue();
            } while (!fdiVar.k(value, CollectionsKt.s0((List) value, callback)));
        }

        private Companion() {
        }
    }
}
