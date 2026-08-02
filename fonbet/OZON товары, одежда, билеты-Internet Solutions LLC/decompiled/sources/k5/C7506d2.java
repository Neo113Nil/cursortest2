package k5;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: k5.d2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7506d2 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70727e;

    C7506d2(@NonNull Context context) {
        super(Mm0.e.ScreenColorDepth);
        this.f70727e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        double d11 = this.f70727e.getResources().getDisplayMetrics().density;
        return d11 >= 4.0d ? "~640 dpi" : d11 >= 3.0d ? "~480 dpi" : d11 >= 2.0d ? "~320 dpi" : d11 >= 1.5d ? "~240 dpi" : d11 >= 1.0d ? "~160 dpi" : "~120 dpi";
    }
}
