package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.impl.data.FriendlyObstructionImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;
    public final /* synthetic */ vk c;

    public /* synthetic */ sk(wk wkVar, vk vkVar, int i) {
        this.a = i;
        this.b = wkVar;
        this.c = vkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wk wkVar = this.b;
                vk vkVar = this.c;
                hr9 hr9Var = wkVar.n;
                HashMap hashMap = hr9Var.f;
                ah ahVar = (ah) hashMap.remove(wkVar);
                hr9Var.b();
                if (ahVar != null) {
                    ArrayList arrayList = ahVar.i;
                    arrayList.remove(vkVar);
                    if (arrayList.isEmpty()) {
                        gbo gboVar = ahVar.m;
                        gboVar.c.clear();
                        nxn nxnVar = gboVar.d;
                        if (nxnVar != null) {
                            nxnVar.zzb();
                        }
                    }
                }
                if (hr9Var.l != null && hashMap.isEmpty()) {
                    hr9Var.l.z(hr9Var.d);
                    hr9Var.l = null;
                    break;
                }
                break;
            default:
                wk wkVar2 = this.b;
                vk vkVar2 = this.c;
                hr9 hr9Var2 = wkVar2.n;
                xe4 xe4Var = wkVar2.p;
                Object obj = wkVar2.q;
                bh bhVar = wkVar2.o;
                HashMap hashMap2 = hr9Var2.e;
                z1a.D("Set player using adsLoader.setPlayer before preparing the player.", hr9Var2.i);
                HashMap hashMap3 = hr9Var2.f;
                if (hashMap3.isEmpty()) {
                    ale aleVar = hr9Var2.j;
                    hr9Var2.l = aleVar;
                    if (aleVar != null) {
                        aleVar.s(hr9Var2.d);
                    }
                }
                ah ahVar2 = (ah) hashMap2.get(obj);
                if (ahVar2 == null) {
                    ViewGroup adViewGroup = bhVar.getAdViewGroup();
                    if (!hashMap2.containsKey(obj)) {
                        hashMap2.put(obj, new ah(hr9Var2.b, hr9Var2.a, hr9Var2.c, hr9Var2.k, xe4Var, obj, adViewGroup));
                    }
                    ahVar2 = (ah) hashMap2.get(obj);
                }
                ahVar2.getClass();
                hashMap3.put(wkVar2, ahVar2);
                ArrayList arrayList2 = ahVar2.i;
                boolean isEmpty = arrayList2.isEmpty();
                arrayList2.add(vkVar2);
                int i = 4;
                if (isEmpty) {
                    ahVar2.t = 0;
                    rqk rqkVar = rqk.c;
                    ahVar2.s = rqkVar;
                    ahVar2.r = rqkVar;
                    ahVar2.s();
                    if (!kg.g.equals(ahVar2.z)) {
                        kg kgVar = ahVar2.z;
                        if (!vkVar2.b) {
                            vkVar2.a.post(new r0(i, vkVar2, kgVar));
                        }
                    } else if (ahVar2.u != null) {
                        Object obj2 = ahVar2.e;
                        List list = ahVar2.u.r;
                        m3p m3pVar = q3p.b;
                        v4p v4pVar = v4p.e;
                        if (list == null) {
                            if (v4pVar == null) {
                                yhk.s("Both parameters are null");
                                break;
                            } else {
                                list = v4pVar;
                            }
                        }
                        ahVar2.z = new kg(obj2, m6k.D(list));
                        ahVar2.x();
                    }
                    for (fg fgVar : bhVar.getAdOverlayInfos()) {
                        gbo gboVar2 = ahVar2.m;
                        hjg hjgVar = ahVar2.b;
                        View view = fgVar.a;
                        int i2 = fgVar.b;
                        bs8 bs8Var = i2 != 1 ? i2 != 2 ? i2 != 4 ? bs8.d : bs8.c : bs8.b : bs8.a;
                        String str = fgVar.c;
                        hjgVar.getClass();
                        lr9.a().getClass();
                        FriendlyObstructionImpl.Builder builder = FriendlyObstructionImpl.builder();
                        builder.view(view);
                        builder.purpose(bs8Var);
                        builder.detailedReason(str);
                        FriendlyObstructionImpl build = builder.build();
                        if (build != null) {
                            HashSet hashSet = gboVar2.c;
                            if (!hashSet.contains(build)) {
                                hashSet.add(build);
                                nxn nxnVar2 = gboVar2.d;
                                if (nxnVar2 != null) {
                                    nxnVar2.b(build);
                                }
                            }
                        } else {
                            gboVar2.getClass();
                        }
                    }
                } else if (!kg.g.equals(ahVar2.z)) {
                    kg kgVar2 = ahVar2.z;
                    if (!vkVar2.b) {
                        vkVar2.a.post(new r0(i, vkVar2, kgVar2));
                    }
                }
                hr9Var2.b();
                break;
        }
    }
}
