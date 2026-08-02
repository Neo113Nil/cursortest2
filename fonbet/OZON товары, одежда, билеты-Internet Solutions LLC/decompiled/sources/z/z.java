package z;

import C.S;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.I0;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final TorchFlashRequiredFor3aUpdateQuirk f106853a;

    public z(@NonNull I0 i02) {
        this.f106853a = (TorchFlashRequiredFor3aUpdateQuirk) i02.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public final boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f106853a;
        boolean z11 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.e();
        S.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z11);
        return z11;
    }
}
