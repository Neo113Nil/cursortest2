package com.google.android.gms.cast.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import defpackage.h2o;
import defpackage.tro;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzn extends GoogleApi {
    public static final Api l = new Api("CastApi.API", new h2o(), new Api.ClientKey());

    public final Task i(String[] strArr) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new tro(this, strArr, 0);
        a.c = new Feature[]{com.google.android.gms.cast.zzaq.b};
        a.b = false;
        a.d = 8425;
        return h(0, a.a());
    }
}
