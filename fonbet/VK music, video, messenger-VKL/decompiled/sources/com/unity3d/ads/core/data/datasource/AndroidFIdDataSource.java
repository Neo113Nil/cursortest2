package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.fid.FIdBridge;
import com.unity3d.services.core.fid.FIdStaticBridge;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.myc0;

/* compiled from: AndroidFIdDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidFIdDataSource implements FIdDataSource {
    private FIdStaticBridge bridge = new FIdStaticBridge();
    private final Context context;

    public AndroidFIdDataSource(Context context) {
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    public String invoke() {
        Task<String> appInstanceId;
        try {
            FIdBridge fIdStaticBridge = this.bridge.getInstance(this.context);
            if (fIdStaticBridge != null && (appInstanceId = fIdStaticBridge.getAppInstanceId()) != null) {
                return (String) myc0.i(EmptyCoroutineContext.b, new AndroidFIdDataSource$invoke$1$1(appInstanceId, null));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
