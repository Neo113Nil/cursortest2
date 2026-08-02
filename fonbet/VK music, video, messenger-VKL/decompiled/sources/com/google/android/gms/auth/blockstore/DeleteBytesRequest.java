package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.exc0;
import xsna.ozg0;
import xsna.z101;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public class DeleteBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeleteBytesRequest> CREATOR = new z101();
    public final ArrayList b;
    public final boolean c;

    /* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
    public static final class a {
        public List a = new ArrayList();
        public boolean b = false;

        @NonNull
        public final DeleteBytesRequest a() {
            return new DeleteBytesRequest(this.a, this.b);
        }

        @NonNull
        public final void b(boolean z) {
            this.b = z;
        }

        @NonNull
        public final void c(@NonNull List list) {
            this.a = list;
        }
    }

    public DeleteBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            exc0.k("deleteAll was set to true but other constraint(s) was also provided: keys", z2);
        }
        this.c = z;
        this.b = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                exc0.g(str, "Element in keys cannot be null or empty");
                this.b.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.s(parcel, Collections.unmodifiableList(this.b), 1);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
