package defpackage;

import android.os.Parcelable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzg;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class j6n extends GoogleApi implements zzg {
    public static final Logger l;

    static {
        new Api("GoogleAuthService.API", new w8p(), new Api.ClientKey());
        l = new Logger("Auth", "GoogleAuthServiceClient");
    }

    public static void i(Status status, Parcelable parcelable, TaskCompletionSource taskCompletionSource) {
        if (status.Y0() ? taskCompletionSource.trySetResult(parcelable) : taskCompletionSource.trySetException(ApiExceptionUtil.a(status))) {
            return;
        }
        l.a("The task is already complete.", new Object[0]);
    }
}
