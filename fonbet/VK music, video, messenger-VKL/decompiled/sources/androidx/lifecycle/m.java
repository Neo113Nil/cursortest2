package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.e5z;
import xsna.f5z;
import xsna.gg3;
import xsna.klq;
import xsna.lzg0;
import xsna.nhl;
import xsna.q5z;
import xsna.utk0;
import xsna.vtk0;
import xsna.xy9;
import xsna.zr;

/* compiled from: LifecycleRegistry.jvm.kt */
/* loaded from: classes.dex */
public final class m extends Lifecycle {
    public final boolean b;
    public klq<e5z, a> c = new klq<>();
    public Lifecycle.State d;
    public final WeakReference<f5z> e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList<Lifecycle.State> i;
    public final utk0 j;

    /* compiled from: LifecycleRegistry.jvm.kt */
    public static final class a {
        public Lifecycle.State a;
        public l b;

        public final void a(f5z f5zVar, Lifecycle.Event event) {
            Lifecycle.State h = event.h();
            Lifecycle.State state = this.a;
            if (h != null && h.compareTo(state) < 0) {
                state = h;
            }
            this.a = state;
            this.b.onStateChanged(f5zVar, event);
            this.a = h;
        }
    }

    public m(f5z f5zVar, boolean z) {
        this.b = z;
        Lifecycle.State state = Lifecycle.State.INITIALIZED;
        this.d = state;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(f5zVar);
        this.j = vtk0.a(state);
    }

