package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import ec.y;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.d6;
import io.sentry.f6;
import io.sentry.o3;
import io.sentry.protocol.t;
import io.sentry.protocol.v;
import io.sentry.r;
import io.sentry.z3;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03a5, code lost:
    
        if (r14 == null) goto L157;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ff A[LOOP:2: B:127:0x0165->B:141:0x01ff, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0208 A[EDGE_INSN: B:142:0x0208->B:143:0x0208 BREAK  A[LOOP:2: B:127:0x0165->B:141:0x01ff], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0387  */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v2, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [io.sentry.android.replay.k] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, kotlin.collections.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(b1 b1Var, b6 options, long j, Date currentSegmentTimestamp, v replayId, int i5, int i10, int i11, c6 replayType, io.sentry.android.replay.j jVar, int i12, int i13, String str, List list, Deque events) {
        String str2;
        zf.h hVar;
        int i14;
        io.sentry.android.replay.e eVar;
        long j6;
        io.sentry.android.replay.k kVar;
        Bitmap decodeFile;
        r a7;
        ArrayList arrayList;
        List<io.sentry.e> list2;
        boolean z5;
        io.sentry.rrweb.b a10;
        io.sentry.rrweb.a aVar;
        Object obj;
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        if (jVar != null) {
            b6 b6Var = jVar.f16051a;
            long min = Math.min(j, 300000L);
            long time = currentSegmentTimestamp.getTime();
            File videoFile = new File(jVar.n(), i5 + ".mp4");
            io.sentry.util.a aVar2 = jVar.f16056f;
            io.sentry.util.a aVar3 = jVar.f16054d;
            ArrayList arrayList2 = jVar.f16059i;
            Intrinsics.checkNotNullParameter(videoFile, "videoFile");
            long j10 = 0;
            if (videoFile.exists() && videoFile.length() > 0) {
                videoFile.delete();
            }
            r a11 = aVar2.a();
            try {
                ArrayList arrayList3 = arrayList2.isEmpty() ? new ArrayList() : CollectionsKt.X(arrayList2);
                u6.h.g(a11, null);
                if (arrayList3.isEmpty()) {
                    b6Var.getLogger().h(b5.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                    str2 = "events";
                } else {
                    r a12 = aVar3.a();
                    try {
                        str2 = "events";
                        y yVar = new y(b6Var, new io.sentry.android.replay.video.a(videoFile, i11, i10, i12, i13));
                        MediaCodec mediaCodec = (MediaCodec) yVar.f9067d;
                        mediaCodec.configure((MediaFormat) yVar.f9068e.getValue(), (Surface) null, (MediaCrypto) null, 1);
                        yVar.f9071h = mediaCodec.createInputSurface();
                        mediaCodec.start();
                        yVar.a(false);
                        u6.h.g(a12, null);
                        jVar.f16057g = yVar;
                        long j11 = AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT / i12;
                        Object firstOrNull = CollectionsKt.firstOrNull(arrayList3);
                        long j12 = time + min;
                        if (j12 <= Long.MIN_VALUE) {
                            zf.h.f25982e.getClass();
                            hVar = zf.h.f25983f;
                        } else {
                            hVar = new zf.h(time, j12 - 1);
                        }
                        Intrinsics.checkNotNullParameter(hVar, "<this>");
                        zf.i.a(j11 > 0, Long.valueOf(j11));
                        zf.d dVar = zf.e.f25974d;
                        long j13 = hVar.f25975a;
                        long j14 = hVar.f25976b;
                        long j15 = hVar.f25977c > 0 ? j11 : -j11;
                        dVar.getClass();
                        long j16 = new zf.e(j13, j14, j15).f25976b;
                        if ((j15 <= 0 || j13 > j16) && (j15 >= 0 || j16 > j13)) {
                            i14 = 0;
                        } else {
                            i14 = 0;
                            while (true) {
                                Iterator it = arrayList3.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        j6 = j16;
                                        break;
                                    }
                                    kVar = (io.sentry.android.replay.k) it.next();
                                    long j17 = j13 + j11;
                                    j6 = j16;
                                    long j18 = kVar.f16062b;
                                    if (j13 <= j18 && j18 <= j17) {
                                        break;
                                    }
                                    if (j18 > j17) {
                                        break;
                                    }
                                    j16 = j6;
                                }
                                kVar = firstOrNull;
                                io.sentry.android.replay.k kVar2 = kVar;
                                if (kVar2 != null) {
                                    try {
                                        decodeFile = BitmapFactory.decodeFile(kVar2.f16061a.getAbsolutePath());
                                        a7 = aVar3.a();
                                    } catch (Throwable th2) {
                                        b6Var.getLogger().e(b5.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th2);
                                    }
                                    try {
                                        y yVar2 = jVar.f16057g;
                                        if (yVar2 != null) {
                                            Intrinsics.checkNotNull(decodeFile);
                                            yVar2.b(decodeFile);
                                            Unit unit = Unit.f19194a;
                                        }
                                        u6.h.g(a7, null);
                                        decodeFile.recycle();
                                        i14++;
                                        arrayList = arrayList3;
                                        firstOrNull = kVar;
                                        if (j13 == j6) {
                                            break;
                                        }
                                        j13 += j15;
                                        arrayList3 = arrayList;
                                        j16 = j6;
                                    } finally {
                                    }
                                }
                                if (kVar != 0) {
                                    jVar.k(kVar.f16061a);
                                    r a13 = aVar2.a();
                                    try {
                                        TypeIntrinsics.asMutableCollection(arrayList2).remove(kVar);
                                        u6.h.g(a13, null);
                                        ?? r72 = arrayList3;
                                        r72.remove(kVar);
                                        firstOrNull = null;
                                        arrayList = r72;
                                        if (j13 == j6) {
                                        }
                                    } finally {
                                    }
                                }
                                arrayList = arrayList3;
                                firstOrNull = kVar;
                                if (j13 == j6) {
                                }
                            }
                        }
                        if (i14 == 0) {
                            b6Var.getLogger().h(b5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                            jVar.k(videoFile);
                        } else {
                            r a14 = aVar3.a();
                            try {
                                y yVar3 = jVar.f16057g;
                                if (yVar3 != null) {
                                    yVar3.c();
                                }
                                y yVar4 = jVar.f16057g;
                                if (yVar4 != null) {
                                    io.sentry.android.replay.video.b bVar = (io.sentry.android.replay.video.b) yVar4.f9070g;
                                    if (bVar.f16152e != 0) {
                                        j10 = TimeUnit.MILLISECONDS.convert(bVar.f16153f + bVar.f16148a, TimeUnit.MICROSECONDS);
                                    }
                                }
                                long j19 = j10;
                                jVar.f16057g = null;
                                Unit unit2 = Unit.f19194a;
                                u6.h.g(a14, null);
                                jVar.t(j12);
                                eVar = new io.sentry.android.replay.e(videoFile, i14, j19);
                                if (eVar != null) {
                                    File file = eVar.f16025a;
                                    int i15 = eVar.f16026b;
                                    long j20 = eVar.f16027c;
                                    int i16 = 2;
                                    if (list == null) {
                                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                                        objectRef.element = e0.f19204a;
                                        if (b1Var != null) {
                                            b1Var.y(new io.sentry.android.fragment.c(objectRef, i16));
                                        }
                                        list2 = (List) objectRef.element;
                                    } else {
                                        list2 = list;
                                    }
                                    Date o3 = com.google.android.play.core.appupdate.b.o(currentSegmentTimestamp.getTime() + j20);
                                    Intrinsics.checkNotNullExpressionValue(o3, "getDateTime(...)");
                                    d6 d6Var = new d6();
                                    d6Var.f16455a = replayId;
                                    d6Var.f16322s = replayId;
                                    d6Var.f16323t = i5;
                                    d6Var.f16324u = o3;
                                    d6Var.f16325v = currentSegmentTimestamp;
                                    d6Var.f16321r = replayType;
                                    d6Var.f16320p = file;
                                    ArrayList arrayList4 = new ArrayList();
                                    io.sentry.rrweb.j jVar2 = new io.sentry.rrweb.j();
                                    jVar2.f17005b = currentSegmentTimestamp.getTime();
                                    jVar2.f17024d = i10;
                                    jVar2.f17025e = i11;
                                    arrayList4.add(jVar2);
                                    io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
                                    mVar.f17005b = currentSegmentTimestamp.getTime();
                                    mVar.f17038d = i5;
                                    mVar.f17040f = j20;
                                    mVar.f17044k = i15;
                                    mVar.f17039e = file.length();
                                    mVar.f17046m = i12;
                                    mVar.f17043i = i10;
                                    mVar.j = i11;
                                    mVar.f17047n = 0;
                                    mVar.f17048o = 0;
                                    arrayList4.add(mVar);
                                    LinkedList linkedList = new LinkedList();
                                    io.sentry.e eVar2 = null;
                                    for (io.sentry.e eVar3 : list2) {
                                        if (eVar2 != null && Intrinsics.areEqual(eVar2.f16336g, "network.event")) {
                                            ConcurrentHashMap concurrentHashMap = eVar2.f16335f;
                                            Intrinsics.checkNotNullExpressionValue(concurrentHashMap, "getData(...)");
                                            Object obj2 = concurrentHashMap.get("action");
                                            if (obj2 == null) {
                                                obj2 = null;
                                            }
                                            if (Intrinsics.areEqual(obj2, "NETWORK_AVAILABLE") && Intrinsics.areEqual(eVar3.f16336g, "network.event") && eVar3.f16335f.containsKey("network_type") && eVar3.b().getTime() + 5000 >= currentSegmentTimestamp.getTime()) {
                                                z5 = true;
                                                if ((eVar3.b().getTime() < currentSegmentTimestamp.getTime() || z5) && eVar3.b().getTime() < o3.getTime() && (a10 = options.getReplayController().getF15935n().a(eVar3)) != null) {
                                                    arrayList4.add(a10);
                                                    aVar = !(a10 instanceof io.sentry.rrweb.a) ? (io.sentry.rrweb.a) a10 : null;
                                                    if (Intrinsics.areEqual(aVar == null ? aVar.f16998f : null, "navigation")) {
                                                        io.sentry.rrweb.a aVar4 = (io.sentry.rrweb.a) a10;
                                                        ConcurrentHashMap concurrentHashMap2 = aVar4.f17001i;
                                                        if (concurrentHashMap2 != null) {
                                                            Intrinsics.checkNotNull(concurrentHashMap2);
                                                            obj = concurrentHashMap2.get("to");
                                                        }
                                                        obj = null;
                                                        if (obj instanceof String) {
                                                            ConcurrentHashMap concurrentHashMap3 = aVar4.f17001i;
                                                            Intrinsics.checkNotNull(concurrentHashMap3);
                                                            Object obj3 = concurrentHashMap3.get("to");
                                                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                                                            linkedList.add((String) obj3);
                                                        }
                                                    }
                                                }
                                                eVar2 = eVar3;
                                            }
                                        }
                                        z5 = false;
                                        if (eVar3.b().getTime() < currentSegmentTimestamp.getTime()) {
                                        }
                                        arrayList4.add(a10);
                                        if (!(a10 instanceof io.sentry.rrweb.a)) {
                                        }
                                        if (Intrinsics.areEqual(aVar == null ? aVar.f16998f : null, "navigation")) {
                                        }
                                        eVar2 = eVar3;
                                    }
                                    if (str != null && !Intrinsics.areEqual(CollectionsKt.firstOrNull(linkedList), str)) {
                                        linkedList.addFirst(str);
                                    }
                                    long time2 = o3.getTime();
                                    f2.a aVar5 = new f2.a(i16, currentSegmentTimestamp, arrayList4);
                                    Intrinsics.checkNotNullParameter(events, str2);
                                    Iterator it2 = events.iterator();
                                    Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                                    while (it2.hasNext()) {
                                        io.sentry.rrweb.b bVar2 = (io.sentry.rrweb.b) it2.next();
                                        if (bVar2.f17005b < time2) {
                                            Intrinsics.checkNotNull(bVar2);
                                            aVar5.invoke(bVar2);
                                            it2.remove();
                                        }
                                    }
                                    if (i5 == 0) {
                                        io.sentry.rrweb.k kVar3 = new io.sentry.rrweb.k(io.sentry.rrweb.c.Custom);
                                        HashMap hashMap = new HashMap();
                                        kVar3.f17028d = hashMap;
                                        kVar3.f17027c = "options";
                                        t sdkVersion = options.getSdkVersion();
                                        if (sdkVersion != null) {
                                            hashMap.put("nativeSdkName", sdkVersion.f16910a);
                                            hashMap.put("nativeSdkVersion", sdkVersion.f16911b);
                                        }
                                        f6 sessionReplay = options.getSessionReplay();
                                        Double d10 = sessionReplay.f16401b;
                                        CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay.f16402c;
                                        hashMap.put("errorSampleRate", d10);
                                        hashMap.put("sessionSampleRate", sessionReplay.f16400a);
                                        hashMap.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                                        hashMap.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                                        hashMap.put("quality", sessionReplay.f16404e.serializedName());
                                        hashMap.put("maskedViewClasses", copyOnWriteArraySet);
                                        hashMap.put("unmaskedViewClasses", sessionReplay.f16403d);
                                        hashMap.put("screenshotStrategy", sessionReplay.f16411m == z3.PIXEL_COPY ? "pixelCopy" : "canvas");
                                        hashMap.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f16412n.isEmpty()));
                                        if (!sessionReplay.f16412n.isEmpty()) {
                                            hashMap.put("networkDetailAllowUrls", sessionReplay.f16412n);
                                            hashMap.put("networkRequestHeaders", sessionReplay.q);
                                            hashMap.put("networkResponseHeaders", sessionReplay.f16415r);
                                            hashMap.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f16414p));
                                            if (!sessionReplay.f16413o.isEmpty()) {
                                                hashMap.put("networkDetailDenyUrls", sessionReplay.f16413o);
                                            }
                                        }
                                        arrayList4.add(kVar3);
                                    }
                                    o3 o3Var = new o3();
                                    o3Var.f16684a = Integer.valueOf(i5);
                                    o3Var.f16685b = CollectionsKt.R(arrayList4, new androidx.coordinatorlayout.widget.i(9));
                                    d6Var.f16326w = linkedList;
                                    return new i(d6Var, o3Var);
                                }
                            } finally {
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                eVar = null;
                if (eVar != null) {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return j.f16009a;
    }
}
