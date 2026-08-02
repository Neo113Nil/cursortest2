package com.google.android.gms.wearable.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.Wearable;
import defpackage.igf;
import defpackage.jwn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdt extends DataClient {
    public final zzdg l;

    public zzdt(Context context, GoogleApi.Settings settings) {
        super(context, Wearable.a, Wearable.WearableOptions.a, settings);
        this.l = new zzdg();
    }

    public final Task i(PutDataRequest putDataRequest) {
        zzdg zzdgVar = this.l;
        zabq zabqVar = this.i;
        jwn jwnVar = new jwn(zzdgVar, zabqVar, putDataRequest);
        zabqVar.c.g(0, jwnVar);
        igf igfVar = igf.f;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        jwnVar.c(new c(jwnVar, taskCompletionSource, igfVar));
        return taskCompletionSource.getTask();
    }
}
