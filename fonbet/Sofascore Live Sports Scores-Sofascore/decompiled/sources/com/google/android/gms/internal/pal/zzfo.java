package com.google.android.gms.internal.pal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfo extends RemoteCreator {
    static {
        new zzfo();
    }

    private zzfo() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof zzfs ? (zzfs) queryLocalInterface : new zzfs(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }
}
