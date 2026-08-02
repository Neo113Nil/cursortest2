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
import xsna.ff01;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class SessionStopResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<SessionStopResult> CREATOR = new ff01();
    public final Status b;
    public final List c;

    public SessionStopResult(@NonNull Status status, @NonNull List list) {
        this.b = status;
        this.c = Collections.unmodifiableList(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStopResult)) {
            return false;
        }
        SessionStopResult sessionStopResult = (SessionStopResult) obj;
        return this.b.equals(sessionStopResult.b) && dq70.b(this.c, sessionStopResult.c);
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "status");
        aVar.a(this.c, "sessions");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.u(parcel, 3, this.c, false);
        ozg0.x(w, parcel);
    }
}
