package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import io.sentry.android.replay.t;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.transport.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f67571a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<Integer, ArrayList<f.b>> f67572b;

    /* renamed from: c, reason: collision with root package name */
    private long f67573c;

    /* renamed from: d, reason: collision with root package name */
    private long f67574d;

    public b(@NotNull c dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f67571a = dateProvider;
        this.f67572b = new LinkedHashMap<>(10);
    }

    public final List<d> a(@NotNull MotionEvent event, @NotNull t recorderConfig) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        int actionMasked = event.getActionMasked();
        LinkedHashMap<Integer, ArrayList<f.b>> linkedHashMap = this.f67572b;
        int i11 = 10;
        c cVar = this.f67571a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    cVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j11 = this.f67574d;
                    if (j11 != 0 && j11 + 50 > currentTimeMillis) {
                        return null;
                    }
                    this.f67574d = currentTimeMillis;
                    Set<Integer> keySet = linkedHashMap.keySet();
                    Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
                    for (Integer num : keySet) {
                        Intrinsics.f(num);
                        int findPointerIndex = event.findPointerIndex(num.intValue());
                        if (findPointerIndex != -1) {
                            if (this.f67573c == 0) {
                                this.f67573c = currentTimeMillis;
                            }
                            ArrayList<f.b> arrayList = linkedHashMap.get(num);
                            Intrinsics.f(arrayList);
                            f.b bVar = new f.b();
                            bVar.i(recorderConfig.e() * event.getX(findPointerIndex));
                            bVar.j(recorderConfig.f() * event.getY(findPointerIndex));
                            bVar.f();
                            bVar.g(currentTimeMillis - this.f67573c);
                            arrayList.add(bVar);
                        }
                    }
                    long j12 = currentTimeMillis - this.f67573c;
                    if (j12 <= 500) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    Iterator<Map.Entry<Integer, ArrayList<f.b>>> it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, ArrayList<f.b>> next = it.next();
                        int intValue = next.getKey().intValue();
                        ArrayList<f.b> value = next.getValue();
                        if (!value.isEmpty()) {
                            f fVar = new f();
                            fVar.f(currentTimeMillis);
                            ArrayList arrayList3 = new ArrayList(C7714v.z(value, i11));
                            for (f.b bVar2 : value) {
                                bVar2.g(bVar2.e() - j12);
                                arrayList3.add(bVar2);
                                it = it;
                            }
                            fVar.m(arrayList3);
                            fVar.l(intValue);
                            arrayList2.add(fVar);
                            ArrayList<f.b> arrayList4 = linkedHashMap.get(Integer.valueOf(intValue));
                            Intrinsics.f(arrayList4);
                            arrayList4.clear();
                            i11 = 10;
                        }
                    }
                    this.f67573c = 0L;
                    return arrayList2;
                }
                if (actionMasked == 3) {
                    linkedHashMap.clear();
                    e eVar = new e();
                    cVar.getClass();
                    eVar.f(System.currentTimeMillis());
                    eVar.t(recorderConfig.e() * event.getX());
                    eVar.u(recorderConfig.f() * event.getY());
                    eVar.p();
                    eVar.r(0);
                    eVar.q(e.b.TouchCancel);
                    return C7714v.a0(eVar);
                }
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return null;
                    }
                }
            }
            int pointerId = event.getPointerId(event.getActionIndex());
            int findPointerIndex2 = event.findPointerIndex(pointerId);
            if (findPointerIndex2 == -1) {
                return null;
            }
            linkedHashMap.remove(Integer.valueOf(pointerId));
            e eVar2 = new e();
            cVar.getClass();
            eVar2.f(System.currentTimeMillis());
            eVar2.t(recorderConfig.e() * event.getX(findPointerIndex2));
            eVar2.u(recorderConfig.f() * event.getY(findPointerIndex2));
            eVar2.p();
            eVar2.r(pointerId);
            eVar2.q(e.b.TouchEnd);
            return C7714v.a0(eVar2);
        }
        int pointerId2 = event.getPointerId(event.getActionIndex());
        int findPointerIndex3 = event.findPointerIndex(pointerId2);
        if (findPointerIndex3 == -1) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(pointerId2), new ArrayList<>(10));
        e eVar3 = new e();
        cVar.getClass();
        eVar3.f(System.currentTimeMillis());
        eVar3.t(recorderConfig.e() * event.getX(findPointerIndex3));
        eVar3.u(recorderConfig.f() * event.getY(findPointerIndex3));
        eVar3.p();
        eVar3.r(pointerId2);
        eVar3.q(e.b.TouchStart);
        return C7714v.a0(eVar3);
    }
}
