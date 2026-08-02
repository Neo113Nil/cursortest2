package l3;

import android.os.Bundle;
import m3.N;

/* renamed from: l3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7862h {

    /* renamed from: b, reason: collision with root package name */
    private static final String f72653b;

    /* renamed from: a, reason: collision with root package name */
    public final String f72654a;

    static {
        int i11 = N.f74289a;
        f72653b = Integer.toString(0, 36);
    }

    public C7862h(String str) {
        this.f72654a = str;
    }

    public static C7862h a(Bundle bundle) {
        String string = bundle.getString(f72653b);
        string.getClass();
        return new C7862h(string);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f72653b, this.f72654a);
        return bundle;
    }
}
