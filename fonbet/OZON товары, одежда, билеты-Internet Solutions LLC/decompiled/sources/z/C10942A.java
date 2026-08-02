package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.A, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10942A {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106818a;

    public C10942A(@NonNull I0 i02) {
        this.f106818a = i02.a(UseTorchAsFlashQuirk.class);
    }

    public final boolean a() {
        return this.f106818a;
    }
}
