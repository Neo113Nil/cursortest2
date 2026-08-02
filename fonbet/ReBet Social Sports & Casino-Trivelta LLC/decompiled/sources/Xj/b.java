package Xj;

import android.os.Build;

/* loaded from: classes5.dex */
public final class b implements a {
    @Override // Xj.a
    public boolean a() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @Override // Xj.a
    public boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
