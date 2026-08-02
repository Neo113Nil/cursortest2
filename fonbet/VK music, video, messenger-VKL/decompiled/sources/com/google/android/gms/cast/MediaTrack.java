package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.i601;
import xsna.nby;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class MediaTrack extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaTrack> CREATOR = new i601();
    public final long b;
    public final int c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final String g;
    public final int h;

    @Nullable
    public final List i;

    @Nullable
    public String j;

    @Nullable
    public final JSONObject k;

    public MediaTrack(long j, int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @Nullable List list, @Nullable JSONObject jSONObject) {
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i2;
        this.i = list;
        this.k = jSONObject;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.k;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.k;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || nby.a(jSONObject, jSONObject2)) && this.b == mediaTrack.b && this.c == mediaTrack.c && o0a.c(this.d, mediaTrack.d) && o0a.c(this.e, mediaTrack.e) && o0a.c(this.f, mediaTrack.f) && o0a.c(this.g, mediaTrack.g) && this.h == mediaTrack.h && o0a.c(this.i, mediaTrack.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), this.i, String.valueOf(this.k)});
    }

    @NonNull
    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.b);
            int i = this.c;
            if (i == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i == 2) {
                jSONObject.put("type", SignalingProtocol.MEDIA_OPTION_AUDIO);
            } else if (i == 3) {
                jSONObject.put("type", SignalingProtocol.MEDIA_OPTION_VIDEO);
            }
            String str = this.d;
            if (str != null) {
                jSONObject.put("trackContentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("trackContentType", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("name", str3);
            }
            String str4 = this.g;
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("language", str4);
            }
            int i2 = this.h;
            if (i2 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i2 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i2 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i2 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i2 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            List list = this.i;
            if (list != null) {
                jSONObject.put(SignalingProtocol.KEY_ROLES, new JSONArray((Collection) list));
            }
            JSONObject jSONObject2 = this.k;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.k;
        this.j = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.h);
        ozg0.s(parcel, this.i, 9);
        ozg0.q(parcel, 10, this.j, false);
        ozg0.x(w, parcel);
    }
}
