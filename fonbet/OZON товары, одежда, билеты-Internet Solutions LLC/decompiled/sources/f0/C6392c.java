package f0;

import W.C4852x;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6392c implements InterfaceC5084b0 {

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f62412e;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final InterfaceC5084b0 f62413b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final H f62414c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final I0 f62415d;

    static {
        HashMap hashMap = new HashMap();
        f62412e = hashMap;
        hashMap.put(1, C4852x.f33152f);
        hashMap.put(8, C4852x.f33150d);
        hashMap.put(6, C4852x.f33149c);
        hashMap.put(5, C4852x.f33148b);
        hashMap.put(4, C4852x.f33147a);
        hashMap.put(0, C4852x.f33151e);
    }

    public C6392c(@NonNull H h11, @NonNull InterfaceC5084b0 interfaceC5084b0, @NonNull I0 i02) {
        this.f62413b = interfaceC5084b0;
        this.f62414c = h11;
        this.f62415d = i02;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final InterfaceC5086c0 a(int i11) {
        if (b(i11)) {
            return this.f62413b.a(i11);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        if (!this.f62413b.b(i11)) {
            return false;
        }
        C4852x c4852x = (C4852x) f62412e.get(Integer.valueOf(i11));
        if (c4852x == null) {
            return true;
        }
        Iterator it = this.f62415d.c(VideoQualityQuirk.class).iterator();
        while (it.hasNext()) {
            VideoQualityQuirk videoQualityQuirk = (VideoQualityQuirk) it.next();
            if (videoQualityQuirk != null && videoQualityQuirk.c(this.f62414c, c4852x) && (!(videoQualityQuirk instanceof SurfaceProcessingQuirk) || !((SurfaceProcessingQuirk) videoQualityQuirk).b())) {
                return false;
            }
        }
        return true;
    }
}
