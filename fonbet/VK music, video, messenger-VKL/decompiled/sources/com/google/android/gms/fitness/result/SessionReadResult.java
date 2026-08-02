package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.he01;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class SessionReadResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<SessionReadResult> CREATOR = new he01();
    public final List b;
    public final List c;
    public final Status d;

    public SessionReadResult(@NonNull List list, @NonNull List list2, @NonNull Status status) {
        this.b = list;
        this.c = Collections.unmodifiableList(list2);
        this.d = status;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadResult)) {
            return false;
        }
        SessionReadResult sessionReadResult = (SessionReadResult) obj;
        return this.d.equals(sessionReadResult.d) && dq70.b(this.b, sessionReadResult.b) && dq70.b(this.c, sessionReadResult.c);
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.b, this.c});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.d, "status");
        aVar.a(this.b, "sessions");
        aVar.a(this.c, "sessionDataSets");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.x(w, parcel);
    }
}
