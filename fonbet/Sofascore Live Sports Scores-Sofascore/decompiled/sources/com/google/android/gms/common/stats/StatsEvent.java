package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@Deprecated
/* loaded from: classes3.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public interface Types {
    }

    public abstract long Y0();

    public abstract int Z0();

    public abstract String a1();

    public final String toString() {
        long Y0 = Y0();
        int Z0 = Z0();
        String a1 = a1();
        int length = String.valueOf(Y0).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(Z0).length() + 3 + a1.length());
        sb.append(Y0);
        sb.append("\t");
        sb.append(Z0);
        return mz1.o(sb, "\t-1", a1);
    }
}
