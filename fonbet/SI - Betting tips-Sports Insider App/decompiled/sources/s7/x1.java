package s7;

import android.os.Bundle;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f23233c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f23234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f23235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f23236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f23237g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e2 f23238h;

    public x1(e2 e2Var, String str, String str2, long j, Bundle bundle, boolean z5, boolean z7, boolean z10) {
        this.f23231a = str;
        this.f23232b = str2;
        this.f23233c = j;
        this.f23234d = bundle;
        this.f23235e = z5;
        this.f23236f = z7;
        this.f23237g = z10;
        this.f23238h = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23238h.s(this.f23231a, this.f23232b, this.f23233c, this.f23234d, this.f23235e, this.f23236f, this.f23237g);
    }
}
