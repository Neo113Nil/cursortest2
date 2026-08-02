package r5;

import android.os.SystemClock;

/* renamed from: r5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6208b implements InterfaceC6207a {
    @Override // r5.InterfaceC6207a
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // r5.InterfaceC6207a
    public long b() {
        return SystemClock.uptimeMillis();
    }
}
