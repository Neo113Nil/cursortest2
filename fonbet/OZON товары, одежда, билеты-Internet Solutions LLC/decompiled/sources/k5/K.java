package k5;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private static final String f70593a = C7563s0.a(new byte[]{-25, 87, -112, 16, -26, 36, -27, 17, 18, -105, -47, 112, -86, -104, -118, -94});

    /* renamed from: b, reason: collision with root package name */
    private static K0 f70594b;

    /* renamed from: c, reason: collision with root package name */
    private static o3 f70595c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70596a;

        static {
            int[] iArr = new int[W0.values().length];
            f70596a = iArr;
            try {
                iArr[W0.f22transient.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70596a[W0.f21final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static AbstractC7520h0 a(@NonNull W0 w02, @NonNull Context context) {
        int i11 = a.f70596a[w02.ordinal()];
        if (i11 == 1) {
            if (f70594b == null) {
                f70594b = new K0();
            }
            return f70594b;
        }
        if (i11 == 2) {
            if (f70595c == null) {
                f70595c = new o3(context, f70593a);
            }
            return f70595c;
        }
        throw new IllegalArgumentException(C7563s0.a(new byte[]{47, 95, 47, -97, 29, 80, -53, -29, 96, -41, 118, 43, 32, -116, 62, 88, 83, 82, -2, -90, 18, -24, 50, -31, 82, 43, 92, -109, -96, -43, -27, 7}) + w02 + C7563s0.a(new byte[]{-62, 116, -30, -8, -9, -79, 9, 86, 70, -89, -64, 65, -66, 53, -106, 40}));
    }
}
