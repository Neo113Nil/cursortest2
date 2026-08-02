package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public abstract long c();

    public abstract int l0();

    public abstract String o0();

    public final String toString() {
        long c2 = c();
        int l02 = l0();
        String o02 = o0();
        int length = String.valueOf(c2).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(l02).length() + 3 + o02.length());
        sb2.append(c2);
        sb2.append("\t");
        sb2.append(l02);
        return e.l(sb2, "\t-1", o02);
    }
}
