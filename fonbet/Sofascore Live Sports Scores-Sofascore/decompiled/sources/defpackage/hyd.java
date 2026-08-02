package defpackage;

import android.util.ArrayMap;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hyd {
    public final ActivityEmbeddingComponent a;
    public final ReentrantLock b = new ReentrantLock();
    public final ArrayMap c = new ArrayMap();
    public final ArrayMap d = new ArrayMap();
    public final ArrayMap e = new ArrayMap();

    public hyd(ActivityEmbeddingComponent activityEmbeddingComponent, ak5 ak5Var) {
        this.a = activityEmbeddingComponent;
        new ArrayMap();
        int a = bl6.a();
        if (a < 8) {
            a70.m(dmi.k(8, a, "This API requires extension version ", ", but the device is on "));
            throw null;
        }
        activityEmbeddingComponent.setActivityStackAttributesCalculator(new gyd());
        activityEmbeddingComponent.registerActivityStackCallback(new hg0(1), new we(new mnc(this, 21)));
    }

    public static final Unit a(hyd hydVar, List list) {
        list.getClass();
        ReentrantLock reentrantLock = hydVar.b;
        ArrayMap arrayMap = hydVar.e;
        reentrantLock.lock();
        try {
            Set keySet = arrayMap.keySet();
            keySet.getClass();
            arrayMap.clear();
            List<ActivityStack> c = c(list);
            ArrayList arrayList = new ArrayList(k13.r(c, 10));
            for (ActivityStack activityStack : c) {
                String tag = activityStack.getTag();
                tag.getClass();
                arrayList.add(new Pair(tag, activityStack));
            }
            tub.m(arrayMap, arrayList);
            hydVar.b(keySet);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            return Unit.a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ActivityStack) obj).getTag() != null) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.S0(arrayList);
    }

    public final void b(Set set) {
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Set keySet = this.e.keySet();
        keySet.getClass();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!keySet.contains(str) && this.a.getActivityStackToken(str) == null) {
                arrayList.add(str);
            }
        }
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next = it2.next();
            next.getClass();
            String str2 = (String) next;
            this.c.remove(str2);
            this.d.remove(str2);
        }
    }
}
