package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.Range;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.b;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.U3;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hxf extends g51 {
    public static final x05 H;
    public static final Range I;
    public static final Range J;
    public static final ske K;
    public static final long[] L;
    public int A;
    public long B;
    public int C;
    public int D;
    public long E;
    public yke F;
    public q6c G;
    public final n72 b;
    public final br4 c;
    public final long d;
    public final long e;
    public final long f;
    public final z41 g;
    public final iij h;
    public final cxf i;
    public final gxf j;
    public final dxf k;
    public final exf l;
    public final vdb m;
    public final fxf n;
    public final fxf o;
    public boolean p;
    public int q;
    public final fxf r;
    public final fxf s;
    public CastSession t;
    public RemoteMediaClient u;
    public vl2 v;
    public final fxf w;
    public final fxf x;
    public ske y;
    public int z;

    static {
        uif uifVar = new uif(1, 2);
        uifVar.c = 20;
        H = uifVar.a();
        I = new Range(0, 20);
        J = new Range(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Float.valueOf(1.0f));
        i6c.a("media3.cast");
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i : new int[]{1, 2, 3, 4, 10, 23, 26, 34, 25, 33, 15, 13, 16, 17, 18, 19, 31, 20, 30, 32}) {
            z1a.E(!false);
            sparseBooleanArray.append(i, true);
        }
        z1a.E(true);
        K = new ske(new j78(sparseBooleanArray));
        L = new long[0];
    }

    public hxf(n72 n72Var, br4 br4Var) {
        tgj.O("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + nik.a + U3.j.e);
        this.b = n72Var;
        this.c = br4Var;
        this.d = 5000L;
        this.e = 15000L;
        this.f = Ua.C;
        this.g = new z41(br4Var);
        this.h = new iij();
        this.i = new cxf(this);
        gxf gxfVar = new gxf(this);
        this.j = gxfVar;
        this.k = new dxf(this);
        this.l = new exf(this);
        this.m = new vdb(Looper.getMainLooper(), new wwf(this, 4));
        this.n = new fxf(Boolean.FALSE);
        this.o = new fxf(0);
        this.q = 20;
        this.r = new fxf(Float.valueOf(1.0f));
        this.s = new fxf(hke.d);
        this.z = 1;
        this.v = vl2.h;
        this.G = q6c.D;
        this.w = new fxf(uuj.b);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        SparseBooleanArray sparseBooleanArray2 = K.a.a;
        for (int i = 0; i < sparseBooleanArray2.size(); i++) {
            z1a.v(i, sparseBooleanArray2.size());
            int keyAt = sparseBooleanArray2.keyAt(i);
            z1a.E(!false);
            sparseBooleanArray.append(keyAt, true);
        }
        z1a.E(true);
        this.y = new ske(new j78(sparseBooleanArray));
        this.x = new fxf(etj.x);
        this.D = -1;
        this.E = C.TIME_UNSET;
        s02.i0();
        CastContext castContext = (CastContext) n72Var.e;
        if (castContext != null) {
            castContext.b().a(gxfVar);
        } else {
            ((ArrayList) n72Var.b).add(gxfVar);
        }
        s02.i0();
        CastContext castContext2 = (CastContext) n72Var.e;
        P(castContext2 != null ? castContext2.b().c() : null);
        X();
    }

    public static int N(RemoteMediaClient remoteMediaClient, mij mijVar) {
        if (remoteMediaClient == null) {
            return 0;
        }
        Preconditions.e("Must be called from the main thread.");
        MediaStatus h = remoteMediaClient.h();
        MediaQueueItem Z0 = h == null ? null : h.Z0(h.c);
        int b = Z0 != null ? mijVar.b(Integer.valueOf(Z0.b)) : -1;
        if (b == -1) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.ale
    public final q6c D() {
        return this.G;
    }

    @Override // defpackage.ale
    public final long E() {
        return this.d;
    }

    @Override // defpackage.g51
    public final void L(long j, int i, boolean z) {
        BasePendingResult basePendingResult;
        if (i == -1) {
            return;
        }
        z1a.s(i >= 0);
        if (this.v.p() || i < this.v.d.length) {
            RemoteMediaClient remoteMediaClient = this.u;
            MediaStatus h = remoteMediaClient != null ? remoteMediaClient.h() : null;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            vdb vdbVar = this.m;
            if (h != null) {
                int y = y();
                RemoteMediaClient remoteMediaClient2 = this.u;
                exf exfVar = this.l;
                if (y != i) {
                    vl2 vl2Var = this.v;
                    iij iijVar = this.h;
                    vl2Var.f(i, iijVar, false);
                    int intValue = ((Integer) iijVar.b).intValue();
                    remoteMediaClient2.getClass();
                    Preconditions.e("Must be called from the main thread.");
                    if (remoteMediaClient2.G()) {
                        pfn pfnVar = new pfn(remoteMediaClient2, intValue, j);
                        RemoteMediaClient.I(pfnVar);
                        basePendingResult = pfnVar;
                    } else {
                        basePendingResult = RemoteMediaClient.F();
                    }
                    basePendingResult.i(exfVar);
                } else {
                    remoteMediaClient2.v(j).i(exfVar);
                }
                yke O = O();
                this.C++;
                this.D = i;
                this.E = j;
                yke O2 = O();
                vdbVar.c(11, new vwf(O, O2, 2));
                if (O.b != O2.b) {
                    vl2 vl2Var2 = this.v;
                    kij kijVar = this.a;
                    vl2Var2.m(i, kijVar, 0L);
                    vdbVar.c(1, new imf(kijVar.b, 6));
                    q6c q6cVar = this.G;
                    h6c e = e();
                    q6c q6cVar2 = e != null ? e.d : q6c.D;
                    this.G = q6cVar2;
                    if (!q6cVar.equals(q6cVar2)) {
                        vdbVar.c(14, new wwf(this, 5));
                    }
                }
                V();
            }
            vdbVar.b();
        }
    }

    public final yke O() {
        Object obj;
        h6c h6cVar;
        Object obj2;
        vl2 vl2Var = this.v;
        if (vl2Var.p()) {
            obj = null;
            h6cVar = null;
            obj2 = null;
        } else {
            int y = y();
            iij iijVar = this.h;
            vl2Var.f(y, iijVar, true);
            Object obj3 = iijVar.b;
            int i = iijVar.c;
            kij kijVar = this.a;
            vl2Var.m(i, kijVar, 0L);
            obj = kijVar.a;
            obj2 = obj3;
            h6cVar = kijVar.b;
        }
        return new yke(obj, y(), h6cVar, obj2, y(), getCurrentPosition(), getCurrentPosition(), -1, -1);
    }

    public final void P(CastSession castSession) {
        CastSession castSession2 = this.t;
        cxf cxfVar = this.i;
        if (castSession2 != null) {
            Preconditions.e("Must be called from the main thread.");
            if (cxfVar != null) {
                castSession2.d.remove(cxfVar);
            }
        }
        if (castSession != null) {
            Preconditions.e("Must be called from the main thread.");
            if (cxfVar != null) {
                castSession.d.add(cxfVar);
            }
        }
        this.t = castSession;
        RemoteMediaClient k = castSession != null ? castSession.k() : null;
        RemoteMediaClient remoteMediaClient = this.u;
        if (remoteMediaClient == k) {
            return;
        }
        dxf dxfVar = this.k;
        gxf gxfVar = this.j;
        if (remoteMediaClient != null) {
            Preconditions.e("Must be called from the main thread.");
            if (gxfVar != null) {
                remoteMediaClient.h.remove(gxfVar);
            }
            this.u.u(gxfVar);
            MediaQueue g = this.u.g();
            g.getClass();
            Preconditions.e("Must be called from the main thread.");
            g.m.remove(dxfVar);
        }
        this.u = k;
        if (k != null) {
            MediaQueue g2 = k.g();
            g2.getClass();
            Preconditions.e("Must be called from the main thread.");
            g2.m.add(dxfVar);
            k.t(gxfVar);
            k.b(gxfVar, 1000L);
            X();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a8, code lost:
    
        if (defpackage.sjc.k(r15) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165 A[Catch: JSONException -> 0x01b2, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01b2, blocks: (B:63:0x0156, B:65:0x0165), top: B:62:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(int i, List list, long j) {
        long j2;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        CharSequence charSequence;
        String str;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        Integer num;
        h6c h6cVar;
        int i6;
        Integer num2;
        JSONObject b;
        int intValue = ((Integer) this.o.a).intValue();
        if (this.u == null || list.isEmpty()) {
            return;
        }
        long j3 = j == C.TIME_UNSET ? 0L : j;
        if (i == -1) {
            i2 = y();
            j2 = getCurrentPosition();
        } else {
            j2 = j3;
            i2 = i;
        }
        if (!this.v.p()) {
            this.F = O();
        }
        MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[list.size()];
        int i7 = 0;
        while (i7 < list.size()) {
            h6c h6cVar2 = (h6c) list.get(i7);
            this.c.getClass();
            v5c v5cVar = h6cVar2.b;
            String str2 = h6cVar2.a;
            v5cVar.getClass();
            String str3 = v5cVar.b;
            q6c q6cVar = h6cVar2.d;
            Integer num3 = q6cVar.B;
            MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
            Uri uri = q6cVar.i;
            if (num3 != null) {
                int intValue2 = num3.intValue();
                i4 = i7;
                try {
                    if (intValue2 != 1) {
                        if (intValue2 == 2) {
                            i5 = 5;
                        } else if (intValue2 != 4) {
                            if (intValue2 != 7 && intValue2 != 8) {
                                if (intValue2 == 9) {
                                    i5 = 2;
                                }
                            }
                            i5 = 1;
                        }
                        MediaMetadata mediaMetadata = new MediaMetadata(i5);
                        charSequence = q6cVar.a;
                        if (charSequence != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.TITLE", charSequence.toString());
                        }
                        str = q6cVar.e;
                        if (str != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.SUBTITLE", str.toString());
                        }
                        charSequence2 = q6cVar.b;
                        if (charSequence2 != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.ARTIST", charSequence2.toString());
                        }
                        charSequence3 = q6cVar.d;
                        if (charSequence3 != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.ALBUM_ARTIST", charSequence3.toString());
                        }
                        charSequence4 = q6cVar.c;
                        if (charSequence4 != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.ALBUM_TITLE", charSequence4.toString());
                        }
                        if (uri != null) {
                            mediaMetadata.a.add(new WebImage(0, 0, uri));
                        }
                        charSequence5 = q6cVar.v;
                        if (charSequence5 != null) {
                            mediaMetadata.Z0("com.google.android.gms.cast.metadata.COMPOSER", charSequence5.toString());
                        }
                        num = q6cVar.x;
                        Bundle bundle = mediaMetadata.b;
                        if (num == null) {
                            int intValue3 = num.intValue();
                            h6cVar = h6cVar2;
                            i6 = 2;
                            MediaMetadata.a1(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", intValue3);
                        } else {
                            h6cVar = h6cVar2;
                            i6 = 2;
                        }
                        num2 = q6cVar.j;
                        if (num2 != null) {
                            int intValue4 = num2.intValue();
                            MediaMetadata.a1(i6, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", intValue4);
                        }
                        String uri2 = v5cVar.a.toString();
                        String str4 = !str2.equals("") ? uri2 : str2;
                        MediaInfo.Builder builder = new MediaInfo.Builder();
                        builder.a = 1;
                        builder.b = str3;
                        builder.e = uri2;
                        builder.c = mediaMetadata;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("mediaItem", br4.a(h6cVar));
                        b = br4.b(h6cVar);
                        if (b == null) {
                            jSONObject.put("exoPlayerConfig", b);
                        }
                        builder.d = jSONObject.toString();
                        mediaQueueItemArr2[i4] = new MediaQueueItem.Builder(new MediaInfo(str4, builder.a, builder.b, builder.c, -1L, null, null, builder.d, null, null, null, null, -1L, null, builder.e, null, null)).a();
                        i7 = i4 + 1;
                        mediaQueueItemArr = mediaQueueItemArr2;
                    }
                    jSONObject.put("mediaItem", br4.a(h6cVar));
                    b = br4.b(h6cVar);
                    if (b == null) {
                    }
                    builder.d = jSONObject.toString();
                    mediaQueueItemArr2[i4] = new MediaQueueItem.Builder(new MediaInfo(str4, builder.a, builder.b, builder.c, -1L, null, null, builder.d, null, null, null, null, -1L, null, builder.e, null, null)).a();
                    i7 = i4 + 1;
                    mediaQueueItemArr = mediaQueueItemArr2;
                } catch (JSONException e) {
                    is8.h(e);
                    return;
                }
                i5 = 3;
                MediaMetadata mediaMetadata2 = new MediaMetadata(i5);
                charSequence = q6cVar.a;
                if (charSequence != null) {
                }
                str = q6cVar.e;
                if (str != null) {
                }
                charSequence2 = q6cVar.b;
                if (charSequence2 != null) {
                }
                charSequence3 = q6cVar.d;
                if (charSequence3 != null) {
                }
                charSequence4 = q6cVar.c;
                if (charSequence4 != null) {
                }
                if (uri != null) {
                }
                charSequence5 = q6cVar.v;
                if (charSequence5 != null) {
                }
                num = q6cVar.x;
                Bundle bundle2 = mediaMetadata2.b;
                if (num == null) {
                }
                num2 = q6cVar.j;
                if (num2 != null) {
                }
                String uri22 = v5cVar.a.toString();
                if (!str2.equals("")) {
                }
                MediaInfo.Builder builder2 = new MediaInfo.Builder();
                builder2.a = 1;
                builder2.b = str3;
                builder2.e = uri22;
                builder2.c = mediaMetadata2;
                JSONObject jSONObject2 = new JSONObject();
            } else {
                i4 = i7;
            }
            if (str3 == null) {
                tgj.d0("Converting MediaItem with null MIME type and no media type. Assuming MEDIA_TYPE_MOVIE. Song metadata may not be rendered correctly by the default receiver.");
            }
        }
        MediaQueueItem[] mediaQueueItemArr3 = mediaQueueItemArr;
        HashMap hashMap = (HashMap) this.g.c;
        hashMap.clear();
        for (int i8 = 0; i8 < list.size(); i8++) {
            MediaInfo mediaInfo = mediaQueueItemArr3[i8].a;
            mediaInfo.getClass();
            String str5 = mediaInfo.a;
            if (str5 == null) {
                str5 = "";
            }
            hashMap.put(str5, (h6c) list.get(i8));
        }
        MediaQueueData.Builder builder3 = new MediaQueueData.Builder();
        List asList = Arrays.asList(mediaQueueItemArr3);
        MediaQueueData mediaQueueData = builder3.a;
        if (asList == null) {
            arrayList = null;
        } else {
            mediaQueueData.getClass();
            arrayList = new ArrayList(asList);
        }
        mediaQueueData.g = arrayList;
        mediaQueueData.h = Math.min(i2, list.size() - 1);
        if (intValue == 0) {
            i3 = 0;
        } else if (intValue == 1) {
            i3 = 2;
        } else {
            if (intValue != 2) {
                ilg.c();
                return;
            }
            i3 = 1;
        }
        mediaQueueData.f = i3;
        mediaQueueData.i = j2;
        MediaQueueData a = builder3.a();
        MediaLoadRequestData.Builder builder4 = new MediaLoadRequestData.Builder();
        builder4.b = Boolean.valueOf(getPlayWhenReady());
        builder4.a = a;
        builder4.c = j2;
        MediaLoadRequestData mediaLoadRequestData = new MediaLoadRequestData(null, builder4.a, builder4.b, builder4.c, builder4.d, null, null, null, null, null, null, 0L);
        RemoteMediaClient remoteMediaClient = this.u;
        remoteMediaClient.getClass();
        Preconditions.e("Must be called from the main thread.");
        if (remoteMediaClient.G()) {
            RemoteMediaClient.I(new nhn(remoteMediaClient, mediaLoadRequestData, 0));
        } else {
            RemoteMediaClient.F();
        }
    }

    public final void R(hke hkeVar) {
        fxf fxfVar = this.s;
        if (((hke) fxfVar.a).equals(hkeVar)) {
            return;
        }
        fxfVar.a = hkeVar;
        this.m.c(12, new imf(hkeVar, 4));
        V();
    }

    public final void S(int i, int i2, boolean z) {
        int i3 = this.z;
        fxf fxfVar = this.n;
        boolean z2 = false;
        boolean z3 = i3 == 3 && ((Boolean) fxfVar.a).booleanValue();
        boolean z4 = ((Boolean) fxfVar.a).booleanValue() != z;
        boolean z5 = this.z != i2;
        if (z4 || z5) {
            this.z = i2;
            fxfVar.a = Boolean.valueOf(z);
            jg6 jg6Var = new jg6(z, i2, 1);
            vdb vdbVar = this.m;
            vdbVar.c(-1, jg6Var);
            if (z5) {
                vdbVar.c(4, new uz1(i2, 6));
            }
            if (z4) {
                vdbVar.c(5, new jg6(z, i, 3));
            }
            if (i2 == 3 && z) {
                z2 = true;
            }
            if (z3 != z2) {
                vdbVar.c(7, new fg6(z2, 4));
            }
        }
    }

    public final void T(int i) {
        fxf fxfVar = this.o;
        if (((Integer) fxfVar.a).intValue() != i) {
            fxfVar.a = Integer.valueOf(i);
            this.m.c(8, new uz1(i, 7));
            V();
        }
    }

    public final void U(float f) {
        fxf fxfVar = this.r;
        if (((Float) fxfVar.a).floatValue() != f) {
            fxfVar.a = Float.valueOf(f);
            this.m.c(22, new bg6(f, 2));
            V();
        }
    }

    public final void V() {
        MediaStatus h;
        MediaStatus h2;
        ske skeVar = this.y;
        ske u = nik.u(this, K);
        h78 h78Var = new h78(1);
        h78Var.b(u.a);
        RemoteMediaClient remoteMediaClient = this.u;
        boolean z = false;
        if ((remoteMediaClient == null || (h2 = remoteMediaClient.h()) == null) ? false : h2.a1(4L)) {
            h78Var.a(22);
        }
        RemoteMediaClient remoteMediaClient2 = this.u;
        if (remoteMediaClient2 != null && (h = remoteMediaClient2.h()) != null) {
            z = h.a1(4L);
        }
        if (z) {
            h78Var.a(24);
        }
        ske skeVar2 = new ske(h78Var.d());
        this.y = skeVar2;
        if (skeVar2.equals(skeVar)) {
            return;
        }
        this.m.c(13, new wwf(this, 3));
    }

    public final void W() {
        double d;
        CastSession castSession = this.t;
        if (castSession != null) {
            Preconditions.e("Must be called from the main thread.");
            zzbm zzbmVar = castSession.i;
            if (zzbmVar == null || !zzbmVar.n()) {
                d = 0.0d;
            } else {
                zzbmVar.m();
                d = zzbmVar.w;
            }
            int intValue = ((Integer) I.clamp(Integer.valueOf((int) Math.round(d * 20.0d)))).intValue();
            boolean l = this.t.l();
            if (this.q == intValue && this.p == l) {
                return;
            }
            this.q = intValue;
            this.p = l;
            this.m.c(30, new jg6(intValue, l, 2));
        }
    }

    public final void X() {
        Object obj;
        Object obj2;
        if (this.u == null) {
            return;
        }
        int i = this.A;
        q6c q6cVar = this.G;
        boolean p = this.v.p();
        iij iijVar = this.h;
        if (p) {
            obj = null;
        } else {
            this.v.f(i, iijVar, true);
            obj = iijVar.b;
        }
        Z(null);
        W();
        a0(null);
        d0(null);
        Y(null);
        boolean b0 = b0();
        vl2 vl2Var = this.v;
        this.A = N(this.u, vl2Var);
        h6c e = e();
        this.G = e != null ? e.d : q6c.D;
        if (vl2Var.p()) {
            obj2 = null;
        } else {
            vl2Var.f(this.A, iijVar, true);
            obj2 = iijVar.b;
        }
        vdb vdbVar = this.m;
        if (!b0 && !Objects.equals(obj, obj2) && this.C == 0) {
            vl2Var.f(i, iijVar, true);
            kij kijVar = this.a;
            vl2Var.n(i, kijVar);
            long h0 = nik.h0(kijVar.l);
            Object obj3 = kijVar.a;
            int i2 = iijVar.c;
            yke ykeVar = new yke(obj3, i2, kijVar.b, iijVar.b, i2, h0, h0, -1, -1);
            vl2Var.f(this.A, iijVar, true);
            vl2Var.n(this.A, kijVar);
            Object obj4 = kijVar.a;
            int i3 = iijVar.c;
            vdbVar.c(11, new vwf(ykeVar, new yke(obj4, i3, kijVar.b, iijVar.b, i3, nik.h0(kijVar.k), nik.h0(kijVar.k), -1, -1), 1));
            vdbVar.c(1, new wwf(this, 1));
        }
        c0(null);
        if (!q6cVar.equals(this.G)) {
            vdbVar.c(14, new wwf(this, 2));
        }
        V();
        vdbVar.b();
    }

    public final void Y(ywf ywfVar) {
        fxf fxfVar = this.s;
        if (fxfVar.b == ywfVar) {
            MediaStatus h = this.u.h();
            float f = h != null ? (float) h.d : hke.d.a;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                R(new hke(f));
            }
            fxfVar.b = null;
        }
    }

    public final void Z(xwf xwfVar) {
        fxf fxfVar = this.n;
        boolean booleanValue = ((Boolean) fxfVar.a).booleanValue();
        int i = 1;
        if (fxfVar.b == xwfVar) {
            booleanValue = !this.u.o();
            fxfVar.b = null;
        }
        int i2 = booleanValue != ((Boolean) fxfVar.a).booleanValue() ? 4 : 1;
        int i3 = this.u.i();
        if (i3 == 2 || i3 == 3) {
            i = 3;
        } else if (i3 == 4 || i3 == 5) {
            i = 2;
        }
        S(i2, i, booleanValue);
    }

    public final void a0(zwf zwfVar) {
        int i;
        fxf fxfVar = this.o;
        if (fxfVar.b == zwfVar) {
            MediaStatus h = this.u.h();
            int i2 = 0;
            if (h != null && (i = h.p) != 0) {
                i2 = 2;
                if (i != 1) {
                    if (i == 2) {
                        i2 = 1;
                    } else if (i != 3) {
                        zzl.s();
                        return;
                    }
                }
            }
            T(i2);
            fxfVar.b = null;
        }
    }

    @Override // defpackage.ale
    public final void b(hke hkeVar) {
        BasePendingResult basePendingResult;
        if (this.u == null) {
            return;
        }
        hke hkeVar2 = new hke(nik.i(hkeVar.a, 0.5f, 2.0f));
        R(hkeVar2);
        this.m.b();
        RemoteMediaClient remoteMediaClient = this.u;
        double d = hkeVar2.a;
        remoteMediaClient.getClass();
        Preconditions.e("Must be called from the main thread.");
        if (remoteMediaClient.G()) {
            sjn sjnVar = new sjn(remoteMediaClient, d, 1);
            RemoteMediaClient.I(sjnVar);
            basePendingResult = sjnVar;
        } else {
            basePendingResult = RemoteMediaClient.F();
        }
        ywf ywfVar = new ywf(this);
        this.s.b = ywfVar;
        basePendingResult.i(ywfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0() {
        vl2 vl2Var;
        boolean z;
        boolean z2;
        MediaInfo mediaInfo;
        String str;
        Iterator it;
        int i;
        z41 z41Var;
        int i2;
        int i3;
        RemoteMediaClient remoteMediaClient = this.u;
        if (remoteMediaClient == null) {
            return false;
        }
        vl2 vl2Var2 = this.v;
        int i4 = this.A;
        if ((remoteMediaClient != null ? remoteMediaClient.h() : null) != null) {
            RemoteMediaClient remoteMediaClient2 = this.u;
            z41 z41Var2 = this.g;
            SparseArray sparseArray = (SparseArray) z41Var2.b;
            HashMap hashMap = (HashMap) z41Var2.c;
            MediaQueue g = remoteMediaClient2.g();
            g.getClass();
            Preconditions.e("Must be called from the main thread.");
            int[] d = CastUtils.d(g.d);
            if (d.length > 0) {
                HashSet hashSet = new HashSet(d.length * 2);
                for (int i5 : d) {
                    hashSet.add(Integer.valueOf(i5));
                }
                int i6 = 0;
                while (i6 < sparseArray.size()) {
                    if (hashSet.contains(Integer.valueOf(sparseArray.keyAt(i6)))) {
                        i6++;
                    } else {
                        hashMap.remove(((ul2) sparseArray.valueAt(i6)).e);
                        sparseArray.removeAt(i6);
                    }
                }
            }
            MediaStatus h = remoteMediaClient2.h();
            if (h == null || (mediaInfo = h.a) == null) {
                vl2Var = vl2.h;
            } else {
                int i7 = h.c;
                String str2 = mediaInfo.a;
                String str3 = str2 == null ? "" : str2;
                h6c h6cVar = (h6c) hashMap.get(str3);
                if (h6cVar == null) {
                    h6cVar = h6c.g;
                }
                z41Var2.C(i7, h6cVar, h.a, str3, C.TIME_UNSET);
                Iterator it2 = h.q.iterator();
                while (it2.hasNext()) {
                    MediaQueueItem mediaQueueItem = (MediaQueueItem) it2.next();
                    long j = (long) (mediaQueueItem.d * 1000000.0d);
                    MediaInfo mediaInfo2 = mediaQueueItem.a;
                    if (mediaInfo2 != null) {
                        str = mediaInfo2.a;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "UNKNOWN_CONTENT_ID";
                    }
                    String str4 = str;
                    h6c h6cVar2 = (h6c) hashMap.get(str4);
                    int i8 = mediaQueueItem.b;
                    if (h6cVar2 != null) {
                        it = it2;
                        i2 = i8;
                    } else {
                        MediaInfo mediaInfo3 = mediaQueueItem.a;
                        mediaInfo3.getClass();
                        o6c o6cVar = new o6c();
                        MediaMetadata mediaMetadata = mediaInfo3.d;
                        it = it2;
                        if (mediaMetadata != null) {
                            Bundle bundle = mediaMetadata.b;
                            i = i8;
                            List list = mediaMetadata.a;
                            z41Var = z41Var2;
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.TITLE")) {
                                o6cVar.a = mediaMetadata.Y0("com.google.android.gms.cast.metadata.TITLE");
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.SUBTITLE")) {
                                o6cVar.e = mediaMetadata.Y0("com.google.android.gms.cast.metadata.SUBTITLE");
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.ARTIST")) {
                                o6cVar.b = mediaMetadata.Y0("com.google.android.gms.cast.metadata.ARTIST");
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.ALBUM_ARTIST")) {
                                o6cVar.d = mediaMetadata.Y0("com.google.android.gms.cast.metadata.ALBUM_ARTIST");
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.ALBUM_TITLE")) {
                                o6cVar.c = mediaMetadata.Y0("com.google.android.gms.cast.metadata.ALBUM_TITLE");
                            }
                            if (!list.isEmpty()) {
                                o6cVar.i = ((WebImage) list.get(0)).b;
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.COMPOSER")) {
                                o6cVar.u = mediaMetadata.Y0("com.google.android.gms.cast.metadata.COMPOSER");
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.DISC_NUMBER")) {
                                i3 = 2;
                                MediaMetadata.a1(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                                o6cVar.w = Integer.valueOf(bundle.getInt("com.google.android.gms.cast.metadata.DISC_NUMBER"));
                            } else {
                                i3 = 2;
                            }
                            if (bundle.containsKey("com.google.android.gms.cast.metadata.TRACK_NUMBER")) {
                                MediaMetadata.a1(i3, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                                o6cVar.j = Integer.valueOf(bundle.getInt("com.google.android.gms.cast.metadata.TRACK_NUMBER"));
                            }
                        } else {
                            i = i8;
                            z41Var = z41Var2;
                        }
                        JSONObject jSONObject = mediaInfo3.r;
                        jSONObject.getClass();
                        q6c q6cVar = new q6c(o6cVar);
                        try {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("mediaItem");
                            h5c h5cVar = new h5c();
                            h5cVar.b = Uri.parse(jSONObject2.getString("uri"));
                            String string = jSONObject2.getString("mediaId");
                            string.getClass();
                            h5cVar.a = string;
                            h5cVar.k = q6cVar;
                            if (jSONObject2.has("mimeType")) {
                                h5cVar.c = jSONObject2.getString("mimeType");
                            }
                            if (jSONObject2.has("drmConfiguration")) {
                                br4.c(jSONObject2.getJSONObject("drmConfiguration"), h5cVar);
                            }
                            h6cVar2 = h5cVar.a();
                            i2 = i;
                            z41Var2 = z41Var;
                        } catch (JSONException e) {
                            is8.h(e);
                            return false;
                        }
                    }
                    z41Var2.C(i2, h6cVar2, mediaInfo2, str4, j);
                    it2 = it;
                }
                vl2Var = new vl2(d, sparseArray);
            }
        } else {
            vl2Var = vl2.h;
        }
        this.v = vl2Var;
        boolean equals = vl2Var2.equals(vl2Var);
        if (!equals) {
            this.A = N(this.u, this.v);
        }
        if (equals) {
            return false;
        }
        imf imfVar = new imf(this.v, 3);
        vdb vdbVar = this.m;
        vdbVar.c(0, imfVar);
        vl2 vl2Var3 = this.v;
        boolean p = vl2Var2.p();
        iij iijVar = this.h;
        if (!p) {
            vl2Var2.f(i4, iijVar, true);
            Object obj = iijVar.b;
            String str5 = nik.a;
            if (vl2Var3.b(obj) == -1) {
                z = true;
                if (z) {
                    yke ykeVar = this.F;
                    if (ykeVar != null) {
                        this.F = null;
                    } else {
                        vl2Var2.f(i4, iijVar, true);
                        int i9 = iijVar.c;
                        kij kijVar = this.a;
                        vl2Var2.n(i9, kijVar);
                        Object obj2 = kijVar.a;
                        int i10 = iijVar.c;
                        ykeVar = new yke(obj2, i10, kijVar.b, iijVar.b, i10, getCurrentPosition(), getCurrentPosition(), -1, -1);
                    }
                    vdbVar.c(11, new vwf(ykeVar, O(), 0));
                }
                z2 = vl2Var3.p() == vl2Var2.p() || z;
                if (z2) {
                    vdbVar.c(1, new wwf(this, 0));
                }
                V();
                return z2;
            }
        }
        z = false;
        if (z) {
        }
        if (vl2Var3.p() == vl2Var2.p()) {
        }
        if (z2) {
        }
        V();
        return z2;
    }

    @Override // defpackage.ale
    public final long c() {
        long currentPosition = getCurrentPosition();
        long currentPosition2 = getCurrentPosition();
        if (currentPosition == C.TIME_UNSET || currentPosition2 == C.TIME_UNSET) {
            return 0L;
        }
        return currentPosition - currentPosition2;
    }

    public final void c0(bxf bxfVar) {
        int i;
        BasePendingResult basePendingResult;
        int i2;
        int i3;
        tv9 tv9Var;
        RemoteMediaClient remoteMediaClient = this.u;
        if (remoteMediaClient == null) {
            return;
        }
        fxf fxfVar = this.w;
        if (fxfVar.b == bxfVar) {
            MediaStatus h = remoteMediaClient != null ? remoteMediaClient.h() : null;
            MediaInfo mediaInfo = h != null ? h.a : null;
            List list = mediaInfo != null ? mediaInfo.f : null;
            vdb vdbVar = this.m;
            if (list == null || list.isEmpty()) {
                uuj uujVar = uuj.b;
                if (uujVar.equals(fxfVar.a)) {
                    return;
                }
                fxfVar.a = uujVar;
                vdbVar.c(2, new imf(uujVar, 5));
                V();
                return;
            }
            long[] jArr = h.k;
            if (jArr == null) {
                jArr = L;
            }
            boolean z = false;
            vv9 t = vv9.t(jArr.length == 0 ? Collections.EMPTY_LIST : new pkb(jArr, 0, jArr.length));
            hv9 v = hv9.v(list);
            int i4 = h.c;
            int i5 = 4;
            tv9 tv9Var2 = new tv9(4);
            yqo.w(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                i = i5;
                if (i6 >= list.size()) {
                    break;
                }
                MediaTrack mediaTrack = (MediaTrack) v.get(i6);
                boolean z2 = z;
                tv9 tv9Var3 = tv9Var2;
                long j = mediaTrack.a;
                String str = nik.a;
                Locale locale = Locale.US;
                String str2 = "item=" + i4 + ",track=" + j;
                String str3 = mediaTrack.d;
                int i8 = mediaTrack.b;
                if (i8 != 1) {
                    i2 = 2;
                    i3 = i8 != 2 ? i8 != 3 ? -1 : 2 : 1;
                } else {
                    i2 = 2;
                    i3 = 3;
                }
                if (i3 != sjc.i(str3)) {
                    String str4 = i3 != 1 ? i3 != i2 ? i3 != 3 ? null : "text/x-unknown" : MimeTypes.VIDEO_UNKNOWN : MimeTypes.AUDIO_UNKNOWN;
                    if (str4 != null) {
                        str3 = str4;
                    }
                }
                qm8 qm8Var = new qm8();
                qm8Var.a = mediaTrack.c;
                qm8Var.m = sjc.p(str3);
                qm8Var.d = mediaTrack.f;
                osj osjVar = new osj(str2, new b(qm8Var));
                int i9 = i7 + 1;
                int b = vu9.b(objArr.length, i9);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i7] = osjVar;
                if (t.contains(Long.valueOf(mediaTrack.a))) {
                    tv9Var = tv9Var3;
                    tv9Var.c(osjVar);
                } else {
                    tv9Var = tv9Var3;
                }
                i6++;
                tv9Var2 = tv9Var;
                i7 = i9;
                i5 = i;
                z = z2;
            }
            boolean z3 = z;
            vvf r = hv9.r(i7, objArr);
            vv9 h2 = tv9Var2.h();
            fxf fxfVar2 = this.x;
            Object obj = fxfVar2.a;
            etj etjVar = (etj) obj;
            if (!etjVar.equals(obj) && !((etj) fxfVar2.a).equals(etjVar)) {
                fxfVar2.a = etjVar;
                vdbVar.c(19, new gg6(etjVar, 1));
            }
            if (!h2.equals(h2)) {
                fxfVar.b = new bxf(this);
                ArrayList arrayList = new ArrayList(h2.size());
                cck it = h2.iterator();
                while (it.hasNext()) {
                    osj osjVar2 = (osj) it.next();
                    int indexOf = r.indexOf(osjVar2);
                    if (indexOf == -1) {
                        yhk.r(osjVar2, "CastTrackSelector produced a TrackGroup that was not in the list of available track groups: ");
                        return;
                    }
                    arrayList.add(Long.valueOf(((MediaTrack) v.get(indexOf)).a));
                }
                RemoteMediaClient remoteMediaClient2 = this.u;
                Object[] array = arrayList.toArray();
                int length = array.length;
                long[] jArr2 = new long[length];
                for (int i10 = z3 ? 1 : 0; i10 < length; i10++) {
                    Object obj2 = array[i10];
                    obj2.getClass();
                    jArr2[i10] = ((Number) obj2).longValue();
                }
                remoteMediaClient2.getClass();
                Preconditions.e("Must be called from the main thread.");
                if (remoteMediaClient2.G()) {
                    nhn nhnVar = new nhn(remoteMediaClient2, jArr2, 2);
                    RemoteMediaClient.I(nhnVar);
                    basePendingResult = nhnVar;
                } else {
                    basePendingResult = RemoteMediaClient.F();
                }
                basePendingResult.i(fxfVar.b);
            }
            int i11 = r.d;
            suj[] sujVarArr = new suj[i11];
            for (int i12 = z3 ? 1 : 0; i12 < i11; i12++) {
                osj osjVar3 = (osj) r.get(i12);
                boolean[] zArr = new boolean[1];
                zArr[z3 ? 1 : 0] = h2.contains(osjVar3);
                sujVarArr[i12] = new suj(osjVar3, z3, new int[]{i}, zArr);
            }
            uuj uujVar2 = new uuj(hv9.w(sujVarArr));
            if (uujVar2.equals(fxfVar.a)) {
                return;
            }
            fxfVar.a = uujVar2;
            vdbVar.c(2, new imf(uujVar2, 5));
            V();
        }
    }

    public final void d0(axf axfVar) {
        fxf fxfVar = this.r;
        if (fxfVar.b == axfVar) {
            MediaStatus h = this.u.h();
            U(((Float) J.clamp(Float.valueOf(h == null ? 1.0f : (float) h.i))).floatValue());
            fxfVar.b = null;
        }
    }

    @Override // defpackage.ale
    public final int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override // defpackage.ale
    public final int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override // defpackage.ale
    public final long getCurrentPosition() {
        long j = this.E;
        if (j != C.TIME_UNSET) {
            return j;
        }
        RemoteMediaClient remoteMediaClient = this.u;
        return remoteMediaClient != null ? remoteMediaClient.d() : this.B;
    }

    @Override // defpackage.ale
    public final mij getCurrentTimeline() {
        return this.v;
    }

    @Override // defpackage.ale
    public final boolean getPlayWhenReady() {
        return ((Boolean) this.n.a).booleanValue();
    }

    @Override // defpackage.ale
    public final hke getPlaybackParameters() {
        return (hke) this.s.a;
    }

    @Override // defpackage.ale
    public final int getPlaybackState() {
        if (this.v.p()) {
            return 1;
        }
        return this.z;
    }

    @Override // defpackage.ale
    public final int getRepeatMode() {
        return ((Integer) this.o.a).intValue();
    }

    @Override // defpackage.ale
    public final boolean getShuffleModeEnabled() {
        return false;
    }

    @Override // defpackage.ale
    public final float getVolume() {
        return ((Float) this.r.a).floatValue();
    }

    @Override // defpackage.ale
    public final dke h() {
        return null;
    }

    @Override // defpackage.ale
    public final uuj i() {
        return (uuj) this.w.a;
    }

    @Override // defpackage.ale
    public final boolean isPlayingAd() {
        return false;
    }

    @Override // defpackage.ale
    public final o74 j() {
        return o74.c;
    }

    @Override // defpackage.ale
    public final int m() {
        return 0;
    }

    @Override // defpackage.ale
    public final Looper n() {
        return Looper.getMainLooper();
    }

    @Override // defpackage.ale
    public final etj o() {
        return (etj) this.x.a;
    }

    @Override // defpackage.ale
    public final ske q() {
        return this.y;
    }

    @Override // defpackage.ale
    public final long r() {
        return this.f;
    }

    @Override // defpackage.ale
    public final void release() {
        String str;
        n72 n72Var = this.b;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.10.1] [");
        sb.append(nik.a);
        sb.append("] [");
        synchronized (i6c.class) {
            str = i6c.b;
        }
        sb.append(str);
        sb.append(U3.j.e);
        tgj.O(sb.toString());
        gxf gxfVar = this.j;
        n72Var.getClass();
        s02.i0();
        CastContext castContext = (CastContext) n72Var.e;
        if (castContext != null) {
            castContext.b().e(gxfVar);
        } else {
            ((ArrayList) n72Var.b).remove(gxfVar);
        }
        s02.i0();
        CastContext castContext2 = (CastContext) n72Var.e;
        if (castContext2 != null) {
            castContext2.b().b(false);
        }
    }

    @Override // defpackage.ale
    public final void s(wke wkeVar) {
        this.m.a(wkeVar);
    }

    @Override // defpackage.ale
    public final void setPlayWhenReady(boolean z) {
        BasePendingResult basePendingResult;
        if (this.u == null) {
            return;
        }
        S(1, this.z, z);
        this.m.b();
        RemoteMediaClient remoteMediaClient = this.u;
        if ((remoteMediaClient != null ? remoteMediaClient.h() : null) == null) {
            return;
        }
        RemoteMediaClient remoteMediaClient2 = this.u;
        remoteMediaClient2.getClass();
        if (z) {
            Preconditions.e("Must be called from the main thread.");
            if (remoteMediaClient2.G()) {
                cbn cbnVar = new cbn(remoteMediaClient2, 5, false);
                RemoteMediaClient.I(cbnVar);
                basePendingResult = cbnVar;
            } else {
                basePendingResult = RemoteMediaClient.F();
            }
        } else {
            Preconditions.e("Must be called from the main thread.");
            if (remoteMediaClient2.G()) {
                cbn cbnVar2 = new cbn(remoteMediaClient2, 3, false);
                RemoteMediaClient.I(cbnVar2);
                basePendingResult = cbnVar2;
            } else {
                basePendingResult = RemoteMediaClient.F();
            }
        }
        ResultCallback xwfVar = new xwf(this);
        this.n.b = xwfVar;
        basePendingResult.i(xwfVar);
    }

    @Override // defpackage.ale
    public final void setRepeatMode(int i) {
        int i2;
        BasePendingResult basePendingResult;
        if (this.u == null) {
            return;
        }
        T(i);
        this.m.b();
        RemoteMediaClient remoteMediaClient = this.u;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i != 2) {
                    ilg.c();
                    return;
                }
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        remoteMediaClient.getClass();
        Preconditions.e("Must be called from the main thread.");
        if (remoteMediaClient.G()) {
            ben benVar = new ben(remoteMediaClient, i2);
            RemoteMediaClient.I(benVar);
            basePendingResult = benVar;
        } else {
            basePendingResult = RemoteMediaClient.F();
        }
        ResultCallback zwfVar = new zwf(this);
        this.o.b = zwfVar;
        basePendingResult.i(zwfVar);
    }

    @Override // defpackage.ale
    public final void setVolume(float f) {
        BasePendingResult basePendingResult;
        if (this.u == null) {
            return;
        }
        float floatValue = ((Float) J.clamp(Float.valueOf(f))).floatValue();
        U(floatValue);
        this.m.b();
        RemoteMediaClient remoteMediaClient = this.u;
        double d = floatValue;
        remoteMediaClient.getClass();
        Preconditions.e("Must be called from the main thread.");
        if (remoteMediaClient.G()) {
            sjn sjnVar = new sjn(remoteMediaClient, d, 0);
            RemoteMediaClient.I(sjnVar);
            basePendingResult = sjnVar;
        } else {
            basePendingResult = RemoteMediaClient.F();
        }
        ResultCallback axfVar = new axf(this);
        this.r.b = axfVar;
        basePendingResult.i(axfVar);
    }

    @Override // defpackage.ale
    public final void stop() {
        this.z = 1;
        RemoteMediaClient remoteMediaClient = this.u;
        if (remoteMediaClient != null) {
            Preconditions.e("Must be called from the main thread.");
            if (remoteMediaClient.G()) {
                RemoteMediaClient.I(new cbn(remoteMediaClient, 4));
            } else {
                RemoteMediaClient.F();
            }
        }
    }

    @Override // defpackage.ale
    public final void t() {
        int length = this.v.d.length;
        int min = Math.min(Integer.MAX_VALUE, length);
        if (length <= 0 || min == 0) {
            return;
        }
        int[] iArr = new int[min];
        for (int i = 0; i < min; i++) {
            vl2 vl2Var = this.v;
            kij kijVar = this.a;
            vl2Var.m(i, kijVar, 0L);
            iArr[i] = ((Integer) kijVar.a).intValue();
        }
        RemoteMediaClient remoteMediaClient = this.u;
        if (remoteMediaClient != null) {
            if ((remoteMediaClient != null ? remoteMediaClient.h() : null) == null) {
                return;
            }
            vl2 vl2Var2 = this.v;
            if (!vl2Var2.p()) {
                int y = y();
                iij iijVar = this.h;
                vl2Var2.f(y, iijVar, true);
                Object obj = iijVar.b;
                String str = nik.a;
                int i2 = 0;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    if (obj.equals(Integer.valueOf(iArr[i2]))) {
                        this.F = O();
                        break;
                    }
                    i2++;
                }
            }
            RemoteMediaClient remoteMediaClient2 = this.u;
            remoteMediaClient2.getClass();
            Preconditions.e("Must be called from the main thread.");
            if (remoteMediaClient2.G()) {
                RemoteMediaClient.I(new i6n(remoteMediaClient2, iArr, 0));
            } else {
                RemoteMediaClient.F();
            }
        }
    }

    @Override // defpackage.ale
    public final zqk v() {
        return zqk.d;
    }

    @Override // defpackage.ale
    public final long w() {
        return this.e;
    }

    @Override // defpackage.ale
    public final void x(vvf vvfVar) {
        Q(0, vvfVar, C.TIME_UNSET);
    }

    @Override // defpackage.ale
    public final int y() {
        int i = this.D;
        return i != -1 ? i : this.A;
    }

    @Override // defpackage.ale
    public final void z(wke wkeVar) {
        this.m.e(wkeVar);
    }

    @Override // defpackage.ale
    public final void a() {
    }

    @Override // defpackage.ale
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // defpackage.ale
    public final void clearVideoTextureView(TextureView textureView) {
    }

    @Override // defpackage.ale
    public final void f(etj etjVar) {
    }

    @Override // defpackage.ale
    public final void setShuffleModeEnabled(boolean z) {
    }

    @Override // defpackage.ale
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
    }

    @Override // defpackage.ale
    public final void setVideoTextureView(TextureView textureView) {
    }
}
