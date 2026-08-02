package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new zzc();
    public final ArrayList a;
    public final boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public RetrieveBytesRequest(ArrayList arrayList, boolean z) {
        if (z) {
            boolean z2 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            }
            Preconditions.k("retrieveAll was set to true but other constraint(s) was also provided: keys", z2);
        }
        this.b = z;
        this.a = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Preconditions.g(str, "Element in keys cannot be null or empty");
                this.a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, Collections.unmodifiableList(this.a));
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
