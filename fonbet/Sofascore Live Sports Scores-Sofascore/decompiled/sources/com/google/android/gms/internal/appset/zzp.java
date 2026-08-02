package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.oyo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzp extends GoogleApi<Api.ApiOptions.NoOptions> implements AppSetIdClient {
    public static final Api n = new Api("AppSet.API", new oyo(), new Api.ClientKey());
    public final Context l;
    public final GoogleApiAvailabilityLight m;

    public zzp(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, n, Api.ApiOptions.E7, GoogleApi.Settings.c);
        this.l = context;
        this.m = googleApiAvailabilityLight;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        if (this.m.b(this.l, 212800000) != 0) {
            return Tasks.forException(new ApiException(new Status(17, null, null, null)));
        }
        TaskApiCall.Builder a = TaskApiCall.a();
        a.c = new Feature[]{com.google.android.gms.appset.zze.zza};
        a.a = new zzm();
        a.b = false;
        a.d = 27601;
        return h(0, a.a());
    }
}
