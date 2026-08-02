package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class yk6 extends xk6 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public yk6(WindowLayoutComponent windowLayoutComponent, hpo hpoVar) {
        super(windowLayoutComponent, hpoVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.xk6, defpackage.vk6, defpackage.k8l
    public final void a(Context context, Executor executor, yn3 yn3Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            wyc wycVar = (wyc) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (wycVar != null) {
                wycVar.a(yn3Var);
                linkedHashMap2.put(yn3Var, context);
            } else {
                wyc wycVar2 = new wyc(context);
                linkedHashMap.put(context, wycVar2);
                linkedHashMap2.put(yn3Var, context);
                wycVar2.a(yn3Var);
                this.a.addWindowLayoutInfoListener(context, wycVar2);
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.xk6, defpackage.vk6, defpackage.k8l
    public final void b(yn3 yn3Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(yn3Var);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            wyc wycVar = (wyc) linkedHashMap.get(context);
            if (wycVar == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = wycVar.b;
            reentrantLock2.lock();
            try {
                wycVar.d.remove(yn3Var);
                reentrantLock2.unlock();
                linkedHashMap2.remove(yn3Var);
                if (wycVar.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.a.removeWindowLayoutInfoListener(wycVar);
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
