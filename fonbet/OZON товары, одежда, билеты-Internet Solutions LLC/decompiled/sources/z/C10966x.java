package z;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.I0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10966x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f106850a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f106851b;

    public C10966x(@NonNull I0 i02) {
        boolean z11;
        Iterator it = i02.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z11 = true;
                break;
            }
        }
        this.f106850a = z11;
        this.f106851b = i02.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @NonNull
    public final Map<CaptureRequest.Key<?>, Object> a(int i11) {
        if (i11 == 3 && this.f106850a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            return Collections.unmodifiableMap(hashMap);
        }
        if (i11 != 4 || !this.f106851b) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
        return Collections.unmodifiableMap(hashMap2);
    }
}
