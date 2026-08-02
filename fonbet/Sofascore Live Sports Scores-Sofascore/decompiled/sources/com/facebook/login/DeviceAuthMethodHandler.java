package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginClient;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "com/facebook/login/v", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static ScheduledThreadPoolExecutor e;
    public final String c;
    public static final v d = new v();

    @NotNull
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new a(1);

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        this.b = loginClient;
        this.c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f, reason: from getter */
    public final String getD() {
        return this.c;
    }

    @Override // com.facebook.login.LoginMethodHandler
    public final int l(LoginClient.Request request) {
        request.getClass();
        FragmentActivity f = d().f();
        if (f == null || f.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.p(f.k(), "login_with_facebook");
        deviceAuthDialog.y(request);
        return 1;
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        this.c = "device_auth";
    }
}
