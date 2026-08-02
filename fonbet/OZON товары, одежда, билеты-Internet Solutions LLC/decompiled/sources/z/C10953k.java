package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.core.impl.V0;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10953k {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraCroppingQuirk f106829a = (ExtraCroppingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraCroppingQuirk.class);

    @NonNull
    public final Size a(@NonNull Size size) {
        Size e11;
        return (this.f106829a == null || (e11 = ExtraCroppingQuirk.e(V0.b.PRIV)) == null) ? size : e11.getHeight() * e11.getWidth() > size.getHeight() * size.getWidth() ? e11 : size;
    }
}
