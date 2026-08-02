package b;

import java.io.IOException;

/* renamed from: b.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2303c0 implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final int f24093a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24094b;

    /* renamed from: c, reason: collision with root package name */
    public final C2306e f24095c;

    public C2303c0(int i10, int i11, C2306e c2306e) {
        this.f24093a = i10;
        this.f24094b = i11;
        this.f24095c = c2306e;
    }

    public w0 b() {
        return this.f24095c.c(this.f24093a, this.f24094b);
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new t0(e10.getMessage());
        }
    }
}
