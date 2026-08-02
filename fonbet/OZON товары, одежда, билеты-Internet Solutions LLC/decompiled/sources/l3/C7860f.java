package l3;

import android.os.Bundle;
import m3.N;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7860f implements InterfaceC7859e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f72643c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f72644d;

    /* renamed from: a, reason: collision with root package name */
    public final String f72645a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72646b;

    static {
        int i11 = N.f74289a;
        f72643c = Integer.toString(0, 36);
        f72644d = Integer.toString(1, 36);
    }

    public C7860f(String str, int i11) {
        this.f72645a = str;
        this.f72646b = i11;
    }

    public static C7860f a(Bundle bundle) {
        String string = bundle.getString(f72643c);
        string.getClass();
        return new C7860f(string, bundle.getInt(f72644d));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f72643c, this.f72645a);
        bundle.putInt(f72644d, this.f72646b);
        return bundle;
    }
}
