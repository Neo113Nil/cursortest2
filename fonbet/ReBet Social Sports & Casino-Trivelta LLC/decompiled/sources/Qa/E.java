package Qa;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class E extends p implements F {
    public E() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // Qa.p
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) q.a(parcel, Bundle.CREATOR);
        q.b(parcel);
        b(bundle);
        return true;
    }
}
