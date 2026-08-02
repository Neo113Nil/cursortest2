package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10950h {

    /* renamed from: a, reason: collision with root package name */
    private final CaptureSessionOnClosedNotCalledQuirk f106825a;

    public C10950h(@NonNull I0 i02) {
        this.f106825a = (CaptureSessionOnClosedNotCalledQuirk) i02.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public final boolean a() {
        return this.f106825a != null;
    }
}
