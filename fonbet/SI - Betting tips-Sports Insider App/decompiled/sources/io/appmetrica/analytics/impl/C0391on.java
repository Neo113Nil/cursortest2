package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391on {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0441qn f14432a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0441qn f14433b;

    public C0391on(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.f14432a = new L2(new C0364nl(context));
            this.f14433b = new L2(new Lc(context));
        } else {
            this.f14432a = new Y7();
            this.f14433b = new Y7();
        }
    }
}
