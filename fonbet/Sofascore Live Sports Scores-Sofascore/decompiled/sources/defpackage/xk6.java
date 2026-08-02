package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class xk6 extends vk6 {
    public final WindowLayoutComponent a;
    public final hpo b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public xk6(WindowLayoutComponent windowLayoutComponent, hpo hpoVar) {
        this.a = windowLayoutComponent;
        this.b = hpoVar;
    }

    @Override // defpackage.vk6, defpackage.k8l
    public void a(Context context, Executor executor, yn3 yn3Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(yn3Var);
                linkedHashMap2.put(yn3Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(yn3Var, context);
                multicastConsumer2.a(yn3Var);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(km5.a));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f.put(multicastConsumer2, this.b.s(this.a, duf.a.getOrCreateKotlinClass(WindowLayoutInfo.class), (Activity) context, new wk6(1, 0, MulticastConsumer.class, multicastConsumer2, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V")));
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.vk6, defpackage.k8l
    public void b(yn3 yn3Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(yn3Var);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(yn3Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(yn3Var);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    ao3 ao3Var = (ao3) this.f.remove(multicastConsumer);
                    if (ao3Var != null) {
                        ao3Var.a.invoke(ao3Var.b, ao3Var.c);
                    }
                }
                Unit unit = Unit.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
