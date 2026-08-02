package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i55 implements hkh {
    public final Context a;

    public i55(Context context) {
        this.a = context;
    }

    @Override // defpackage.hkh
    public final Object c(rq3 rq3Var) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        u25 u25Var = new u25(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new jjh(u25Var, u25Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i55) {
            return Intrinsics.c(this.a, ((i55) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
