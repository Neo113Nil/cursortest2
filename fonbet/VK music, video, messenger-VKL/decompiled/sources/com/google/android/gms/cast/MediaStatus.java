package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
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
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dq70;
import xsna.esz0;
import xsna.exc0;
import xsna.nby;
import xsna.ne7;
import xsna.o0a;
import xsna.o100;
import xsna.ozg0;
import xsna.v401;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaStatus extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MediaStatus> CREATOR;

    @Nullable
    public MediaInfo b;
    public long c;
    public int d;
    public double e;
    public int f;
    public int g;
    public long h;
    public long i;
    public double j;
    public boolean k;

    @Nullable
    public long[] l;
    public int m;
    public int n;

    @Nullable
    public String o;

    @Nullable
    public JSONObject p;
    public int q;
    public final ArrayList r;
    public boolean s;

    @Nullable
    public AdBreakStatus t;

    @Nullable
    public VideoInfo u;

    @Nullable
    public MediaLiveSeekableRange v;

    @Nullable
    public MediaQueueData w;
    public boolean x;
    public final SparseArray y;

    static {
        exc0.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new v401();
    }

    @SuppressLint({"NonSdkVisibleApi"})
    public MediaStatus(@Nullable MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, @Nullable long[] jArr, int i4, int i5, @Nullable String str, int i6, @Nullable List list, boolean z2, @Nullable AdBreakStatus adBreakStatus, @Nullable VideoInfo videoInfo, @Nullable MediaLiveSeekableRange mediaLiveSeekableRange, @Nullable MediaQueueData mediaQueueData) {
        this.r = new ArrayList();
        this.y = new SparseArray();
        this.b = mediaInfo;
        this.c = j;
        this.d = i;
        this.e = d;
        this.f = i2;
        this.g = i3;
        this.h = j2;
        this.i = j3;
        this.j = d2;
        this.k = z;
        this.l = jArr;
        this.m = i4;
        this.n = i5;
        this.o = str;
        if (str != null) {
            try {
                this.p = new JSONObject(this.o);
            } catch (JSONException unused) {
                this.p = null;
                this.o = null;
            }
        } else {
            this.p = null;
        }
        this.q = i6;
        if (list != null && !list.isEmpty()) {
            l(list);
        }
        this.s = z2;
        this.t = adBreakStatus;
        this.u = videoInfo;
        this.v = mediaLiveSeekableRange;
        this.w = mediaQueueData;
        boolean z3 = false;
        if (mediaQueueData != null && mediaQueueData.k) {
            z3 = true;
        }
        this.x = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof MediaStatus) {
                MediaStatus mediaStatus = (MediaStatus) obj;
                if ((this.p == null) == (mediaStatus.p == null) && this.c == mediaStatus.c && this.d == mediaStatus.d && this.e == mediaStatus.e && this.f == mediaStatus.f && this.g == mediaStatus.g && this.h == mediaStatus.h && this.j == mediaStatus.j && this.k == mediaStatus.k && this.m == mediaStatus.m && this.n == mediaStatus.n && this.q == mediaStatus.q && Arrays.equals(this.l, mediaStatus.l) && o0a.c(Long.valueOf(this.i), Long.valueOf(mediaStatus.i)) && o0a.c(this.r, mediaStatus.r) && o0a.c(this.b, mediaStatus.b) && (((jSONObject = this.p) == null || (jSONObject2 = mediaStatus.p) == null || nby.a(jSONObject, jSONObject2)) && this.s == mediaStatus.s && o0a.c(this.t, mediaStatus.t) && o0a.c(this.u, mediaStatus.u) && o0a.c(this.v, mediaStatus.v) && dq70.b(this.w, mediaStatus.w) && this.x == mediaStatus.x)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Double.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.i), Double.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(this.m), Integer.valueOf(this.n), String.valueOf(this.p), Integer.valueOf(this.q), this.r, Boolean.valueOf(this.s), this.t, this.u, this.v, this.w});
    }

    @Nullable
    public final AdBreakClipInfo i() {
        MediaInfo mediaInfo;
        AdBreakStatus adBreakStatus = this.t;
        if (adBreakStatus != null) {
            String str = adBreakStatus.e;
            if (!TextUtils.isEmpty(str) && (mediaInfo = this.b) != null) {
                List list = mediaInfo.k;
                List<AdBreakClipInfo> unmodifiableList = list == null ? null : Collections.unmodifiableList(list);
                if (unmodifiableList != null && !unmodifiableList.isEmpty()) {
                    for (AdBreakClipInfo adBreakClipInfo : unmodifiableList) {
                        if (str.equals(adBreakClipInfo.b)) {
                            return adBreakClipInfo;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public final MediaQueueItem j(int i) {
        Integer num = (Integer) this.y.get(i);
        if (num == null) {
            return null;
        }
        return (MediaQueueItem) this.r.get(num.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023f, code lost:
    
        if (r13 != 3) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0246, code lost:
    
        if (r2 == 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01af, code lost:
    
        if (r30.l != null) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0396 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0375 A[Catch: JSONException -> 0x0380, TryCatch #3 {JSONException -> 0x0380, blocks: (B:331:0x034f, B:333:0x0375, B:334:0x0376), top: B:330:0x034f }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006c  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.cast.MediaStatus] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(@NonNull JSONObject jSONObject, int i) throws JSONException {
        JSONObject jSONObject2;
        long j;
        int i2;
        double d;
        JSONArray jSONArray;
        long[] jArr;
        int optInt;
        int optInt2;
        int i3;
        boolean z;
        boolean z2;
        MediaInfo mediaInfo;
        JSONObject optJSONObject;
        long optLong;
        AdBreakStatus adBreakStatus;
        AdBreakStatus adBreakStatus2;
        JSONObject optJSONObject2;
        ?? r10;
        int i4;
        VideoInfo videoInfo;
        VideoInfo videoInfo2;
        MediaLiveSeekableRange mediaLiveSeekableRange;
        char c;
        char c2;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        int i5;
        MediaInfo mediaInfo2;
        int i6;
        int i7;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("extendedStatus");
        if (optJSONObject3 != null) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    arrayList.add(keys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
                Iterator<String> keys2 = optJSONObject3.keys();
                while (keys2.hasNext()) {
                    String next = keys2.next();
                    jSONObject2.put(next, optJSONObject3.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
            }
            j = jSONObject2.getLong("mediaSessionId");
            boolean z3 = true;
            if (j == this.c) {
                this.c = j;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (jSONObject2.has("playerState")) {
                String string = jSONObject2.getString("playerState");
                int i8 = string.equals("IDLE") ? 1 : string.equals("PLAYING") ? 2 : string.equals("PAUSED") ? 3 : string.equals("BUFFERING") ? 4 : string.equals("LOADING") ? 5 : 0;
                if (i8 != this.f) {
                    this.f = i8;
                    i2 |= 2;
                }
                if (i8 == 1 && jSONObject2.has("idleReason")) {
                    String string2 = jSONObject2.getString("idleReason");
                    int i9 = string2.equals("CANCELLED") ? 2 : string2.equals("INTERRUPTED") ? 3 : string2.equals("FINISHED") ? 1 : string2.equals("ERROR") ? 4 : 0;
                    if (i9 != this.g) {
                        this.g = i9;
                        i2 |= 2;
                    }
                }
            }
            if (jSONObject2.has("playbackRate")) {
                double d2 = jSONObject2.getDouble("playbackRate");
                if (this.e != d2) {
                    this.e = d2;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("currentTime")) {
                double d3 = jSONObject2.getDouble("currentTime");
                Pattern pattern = o0a.a;
                long j2 = (long) (d3 * 1000.0d);
                if (j2 != this.h) {
                    this.h = j2;
                    i2 |= 2;
                }
                i2 |= 128;
            }
            if (jSONObject2.has("supportedMediaCommands")) {
                long j3 = jSONObject2.getLong("supportedMediaCommands");
                if (j3 != this.i) {
                    this.i = j3;
                    i2 |= 2;
                }
            }
            if (jSONObject2.has("volume") || i != 0) {
                d = 1000.0d;
            } else {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
                double d4 = jSONObject3.getDouble("level");
                d = 1000.0d;
                if (d4 != this.j) {
                    this.j = d4;
                    i2 |= 2;
                }
                boolean z4 = jSONObject3.getBoolean("muted");
                if (z4 != this.k) {
                    this.k = z4;
                    i2 |= 2;
                }
            }
            jSONArray = !jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
            Pattern pattern2 = o0a.a;
            if (jSONArray != null) {
                jArr = null;
            } else {
                jArr = new long[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    jArr[i10] = jSONArray.getLong(i10);
                }
            }
            if (jArr == null) {
                long[] jArr2 = this.l;
                if (jArr2 != null) {
                    if (jArr2.length == jArr.length) {
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            if (this.l[i11] == jArr[i11]) {
                            }
                        }
                    }
                }
                this.l = jArr;
                i2 |= 2;
                break;
            }
            if (jSONObject2.has("customData")) {
                this.p = jSONObject2.getJSONObject("customData");
                this.o = null;
                i2 |= 2;
            }
            if (jSONObject2.has(X3.i.I0)) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject(X3.i.I0);
                MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
                MediaInfo mediaInfo4 = this.b;
                if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                    this.b = mediaInfo3;
                    i2 |= 2;
                }
                if (jSONObject4.has("metadata")) {
                    i2 |= 4;
                }
            }
            if (jSONObject2.has("currentItemId") && this.d != (i7 = jSONObject2.getInt("currentItemId"))) {
                this.d = i7;
                i2 |= 2;
            }
            optInt = jSONObject2.optInt("preloadedItemId", 0);
            if (this.n != optInt) {
                this.n = optInt;
                i2 |= 16;
            }
            optInt2 = jSONObject2.optInt("loadingItemId", 0);
            if (this.m != optInt2) {
                this.m = optInt2;
                i2 |= 2;
            }
            MediaInfo mediaInfo5 = this.b;
            int i12 = mediaInfo5 != null ? -1 : mediaInfo5.c;
            i3 = this.f;
            int i13 = this.g;
            int i14 = this.m;
            ArrayList arrayList2 = this.r;
            double d5 = d;
            SparseArray sparseArray = this.y;
            if (i3 == 1) {
                if (i13 != 1) {
                    if (i13 != 2) {
                    }
                    i6 = 0;
                    z2 = true;
                    this.d = i6;
                    this.m = i6;
                    this.n = i6;
                    if (!arrayList2.isEmpty()) {
                        i2 |= 8;
                        this.q = i6;
                        arrayList2.clear();
                        sparseArray.clear();
                    }
                    int i15 = i2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<AdBreakStatus> creator = AdBreakStatus.CREATOR;
                    if (optJSONObject != null && optJSONObject.has("currentBreakTime") && optJSONObject.has("currentBreakClipTime")) {
                        try {
                            long j4 = optJSONObject.getLong("currentBreakTime");
                            Pattern pattern3 = o0a.a;
                            long j5 = j4 * 1000;
                            long j6 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                            String a = o0a.a(optJSONObject, "breakId");
                            String a2 = o0a.a(optJSONObject, "breakClipId");
                            optLong = optJSONObject.optLong("whenSkippable", -1L);
                            if (optLong != -1) {
                                optLong *= 1000;
                            }
                            adBreakStatus = new AdBreakStatus(a, j5, a2, j6, optLong);
                        } catch (JSONException e) {
                            o100 o100Var = AdBreakStatus.g;
                            Log.e(o100Var.a, o100Var.c("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e);
                        }
                        adBreakStatus2 = this.t;
                        if ((adBreakStatus2 == null && adBreakStatus != null) || (adBreakStatus2 != null && !adBreakStatus2.equals(adBreakStatus))) {
                            this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                            this.t = adBreakStatus;
                            i15 |= 32;
                        }
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        o100 o100Var2 = VideoInfo.e;
                        if (optJSONObject2 != null) {
                            try {
                                String string3 = optJSONObject2.getString("hdrType");
                                int hashCode = string3.hashCode();
                                if (hashCode == 3218) {
                                    if (string3.equals("dv")) {
                                        r10 = 0;
                                        if (r10 != 0) {
                                        }
                                        videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                    }
                                    r10 = -1;
                                    if (r10 != 0) {
                                    }
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                } else if (hashCode == 103158) {
                                    if (string3.equals("hdr")) {
                                        r10 = 2;
                                        if (r10 != 0) {
                                        }
                                        videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                    }
                                    r10 = -1;
                                    if (r10 != 0) {
                                    }
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                } else if (hashCode != 113729) {
                                    if (hashCode == 99136405 && string3.equals("hdr10")) {
                                        r10 = z2;
                                        if (r10 != 0) {
                                            i4 = 3;
                                        } else if (r10 == z2) {
                                            i4 = 2;
                                        } else if (r10 == 2) {
                                            i4 = 4;
                                        } else if (r10 != 3) {
                                            o100Var2.a("Unknown HDR type: %s", string3);
                                            i4 = 0;
                                        } else {
                                            i4 = 1;
                                        }
                                        videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                    }
                                    r10 = -1;
                                    if (r10 != 0) {
                                    }
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                } else {
                                    if (string3.equals("sdr")) {
                                        r10 = 3;
                                        if (r10 != 0) {
                                        }
                                        videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                    }
                                    r10 = -1;
                                    if (r10 != 0) {
                                    }
                                    videoInfo = new VideoInfo(optJSONObject2.getInt("width"), optJSONObject2.getInt("height"), i4);
                                }
                            } catch (JSONException unused2) {
                                o100Var2.b("Error while creating a VideoInfo instance from JSON", new Object[0]);
                            }
                            videoInfo2 = this.u;
                            if ((videoInfo2 == null && videoInfo != null) || (videoInfo2 != null && !videoInfo2.equals(videoInfo))) {
                                this.u = videoInfo;
                                i15 |= 64;
                            }
                            if (jSONObject2.has("breakInfo") && (mediaInfo2 = this.b) != null) {
                                mediaInfo2.j(jSONObject2.getJSONObject("breakInfo"));
                                i15 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                                MediaQueueData mediaQueueData = new MediaQueueData();
                                mediaQueueData.b = null;
                                mediaQueueData.c = null;
                                mediaQueueData.d = 0;
                                mediaQueueData.e = null;
                                mediaQueueData.g = 0;
                                mediaQueueData.h = null;
                                mediaQueueData.i = 0;
                                mediaQueueData.j = -1L;
                                mediaQueueData.k = false;
                                JSONObject jSONObject5 = jSONObject2.getJSONObject("queueData");
                                mediaQueueData.b = null;
                                mediaQueueData.c = null;
                                mediaQueueData.d = 0;
                                mediaQueueData.e = null;
                                mediaQueueData.g = 0;
                                mediaQueueData.h = null;
                                mediaQueueData.i = 0;
                                mediaQueueData.j = -1L;
                                mediaQueueData.k = false;
                                if (jSONObject5 != null) {
                                    mediaQueueData.b = o0a.a(jSONObject5, "id");
                                    mediaQueueData.c = o0a.a(jSONObject5, "entity");
                                    String optString = jSONObject5.optString("queueType");
                                    int i16 = 7;
                                    switch (optString.hashCode()) {
                                        case -1803151310:
                                            if (optString.equals("PODCAST_SERIES")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1758903120:
                                            if (optString.equals("RADIO_STATION")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1632865838:
                                            if (optString.equals("PLAYLIST")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1319760993:
                                            if (optString.equals("AUDIOBOOK")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1088524588:
                                            if (optString.equals("TV_SERIES")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 62359119:
                                            if (optString.equals("ALBUM")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 73549584:
                                            if (optString.equals(SignalingProtocol.KEY_STREAM_TYPE_MOVIE)) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 393100598:
                                            if (optString.equals("VIDEO_PLAYLIST")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 902303413:
                                            if (optString.equals("LIVE_TV")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                            i16 = 1;
                                            mediaQueueData.d = i16;
                                            break;
                                        case 1:
                                            i16 = 2;
                                            mediaQueueData.d = i16;
                                            break;
                                        case 2:
                                            i16 = 3;
                                            mediaQueueData.d = i16;
                                            break;
                                        case 3:
                                            i5 = 4;
                                            mediaQueueData.d = i5;
                                            break;
                                        case 4:
                                            i5 = 5;
                                            mediaQueueData.d = i5;
                                            break;
                                        case 5:
                                            mediaQueueData.d = 6;
                                            break;
                                        case 6:
                                            mediaQueueData.d = i16;
                                            break;
                                        case 7:
                                            mediaQueueData.d = 8;
                                            break;
                                        case '\b':
                                            i5 = 9;
                                            mediaQueueData.d = i5;
                                            break;
                                    }
                                    mediaQueueData.e = o0a.a(jSONObject5, "name");
                                    JSONObject optJSONObject4 = jSONObject5.has("containerMetadata") ? jSONObject5.optJSONObject("containerMetadata") : null;
                                    if (optJSONObject4 != null) {
                                        MediaQueueContainerMetadata mediaQueueContainerMetadata = new MediaQueueContainerMetadata();
                                        mediaQueueContainerMetadata.b = 0;
                                        mediaQueueContainerMetadata.c = null;
                                        mediaQueueContainerMetadata.d = null;
                                        mediaQueueContainerMetadata.e = null;
                                        mediaQueueContainerMetadata.f = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                                        String optString2 = optJSONObject4.optString("containerType", "");
                                        int hashCode2 = optString2.hashCode();
                                        if (hashCode2 != 6924225) {
                                            if (hashCode2 == 828666841 && optString2.equals("GENERIC_CONTAINER")) {
                                                c2 = 0;
                                                if (c2 != 0) {
                                                    mediaQueueContainerMetadata.b = 0;
                                                } else if (c2 == 1) {
                                                    mediaQueueContainerMetadata.b = 1;
                                                }
                                                mediaQueueContainerMetadata.c = o0a.a(optJSONObject4, "title");
                                                optJSONArray = optJSONObject4.optJSONArray("sections");
                                                if (optJSONArray != null) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    mediaQueueContainerMetadata.d = arrayList3;
                                                    for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                                                        JSONObject optJSONObject5 = optJSONArray.optJSONObject(i17);
                                                        if (optJSONObject5 != null) {
                                                            MediaMetadata mediaMetadata = new MediaMetadata();
                                                            mediaMetadata.k(optJSONObject5);
                                                            arrayList3.add(mediaMetadata);
                                                        }
                                                    }
                                                }
                                                optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                                if (optJSONArray2 != null) {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    mediaQueueContainerMetadata.e = arrayList4;
                                                    esz0.a(arrayList4, optJSONArray2);
                                                }
                                                mediaQueueContainerMetadata.f = optJSONObject4.optDouble("containerDuration", mediaQueueContainerMetadata.f);
                                                MediaQueueContainerMetadata mediaQueueContainerMetadata2 = new MediaQueueContainerMetadata();
                                                mediaQueueContainerMetadata2.b = mediaQueueContainerMetadata.b;
                                                mediaQueueContainerMetadata2.c = mediaQueueContainerMetadata.c;
                                                mediaQueueContainerMetadata2.d = mediaQueueContainerMetadata.d;
                                                mediaQueueContainerMetadata2.e = mediaQueueContainerMetadata.e;
                                                mediaQueueContainerMetadata2.f = mediaQueueContainerMetadata.f;
                                                mediaQueueData.f = mediaQueueContainerMetadata2;
                                            }
                                            c2 = 65535;
                                            if (c2 != 0) {
                                            }
                                            mediaQueueContainerMetadata.c = o0a.a(optJSONObject4, "title");
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray != null) {
                                            }
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 != null) {
                                            }
                                            mediaQueueContainerMetadata.f = optJSONObject4.optDouble("containerDuration", mediaQueueContainerMetadata.f);
                                            MediaQueueContainerMetadata mediaQueueContainerMetadata22 = new MediaQueueContainerMetadata();
                                            mediaQueueContainerMetadata22.b = mediaQueueContainerMetadata.b;
                                            mediaQueueContainerMetadata22.c = mediaQueueContainerMetadata.c;
                                            mediaQueueContainerMetadata22.d = mediaQueueContainerMetadata.d;
                                            mediaQueueContainerMetadata22.e = mediaQueueContainerMetadata.e;
                                            mediaQueueContainerMetadata22.f = mediaQueueContainerMetadata.f;
                                            mediaQueueData.f = mediaQueueContainerMetadata22;
                                        } else {
                                            if (optString2.equals("AUDIOBOOK_CONTAINER")) {
                                                c2 = 1;
                                                if (c2 != 0) {
                                                }
                                                mediaQueueContainerMetadata.c = o0a.a(optJSONObject4, "title");
                                                optJSONArray = optJSONObject4.optJSONArray("sections");
                                                if (optJSONArray != null) {
                                                }
                                                optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                                if (optJSONArray2 != null) {
                                                }
                                                mediaQueueContainerMetadata.f = optJSONObject4.optDouble("containerDuration", mediaQueueContainerMetadata.f);
                                                MediaQueueContainerMetadata mediaQueueContainerMetadata222 = new MediaQueueContainerMetadata();
                                                mediaQueueContainerMetadata222.b = mediaQueueContainerMetadata.b;
                                                mediaQueueContainerMetadata222.c = mediaQueueContainerMetadata.c;
                                                mediaQueueContainerMetadata222.d = mediaQueueContainerMetadata.d;
                                                mediaQueueContainerMetadata222.e = mediaQueueContainerMetadata.e;
                                                mediaQueueContainerMetadata222.f = mediaQueueContainerMetadata.f;
                                                mediaQueueData.f = mediaQueueContainerMetadata222;
                                            }
                                            c2 = 65535;
                                            if (c2 != 0) {
                                            }
                                            mediaQueueContainerMetadata.c = o0a.a(optJSONObject4, "title");
                                            optJSONArray = optJSONObject4.optJSONArray("sections");
                                            if (optJSONArray != null) {
                                            }
                                            optJSONArray2 = optJSONObject4.optJSONArray("containerImages");
                                            if (optJSONArray2 != null) {
                                            }
                                            mediaQueueContainerMetadata.f = optJSONObject4.optDouble("containerDuration", mediaQueueContainerMetadata.f);
                                            MediaQueueContainerMetadata mediaQueueContainerMetadata2222 = new MediaQueueContainerMetadata();
                                            mediaQueueContainerMetadata2222.b = mediaQueueContainerMetadata.b;
                                            mediaQueueContainerMetadata2222.c = mediaQueueContainerMetadata.c;
                                            mediaQueueContainerMetadata2222.d = mediaQueueContainerMetadata.d;
                                            mediaQueueContainerMetadata2222.e = mediaQueueContainerMetadata.e;
                                            mediaQueueContainerMetadata2222.f = mediaQueueContainerMetadata.f;
                                            mediaQueueData.f = mediaQueueContainerMetadata2222;
                                        }
                                    }
                                    Integer C = ne7.C(jSONObject5.optString("repeatMode"));
                                    if (C != null) {
                                        mediaQueueData.g = C.intValue();
                                    }
                                    JSONArray optJSONArray3 = jSONObject5.optJSONArray("items");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList5 = new ArrayList();
                                        mediaQueueData.h = arrayList5;
                                        for (int i18 = 0; i18 < optJSONArray3.length(); i18++) {
                                            JSONObject optJSONObject6 = optJSONArray3.optJSONObject(i18);
                                            if (optJSONObject6 != null) {
                                                try {
                                                    arrayList5.add(new MediaQueueItem(optJSONObject6));
                                                } catch (JSONException unused3) {
                                                }
                                            }
                                        }
                                    }
                                    mediaQueueData.i = jSONObject5.optInt("startIndex", mediaQueueData.i);
                                    if (jSONObject5.has("startTime")) {
                                        mediaQueueData.j = (long) (jSONObject5.optDouble("startTime", mediaQueueData.j) * d5);
                                    }
                                    mediaQueueData.k = jSONObject5.optBoolean("shuffle");
                                }
                                MediaQueueData mediaQueueData2 = new MediaQueueData();
                                mediaQueueData2.b = mediaQueueData.b;
                                mediaQueueData2.c = mediaQueueData.c;
                                mediaQueueData2.d = mediaQueueData.d;
                                mediaQueueData2.e = mediaQueueData.e;
                                mediaQueueData2.f = mediaQueueData.f;
                                mediaQueueData2.g = mediaQueueData.g;
                                mediaQueueData2.h = mediaQueueData.h;
                                mediaQueueData2.i = mediaQueueData.i;
                                mediaQueueData2.j = mediaQueueData.j;
                                boolean z5 = mediaQueueData.k;
                                mediaQueueData2.k = z5;
                                this.w = mediaQueueData2;
                                if (this.x != z5) {
                                    this.x = z5;
                                    i15 |= 8;
                                }
                            }
                            if (jSONObject2.has("liveSeekableRange")) {
                                if (this.v != null) {
                                    i15 |= 2;
                                }
                                this.v = null;
                            } else {
                                i15 |= 2;
                                JSONObject optJSONObject7 = jSONObject2.optJSONObject("liveSeekableRange");
                                Parcelable.Creator<MediaLiveSeekableRange> creator2 = MediaLiveSeekableRange.CREATOR;
                                if (optJSONObject7 != null && optJSONObject7.has("start") && optJSONObject7.has(TtmlNode.END)) {
                                    try {
                                        double d6 = optJSONObject7.getDouble("start");
                                        Pattern pattern4 = o0a.a;
                                        mediaLiveSeekableRange = new MediaLiveSeekableRange((long) (d6 * d5), (long) (optJSONObject7.getDouble(TtmlNode.END) * d5), optJSONObject7.optBoolean("isMovingWindow"), optJSONObject7.optBoolean("isLiveDone"));
                                    } catch (JSONException unused4) {
                                        o100 o100Var3 = MediaLiveSeekableRange.f;
                                        Log.e(o100Var3.a, o100Var3.c("Ignoring Malformed MediaLiveSeekableRange: ".concat(optJSONObject7.toString()), new Object[0]));
                                    }
                                    this.v = mediaLiveSeekableRange;
                                }
                                mediaLiveSeekableRange = null;
                                this.v = mediaLiveSeekableRange;
                            }
                            return i15;
                        }
                        videoInfo = null;
                        videoInfo2 = this.u;
                        if (videoInfo2 == null) {
                            this.u = videoInfo;
                            i15 |= 64;
                            if (jSONObject2.has("breakInfo")) {
                                mediaInfo2.j(jSONObject2.getJSONObject("breakInfo"));
                                i15 |= 2;
                            }
                            if (jSONObject2.has("queueData")) {
                            }
                            if (jSONObject2.has("liveSeekableRange")) {
                            }
                            return i15;
                        }
                        this.u = videoInfo;
                        i15 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i15;
                    }
                    adBreakStatus = null;
                    adBreakStatus2 = this.t;
                    if (adBreakStatus2 == null) {
                        this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                        this.t = adBreakStatus;
                        i15 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        o100 o100Var22 = VideoInfo.e;
                        if (optJSONObject2 != null) {
                        }
                        videoInfo = null;
                        videoInfo2 = this.u;
                        if (videoInfo2 == null) {
                        }
                        this.u = videoInfo;
                        i15 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i15;
                    }
                    this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                    this.t = adBreakStatus;
                    i15 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    o100 o100Var222 = VideoInfo.e;
                    if (optJSONObject2 != null) {
                    }
                    videoInfo = null;
                    videoInfo2 = this.u;
                    if (videoInfo2 == null) {
                    }
                    this.u = videoInfo;
                    i15 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i15;
                }
                if (i14 == 0) {
                    z2 = true;
                    i6 = 0;
                    this.d = i6;
                    this.m = i6;
                    this.n = i6;
                    if (!arrayList2.isEmpty()) {
                    }
                    int i152 = i2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<AdBreakStatus> creator3 = AdBreakStatus.CREATOR;
                    if (optJSONObject != null) {
                        long j42 = optJSONObject.getLong("currentBreakTime");
                        Pattern pattern32 = o0a.a;
                        long j52 = j42 * 1000;
                        long j62 = optJSONObject.getLong("currentBreakClipTime") * 1000;
                        String a3 = o0a.a(optJSONObject, "breakId");
                        String a22 = o0a.a(optJSONObject, "breakClipId");
                        optLong = optJSONObject.optLong("whenSkippable", -1L);
                        if (optLong != -1) {
                        }
                        adBreakStatus = new AdBreakStatus(a3, j52, a22, j62, optLong);
                        adBreakStatus2 = this.t;
                        if (adBreakStatus2 == null) {
                        }
                        this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                        this.t = adBreakStatus;
                        i152 |= 32;
                        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                        o100 o100Var2222 = VideoInfo.e;
                        if (optJSONObject2 != null) {
                        }
                        videoInfo = null;
                        videoInfo2 = this.u;
                        if (videoInfo2 == null) {
                        }
                        this.u = videoInfo;
                        i152 |= 64;
                        if (jSONObject2.has("breakInfo")) {
                        }
                        if (jSONObject2.has("queueData")) {
                        }
                        if (jSONObject2.has("liveSeekableRange")) {
                        }
                        return i152;
                    }
                    adBreakStatus = null;
                    adBreakStatus2 = this.t;
                    if (adBreakStatus2 == null) {
                    }
                    this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                    this.t = adBreakStatus;
                    i152 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    o100 o100Var22222 = VideoInfo.e;
                    if (optJSONObject2 != null) {
                    }
                    videoInfo = null;
                    videoInfo2 = this.u;
                    if (videoInfo2 == null) {
                    }
                    this.u = videoInfo;
                    i152 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i152;
                }
            }
            if (jSONObject2.has("repeatMode")) {
                Integer C2 = ne7.C(jSONObject2.getString("repeatMode"));
                int intValue = C2 == null ? this.q : C2.intValue();
                if (this.q != intValue) {
                    this.q = intValue;
                    z = true;
                    if (jSONObject2.has("items")) {
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                        int length = jSONArray2.length();
                        SparseArray sparseArray2 = new SparseArray();
                        for (int i19 = 0; i19 < length; i19++) {
                            sparseArray2.put(i19, Integer.valueOf(jSONArray2.getJSONObject(i19).getInt("itemId")));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        int i20 = 0;
                        while (i20 < length) {
                            Integer num = (Integer) sparseArray2.get(i20);
                            boolean z6 = z3;
                            JSONObject jSONObject6 = jSONArray2.getJSONObject(i20);
                            MediaQueueItem j7 = j(num.intValue());
                            if (j7 != null) {
                                z |= j7.b(jSONObject6);
                                arrayList6.add(j7);
                                if (i20 == ((Integer) sparseArray.get(num.intValue())).intValue()) {
                                    i20++;
                                    z3 = z6;
                                }
                            } else if (num.intValue() != this.d || (mediaInfo = this.b) == null) {
                                arrayList6.add(new MediaQueueItem(jSONObject6));
                            } else {
                                MediaQueueItem a4 = new MediaQueueItem.a(mediaInfo).a();
                                a4.b(jSONObject6);
                                arrayList6.add(a4);
                            }
                            z = z6;
                            i20++;
                            z3 = z6;
                        }
                        z2 = z3;
                        z |= !(arrayList2.size() != length ? false : z2);
                        l(arrayList6);
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        i2 |= 8;
                    }
                    int i1522 = i2;
                    optJSONObject = jSONObject2.optJSONObject("breakStatus");
                    Parcelable.Creator<AdBreakStatus> creator32 = AdBreakStatus.CREATOR;
                    if (optJSONObject != null) {
                    }
                    adBreakStatus = null;
                    adBreakStatus2 = this.t;
                    if (adBreakStatus2 == null) {
                    }
                    this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
                    this.t = adBreakStatus;
                    i1522 |= 32;
                    optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
                    o100 o100Var222222 = VideoInfo.e;
                    if (optJSONObject2 != null) {
                    }
                    videoInfo = null;
                    videoInfo2 = this.u;
                    if (videoInfo2 == null) {
                    }
                    this.u = videoInfo;
                    i1522 |= 64;
                    if (jSONObject2.has("breakInfo")) {
                    }
                    if (jSONObject2.has("queueData")) {
                    }
                    if (jSONObject2.has("liveSeekableRange")) {
                    }
                    return i1522;
                }
            }
            z = false;
            if (jSONObject2.has("items")) {
            }
            if (z) {
            }
            int i15222 = i2;
            optJSONObject = jSONObject2.optJSONObject("breakStatus");
            Parcelable.Creator<AdBreakStatus> creator322 = AdBreakStatus.CREATOR;
            if (optJSONObject != null) {
            }
            adBreakStatus = null;
            adBreakStatus2 = this.t;
            if (adBreakStatus2 == null) {
            }
            this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
            this.t = adBreakStatus;
            i15222 |= 32;
            optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
            o100 o100Var2222222 = VideoInfo.e;
            if (optJSONObject2 != null) {
            }
            videoInfo = null;
            videoInfo2 = this.u;
            if (videoInfo2 == null) {
            }
            this.u = videoInfo;
            i15222 |= 64;
            if (jSONObject2.has("breakInfo")) {
            }
            if (jSONObject2.has("queueData")) {
            }
            if (jSONObject2.has("liveSeekableRange")) {
            }
            return i15222;
        }
        jSONObject2 = jSONObject;
        j = jSONObject2.getLong("mediaSessionId");
        boolean z32 = true;
        if (j == this.c) {
        }
        if (jSONObject2.has("playerState")) {
        }
        if (jSONObject2.has("playbackRate")) {
        }
        if (jSONObject2.has("currentTime")) {
        }
        if (jSONObject2.has("supportedMediaCommands")) {
        }
        if (jSONObject2.has("volume")) {
        }
        d = 1000.0d;
        if (!jSONObject2.has("activeTrackIds")) {
        }
        Pattern pattern22 = o0a.a;
        if (jSONArray != null) {
        }
        if (jArr == null) {
        }
        if (jSONObject2.has("customData")) {
        }
        if (jSONObject2.has(X3.i.I0)) {
        }
        if (jSONObject2.has("currentItemId")) {
            this.d = i7;
            i2 |= 2;
        }
        optInt = jSONObject2.optInt("preloadedItemId", 0);
        if (this.n != optInt) {
        }
        optInt2 = jSONObject2.optInt("loadingItemId", 0);
        if (this.m != optInt2) {
        }
        MediaInfo mediaInfo52 = this.b;
        if (mediaInfo52 != null) {
        }
        i3 = this.f;
        int i132 = this.g;
        int i142 = this.m;
        ArrayList arrayList22 = this.r;
        double d52 = d;
        SparseArray sparseArray3 = this.y;
        if (i3 == 1) {
        }
        if (jSONObject2.has("repeatMode")) {
        }
        z = false;
        if (jSONObject2.has("items")) {
        }
        if (z) {
        }
        int i152222 = i2;
        optJSONObject = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<AdBreakStatus> creator3222 = AdBreakStatus.CREATOR;
        if (optJSONObject != null) {
        }
        adBreakStatus = null;
        adBreakStatus2 = this.t;
        if (adBreakStatus2 == null) {
        }
        this.s = (adBreakStatus != null || (adBreakStatus.d == null && adBreakStatus.e == null)) ? false : z2;
        this.t = adBreakStatus;
        i152222 |= 32;
        optJSONObject2 = jSONObject2.optJSONObject("videoInfo");
        o100 o100Var22222222 = VideoInfo.e;
        if (optJSONObject2 != null) {
        }
        videoInfo = null;
        videoInfo2 = this.u;
        if (videoInfo2 == null) {
        }
        this.u = videoInfo;
        i152222 |= 64;
        if (jSONObject2.has("breakInfo")) {
        }
        if (jSONObject2.has("queueData")) {
        }
        if (jSONObject2.has("liveSeekableRange")) {
        }
        return i152222;
    }

    public final void l(@Nullable List list) {
        ArrayList arrayList = this.r;
        arrayList.clear();
        SparseArray sparseArray = this.y;
        sparseArray.clear();
        for (int i = 0; i < list.size(); i++) {
            MediaQueueItem mediaQueueItem = (MediaQueueItem) list.get(i);
            arrayList.add(mediaQueueItem);
            sparseArray.put(mediaQueueItem.c, Integer.valueOf(i));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        JSONObject jSONObject = this.p;
        this.o = jSONObject == null ? null : jSONObject.toString();
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        long j = this.c;
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.d;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.e;
        ozg0.v(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.f;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.g;
        ozg0.v(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        ozg0.v(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.i;
        ozg0.v(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.j;
        ozg0.v(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.k;
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.m(parcel, 12, this.l, false);
        int i5 = this.m;
        ozg0.v(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.n;
        ozg0.v(parcel, 14, 4);
        parcel.writeInt(i6);
        ozg0.q(parcel, 15, this.o, false);
        int i7 = this.q;
        ozg0.v(parcel, 16, 4);
        parcel.writeInt(i7);
        ozg0.u(parcel, 17, this.r, false);
        boolean z2 = this.s;
        ozg0.v(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        ozg0.p(parcel, 19, this.t, i, false);
        ozg0.p(parcel, 20, this.u, i, false);
        ozg0.p(parcel, 21, this.v, i, false);
        ozg0.p(parcel, 22, this.w, i, false);
        ozg0.x(w, parcel);
    }

    public MediaStatus(@NonNull JSONObject jSONObject) throws JSONException {
        this(null, 0L, 0, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0, 0, 0L, 0L, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, false, null, 0, 0, null, 0, null, false, null, null, null, null);
        k(jSONObject, 0);
    }
}
