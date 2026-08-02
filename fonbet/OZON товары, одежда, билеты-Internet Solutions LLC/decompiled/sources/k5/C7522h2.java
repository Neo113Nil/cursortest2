package k5;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;

/* renamed from: k5.h2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7522h2 extends D0<String> {

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Context f70745e;

    C7522h2(@NonNull Context context) {
        super(Mm0.e.ScreenSize);
        this.f70745e = context;
    }

    @Override // k5.D0
    @NonNull
    protected final String s() throws D1 {
        DisplayMetrics displayMetrics = this.f70745e.getResources().getDisplayMetrics();
        return B0.A0.a(displayMetrics.widthPixels, displayMetrics.heightPixels, "", "x");
    }
}
