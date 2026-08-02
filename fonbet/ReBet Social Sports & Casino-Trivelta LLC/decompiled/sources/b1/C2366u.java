package b1;

import e1.AbstractC4134a;

/* renamed from: b1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2366u {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.a f24632a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24633b;

    public C2366u(androidx.media3.common.a aVar, long j10) {
        AbstractC4134a.b(aVar.f20516D != null, "format colorInfo must be set");
        AbstractC4134a.b(aVar.f20550v > 0, "format width must be positive, but is: " + aVar.f20550v);
        AbstractC4134a.b(aVar.f20551w > 0, "format height must be positive, but is: " + aVar.f20551w);
        this.f24632a = aVar;
        this.f24633b = j10;
    }
}
