package w;

import C.S;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.HashMap;
import z.C10955m;

/* renamed from: w.M, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10345M {

    /* renamed from: a, reason: collision with root package name */
    private final C10346N f103053a;

    /* renamed from: b, reason: collision with root package name */
    private final C10955m f103054b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f103055c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f103056d = new HashMap();

    private C10345M(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull C10955m c10955m) {
        new HashMap();
        this.f103053a = new C10346N(streamConfigurationMap);
        this.f103054b = c10955m;
    }

    @NonNull
    static C10345M e(@NonNull StreamConfigurationMap streamConfigurationMap, @NonNull C10955m c10955m) {
        return new C10345M(streamConfigurationMap, c10955m);
    }

    public final Size[] a(int i11) {
        HashMap hashMap = this.f103056d;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i11))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i11))).clone();
        }
        Size[] highResolutionOutputSizes = this.f103053a.f103057a.getHighResolutionOutputSizes(i11);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
            highResolutionOutputSizes = this.f103054b.a(highResolutionOutputSizes, i11);
        }
        hashMap.put(Integer.valueOf(i11), highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    public final int[] b() {
        int[] iArr;
        C10346N c10346n = this.f103053a;
        c10346n.getClass();
        try {
            iArr = c10346n.f103057a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e11) {
            S.l("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e11);
            iArr = null;
        }
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public final Size[] c(int i11) {
        HashMap hashMap = this.f103055c;
        if (hashMap.containsKey(Integer.valueOf(i11))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i11))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i11))).clone();
        }
        Size[] outputSizes = this.f103053a.f103057a.getOutputSizes(i11);
        if (outputSizes != null && outputSizes.length != 0) {
            Size[] a11 = this.f103054b.a(outputSizes, i11);
            hashMap.put(Integer.valueOf(i11), a11);
            return (Size[]) a11.clone();
        }
        S.k("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i11);
        return outputSizes;
    }

    @NonNull
    public final StreamConfigurationMap d() {
        return this.f103053a.f103057a;
    }
}
