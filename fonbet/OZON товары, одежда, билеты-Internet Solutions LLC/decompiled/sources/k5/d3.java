package k5;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    private static final Gc.g f70728a = new Gc.g();

    /* renamed from: b, reason: collision with root package name */
    private static final M1 f70729b = new A2();

    @NonNull
    static t3 a(int i11, @NonNull Context context) {
        int i12 = Build.VERSION.SDK_INT;
        M1 m12 = f70729b;
        Gc.g gVar = f70728a;
        return i12 >= 29 ? new C7582x(context, i11, gVar, m12) : new C7490I(context, i11, gVar, m12);
    }
}
