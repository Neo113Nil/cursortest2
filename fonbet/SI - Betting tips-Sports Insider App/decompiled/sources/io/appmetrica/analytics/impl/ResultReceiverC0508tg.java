package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ResultReceiverC0508tg extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0155fg f14681a;

    public ResultReceiverC0508tg(Handler handler, InterfaceC0155fg interfaceC0155fg) {
        super(handler);
        this.f14681a = interfaceC0155fg;
    }

    public static void a(ResultReceiver resultReceiver, C0359ng c0359ng) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("referrer", c0359ng == null ? null : c0359ng.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i5, Bundle bundle) {
        if (i5 == 1) {
            C0359ng c0359ng = null;
            try {
                byte[] byteArray = bundle.getByteArray("referrer");
                if (byteArray != null && byteArray.length != 0) {
                    c0359ng = new C0359ng(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f14681a.a(c0359ng);
        }
    }
}