    public final Lifecycle.State a(e5z e5zVar) {
        HashMap<e5z, lzg0.c<e5z, a>> hashMap = this.c.f;
        lzg0.c<e5z, a> cVar = hashMap.containsKey(e5zVar) ? hashMap.get(e5zVar).e : null;
        Lifecycle.State state = cVar != null ? cVar.c.a : null;
        ArrayList<Lifecycle.State> arrayList = this.i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) xy9.b(1, arrayList);
        Lifecycle.State state3 = this.d;
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(e5z e5zVar) {
        l sVar;
        a aVar;
        f5z f5zVar;
        b("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar2 = new a();
        HashMap hashMap = q5z.a;
        boolean z = e5zVar instanceof l;
        boolean z2 = e5zVar instanceof nhl;
        if (z && z2) {
            sVar = new d((nhl) e5zVar, (l) e5zVar);
        } else if (z2) {
            sVar = new d((nhl) e5zVar, null);
        } else if (z) {
            sVar = (l) e5zVar;
        } else {
            Class<?> cls = e5zVar.getClass();
            if (q5z.b(cls) == 2) {
                List list = (List) q5z.b.get(cls);
                if (list.size() == 1) {
                    sVar = new d0(q5z.a((Constructor) list.get(0), e5zVar));
                } else {
                    int size = list.size();
                    e[] eVarArr = new e[size];
                    for (int i = 0; i < size; i++) {
                        eVarArr[i] = q5z.a((Constructor) list.get(i), e5zVar);
                    }
                    sVar = new c(eVarArr);
                }
            } else {
                sVar = new s(e5zVar);
            }
        }
        aVar2.b = sVar;
        aVar2.a = state2;
        klq<e5z, a> klqVar = this.c;
        lzg0.c<e5z, a> a2 = klqVar.a(e5zVar);
        if (a2 != null) {
            aVar = a2.c;
        } else {
            HashMap<e5z, lzg0.c<e5z, a>> hashMap2 = klqVar.f;
            lzg0.c<K, V> cVar = new lzg0.c<>(e5zVar, aVar2);
            klqVar.e++;
            lzg0.c cVar2 = klqVar.c;
            if (cVar2 == null) {
                klqVar.b = cVar;
                klqVar.c = cVar;
            } else {
                cVar2.d = cVar;
                cVar.e = cVar2;
                klqVar.c = cVar;
            }
            hashMap2.put(e5zVar, cVar);
            aVar = null;
        }
        if (aVar == null && (f5zVar = this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            Lifecycle.State a3 = a(e5zVar);
            this.f++;
            while (aVar2.a.compareTo(a3) < 0 && this.c.f.containsKey(e5zVar)) {
                Lifecycle.State state3 = aVar2.a;
                ArrayList<Lifecycle.State> arrayList = this.i;
                arrayList.add(state3);
                Lifecycle.Event.a aVar3 = Lifecycle.Event.Companion;
                Lifecycle.State state4 = aVar2.a;
                aVar3.getClass();
                int i2 = Lifecycle.Event.a.C0037a.$EnumSwitchMapping$0[state4.ordinal()];
                Lifecycle.Event event = i2 != 1 ? i2 != 2 ? i2 != 5 ? null : Lifecycle.Event.ON_CREATE : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START;
                if (event == null) {
                    throw new IllegalStateException("no event up from " + aVar2.a);
                }
                aVar2.a(f5zVar, event);
                arrayList.remove(arrayList.size() - 1);
                a3 = a(e5zVar);
            }
            if (!z3) {
                f();
            }
            this.f--;
        }
    }

    public final void b(String str) {
        if (this.b) {
            gg3.a().g.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(zr.a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void c(Lifecycle.Event event) {
        b("handleLifecycleEvent");
        d(event.h());
    }

    public final void d(Lifecycle.State state) {
        if (this.d == state) {
            return;
        }
        f5z f5zVar = this.e.get();
        Lifecycle.State state2 = this.d;
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + Lifecycle.State.CREATED + "' to be moved to '" + state + "' in component " + f5zVar).toString());
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state2 == state3 && state2 != state) {
            throw new IllegalStateException(("State is '" + state3 + "' and cannot be moved to `" + state + "` in component " + f5zVar).toString());
        }
        this.d = state;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        f();
        this.g = false;
        if (this.d == state3) {
            this.c = new klq<>();
        }
    }

    public final void e(Lifecycle.State state) {
        b("setCurrentState");
        d(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        r8.h = false;
        r8.j.setValue(r8.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        Lifecycle.State state;
        Lifecycle.State state2;
        f5z f5zVar = this.e.get();
        if (f5zVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            klq<e5z, a> klqVar = this.c;
            if (klqVar.e != 0 && ((state = klqVar.b.c.a) != (state2 = klqVar.c.c.a) || this.d != state2)) {
                this.h = false;
                if (this.d.compareTo(state) < 0) {
                    klq<e5z, a> klqVar2 = this.c;
                    lzg0.b bVar = new lzg0.b(klqVar2.c, klqVar2.b);
                    klqVar2.d.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        e5z e5zVar = (e5z) entry.getKey();
                        a aVar = (a) entry.getValue();
                        while (aVar.a.compareTo(this.d) > 0 && !this.h && this.c.f.containsKey(e5zVar)) {
                            Lifecycle.Event.a aVar2 = Lifecycle.Event.Companion;
                            Lifecycle.State state3 = aVar.a;
                            aVar2.getClass();
                            Lifecycle.Event a2 = Lifecycle.Event.a.a(state3);
                            if (a2 == null) {
                                throw new IllegalStateException("no event down from " + aVar.a);
                            }
                            this.i.add(a2.h());
                            aVar.a(f5zVar, a2);
                            ArrayList<Lifecycle.State> arrayList = this.i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                lzg0.c<e5z, a> cVar = this.c.c;
                if (!this.h && cVar != null && this.d.compareTo(cVar.c.a) > 0) {
                    klq<e5z, a> klqVar3 = this.c;
                    klqVar3.getClass();
                    lzg0.d dVar = new lzg0.d();
                    klqVar3.d.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        e5z e5zVar2 = (e5z) entry2.getKey();
                        a aVar3 = (a) entry2.getValue();
                        while (aVar3.a.compareTo(this.d) < 0 && !this.h && this.c.f.containsKey(e5zVar2)) {
                            this.i.add(aVar3.a);
                            Lifecycle.Event.a aVar4 = Lifecycle.Event.Companion;
                            Lifecycle.State state4 = aVar3.a;
                            aVar4.getClass();
                            int i = Lifecycle.Event.a.C0037a.$EnumSwitchMapping$0[state4.ordinal()];
                            Lifecycle.Event event = i != 1 ? i != 2 ? i != 5 ? null : Lifecycle.Event.ON_CREATE : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START;
                            if (event == null) {
                                throw new IllegalStateException("no event up from " + aVar3.a);
                            }
                            aVar3.a(f5zVar, event);
                            ArrayList<Lifecycle.State> arrayList2 = this.i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(e5z e5zVar) {
        b("removeObserver");
        this.c.b(e5zVar);
    }
}
