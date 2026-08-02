package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.system.NetworkType;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ee extends Dc {
    public Ee(Integer num) {
        super(num);
        a(NetworkType.CELL, 0);
        a(NetworkType.WIFI, 1);
        a(NetworkType.BLUETOOTH, 3);
        a(NetworkType.ETHERNET, 4);
        a(NetworkType.MOBILE_DUN, 5);
        a(NetworkType.MOBILE_HIPRI, 6);
        a(NetworkType.MOBILE_MMS, 7);
        a(NetworkType.MOBILE_SUPL, 8);
        a(NetworkType.VPN, 9);
        a(NetworkType.WIMAX, 10);
        a(NetworkType.LOWPAN, 11);
        a(NetworkType.WIFI_AWARE, 12);
    }
}
