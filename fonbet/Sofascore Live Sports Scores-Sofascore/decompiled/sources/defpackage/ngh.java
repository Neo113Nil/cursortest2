package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ngh implements k8l {
    public static volatile ngh c;
    public static final ReentrantLock d = new ReentrantLock();
    public final ck6 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public ngh(lgh lghVar) {
        this.a = lghVar;
        if (lghVar != null) {
            lghVar.d(new by9(this));
        }
    }

    @Override // defpackage.k8l
    public final void a(Context context, Executor executor, yn3 yn3Var) {
        Object obj;
        WindowManager.LayoutParams attributes;
        r1 = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            yn3Var.accept(new hal(km5.a));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            ck6 ck6Var = this.a;
            if (ck6Var == null) {
                yn3Var.accept(new hal(km5.a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((mgh) it.next()).a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            mgh mghVar = new mgh(activity, executor, yn3Var);
            copyOnWriteArrayList.add(mghVar);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((mgh) obj).a)) {
                            break;
                        }
                    }
                }
                mgh mghVar2 = (mgh) obj;
                hal halVar = mghVar2 != null ? mghVar2.d : null;
                if (halVar != null) {
                    mghVar.d = halVar;
                    mghVar.b.execute(new ecg(5, mghVar, halVar));
                }
            } else {
                lgh lghVar = (lgh) ck6Var;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    lghVar.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new a16(lghVar, activity));
                }
            }
            Unit unit = Unit.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.k8l
    public final void b(yn3 yn3Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    mgh mghVar = (mgh) it.next();
                    if (mghVar.c == yn3Var) {
                        arrayList.add(mghVar);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((mgh) it2.next()).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (((mgh) it3.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    ck6 ck6Var = this.a;
                    if (ck6Var != null) {
                        ((lgh) ck6Var).b(activity);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
