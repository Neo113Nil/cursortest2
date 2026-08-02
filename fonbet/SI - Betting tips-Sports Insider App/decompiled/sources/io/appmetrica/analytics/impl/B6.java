package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class B6 extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final A6 f12038a;

    public B6(Handler handler, A6 a62) {
        super(handler);
        this.f12038a = a62;
    }

    public static void a(ResultReceiver resultReceiver, S3 s32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            s32.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f12038a.a(i5, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Jl jl, S3 s32) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", jl.f12450a);
            s32.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
