package k5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class U0 extends D0<String> {

    /* renamed from: f, reason: collision with root package name */
    private static final String f70651f = C7563s0.a(new byte[]{-109, 96, -96, -60, 37, -55, -71, 73, 29, -59, -106, 51, -78, -35, 15, -120});

    /* renamed from: g, reason: collision with root package name */
    private static final String f70652g = C7563s0.a(new byte[]{49, -121, 68, 86, 88, 16, 105, -75, -57, -17, 26, 125, -19, -4, 125, -125});

    /* renamed from: h, reason: collision with root package name */
    private static final String f70653h = C7563s0.a(new byte[]{-37, -20, -40, 1, 37, -39, 25, 107, -15, -101, 10, 45, 97, -64, 54, -54});

    /* renamed from: i, reason: collision with root package name */
    private static final String f70654i = C7563s0.a(new byte[]{104, -83, 114, -20, 65, 30, 83, -44, 69, 6, 60, -99, 18, 40, 101, -10});

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70655e;

    U0(@NonNull Context context) {
        super(Mm0.e.RdpConnection);
        this.f70655e = context;
    }

    protected static String w() {
        return f70653h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.D0
    @NonNull
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final String s() throws D1 {
        DisplayManager displayManager = (DisplayManager) this.f70655e.getSystemService("display");
        if (displayManager == null) {
            throw new C7571u0(C7563s0.a(new byte[]{-92, 9, -98, -107, 35, -121, 46, -112, 38, 118, 20, -22, -47, 18, 82, -15}));
        }
        for (Display display : displayManager.getDisplays()) {
            int flags = display.getFlags();
            String valueOf = String.valueOf(display);
            boolean contains = valueOf.contains(f70651f);
            boolean contains2 = valueOf.contains(f70652g);
            if (flags == 8 || contains || contains2) {
                return f70653h;
            }
        }
        return f70654i;
    }
}
