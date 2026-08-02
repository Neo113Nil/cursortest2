package d1;

import android.os.Bundle;
import e1.AbstractC4134a;
import e1.Z;

/* renamed from: d1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3991g implements InterfaceC3990f {

    /* renamed from: c, reason: collision with root package name */
    public static final String f44904c = Z.K0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f44905d = Z.K0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f44906a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44907b;

    public C3991g(String str, int i10) {
        this.f44906a = str;
        this.f44907b = i10;
    }

    public static C3991g a(Bundle bundle) {
        return new C3991g((String) AbstractC4134a.e(bundle.getString(f44904c)), bundle.getInt(f44905d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f44904c, this.f44906a);
        bundle.putInt(f44905d, this.f44907b);
        return bundle;
    }
}
