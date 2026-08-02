package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class awj {
    public abstract String a();

    public abstract Bitmap b(Bitmap bitmap, kjh kjhVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awj) && Intrinsics.c(a(), ((awj) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return dmi.r(duf.a.getOrCreateKotlinClass(getClass()).getSimpleName(), "(cacheKey=", a(), ")");
    }
}
