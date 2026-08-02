package com.reactnativecompressor.Utils;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okhttp3.Call;

/* compiled from: HttpCallManager.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\tR\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/reactnativecompressor/Utils/HttpCallManager;", "", "<init>", "()V", "resumableCalls", "", "", "Lokhttp3/Call;", "registerTask", "", NotificationCompat.CATEGORY_CALL, "uuid", "taskForId", "downloadTaskForId", "uploadTaskForId", "taskPop", "unregisterTask", "cancelAllTasks", "react-native-compressor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HttpCallManager {
    private Map<String, Call> resumableCalls = new HashMap();

    public final void registerTask(Call call, String uuid) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.resumableCalls.put(uuid, call);
    }

    public final Call taskForId(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return this.resumableCalls.get(uuid);
    }

    public final Call downloadTaskForId(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return taskForId(uuid);
    }

    public final Call uploadTaskForId(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return taskForId(uuid);
    }

    public final Call taskPop() {
        return (Call) TypeIntrinsics.asMutableMap(this.resumableCalls).remove((String) CollectionsKt.lastOrNull(this.resumableCalls.keySet()));
    }

    public final void unregisterTask(String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.resumableCalls.remove(uuid);
    }

    public final void cancelAllTasks() {
        Iterator<Map.Entry<String, Call>> it = this.resumableCalls.entrySet().iterator();
        while (it.hasNext()) {
            Call value = it.next().getValue();
            if (value != null) {
                value.cancel();
            }
        }
        this.resumableCalls.clear();
    }
}
