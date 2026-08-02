package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaQueueContainerMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueContainerMetadata> CREATOR = new zzbw();
    public int a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public double e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public final MediaQueueContainerMetadata a;

        public Builder() {
            MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
            mediaQueueContainerMetadata.a = 0;
            mediaQueueContainerMetadata.b = null;
            mediaQueueContainerMetadata.c = null;
            mediaQueueContainerMetadata.d = null;
            mediaQueueContainerMetadata.e = 0.0d;
            this.a = mediaQueueContainerMetadata;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaQueueContainerType {
    }

    private MediaQueueContainerMetadata() {
        throw null;
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            ArrayList arrayList = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaMetadata) it.next()).b1());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList2 = this.d;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                jSONObject.put("containerImages", com.google.android.gms.cast.internal.media.zza.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueContainerMetadata)) {
            return false;
        }
        MediaQueueContainerMetadata mediaQueueContainerMetadata = (MediaQueueContainerMetadata) obj;
        return this.a == mediaQueueContainerMetadata.a && TextUtils.equals(this.b, mediaQueueContainerMetadata.b) && Objects.a(this.c, mediaQueueContainerMetadata.c) && Objects.a(this.d, mediaQueueContainerMetadata.d) && this.e == mediaQueueContainerMetadata.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = this.a;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        ArrayList arrayList = this.c;
        SafeParcelWriter.q(parcel, 4, arrayList == null ? null : Collections.unmodifiableList(arrayList), false);
        ArrayList arrayList2 = this.d;
        SafeParcelWriter.q(parcel, 5, arrayList2 != null ? Collections.unmodifiableList(arrayList2) : null, false);
        double d = this.e;
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeDouble(d);
        SafeParcelWriter.t(parcel, s);
    }
}
