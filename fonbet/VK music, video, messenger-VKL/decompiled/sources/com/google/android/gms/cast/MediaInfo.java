package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.cast.zzhs;
import com.google.android.gms.internal.cast.zzhv;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.h401;
import xsna.nby;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public static final long t;

    @Nullable
    public final String b;
    public final int c;

    @Nullable
    public final String d;

    @Nullable
    public final MediaMetadata e;
    public final long f;

    @Nullable
    public final List g;

    @Nullable
    public final TextTrackStyle h;

    @Nullable
    public String i;

    @Nullable
    public List j;

    @Nullable
    public List k;

    @Nullable
    public final String l;

    @Nullable
    public final VastAdsRequest m;
    public final long n;

    @Nullable
    public final String o;

    @Nullable
    public final String p;

    @Nullable
    public final String q;

    @Nullable
    public final String r;

    @Nullable
    public final JSONObject s;

    static {
        Pattern pattern = o0a.a;
        t = -1000L;
        CREATOR = new h401();
    }

    public MediaInfo(@Nullable String str, int i, @Nullable String str2, @Nullable MediaMetadata mediaMetadata, long j, @Nullable ArrayList arrayList, @Nullable TextTrackStyle textTrackStyle, @Nullable String str3, @Nullable ArrayList arrayList2, @Nullable ArrayList arrayList3, @Nullable String str4, @Nullable VastAdsRequest vastAdsRequest, long j2, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = mediaMetadata;
        this.f = j;
        this.g = arrayList;
        this.h = textTrackStyle;
        this.i = str3;
        if (str3 != null) {
            try {
                this.s = new JSONObject(this.i);
            } catch (JSONException unused) {
                this.s = null;
                this.i = null;
            }
        } else {
            this.s = null;
        }
        this.j = arrayList2;
        this.k = arrayList3;
        this.l = str4;
        this.m = vastAdsRequest;
        this.n = j2;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        if (this.b == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.s;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.s;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || nby.a(jSONObject, jSONObject2)) && o0a.c(this.b, mediaInfo.b) && this.c == mediaInfo.c && o0a.c(this.d, mediaInfo.d) && o0a.c(this.e, mediaInfo.e) && this.f == mediaInfo.f && o0a.c(this.g, mediaInfo.g) && o0a.c(this.h, mediaInfo.h) && o0a.c(this.j, mediaInfo.j) && o0a.c(this.k, mediaInfo.k) && o0a.c(this.l, mediaInfo.l) && o0a.c(this.m, mediaInfo.m) && this.n == mediaInfo.n && o0a.c(this.o, mediaInfo.o) && o0a.c(this.p, mediaInfo.p) && o0a.c(this.q, mediaInfo.q) && o0a.c(this.r, mediaInfo.r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), this.d, this.e, Long.valueOf(this.f), String.valueOf(this.s), this.g, this.h, this.j, this.k, this.l, this.m, Long.valueOf(this.n), this.o, this.q, this.r});
    }

    @Nullable
    public final JSONObject i() {
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a4 A[LOOP:0: B:4:0x0024->B:11:0x00a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0189 A[LOOP:1: B:18:0x00d2->B:24:0x0189, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(JSONObject jSONObject) throws JSONException {
        long j;
        AdBreakClipInfo adBreakClipInfo;
        AdBreakInfo adBreakInfo;
        long j2 = 1000;
        int i = 0;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i2 = 0;
            while (true) {
                if (i2 >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has(X3.i.L)) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong(X3.i.L);
                        Pattern pattern = o0a.a;
                        long j4 = j3 * j2;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong("duration") * j2;
                        JSONArray optJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (optJSONArray != null) {
                            strArr = new String[optJSONArray.length()];
                            j = j2;
                            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                try {
                                    strArr[i3] = optJSONArray.getString(i3);
                                } catch (JSONException e) {
                                    e = e;
                                    e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    adBreakInfo = null;
                                    if (adBreakInfo == null) {
                                    }
                                }
                            }
                        } else {
                            j = j2;
                        }
                        adBreakInfo = new AdBreakInfo(j4, string, optLong, optBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (adBreakInfo == null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(adBreakInfo);
                        i2++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                adBreakInfo = null;
                if (adBreakInfo == null) {
                }
            }
            this.j = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            while (true) {
                if (i >= jSONArray2.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong("duration") * j;
                        String a = o0a.a(jSONObject3, "clickThroughUrl");
                        String a2 = o0a.a(jSONObject3, "contentUrl");
                        String a3 = o0a.a(jSONObject3, RTCStatsConstants.KEY_MIME_TYPE);
                        if (a3 == null) {
                            a3 = o0a.a(jSONObject3, "contentType");
                        }
                        String str = a3;
                        String a4 = o0a.a(jSONObject3, "title");
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a5 = o0a.a(jSONObject3, "contentId");
                        String a6 = o0a.a(jSONObject3, "posterUrl");
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j : -1L;
                        String a7 = o0a.a(jSONObject3, "hlsSegmentFormat");
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        adBreakClipInfo = new AdBreakClipInfo(string2, a4, optLong2, a2, str, a, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a5, a6, intValue, a7, optJSONObject2 == null ? null : new VastAdsRequest(o0a.a(optJSONObject2, "adTagUrl"), o0a.a(optJSONObject2, "adsResponse")));
                    } catch (JSONException e3) {
                        e3.getMessage();
                        Locale locale2 = Locale.ROOT;
                    }
                    if (adBreakClipInfo != null) {
                        arrayList2.clear();
                        break;
                    } else {
                        arrayList2.add(adBreakClipInfo);
                        i++;
                    }
                }
                adBreakClipInfo = null;
                if (adBreakClipInfo != null) {
                }
            }
            this.k = new ArrayList(arrayList2);
        }
    }

    @NonNull
    public final JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.b);
            jSONObject.putOpt("contentUrl", this.p);
            int i = this.c;
            jSONObject.put(SignalingProtocol.KEY_STREAM_TYPE, i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.d;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.e;
            if (mediaMetadata != null) {
                jSONObject.put("metadata", mediaMetadata.j());
            }
            long j = this.f;
            if (j <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = o0a.a;
                jSONObject.put("duration", j / 1000.0d);
            }
            List list = this.g;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).i());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.h;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.i());
            }
            JSONObject jSONObject2 = this.s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.l;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.j != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AdBreakInfo) it2.next()).i());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.k != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.k.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((AdBreakClipInfo) it3.next()).i());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.m;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.i());
            }
            long j2 = this.n;
            if (j2 != -1) {
                Pattern pattern2 = o0a.a;
                jSONObject.put("startAbsoluteTime", j2 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.o);
            String str3 = this.q;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.r;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.s;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        String str = this.b;
        if (str == null) {
            str = "";
        }
        ozg0.q(parcel, 2, str, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(this.f);
        ozg0.u(parcel, 7, this.g, false);
        ozg0.p(parcel, 8, this.h, i, false);
        ozg0.q(parcel, 9, this.i, false);
        List list = this.j;
        ozg0.u(parcel, 10, list == null ? null : Collections.unmodifiableList(list), false);
        List list2 = this.k;
        ozg0.u(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null, false);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.p(parcel, 13, this.m, i, false);
        ozg0.v(parcel, 14, 8);
        parcel.writeLong(this.n);
        ozg0.q(parcel, 15, this.o, false);
        ozg0.q(parcel, 16, this.p, false);
        ozg0.q(parcel, 17, this.q, false);
        ozg0.q(parcel, 18, this.r, false);
        ozg0.x(w, parcel);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        double d;
        int i;
        int i2;
        int i3;
        zzhv zzhvVar;
        String optString = jSONObject.optString(SignalingProtocol.KEY_STREAM_TYPE, "NONE");
        if ("NONE".equals(optString)) {
            this.c = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.c = 1;
        } else if ("LIVE".equals(optString)) {
            this.c = 2;
        } else {
            this.c = -1;
        }
        this.d = o0a.a(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.e = mediaMetadata;
            mediaMetadata.k(jSONObject2);
        }
        this.f = -1L;
        if (this.c != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", ConnectivityTracker.DEFAULT_UPLINK_BITRATE);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                this.f = (long) (optDouble * 1000.0d);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            d = 0.0d;
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i4);
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i2 = 1;
                } else {
                    i2 = SignalingProtocol.MEDIA_OPTION_AUDIO.equals(optString2) ? 2 : SignalingProtocol.MEDIA_OPTION_VIDEO.equals(optString2) ? 3 : 0;
                }
                String a = o0a.a(jSONObject3, "trackContentId");
                String a2 = o0a.a(jSONObject3, "trackContentType");
                String a3 = o0a.a(jSONObject3, "name");
                String a4 = o0a.a(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i3 = 1;
                    } else {
                        i3 = "CAPTIONS".equals(string) ? 2 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i3 = 0;
                }
                if (jSONObject3.has(SignalingProtocol.KEY_ROLES)) {
                    int i5 = zzhv.zzd;
                    zzhs zzhsVar = new zzhs();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray(SignalingProtocol.KEY_ROLES);
                    for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                        zzhsVar.zzb(jSONArray2.optString(i6));
                    }
                    zzhvVar = zzhsVar.zzc();
                } else {
                    zzhvVar = null;
                }
                arrayList.add(new MediaTrack(j, i2, a, a2, a3, a4, i3, zzhvVar, jSONObject3.optJSONObject("customData")));
            }
            this.g = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.g = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.b = (float) jSONObject4.optDouble("fontScale", 1.0d);
            textTrackStyle.c = TextTrackStyle.j(jSONObject4.optString("foregroundColor"));
            textTrackStyle.d = TextTrackStyle.j(jSONObject4.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.e = 0;
                } else if ("OUTLINE".equals(string2)) {
                    textTrackStyle.e = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    textTrackStyle.e = 2;
                } else if ("RAISED".equals(string2)) {
                    textTrackStyle.e = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    textTrackStyle.e = 4;
                }
            }
            textTrackStyle.f = TextTrackStyle.j(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    textTrackStyle.g = 0;
                } else if ("NORMAL".equals(string3)) {
                    textTrackStyle.g = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    textTrackStyle.g = 2;
                }
            }
            textTrackStyle.h = TextTrackStyle.j(jSONObject4.optString("windowColor"));
            if (textTrackStyle.g == 2) {
                textTrackStyle.i = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            textTrackStyle.j = o0a.a(jSONObject4, TtmlNode.ATTR_TTS_FONT_FAMILY);
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    textTrackStyle.k = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    textTrackStyle.k = 1;
                } else if ("SERIF".equals(string4)) {
                    textTrackStyle.k = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    textTrackStyle.k = 3;
                } else {
                    if ("CASUAL".equals(string4)) {
                        i = 4;
                    } else if ("CURSIVE".equals(string4)) {
                        i = 5;
                    } else if ("SMALL_CAPITALS".equals(string4)) {
                        textTrackStyle.k = 6;
                    }
                    textTrackStyle.k = i;
                }
            }
            if (jSONObject4.has(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                String string5 = jSONObject4.getString(TtmlNode.ATTR_TTS_FONT_STYLE);
                if ("NORMAL".equals(string5)) {
                    textTrackStyle.l = 0;
                } else if ("BOLD".equals(string5)) {
                    textTrackStyle.l = 1;
                } else if ("ITALIC".equals(string5)) {
                    textTrackStyle.l = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    textTrackStyle.l = 3;
                }
            }
            textTrackStyle.n = jSONObject4.optJSONObject("customData");
            this.h = textTrackStyle;
        } else {
            this.h = null;
        }
        j(jSONObject);
        this.s = jSONObject.optJSONObject("customData");
        this.l = o0a.a(jSONObject, "entity");
        this.o = o0a.a(jSONObject, "atvEntity");
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.m = optJSONObject != null ? new VastAdsRequest(o0a.a(optJSONObject, "adTagUrl"), o0a.a(optJSONObject, "adsResponse")) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.n = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.p = jSONObject.optString("contentUrl");
        }
        this.q = o0a.a(jSONObject, "hlsSegmentFormat");
        this.r = o0a.a(jSONObject, "hlsVideoSegmentFormat");
    }
}
