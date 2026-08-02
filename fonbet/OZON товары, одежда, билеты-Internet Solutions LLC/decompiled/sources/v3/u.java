package v3;

import j3.C7272n;

/* loaded from: classes.dex */
public final class u extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f101941a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f101942b;

    /* renamed from: c, reason: collision with root package name */
    public final C7272n f101943c;

    public u(int i11, C7272n c7272n, boolean z11) {
        super(Ej.b.a(i11, "AudioTrack write failed: "));
        this.f101942b = z11;
        this.f101941a = i11;
        this.f101943c = c7272n;
    }
}
