package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzdh;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.exc0;
import xsna.i5s;
import xsna.nl01;
import xsna.ozg0;
import xsna.rnt;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new nl01();
    public final List b;
    public final int c;
    public final String d;

    @Nullable
    public final String e;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {
        public final ArrayList a = new ArrayList();
        public int b = 5;
        public final String c = "";

        @NonNull
        public final void a(@NonNull List list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rnt rntVar = (rnt) it.next();
                if (rntVar != null) {
                    exc0.a("Geofence must be created using Geofence.Builder.", rntVar instanceof zzdh);
                    this.a.add((zzdh) rntVar);
                }
            }
        }

        @NonNull
        public final GeofencingRequest b() {
            ArrayList arrayList = this.a;
            exc0.a("No geofence has been added to this request.", !arrayList.isEmpty());
            return new GeofencingRequest(this.b, this.c, null, arrayList);
        }

        @NonNull
        public final void c() {
            this.b = 5;
        }
    }

    public GeofencingRequest(int i, String str, @Nullable String str2, List list) {
        this.b = list;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
        sb.append(this.b);
        sb.append(", initialTrigger=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", attributionTag=");
        return i5s.a(sb, this.e, X3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
