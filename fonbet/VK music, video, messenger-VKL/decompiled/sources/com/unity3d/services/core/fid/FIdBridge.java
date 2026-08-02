package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.services.core.reflection.GenericBridge;
import kotlin.Pair;
import xsna.on00;

/* compiled from: FIdBridge.kt */
/* loaded from: classes14.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    public FIdBridge(Object obj) {
        super(on00.f(new Pair(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        this.instance = obj;
    }

    public final Task<String> getAppInstanceId() {
        Task<String> task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        return task == null ? Tasks.forResult(null) : task;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
