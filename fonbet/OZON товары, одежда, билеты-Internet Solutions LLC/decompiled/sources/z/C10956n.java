package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10956n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106833a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f106834b = false;

    public C10956n(@NonNull I0 i02) {
        this.f106833a = i02.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public final void a() {
        this.f106834b = false;
    }

    public final void b() {
        this.f106834b = true;
    }

    public final boolean c(int i11) {
        return this.f106834b && i11 == 0 && this.f106833a;
    }
}
