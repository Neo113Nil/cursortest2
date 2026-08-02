package Jc;

import Ic.AbstractC1350d;
import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements Ic.j {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6111a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f6112b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f6113c = new SparseArray();

    public static final void e(AbstractC1350d abstractC1350d) {
        abstractC1350d.q();
    }

    @Override // Ic.j
    public synchronized ArrayList a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int i10, int i11, int i12) {
        boolean z10;
        AbstractC1350d abstractC1350d = (AbstractC1350d) this.f6111a.get(i10);
        if (abstractC1350d != null) {
            d(abstractC1350d);
            abstractC1350d.u0(i12);
            k(i11, abstractC1350d);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void d(final AbstractC1350d abstractC1350d) {
        try {
            Integer num = (Integer) this.f6112b.get(abstractC1350d.T());
            if (num != null) {
                this.f6112b.remove(abstractC1350d.T());
                ArrayList arrayList = (ArrayList) this.f6113c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(abstractC1350d);
                    }
                    if (arrayList.size() == 0) {
                        this.f6113c.remove(num.intValue());
                    }
                }
            }
            if (abstractC1350d.W() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: Jc.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.e(AbstractC1350d.this);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f() {
        this.f6111a.clear();
        this.f6112b.clear();
        this.f6113c.clear();
    }

    public final synchronized void g(int i10) {
        AbstractC1350d abstractC1350d = (AbstractC1350d) this.f6111a.get(i10);
        if (abstractC1350d != null) {
            d(abstractC1350d);
            this.f6111a.remove(i10);
        }
    }

    public final synchronized AbstractC1350d h(int i10) {
        return (AbstractC1350d) this.f6111a.get(i10);
    }

    public final synchronized ArrayList i(int i10) {
        return (ArrayList) this.f6113c.get(i10);
    }

    public final synchronized void j(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f6111a.put(handler.T(), handler);
    }

    public final synchronized void k(int i10, AbstractC1350d abstractC1350d) {
        try {
            if (this.f6112b.get(abstractC1350d.T()) != null) {
                throw new IllegalStateException(("Handler " + abstractC1350d + " already attached").toString());
            }
            this.f6112b.put(abstractC1350d.T(), Integer.valueOf(i10));
            Object obj = this.f6113c.get(i10);
            if (obj == null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(abstractC1350d);
                this.f6113c.put(i10, arrayList);
            } else {
                synchronized (obj) {
                    ((ArrayList) obj).add(abstractC1350d);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
