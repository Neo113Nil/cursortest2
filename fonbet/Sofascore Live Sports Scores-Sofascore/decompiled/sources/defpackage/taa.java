package defpackage;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class taa {
    public final k6g a;
    public final String[] b;
    public final i1k c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final us9 f;
    public final us9 g;
    public Intent h;
    public rqa i;
    public final Object j;

    public taa(k6g k6gVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.a = k6gVar;
        this.b = strArr;
        i1k i1kVar = new i1k(k6gVar, hashMap, hashMap2, strArr, k6gVar.getUseTempTrackingTable$room_runtime(), new s26(1, this, taa.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 20));
        this.c = i1kVar;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new us9(this, 22);
        this.g = new us9(this, 23);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.j = new Object();
        i1kVar.k = new sr8(this, 13);
    }

    public final Object a(hoi hoiVar) {
        Object h = this.c.h(hoiVar);
        return h == lu3.a ? h : Unit.a;
    }
}
