package j50;

import H30.k;
import Z50.e;
import android.os.Parcelable;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.InterfaceC5431s;
import com.detmir.recycli.adapters.ScrollKeeper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.cbottom.v2.Cbottom2ScreenDTO;
import w40.InterfaceC10428a;
import x40.C10656a;

/* renamed from: j50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7286b implements InterfaceC7285a, ScrollKeeper.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ScrollKeeper.b f69454a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final S80.b f69455b;

    /* renamed from: c, reason: collision with root package name */
    private int f69456c;

    public C7286b(@NotNull C10656a cbottomMapper2, @NotNull S80.b navigation) {
        Intrinsics.checkNotNullParameter(cbottomMapper2, "cbottomMapper2");
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        this.f69454a = new ScrollKeeper.b();
        this.f69455b = navigation;
    }

    public static Unit e(C7286b c7286b) {
        c7286b.g();
        return Unit.f71690a;
    }

    private final void f(String str, String str2) {
        S80.b bVar = this.f69455b;
        Integer num = null;
        for (Map.Entry<Integer, List<ComponentCallbacksC5392m>> entry : bVar.d().entrySet()) {
            int intValue = entry.getKey().intValue();
            for (InterfaceC5431s interfaceC5431s : entry.getValue()) {
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, str)) {
                    num = Integer.valueOf(intValue);
                }
            }
        }
        String q02 = num != null ? bVar.q0(num.intValue()) : null;
        if (q02 == null || str2 == null || Intrinsics.d(bVar.e0(), q02)) {
            return;
        }
        bVar.b0(q02);
    }

    private final void g() {
        if (this.f69456c > 20) {
            this.f69456c = 0;
            return;
        }
        S80.b bVar = this.f69455b;
        InterfaceC5431s U10 = bVar.U();
        if ((U10 instanceof InterfaceC10428a ? (InterfaceC10428a) U10 : null) == null) {
            this.f69456c = 0;
            return;
        }
        bVar.pop();
        this.f69456c++;
        k.a(new e(this, 1));
    }

    @Override // com.detmir.recycli.adapters.ScrollKeeper.a
    @NotNull
    public final ScrollKeeper L(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f69454a.L(id2);
    }

    @Override // j50.InterfaceC7285a
    @NotNull
    public final Set<String> a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        S80.b bVar = this.f69455b;
        Iterator<Map.Entry<Integer, List<ComponentCallbacksC5392m>>> it = bVar.d().entrySet().iterator();
        while (it.hasNext()) {
            for (InterfaceC5431s interfaceC5431s : it.next().getValue()) {
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                String provideId = interfaceC10428a != null ? interfaceC10428a.provideId() : null;
                if (interfaceC10428a != null && provideId != null) {
                    linkedHashSet.add(provideId);
                }
            }
        }
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        if (i02 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : i02) {
                if (((ComponentCallbacksC5392m) obj) instanceof InterfaceC10428a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC5431s interfaceC5431s2 = (ComponentCallbacksC5392m) it2.next();
                Intrinsics.g(interfaceC5431s2, "null cannot be cast to non-null type ru.ozon.fintech.features.cbottombase.domain.CbottomHolder");
                String provideId2 = ((InterfaceC10428a) interfaceC5431s2).provideId();
                if (provideId2 != null) {
                    arrayList2.add(provideId2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                linkedHashSet.add((String) it3.next());
            }
        }
        return linkedHashSet;
    }

    @Override // j50.InterfaceC7285a
    public final void b() {
        ArrayList arrayList;
        S80.b bVar = this.f69455b;
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

    @Override // j50.InterfaceC7285a
    public final void c(@NotNull String id2, @NotNull String uuid, String str) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        Object obj;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        f(id2, str);
        S80.b bVar = this.f69455b;
        List<ComponentCallbacksC5392m> i02 = bVar.i0();
        Object obj2 = null;
        if (i02 != null) {
            Iterator<T> it = i02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                InterfaceC5431s interfaceC5431s = (ComponentCallbacksC5392m) obj;
                InterfaceC10428a interfaceC10428a = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
                if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, id2)) {
                    break;
                }
            }
            componentCallbacksC5392m = (ComponentCallbacksC5392m) obj;
        } else {
            componentCallbacksC5392m = null;
        }
        List<ComponentCallbacksC5392m> A02 = bVar.A0();
        if (A02 != null) {
            Iterator<T> it2 = A02.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                InterfaceC5431s interfaceC5431s2 = (ComponentCallbacksC5392m) next;
                InterfaceC10428a interfaceC10428a2 = interfaceC5431s2 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s2 : null;
                if (Intrinsics.d(interfaceC10428a2 != null ? interfaceC10428a2.provideId() : null, id2)) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (ComponentCallbacksC5392m) obj2;
        }
        if (componentCallbacksC5392m != null) {
            bVar.H0(componentCallbacksC5392m);
        } else if (obj2 != null) {
            bVar.pop();
        }
    }

    @Override // j50.InterfaceC7285a
    public final void d(Parcelable parcelable, @NotNull String uuid, String str) {
        InterfaceC5431s interfaceC5431s;
        Object obj;
        InterfaceC5431s interfaceC5431s2;
        Object obj2;
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Cbottom2ScreenDTO cbottom2ScreenDTO = (parcelable == null || !(parcelable instanceof Cbottom2ScreenDTO)) ? null : (Cbottom2ScreenDTO) parcelable;
        if (cbottom2ScreenDTO == null) {
            throw new Exception("Wrong SCREEN data model");
        }
        boolean d11 = Intrinsics.d(cbottom2ScreenDTO.getModal(), Boolean.TRUE);
        S80.b bVar = this.f69455b;
        if (d11) {
            List<ComponentCallbacksC5392m> i02 = bVar.i0();
            if (i02 != null) {
                Iterator<T> it = i02.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    InterfaceC5431s interfaceC5431s3 = (ComponentCallbacksC5392m) obj2;
                    InterfaceC10428a interfaceC10428a = interfaceC5431s3 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s3 : null;
                    if (Intrinsics.d(interfaceC10428a != null ? interfaceC10428a.provideId() : null, cbottom2ScreenDTO.getId())) {
                        break;
                    }
                }
                interfaceC5431s2 = (ComponentCallbacksC5392m) obj2;
            } else {
                interfaceC5431s2 = null;
            }
            InterfaceC10428a interfaceC10428a2 = interfaceC5431s2 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s2 : null;
            if (interfaceC10428a2 != null) {
                interfaceC10428a2.updateState(null, parcelable, 2, uuid);
                return;
            } else {
                bVar.P0(cbottom2ScreenDTO, true, Intrinsics.d(cbottom2ScreenDTO.getNoBottomTabs(), Boolean.TRUE), uuid);
                return;
            }
        }
        f(cbottom2ScreenDTO.getId(), str);
        List<ComponentCallbacksC5392m> A02 = bVar.A0();
        if (A02 != null) {
            Iterator<T> it2 = A02.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                InterfaceC5431s interfaceC5431s4 = (ComponentCallbacksC5392m) obj;
                InterfaceC10428a interfaceC10428a3 = interfaceC5431s4 instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s4 : null;
                if (Intrinsics.d(interfaceC10428a3 != null ? interfaceC10428a3.provideId() : null, cbottom2ScreenDTO.getId())) {
                    break;
                }
            }
            interfaceC5431s = (ComponentCallbacksC5392m) obj;
        } else {
            interfaceC5431s = null;
        }
        InterfaceC10428a interfaceC10428a4 = interfaceC5431s instanceof InterfaceC10428a ? (InterfaceC10428a) interfaceC5431s : null;
        if (interfaceC10428a4 != null) {
            interfaceC10428a4.updateState(null, parcelable, 2, uuid);
        } else {
            bVar.P0(cbottom2ScreenDTO, false, Intrinsics.d(cbottom2ScreenDTO.getNoBottomTabs(), Boolean.TRUE), uuid);
        }
    }
}
