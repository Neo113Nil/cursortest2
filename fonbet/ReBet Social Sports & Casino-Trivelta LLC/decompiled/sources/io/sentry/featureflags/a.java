package io.sentry.featureflags;

import io.sentry.F3;
import io.sentry.InterfaceC4765j0;
import io.sentry.protocol.C4806h;
import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public volatile CopyOnWriteArrayList f52072a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f52073b;

    /* renamed from: c, reason: collision with root package name */
    public int f52074c;

    public a(int i10) {
        this.f52073b = new C4843a();
        this.f52074c = i10;
        this.f52072a = new CopyOnWriteArrayList();
    }

    public static b a(F3 f32) {
        int maxFeatureFlags = f32.getMaxFeatureFlags();
        return maxFeatureFlags > 0 ? new a(maxFeatureFlags) : c.a();
    }

    public static b b(int i10, a aVar, a aVar2, a aVar3) {
        CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.f52072a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.f52072a;
        CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.f52072a : null;
        int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
        int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
        int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
        if (size == 0 && size2 == 0 && size3 == 0) {
            return c.a();
        }
        int i11 = size - 1;
        int i12 = size2 - 1;
        int i13 = size3 - 1;
        if (copyOnWriteArrayList != null && i11 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList.get(i11));
        }
        if (copyOnWriteArrayList2 != null && i12 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList2.get(i12));
        }
        if (copyOnWriteArrayList3 != null && i13 >= 0) {
            android.support.v4.media.session.b.a(copyOnWriteArrayList3.get(i13));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
        linkedHashMap.size();
        ArrayList arrayList = new ArrayList(linkedHashMap.values());
        Collections.reverse(arrayList);
        return new a(i10, new CopyOnWriteArrayList(arrayList));
    }

    public static b c(F3 f32, b bVar, b bVar2, b bVar3) {
        int maxFeatureFlags = f32.getMaxFeatureFlags();
        if (maxFeatureFlags <= 0) {
            return c.a();
        }
        return b(maxFeatureFlags, bVar instanceof a ? (a) bVar : null, bVar2 instanceof a ? (a) bVar2 : null, bVar3 instanceof a ? (a) bVar3 : null);
    }

    @Override // io.sentry.featureflags.b
    public void clear() {
        InterfaceC4765j0 d10 = this.f52073b.d();
        try {
            this.f52072a.clear();
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.sentry.featureflags.b
    public C4806h l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f52072a.iterator();
        if (!it.hasNext()) {
            return new C4806h(arrayList);
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    @Override // io.sentry.featureflags.b
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public b m139clone() {
        return new a(this);
    }

    public a(int i10, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f52073b = new C4843a();
        this.f52074c = i10;
        this.f52072a = copyOnWriteArrayList;
    }

    public a(a aVar) {
        this.f52073b = new C4843a();
        this.f52074c = aVar.f52074c;
        this.f52072a = new CopyOnWriteArrayList(aVar.f52072a);
    }
}
