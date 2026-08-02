package w;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import java.util.Set;

/* renamed from: w.K, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10343K extends C10342J {
    @Override // w.C10344L, w.C10340H.b
    @NonNull
    public final Set<Set<String>> d() throws C10348a {
        try {
            return this.f103049a.getConcurrentCameraIds();
        } catch (CameraAccessException e11) {
            throw C10348a.b(e11);
        }
    }
}
