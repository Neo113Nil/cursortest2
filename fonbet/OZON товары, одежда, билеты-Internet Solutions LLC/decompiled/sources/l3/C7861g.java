package l3;

import android.os.Bundle;
import m3.N;

/* renamed from: l3.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7861g implements InterfaceC7859e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f72647d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f72648e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f72649f;

    /* renamed from: a, reason: collision with root package name */
    public int f72650a;

    /* renamed from: b, reason: collision with root package name */
    public int f72651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72652c;

    static {
        int i11 = N.f74289a;
        f72647d = Integer.toString(0, 36);
        f72648e = Integer.toString(1, 36);
        f72649f = Integer.toString(2, 36);
    }

    public C7861g(int i11, int i12, int i13) {
        this.f72650a = i11;
        this.f72651b = i12;
        this.f72652c = i13;
    }

    public static C7861g a(Bundle bundle) {
        return new C7861g(bundle.getInt(f72647d), bundle.getInt(f72648e), bundle.getInt(f72649f));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f72647d, this.f72650a);
        bundle.putInt(f72648e, this.f72651b);
        bundle.putInt(f72649f, this.f72652c);
        return bundle;
    }
}
