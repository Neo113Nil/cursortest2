package io.sentry.android.replay.capture;

import ag.u;
import android.view.MotionEvent;
import gf.t;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c6;
import io.sentry.protocol.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c implements l {
    public static final /* synthetic */ u[] q = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "currentSegment", "getCurrentSegment()I", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final b6 f15975a;

    /* renamed from: b, reason: collision with root package name */
    public final b1 f15976b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.transport.f f15977c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f15978d;

    /* renamed from: e, reason: collision with root package name */
    public final t f15979e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.android.replay.gestures.c f15980f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15981g;

    /* renamed from: h, reason: collision with root package name */
    public io.sentry.android.replay.j f15982h;

    /* renamed from: i, reason: collision with root package name */
    public final b f15983i;
    public final b j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicLong f15984k;

    /* renamed from: l, reason: collision with root package name */
    public final b f15985l;

    /* renamed from: m, reason: collision with root package name */
    public final b f15986m;

    /* renamed from: n, reason: collision with root package name */
    public final b f15987n;

    /* renamed from: o, reason: collision with root package name */
    public final b f15988o;

    /* renamed from: p, reason: collision with root package name */
    public final ConcurrentLinkedDeque f15989p;

    public c(b6 options, b1 b1Var, io.sentry.transport.f dateProvider, ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f15975a = options;
        this.f15976b = b1Var;
        this.f15977c = dateProvider;
        this.f15978d = replayExecutor;
        this.f15979e = gf.k.b(new io.sentry.android.replay.n(1, this));
        this.f15980f = new io.sentry.android.replay.gestures.c(dateProvider);
        this.f15981g = new AtomicBoolean(false);
        this.f15983i = new b(this, this, 3);
        this.j = new b(this, this, 4);
        this.f15984k = new AtomicLong();
        this.f15985l = new b(this, this, 5);
        this.f15986m = new b(v.f16922b, this, this);
        this.f15987n = new b(this, this, 1);
        this.f15988o = new b(this, this, 2);
        this.f15989p = new ConcurrentLinkedDeque();
    }

    public static k h(c cVar, long j, Date currentSegmentTimestamp, v replayId, int i5, int i10, int i11, int i12, int i13) {
        b bVar = cVar.f15988o;
        u[] uVarArr = q;
        c6 replayType = (c6) bVar.a(cVar, uVarArr[5]);
        io.sentry.android.replay.j jVar = cVar.f15982h;
        String str = (String) cVar.f15985l.a(cVar, uVarArr[2]);
        ConcurrentLinkedDeque events = cVar.f15989p;
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return h.a(cVar.f15976b, cVar.f15975a, j, currentSegmentTimestamp, replayId, i5, i10, i11, replayType, jVar, i12, i13, str, null, events);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r2 != 6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if ((r14 + 50) > r12) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // io.sentry.android.replay.capture.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        io.sentry.android.replay.v recorderConfig = k();
        if (recorderConfig == null) {
            return;
        }
        float f6 = recorderConfig.f16140d;
        float f10 = recorderConfig.f16139c;
        io.sentry.android.replay.gestures.c cVar = this.f15980f;
        io.sentry.transport.f fVar = (io.sentry.transport.f) cVar.f16045d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f16042a;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        List list = null;
        list = null;
        list = null;
        list = null;
        list = null;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    long d10 = fVar.d();
                    long j = cVar.f16044c;
                    long j6 = j != 0 ? 0L : 0L;
                    cVar.f16044c = d10;
                    Set<Integer> keySet = linkedHashMap.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                    for (Integer num : keySet) {
                        Intrinsics.checkNotNull(num);
                        int findPointerIndex = event.findPointerIndex(num.intValue());
                        if (findPointerIndex != -1) {
                            if (cVar.f16043b == j6) {
                                cVar.f16043b = d10;
                            }
                            Object obj = linkedHashMap.get(num);
                            Intrinsics.checkNotNull(obj);
                            io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                            hVar.f17015b = event.getX(findPointerIndex) * f10;
                            hVar.f17016c = event.getY(findPointerIndex) * f6;
                            hVar.f17014a = 0;
                            hVar.f17017d = d10 - cVar.f16043b;
                            ((Collection) obj).add(hVar);
                        }
                    }
                    long j10 = d10 - cVar.f16043b;
                    if (j10 > 500) {
                        ArrayList arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            int intValue = ((Number) entry.getKey()).intValue();
                            ArrayList<io.sentry.rrweb.h> arrayList2 = (ArrayList) entry.getValue();
                            if (!arrayList2.isEmpty()) {
                                io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
                                iVar.f17005b = d10;
                                ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
                                for (io.sentry.rrweb.h hVar2 : arrayList2) {
                                    long j11 = j10;
                                    hVar2.f17017d -= j11;
                                    arrayList3.add(hVar2);
                                    j10 = j11;
                                }
                                iVar.f17020e = arrayList3;
                                iVar.f17019d = intValue;
                                arrayList.add(iVar);
                                Object obj2 = linkedHashMap.get(Integer.valueOf(intValue));
                                Intrinsics.checkNotNull(obj2);
                                ((ArrayList) obj2).clear();
                            }
                        }
                        cVar.f16043b = j6;
                        list = arrayList;
                    }
                } else if (actionMasked == 3) {
                    linkedHashMap.clear();
                    io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
                    gVar.f17005b = fVar.d();
                    gVar.f17009f = event.getX() * f10;
                    gVar.f17010g = event.getY() * f6;
                    gVar.f17008e = 0;
                    gVar.f17012i = 0;
                    gVar.f17007d = io.sentry.rrweb.f.TouchCancel;
                    list = kotlin.collections.t.c(gVar);
                } else if (actionMasked != 5) {
                }
                if (list != null) {
                    z.n(list, this.f15989p);
                    return;
                }
                return;
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int findPointerIndex2 = event.findPointerIndex(pointerId);
            if (findPointerIndex2 != -1) {
                linkedHashMap.remove(Integer.valueOf(pointerId));
                io.sentry.rrweb.g gVar2 = new io.sentry.rrweb.g();
                gVar2.f17005b = fVar.d();
                gVar2.f17009f = event.getX(findPointerIndex2) * f10;
                gVar2.f17010g = event.getY(findPointerIndex2) * f6;
                gVar2.f17008e = 0;
                gVar2.f17012i = pointerId;
                gVar2.f17007d = io.sentry.rrweb.f.TouchEnd;
                list = kotlin.collections.t.c(gVar2);
            }
            if (list != null) {
            }
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int findPointerIndex3 = event.findPointerIndex(pointerId2);
        if (findPointerIndex3 != -1) {
            linkedHashMap.put(Integer.valueOf(pointerId2), new ArrayList(10));
            io.sentry.rrweb.g gVar3 = new io.sentry.rrweb.g();
            gVar3.f17005b = fVar.d();
            gVar3.f17009f = event.getX(findPointerIndex3) * f10;
            gVar3.f17010g = event.getY(findPointerIndex3) * f6;
            gVar3.f17008e = 0;
            gVar3.f17012i = pointerId2;
            gVar3.f17007d = io.sentry.rrweb.f.TouchStart;
            list = kotlin.collections.t.c(gVar3);
        }
        if (list != null) {
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public void e(int i5, v replayId, c6 c6Var) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        this.f15982h = new io.sentry.android.replay.j(this.f15975a, replayId);
        Intrinsics.checkNotNullParameter(replayId, "<set-?>");
        u[] uVarArr = q;
        u property = uVarArr[3];
        b bVar = this.f15986m;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(replayId);
        if (!Intrinsics.areEqual(andSet, replayId)) {
            a aVar = new a(andSet, replayId, bVar.f15974d, 0);
            c cVar = bVar.f15973c;
            b6 b6Var = cVar.f15975a;
            if (b6Var.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(10, aVar), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar.invoke();
                } catch (Throwable th2) {
                    b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        l(i5);
        if (c6Var == null) {
            c6Var = this instanceof o ? c6.SESSION : c6.BUFFER;
        }
        Intrinsics.checkNotNullParameter(c6Var, "<set-?>");
        u property2 = uVarArr[5];
        b bVar2 = this.f15988o;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(property2, "property");
        Object andSet2 = bVar2.f15972b.getAndSet(c6Var);
        if (!Intrinsics.areEqual(andSet2, c6Var)) {
            a aVar2 = new a(andSet2, c6Var, bVar2.f15974d, 1);
            c cVar2 = bVar2.f15973c;
            b6 b6Var2 = cVar2.f15975a;
            if (b6Var2.getThreadChecker().c()) {
                ((ScheduledExecutorService) cVar2.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(12, aVar2), "CaptureStrategy.runInBackground"));
            } else {
                try {
                    aVar2.invoke();
                } catch (Throwable th3) {
                    b6Var2.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th3);
                }
            }
        }
        m(com.google.android.play.core.appupdate.b.n());
        this.f15984k.set(this.f15977c.d());
    }

    public final v i() {
        return (v) this.f15986m.a(this, q[3]);
    }

    public final int j() {
        return ((Number) this.f15987n.a(this, q[4])).intValue();
    }

    public final io.sentry.android.replay.v k() {
        return (io.sentry.android.replay.v) this.f15983i.a(this, q[0]);
    }

    public final void l(int i5) {
        u property = q[4];
        Integer valueOf = Integer.valueOf(i5);
        b bVar = this.f15987n;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(valueOf);
        if (Intrinsics.areEqual(andSet, valueOf)) {
            return;
        }
        androidx.fragment.app.n nVar = new androidx.fragment.app.n(andSet, valueOf, bVar.f15974d);
        c cVar = bVar.f15973c;
        b6 b6Var = cVar.f15975a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(11, nVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            nVar.invoke();
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    public final void m(Date date) {
        u property = q[1];
        b bVar = this.j;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(date);
        if (Intrinsics.areEqual(andSet, date)) {
            return;
        }
        a aVar = new a(andSet, date, bVar.f15974d, 3);
        c cVar = bVar.f15973c;
        b6 b6Var = cVar.f15975a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(14, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }

    @Override // io.sentry.android.replay.capture.l
    public void stop() {
        io.sentry.android.replay.j jVar = this.f15982h;
        if (jVar != null) {
            jVar.close();
        }
        this.f15984k.set(0L);
        m(null);
        v EMPTY_ID = v.f16922b;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        Intrinsics.checkNotNullParameter(EMPTY_ID, "<set-?>");
        u property = q[3];
        b bVar = this.f15986m;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(property, "property");
        Object andSet = bVar.f15972b.getAndSet(EMPTY_ID);
        if (Intrinsics.areEqual(andSet, EMPTY_ID)) {
            return;
        }
        a aVar = new a(andSet, EMPTY_ID, bVar.f15974d, 0);
        c cVar = bVar.f15973c;
        b6 b6Var = cVar.f15975a;
        if (b6Var.getThreadChecker().c()) {
            ((ScheduledExecutorService) cVar.f15979e.getValue()).submit(new io.sentry.android.replay.util.g(new androidx.core.widget.b(10, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.invoke();
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
        }
    }
}
