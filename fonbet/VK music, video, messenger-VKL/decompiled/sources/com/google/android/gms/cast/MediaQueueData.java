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
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dq70;
import xsna.ne7;
import xsna.o0a;
import xsna.ozg0;
import xsna.p401;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaQueueData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaQueueData> CREATOR = new p401();

    @Nullable
    public String b;

    @Nullable
    public String c;
    public int d;

    @Nullable
    public String e;

    @Nullable
    public MediaQueueContainerMetadata f;
    public int g;

    @Nullable
    public List h;
    public int i;
    public long j;
    public boolean k;

    public MediaQueueData() {
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaQueueData)) {
            return false;
        }
        MediaQueueData mediaQueueData = (MediaQueueData) obj;
        return TextUtils.equals(this.b, mediaQueueData.b) && TextUtils.equals(this.c, mediaQueueData.c) && this.d == mediaQueueData.d && TextUtils.equals(this.e, mediaQueueData.e) && dq70.b(this.f, mediaQueueData.f) && this.g == mediaQueueData.g && dq70.b(this.h, mediaQueueData.h) && this.i == mediaQueueData.i && this.j == mediaQueueData.j && this.k == mediaQueueData.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(this.d), this.e, this.f, Integer.valueOf(this.g), this.h, Integer.valueOf(this.i), Long.valueOf(this.j), Boolean.valueOf(this.k)});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("id", this.b);
            }
            if (!TextUtils.isEmpty(this.c)) {
                jSONObject.put("entity", this.c);
            }
            switch (this.d) {
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
                    jSONObject.put("queueType", SignalingProtocol.KEY_STREAM_TYPE_MOVIE);
                    break;
            }
            if (!TextUtils.isEmpty(this.e)) {
                jSONObject.put("name", this.e);
            }
            MediaQueueContainerMetadata mediaQueueContainerMetadata = this.f;
            if (mediaQueueContainerMetadata != null) {
                jSONObject.put("containerMetadata", mediaQueueContainerMetadata.i());
            }
            String L = ne7.L(Integer.valueOf(this.g));
            if (L != null) {
                jSONObject.put("repeatMode", L);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaQueueItem) it.next()).i());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.i);
            long j = this.j;
            if (j != -1) {
                Pattern pattern = o0a.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.k);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        int i2 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.p(parcel, 6, this.f, i, false);
        int i3 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.h;
        ozg0.u(parcel, 8, list == null ? null : Collections.unmodifiableList(list), false);
        int i4 = this.i;
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.j;
        ozg0.v(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.k;
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
