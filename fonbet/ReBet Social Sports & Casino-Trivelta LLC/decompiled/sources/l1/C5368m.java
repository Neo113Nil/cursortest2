package l1;

import android.content.Context;
import b1.C2357k;
import b1.InterfaceC2360n;

/* renamed from: l1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5368m implements InterfaceC5390x0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2360n f55536a;

    /* renamed from: b, reason: collision with root package name */
    public final C2357k f55537b;

    public C5368m(InterfaceC2360n interfaceC2360n, C2357k c2357k) {
        this.f55536a = interfaceC2360n;
        this.f55537b = c2357k;
    }

    @Override // l1.InterfaceC5390x0
    public androidx.media3.effect.i a(Context context, boolean z10) {
        return new androidx.media3.effect.d(context, this.f55536a, this.f55537b);
    }
}
