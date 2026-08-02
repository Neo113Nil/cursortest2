package com.google.android.gms.internal.pal;

import android.os.BadParcelableException;
import android.os.Parcel;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfl {
    public static final /* synthetic */ int a = 0;

    static {
        zzfl.class.getClassLoader();
    }

    private zzfl() {
    }

    public static void a(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(ljg.j(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
