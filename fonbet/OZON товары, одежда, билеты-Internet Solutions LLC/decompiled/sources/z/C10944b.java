package z;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.core.impl.I0;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10944b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106820a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f106821b;

    public C10944b(@NonNull I0 i02) {
        this.f106820a = i02.a(ImageCaptureFailWithAutoFlashQuirk.class);
        this.f106821b = androidx.camera.camera2.internal.compat.quirk.b.b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) != null;
    }

    public final int a() {
        return (this.f106820a || this.f106821b) ? 1 : 2;
    }
}
