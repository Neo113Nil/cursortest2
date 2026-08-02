package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.esz0;
import xsna.o401;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new o401();
    public int b;

    @Nullable
    public String c;

    @Nullable
    public List d;

    @Nullable
    public List e;
    public double f;

    public MediaQueueContainerMetadata() {
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.b == mediaQueueContainerMetadata.b && TextUtils.equals(this.c, mediaQueueContainerMetadata.c) && dq70.b(this.d, mediaQueueContainerMetadata.d) && dq70.b(this.e, mediaQueueContainerMetadata.e) && this.f == mediaQueueContainerMetadata.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e, Double.valueOf(this.f)});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.b;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.c)) {
                jSONObject.put("title", this.c);
            }
            List list = this.d;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaMetadata) it.next()).j());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.e;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", esz0.b(this.e));
            }
            jSONObject.put("containerDuration", this.f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        int i2 = this.b;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 3, this.c, false);
        List list = this.d;
        ozg0.u(parcel, 4, list == null ? null : Collections.unmodifiableList(list), false);
        List list2 = this.e;
        ozg0.u(parcel, 5, list2 != null ? Collections.unmodifiableList(list2) : null, false);
        double d = this.f;
        ozg0.v(parcel, 6, 8);
        parcel.writeDouble(d);
        ozg0.x(w, parcel);
    }
}
