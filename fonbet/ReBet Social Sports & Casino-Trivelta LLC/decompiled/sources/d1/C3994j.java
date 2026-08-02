package d1;

import android.os.Bundle;
import e1.AbstractC4134a;
import e1.Z;

/* renamed from: d1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3994j {

    /* renamed from: b, reason: collision with root package name */
    public static final String f44914b = Z.K0(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f44915a;

    public C3994j(String str) {
        this.f44915a = str;
    }

    public static C3994j a(Bundle bundle) {
        return new C3994j((String) AbstractC4134a.e(bundle.getString(f44914b)));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(f44914b, this.f44915a);
        return bundle;
    }
}
