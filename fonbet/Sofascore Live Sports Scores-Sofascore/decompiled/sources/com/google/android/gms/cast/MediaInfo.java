package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.internal.cast.zzhq;
import com.google.android.gms.internal.cast.zzhs;
import com.google.android.gms.internal.cast.zzhv;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.a70;
import defpackage.sno;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public static final long s;
    public final String a;
    public final int b;
    public final String c;
    public final MediaMetadata d;
    public final long e;
    public final List f;
    public final TextTrackStyle g;
    public String h;
    public List i;
    public List j;
    public final String k;
    public final VastAdsRequest l;
    public final long m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final JSONObject r;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* loaded from: classes.dex */
    public static class Builder {
        public int a = -1;
        public String b;
        public MediaMetadata c;
        public String d;
        public String e;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public class Writer {
    }

    static {
        Pattern pattern = CastUtils.a;
        s = -1000L;
        CREATOR = new zzbr();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        Object[] objArr;
        double d;
        VastAdsRequest vastAdsRequest;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        com.google.android.gms.internal.cast.a aVar;
        String optString = jSONObject.optString("streamType", "NONE");
        int i7 = 2;
        boolean z = false;
        if ("NONE".equals(optString)) {
            this.b = 0;
            objArr = 0;
        } else if ("BUFFERED".equals(optString)) {
            this.b = 1;
            objArr = 1;
        } else if ("LIVE".equals(optString)) {
            this.b = 2;
            objArr = 2;
        } else {
            this.b = -1;
            objArr = 65535;
        }
        this.c = CastUtils.a("contentType", jSONObject);
        if (jSONObject.has(TtmlNode.TAG_METADATA)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(TtmlNode.TAG_METADATA);
            MediaMetadata mediaMetadata = new MediaMetadata(jSONObject2.getInt("metadataType"));
            this.d = mediaMetadata;
            mediaMetadata.c1(jSONObject2);
        }
        this.e = -1L;
        if (objArr != 2 && jSONObject.has(IronSourceConstants.EVENTS_DURATION) && !jSONObject.isNull(IronSourceConstants.EVENTS_DURATION)) {
            double optDouble = jSONObject.optDouble(IronSourceConstants.EVENTS_DURATION, 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble) && optDouble >= 0.0d) {
                this.e = (long) (optDouble * 1000.0d);
            }
        }
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i8 = 0;
            d = 0.0d;
            while (i8 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                Parcelable.Creator<MediaTrack> creator = MediaTrack.CREATOR;
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                int i9 = "TEXT".equals(optString2) ? 1 : "AUDIO".equals(optString2) ? i7 : "VIDEO".equals(optString2) ? 3 : z ? 1 : 0;
                String a = CastUtils.a("trackContentId", jSONObject3);
                String a2 = CastUtils.a("trackContentType", jSONObject3);
                String a3 = CastUtils.a("name", jSONObject3);
                String a4 = CastUtils.a("language", jSONObject3);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i6 = "SUBTITLES".equals(string) ? 1 : "CAPTIONS".equals(string) ? i7 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i6 = z ? 1 : 0;
                }
                if (jSONObject3.has("roles")) {
                    sno snoVar = zzhv.b;
                    zzhs zzhsVar = new zzhs();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i10 = z ? 1 : 0;
                    while (i10 < jSONArray2.length()) {
                        String optString3 = jSONArray2.optString(i10);
                        optString3.getClass();
                        int length = zzhsVar.a.length;
                        int a5 = zzhq.a(length, zzhsVar.b + 1);
                        if (a5 > length || zzhsVar.c) {
                            zzhsVar.a = Arrays.copyOf(zzhsVar.a, a5);
                            zzhsVar.c = z;
                        }
                        Object[] objArr2 = zzhsVar.a;
                        int i11 = zzhsVar.b;
                        zzhsVar.b = i11 + 1;
                        objArr2[i11] = optString3;
                        i10++;
                        z = false;
                    }
                    zzhsVar.c = true;
                    aVar = zzhv.r(zzhsVar.b, zzhsVar.a);
                } else {
                    aVar = null;
                }
                arrayList.add(new MediaTrack(j, i9, a, a2, a3, a4, i6, aVar, jSONObject3.optJSONObject("customData")));
                i8++;
                i7 = 2;
                z = false;
            }
            this.f = new ArrayList(arrayList);
        } else {
            d = 0.0d;
            this.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            TextTrackStyle textTrackStyle = new TextTrackStyle();
            textTrackStyle.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            textTrackStyle.b = TextTrackStyle.Z0(jSONObject4.optString("foregroundColor"));
            textTrackStyle.c = TextTrackStyle.Z0(jSONObject4.optString(TtmlNode.ATTR_TTS_BACKGROUND_COLOR));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    textTrackStyle.d = 0;
                } else if ("OUTLINE".equals(string2)) {
                    textTrackStyle.d = 1;
                } else {
                    if ("DROP_SHADOW".equals(string2)) {
                        i5 = 2;
                    } else if ("RAISED".equals(string2)) {
                        i5 = 3;
                    } else if ("DEPRESSED".equals(string2)) {
                        textTrackStyle.d = 4;
                    }
                    textTrackStyle.d = i5;
                }
            }
            textTrackStyle.e = TextTrackStyle.Z0(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    textTrackStyle.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    textTrackStyle.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i = 2;
                    textTrackStyle.f = 2;
                    textTrackStyle.g = TextTrackStyle.Z0(jSONObject4.optString("windowColor"));
                    if (textTrackStyle.f == i) {
                        textTrackStyle.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
                    }
                    textTrackStyle.i = CastUtils.a(TtmlNode.ATTR_TTS_FONT_FAMILY, jSONObject4);
                    if (jSONObject4.has("fontGenericFamily")) {
                        String string4 = jSONObject4.getString("fontGenericFamily");
                        if ("SANS_SERIF".equals(string4)) {
                            textTrackStyle.j = 0;
                        } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                            textTrackStyle.j = 1;
                        } else {
                            if ("SERIF".equals(string4)) {
                                i4 = 2;
                            } else if ("MONOSPACED_SERIF".equals(string4)) {
                                i4 = 3;
                            } else {
                                if ("CASUAL".equals(string4)) {
                                    i3 = 4;
                                } else if ("CURSIVE".equals(string4)) {
                                    i3 = 5;
                                } else if ("SMALL_CAPITALS".equals(string4)) {
                                    textTrackStyle.j = 6;
                                }
                                textTrackStyle.j = i3;
                            }
                            textTrackStyle.j = i4;
                        }
                    }
                    if (jSONObject4.has(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        String string5 = jSONObject4.getString(TtmlNode.ATTR_TTS_FONT_STYLE);
                        if ("NORMAL".equals(string5)) {
                            textTrackStyle.k = 0;
                        } else if ("BOLD".equals(string5)) {
                            textTrackStyle.k = 1;
                        } else {
                            if (!"ITALIC".equals(string5)) {
                                i2 = "BOLD_ITALIC".equals(string5) ? 3 : 2;
                            }
                            textTrackStyle.k = i2;
                        }
                    }
                    textTrackStyle.m = jSONObject4.optJSONObject("customData");
                    this.g = textTrackStyle;
                    vastAdsRequest = null;
                }
            }
            i = 2;
            textTrackStyle.g = TextTrackStyle.Z0(jSONObject4.optString("windowColor"));
            if (textTrackStyle.f == i) {
            }
            textTrackStyle.i = CastUtils.a(TtmlNode.ATTR_TTS_FONT_FAMILY, jSONObject4);
            if (jSONObject4.has("fontGenericFamily")) {
            }
            if (jSONObject4.has(TtmlNode.ATTR_TTS_FONT_STYLE)) {
            }
            textTrackStyle.m = jSONObject4.optJSONObject("customData");
            this.g = textTrackStyle;
            vastAdsRequest = null;
        } else {
            vastAdsRequest = null;
            this.g = null;
        }
        Y0(jSONObject);
        this.r = jSONObject.optJSONObject("customData");
        this.k = CastUtils.a("entity", jSONObject);
        this.n = CastUtils.a("atvEntity", jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        Parcelable.Creator<VastAdsRequest> creator2 = VastAdsRequest.CREATOR;
        this.l = optJSONObject == null ? vastAdsRequest : new VastAdsRequest(CastUtils.a("adTagUrl", optJSONObject), CastUtils.a("adsResponse", optJSONObject));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= d) {
                this.m = (long) (optDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.o = jSONObject.optString("contentUrl");
        }
        this.p = CastUtils.a("hlsSegmentFormat", jSONObject);
        this.q = CastUtils.a("hlsVideoSegmentFormat", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6 A[LOOP:0: B:4:0x0024->B:11:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018f A[LOOP:1: B:18:0x00d4->B:24:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0196 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y0(JSONObject jSONObject) {
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
                Parcelable.Creator<AdBreakInfo> creator = AdBreakInfo.CREATOR;
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = CastUtils.a;
                        long j4 = j3 * j2;
                        boolean optBoolean = jSONObject2.optBoolean("isWatched");
                        long optLong = jSONObject2.optLong(IronSourceConstants.EVENTS_DURATION) * j2;
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
            this.i = new ArrayList(arrayList);
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
                Parcelable.Creator<AdBreakClipInfo> creator2 = AdBreakClipInfo.CREATOR;
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long optLong2 = jSONObject3.optLong(IronSourceConstants.EVENTS_DURATION) * j;
                        String a = CastUtils.a("clickThroughUrl", jSONObject3);
                        String a2 = CastUtils.a("contentUrl", jSONObject3);
                        String a3 = CastUtils.a("mimeType", jSONObject3);
                        if (a3 == null) {
                            a3 = CastUtils.a("contentType", jSONObject3);
                        }
                        String str = a3;
                        String a4 = CastUtils.a("title", jSONObject3);
                        JSONObject optJSONObject = jSONObject3.optJSONObject("customData");
                        String a5 = CastUtils.a("contentId", jSONObject3);
                        String a6 = CastUtils.a("posterUrl", jSONObject3);
                        long intValue = jSONObject3.has("whenSkippable") ? ((Integer) jSONObject3.get("whenSkippable")).intValue() * j : -1L;
                        String a7 = CastUtils.a("hlsSegmentFormat", jSONObject3);
                        JSONObject optJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        Parcelable.Creator<VastAdsRequest> creator3 = VastAdsRequest.CREATOR;
                        adBreakClipInfo = new AdBreakClipInfo(string2, a4, optLong2, a2, str, a, (optJSONObject == null || optJSONObject.length() == 0) ? null : optJSONObject.toString(), a5, a6, intValue, a7, optJSONObject2 == null ? null : new VastAdsRequest(CastUtils.a("adTagUrl", optJSONObject2), CastUtils.a("adsResponse", optJSONObject2)));
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
            this.j = new ArrayList(arrayList2);
        }
    }

    public final JSONObject Z0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.a);
            jSONObject.putOpt("contentUrl", this.o);
            int i = this.b;
            jSONObject.put("streamType", i != 1 ? i != 2 ? "NONE" : "LIVE" : "BUFFERED");
            String str = this.c;
            if (str != null) {
                jSONObject.put("contentType", str);
            }
            MediaMetadata mediaMetadata = this.d;
            if (mediaMetadata != null) {
                jSONObject.put(TtmlNode.TAG_METADATA, mediaMetadata.b1());
            }
            long j = this.e;
            if (j <= -1) {
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, JSONObject.NULL);
            } else {
                Pattern pattern = CastUtils.a;
                jSONObject.put(IronSourceConstants.EVENTS_DURATION, j / 1000.0d);
            }
            List list = this.f;
            if (list != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((MediaTrack) it.next()).Y0());
                }
                jSONObject.put("tracks", jSONArray);
            }
            TextTrackStyle textTrackStyle = this.g;
            if (textTrackStyle != null) {
                jSONObject.put("textTrackStyle", textTrackStyle.Y0());
            }
            JSONObject jSONObject2 = this.r;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str2 = this.k;
            if (str2 != null) {
                jSONObject.put("entity", str2);
            }
            if (this.i != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it2 = this.i.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(((AdBreakInfo) it2.next()).Y0());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.j != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = this.j.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((AdBreakClipInfo) it3.next()).Y0());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            VastAdsRequest vastAdsRequest = this.l;
            if (vastAdsRequest != null) {
                jSONObject.put("vmapAdsRequest", vastAdsRequest.Y0());
            }
            long j2 = this.m;
            if (j2 != -1) {
                Pattern pattern2 = CastUtils.a;
                jSONObject.put("startAbsoluteTime", j2 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.n);
            String str3 = this.p;
            if (str3 != null) {
                jSONObject.put("hlsSegmentFormat", str3);
            }
            String str4 = this.q;
            if (str4 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str4);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || JsonUtils.a(jSONObject, jSONObject2)) && CastUtils.c(this.a, mediaInfo.a) && this.b == mediaInfo.b && CastUtils.c(this.c, mediaInfo.c) && CastUtils.c(this.d, mediaInfo.d) && this.e == mediaInfo.e && CastUtils.c(this.f, mediaInfo.f) && CastUtils.c(this.g, mediaInfo.g) && CastUtils.c(this.i, mediaInfo.i) && CastUtils.c(this.j, mediaInfo.j) && CastUtils.c(this.k, mediaInfo.k) && CastUtils.c(this.l, mediaInfo.l) && this.m == mediaInfo.m && CastUtils.c(this.n, mediaInfo.n) && CastUtils.c(this.o, mediaInfo.o) && CastUtils.c(this.p, mediaInfo.p) && CastUtils.c(this.q, mediaInfo.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.r), this.f, this.g, this.i, this.j, this.k, this.l, Long.valueOf(this.m), this.n, this.p, this.q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int s2 = SafeParcelWriter.s(parcel, 20293);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        SafeParcelWriter.m(parcel, 2, str, false);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.q(parcel, 7, this.f, false);
        SafeParcelWriter.l(parcel, 8, this.g, i, false);
        SafeParcelWriter.m(parcel, 9, this.h, false);
        List list = this.i;
        SafeParcelWriter.q(parcel, 10, list == null ? null : Collections.unmodifiableList(list), false);
        List list2 = this.j;
        SafeParcelWriter.q(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null, false);
        SafeParcelWriter.m(parcel, 12, this.k, false);
        SafeParcelWriter.l(parcel, 13, this.l, i, false);
        SafeParcelWriter.r(parcel, 14, 8);
        parcel.writeLong(this.m);
        SafeParcelWriter.m(parcel, 15, this.n, false);
        SafeParcelWriter.m(parcel, 16, this.o, false);
        SafeParcelWriter.m(parcel, 17, this.p, false);
        SafeParcelWriter.m(parcel, 18, this.q, false);
        SafeParcelWriter.t(parcel, s2);
    }

    public MediaInfo(String str, int i, String str2, MediaMetadata mediaMetadata, long j, ArrayList arrayList, TextTrackStyle textTrackStyle, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, VastAdsRequest vastAdsRequest, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = mediaMetadata;
        this.e = j;
        this.f = arrayList;
        this.g = textTrackStyle;
        this.h = str3;
        if (str3 != null) {
            try {
                this.r = new JSONObject(this.h);
            } catch (JSONException unused) {
                this.r = null;
                this.h = null;
            }
        } else {
            this.r = null;
        }
        this.i = arrayList2;
        this.j = arrayList3;
        this.k = str4;
        this.l = vastAdsRequest;
        this.m = j2;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        if (this.a == null && str6 == null && str4 == null) {
            a70.p("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
