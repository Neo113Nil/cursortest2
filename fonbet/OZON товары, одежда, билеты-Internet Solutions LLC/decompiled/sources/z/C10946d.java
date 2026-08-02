package z;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10946d {

    /* renamed from: a, reason: collision with root package name */
    private final SmallDisplaySizeQuirk f106822a = (SmallDisplaySizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(SmallDisplaySizeQuirk.class);

    public final Size a() {
        if (this.f106822a != null) {
            return SmallDisplaySizeQuirk.e();
        }
        return null;
    }
}
