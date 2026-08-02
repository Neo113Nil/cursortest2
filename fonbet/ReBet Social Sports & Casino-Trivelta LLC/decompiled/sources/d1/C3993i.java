package d1;

import android.os.Bundle;
import e1.Z;

/* renamed from: d1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3993i implements InterfaceC3990f {

    /* renamed from: d, reason: collision with root package name */
    public static final String f44908d = Z.K0(0);

    /* renamed from: e, reason: collision with root package name */
    public static final String f44909e = Z.K0(1);

    /* renamed from: f, reason: collision with root package name */
    public static final String f44910f = Z.K0(2);

    /* renamed from: a, reason: collision with root package name */
    public int f44911a;

    /* renamed from: b, reason: collision with root package name */
    public int f44912b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44913c;

    public C3993i(int i10, int i11, int i12) {
        this.f44911a = i10;
        this.f44912b = i11;
        this.f44913c = i12;
    }

    public static C3993i a(Bundle bundle) {
        return new C3993i(bundle.getInt(f44908d), bundle.getInt(f44909e), bundle.getInt(f44910f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f44908d, this.f44911a);
        bundle.putInt(f44909e, this.f44912b);
        bundle.putInt(f44910f, this.f44913c);
        return bundle;
    }
}
