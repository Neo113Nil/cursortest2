package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.ue8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzkk extends GoogleApi {
    public static final /* synthetic */ int l = 0;

    static {
        Pair.create(new zzkm(), Tasks.forResult(null));
    }

    public final Task i(String str) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.a = new ue8(str, 4);
        return h(0, a.a());
    }
}
