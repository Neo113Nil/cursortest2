package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new u5.b(19);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4423a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4424b;

    public RetrieveBytesRequest(ArrayList arrayList, boolean z5) {
        if (z5) {
            boolean z7 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z7 = false;
            }
            v.j("retrieveAll was set to true but other constraint(s) was also provided: keys", z7);
        }
        this.f4424b = z5;
        this.f4423a = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                v.f(str, "Element in keys cannot be null or empty");
                this.f4423a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.P(parcel, 1, DesugarCollections.unmodifiableList(this.f4423a));
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4424b ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
