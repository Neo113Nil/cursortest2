package z;

import C.S;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: z.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10955m {

    /* renamed from: a, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f106831a = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: b, reason: collision with root package name */
    private final C10947e f106832b;

    public C10955m(@NonNull String str) {
        this.f106832b = new C10947e(str);
    }

    @NonNull
    public final Size[] a(@NonNull Size[] sizeArr, int i11) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        if (this.f106831a != null) {
            Size[] sizeArr2 = (i11 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) ? new Size[]{new Size(1440, 1080), new Size(960, 720)} : new Size[0];
            if (sizeArr2.length > 0) {
                arrayList.addAll(Arrays.asList(sizeArr2));
            }
        }
        List<Size> a11 = this.f106832b.a(i11);
        if (!a11.isEmpty()) {
            arrayList.removeAll(a11);
        }
        if (arrayList.isEmpty()) {
            S.k("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
