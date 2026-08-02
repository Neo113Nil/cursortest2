package io.sentry.android.core;

import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends CopyOnWriteArrayList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15575b;

    public /* synthetic */ f0(int i5, Object obj) {
        this.f15574a = i5;
        this.f15575b = obj;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f15574a) {
            case 0:
                e0 e0Var = (e0) obj;
                boolean add = super.add(e0Var);
                if (Boolean.FALSE.equals(((h0) ((g0) this.f15575b).f15586c).f15621d)) {
                    e0Var.k();
                } else if (Boolean.TRUE.equals(((h0) ((g0) this.f15575b).f15586c).f15621d)) {
                    e0Var.n();
                }
                return add;
            default:
                io.sentry.android.replay.g gVar = (io.sentry.android.replay.g) obj;
                io.sentry.android.replay.s sVar = (io.sentry.android.replay.s) this.f15575b;
                io.sentry.r a7 = sVar.f16071b.a();
                try {
                    Iterator it = sVar.f16073d.iterator();
                    while (it.hasNext()) {
                        View view = (View) it.next();
                        if (gVar != null) {
                            gVar.c(view, true);
                        }
                    }
                    Unit unit = Unit.f19194a;
                    u6.h.g(a7, null);
                    return super.add(gVar);
                } finally {
                }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f15574a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.contains((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f15574a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.indexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f15574a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.lastIndexOf((io.sentry.android.replay.g) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public /* bridge */ boolean remove(Object obj) {
        switch (this.f15574a) {
            case 1:
                if (obj == null ? true : obj instanceof io.sentry.android.replay.g) {
                    return super.remove((io.sentry.android.replay.g) obj);
                }
                return false;
            default:
                return super.remove(obj);
        }
    }
}
