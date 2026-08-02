package B1;

import D1.m;
import android.net.Uri;
import androidx.media3.exoplayer.source.C2223y;
import e1.AbstractC4134a;
import h1.C4401D;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e implements m.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f556a = C2223y.a();

    /* renamed from: b, reason: collision with root package name */
    public final C4418n f557b;

    /* renamed from: c, reason: collision with root package name */
    public final int f558c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.a f559d;

    /* renamed from: e, reason: collision with root package name */
    public final int f560e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f561f;

    /* renamed from: g, reason: collision with root package name */
    public final long f562g;

    /* renamed from: h, reason: collision with root package name */
    public final long f563h;

    /* renamed from: i, reason: collision with root package name */
    public final C4401D f564i;

    public e(InterfaceC4411g interfaceC4411g, C4418n c4418n, int i10, androidx.media3.common.a aVar, int i11, Object obj, long j10, long j11) {
        this.f564i = new C4401D(interfaceC4411g);
        this.f557b = (C4418n) AbstractC4134a.e(c4418n);
        this.f558c = i10;
        this.f559d = aVar;
        this.f560e = i11;
        this.f561f = obj;
        this.f562g = j10;
        this.f563h = j11;
    }

    public final long b() {
        return this.f564i.o();
    }

    public final long d() {
        return this.f563h - this.f562g;
    }

    public final Map e() {
        return this.f564i.q();
    }

    public final Uri f() {
        return this.f564i.p();
    }
}
