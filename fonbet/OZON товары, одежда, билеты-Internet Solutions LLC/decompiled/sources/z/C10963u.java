package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10963u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106845a;

    public C10963u(@NonNull I0 i02) {
        this.f106845a = i02.a(Preview3AThreadCrashQuirk.class);
    }

    public final boolean a() {
        return this.f106845a;
    }
}
