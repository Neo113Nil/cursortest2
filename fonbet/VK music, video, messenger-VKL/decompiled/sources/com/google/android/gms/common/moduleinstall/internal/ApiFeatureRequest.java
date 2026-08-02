package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import xsna.dq70;
import xsna.exc0;
import xsna.ot80;
import xsna.ozg0;
import xsna.rlz0;
import xsna.wmz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new wmz0();
    public final List b;
    public final boolean c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    public ApiFeatureRequest(@NonNull List list, boolean z, @Nullable String str, @Nullable String str2) {
        exc0.i(list);
        this.b = list;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public static ApiFeatureRequest b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(rlz0.b);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((ot80) it.next()).m());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.c == apiFeatureRequest.c && dq70.b(this.b, apiFeatureRequest.b) && dq70.b(this.d, apiFeatureRequest.d) && dq70.b(this.e, apiFeatureRequest.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), this.b, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
