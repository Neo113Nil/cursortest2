package z;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.T;
import u.C9887a;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10943a {

    /* renamed from: a, reason: collision with root package name */
    private final Range<Integer> f106819a;

    public C10943a(@NonNull I0 i02) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) i02.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f106819a = null;
        } else {
            this.f106819a = aeFpsRangeLegacyQuirk.e();
        }
    }

    public final void a(@NonNull C9887a.C2193a c2193a) {
        Range<Integer> range = this.f106819a;
        if (range != null) {
            c2193a.f(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, T.b.REQUIRED);
        }
    }
}
