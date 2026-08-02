package z;

import C.U;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10954l {

    /* renamed from: a, reason: collision with root package name */
    private final I0 f106830a;

    public C10954l(@NonNull I0 i02) {
        this.f106830a = i02;
    }

    @NonNull
    public final PointF a(@NonNull U u11, int i11) {
        return (i11 == 1 && this.f106830a.a(AfRegionFlipHorizontallyQuirk.class)) ? new PointF(1.0f - u11.b(), u11.c()) : new PointF(u11.b(), u11.c());
    }
}
