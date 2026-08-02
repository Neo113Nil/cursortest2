package e2;

import android.os.Bundle;
import android.os.Parcel;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4142i;
import java.util.ArrayList;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4160b {
    public C4163e a(long j10, byte[] bArr, int i10, int i11) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i10, i11);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new C4163e(AbstractC4142i.a(new Ra.f() { // from class: e2.a
            @Override // Ra.f
            public final Object apply(Object obj) {
                return C3985a.b((Bundle) obj);
            }
        }, (ArrayList) AbstractC4134a.e(readBundle.getParcelableArrayList("c"))), j10, readBundle.getLong(W9.d.f13160a));
    }
}
