package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.core.impl.U0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10948f {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraSupportedSurfaceCombinationsQuirk f106824a = (ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedSurfaceCombinationsQuirk.class);

    @NonNull
    public final List<U0> a(@NonNull String str) {
        return this.f106824a == null ? new ArrayList() : ExtraSupportedSurfaceCombinationsQuirk.e(str);
    }
}
