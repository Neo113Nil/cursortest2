package z;

import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;

/* renamed from: z.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10965w {

    /* renamed from: b, reason: collision with root package name */
    private static final Size f106847b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    private static final G.e f106848c = new G.e(false);

    /* renamed from: a, reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f106849a = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    @NonNull
    public final Size[] a(@NonNull Size[] sizeArr) {
        if (this.f106849a == null || !"Huawei".equalsIgnoreCase(Build.BRAND) || !"mha-l29".equalsIgnoreCase(Build.MODEL)) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f106848c.compare(size, f106847b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
