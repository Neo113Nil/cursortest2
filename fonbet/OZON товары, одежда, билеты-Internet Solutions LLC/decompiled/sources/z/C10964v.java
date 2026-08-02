package z;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10964v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106846a;

    public C10964v() {
        this.f106846a = ((StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
    }

    public final boolean a(@NonNull ArrayList arrayList, boolean z11) {
        if (!this.f106846a || !z11) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (intValue == 2 || intValue == 3) {
                return true;
            }
        }
        return false;
    }
}
