package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.MediaQueueContainerMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.JsonUtils;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaStatus extends AbstractSafeParcelable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<MediaStatus> CREATOR;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public long h;
    public double i;
    public boolean j;
    public long[] k;
    public int l;
    public int m;
    public String n;
    public JSONObject o;
    public int p;
    public boolean r;
    public AdBreakStatus s;
    public VideoInfo t;
    public MediaLiveSeekableRange u;
    public MediaQueueData v;
    public boolean w;
    public final ArrayList q = new ArrayList();
    public final SparseArray x = new SparseArray();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public class Writer {
    }

    static {
        new Logger("MediaStatus", null);
        CREATOR = new zzbz();
    }

    public MediaStatus(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, AdBreakStatus adBreakStatus, VideoInfo videoInfo, MediaLiveSeekableRange mediaLiveSeekableRange, MediaQueueData mediaQueueData) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.g = j2;
        this.h = j3;
        this.i = d2;
        this.j = z;
        this.k = jArr;
        this.l = i4;
        this.m = i5;
        this.n = str;
        if (str != null) {
            try {
                this.o = new JSONObject(this.n);
            } catch (JSONException unused) {
                this.o = null;
                this.n = null;
            }
        } else {
            this.o = null;
        }
        this.p = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            c1(arrayList);
        }
        this.r = z2;
        this.s = adBreakStatus;
        this.t = videoInfo;
        this.u = mediaLiveSeekableRange;
        this.v = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.j) {
            z3 = true;
        }
        this.w = z3;
    }

    public final AdBreakClipInfo Y0() {
        MediaInfo mediaInfo;
        AdBreakStatus adBreakStatus = this.s;
        if (adBreakStatus != null) {
            String str = adBreakStatus.d;
            if (!TextUtils.isEmpty(str) && (mediaInfo = this.a) != null) {
                List list = mediaInfo.j;
                List<AdBreakClipInfo> unmodifiableList = list == null ? null : Collections.unmodifiableList(list);
                if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                    for (AdBreakClipInfo adBreakClipInfo : unmodifiableList) {
                        if (str.equals(adBreakClipInfo.a)) {
                            return adBreakClipInfo;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final MediaQueueItem Z0(int i) {
        Integer num = (Integer) this.x.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.q.get(num.intValue());
    }

    public final boolean a1(long j) {
        return (this.h & j) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x023c, code lost:
    
        if (r13 != 3) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0243, code lost:
    
        if (r5 == 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01ac, code lost:
    
        if (r3 != null) goto L108;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0425 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0370 A[Catch: JSONException -> 0x037b, TryCatch #3 {JSONException -> 0x037b, blocks: (B:300:0x034a, B:302:0x0370, B:303:0x0371), top: B:299:0x034a }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x030b  */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.cast.MediaStatus] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62, types: [int] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b1(JSONObject jSONObject, int i) {
        int i2;
        double d;
        long[] jArr;
        boolean z;
        boolean z2;
        int i3;
        MediaInfo mediaInfo;
        JSONObject optJSONObject;
        long optLong;
        AdBreakStatus adBreakStatus;
        AdBreakStatus adBreakStatus2;
        JSONObject optJSONObject2;
        ?? r8;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        ?? r4;
        MediaInfo mediaInfo2;
        int i4;
        int i5;
        JSONObject jSONObject2 = jSONObject;
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                JSONObject jSONObject3 = new JSONObject(jSONObject2, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject3.put(next, optJSONObject3.get(next));
                }
                jSONObject3.remove("extendedStatus");
                jSONObject2 = jSONObject3;
            } catch (JSONException unused) {
            }
        }
        long j = jSONObject2.getLong("mediaSessionId");
        boolean z3 = true;
        if (j != this.b) {
            this.b = j;
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            int i6 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
            if (i6 != this.e) {
                this.e = i6;
                i2 |= 2;
            }
            if (i6 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                int i7 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                if (i7 != this.f) {
                    this.f = i7;
                    i2 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d2 = jSONObject2.getDouble("playbackRate");
            if (this.d != d2) {
                this.d = d2;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("currentTime")) {
            double d3 = jSONObject2.getDouble("currentTime");
            Pattern pattern = CastUtils.a;
            long j2 = (long) (d3 * 1000.0d);
            d = 1000.0d;
            if (j2 != this.g) {
                this.g = j2;
                i2 |= 2;
            }
            i2 |= 128;
        } else {
            d = 1000.0d;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j3 = jSONObject2.getLong("supportedMediaCommands");
            if (j3 != this.h) {
                this.h = j3;
                i2 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i == 0) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("volume");
            double d4 = jSONObject4.getDouble("level");
            if (d4 != this.i) {
                this.i = d4;
                i2 |= 2;
            }
            boolean z4 = jSONObject4.getBoolean("muted");
            if (z4 != this.j) {
                this.j = z4;
                i2 |= 2;
            }
        }
        JSONArray jSONArray = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = CastUtils.a;
        if (jSONArray == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray.length()];
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                jArr[i8] = jSONArray.getLong(i8);
            }
        }
        long[] jArr2 = this.k;
        if (jArr != null) {
            if (jArr2 != null) {
                if (jArr2.length == jArr.length) {
                    for (int i9 = 0; i9 < jArr.length; i9++) {
                        if (this.k[i9] == jArr[i9]) {
                        }
                    }
                }
            }
            this.k = jArr;
            i2 |= 2;
            break;
        }
        if (jSONObject2.has("customData")) {
            this.o = jSONObject2.getJSONObject("customData");
            this.n = null;
            i2 |= 2;
        }
        if (jSONObject2.has(U3.i.I0)) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject(U3.i.I0);
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject5);
            MediaInfo mediaInfo4 = this.a;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.a = mediaInfo3;
                i2 |= 2;
            }
            if (jSONObject5.has(TtmlNode.TAG_METADATA)) {
                i2 |= 4;
            }
        }
        if (jSONObject2.has("currentItemId") && this.c != (i5 = jSONObject2.getInt("currentItemId"))) {
            this.c = i5;
            i2 |= 2;
        }
        int optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.m != optInt) {
            this.m = optInt;
            i2 |= 16;
        }
        int optInt2 = jSONObject2.optInt("loadingItemId", 0);
        int i10 = this.l;
        if (i10 != optInt2) {
            this.l = optInt2;
            i2 |= 2;
        } else {
            optInt2 = i10;
        }
        MediaInfo mediaInfo5 = this.a;
        int i11 = mediaInfo5 == null ? -1 : mediaInfo5.b;
        int i12 = this.e;
        int i13 = this.f;
        ArrayList arrayList2 = this.q;
        double d5 = d;
        SparseArray sparseArray = this.x;
        if (i12 == 1) {
            if (i13 != 1) {
                if (i13 != 2) {
                }
                i4 = 0;
                z2 = true;
                this.c = i4;
                this.l = i4;
                this.m = i4;
                if (!arrayList2.isEmpty()) {
                    i2 |= 8;
                    this.p = i4;
                    arrayList2.clear();
                    sparseArray.clear();
                }
                optJSONObject = jSONObject2.optJSONObject("breakStatus");
                Parcelable.Creator<AdBreakStatus> creator = AdBreakStatus.CREATOR;
                if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                    try {
                        long j4 = optJSONObject.getLong("currentBreakTime");
                        Pattern pattern3 = CastUtils.a;
                        long j5 = j4 * 1000;
                        long j6 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                        String a = CastUtils.a("breakId", optJSONObject);
                        String a2 = CastUtils.a("breakClipId", optJSONObject);
                        optLong = optJSONObject.optLong("whenSkippable", -1L);
                        if (optLong != -1) {
                            optLong *= 1000;
                        }
                        adBreakStatus = new AdBreakStatus(j5, j6, a, a2, optLong);
                    } catch (JSONException unused2) {
                        AdBreakStatus.f.c("Error while creating an AdBreakClipInfo from JSON", new Object[0]);
                    }
                    adBreakStatus2 = this.s;
                    if ((adBreakStatus2 == null && adBreakStatus != null) || (adBreakStatus2 != null && !adBreakStatus2.equals(adBreakStatus))) {
                        this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                        this.s = adBreakStatus;
                        i2 |= 32;
                    }
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    Logger logger = VideoInfo.d;
                    if (optJSONObject2 != null) {
                        try {
                            String string3 = optJSONObject2.getString("hdrType");
                            int hashCode = string3.hashCode();
                            if (hashCode == 3218) {
                                if (string3.equals("dv")) {
                                    r8 = 3;
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                                }
                                logger.a("Unknown HDR type: %s", string3);
                                r8 = 0;
                                videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                            } else if (hashCode == 103158) {
                                if (string3.equals("hdr")) {
                                    r8 = 4;
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                                }
                                logger.a("Unknown HDR type: %s", string3);
                                r8 = 0;
                                videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                            } else if (hashCode != 113729) {
                                if (hashCode == 99136405 && string3.equals("hdr10")) {
                                    r8 = 2;
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                                }
                                logger.a("Unknown HDR type: %s", string3);
                                r8 = 0;
                                videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                            } else {
                                if (string3.equals("sdr")) {
                                    r8 = z2;
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                                }
                                logger.a("Unknown HDR type: %s", string3);
                                r8 = 0;
                                videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), r8);
                            }
                        } catch (JSONException unused3) {
                            logger.b("Error while creating a VideoInfo instance from JSON", new Object[0]);
                        }
                        videoInfo2 = this.t;
                        if ((videoInfo2 == null && videoInfo != null) || (videoInfo2 != null && !videoInfo2.equals(videoInfo))) {
                            this.t = videoInfo;
                            i2 |= 64;
                        }
                        if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.a) != null) {
                            mediaInfo2.Y0(jSONObject2.getJSONObject("breakInfo"));
                            i2 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                            MediaQueueData.Builder builder = new MediaQueueData.Builder();
                            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
                            MediaQueueData mediaQueueData = builder.a;
                            mediaQueueData.a = null;
                            mediaQueueData.b = null;
                            mediaQueueData.c = 0;
                            mediaQueueData.d = null;
                            mediaQueueData.f = 0;
                            mediaQueueData.g = null;
                            mediaQueueData.h = 0;
                            mediaQueueData.i = -1L;
                            mediaQueueData.j = false;
                            if (jSONObject6 != null) {
                                mediaQueueData.a = CastUtils.a("id", jSONObject6);
                                mediaQueueData.b = CastUtils.a("entity", jSONObject6);
                                String optString = jSONObject6.optString("queueType");
                                switch (optString.hashCode()) {
                                    case -1803151310:
                                        if (optString.equals("PODCAST_SERIES")) {
                                            r4 = 5;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case -1758903120:
                                        if (optString.equals("RADIO_STATION")) {
                                            r4 = 4;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case -1632865838:
                                        if (optString.equals("PLAYLIST")) {
                                            r4 = 2;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case -1319760993:
                                        if (optString.equals("AUDIOBOOK")) {
                                            r4 = 3;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case -1088524588:
                                        if (optString.equals("TV_SERIES")) {
                                            r4 = 6;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case 62359119:
                                        if (optString.equals("ALBUM")) {
                                            r4 = z2;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case 73549584:
                                        if (optString.equals("MOVIE")) {
                                            r4 = 9;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case 393100598:
                                        if (optString.equals("VIDEO_PLAYLIST")) {
                                            r4 = 7;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                    case 902303413:
                                        if (optString.equals("LIVE_TV")) {
                                            r4 = 8;
                                            mediaQueueData.c = r4;
                                            break;
                                        }
                                        break;
                                }
                                mediaQueueData.d = CastUtils.a("name", jSONObject6);
                                JSONObject optJSONObject4 = jSONObject6.has("containerMetadata") ? jSONObject6.optJSONObject("containerMetadata") : null;
                                if (optJSONObject4 != null) {
                                    MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata.Builder().a;
                                    mediaQueueContainerMetadata.a = 0;
                                    mediaQueueContainerMetadata.b = null;
                                    mediaQueueContainerMetadata.c = null;
                                    mediaQueueContainerMetadata.d = null;
                                    mediaQueueContainerMetadata.e = 0.0d;
                                    String optString2 = optJSONObject4.optString("containerType", "");
                                    int hashCode2 = optString2.hashCode();
                                    if (hashCode2 != 6924225) {
                                        if (hashCode2 == 828666841 && optString2.equals("GENERIC_CONTAINER")) {
                                            mediaQueueContainerMetadata.a = 0;
                                        }
                                    } else if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                        mediaQueueContainerMetadata.a = 1;
                                    }
                                    mediaQueueContainerMetadata.b = CastUtils.a("title", optJSONObject4);
                                    JSONArray optJSONArray = optJSONObject4.optJSONArray("sections");
                                    if (optJSONArray != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        mediaQueueContainerMetadata.c = arrayList3;
                                        for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                                            JSONObject optJSONObject5 = optJSONArray.optJSONObject(i14);
                                            if (optJSONObject5 != null) {
                                                MediaMetadata mediaMetadata = new MediaMetadata();
                                                mediaMetadata.c1(optJSONObject5);
                                                arrayList3.add(mediaMetadata);
                                            }
                                        }
                                    }
                                    JSONArray optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                    if (optJSONArray2 != null) {
                                        ArrayList arrayList4 = new ArrayList();
                                        mediaQueueContainerMetadata.d = arrayList4;
                                        com.google.android.gms.cast.internal.media.zza.a(arrayList4, optJSONArray2);
                                    }
                                    mediaQueueContainerMetadata.e = optJSONObject4.optDouble("containerDuration", mediaQueueContainerMetadata.e);
                                    MediaQueueContainerMetadata mediaQueueContainerMetadata2 = new MediaQueueContainerMetadata();
                                    mediaQueueContainerMetadata2.a = mediaQueueContainerMetadata.a;
                                    mediaQueueContainerMetadata2.b = mediaQueueContainerMetadata.b;
                                    mediaQueueContainerMetadata2.c = mediaQueueContainerMetadata.c;
                                    mediaQueueContainerMetadata2.d = mediaQueueContainerMetadata.d;
                                    mediaQueueContainerMetadata2.e = mediaQueueContainerMetadata.e;
                                    mediaQueueData.e = mediaQueueContainerMetadata2;
                                }
                                Integer a3 = MediaCommon.a(jSONObject6.optString("repeatMode"));
                                if (a3 != null) {
                                    mediaQueueData.f = a3.intValue();
                                }
                                JSONArray optJSONArray3 = jSONObject6.optJSONArray("items");
                                if (optJSONArray3 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    mediaQueueData.g = arrayList5;
                                    for (int i15 = 0; i15 < optJSONArray3.length(); i15++) {
                                        JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i15);
                                        if (optJSONObject6 != null) {
                                            try {
                                                arrayList5.add(new MediaQueueItem(optJSONObject6));
                                            } catch (JSONException unused4) {
                                            }
                                        }
                                    }
                                }
                                mediaQueueData.h = jSONObject6.optInt("startIndex", mediaQueueData.h);
                                if (jSONObject6.has("startTime")) {
                                    mediaQueueData.i = (long) (jSONObject6.optDouble("startTime", mediaQueueData.i) * d5);
                                }
                                mediaQueueData.j = jSONObject6.optBoolean("shuffle");
                            }
                            MediaQueueData a4 = builder.a();
                            this.v = a4;
                            boolean z5 = a4.j;
                            if (this.w != z5) {
                                this.w = z5;
                                i2 |= 8;
                            }
                        }
                        if (jSONObject2.has("liveSeekableRange")) {
                            i2 |= 2;
                            JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                            Parcelable.Creator<MediaLiveSeekableRange> creator2 = MediaLiveSeekableRange.CREATOR;
                            if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has(TtmlNode.END)) {
                                try {
                                    double d6 = optJSONObject7.getDouble("start");
                                    Pattern pattern4 = CastUtils.a;
                                    mediaLiveSeekableRange = new MediaLiveSeekableRange((long) (d6 * d5), (long) (optJSONObject7.getDouble(TtmlNode.END) * d5), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                } catch (JSONException unused5) {
                                    MediaLiveSeekableRange.e.c("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]);
                                }
                                this.u = mediaLiveSeekableRange;
                            }
                            mediaLiveSeekableRange = null;
                            this.u = mediaLiveSeekableRange;
                        } else {
                            if (this.u != null) {
                                i2 |= 2;
                            }
                            this.u = null;
                        }
                        return i2;
                    }
                    videoInfo = null;
                    videoInfo2 = this.t;
                    if (videoInfo2 == null) {
                        this.t = videoInfo;
                        i2 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                            mediaInfo2.Y0(jSONObject2.getJSONObject("breakInfo"));
                            i2 |= 2;
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i2;
                    }
                    this.t = videoInfo;
                    i2 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i2;
                }
                adBreakStatus = null;
                adBreakStatus2 = this.s;
                if (adBreakStatus2 == null) {
                    this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                    this.s = adBreakStatus;
                    i2 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    Logger logger2 = VideoInfo.d;
                    if (optJSONObject2 != null) {
                    }
                    videoInfo = null;
                    videoInfo2 = this.t;
                    if (videoInfo2 == null) {
                    }
                    this.t = videoInfo;
                    i2 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i2;
                }
                this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                this.s = adBreakStatus;
                i2 |= 32;
                optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                Logger logger22 = VideoInfo.d;
                if (optJSONObject2 != null) {
                }
                videoInfo = null;
                videoInfo2 = this.t;
                if (videoInfo2 == null) {
                }
                this.t = videoInfo;
                i2 |= 64;
                if (jSONObject2.has("breakInfo")) {
                }
                if (jSONObject2.has("queueData")) {
                }
                if (jSONObject2.has("liveSeekableRange")) {
                }
                return i2;
            }
            if (optInt2 == 0) {
                z2 = true;
                i4 = 0;
                this.c = i4;
                this.l = i4;
                this.m = i4;
                if (!arrayList2.isEmpty()) {
                }
                optJSONObject = jSONObject2.optJSONObject("breakStatus");
                Parcelable.Creator<AdBreakStatus> creator3 = AdBreakStatus.CREATOR;
                if (optJSONObject != null) {
                    long j42 = optJSONObject.getLong("currentBreakTime");
                    Pattern pattern32 = CastUtils.a;
                    long j52 = j42 * 1000;
                    long j62 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                    String a5 = CastUtils.a("breakId", optJSONObject);
                    String a22 = CastUtils.a("breakClipId", optJSONObject);
                    optLong = optJSONObject.optLong("whenSkippable", -1L);
                    if (optLong != -1) {
                    }
                    adBreakStatus = new AdBreakStatus(j52, j62, a5, a22, optLong);
                    adBreakStatus2 = this.s;
                    if (adBreakStatus2 == null) {
                    }
                    this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                    this.s = adBreakStatus;
                    i2 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    Logger logger222 = VideoInfo.d;
                    if (optJSONObject2 != null) {
                    }
                    videoInfo = null;
                    videoInfo2 = this.t;
                    if (videoInfo2 == null) {
                    }
                    this.t = videoInfo;
                    i2 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i2;
                }
                adBreakStatus = null;
                adBreakStatus2 = this.s;
                if (adBreakStatus2 == null) {
                }
                this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                this.s = adBreakStatus;
                i2 |= 32;
                optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                Logger logger2222 = VideoInfo.d;
                if (optJSONObject2 != null) {
                }
                videoInfo = null;
                videoInfo2 = this.t;
                if (videoInfo2 == null) {
                }
                this.t = videoInfo;
                i2 |= 64;
                if (jSONObject2.has("breakInfo")) {
                }
                if (jSONObject2.has("queueData")) {
                }
                if (jSONObject2.has("liveSeekableRange")) {
                }
                return i2;
            }
        }
        if (jSONObject2.has("repeatMode")) {
            Integer a6 = MediaCommon.a(jSONObject2.getString("repeatMode"));
            int intValue = a6 == null ? this.p : a6.intValue();
            if (this.p != intValue) {
                this.p = intValue;
                z = true;
                if (jSONObject2.has("items")) {
                    z2 = true;
                } else {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                    int length = jSONArray2.length();
                    SparseArray sparseArray2 = new SparseArray();
                    int i16 = 0;
                    while (i16 < length) {
                        sparseArray2.put(i16, Integer.valueOf(jSONArray2.getJSONObject(i16).getInt("itemId")));
                        i16++;
                        z3 = z3;
                    }
                    z2 = z3;
                    ArrayList arrayList6 = new ArrayList();
                    for (0; i3 < length; i3 + 1) {
                        Integer num = (Integer) sparseArray2.get(i3);
                        JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
                        MediaQueueItem Z0 = Z0(num.intValue());
                        if (Z0 != null) {
                            z |= Z0.Y0(jSONObject7);
                            arrayList6.add(Z0);
                            i3 = i3 == ((Integer) sparseArray.get(num.intValue())).intValue() ? i3 + 1 : 0;
                        } else if (num.intValue() != this.c || (mediaInfo = this.a) == null) {
                            arrayList6.add(new MediaQueueItem(jSONObject7));
                        } else {
                            MediaQueueItem a7 = new MediaQueueItem.Builder(mediaInfo).a();
                            a7.Y0(jSONObject7);
                            arrayList6.add(a7);
                        }
                        z = z2;
                    }
                    z |= !(arrayList2.size() != length ? false : z2);
                    c1(arrayList6);
                }
                if (z) {
                    i2 |= 8;
                }
                optJSONObject = jSONObject2.optJSONObject("breakStatus");
                Parcelable.Creator<AdBreakStatus> creator32 = AdBreakStatus.CREATOR;
                if (optJSONObject != null) {
                }
                adBreakStatus = null;
                adBreakStatus2 = this.s;
                if (adBreakStatus2 == null) {
                }
                this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
                this.s = adBreakStatus;
                i2 |= 32;
                optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                Logger logger22222 = VideoInfo.d;
                if (optJSONObject2 != null) {
                }
                videoInfo = null;
                videoInfo2 = this.t;
                if (videoInfo2 == null) {
                }
                this.t = videoInfo;
                i2 |= 64;
                if (jSONObject2.has("breakInfo")) {
                }
                if (jSONObject2.has("queueData")) {
                }
                if (jSONObject2.has("liveSeekableRange")) {
                }
                return i2;
            }
        }
        z = false;
        if (jSONObject2.has("items")) {
        }
        if (z) {
        }
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<AdBreakStatus> creator322 = AdBreakStatus.CREATOR;
        if (optJSONObject != null) {
        }
        adBreakStatus = null;
        adBreakStatus2 = this.s;
        if (adBreakStatus2 == null) {
        }
        this.r = (adBreakStatus != null || (adBreakStatus.c == null && adBreakStatus.d == null)) ? false : z2;
        this.s = adBreakStatus;
        i2 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        Logger logger222222 = VideoInfo.d;
        if (optJSONObject2 != null) {
        }
        videoInfo = null;
        videoInfo2 = this.t;
        if (videoInfo2 == null) {
        }
        this.t = videoInfo;
        i2 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i2;
    }

    public final void c1(List list) {
        ArrayList arrayList = this.q;
        arrayList.clear();
        SparseArray sparseArray = this.x;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            arrayList.add(mediaQueueItem);
            sparseArray.put(mediaQueueItem.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof MediaStatus) {
                MediaStatus mediaStatus = (MediaStatus) obj;
                if ((this.o == null) == (mediaStatus.o == null) && this.b == mediaStatus.b && this.c == mediaStatus.c && this.d == mediaStatus.d && this.e == mediaStatus.e && this.f == mediaStatus.f && this.g == mediaStatus.g && this.i == mediaStatus.i && this.j == mediaStatus.j && this.l == mediaStatus.l && this.m == mediaStatus.m && this.p == mediaStatus.p && Arrays.equals(this.k, mediaStatus.k) && CastUtils.c(Long.valueOf(this.h), Long.valueOf(mediaStatus.h)) && CastUtils.c(this.q, mediaStatus.q) && CastUtils.c(this.a, mediaStatus.a) && (((jSONObject = this.o) == null || (jSONObject2 = mediaStatus.o) == null || JsonUtils.a(jSONObject, jSONObject2)) && this.r == mediaStatus.r && CastUtils.c(this.s, mediaStatus.s) && CastUtils.c(this.t, mediaStatus.t) && CastUtils.c(this.u, mediaStatus.u) && Objects.a(this.v, mediaStatus.v) && this.w == mediaStatus.w)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Double.valueOf(this.i), Boolean.valueOf(this.j), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(this.l), Integer.valueOf(this.m), String.valueOf(this.o), Integer.valueOf(this.p), this.q, Boolean.valueOf(this.r), this.s, this.t, this.u, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        long j = this.b;
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.g;
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.h;
        SafeParcelWriter.r(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.i;
        SafeParcelWriter.r(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.j;
        SafeParcelWriter.r(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.j(parcel, 12, this.k);
        int i5 = this.l;
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.m;
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(i6);
        SafeParcelWriter.m(parcel, 15, this.n, false);
        int i7 = this.p;
        SafeParcelWriter.r(parcel, 16, 4);
        parcel.writeInt(i7);
        SafeParcelWriter.q(parcel, 17, this.q, false);
        boolean z2 = this.r;
        SafeParcelWriter.r(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.l(parcel, 19, this.s, i, false);
        SafeParcelWriter.l(parcel, 20, this.t, i, false);
        SafeParcelWriter.l(parcel, 21, this.u, i, false);
        SafeParcelWriter.l(parcel, 22, this.v, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
