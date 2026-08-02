package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.media.MediaCommon;
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
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaQueueData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new zzbx();
    public String a;
    public String b;
    public int c;
    public String d;
    public MediaQueueContainerMetadata e;
    public int f;
    public ArrayList g;
    public int h;
    public long i;
    public boolean j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
        public final MediaQueueData a;

        public Builder() {
            MediaQueueData mediaQueueData = new MediaQueueData();
            mediaQueueData.a = null;
            mediaQueueData.b = null;
            mediaQueueData.c = 0;
            mediaQueueData.d = null;
            mediaQueueData.f = 0;
            mediaQueueData.g = null;
            mediaQueueData.h = 0;
            mediaQueueData.i = -1L;
            mediaQueueData.j = false;
            this.a = mediaQueueData;
        }

        public final MediaQueueData a() {
            MediaQueueData mediaQueueData = new MediaQueueData();
            MediaQueueData mediaQueueData2 = this.a;
            mediaQueueData.a = mediaQueueData2.a;
            mediaQueueData.b = mediaQueueData2.b;
            mediaQueueData.c = mediaQueueData2.c;
            mediaQueueData.d = mediaQueueData2.d;
            mediaQueueData.e = mediaQueueData2.e;
            mediaQueueData.f = mediaQueueData2.f;
            mediaQueueData.g = mediaQueueData2.g;
            mediaQueueData.h = mediaQueueData2.h;
            mediaQueueData.i = mediaQueueData2.i;
            mediaQueueData.j = mediaQueueData2.j;
            return mediaQueueData;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaQueueType {
    }

    private MediaQueueData() {
        throw null;
    }

    public final JSONObject Y0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("id", this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("entity", this.b);
            }
            switch (this.c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.e;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.Y0());
            }
            String b = MediaCommon.b(Integer.valueOf(this.f));
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            ArrayList arrayList = this.g;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaQueueItem) it.next()).Z0());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.h);
            long j = this.i;
            if (j != -1) {
                Pattern pattern = CastUtils.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.j);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.a, mediaQueueData.a) && TextUtils.equals(this.b, mediaQueueData.b) && this.c == mediaQueueData.c && TextUtils.equals(this.d, mediaQueueData.d) && Objects.a(this.e, mediaQueueData.e) && this.f == mediaQueueData.f && Objects.a(this.g, mediaQueueData.g) && this.h == mediaQueueData.h && this.i == mediaQueueData.i && this.j == mediaQueueData.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        int i2 = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.l(parcel, 6, this.e, i, false);
        int i3 = this.f;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i3);
        ArrayList arrayList = this.g;
        SafeParcelWriter.q(parcel, 8, arrayList == null ? null : Collections.unmodifiableList(arrayList), false);
        int i4 = this.h;
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.i;
        SafeParcelWriter.r(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.j;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
