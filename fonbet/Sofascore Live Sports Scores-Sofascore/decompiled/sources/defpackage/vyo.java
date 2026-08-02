package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vyo extends GoogleApi {
    public static final Api l = new Api("SignalSdk.API", new hyo(), new Api.ClientKey());

    public vyo(Context context) {
        super(context, l, Api.ApiOptions.E7, GoogleApi.Settings.c);
    }

    public final Task i(Bundle bundle) {
        TaskApiCall.Builder a = TaskApiCall.a();
        a.b = false;
        a.c = new Feature[]{j1p.a};
        a.a = new gvo(3, this, bundle);
        return h(0, a.a());
    }

    public final Task j(int i, String str, String str2, boolean z) {
        if (z) {
            return Tasks.forException(new gyo(8));
        }
        TaskApiCall.Builder a = TaskApiCall.a();
        a.c = new Feature[]{j1p.b};
        a.b = false;
        a.a = new fig(this, str, i, str2);
        return h(0, a.a());
    }
}
