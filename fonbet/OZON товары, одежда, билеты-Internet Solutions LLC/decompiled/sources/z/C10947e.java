package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10947e {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f106823a;

    public C10947e(@NonNull String str) {
        this.f106823a = str;
    }

    @NonNull
    public final List<Size> a(int i11) {
        return ((ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExcludedSupportedSizesQuirk.class)) == null ? new ArrayList() : ExcludedSupportedSizesQuirk.e(i11, this.f106823a);
    }
}
