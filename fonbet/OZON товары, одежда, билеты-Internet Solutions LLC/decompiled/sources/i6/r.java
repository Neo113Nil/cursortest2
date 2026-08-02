package i6;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import l6.InterfaceC7882e;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC7882e> f65897a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f65898b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f65899c;

    public final boolean a(InterfaceC7882e interfaceC7882e) {
        boolean z11 = true;
        if (interfaceC7882e == null) {
            return true;
        }
        boolean remove = this.f65897a.remove(interfaceC7882e);
        if (!this.f65898b.remove(interfaceC7882e) && !remove) {
            z11 = false;
        }
        if (z11) {
            interfaceC7882e.clear();
        }
        return z11;
    }

    public final void b() {
        Iterator it = p6.l.e(this.f65897a).iterator();
        while (it.hasNext()) {
            a((InterfaceC7882e) it.next());
        }
        this.f65898b.clear();
    }

    public final void c() {
        this.f65899c = true;
        Iterator it = p6.l.e(this.f65897a).iterator();
        while (it.hasNext()) {
            InterfaceC7882e interfaceC7882e = (InterfaceC7882e) it.next();
            if (interfaceC7882e.isRunning() || interfaceC7882e.e()) {
                interfaceC7882e.clear();
                this.f65898b.add(interfaceC7882e);
            }
        }
    }

    public final void d() {
        this.f65899c = true;
        Iterator it = p6.l.e(this.f65897a).iterator();
        while (it.hasNext()) {
            InterfaceC7882e interfaceC7882e = (InterfaceC7882e) it.next();
            if (interfaceC7882e.isRunning()) {
                interfaceC7882e.pause();
                this.f65898b.add(interfaceC7882e);
            }
        }
    }

    public final void e() {
        Iterator it = p6.l.e(this.f65897a).iterator();
        while (it.hasNext()) {
            InterfaceC7882e interfaceC7882e = (InterfaceC7882e) it.next();
            if (!interfaceC7882e.e() && !interfaceC7882e.d()) {
                interfaceC7882e.clear();
                if (this.f65899c) {
                    this.f65898b.add(interfaceC7882e);
                } else {
                    interfaceC7882e.j();
                }
            }
        }
    }

    public final void f() {
        this.f65899c = false;
        Iterator it = p6.l.e(this.f65897a).iterator();
        while (it.hasNext()) {
            InterfaceC7882e interfaceC7882e = (InterfaceC7882e) it.next();
            if (!interfaceC7882e.e() && !interfaceC7882e.isRunning()) {
                interfaceC7882e.j();
            }
        }
        this.f65898b.clear();
    }

    public final void g(@NonNull InterfaceC7882e interfaceC7882e) {
        this.f65897a.add(interfaceC7882e);
        if (!this.f65899c) {
            interfaceC7882e.j();
            return;
        }
        interfaceC7882e.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f65898b.add(interfaceC7882e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{numRequests=");
        sb2.append(this.f65897a.size());
        sb2.append(", isPaused=");
        return Pk0.a.a("}", sb2, this.f65899c);
    }
}
