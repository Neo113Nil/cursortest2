package x;

import C.A;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Set;
import w.C10368u;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final a f104641a;

    interface a {
        @NonNull
        Set<A> a();

        DynamicRangeProfiles b();

        @NonNull
        Set<A> c(@NonNull A a11);
    }

    c(@NonNull a aVar) {
        this.f104641a = aVar;
    }

    @NonNull
    public static c a(@NonNull C10368u c10368u) {
        CameraCharacteristics.Key key;
        int i11 = Build.VERSION.SDK_INT;
        c cVar = null;
        if (i11 >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles a11 = b.a(c10368u.a(key));
            if (a11 != null) {
                x2.i.f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i11 >= 33);
                cVar = new c(new d(a11));
            }
        }
        return cVar == null ? e.f104643a : cVar;
    }

    @NonNull
    public final Set<A> b(@NonNull A a11) {
        return this.f104641a.c(a11);
    }

    @NonNull
    public final Set<A> c() {
        return this.f104641a.a();
    }

    public final DynamicRangeProfiles d() {
        x2.i.f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", Build.VERSION.SDK_INT >= 33);
        return this.f104641a.b();
    }
}
