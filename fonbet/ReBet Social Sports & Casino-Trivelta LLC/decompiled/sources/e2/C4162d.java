package e2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d1.C3985a;
import e1.AbstractC4142i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4162d {
    public byte[] a(List list, long j10) {
        ArrayList<? extends Parcelable> b10 = AbstractC4142i.b(list, new Ra.f() { // from class: e2.c
            @Override // Ra.f
            public final Object apply(Object obj) {
                return ((C3985a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", b10);
        bundle.putLong(W9.d.f13160a, j10);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
