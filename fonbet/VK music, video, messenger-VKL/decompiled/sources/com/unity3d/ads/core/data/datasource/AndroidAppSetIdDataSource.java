package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import xsna.j9;
import xsna.s3q0;
import xsna.vtk0;
import xsna.xh50;

/* compiled from: AndroidAppSetIdDataSource.kt */
/* loaded from: classes14.dex */
public final class AndroidAppSetIdDataSource {
    private final Context applicationContext;
    private final xh50<Boolean> isCollecting = vtk0.a(Boolean.FALSE);
    private final xh50<String> _appSetIdFlow = vtk0.a(null);

    public AndroidAppSetIdDataSource(Context context) {
        this.applicationContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invoke$lambda$1(AndroidAppSetIdDataSource androidAppSetIdDataSource, AppSetIdInfo appSetIdInfo) {
        androidAppSetIdDataSource._appSetIdFlow.setValue(appSetIdInfo.getId());
        return s3q0.a;
    }

    public final String getAppSetId() {
        return this._appSetIdFlow.getValue();
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        xh50<Boolean> xh50Var = this.isCollecting;
        do {
            value = xh50Var.getValue();
            bool = value;
            bool.getClass();
        } while (!xh50Var.compareAndSet(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(this.applicationContext).getAppSetIdInfo();
            final j9 j9Var = new j9(this, 1);
            appSetIdInfo.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.z12
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    j9.this.invoke(obj);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
