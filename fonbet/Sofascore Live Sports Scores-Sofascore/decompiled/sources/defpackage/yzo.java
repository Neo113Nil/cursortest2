package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yzo extends awo {
    public final int F;

    public yzo(int i, Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, context, looper, baseConnectionCallbacks, baseOnConnectionFailedListener);
        this.F = i;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof e0p ? (e0p) queryLocalInterface : new e0p(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return this.F;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.gass.START";
    }
}
