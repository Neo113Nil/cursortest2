package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.dq70;
import xsna.ozg0;
import xsna.tyz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class SessionInsertRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SessionInsertRequest> CREATOR;
    public final Session b;
    public final List c;
    public final List d;

    @Nullable
    public final zzcw e;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CREATOR = new tyz0();
    }

    public SessionInsertRequest(Session session, ArrayList arrayList, ArrayList arrayList2, @Nullable IBinder iBinder) {
        this.b = session;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(arrayList2);
        this.e = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionInsertRequest) {
            SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
            if (dq70.b(this.b, sessionInsertRequest.b) && dq70.b(this.c, sessionInsertRequest.c) && dq70.b(this.d, sessionInsertRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "session");
        aVar.a(this.c, "dataSets");
        aVar.a(this.d, "aggregateDataPoints");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.u(parcel, 3, this.d, false);
        zzcw zzcwVar = this.e;
        ozg0.h(parcel, 4, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public SessionInsertRequest(Session session, List list, List list2, @Nullable zzcw zzcwVar) {
        this.b = session;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = zzcwVar;
    }

    public SessionInsertRequest(SessionInsertRequest sessionInsertRequest, zzcw zzcwVar) {
        this(sessionInsertRequest.b, sessionInsertRequest.c, sessionInsertRequest.d, zzcwVar);
    }
}
