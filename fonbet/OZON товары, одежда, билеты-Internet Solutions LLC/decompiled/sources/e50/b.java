package e50;

import H30.k;
import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction;
import w40.InterfaceC10428a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class b implements InterfaceC6302a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10656a f62008a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f62009b;

    /* renamed from: c, reason: collision with root package name */
    private int f62010c;

    public b(@NotNull C10656a cbottomMapper2, @NotNull S80.b navigation) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f62008a = cbottomMapper2;
        this.f62009b = navigation;
    }

    public static Unit f(b bVar) {
        bVar.g();
        return Unit.f71690a;
    }

    private final void g() {
        if (this.f62010c > 20) {
            this.f62010c = 0;
            return;
        }
        S80.b bVar = this.f62009b;
        InterfaceC5431s U10 = bVar.U();
        if ((U10 instanceof InterfaceC10428a ? (InterfaceC10428a) U10 : null) == null) {
            this.f62010c = 0;
            return;
        }
        bVar.pop();
        this.f62010c++;
        k.a(new B50.e(this, 4));
    }

    @Override // e50.InterfaceC6302a
    @NotNull
    public final Set<String> a() {
        Collection collection;
        List<ComponentCallbacksC5392m> i02 = this.f62009b.i0();
        if (i02 != null) {
            ArrayList<InterfaceC5431s> arrayList = new ArrayList();
            for (Object obj : i02) {
                if (((ComponentCallbacksC5392m) obj) instanceof InterfaceC10428a) {
                    arrayList.add(obj);
                }
            }
            collection = new ArrayList();
            for (InterfaceC5431s interfaceC5431s : arrayList) {
                Intrinsics.g(interfaceC5431s, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.domain.CbottomHolder");
                String provideId = ((InterfaceC10428a) interfaceC5431s).provideId();
                if (provideId != null) {
                    collection.add(provideId);
                }
            }
        } else {
            collection = M.f71699a;
        }
        return C7714v.Y0(collection);
    }

    @Override // e50.InterfaceC6302a
    public final void b() {
        ArrayList arrayList;
        S80.b bVar = this.f62009b;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            arrayList = new ArrayList();
            for (Object obj : i02) {
                if (((ComponentCallbacksC5392m) obj) instanceof InterfaceC10428a) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.H0((ComponentCallbacksC5392m) it.next());
            }
        }
        g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e50.InterfaceC6302a
    public final void c(@NotNull String id2, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        S80.b bVar = this.f62009b;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        ComponentCallbacksC5392m componentCallbacksC5392m = null;
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                InterfaceC5431s interfaceC5431s = (ComponentCallbacksC5392m) next;
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, id2)) {
                    componentCallbacksC5392m = next;
                    break;
                }
            }
            componentCallbacksC5392m = componentCallbacksC5392m;
        }
        if (componentCallbacksC5392m != null) {
            bVar.H0(componentCallbacksC5392m);
        }
    }

    @Override // e50.InterfaceC6302a
    public final void d(Parcelable parcelable, @NotNull String uuid) {
        InterfaceC5431s interfaceC5431s;
        Object obj;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        A40.a aVar = (parcelable == null || !(parcelable instanceof A40.a)) ? null : (A40.a) parcelable;
        S80.b bVar = this.f62009b;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InterfaceC5431s interfaceC5431s2 = (ComponentCallbacksC5392m) obj;
                InterfaceC10428a interfaceC10428a = interfaceC5431s2 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s2 : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, aVar != null ? aVar.getId() : null)) {
                    break;
                }
            }
            interfaceC5431s = (ComponentCallbacksC5392m) obj;
        } else {
            interfaceC5431s = null;
        }
        InterfaceC10428a interfaceC10428a2 = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
        if (interfaceC10428a2 != null) {
            interfaceC10428a2.updateState(null, parcelable, 2, uuid);
        } else {
            bVar.N(aVar, uuid);
        }
    }

    @Override // e50.InterfaceC6302a
    public final void e(String str, @NotNull String id2, @NotNull String uuid) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Cbottom2SharingAction c11 = str != null ? this.f62008a.c(str) : null;
        S80.b bVar = this.f62009b;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                InterfaceC5431s interfaceC5431s = (ComponentCallbacksC5392m) obj2;
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, c11 != null ? c11.getId() : null)) {
                    break;
                }
            }
            InterfaceC5431s interfaceC5431s2 = (ComponentCallbacksC5392m) obj2;
            if (interfaceC5431s2 != null) {
                InterfaceC10428a interfaceC10428a2 = interfaceC5431s2 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s2 : null;
                if (interfaceC10428a2 != null) {
                    interfaceC10428a2.action(str);
                }
            }
        }
        List<ComponentCallbacksC5392m> A02 = bVar.A0();
        if (A02 != null) {
            Iterator<T> it2 = A02.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                InterfaceC5431s interfaceC5431s3 = (ComponentCallbacksC5392m) obj;
                InterfaceC10428a interfaceC10428a3 = interfaceC5431s3 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s3 : null;
                if (Intrinsics.d(interfaceC10428a3 != null ? interfaceC10428a3.provideId() : null, c11 != null ? c11.getId() : null)) {
                    break;
                }
            }
            InterfaceC5431s interfaceC5431s4 = (ComponentCallbacksC5392m) obj;
            if (interfaceC5431s4 != null) {
                InterfaceC10428a interfaceC10428a4 = interfaceC5431s4 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s4 : null;
                if (interfaceC10428a4 != null) {
                    interfaceC10428a4.action(str);
                }
            }
        }
    }
}
